package typings.blueprintjsSelect

import org.scalablytyped.runtime.Instantiable1
import typings.blueprintjsCore.mod.AbstractPureComponent2
import typings.blueprintjsPopover2.libEsmPopover2SharedPropsMod.DefaultPopover2TargetHTMLProps
import typings.blueprintjsPopover2.mod.Popover2
import typings.blueprintjsSelect.anon.PartialOmitInputGroupPropAbout
import typings.blueprintjsSelect.anon.PartialOmitPopover2PropsD
import typings.blueprintjsSelect.anon.PartialSuggest2Propsany
import typings.blueprintjsSelect.blueprintjsSelectStrings.first
import typings.blueprintjsSelect.blueprintjsSelectStrings.last
import typings.blueprintjsSelect.libEsmCommonItemListRendererMod.ItemListRenderer
import typings.blueprintjsSelect.libEsmCommonItemRendererMod.ItemRenderer
import typings.blueprintjsSelect.libEsmCommonListItemsPropsMod.ItemsEqualProp
import typings.blueprintjsSelect.libEsmCommonListItemsUtilsMod.CreateNewItem
import typings.blueprintjsSelect.libEsmCommonPredicateMod.ItemListPredicate
import typings.blueprintjsSelect.libEsmCommonPredicateMod.ItemPredicate
import typings.react.mod.ChangeEvent
import typings.react.mod.HTMLAttributes
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

object libEsmComponentsSuggestSuggest2Mod {
  
  @JSImport("@blueprintjs/select/lib/esm/components/suggest/suggest2", "Suggest2")
  @js.native
  open class Suggest2[T] protected ()
    extends AbstractPureComponent2[Suggest2Props[T], Suggest2State[T], js.Object] {
    def this(props: Suggest2Props[T]) = this()
    def this(props: Suggest2Props[T], context: Any) = this()
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MSuggest2(prevProps: Suggest2Props[T], prevState: Suggest2State[T]): Unit = js.native
    
    /* private */ var getInitialSelectedItem: Any = js.native
    
    /* private */ var getPopoverTargetRenderer: Any = js.native
    
    /* private */ var getTargetKeyDownHandler: Any = js.native
    
    /* private */ var getTargetKeyUpHandler: Any = js.native
    
    /* private */ var handleInputFocus: Any = js.native
    
    /* private */ var handleInputRef: Any = js.native
    
    /* private */ var handleItemSelect: Any = js.native
    
    /* private */ var handlePopoverInteraction: Any = js.native
    
    /* private */ var handlePopoverOpened: Any = js.native
    
    /* private */ var handlePopoverOpening: Any = js.native
    
    /* private */ var handleQueryListRef: Any = js.native
    
    var inputElement: HTMLInputElement | Null = js.native
    
    /* private */ var listboxId: Any = js.native
    
    /* private */ var maybeResetActiveItemToSelectedItem: Any = js.native
    
    /* private */ var queryList: Any = js.native
    
    /* private */ var renderQueryList: Any = js.native
    
    /* private */ var selectText: Any = js.native
  }
  /* static members */
  object Suggest2 {
    
    @JSImport("@blueprintjs/select/lib/esm/components/suggest/suggest2", "Suggest2")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/select/lib/esm/components/suggest/suggest2", "Suggest2.defaultProps")
    @js.native
    def defaultProps: PartialSuggest2Propsany = js.native
    inline def defaultProps_=(x: PartialSuggest2Propsany): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/select/lib/esm/components/suggest/suggest2", "Suggest2.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    /** @deprecated no longer necessary now that the TypeScript parser supports type arguments on JSX element tags */
    inline def ofType[U](): Instantiable1[/* props */ Suggest2Props[U], Suggest2[U]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ofType")().asInstanceOf[Instantiable1[/* props */ Suggest2Props[U], Suggest2[U]]]
  }
  
  /* Inlined parent @blueprintjs/select.@blueprintjs/select/lib/esm/common.ListItemsProps<T> */
  /* Inlined parent std.Omit<@blueprintjs/select.@blueprintjs/select/lib/esm/common.SelectPopoverProps, 'popoverTargetProps'> */
  @js.native
  trait Suggest2Props[T] extends StObject {
    
    /**
      * The currently focused item for keyboard interactions, or `null` to
      * indicate that no item is active. If omitted or `undefined`, this prop will be
      * uncontrolled (managed by the component's state). Use `onActiveItemChange`
      * to listen for updates.
      */
    var activeItem: js.UndefOr[T | CreateNewItem | Null] = js.native
    
    /** A space-delimited list of class names to pass along to a child element. */
    var className: js.UndefOr[String] = js.native
    
    /**
      * Whether the popover should close after selecting an item.
      *
      * @default true
      */
    var closeOnSelect: js.UndefOr[Boolean] = js.native
    
    /**
      * If provided, allows new items to be created using the current query
      * string. This is invoked when user interaction causes one or many items to be
      * created, either by pressing the `Enter` key or by clicking on the "Create
      * Item" option. It transforms a query string into one or many items type.
      */
    var createNewItemFromQuery: js.UndefOr[js.Function1[/* query */ String, T | js.Array[T]]] = js.native
    
