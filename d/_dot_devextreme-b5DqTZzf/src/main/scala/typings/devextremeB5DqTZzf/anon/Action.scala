package typings.devextremeB5DqTZzf.anon

import typings.devextremeB5DqTZzf.mod.DevExpress.core.DxElement_
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxList.ItemLike
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Action[TItem /* <: ItemLike */] extends StObject {
  
  /**
    * Holds on a function called when the item is clicked.
    */
  var action: js.UndefOr[
    js.Function2[/* itemElement */ DxElement_[HTMLElement], /* itemData */ TItem, Any]
  ] = js.undefined
  
  /**
    * Specifies the menu item text.
    */
  var text: js.UndefOr[String] = js.undefined
}
object Action {
  
  inline def apply[TItem /* <: ItemLike */](): Action[TItem] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Action[TItem]]
  }
  
  extension [Self <: Action[?], TItem /* <: ItemLike */](x: Self & Action[TItem]) {
    
    inline def setAction(value: (/* itemElement */ DxElement_[HTMLElement], /* itemData */ TItem) => Any): Self = StObject.set(x, "action", js.Any.fromFunction2(value))
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
