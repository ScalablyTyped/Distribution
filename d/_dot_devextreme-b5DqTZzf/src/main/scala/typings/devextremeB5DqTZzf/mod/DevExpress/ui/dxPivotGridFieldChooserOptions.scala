package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import typings.devextremeB5DqTZzf.anon.AllFields
import typings.devextremeB5DqTZzf.anon.SearchTimeout
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfNumbers.`0`
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfNumbers.`1`
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfNumbers.`2`
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.instantly
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.onDemand
import typings.devextremeB5DqTZzf.mod.DevExpress.data.PivotGridDataSource
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxPivotGridFieldChooser.ContextMenuPreparingEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxPivotGridFieldChooserOptions
  extends StObject
     with WidgetOptions[dxPivotGridFieldChooser] {
  
  /**
    * Specifies whether the field chooser allows searching in the &apos;All Fields&apos; section.
    */
  var allowSearch: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies when to apply changes made in the UI component to the PivotGrid.
    */
  var applyChangesMode: js.UndefOr[instantly | onDemand] = js.undefined
  
  /**
    * The data source of a PivotGrid UI component.
    */
  var dataSource: js.UndefOr[PivotGridDataSource] = js.undefined
  
  /**
    * Configures the header filter feature.
    */
  var headerFilter: js.UndefOr[SearchTimeout] = js.undefined
  
  /**
    * Specifies the field chooser layout.
    */
  var layout: js.UndefOr[`0` | `1` | `2`] = js.undefined
  
  /**
    * A function that is executed before the context menu is rendered.
    */
  var onContextMenuPreparing: js.UndefOr[js.Function1[/* e */ ContextMenuPreparingEvent, Unit]] = js.undefined
  
  /**
    * Specifies a delay in milliseconds between when a user finishes typing in the field chooser&apos;s search panel, and when the search is executed.
    */
  var searchTimeout: js.UndefOr[Double] = js.undefined
  
  /**
    * The UI component&apos;s state.
    */
  var state: js.UndefOr[Any] = js.undefined
  
  /**
    * Strings that can be changed or localized in the PivotGridFieldChooser UI component.
    */
  var texts: js.UndefOr[AllFields] = js.undefined
}
object dxPivotGridFieldChooserOptions {
  
  inline def apply(): dxPivotGridFieldChooserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxPivotGridFieldChooserOptions]
  }
  
  extension [Self <: dxPivotGridFieldChooserOptions](x: Self) {
    
    inline def setAllowSearch(value: Boolean): Self = StObject.set(x, "allowSearch", value.asInstanceOf[js.Any])
    
    inline def setAllowSearchUndefined: Self = StObject.set(x, "allowSearch", js.undefined)
    
    inline def setApplyChangesMode(value: instantly | onDemand): Self = StObject.set(x, "applyChangesMode", value.asInstanceOf[js.Any])
    
    inline def setApplyChangesModeUndefined: Self = StObject.set(x, "applyChangesMode", js.undefined)
    
    inline def setDataSource(value: PivotGridDataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setHeaderFilter(value: SearchTimeout): Self = StObject.set(x, "headerFilter", value.asInstanceOf[js.Any])
    
    inline def setHeaderFilterUndefined: Self = StObject.set(x, "headerFilter", js.undefined)
    
    inline def setLayout(value: `0` | `1` | `2`): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setOnContextMenuPreparing(value: /* e */ ContextMenuPreparingEvent => Unit): Self = StObject.set(x, "onContextMenuPreparing", js.Any.fromFunction1(value))
    
    inline def setOnContextMenuPreparingUndefined: Self = StObject.set(x, "onContextMenuPreparing", js.undefined)
    
    inline def setSearchTimeout(value: Double): Self = StObject.set(x, "searchTimeout", value.asInstanceOf[js.Any])
    
    inline def setSearchTimeoutUndefined: Self = StObject.set(x, "searchTimeout", js.undefined)
    
    inline def setState(value: Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTexts(value: AllFields): Self = StObject.set(x, "texts", value.asInstanceOf[js.Any])
    
    inline def setTextsUndefined: Self = StObject.set(x, "texts", js.undefined)
  }
}
