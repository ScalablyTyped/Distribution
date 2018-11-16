package typings
package chromeDashAppsLib.WebViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextMenus extends js.Object {
  /**
           * Fired before showing a context menu on this webview.
           * Can be used to disable this context menu by calling event.preventDefault().
           */
  var onShow: chromeDashAppsLib.chromeNs.eventsNs.Event[js.Function1[/* event */ OnShowEvent, scala.Unit]] = js.native
  /**
           * Creates a new context menu item. Note that if an error occurs during creation,
           * you may not find out until the creation callback fires
           * (the details will be in chrome.runtime.lastError).
           * @param createProperties The properties used to create the item
           * @param [callback]
           */
  def create(createProperties: js.Object): scala.Unit = js.native
  /**
           * Creates a new context menu item. Note that if an error occurs during creation,
           * you may not find out until the creation callback fires
           * (the details will be in chrome.runtime.lastError).
           * @param createProperties The properties used to create the item
           * @param [callback]
           */
  def create(createProperties: js.Object, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
           * Removes a context menu item.
           * @param menuItemId The ID of the context menu item to remove.
           * @param [callback]
           */
  def remove(menuItemId: chromeDashAppsLib.chromeNs.integer): scala.Unit = js.native
  /**
           * Removes a context menu item.
           * @param menuItemId The ID of the context menu item to remove.
           * @param [callback]
           */
  def remove(menuItemId: chromeDashAppsLib.chromeNs.integer, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
           * Removes a context menu item.
           * @param menuItemId The ID of the context menu item to remove.
           * @param [callback]
           */
  def remove(menuItemId: java.lang.String): scala.Unit = js.native
  /**
           * Removes a context menu item.
           * @param menuItemId The ID of the context menu item to remove.
           * @param [callback]
           */
  def remove(menuItemId: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
           * Removes all context menu items added to this webview.
           * @param [callback]
           */
  def removeAll(): scala.Unit = js.native
  /**
           * Removes all context menu items added to this webview.
           * @param [callback]
           */
  def removeAll(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
           * Updates a previously created context menu item.
           * @param id The ID of the item to update.
           * @param updateProperties The properties to update. Accepts the same values as the create function.
           * @param [callback]
           */
  def update(id: chromeDashAppsLib.chromeNs.integer, updateProperties: js.Object): scala.Unit = js.native
  /**
           * Updates a previously created context menu item.
           * @param id The ID of the item to update.
           * @param updateProperties The properties to update. Accepts the same values as the create function.
           * @param [callback]
           */
  def update(
    id: chromeDashAppsLib.chromeNs.integer,
    updateProperties: js.Object,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  /**
           * Updates a previously created context menu item.
           * @param id The ID of the item to update.
           * @param updateProperties The properties to update. Accepts the same values as the create function.
           * @param [callback]
           */
  def update(id: java.lang.String, updateProperties: js.Object): scala.Unit = js.native
  /**
           * Updates a previously created context menu item.
           * @param id The ID of the item to update.
           * @param updateProperties The properties to update. Accepts the same values as the create function.
           * @param [callback]
           */
  def update(id: java.lang.String, updateProperties: js.Object, callback: js.Function0[scala.Unit]): scala.Unit = js.native
}

