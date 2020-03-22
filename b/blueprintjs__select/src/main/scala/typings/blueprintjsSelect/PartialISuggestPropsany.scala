package typings.blueprintjsSelect

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
import typings.react.mod._Global_.JSX.Element
import typings.std.Event_
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@blueprintjs/select.@blueprintjs/select/lib/esm/components/select/suggest.ISuggestProps<any>> */
trait PartialISuggestPropsany extends js.Object {
  var activeItem: js.UndefOr[js.Any | ICreateNewItem] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var closeOnSelect: js.UndefOr[Boolean] = js.undefined
  var createNewItemFromQuery: js.UndefOr[js.Function1[/* query */ String, _]] = js.undefined
  var createNewItemRenderer: js.UndefOr[
    js.Function3[
      /* query */ String, 
      /* active */ Boolean, 
      /* handleClick */ MouseEventHandler[HTMLElement], 
      js.UndefOr[Element]
    ]
  ] = js.undefined
  var defaultSelectedItem: js.UndefOr[js.Any] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var fill: js.UndefOr[Boolean] = js.undefined
  var initialContent: js.UndefOr[ReactNode] = js.undefined
  var inputProps: js.UndefOr[IInputGroupProps with HTMLInputProps] = js.undefined
  var inputValueRenderer: js.UndefOr[js.Function1[/* item */ js.Any, String]] = js.undefined
  var itemDisabled: js.UndefOr[String | (js.Function2[/* item */ js.Any, /* index */ Double, Boolean])] = js.undefined
  var itemListPredicate: js.UndefOr[ItemListPredicate[_]] = js.undefined
  var itemListRenderer: js.UndefOr[ItemListRenderer[_]] = js.undefined
  var itemPredicate: js.UndefOr[ItemPredicate[_]] = js.undefined
  var itemRenderer: js.UndefOr[ItemRenderer[_]] = js.undefined
  var items: js.UndefOr[js.Array[_]] = js.undefined
  var itemsEqual: js.UndefOr[ItemsEqualProp[_]] = js.undefined
  var noResults: js.UndefOr[ReactNode] = js.undefined
  var onActiveItemChange: js.UndefOr[
    js.Function2[/* activeItem */ js.Any | Null, /* isCreateNewItem */ Boolean, Unit]
  ] = js.undefined
  var onItemSelect: js.UndefOr[
    js.Function2[/* item */ js.Any, /* event */ js.UndefOr[SyntheticEvent[HTMLElement, Event_]], Unit]
  ] = js.undefined
  var onItemsPaste: js.UndefOr[js.Function1[/* items */ js.Array[_], Unit]] = js.undefined
  var onQueryChange: js.UndefOr[
    js.Function2[/* query */ String, /* event */ js.UndefOr[ChangeEvent[HTMLInputElement]], Unit]
  ] = js.undefined
  var openOnKeyDown: js.UndefOr[Boolean] = js.undefined
  var popoverProps: js.UndefOr[PartialIPopoverProps with js.Object] = js.undefined
  var query: js.UndefOr[String] = js.undefined
  var resetOnClose: js.UndefOr[Boolean] = js.undefined
  var resetOnQuery: js.UndefOr[Boolean] = js.undefined
  var resetOnSelect: js.UndefOr[Boolean] = js.undefined
  var scrollToActiveItem: js.UndefOr[Boolean] = js.undefined
  var selectedItem: js.UndefOr[js.Any] = js.undefined
}

