package typings.blueprintjsSelect.anon

import typings.blueprintjsPopover2.mod.Popover2
import typings.blueprintjsSelect.blueprintjsSelectStrings.first
import typings.blueprintjsSelect.blueprintjsSelectStrings.last
import typings.blueprintjsSelect.libEsmCommonItemListRendererMod.ItemListRenderer
import typings.blueprintjsSelect.libEsmCommonItemListRendererMod.ItemListRendererProps
import typings.blueprintjsSelect.libEsmCommonItemRendererMod.ItemRenderer
import typings.blueprintjsSelect.libEsmCommonItemRendererMod.ItemRendererProps
import typings.blueprintjsSelect.libEsmCommonListItemsPropsMod.ItemsEqualProp
import typings.blueprintjsSelect.libEsmCommonListItemsUtilsMod.CreateNewItem
import typings.blueprintjsSelect.libEsmCommonPredicateMod.ItemListPredicate
import typings.blueprintjsSelect.libEsmCommonPredicateMod.ItemPredicate
import typings.react.mod.ChangeEvent
import typings.react.mod.HTMLAttributes
import typings.react.mod.HTMLProps
import typings.react.mod.MouseEventHandler
import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import typings.react.mod.SyntheticEvent
import typings.react.mod.global.JSX.Element
import typings.std.Event
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.std.HTMLUListElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@blueprintjs/select.@blueprintjs/select/lib/esm/components/suggest/suggest2.Suggest2Props<any>> */
trait PartialSuggest2Propsany extends StObject {
  
  var activeItem: js.UndefOr[Any | CreateNewItem | Null] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var closeOnSelect: js.UndefOr[Boolean] = js.undefined
  
  var createNewItemFromQuery: js.UndefOr[js.Function1[/* query */ String, Any | js.Array[Any]]] = js.undefined
  
  var createNewItemPosition: js.UndefOr[first | last] = js.undefined
  
  var createNewItemRenderer: js.UndefOr[
    js.Function3[
      /* query */ String, 
      /* active */ Boolean, 
      /* handleClick */ MouseEventHandler[HTMLElement], 
      js.UndefOr[Element]
    ]
  ] = js.undefined
  
  var defaultSelectedItem: js.UndefOr[Any] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var fill: js.UndefOr[Boolean] = js.undefined
  
  var initialContent: js.UndefOr[ReactNode | Null] = js.undefined
  
  var inputProps: js.UndefOr[PartialOmitInputGroupPropAbout] = js.undefined
  
  var inputValueRenderer: js.UndefOr[js.Function1[/* item */ Any, String]] = js.undefined
  
  var itemDisabled: js.UndefOr[
    (/* keyof any */ String) | (js.Function2[/* item */ Any, /* index */ Double, Boolean])
  ] = js.undefined
  
  var itemListPredicate: js.UndefOr[ItemListPredicate[Any]] = js.undefined
  
  var itemListRenderer: js.UndefOr[ItemListRenderer[Any]] = js.undefined
  
  var itemPredicate: js.UndefOr[ItemPredicate[Any]] = js.undefined
  
  var itemRenderer: js.UndefOr[ItemRenderer[Any]] = js.undefined
  
  var items: js.UndefOr[js.Array[Any]] = js.undefined
  
  var itemsEqual: js.UndefOr[ItemsEqualProp[Any]] = js.undefined
  
  var menuProps: js.UndefOr[HTMLAttributes[HTMLUListElement]] = js.undefined
  
  var noResults: js.UndefOr[ReactNode] = js.undefined
  
  var onActiveItemChange: js.UndefOr[js.Function2[/* activeItem */ Any | Null, /* isCreateNewItem */ Boolean, Unit]] = js.undefined
  
  var onItemSelect: js.UndefOr[
    js.Function2[/* item */ Any, /* event */ js.UndefOr[SyntheticEvent[HTMLElement, Event]], Unit]
  ] = js.undefined
  
  var onItemsPaste: js.UndefOr[js.Function1[/* items */ js.Array[Any], Unit]] = js.undefined
  
  var onQueryChange: js.UndefOr[
    js.Function2[/* query */ String, /* event */ js.UndefOr[ChangeEvent[HTMLInputElement]], Unit]
  ] = js.undefined
  
  var openOnKeyDown: js.UndefOr[Boolean] = js.undefined
  
  var popoverContentProps: js.UndefOr[HTMLAttributes[HTMLDivElement]] = js.undefined
  
  var popoverProps: js.UndefOr[PartialOmitPopover2PropsH] = js.undefined
  
  var popoverRef: js.UndefOr[RefObject[Popover2[HTMLProps[Any]]]] = js.undefined
  
  var query: js.UndefOr[String] = js.undefined
  
  var resetOnClose: js.UndefOr[Boolean] = js.undefined
  
  var resetOnQuery: js.UndefOr[Boolean] = js.undefined
  
  var resetOnSelect: js.UndefOr[Boolean] = js.undefined
  
