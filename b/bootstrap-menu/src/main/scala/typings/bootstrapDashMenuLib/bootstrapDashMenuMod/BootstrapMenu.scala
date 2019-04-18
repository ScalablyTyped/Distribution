package typings
package bootstrapDashMenuLib.bootstrapDashMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapMenu extends js.Object {
  /**
    * Close the context menu
    */
  def close(): scala.Unit
  /**
    * Close the menu and remove every event listeners
    */
  def destroy(): scala.Unit
}

object BootstrapMenu {
  @scala.inline
  def apply(close: () => scala.Unit, destroy: () => scala.Unit): BootstrapMenu = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), destroy = js.Any.fromFunction0(destroy))
  
    __obj.asInstanceOf[BootstrapMenu]
  }
}

