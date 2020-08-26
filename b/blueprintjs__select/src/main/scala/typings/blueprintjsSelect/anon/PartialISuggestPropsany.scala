package typings.blueprintjsSelect.anon

import typings.blueprintjsCore.inputGroupMod.IInputGroupProps
import typings.blueprintjsCore.propsMod.HTMLInputProps
import typings.blueprintjsSelect.itemListRendererMod.IItemListRendererProps
import typings.blueprintjsSelect.itemListRendererMod.ItemListRenderer
import typings.blueprintjsSelect.itemRendererMod.IItemRendererProps
import typings.blueprintjsSelect.itemRendererMod.ItemRenderer
import typings.blueprintjsSelect.listItemsPropsMod.ItemsEqualProp
import typings.blueprintjsSelect.listItemsUtilsMod.ICreateNewItem
import typings.blueprintjsSelect.predicateMod.ItemListPredicate
import typings.blueprintjsSelect.predicateMod.ItemPredicate
import typings.react.mod.ChangeEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.react.mod.global.JSX.Element
import typings.std.Event
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@blueprintjs/select.@blueprintjs/select/lib/esm/components/select/suggest.ISuggestProps<any>> */
@js.native
trait PartialISuggestPropsany extends js.Object {
  var activeItem: js.UndefOr[js.Any | ICreateNewItem | Null] = js.native
  var className: js.UndefOr[String] = js.native
  var closeOnSelect: js.UndefOr[Boolean] = js.native
  var createNewItemFromQuery: js.UndefOr[js.Function1[/* query */ String, _]] = js.native
  var createNewItemRenderer: js.UndefOr[
    js.Function3[
      /* query */ String, 
      /* active */ Boolean, 
      /* handleClick */ MouseEventHandler[HTMLElement], 
      js.UndefOr[Element]
    ]
  ] = js.native
  var defaultSelectedItem: js.UndefOr[js.Any] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var fill: js.UndefOr[Boolean] = js.native
  var initialContent: js.UndefOr[ReactNode | Null] = js.native
  var inputProps: js.UndefOr[IInputGroupProps with HTMLInputProps] = js.native
  var inputValueRenderer: js.UndefOr[js.Function1[/* item */ js.Any, String]] = js.native
  var itemDisabled: js.UndefOr[
    (/* keyof any */ String) | (js.Function2[/* item */ js.Any, /* index */ Double, Boolean])
  ] = js.native
  var itemListPredicate: js.UndefOr[ItemListPredicate[_]] = js.native
  var itemListRenderer: js.UndefOr[ItemListRenderer[_]] = js.native
  var itemPredicate: js.UndefOr[ItemPredicate[_]] = js.native
  var itemRenderer: js.UndefOr[ItemRenderer[_]] = js.native
  var items: js.UndefOr[js.Array[_]] = js.native
  var itemsEqual: js.UndefOr[ItemsEqualProp[_]] = js.native
  var noResults: js.UndefOr[ReactNode] = js.native
  var onActiveItemChange: js.UndefOr[
    js.Function2[/* activeItem */ js.Any | Null, /* isCreateNewItem */ Boolean, Unit]
  ] = js.native
  var onItemSelect: js.UndefOr[
    js.Function2[/* item */ js.Any, /* event */ js.UndefOr[SyntheticEvent[HTMLElement, Event]], Unit]
  ] = js.native
  var onItemsPaste: js.UndefOr[js.Function1[/* items */ js.Array[_], Unit]] = js.native
  var onQueryChange: js.UndefOr[
    js.Function2[/* query */ String, /* event */ js.UndefOr[ChangeEvent[HTMLInputElement]], Unit]
  ] = js.native
  var openOnKeyDown: js.UndefOr[Boolean] = js.native
  var popoverProps: js.UndefOr[PartialIPopoverProps with js.Object] = js.native
  var query: js.UndefOr[String] = js.native
  var resetOnClose: js.UndefOr[Boolean] = js.native
  var resetOnQuery: js.UndefOr[Boolean] = js.native
  var resetOnSelect: js.UndefOr[Boolean] = js.native
  var scrollToActiveItem: js.UndefOr[Boolean] = js.native
  var selectedItem: js.UndefOr[js.Any | Null] = js.native
}

