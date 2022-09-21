package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxGanttFilterRow extends StObject {
  
  /**
    * Specifies the null text for the editor that sets the end of a range for the &apos;between&apos; filter operation.
    */
  var betweenEndText: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the null text for the editor that sets the start of a range for the &apos;between&apos; filter operation.
    */
  var betweenStartText: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies descriptions for filter operations in the filter list.
    */
  var operationDescriptions: js.UndefOr[dxGanttFilterRowOperationDescriptions] = js.undefined
  
  /**
    * Specifies text for the &apos;reset&apos; operation.
    */
  var resetOperationText: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies text for the &apos;All&apos; filter operation.
    */
  var showAllText: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether to display filter icons.
    */
  var showOperationChooser: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether the filter row is visible.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object dxGanttFilterRow {
  
  inline def apply(): dxGanttFilterRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxGanttFilterRow]
  }
  
  extension [Self <: dxGanttFilterRow](x: Self) {
    
    inline def setBetweenEndText(value: String): Self = StObject.set(x, "betweenEndText", value.asInstanceOf[js.Any])
    
    inline def setBetweenEndTextUndefined: Self = StObject.set(x, "betweenEndText", js.undefined)
    
    inline def setBetweenStartText(value: String): Self = StObject.set(x, "betweenStartText", value.asInstanceOf[js.Any])
    
    inline def setBetweenStartTextUndefined: Self = StObject.set(x, "betweenStartText", js.undefined)
    
    inline def setOperationDescriptions(value: dxGanttFilterRowOperationDescriptions): Self = StObject.set(x, "operationDescriptions", value.asInstanceOf[js.Any])
    
    inline def setOperationDescriptionsUndefined: Self = StObject.set(x, "operationDescriptions", js.undefined)
    
    inline def setResetOperationText(value: String): Self = StObject.set(x, "resetOperationText", value.asInstanceOf[js.Any])
    
    inline def setResetOperationTextUndefined: Self = StObject.set(x, "resetOperationText", js.undefined)
    
    inline def setShowAllText(value: String): Self = StObject.set(x, "showAllText", value.asInstanceOf[js.Any])
    
    inline def setShowAllTextUndefined: Self = StObject.set(x, "showAllText", js.undefined)
    
    inline def setShowOperationChooser(value: Boolean): Self = StObject.set(x, "showOperationChooser", value.asInstanceOf[js.Any])
    
    inline def setShowOperationChooserUndefined: Self = StObject.set(x, "showOperationChooser", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
