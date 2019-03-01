package typings
package chromeDashAppsLib.WebViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnShowEvent extends js.Object {
  /** Call this to prevent showing the context menu. */
  def preventDefault(): scala.Unit
}

object OnShowEvent {
  @scala.inline
  def apply(preventDefault: js.Function0[scala.Unit]): OnShowEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.asInstanceOf[OnShowEvent]
  }
}