    /**
      * Determines the position of the `createNewItem` within the list: first or
      * last. Only relevant when `createNewItemRenderer` is defined.
      *
      * @default 'last'
      */
    var createNewItemPosition: js.UndefOr[first | last] = js.native
    
    /**
      * Custom renderer to transform the current query string into a selectable
      * "Create Item" option. If this function is provided, a "Create Item"
      * option will be rendered at the end of the list of items. If this function
      * is not provided, a "Create Item" option will not be displayed.
      */
    var createNewItemRenderer: js.UndefOr[
        js.Function3[
          /* query */ String, 
          /* active */ Boolean, 
          /* handleClick */ MouseEventHandler[HTMLElement], 
          js.UndefOr[Element]
        ]
      ] = js.native
    
    /**
      * The uncontrolled default selected item.
      * This prop is ignored if `selectedItem` is used to control the state.
      */
    var defaultSelectedItem: js.UndefOr[T] = js.native
    
    /** Whether the input field should be disabled. */
    var disabled: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether the component should take up the full width of its container.
      */
    var fill: js.UndefOr[Boolean] = js.native
    
    /**
      * React content to render when query is empty.
      * If omitted, all items will be rendered (or result of `itemListPredicate` with empty query).
      * If explicit `null`, nothing will be rendered when query is empty.
      *
      * This prop is ignored if a custom `itemListRenderer` is supplied.
      */
    var initialContent: js.UndefOr[ReactNode | Null] = js.native
    
    /**
      * Props to pass to the query [InputGroup component](#core/components/text-inputs.input-group).
      *
      * Some properties are unavailable:
      * - `inputProps.value`: use `query` instead
      * - `inputProps.onChange`: use `onQueryChange` instead
      * - `inputProps.disabled`: use `disabled` instead
      * - `inputProps.fill`: use `fill` instead
      *
      * Other notes:
      * - `inputProps.tagName` will override `popoverProps.targetTagName`
      * - `inputProps.className` will work as expected, but this is redundant with the simpler `className` prop
      */
    var inputProps: js.UndefOr[PartialOmitInputGroupPropAbout] = js.native
    
    /** Custom renderer to transform an item into a string for the input value. */
    def inputValueRenderer(item: T): String = js.native
    
    /**
      * Determine if the given item is disabled. Provide a callback function, or
      * simply provide the name of a boolean property on the item that exposes
      * its disabled state.
      */
    var itemDisabled: js.UndefOr[
        (/* keyof T */ String) | (js.Function2[/* item */ T, /* index */ Double, Boolean])
      ] = js.native
    
    /**
      * Customize querying of entire `items` array. Return new list of items.
      * This method can reorder, add, or remove items at will.
      * (Supports filter algorithms that operate on the entire set, rather than individual items.)
      *
      * If `itemPredicate` is also defined, this prop takes priority and the other will be ignored.
      */
    var itemListPredicate: js.UndefOr[ItemListPredicate[T]] = js.native
    
    /**
      * Custom renderer for the contents of the dropdown.
      *
      * The default implementation invokes `itemRenderer` for each item that passes the predicate
      * and wraps them all in a `Menu` element. If the query is empty then `initialContent` is returned,
      * and if there are no items that match the predicate then `noResults` is returned.
      */
    var itemListRenderer: js.UndefOr[ItemListRenderer[T]] = js.native
    
    /**
      * Customize querying of individual items.
      *
      * __Filtering a list of items.__ This function is invoked to filter the
      * list of items as a query is typed. Return `true` to keep the item, or
      * `false` to hide. This method is invoked once for each item, so it should
      * be performant. For more complex queries, use `itemListPredicate` to
      * operate once on the entire array. For the purposes of filtering the list,
      * this prop is ignored if `itemListPredicate` is also defined.
      *
      * __Matching a pasted value to an item.__ This function is also invoked to
      * match a pasted value to an existing item if possible. In this case, the
      * function will receive `exactMatch=true`, and the function should return
      * true only if the item _exactly_ matches the query. For the purposes of
      * matching pasted values, this prop will be invoked even if
      * `itemListPredicate` is defined.
      */
    var itemPredicate: js.UndefOr[ItemPredicate[T]] = js.native
    
    /**
      * Custom renderer for an item in the dropdown list. Receives a boolean indicating whether
      * this item is active (selected by keyboard arrows) and an `onClick` event handler that
      * should be attached to the returned element.
      */
    var itemRenderer: ItemRenderer[T] = js.native
    
    /** Array of items in the list. */
    var items: js.Array[T] = js.native
    
    /**
      * Specifies how to test if two items are equal. By default, simple strict
      * equality (`===`) is used to compare two items.
      *
      * If your items have a unique identifier field, simply provide the name of
      * a property on the item that can be compared with strict equality to
      * determine equivalence: `itemsEqual="id"` will check `a.id === b.id`.
      *
      * If more complex comparison logic is required, provide an equality
      * comparator function that returns `true` if the two items are equal. The
      * arguments to this function will never be `null` or `undefined`, as those
      * values are handled before calling the function.
      */
    var itemsEqual: js.UndefOr[ItemsEqualProp[T]] = js.native
    
