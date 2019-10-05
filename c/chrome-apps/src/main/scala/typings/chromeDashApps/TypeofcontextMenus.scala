package typings.chromeDashApps

import typings.chromeDashApps.chrome.contextMenus.CreateProperties
import typings.chromeDashApps.chrome.contextMenus.MenuClickedEvent
import typings.chromeDashApps.chrome.contextMenus.UpdateProperties
import typings.chromeDashApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofcontextMenus extends js.Object {
  /**
    * @since Chrome 38.
    * @default 6
    * @description
    * The maximum number of top level extension items that
    * can be added to an app's action context menu.
    * Any items beyond this limit will be ignored.
    */
  val ACTION_MENU_TOP_LEVEL_LIMIT: integer = js.native
  /**
    * The different contexts a menu can appear in.
    * Specifying 'all' is equivalent to the combination of all other contexts except for 'launcher'.
    * The 'launcher' context is only supported by apps and is used to add menu items to the context menu that appears when clicking on the app icon in the launcher/taskbar/dock/etc.
    * Different platforms might put limitations on what is actually supported in a launcher context menu.
    **/
  val ContextType: Anon_ALL = js.native
  /**
    * The type of menu item.
    **/
  val ItemType: Anon_CHECKBOX = js.native
  /** Fired when a context menu item is clicked. */
  val onClicked: MenuClickedEvent = js.native
  /**
    * Creates a new context menu item. Note that if an error occurs during creation, you may not find out until the creation callback fires (the details will be in chrome.runtime.lastError).
    * @param callback Called when the item has been created in the browser. If there were any problems creating the item, details will be available in chrome.runtime.lastError.
    */
  def create(createProperties: CreateProperties): Unit = js.native
  def create(createProperties: CreateProperties, callback: js.Function0[Unit]): Unit = js.native
  def remove(menuItemId: String): Unit = js.native
  def remove(menuItemId: String, callback: js.Function0[Unit]): Unit = js.native
  /**
    * Removes a context menu item.
    * @param menuItemId The ID of the context menu item to remove.
    * @param callback Called when the context menu has been removed.
    */
  def remove(menuItemId: integer): Unit = js.native
  def remove(menuItemId: integer, callback: js.Function0[Unit]): Unit = js.native
  /**
    * Removes all context menu items added by this app.
    * @param callback Called when removal is complete.
    */
  def removeAll(): Unit = js.native
  def removeAll(callback: js.Function0[Unit]): Unit = js.native
  def update(id: String, updateProperties: UpdateProperties): Unit = js.native
  def update(id: String, updateProperties: UpdateProperties, callback: js.Function0[Unit]): Unit = js.native
  /**
    * Updates a previously created context menu item.
    * @param id The ID of the item to update.
    * @param updateProperties The properties to update. Accepts the same values as the create function.
    * @param callback Called when the context menu has been updated.
    */
  def update(id: integer, updateProperties: UpdateProperties): Unit = js.native
  def update(id: integer, updateProperties: UpdateProperties, callback: js.Function0[Unit]): Unit = js.native
}

