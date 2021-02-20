package typings.chrome.global.chrome

import typings.chrome.chrome.contextMenus.CreateProperties
import typings.chrome.chrome.contextMenus.MenuClickedEvent
import typings.chrome.chrome.contextMenus.UpdateProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Context Menus
////////////////////
/**
  * Use the chrome.contextMenus API to add items to Google Chrome's context menu. You can choose what types of objects your context menu additions apply to, such as images, hyperlinks, and pages.
  * Availability: Since Chrome 6.
  * Permissions:  "contextMenus"
  */
object contextMenus {
  
  @JSGlobal("chrome.contextMenus")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("chrome.contextMenus.ACTION_MENU_TOP_LEVEL_LIMIT")
  @js.native
  def ACTION_MENU_TOP_LEVEL_LIMIT: Double = js.native
  @scala.inline
  def ACTION_MENU_TOP_LEVEL_LIMIT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ACTION_MENU_TOP_LEVEL_LIMIT")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.contextMenus.create")
  @js.native
  def create(createProperties: CreateProperties): Unit = js.native
  @JSGlobal("chrome.contextMenus.create")
  @js.native
  def create(createProperties: CreateProperties, callback: js.Function0[Unit]): Unit = js.native
  
  @JSGlobal("chrome.contextMenus.onClicked")
  @js.native
  def onClicked: MenuClickedEvent = js.native
  @scala.inline
  def onClicked_=(x: MenuClickedEvent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClicked")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.contextMenus.remove")
  @js.native
  def remove(menuItemId: String): Unit = js.native
  @JSGlobal("chrome.contextMenus.remove")
  @js.native
  def remove(menuItemId: String, callback: js.Function0[Unit]): Unit = js.native
  @JSGlobal("chrome.contextMenus.remove")
  @js.native
  def remove(menuItemId: Double): Unit = js.native
  @JSGlobal("chrome.contextMenus.remove")
  @js.native
  def remove(menuItemId: Double, callback: js.Function0[Unit]): Unit = js.native
  
  @JSGlobal("chrome.contextMenus.removeAll")
  @js.native
  def removeAll(): Unit = js.native
  @JSGlobal("chrome.contextMenus.removeAll")
  @js.native
  def removeAll(callback: js.Function0[Unit]): Unit = js.native
  
  @JSGlobal("chrome.contextMenus.update")
  @js.native
  def update(id: String, updateProperties: UpdateProperties): Unit = js.native
  @JSGlobal("chrome.contextMenus.update")
  @js.native
  def update(id: String, updateProperties: UpdateProperties, callback: js.Function0[Unit]): Unit = js.native
  @JSGlobal("chrome.contextMenus.update")
  @js.native
  def update(id: Double, updateProperties: UpdateProperties): Unit = js.native
  @JSGlobal("chrome.contextMenus.update")
  @js.native
  def update(id: Double, updateProperties: UpdateProperties, callback: js.Function0[Unit]): Unit = js.native
}
