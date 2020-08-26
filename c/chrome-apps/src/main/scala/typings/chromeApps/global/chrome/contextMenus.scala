package typings.chromeApps.global.chrome

import typings.chromeApps.chrome.contextMenus.CreateProperties
import typings.chromeApps.chrome.contextMenus.MenuClickedEvent
import typings.chromeApps.chrome.contextMenus.UpdateProperties
import typings.chromeApps.chrome.integer
import typings.chromeApps.chromeAppsStrings.all__
import typings.chromeApps.chromeAppsStrings.audio_
import typings.chromeApps.chromeAppsStrings.browser_action_
import typings.chromeApps.chromeAppsStrings.checkbox_
import typings.chromeApps.chromeAppsStrings.editable_
import typings.chromeApps.chromeAppsStrings.frame_
import typings.chromeApps.chromeAppsStrings.image_
import typings.chromeApps.chromeAppsStrings.launcher_
import typings.chromeApps.chromeAppsStrings.link_
import typings.chromeApps.chromeAppsStrings.normal_
import typings.chromeApps.chromeAppsStrings.page_
import typings.chromeApps.chromeAppsStrings.page_action_
import typings.chromeApps.chromeAppsStrings.radio_
import typings.chromeApps.chromeAppsStrings.selection_
import typings.chromeApps.chromeAppsStrings.separator_
import typings.chromeApps.chromeAppsStrings.video_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// #region chrome.contextMenus
///////////////////
// Context Menus //
///////////////////
/**
  * @since Chrome 24.
  * @requires Permissions: 'contextMenus'
  * @description
  * Use the chrome.contextMenus API to add items to Google Chrome's context menu.
  * You can choose what types of objects your context menu additions apply to,
  * such as images, hyperlinks, and pages.
  *
  * Context menu items can appear in any document (or frame within a document),
  * even those with file:// or chrome:// URLs. To control which documents your
  * items can appear in, specify the documentUrlPatterns field when you call the
  * create() or update() method.
  *
  * You can create as many context menu items as you need,
  * but if more than one from your app is visible at once,
  * Google Chrome automatically collapses them into a single parent menu.
  */
@JSGlobal("chrome.contextMenus")
@js.native
object contextMenus extends js.Object {
  /**
    * @since Chrome 38.
    * @default 6
    * @description
    * The maximum number of top level extension items that
    * can be added to an app's action context menu.
    * Any items beyond this limit will be ignored.
    */
  val ACTION_MENU_TOP_LEVEL_LIMIT: integer = js.native
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
  /**
    * The different contexts a menu can appear in.
    * Specifying 'all' is equivalent to the combination of all other contexts except for 'launcher'.
    * The 'launcher' context is only supported by apps and is used to add menu items to the context menu that appears when clicking on the app icon in the launcher/taskbar/dock/etc.
    * Different platforms might put limitations on what is actually supported in a launcher context menu.
    **/
  @js.native
  object ContextType extends js.Object {
    var ALL: all__ = js.native
    var AUDIO: audio_ = js.native
    var BROWSER_ACTION: browser_action_ = js.native
    var EDITABLE: editable_ = js.native
    var FRAME: frame_ = js.native
    var IMAGE: image_ = js.native
    var LAUNCHER: launcher_ = js.native
    var LINK: link_ = js.native
    var PAGE: page_ = js.native
    var PAGE_ACTION: page_action_ = js.native
    var SELECTION: selection_ = js.native
    var VIDEO: video_ = js.native
  }
  
  /**
    * The type of menu item.
    **/
  @js.native
  object ItemType extends js.Object {
    var CHECKBOX: checkbox_ = js.native
    var NORMAL: normal_ = js.native
    var RADIO: radio_ = js.native
    var SEPARATOR: separator_ = js.native
  }
  
}

