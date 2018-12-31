package typings
package chromeLib.chromeNs.tabsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabRemoveInfo extends js.Object {
  /** True when the tab is being closed because its window is being closed. */
  var isWindowClosing: scala.Boolean
  /**
    * The window whose tab is closed.
    * @since Chrome 25.
    */
  var windowId: scala.Double
}

