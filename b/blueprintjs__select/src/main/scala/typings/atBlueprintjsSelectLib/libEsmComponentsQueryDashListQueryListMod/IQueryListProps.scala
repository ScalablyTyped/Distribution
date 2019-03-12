package typings
package atBlueprintjsSelectLib.libEsmComponentsQueryDashListQueryListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IQueryListProps[T]
  extends atBlueprintjsSelectLib.libEsmCommonListItemsPropsMod.IListItemsProps[T] {
  /**
    * Callback invoked when user presses a key, after processing `QueryList`'s own key events
    * (up/down to navigate active item). This callback is passed to `renderer` and (along with
    * `onKeyUp`) can be attached to arbitrary content elements to support keyboard selection.
    */
  var onKeyDown: js.UndefOr[reactLib.reactMod.ReactNs.KeyboardEventHandler[stdLib.HTMLElement]] = js.native
  /**
    * Callback invoked when user releases a key, after processing `QueryList`'s own key events
    * (enter to select active item). This callback is passed to `renderer` and (along with
    * `onKeyDown`) can be attached to arbitrary content elements to support keyboard selection.
    */
  var onKeyUp: js.UndefOr[reactLib.reactMod.ReactNs.KeyboardEventHandler[stdLib.HTMLElement]] = js.native
  /**
    * Customize rendering of the component.
    * Receives an object with props that should be applied to elements as necessary.
    */
  def renderer(listProps: IQueryListRendererProps[T]): reactLib.reactMod.Global.JSXNs.Element = js.native
}

