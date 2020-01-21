package typings.blueprintjsSelect.queryListMod

import typings.blueprintjsCore.propsMod.IProps
import typings.react.mod.ChangeEventHandler
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.std.Event_
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in 'activeItem' | 'filteredItems' | 'query' ]: @blueprintjs/select.@blueprintjs/select/lib/esm/components/query-list/queryList.IQueryListState<T>[P]} */ @js.native
trait IQueryListRendererProps[T] extends IProps {
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
    * Change handler for query string. Attach this to an input element to allow
    * `QueryList` to control the query.
    */
  var handleQueryChange: ChangeEventHandler[HTMLInputElement] = js.native
  /** Rendered elements returned from `itemListRenderer` prop. */
  var itemList: ReactNode = js.native
  /**
    * Selection handler that should be invoked when a new item has been chosen,
    * perhaps because the user clicked it.
    */
  def handleItemSelect(item: T): Unit = js.native
  def handleItemSelect(item: T, event: SyntheticEvent[HTMLElement, Event_]): Unit = js.native
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
}

