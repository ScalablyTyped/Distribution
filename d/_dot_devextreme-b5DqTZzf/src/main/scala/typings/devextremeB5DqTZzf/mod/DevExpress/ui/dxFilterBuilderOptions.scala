package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import typings.devextremeB5DqTZzf.anon.And
import typings.devextremeB5DqTZzf.anon.Between
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.and
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.notAnd
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.notOr
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.or
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxFilterBuilder.CustomOperation
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxFilterBuilder.EditorPreparedEvent
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxFilterBuilder.EditorPreparingEvent
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxFilterBuilder.Field
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxFilterBuilder.ValueChangedEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxFilterBuilderOptions
  extends StObject
     with WidgetOptions[dxFilterBuilder] {
  
  /**
    * Specifies whether the UI component can display hierarchical data fields.
    */
  var allowHierarchicalFields: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Configures custom filter operations.
    */
  var customOperations: js.UndefOr[js.Array[CustomOperation]] = js.undefined
  
  /**
    * Configures fields.
    */
  var fields: js.UndefOr[js.Array[Field]] = js.undefined
  
  /**
    * Specifies filter operation descriptions.
    */
  var filterOperationDescriptions: js.UndefOr[Between] = js.undefined
  
  /**
    * Specifies group operation descriptions.
    */
  var groupOperationDescriptions: js.UndefOr[And] = js.undefined
  
  /**
    * Specifies a set of available group operations.
    */
  var groupOperations: js.UndefOr[js.Array[and | or | notAnd | notOr]] = js.undefined
  
  /**
    * Specifies groups&apos; maximum nesting level.
    */
  var maxGroupLevel: js.UndefOr[Double] = js.undefined
  
  /**
    * A function that is executed after an editor is created.
    */
  var onEditorPrepared: js.UndefOr[js.Function1[/* e */ EditorPreparedEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed before an editor is created.
    */
  var onEditorPreparing: js.UndefOr[js.Function1[/* e */ EditorPreparingEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed after the UI component&apos;s value is changed.
    */
  var onValueChanged: js.UndefOr[js.Function1[/* e */ ValueChangedEvent, Unit]] = js.undefined
  
  /**
    * Allows you to specify a filter.
    */
  var value: js.UndefOr[String | js.Array[Any] | js.Function] = js.undefined
}
object dxFilterBuilderOptions {
  
  inline def apply(): dxFilterBuilderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxFilterBuilderOptions]
  }
  
  extension [Self <: dxFilterBuilderOptions](x: Self) {
    
    inline def setAllowHierarchicalFields(value: Boolean): Self = StObject.set(x, "allowHierarchicalFields", value.asInstanceOf[js.Any])
    
    inline def setAllowHierarchicalFieldsUndefined: Self = StObject.set(x, "allowHierarchicalFields", js.undefined)
    
    inline def setCustomOperations(value: js.Array[CustomOperation]): Self = StObject.set(x, "customOperations", value.asInstanceOf[js.Any])
    
    inline def setCustomOperationsUndefined: Self = StObject.set(x, "customOperations", js.undefined)
    
    inline def setCustomOperationsVarargs(value: CustomOperation*): Self = StObject.set(x, "customOperations", js.Array(value*))
    
    inline def setFields(value: js.Array[Field]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: Field*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setFilterOperationDescriptions(value: Between): Self = StObject.set(x, "filterOperationDescriptions", value.asInstanceOf[js.Any])
    
    inline def setFilterOperationDescriptionsUndefined: Self = StObject.set(x, "filterOperationDescriptions", js.undefined)
    
    inline def setGroupOperationDescriptions(value: And): Self = StObject.set(x, "groupOperationDescriptions", value.asInstanceOf[js.Any])
    
    inline def setGroupOperationDescriptionsUndefined: Self = StObject.set(x, "groupOperationDescriptions", js.undefined)
    
    inline def setGroupOperations(value: js.Array[and | or | notAnd | notOr]): Self = StObject.set(x, "groupOperations", value.asInstanceOf[js.Any])
    
    inline def setGroupOperationsUndefined: Self = StObject.set(x, "groupOperations", js.undefined)
    
    inline def setGroupOperationsVarargs(value: (and | or | notAnd | notOr)*): Self = StObject.set(x, "groupOperations", js.Array(value*))
    
    inline def setMaxGroupLevel(value: Double): Self = StObject.set(x, "maxGroupLevel", value.asInstanceOf[js.Any])
    
    inline def setMaxGroupLevelUndefined: Self = StObject.set(x, "maxGroupLevel", js.undefined)
    
    inline def setOnEditorPrepared(value: /* e */ EditorPreparedEvent => Unit): Self = StObject.set(x, "onEditorPrepared", js.Any.fromFunction1(value))
    
    inline def setOnEditorPreparedUndefined: Self = StObject.set(x, "onEditorPrepared", js.undefined)
    
    inline def setOnEditorPreparing(value: /* e */ EditorPreparingEvent => Unit): Self = StObject.set(x, "onEditorPreparing", js.Any.fromFunction1(value))
    
    inline def setOnEditorPreparingUndefined: Self = StObject.set(x, "onEditorPreparing", js.undefined)
    
    inline def setOnValueChanged(value: /* e */ ValueChangedEvent => Unit): Self = StObject.set(x, "onValueChanged", js.Any.fromFunction1(value))
    
    inline def setOnValueChangedUndefined: Self = StObject.set(x, "onValueChanged", js.undefined)
    
    inline def setValue(value: String | js.Array[Any] | js.Function): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(value: Any*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