    /**
      * HTML attributes to add to the `Menu` listbox containing the selectable options.
      */
    var menuProps: js.UndefOr[HTMLAttributes[HTMLUListElement]] = js.native
    
    /**
      * React content to render when filtering items returns zero results.
      * If omitted, nothing will be rendered in this case.
      *
      * This prop is ignored if a custom `itemListRenderer` is supplied.
      *
      * NOTE: if passing a `MenuItem`, ensure it has `roleStructure="listoption"` prop.
      */
    var noResults: js.UndefOr[ReactNode] = js.native
    
    /**
      * Invoked when user interaction should change the active item: arrow keys
      * move it up/down in the list, selecting an item makes it active, and
      * changing the query may reset it to the first item in the list if it no
      * longer matches the filter.
      *
      * If the "Create Item" option is displayed and currently active, then
      * `isCreateNewItem` will be `true` and `activeItem` will be `null`. In this
      * case, you should provide a valid `CreateNewItem` object to the
      * `activeItem` _prop_ in order for the "Create Item" option to appear as
      * active.
      *
      * __Note:__ You can instantiate a `CreateNewItem` object using the
      * `getCreateNewItem()` utility exported from this package.
      */
    var onActiveItemChange: js.UndefOr[js.Function2[/* activeItem */ T | Null, /* isCreateNewItem */ Boolean, Unit]] = js.native
    
    /**
      * Callback invoked when an item from the list is selected,
      * typically by clicking or pressing `enter` key.
      */
    def onItemSelect(item: T): Unit = js.native
    def onItemSelect(item: T, event: SyntheticEvent[HTMLElement, Event]): Unit = js.native
    
    /**
      * Callback invoked when multiple items are selected at once via pasting.
      */
    var onItemsPaste: js.UndefOr[js.Function1[/* items */ js.Array[T], Unit]] = js.native
    
    /**
      * Callback invoked when the query string changes.
      */
    var onQueryChange: js.UndefOr[
        js.Function2[/* query */ String, /* event */ js.UndefOr[ChangeEvent[HTMLInputElement]], Unit]
      ] = js.native
    
    /**
      * If true, the component waits until a keydown event in the TagInput
      * before opening its popover.
      *
      * If false, the popover opens immediately after a mouse click or TAB key
      * interaction focuses the component's TagInput.
      *
      * @default false
      */
    var openOnKeyDown: js.UndefOr[Boolean] = js.native
    
    var popoverContentProps: js.UndefOr[HTMLAttributes[HTMLDivElement]] = js.native
    
    var popoverProps: js.UndefOr[PartialOmitPopover2PropsD] = js.native
    
    var popoverRef: js.UndefOr[RefObject[Popover2[DefaultPopover2TargetHTMLProps]]] = js.native
    
    /**
      * Query string passed to `itemListPredicate` or `itemPredicate` to filter items.
      * This value is controlled: its state must be managed externally by attaching an `onChange`
      * handler to the relevant element in your `renderer` implementation.
      */
    var query: js.UndefOr[String] = js.native
    
    /**
      * Whether the active item should be reset to the first matching item _when
      * the popover closes_. The query will also be reset to the empty string.
      *
      * @default false
      */
    var resetOnClose: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether the active item should be reset to the first matching item _every
      * time the query changes_ (via prop or by user input).
      *
      * @default true
      */
    var resetOnQuery: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether the active item should be reset to the first matching item _when
      * an item is selected_. The query will also be reset to the empty string.
      *
      * @default false
      */
    var resetOnSelect: js.UndefOr[Boolean] = js.native
    
    /**
      * When `activeItem` is controlled, whether the active item should _always_
      * be scrolled into view when the prop changes. If `false`, only changes
      * that result from built-in interactions (clicking, querying, or using
      * arrow keys) will scroll the active item into view. Ignored if the
      * `activeItem` prop is omitted (uncontrolled behavior).
      *
      * @default true
      */
    var scrollToActiveItem: js.UndefOr[Boolean] = js.native
    
    /**
      * The currently selected item, or `null` to indicate that no item is selected.
      * If omitted or `undefined`, this prop will be uncontrolled (managed by the component's state).
      * Use `onItemSelect` to listen for updates.
      */
    var selectedItem: js.UndefOr[T | Null] = js.native
  }
  
  trait Suggest2State[T] extends StObject {
    
    var isOpen: Boolean
    
    var selectedItem: T | Null
  }
  object Suggest2State {
    
    inline def apply[T](isOpen: Boolean): Suggest2State[T] = {
      val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any], selectedItem = null)
      __obj.asInstanceOf[Suggest2State[T]]
    }
    
    extension [Self <: Suggest2State[?], T](x: Self & Suggest2State[T]) {
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setSelectedItem(value: T): Self = StObject.set(x, "selectedItem", value.asInstanceOf[js.Any])
      
      inline def setSelectedItemNull: Self = StObject.set(x, "selectedItem", null)
    }
  }
}
