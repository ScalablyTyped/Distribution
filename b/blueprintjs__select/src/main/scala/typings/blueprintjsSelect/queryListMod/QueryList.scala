package typings.blueprintjsSelect.queryListMod

import org.scalablytyped.runtime.Instantiable1
import typings.blueprintjsCore.mod.AbstractComponent2
import typings.blueprintjsSelect.anon.Disabled
import typings.blueprintjsSelect.anon.ReadonlychildrenReactNode
import typings.blueprintjsSelect.listItemsUtilsMod.ICreateNewItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def setQuery(
    query: String,
    resetActiveItem: js.UndefOr[scala.Nothing],
    props: IQueryListProps[T] with ReadonlychildrenReactNode
  ): Unit = js.native
  def setQuery(query: String, resetActiveItem: Boolean): Unit = js.native
  def setQuery(query: String, resetActiveItem: Boolean, props: IQueryListProps[T] with ReadonlychildrenReactNode): Unit = js.native
  
  /**
    * Flag indicating that we should check whether selected item is in viewport
    * after rendering, typically because of keyboard change. Set to `true` when
    * manipulating state in a way that may cause active item to scroll away.
    */
  var shouldCheckActiveItemInViewport: js.Any = js.native
  
  var wouldCreatedItemMatchSomeExistingItem: js.Any = js.native
}
/* static members */
@JSImport("@blueprintjs/select/lib/esm/components/query-list/queryList", "QueryList")
@js.native
object QueryList extends js.Object {
  
  var defaultProps: Disabled = js.native
  
  var displayName: String = js.native
  
  def ofType[U](): Instantiable1[/* props */ IQueryListProps[U], QueryList[U]] = js.native
}
