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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
object contextMenus {
  
  @JSGlobal("chrome.contextMenus")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @since Chrome 38.
    * @default 6
    * @description
    * The maximum number of top level extension items that
    * can be added to an app's action context menu.
    * Any items beyond this limit will be ignored.
    */
  @JSGlobal("chrome.contextMenus.ACTION_MENU_TOP_LEVEL_LIMIT")
  @js.native
  val ACTION_MENU_TOP_LEVEL_LIMIT: integer = js.native
  
  /**
    * The different contexts a menu can appear in.
    * Specifying 'all' is equivalent to the combination of all other contexts except for 'launcher'.
    * The 'launcher' context is only supported by apps and is used to add menu items to the context menu that appears when clicking on the app icon in the launcher/taskbar/dock/etc.
    * Different platforms might put limitations on what is actually supported in a launcher context menu.
    **/
  object ContextType {
    
    @JSGlobal("chrome.contextMenus.ContextType")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("chrome.contextMenus.ContextType.ALL")
    @js.native
    def ALL: all__ = js.native
    @scala.inline
    def ALL_=(x: all__): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALL")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.contextMenus.ContextType.AUDIO")
    @js.native
    def AUDIO: audio_ = js.native
    @scala.inline
    def AUDIO_=(x: audio_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUDIO")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.contextMenus.ContextType.BROWSER_ACTION")
    @js.native
    def BROWSER_ACTION: browser_action_ = js.native
    @scala.inline
    def BROWSER_ACTION_=(x: browser_action_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BROWSER_ACTION")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.contextMenus.ContextType.EDITABLE")
    @js.native
    def EDITABLE: editable_ = js.native
    @scala.inline
    def EDITABLE_=(x: editable_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EDITABLE")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.contextMenus.ContextType.FRAME")
    @js.native
    def FRAME: frame_ = js.native
    @scala.inline
    def FRAME_=(x: frame_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FRAME")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.contextMenus.ContextType.IMAGE")
    @js.native
    def IMAGE: image_ = js.native
    @scala.inline
    def IMAGE_=(x: image_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IMAGE")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.contextMenus.ContextType.LAUNCHER")
    @js.native
    def LAUNCHER: launcher_ = js.native
    @scala.inline
    def LAUNCHER_=(x: launcher_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LAUNCHER")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.contextMenus.ContextType.LINK")
    @js.native
    def LINK: link_ = js.native
    @scala.inline
    def LINK_=(x: link_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LINK")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.contextMenus.ContextType.PAGE")
    @js.native
    def PAGE: page_ = js.native
    @scala.inline
    def PAGE_=(x: page_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PAGE")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.contextMenus.ContextType.PAGE_ACTION")
    @js.native
    def PAGE_ACTION: page_action_ = js.native
    @scala.inline
    def PAGE_ACTION_=(x: page_action_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PAGE_ACTION")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.contextMenus.ContextType.SELECTION")
    @js.native
    def SELECTION: selection_ = js.native
    @scala.inline
    def SELECTION_=(x: selection_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SELECTION")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.contextMenus.ContextType.VIDEO")
    @js.native
    def VIDEO: video_ = js.native
    @scala.inline
    def VIDEO_=(x: video_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VIDEO")(x.asInstanceOf[js.Any])
  }
  
  /**
    * The type of menu item.
    **/
  object ItemType {
    
    @JSGlobal("chrome.contextMenus.ItemType")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("chrome.contextMenus.ItemType.CHECKBOX")
    @js.native
    def CHECKBOX: checkbox_ = js.native
    @scala.inline
    def CHECKBOX_=(x: checkbox_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CHECKBOX")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.contextMenus.ItemType.NORMAL")
    @js.native
    def NORMAL: normal_ = js.native
    @scala.inline
    def NORMAL_=(x: normal_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NORMAL")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.contextMenus.ItemType.RADIO")
    @js.native
    def RADIO: radio_ = js.native
    @scala.inline
    def RADIO_=(x: radio_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RADIO")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.contextMenus.ItemType.SEPARATOR")
    @js.native
    def SEPARATOR: separator_ = js.native
    @scala.inline
    def SEPARATOR_=(x: separator_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SEPARATOR")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Creates a new context menu item. Note that if an error occurs during creation, you may not find out until the creation callback fires (the details will be in chrome.runtime.lastError).
    * @param callback Called when the item has been created in the browser. If there were any problems creating the item, details will be available in chrome.runtime.lastError.
    */
  @scala.inline
  def create(createProperties: CreateProperties): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(createProperties.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def create(createProperties: CreateProperties, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(createProperties.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** Fired when a context menu item is clicked. */
  @JSGlobal("chrome.contextMenus.onClicked")
  @js.native
  val onClicked: MenuClickedEvent = js.native
  
  @scala.inline
  def remove(menuItemId: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(menuItemId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def remove(menuItemId: String, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(menuItemId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    * Removes a context menu item.
    * @param menuItemId The ID of the context menu item to remove.
    * @param callback Called when the context menu has been removed.
    */
  @scala.inline
  def remove(menuItemId: integer): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(menuItemId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def remove(menuItemId: integer, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(menuItemId.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Removes all context menu items added by this app.
    * @param callback Called when removal is complete.
    */
  @scala.inline
  def removeAll(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAll")().asInstanceOf[Unit]
  @scala.inline
  def removeAll(callback: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAll")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def update(id: String, updateProperties: UpdateProperties): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(id.asInstanceOf[js.Any], updateProperties.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def update(id: String, updateProperties: UpdateProperties, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(id.asInstanceOf[js.Any], updateProperties.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    * Updates a previously created context menu item.
    * @param id The ID of the item to update.
    * @param updateProperties The properties to update. Accepts the same values as the create function.
    * @param callback Called when the context menu has been updated.
    */
  @scala.inline
  def update(id: integer, updateProperties: UpdateProperties): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(id.asInstanceOf[js.Any], updateProperties.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def update(id: integer, updateProperties: UpdateProperties, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(id.asInstanceOf[js.Any], updateProperties.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