object PartialISuggestPropsany {
  @scala.inline
  def apply(
    activeItem: js.Any | ICreateNewItem = null,
    className: String = null,
    closeOnSelect: js.UndefOr[Boolean] = js.undefined,
    createNewItemFromQuery: /* query */ String => _ = null,
    createNewItemRenderer: (/* query */ String, /* active */ Boolean, /* handleClick */ MouseEventHandler[HTMLElement]) => js.UndefOr[Element] = null,
    defaultSelectedItem: js.Any = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    fill: js.UndefOr[Boolean] = js.undefined,
    initialContent: ReactNode = null,
    inputProps: IInputGroupProps with HTMLInputProps = null,
    inputValueRenderer: /* item */ js.Any => String = null,
    itemDisabled: String | (js.Function2[/* item */ js.Any, /* index */ Double, Boolean]) = null,
    itemListPredicate: (/* query */ String, /* items */ js.Array[_]) => js.Array[_] = null,
    itemListRenderer: /* itemListProps */ IItemListRendererProps[_] => Element = null,
    itemPredicate: (/* query */ String, _, /* index */ js.UndefOr[Double], /* exactMatch */ js.UndefOr[Boolean]) => Boolean = null,
    itemRenderer: (_, /* itemProps */ IItemRendererProps) => Element | Null = null,
    items: js.Array[_] = null,
    itemsEqual: ItemsEqualProp[_] = null,
    noResults: ReactNode = null,
    onActiveItemChange: (/* activeItem */ js.Any | Null, /* isCreateNewItem */ Boolean) => Unit = null,
    onItemSelect: (/* item */ js.Any, /* event */ js.UndefOr[SyntheticEvent[HTMLElement, Event_]]) => Unit = null,
    onItemsPaste: /* items */ js.Array[_] => Unit = null,
    onQueryChange: (/* query */ String, /* event */ js.UndefOr[ChangeEvent[HTMLInputElement]]) => Unit = null,
    openOnKeyDown: js.UndefOr[Boolean] = js.undefined,
    popoverProps: PartialIPopoverProps with js.Object = null,
    query: String = null,
    resetOnClose: js.UndefOr[Boolean] = js.undefined,
    resetOnQuery: js.UndefOr[Boolean] = js.undefined,
    resetOnSelect: js.UndefOr[Boolean] = js.undefined,
    scrollToActiveItem: js.UndefOr[Boolean] = js.undefined,
    selectedItem: js.Any = null
  ): PartialISuggestPropsany = {
    val __obj = js.Dynamic.literal()
    if (activeItem != null) __obj.updateDynamic("activeItem")(activeItem.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnSelect)) __obj.updateDynamic("closeOnSelect")(closeOnSelect.asInstanceOf[js.Any])
    if (createNewItemFromQuery != null) __obj.updateDynamic("createNewItemFromQuery")(js.Any.fromFunction1(createNewItemFromQuery))
    if (createNewItemRenderer != null) __obj.updateDynamic("createNewItemRenderer")(js.Any.fromFunction3(createNewItemRenderer))
    if (defaultSelectedItem != null) __obj.updateDynamic("defaultSelectedItem")(defaultSelectedItem.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (initialContent != null) __obj.updateDynamic("initialContent")(initialContent.asInstanceOf[js.Any])
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps.asInstanceOf[js.Any])
    if (inputValueRenderer != null) __obj.updateDynamic("inputValueRenderer")(js.Any.fromFunction1(inputValueRenderer))
    if (itemDisabled != null) __obj.updateDynamic("itemDisabled")(itemDisabled.asInstanceOf[js.Any])
    if (itemListPredicate != null) __obj.updateDynamic("itemListPredicate")(js.Any.fromFunction2(itemListPredicate))
    if (itemListRenderer != null) __obj.updateDynamic("itemListRenderer")(js.Any.fromFunction1(itemListRenderer))
    if (itemPredicate != null) __obj.updateDynamic("itemPredicate")(js.Any.fromFunction4(itemPredicate))
    if (itemRenderer != null) __obj.updateDynamic("itemRenderer")(js.Any.fromFunction2(itemRenderer))
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (itemsEqual != null) __obj.updateDynamic("itemsEqual")(itemsEqual.asInstanceOf[js.Any])
    if (noResults != null) __obj.updateDynamic("noResults")(noResults.asInstanceOf[js.Any])
    if (onActiveItemChange != null) __obj.updateDynamic("onActiveItemChange")(js.Any.fromFunction2(onActiveItemChange))
    if (onItemSelect != null) __obj.updateDynamic("onItemSelect")(js.Any.fromFunction2(onItemSelect))
    if (onItemsPaste != null) __obj.updateDynamic("onItemsPaste")(js.Any.fromFunction1(onItemsPaste))
    if (onQueryChange != null) __obj.updateDynamic("onQueryChange")(js.Any.fromFunction2(onQueryChange))
    if (!js.isUndefined(openOnKeyDown)) __obj.updateDynamic("openOnKeyDown")(openOnKeyDown.asInstanceOf[js.Any])
    if (popoverProps != null) __obj.updateDynamic("popoverProps")(popoverProps.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (!js.isUndefined(resetOnClose)) __obj.updateDynamic("resetOnClose")(resetOnClose.asInstanceOf[js.Any])
    if (!js.isUndefined(resetOnQuery)) __obj.updateDynamic("resetOnQuery")(resetOnQuery.asInstanceOf[js.Any])
    if (!js.isUndefined(resetOnSelect)) __obj.updateDynamic("resetOnSelect")(resetOnSelect.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollToActiveItem)) __obj.updateDynamic("scrollToActiveItem")(scrollToActiveItem.asInstanceOf[js.Any])
    if (selectedItem != null) __obj.updateDynamic("selectedItem")(selectedItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialISuggestPropsany]
  }
}

