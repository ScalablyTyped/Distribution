package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import typings.devextremeB5DqTZzf.mod.DevExpress.ui.CollectionWidget.ItemLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxValidationSummaryOptions[TItem /* <: ItemLike */, TKey]
  extends StObject
     with CollectionWidgetOptions[dxValidationSummary[TItem, TKey], TItem, TKey] {
  
  /**
    * Specifies the validation group for which summary should be generated.
    */
  var validationGroup: js.UndefOr[String] = js.undefined
}
object dxValidationSummaryOptions {
  
  inline def apply[TItem /* <: ItemLike */, TKey](): dxValidationSummaryOptions[TItem, TKey] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxValidationSummaryOptions[TItem, TKey]]
  }
  
  extension [Self <: dxValidationSummaryOptions[?, ?], TItem /* <: ItemLike */, TKey](x: Self & (dxValidationSummaryOptions[TItem, TKey])) {
    
    inline def setValidationGroup(value: String): Self = StObject.set(x, "validationGroup", value.asInstanceOf[js.Any])
    
    inline def setValidationGroupUndefined: Self = StObject.set(x, "validationGroup", js.undefined)
  }
}
