package typings
package atBlueprintjsSelectLib.libEsmCommonItemRendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IItemRendererProps extends js.Object {
  /** Click event handler to select this item. */
  @JSName("handleClick")
  var handleClick_Original: reactLib.reactMod.ReactNs.MouseEventHandler[reactLib.HTMLElement] = js.native
  var index: js.UndefOr[scala.Double] = js.native
  /** Modifiers that describe how to render this item, such as `active` or `disabled`. */
  var modifiers: IItemModifiers = js.native
  /** The current query string used to filter the items. */
  var query: java.lang.String = js.native
  /** Click event handler to select this item. */
  def handleClick(event: reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLElement, reactLib.NativeMouseEvent]): scala.Unit = js.native
}

