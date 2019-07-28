package typings.atBlueprintjsSelect.libEsmComponentsQueryDashListQueryListMod

import org.scalablytyped.runtime.Instantiable1
import typings.atBlueprintjsSelect.Anon_Children
import typings.atBlueprintjsSelect.Anon_Disabled
import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/select/lib/esm/components/query-list/queryList", "QueryList")
@js.native
class QueryList[T] protected ()
  extends Component[IQueryListProps[T], IQueryListState[T], js.Any] {
  def this(props: IQueryListProps[T]) = this()
  def this(props: IQueryListProps[T], context: js.Any) = this()
  /**
    * The item that we expect to be the next selected active item (based on click
    * or key interactions). When scrollToActiveItem = false, used to detect if
    * an unexpected external change to the active item has been made.
    */
  var expectedNextActiveItem: js.Any = js.native
  var handleItemCreate: js.Any = js.native
  var handleItemSelect: js.Any = js.native
  var handleKeyDown: js.Any = js.native
  var handleKeyUp: js.Any = js.native
  var handlePaste: js.Any = js.native
  var handleQueryChange: js.Any = js.native
  var itemsParentRef: js.UndefOr[js.Any] = js.native
  var refHandlers: js.Any = js.native
  var renderCreateItemMenuItem: js.Any = js.native
  /** wrapper around `itemRenderer` to inject props */
  var renderItem: js.Any = js.native
  /** default `itemListRenderer` implementation */
  var renderItemList: js.Any = js.native
  /**
    * Flag indicating that we should check whether selected item is in viewport
    * after rendering, typically because of keyboard change. Set to `true` when
    * manipulating state in a way that may cause active item to scroll away.
    */
  var shouldCheckActiveItemInViewport: js.Any = js.native
  /* private */ def canCreateItems(): js.Any = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MQueryList(prevProps: IQueryListProps[T]): Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MQueryList(nextProps: IQueryListProps[T]): Unit = js.native
  /* private */ def getActiveElement(): js.Any = js.native
  /* private */ def getActiveIndex(): js.Any = js.native
  /* private */ def getActiveIndex(items: js.Any): js.Any = js.native
  /* private */ def getItemsParentPadding(): js.Any = js.native
  /**
    * Get the next enabled item, moving in the given direction from the start
    * index. A `null` return value means no suitable item was found.
    * @param direction amount to move in each iteration, typically +/-1
    */
  /* private */ def getNextActiveItem(direction: js.Any): js.Any = js.native
  /* private */ def getNextActiveItem(direction: js.Any, startIndex: js.Any): js.Any = js.native
  /* private */ def isCreateItemRendered(): js.Any = js.native
  def scrollActiveItemIntoView(): Unit = js.native
  /* private */ def setActiveItem(activeItem: js.Any): js.Any = js.native
  def setQuery(query: String): Unit = js.native
  def setQuery(
    query: String,
    resetActiveItem: js.UndefOr[scala.Nothing],
    props: Anon_Children with IQueryListProps[T]
  ): Unit = js.native
  def setQuery(query: String, resetActiveItem: Boolean): Unit = js.native
  def setQuery(query: String, resetActiveItem: Boolean, props: Anon_Children with IQueryListProps[T]): Unit = js.native
  /* private */ def wouldCreatedItemMatchSomeExistingItem(): js.Any = js.native
}

/* static members */
@JSImport("@blueprintjs/select/lib/esm/components/query-list/queryList", "QueryList")
@js.native
object QueryList extends js.Object {
  var defaultProps: Anon_Disabled = js.native
  var displayName: String = js.native
  def ofType[T](): Instantiable1[/* props */ IQueryListProps[T], QueryList[T]] = js.native
}

