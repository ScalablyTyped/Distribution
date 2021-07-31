package typings.blueprintjsSelect

import org.scalablytyped.runtime.Instantiable1
import typings.blueprintjsCore.mod.AbstractComponent2
import typings.blueprintjsSelect.anon.Disabled
import typings.blueprintjsSelect.anon.ReadonlychildrenReactNode
import typings.blueprintjsSelect.listItemsPropsMod.IListItemsProps
import typings.blueprintjsSelect.listItemsUtilsMod.ICreateNewItem
import typings.react.mod.ChangeEventHandler
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.react.mod.global.JSX.Element
import typings.std.Event
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queryListMod {
  
  @JSImport("@blueprintjs/select/lib/esm/components/query-list/queryList", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/select/lib/esm/components/query-list/queryList", "QueryList")
  @js.native
  class QueryList[T] protected ()
    extends AbstractComponent2[IQueryListProps[T], IQueryListState[T], js.Object] {
    def this(props: IQueryListProps[T]) = this()
    def this(props: IQueryListProps[T], context: js.Any) = this()
    
    var canCreateItems: js.Any = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MQueryList(prevProps: IQueryListProps[T]): Unit = js.native
    
    /**
      * The item that we expect to be the next selected active item (based on click
      * or key interactions). When scrollToActiveItem = false, used to detect if
      * an unexpected external change to the active item has been made.
      */
    var expectedNextActiveItem: js.Any = js.native
    
    var getActiveElement: js.Any = js.native
    
    var getActiveIndex: js.Any = js.native
    
    var getItemsParentPadding: js.Any = js.native
    
    /**
      * Get the next enabled item, moving in the given direction from the start
      * index. A `null` return value means no suitable item was found.
      * @param direction amount to move in each iteration, typically +/-1
      * @param startIndex item to start iteration
      */
    var getNextActiveItem: js.Any = js.native
    
    var handleInputQueryChange: js.Any = js.native
    
    var handleItemCreate: js.Any = js.native
    
    var handleItemSelect: js.Any = js.native
    
    var handleKeyDown: js.Any = js.native
    
    var handleKeyUp: js.Any = js.native
    
    var handlePaste: js.Any = js.native
    
    var isCreateItemFirst: js.Any = js.native
    
    var isCreateItemRendered: js.Any = js.native
    
    /**
      * Flag which is set to true while in between an ENTER "keydown" event and its
      * corresponding "keyup" event.
      *
      * When entering text via an IME (https://en.wikipedia.org/wiki/Input_method),
      * the ENTER key is pressed to confirm the character(s) to be input from a list
      * of options. The operating system intercepts the ENTER "keydown" event and
      * prevents it from propagating to the application, but "keyup" is still
      * fired, triggering a spurious event which this component does not expect.
      *
      * To work around this quirk, we keep track of "real" key presses by setting
      * this flag in handleKeyDown.
      */
    var isEnterKeyPressed: js.Any = js.native
    
    var itemsParentRef: js.Any = js.native
    
    var maybeResetQuery: js.Any = js.native
    
    var refHandlers: js.Any = js.native
    
    var renderCreateItemMenuItem: js.Any = js.native
    
    /** wrapper around `itemRenderer` to inject props */
    var renderItem: js.Any = js.native
    
    /** default `itemListRenderer` implementation */
    var renderItemList: js.Any = js.native
    
    def scrollActiveItemIntoView(): Unit = js.native
    
    def setActiveItem(): Unit = js.native
    def setActiveItem(activeItem: T): Unit = js.native
    def setActiveItem(activeItem: ICreateNewItem): Unit = js.native
    
    def setQuery(query: String): Unit = js.native
    def setQuery(query: String, resetActiveItem: Boolean): Unit = js.native
    def setQuery(query: String, resetActiveItem: Boolean, props: IQueryListProps[T] & ReadonlychildrenReactNode): Unit = js.native
    def setQuery(query: String, resetActiveItem: Unit, props: IQueryListProps[T] & ReadonlychildrenReactNode): Unit = js.native
    
    /**
      * Flag indicating that we should check whether selected item is in viewport
      * after rendering, typically because of keyboard change. Set to `true` when
      * manipulating state in a way that may cause active item to scroll away.
      */
    var shouldCheckActiveItemInViewport: js.Any = js.native
    
    var wouldCreatedItemMatchSomeExistingItem: js.Any = js.native
  }
  /* static members */
  object QueryList {
    
    @JSImport("@blueprintjs/select/lib/esm/components/query-list/queryList", "QueryList")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/select/lib/esm/components/query-list/queryList", "QueryList.defaultProps")
    @js.native
    def defaultProps: Disabled = js.native
    @scala.inline
    def defaultProps_=(x: Disabled): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/select/lib/esm/components/query-list/queryList", "QueryList.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def ofType[U](): Instantiable1[/* props */ IQueryListProps[U], QueryList[U]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ofType")().asInstanceOf[Instantiable1[/* props */ IQueryListProps[U], QueryList[U]]]
  }
  
  @scala.inline
  def getFirstEnabledItem[T](items: js.Array[T]): T | ICreateNewItem | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getFirstEnabledItem")(items.asInstanceOf[js.Any]).asInstanceOf[T | ICreateNewItem | Null]
  @scala.inline
  def getFirstEnabledItem[T](items: js.Array[T], itemDisabled: /* keyof T */ String): T | ICreateNewItem | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getFirstEnabledItem")(items.asInstanceOf[js.Any], itemDisabled.asInstanceOf[js.Any])).asInstanceOf[T | ICreateNewItem | Null]
  @scala.inline
  def getFirstEnabledItem[T](items: js.Array[T], itemDisabled: /* keyof T */ String, direction: Double): T | ICreateNewItem | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getFirstEnabledItem")(items.asInstanceOf[js.Any], itemDisabled.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[T | ICreateNewItem | Null]
  @scala.inline
  def getFirstEnabledItem[T](items: js.Array[T], itemDisabled: /* keyof T */ String, direction: Double, startIndex: Double): T | ICreateNewItem | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getFirstEnabledItem")(items.asInstanceOf[js.Any], itemDisabled.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[T | ICreateNewItem | Null]
  @scala.inline
  def getFirstEnabledItem[T](items: js.Array[T], itemDisabled: /* keyof T */ String, direction: Unit, startIndex: Double): T | ICreateNewItem | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getFirstEnabledItem")(items.asInstanceOf[js.Any], itemDisabled.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[T | ICreateNewItem | Null]
  @scala.inline
  def getFirstEnabledItem[T](items: js.Array[T], itemDisabled: js.Function2[/* item */ T, /* index */ Double, Boolean]): T | ICreateNewItem | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getFirstEnabledItem")(items.asInstanceOf[js.Any], itemDisabled.asInstanceOf[js.Any])).asInstanceOf[T | ICreateNewItem | Null]
  @scala.inline
  def getFirstEnabledItem[T](
    items: js.Array[T],
    itemDisabled: js.Function2[/* item */ T, /* index */ Double, Boolean],
    direction: Double
  ): T | ICreateNewItem | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getFirstEnabledItem")(items.asInstanceOf[js.Any], itemDisabled.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[T | ICreateNewItem | Null]
  @scala.inline
  def getFirstEnabledItem[T](
    items: js.Array[T],
    itemDisabled: js.Function2[/* item */ T, /* index */ Double, Boolean],
    direction: Double,
    startIndex: Double
  ): T | ICreateNewItem | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getFirstEnabledItem")(items.asInstanceOf[js.Any], itemDisabled.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[T | ICreateNewItem | Null]
  @scala.inline
  def getFirstEnabledItem[T](
    items: js.Array[T],
    itemDisabled: js.Function2[/* item */ T, /* index */ Double, Boolean],
    direction: Unit,
    startIndex: Double
  ): T | ICreateNewItem | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getFirstEnabledItem")(items.asInstanceOf[js.Any], itemDisabled.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[T | ICreateNewItem | Null]
  @scala.inline
  def getFirstEnabledItem[T](items: js.Array[T], itemDisabled: Unit, direction: Double): T | ICreateNewItem | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getFirstEnabledItem")(items.asInstanceOf[js.Any], itemDisabled.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[T | ICreateNewItem | Null]
  @scala.inline
  def getFirstEnabledItem[T](items: js.Array[T], itemDisabled: Unit, direction: Double, startIndex: Double): T | ICreateNewItem | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getFirstEnabledItem")(items.asInstanceOf[js.Any], itemDisabled.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[T | ICreateNewItem | Null]
  @scala.inline
  def getFirstEnabledItem[T](items: js.Array[T], itemDisabled: Unit, direction: Unit, startIndex: Double): T | ICreateNewItem | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getFirstEnabledItem")(items.asInstanceOf[js.Any], itemDisabled.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any])).asInstanceOf[T | ICreateNewItem | Null]
  
  @js.native
  trait IQueryListProps[T]
    extends StObject
       with IListItemsProps[T] {
    
    /**
      * Whether the list is disabled.
      * @default false
      */
    var disabled: js.UndefOr[Boolean] = js.native
    
    /**
      * Initial active item, useful if the parent component is controlling its selectedItem but
      * not activeItem.
      */
    var initialActiveItem: js.UndefOr[T] = js.native
    
    /**
      * Callback invoked when user presses a key, after processing `QueryList`'s own key events
      * (up/down to navigate active item). This callback is passed to `renderer` and (along with
      * `onKeyUp`) can be attached to arbitrary content elements to support keyboard selection.
      */
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLElement]] = js.native
    
    /**
      * Callback invoked when user releases a key, after processing `QueryList`'s own key events
      * (enter to select active item). This callback is passed to `renderer` and (along with
      * `onKeyDown`) can be attached to arbitrary content elements to support keyboard selection.
      */
    var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLElement]] = js.native
    
    /**
      * Customize rendering of the component.
      * Receives an object with props that should be applied to elements as necessary.
      */
    def renderer(listProps: IQueryListRendererProps[T]): Element = js.native
  }
  
  /* Inlined parent std.Pick<@blueprintjs/select.@blueprintjs/select/lib/esm/components/query-list/queryList.IQueryListState<T>, 'activeItem' | 'filteredItems' | 'query'> */
  /* Inlined parent @blueprintjs/core.@blueprintjs/core.IProps */
  @js.native
  trait IQueryListRendererProps[T] extends StObject {
    
    var activeItem: T | ICreateNewItem | Null = js.native
    
    /** A space-delimited list of class names to pass along to a child element. */
    var className: js.UndefOr[String] = js.native
    
    var filteredItems: js.Array[T] = js.native
    
    /**
      * Selection handler that should be invoked when a new item has been chosen,
      * perhaps because the user clicked it.
      */
    def handleItemSelect(item: T): Unit = js.native
    def handleItemSelect(item: T, event: SyntheticEvent[HTMLElement, Event]): Unit = js.native
    
    /**
      * Keyboard handler for up/down arrow keys to shift the active item.
      * Attach this handler to any element that should support this interaction.
      */
    var handleKeyDown: KeyboardEventHandler[HTMLElement] = js.native
    
    /**
      * Keyboard handler for enter key to select the active item.
      * Attach this handler to any element that should support this interaction.
      */
    var handleKeyUp: KeyboardEventHandler[HTMLElement] = js.native
    
    /**
      * Handler that should be invoked when the user pastes one or more values.
      *
      * This callback will use `itemPredicate` with `exactMatch=true` to find a
      * subset of `items` exactly matching the pasted `values` provided, then it
      * will invoke `onItemsPaste` with those found items. Each pasted value that
      * does not exactly match an item will be ignored.
      *
      * If creating items is enabled (by providing both `createNewItemFromQuery`
      * and `createNewItemRenderer`), then pasted values that do not exactly
      * match an existing item will emit a new item as created via
      * `createNewItemFromQuery`.
      *
      * If `itemPredicate` returns multiple matching items for a particular query
      * in `queries`, then only the first matching item will be emitted.
      */
    def handlePaste(queries: js.Array[String]): Unit = js.native
    
    /**
      * Change handler for query string. Attach this to an input element to allow
      * `QueryList` to control the query.
      */
    var handleQueryChange: ChangeEventHandler[HTMLInputElement] = js.native
    
    /** Rendered elements returned from `itemListRenderer` prop. */
    var itemList: ReactNode = js.native
    
    var query: String = js.native
  }
  
  trait IQueryListState[T] extends StObject {
    
    /** The currently focused item (for keyboard interactions). */
    var activeItem: T | ICreateNewItem | Null
    
    /**
      * The item returned from `createNewItemFromQuery(this.state.query)`, cached
      * to avoid continuous reinstantions within `isCreateItemRendered`, where
      * this element will be used to hide the "Create Item" option if its value
      * matches the current `query`.
      */
    var createNewItem: js.UndefOr[T] = js.undefined
    
    /** The original `items` array filtered by `itemListPredicate` or `itemPredicate`. */
    var filteredItems: js.Array[T]
    
    /** The current query string. */
    var query: String
  }
  object IQueryListState {
    
    @scala.inline
    def apply[T](filteredItems: js.Array[T], query: String): IQueryListState[T] = {
      val __obj = js.Dynamic.literal(filteredItems = filteredItems.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], activeItem = null)
      __obj.asInstanceOf[IQueryListState[T]]
    }
    
    @scala.inline
    implicit class IQueryListStateMutableBuilder[Self <: IQueryListState[?], T] (val x: Self & IQueryListState[T]) extends AnyVal {
      
      @scala.inline
      def setActiveItem(value: T | ICreateNewItem): Self = StObject.set(x, "activeItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveItemNull: Self = StObject.set(x, "activeItem", null)
      
      @scala.inline
      def setCreateNewItem(value: T): Self = StObject.set(x, "createNewItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateNewItemUndefined: Self = StObject.set(x, "createNewItem", js.undefined)
      
      @scala.inline
      def setFilteredItems(value: js.Array[T]): Self = StObject.set(x, "filteredItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilteredItemsVarargs(value: T*): Self = StObject.set(x, "filteredItems", js.Array(value :_*))
      
      @scala.inline
      def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    }
  }
}