  var scrollToActiveItem: js.UndefOr[Boolean] = js.undefined
  
  var selectedItem: js.UndefOr[Any | Null] = js.undefined
}
object PartialSuggest2Propsany {
  
  inline def apply(): PartialSuggest2Propsany = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSuggest2Propsany]
  }
  
  extension [Self <: PartialSuggest2Propsany](x: Self) {
    
    inline def setActiveItem(value: Any | CreateNewItem): Self = StObject.set(x, "activeItem", value.asInstanceOf[js.Any])
    
    inline def setActiveItemNull: Self = StObject.set(x, "activeItem", null)
    
    inline def setActiveItemUndefined: Self = StObject.set(x, "activeItem", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setCloseOnSelect(value: Boolean): Self = StObject.set(x, "closeOnSelect", value.asInstanceOf[js.Any])
    
    inline def setCloseOnSelectUndefined: Self = StObject.set(x, "closeOnSelect", js.undefined)
    
    inline def setCreateNewItemFromQuery(value: /* query */ String => Any | js.Array[Any]): Self = StObject.set(x, "createNewItemFromQuery", js.Any.fromFunction1(value))
    
    inline def setCreateNewItemFromQueryUndefined: Self = StObject.set(x, "createNewItemFromQuery", js.undefined)
    
    inline def setCreateNewItemPosition(value: first | last): Self = StObject.set(x, "createNewItemPosition", value.asInstanceOf[js.Any])
    
    inline def setCreateNewItemPositionUndefined: Self = StObject.set(x, "createNewItemPosition", js.undefined)
    
    inline def setCreateNewItemRenderer(
      value: (/* query */ String, /* active */ Boolean, /* handleClick */ MouseEventHandler[HTMLElement]) => js.UndefOr[Element]
    ): Self = StObject.set(x, "createNewItemRenderer", js.Any.fromFunction3(value))
    
    inline def setCreateNewItemRendererUndefined: Self = StObject.set(x, "createNewItemRenderer", js.undefined)
    
    inline def setDefaultSelectedItem(value: Any): Self = StObject.set(x, "defaultSelectedItem", value.asInstanceOf[js.Any])
    
    inline def setDefaultSelectedItemUndefined: Self = StObject.set(x, "defaultSelectedItem", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setInitialContent(value: ReactNode): Self = StObject.set(x, "initialContent", value.asInstanceOf[js.Any])
    
    inline def setInitialContentNull: Self = StObject.set(x, "initialContent", null)
    
    inline def setInitialContentUndefined: Self = StObject.set(x, "initialContent", js.undefined)
    
    inline def setInputProps(value: PartialOmitInputGroupPropAbout): Self = StObject.set(x, "inputProps", value.asInstanceOf[js.Any])
    
    inline def setInputPropsUndefined: Self = StObject.set(x, "inputProps", js.undefined)
    
    inline def setInputValueRenderer(value: /* item */ Any => String): Self = StObject.set(x, "inputValueRenderer", js.Any.fromFunction1(value))
    
    inline def setInputValueRendererUndefined: Self = StObject.set(x, "inputValueRenderer", js.undefined)
    
    inline def setItemDisabled(value: (/* keyof any */ String) | (js.Function2[/* item */ Any, /* index */ Double, Boolean])): Self = StObject.set(x, "itemDisabled", value.asInstanceOf[js.Any])
    
    inline def setItemDisabledFunction2(value: (/* item */ Any, /* index */ Double) => Boolean): Self = StObject.set(x, "itemDisabled", js.Any.fromFunction2(value))
    
    inline def setItemDisabledUndefined: Self = StObject.set(x, "itemDisabled", js.undefined)
    
    inline def setItemListPredicate(value: (/* query */ String, /* items */ js.Array[Any]) => js.Array[Any]): Self = StObject.set(x, "itemListPredicate", js.Any.fromFunction2(value))
    
    inline def setItemListPredicateUndefined: Self = StObject.set(x, "itemListPredicate", js.undefined)
    
    inline def setItemListRenderer(value: /* itemListProps */ ItemListRendererProps[Any] => Element | Null): Self = StObject.set(x, "itemListRenderer", js.Any.fromFunction1(value))
    
    inline def setItemListRendererUndefined: Self = StObject.set(x, "itemListRenderer", js.undefined)
    
    inline def setItemPredicate(
      value: (/* query */ String, Any, /* index */ js.UndefOr[Double], /* exactMatch */ js.UndefOr[Boolean]) => Boolean
    ): Self = StObject.set(x, "itemPredicate", js.Any.fromFunction4(value))
    
    inline def setItemPredicateUndefined: Self = StObject.set(x, "itemPredicate", js.undefined)
    
    inline def setItemRenderer(value: (Any, /* itemProps */ ItemRendererProps) => Element | Null): Self = StObject.set(x, "itemRenderer", js.Any.fromFunction2(value))
    
    inline def setItemRendererUndefined: Self = StObject.set(x, "itemRenderer", js.undefined)
    
    inline def setItems(value: js.Array[Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsEqual(value: ItemsEqualProp[Any]): Self = StObject.set(x, "itemsEqual", value.asInstanceOf[js.Any])
    
    inline def setItemsEqualFunction2(value: (Any, Any) => Boolean): Self = StObject.set(x, "itemsEqual", js.Any.fromFunction2(value))
    
    inline def setItemsEqualUndefined: Self = StObject.set(x, "itemsEqual", js.undefined)
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: Any*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setMenuProps(value: HTMLAttributes[HTMLUListElement]): Self = StObject.set(x, "menuProps", value.asInstanceOf[js.Any])
    
    inline def setMenuPropsUndefined: Self = StObject.set(x, "menuProps", js.undefined)
    
    inline def setNoResults(value: ReactNode): Self = StObject.set(x, "noResults", value.asInstanceOf[js.Any])
    
    inline def setNoResultsUndefined: Self = StObject.set(x, "noResults", js.undefined)
    
    inline def setOnActiveItemChange(value: (/* activeItem */ Any | Null, /* isCreateNewItem */ Boolean) => Unit): Self = StObject.set(x, "onActiveItemChange", js.Any.fromFunction2(value))
    
    inline def setOnActiveItemChangeUndefined: Self = StObject.set(x, "onActiveItemChange", js.undefined)
    
    inline def setOnItemSelect(value: (/* item */ Any, /* event */ js.UndefOr[SyntheticEvent[HTMLElement, Event]]) => Unit): Self = StObject.set(x, "onItemSelect", js.Any.fromFunction2(value))
    
    inline def setOnItemSelectUndefined: Self = StObject.set(x, "onItemSelect", js.undefined)
    
    inline def setOnItemsPaste(value: /* items */ js.Array[Any] => Unit): Self = StObject.set(x, "onItemsPaste", js.Any.fromFunction1(value))
    
    inline def setOnItemsPasteUndefined: Self = StObject.set(x, "onItemsPaste", js.undefined)
    
    inline def setOnQueryChange(value: (/* query */ String, /* event */ js.UndefOr[ChangeEvent[HTMLInputElement]]) => Unit): Self = StObject.set(x, "onQueryChange", js.Any.fromFunction2(value))
    
    inline def setOnQueryChangeUndefined: Self = StObject.set(x, "onQueryChange", js.undefined)
    
    inline def setOpenOnKeyDown(value: Boolean): Self = StObject.set(x, "openOnKeyDown", value.asInstanceOf[js.Any])
    
    inline def setOpenOnKeyDownUndefined: Self = StObject.set(x, "openOnKeyDown", js.undefined)
    
    inline def setPopoverContentProps(value: HTMLAttributes[HTMLDivElement]): Self = StObject.set(x, "popoverContentProps", value.asInstanceOf[js.Any])
    
    inline def setPopoverContentPropsUndefined: Self = StObject.set(x, "popoverContentProps", js.undefined)
    
    inline def setPopoverProps(value: PartialOmitPopover2PropsH): Self = StObject.set(x, "popoverProps", value.asInstanceOf[js.Any])
    
    inline def setPopoverPropsUndefined: Self = StObject.set(x, "popoverProps", js.undefined)
    
    inline def setPopoverRef(value: RefObject[Popover2[HTMLProps[Any]]]): Self = StObject.set(x, "popoverRef", value.asInstanceOf[js.Any])
    
    inline def setPopoverRefUndefined: Self = StObject.set(x, "popoverRef", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setResetOnClose(value: Boolean): Self = StObject.set(x, "resetOnClose", value.asInstanceOf[js.Any])
    
    inline def setResetOnCloseUndefined: Self = StObject.set(x, "resetOnClose", js.undefined)
    
    inline def setResetOnQuery(value: Boolean): Self = StObject.set(x, "resetOnQuery", value.asInstanceOf[js.Any])
    
    inline def setResetOnQueryUndefined: Self = StObject.set(x, "resetOnQuery", js.undefined)
    
    inline def setResetOnSelect(value: Boolean): Self = StObject.set(x, "resetOnSelect", value.asInstanceOf[js.Any])
    
    inline def setResetOnSelectUndefined: Self = StObject.set(x, "resetOnSelect", js.undefined)
    
    inline def setScrollToActiveItem(value: Boolean): Self = StObject.set(x, "scrollToActiveItem", value.asInstanceOf[js.Any])
    
    inline def setScrollToActiveItemUndefined: Self = StObject.set(x, "scrollToActiveItem", js.undefined)
    
    inline def setSelectedItem(value: Any): Self = StObject.set(x, "selectedItem", value.asInstanceOf[js.Any])
    
    inline def setSelectedItemNull: Self = StObject.set(x, "selectedItem", null)
    
    inline def setSelectedItemUndefined: Self = StObject.set(x, "selectedItem", js.undefined)
  }
}
