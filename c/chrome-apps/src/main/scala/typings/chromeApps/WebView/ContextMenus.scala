package typings.chromeApps.WebView

import typings.chromeApps.chrome.events.Event
import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContextMenus extends js.Object {
  
  /**
    * Creates a new context menu item. Note that if an error occurs during creation,
    * you may not find out until the creation callback fires
    * (the details will be in chrome.runtime.lastError).
    * @param createProperties The properties used to create the item
    * @param [callback]
    */
  def create(createProperties: js.Object): Unit = js.native
  def create(createProperties: js.Object, callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * Fired before showing a context menu on this webview.
    * Can be used to disable this context menu by calling event.preventDefault().
    */
  var onShow: Event[js.Function1[/* event */ OnShowEvent, Unit]] = js.native
  
  def remove(menuItemId: String): Unit = js.native
  def remove(menuItemId: String, callback: js.Function0[Unit]): Unit = js.native
  /**
    * Removes a context menu item.
    * @param menuItemId The ID of the context menu item to remove.
    * @param [callback]
    */
  def remove(menuItemId: integer): Unit = js.native
  def remove(menuItemId: integer, callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * Removes all context menu items added to this webview.
    * @param [callback]
    */
  def removeAll(): Unit = js.native
  def removeAll(callback: js.Function0[Unit]): Unit = js.native
  
  def update(id: String, updateProperties: js.Object): Unit = js.native
  def update(id: String, updateProperties: js.Object, callback: js.Function0[Unit]): Unit = js.native
  /**
    * Updates a previously created context menu item.
    * @param id The ID of the item to update.
    * @param updateProperties The properties to update. Accepts the same values as the create function.
    * @param [callback]
    */
  def update(id: integer, updateProperties: js.Object): Unit = js.native
  def update(id: integer, updateProperties: js.Object, callback: js.Function0[Unit]): Unit = js.native
}
