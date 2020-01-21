package typings.bootstrapMenu.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapMenu extends js.Object {
  /**
    * Close the context menu
    */
  def close(): Unit
  /**
    * Close the menu and remove every event listeners
    */
  def destroy(): Unit
}

object BootstrapMenu {
  @scala.inline
  def apply(close: () => Unit, destroy: () => Unit): BootstrapMenu = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), destroy = js.Any.fromFunction0(destroy))
  
    __obj.asInstanceOf[BootstrapMenu]
  }
}

