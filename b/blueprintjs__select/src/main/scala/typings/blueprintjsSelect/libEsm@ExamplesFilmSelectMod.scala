package typings.blueprintjsSelect

import typings.blueprintjsPopover2.libEsmPopover2SharedPropsMod.DefaultPopover2TargetHTMLProps
import typings.blueprintjsPopover2.mod.Popover2
import typings.blueprintjsSelect.`libEsm@ExamplesFilmsMod`.Film
import typings.blueprintjsSelect.anon.PartialOmitInputGroupProp
import typings.blueprintjsSelect.anon.PartialOmitPopover2PropsD
import typings.blueprintjsSelect.blueprintjsSelectStrings.first
import typings.blueprintjsSelect.blueprintjsSelectStrings.last
import typings.blueprintjsSelect.blueprintjsSelectStrings.rank
import typings.blueprintjsSelect.blueprintjsSelectStrings.title
import typings.blueprintjsSelect.blueprintjsSelectStrings.year
import typings.blueprintjsSelect.libEsmCommonItemListRendererMod.ItemListRenderer
import typings.blueprintjsSelect.libEsmCommonItemListRendererMod.ItemListRendererProps
import typings.blueprintjsSelect.libEsmCommonListItemsUtilsMod.CreateNewItem
import typings.blueprintjsSelect.libEsmCommonPredicateMod.ItemListPredicate
import typings.react.mod.ChangeEvent
import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.std.HTMLUListElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `libEsm@ExamplesFilmSelectMod` {
  
  @JSImport("@blueprintjs/select/lib/esm/@/examples/filmSelect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def FilmSelect(param0: FilmSelectProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FilmSelect")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /* Inlined std.Omit<@blueprintjs/select.@blueprintjs/select/lib/esm/components/select/select2.Select2Props<@blueprintjs/select.@blueprintjs/select/lib/esm/@/examples/films.Film>, 'createNewItemFromQuery' | 'createNewItemRenderer' | 'itemPredicate' | 'itemRenderer' | 'items' | 'itemsEqual' | 'noResults' | 'onItemSelect'> & {  allowCreate :boolean | undefined} */
  trait FilmSelectProps extends StObject {
    
    var activeItem: js.UndefOr[Film | CreateNewItem | Null] = js.undefined
    
    var allowCreate: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var createNewItemPosition: js.UndefOr[first | last] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var fill: js.UndefOr[Boolean] = js.undefined
    
    var filterable: js.UndefOr[Boolean] = js.undefined
    
    var initialContent: js.UndefOr[ReactNode | Null] = js.undefined
    
    var inputProps: js.UndefOr[PartialOmitInputGroupProp] = js.undefined
    
    var itemDisabled: js.UndefOr[
        title | year | rank | (js.Function2[/* item */ Film, /* index */ Double, Boolean])
      ] = js.undefined
    
    var itemListPredicate: js.UndefOr[ItemListPredicate[Film]] = js.undefined
    
    var itemListRenderer: js.UndefOr[ItemListRenderer[Film]] = js.undefined
    
    var menuProps: js.UndefOr[HTMLAttributes[HTMLUListElement]] = js.undefined
    
    var onActiveItemChange: js.UndefOr[js.Function2[/* activeItem */ Film | Null, /* isCreateNewItem */ Boolean, Unit]] = js.undefined
    
    var onItemsPaste: js.UndefOr[js.Function1[/* items */ js.Array[Film], Unit]] = js.undefined
    
    var onQueryChange: js.UndefOr[
        js.Function2[/* query */ String, /* event */ js.UndefOr[ChangeEvent[HTMLInputElement]], Unit]
      ] = js.undefined
    
    var popoverContentProps: js.UndefOr[HTMLAttributes[HTMLDivElement]] = js.undefined
    
    var popoverProps: js.UndefOr[PartialOmitPopover2PropsD] = js.undefined
    
    var popoverRef: js.UndefOr[RefObject[Popover2[DefaultPopover2TargetHTMLProps]]] = js.undefined
    
    var popoverTargetProps: js.UndefOr[HTMLAttributes[HTMLElement]] = js.undefined
    
    var query: js.UndefOr[String] = js.undefined
    
    var resetOnClose: js.UndefOr[Boolean] = js.undefined
    
    var resetOnQuery: js.UndefOr[Boolean] = js.undefined
    
    var resetOnSelect: js.UndefOr[Boolean] = js.undefined
    
    var scrollToActiveItem: js.UndefOr[Boolean] = js.undefined
  }
  object FilmSelectProps {
    
    inline def apply(): FilmSelectProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FilmSelectProps]
    }
    
    extension [Self <: FilmSelectProps](x: Self) {
      
      inline def setActiveItem(value: Film | CreateNewItem): Self = StObject.set(x, "activeItem", value.asInstanceOf[js.Any])
      
      inline def setActiveItemNull: Self = StObject.set(x, "activeItem", null)
      
      inline def setActiveItemUndefined: Self = StObject.set(x, "activeItem", js.undefined)
      
      inline def setAllowCreate(value: Boolean): Self = StObject.set(x, "allowCreate", value.asInstanceOf[js.Any])
      
      inline def setAllowCreateUndefined: Self = StObject.set(x, "allowCreate", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCreateNewItemPosition(value: first | last): Self = StObject.set(x, "createNewItemPosition", value.asInstanceOf[js.Any])
      
      inline def setCreateNewItemPositionUndefined: Self = StObject.set(x, "createNewItemPosition", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setFilterable(value: Boolean): Self = StObject.set(x, "filterable", value.asInstanceOf[js.Any])
      
      inline def setFilterableUndefined: Self = StObject.set(x, "filterable", js.undefined)
      
      inline def setInitialContent(value: ReactNode): Self = StObject.set(x, "initialContent", value.asInstanceOf[js.Any])
      
      inline def setInitialContentNull: Self = StObject.set(x, "initialContent", null)
      
      inline def setInitialContentUndefined: Self = StObject.set(x, "initialContent", js.undefined)
      
      inline def setInputProps(value: PartialOmitInputGroupProp): Self = StObject.set(x, "inputProps", value.asInstanceOf[js.Any])
      
      inline def setInputPropsUndefined: Self = StObject.set(x, "inputProps", js.undefined)
      
      inline def setItemDisabled(value: title | year | rank | (js.Function2[/* item */ Film, /* index */ Double, Boolean])): Self = StObject.set(x, "itemDisabled", value.asInstanceOf[js.Any])
      
      inline def setItemDisabledFunction2(value: (/* item */ Film, /* index */ Double) => Boolean): Self = StObject.set(x, "itemDisabled", js.Any.fromFunction2(value))
      
      inline def setItemDisabledUndefined: Self = StObject.set(x, "itemDisabled", js.undefined)
      
      inline def setItemListPredicate(value: (/* query */ String, /* items */ js.Array[Film]) => js.Array[Film]): Self = StObject.set(x, "itemListPredicate", js.Any.fromFunction2(value))
      
      inline def setItemListPredicateUndefined: Self = StObject.set(x, "itemListPredicate", js.undefined)
      
      inline def setItemListRenderer(value: /* itemListProps */ ItemListRendererProps[Film] => Element | Null): Self = StObject.set(x, "itemListRenderer", js.Any.fromFunction1(value))
      
      inline def setItemListRendererUndefined: Self = StObject.set(x, "itemListRenderer", js.undefined)
      
      inline def setMenuProps(value: HTMLAttributes[HTMLUListElement]): Self = StObject.set(x, "menuProps", value.asInstanceOf[js.Any])
      
      inline def setMenuPropsUndefined: Self = StObject.set(x, "menuProps", js.undefined)
      
      inline def setOnActiveItemChange(value: (/* activeItem */ Film | Null, /* isCreateNewItem */ Boolean) => Unit): Self = StObject.set(x, "onActiveItemChange", js.Any.fromFunction2(value))
      
      inline def setOnActiveItemChangeUndefined: Self = StObject.set(x, "onActiveItemChange", js.undefined)
      
      inline def setOnItemsPaste(value: /* items */ js.Array[Film] => Unit): Self = StObject.set(x, "onItemsPaste", js.Any.fromFunction1(value))
      
      inline def setOnItemsPasteUndefined: Self = StObject.set(x, "onItemsPaste", js.undefined)
      
      inline def setOnQueryChange(value: (/* query */ String, /* event */ js.UndefOr[ChangeEvent[HTMLInputElement]]) => Unit): Self = StObject.set(x, "onQueryChange", js.Any.fromFunction2(value))
      
      inline def setOnQueryChangeUndefined: Self = StObject.set(x, "onQueryChange", js.undefined)
      
      inline def setPopoverContentProps(value: HTMLAttributes[HTMLDivElement]): Self = StObject.set(x, "popoverContentProps", value.asInstanceOf[js.Any])
      
      inline def setPopoverContentPropsUndefined: Self = StObject.set(x, "popoverContentProps", js.undefined)
      
      inline def setPopoverProps(value: PartialOmitPopover2PropsD): Self = StObject.set(x, "popoverProps", value.asInstanceOf[js.Any])
      
      inline def setPopoverPropsUndefined: Self = StObject.set(x, "popoverProps", js.undefined)
      
      inline def setPopoverRef(value: RefObject[Popover2[DefaultPopover2TargetHTMLProps]]): Self = StObject.set(x, "popoverRef", value.asInstanceOf[js.Any])
      
      inline def setPopoverRefUndefined: Self = StObject.set(x, "popoverRef", js.undefined)
      
      inline def setPopoverTargetProps(value: HTMLAttributes[HTMLElement]): Self = StObject.set(x, "popoverTargetProps", value.asInstanceOf[js.Any])
      
      inline def setPopoverTargetPropsUndefined: Self = StObject.set(x, "popoverTargetProps", js.undefined)
      
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
    }
  }
}
