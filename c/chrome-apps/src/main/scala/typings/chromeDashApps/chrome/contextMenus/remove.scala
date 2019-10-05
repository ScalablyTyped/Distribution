package typings.chromeDashApps.chrome.contextMenus

import typings.chromeDashApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.contextMenus.remove")
@js.native
object remove extends js.Object {
  def apply(menuItemId: String): Unit = js.native
  def apply(menuItemId: String, callback: js.Function0[Unit]): Unit = js.native
  /**
    * Removes a context menu item.
    * @param menuItemId The ID of the context menu item to remove.
    * @param callback Called when the context menu has been removed.
    */
  def apply(menuItemId: integer): Unit = js.native
  def apply(menuItemId: integer, callback: js.Function0[Unit]): Unit = js.native
}

