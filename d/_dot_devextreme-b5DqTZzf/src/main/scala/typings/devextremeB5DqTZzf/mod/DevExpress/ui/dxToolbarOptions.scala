package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import typings.devextremeB5DqTZzf.mod.DevExpress.core.DxElement_
import typings.devextremeB5DqTZzf.mod.DevExpress.core.UserDefinedElement
import typings.devextremeB5DqTZzf.mod.DevExpress.core.template
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxToolbar.ItemLike
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxToolbarOptions[TItem /* <: ItemLike */, TKey]
  extends StObject
     with CollectionWidgetOptions[dxToolbar[TItem, TKey], TItem, TKey] {
  
  /**
    * Specifies a custom template for menu items.
    */
  var menuItemTemplate: js.UndefOr[
    template | (js.Function3[
      /* itemData */ TItem, 
      /* itemIndex */ Double, 
      /* itemElement */ DxElement_[HTMLElement], 
      String | UserDefinedElement[Element]
    ])
  ] = js.undefined
}
object dxToolbarOptions {
  
  inline def apply[TItem /* <: ItemLike */, TKey](): dxToolbarOptions[TItem, TKey] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxToolbarOptions[TItem, TKey]]
  }
  
  extension [Self <: dxToolbarOptions[?, ?], TItem /* <: ItemLike */, TKey](x: Self & (dxToolbarOptions[TItem, TKey])) {
    
    inline def setMenuItemTemplate(
      value: template | (js.Function3[
          /* itemData */ TItem, 
          /* itemIndex */ Double, 
          /* itemElement */ DxElement_[HTMLElement], 
          String | UserDefinedElement[Element]
        ])
    ): Self = StObject.set(x, "menuItemTemplate", value.asInstanceOf[js.Any])
    
    inline def setMenuItemTemplateFunction3(
      value: (/* itemData */ TItem, /* itemIndex */ Double, /* itemElement */ DxElement_[HTMLElement]) => String | UserDefinedElement[Element]
    ): Self = StObject.set(x, "menuItemTemplate", js.Any.fromFunction3(value))
    
    inline def setMenuItemTemplateUndefined: Self = StObject.set(x, "menuItemTemplate", js.undefined)
  }
}
