package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.contained
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.multiple
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.none
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.outlined
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.single_
import typings.devextremeB5DqTZzf.devextremeB5DqTZzfStrings.text
import typings.devextremeB5DqTZzf.mod.DevExpress.core.DxElement_
import typings.devextremeB5DqTZzf.mod.DevExpress.core.UserDefinedElement
import typings.devextremeB5DqTZzf.mod.DevExpress.core.template
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxButtonGroup.Item
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxButtonGroup.ItemClickEvent
import typings.devextremeB5DqTZzf.mod.DevExpress.ui.dxButtonGroup.SelectionChangedEvent
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxButtonGroupOptions
  extends StObject
     with WidgetOptions[dxButtonGroup] {
  
  /**
    * Specifies a template for all the buttons in the group.
    */
  var buttonTemplate: js.UndefOr[
    template | (js.Function2[
      /* buttonData */ Any, 
      /* buttonContent */ DxElement_[HTMLElement], 
      String | UserDefinedElement[Element]
    ])
  ] = js.undefined
  
  /**
    * Configures buttons in the group.
    */
  var items: js.UndefOr[js.Array[Item]] = js.undefined
  
  /**
    * Specifies which data field provides keys used to distinguish between the selected buttons.
    */
  var keyExpr: js.UndefOr[String | js.Function] = js.undefined
  
  /**
    * A function that is executed when a button is clicked or tapped.
    */
  var onItemClick: js.UndefOr[js.Function1[/* e */ ItemClickEvent, Unit]] = js.undefined
  
  /**
    * A function that is executed when a button is selected or selection is canceled.
    */
  var onSelectionChanged: js.UndefOr[js.Function1[/* e */ SelectionChangedEvent, Unit]] = js.undefined
  
  /**
    * Contains the keys of the selected buttons and allows selecting buttons initially.
    */
  var selectedItemKeys: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * Contains the data objects that correspond to the selected buttons. The data objects are taken from the items array.
    */
  var selectedItems: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * Specifies the button selection mode.
    */
  var selectionMode: js.UndefOr[multiple | single_ | none] = js.undefined
  
  /**
    * Specifies how buttons in the group are styled.
    */
  var stylingMode: js.UndefOr[text | outlined | contained] = js.undefined
}
object dxButtonGroupOptions {
  
  inline def apply(): dxButtonGroupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxButtonGroupOptions]
  }
  
  extension [Self <: dxButtonGroupOptions](x: Self) {
    
    inline def setButtonTemplate(
      value: template | (js.Function2[
          /* buttonData */ Any, 
          /* buttonContent */ DxElement_[HTMLElement], 
          String | UserDefinedElement[Element]
        ])
    ): Self = StObject.set(x, "buttonTemplate", value.asInstanceOf[js.Any])
    
    inline def setButtonTemplateFunction2(
      value: (/* buttonData */ Any, /* buttonContent */ DxElement_[HTMLElement]) => String | UserDefinedElement[Element]
    ): Self = StObject.set(x, "buttonTemplate", js.Any.fromFunction2(value))
    
    inline def setButtonTemplateUndefined: Self = StObject.set(x, "buttonTemplate", js.undefined)
    
    inline def setItems(value: js.Array[Item]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: Item*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setKeyExpr(value: String | js.Function): Self = StObject.set(x, "keyExpr", value.asInstanceOf[js.Any])
    
    inline def setKeyExprUndefined: Self = StObject.set(x, "keyExpr", js.undefined)
    
    inline def setOnItemClick(value: /* e */ ItemClickEvent => Unit): Self = StObject.set(x, "onItemClick", js.Any.fromFunction1(value))
    
    inline def setOnItemClickUndefined: Self = StObject.set(x, "onItemClick", js.undefined)
    
    inline def setOnSelectionChanged(value: /* e */ SelectionChangedEvent => Unit): Self = StObject.set(x, "onSelectionChanged", js.Any.fromFunction1(value))
    
    inline def setOnSelectionChangedUndefined: Self = StObject.set(x, "onSelectionChanged", js.undefined)
    
    inline def setSelectedItemKeys(value: js.Array[Any]): Self = StObject.set(x, "selectedItemKeys", value.asInstanceOf[js.Any])
    
    inline def setSelectedItemKeysUndefined: Self = StObject.set(x, "selectedItemKeys", js.undefined)
    
    inline def setSelectedItemKeysVarargs(value: Any*): Self = StObject.set(x, "selectedItemKeys", js.Array(value*))
    
    inline def setSelectedItems(value: js.Array[Any]): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
    
    inline def setSelectedItemsUndefined: Self = StObject.set(x, "selectedItems", js.undefined)
    
    inline def setSelectedItemsVarargs(value: Any*): Self = StObject.set(x, "selectedItems", js.Array(value*))
    
    inline def setSelectionMode(value: multiple | single_ | none): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
    
    inline def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
    
    inline def setStylingMode(value: text | outlined | contained): Self = StObject.set(x, "stylingMode", value.asInstanceOf[js.Any])
    
    inline def setStylingModeUndefined: Self = StObject.set(x, "stylingMode", js.undefined)
  }
}
