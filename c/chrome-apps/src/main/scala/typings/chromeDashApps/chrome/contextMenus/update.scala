package typings.chromeDashApps.chrome.contextMenus

import typings.chromeDashApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.contextMenus.update")
@js.native
object update extends js.Object {
  def apply(id: String, updateProperties: UpdateProperties): Unit = js.native
  def apply(id: String, updateProperties: UpdateProperties, callback: js.Function0[Unit]): Unit = js.native
  /**
    * Updates a previously created context menu item.
    * @param id The ID of the item to update.
    * @param updateProperties The properties to update. Accepts the same values as the create function.
    * @param callback Called when the context menu has been updated.
    */
  def apply(id: integer, updateProperties: UpdateProperties): Unit = js.native
  def apply(id: integer, updateProperties: UpdateProperties, callback: js.Function0[Unit]): Unit = js.native
}