object PartialISuggestPropsany {
  @scala.inline
  def apply(): PartialISuggestPropsany = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialISuggestPropsany]
  }
  @scala.inline
  implicit class PartialISuggestPropsanyOps[Self <: PartialISuggestPropsany] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActiveItem(value: js.Any | ICreateNewItem): Self = this.set("activeItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveItem: Self = this.set("activeItem", js.undefined)
    @scala.inline
    def setActiveItemNull: Self = this.set("activeItem", null)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setCloseOnSelect(value: Boolean): Self = this.set("closeOnSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseOnSelect: Self = this.set("closeOnSelect", js.undefined)
    @scala.inline
    def setCreateNewItemFromQuery(value: /* query */ String => _): Self = this.set("createNewItemFromQuery", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCreateNewItemFromQuery: Self = this.set("createNewItemFromQuery", js.undefined)
    @scala.inline
    def setCreateNewItemRenderer(
      value: (/* query */ String, /* active */ Boolean, /* handleClick */ MouseEventHandler[HTMLElement]) => js.UndefOr[Element]
    ): Self = this.set("createNewItemRenderer", js.Any.fromFunction3(value))
    @scala.inline
    def deleteCreateNewItemRenderer: Self = this.set("createNewItemRenderer", js.undefined)
    @scala.inline
    def setDefaultSelectedItem(value: js.Any): Self = this.set("defaultSelectedItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultSelectedItem: Self = this.set("defaultSelectedItem", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setFill(value: Boolean): Self = this.set("fill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    @scala.inline
    def setInitialContent(value: ReactNode): Self = this.set("initialContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialContent: Self = this.set("initialContent", js.undefined)
    @scala.inline
    def setInitialContentNull: Self = this.set("initialContent", null)
    @scala.inline
    def setInputProps(value: IInputGroupProps with HTMLInputProps): Self = this.set("inputProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputProps: Self = this.set("inputProps", js.undefined)
    @scala.inline
    def setInputValueRenderer(value: /* item */ js.Any => String): Self = this.set("inputValueRenderer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteInputValueRenderer: Self = this.set("inputValueRenderer", js.undefined)
    @scala.inline
    def setItemDisabledFunction2(value: (/* item */ js.Any, /* index */ Double) => Boolean): Self = this.set("itemDisabled", js.Any.fromFunction2(value))
    @scala.inline
    def setItemDisabled(value: (/* keyof any */ String) | (js.Function2[/* item */ js.Any, /* index */ Double, Boolean])): Self = this.set("itemDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemDisabled: Self = this.set("itemDisabled", js.undefined)
    @scala.inline
    def setItemListPredicate(value: (/* query */ String, /* items */ js.Array[_]) => js.Array[_]): Self = this.set("itemListPredicate", js.Any.fromFunction2(value))
    @scala.inline
    def deleteItemListPredicate: Self = this.set("itemListPredicate", js.undefined)
    @scala.inline
    def setItemListRenderer(value: /* itemListProps */ IItemListRendererProps[_] => Element | Null): Self = this.set("itemListRenderer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteItemListRenderer: Self = this.set("itemListRenderer", js.undefined)
    @scala.inline
    def setItemPredicate(
      value: (/* query */ String, _, /* index */ js.UndefOr[Double], /* exactMatch */ js.UndefOr[Boolean]) => Boolean
    ): Self = this.set("itemPredicate", js.Any.fromFunction4(value))
    @scala.inline
    def deleteItemPredicate: Self = this.set("itemPredicate", js.undefined)
    @scala.inline
    def setItemRenderer(value: (_, /* itemProps */ IItemRendererProps) => Element | Null): Self = this.set("itemRenderer", js.Any.fromFunction2(value))
    @scala.inline
    def deleteItemRenderer: Self = this.set("itemRenderer", js.undefined)
    @scala.inline
    def setItemsVarargs(value: js.Any*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[_]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setItemsEqualFunction2(value: (_, _) => Boolean): Self = this.set("itemsEqual", js.Any.fromFunction2(value))
    @scala.inline
    def setItemsEqual(value: ItemsEqualProp[_]): Self = this.set("itemsEqual", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemsEqual: Self = this.set("itemsEqual", js.undefined)
    @scala.inline
    def setNoResults(value: ReactNode): Self = this.set("noResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoResults: Self = this.set("noResults", js.undefined)
    @scala.inline
    def setOnActiveItemChange(value: (/* activeItem */ js.Any | Null, /* isCreateNewItem */ Boolean) => Unit): Self = this.set("onActiveItemChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnActiveItemChange: Self = this.set("onActiveItemChange", js.undefined)
    @scala.inline
    def setOnItemSelect(value: (/* item */ js.Any, /* event */ js.UndefOr[SyntheticEvent[HTMLElement, Event]]) => Unit): Self = this.set("onItemSelect", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnItemSelect: Self = this.set("onItemSelect", js.undefined)
    @scala.inline
    def setOnItemsPaste(value: /* items */ js.Array[_] => Unit): Self = this.set("onItemsPaste", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnItemsPaste: Self = this.set("onItemsPaste", js.undefined)
    @scala.inline
    def setOnQueryChange(value: (/* query */ String, /* event */ js.UndefOr[ChangeEvent[HTMLInputElement]]) => Unit): Self = this.set("onQueryChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnQueryChange: Self = this.set("onQueryChange", js.undefined)
    @scala.inline
    def setOpenOnKeyDown(value: Boolean): Self = this.set("openOnKeyDown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenOnKeyDown: Self = this.set("openOnKeyDown", js.undefined)
    @scala.inline
    def setPopoverProps(value: PartialIPopoverProps with js.Object): Self = this.set("popoverProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopoverProps: Self = this.set("popoverProps", js.undefined)
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    @scala.inline
    def setResetOnClose(value: Boolean): Self = this.set("resetOnClose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResetOnClose: Self = this.set("resetOnClose", js.undefined)
    @scala.inline
    def setResetOnQuery(value: Boolean): Self = this.set("resetOnQuery", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResetOnQuery: Self = this.set("resetOnQuery", js.undefined)
    @scala.inline
    def setResetOnSelect(value: Boolean): Self = this.set("resetOnSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResetOnSelect: Self = this.set("resetOnSelect", js.undefined)
    @scala.inline
    def setScrollToActiveItem(value: Boolean): Self = this.set("scrollToActiveItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollToActiveItem: Self = this.set("scrollToActiveItem", js.undefined)
    @scala.inline
    def setSelectedItem(value: js.Any): Self = this.set("selectedItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedItem: Self = this.set("selectedItem", js.undefined)
    @scala.inline
    def setSelectedItemNull: Self = this.set("selectedItem", null)
  }
  
}

