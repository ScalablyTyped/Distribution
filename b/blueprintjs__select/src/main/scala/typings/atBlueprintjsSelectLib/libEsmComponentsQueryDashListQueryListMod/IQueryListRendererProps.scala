package typings
package atBlueprintjsSelectLib.libEsmComponentsQueryDashListQueryListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IQueryListRendererProps[T]
  extends IQueryListState[T]
     with atBlueprintjsCoreLib.libEsmCommonPropsMod.IProps {
  /**
    * Keyboard handler for up/down arrow keys to shift the active item.
    * Attach this handler to any element that should support this interaction.
    */
  @JSName("handleKeyDown")
  var handleKeyDown_Original: reactLib.reactMod.ReactNs.KeyboardEventHandler[reactLib.HTMLElement] = js.native
  /**
    * Keyboard handler for enter key to select the active item.
    * Attach this handler to any element that should support this interaction.
    */
  @JSName("handleKeyUp")
  var handleKeyUp_Original: reactLib.reactMod.ReactNs.KeyboardEventHandler[reactLib.HTMLElement] = js.native
  /**
    * Change handler for query string. Attach this to an input element to allow
    * `QueryList` to control the query.
    */
  @JSName("handleQueryChange")
  var handleQueryChange_Original: reactLib.reactMod.ReactNs.ChangeEventHandler[reactLib.HTMLInputElement] = js.native
  /** Rendered elements returned from `itemListRenderer` prop. */
  var itemList: reactLib.reactMod.ReactNs.ReactNode = js.native
  /**
    * Selection handler that should be invoked when a new item has been chosen,
    * perhaps because the user clicked it.
    */
  def handleItemSelect(item: T): scala.Unit = js.native
  def handleItemSelect(item: T, event: reactLib.reactMod.ReactNs.SyntheticEvent[reactLib.HTMLElement, reactLib.Event]): scala.Unit = js.native
  /**
    * Keyboard handler for up/down arrow keys to shift the active item.
    * Attach this handler to any element that should support this interaction.
    */
  def handleKeyDown(event: reactLib.reactMod.ReactNs.KeyboardEvent[reactLib.HTMLElement]): scala.Unit = js.native
  /**
    * Keyboard handler for enter key to select the active item.
    * Attach this handler to any element that should support this interaction.
    */
  def handleKeyUp(event: reactLib.reactMod.ReactNs.KeyboardEvent[reactLib.HTMLElement]): scala.Unit = js.native
  /**
    * Change handler for query string. Attach this to an input element to allow
    * `QueryList` to control the query.
    */
  def handleQueryChange(event: reactLib.reactMod.ReactNs.ChangeEvent[reactLib.HTMLInputElement]): scala.Unit = js.native
}

