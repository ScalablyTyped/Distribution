package typings.chromeApps.chrome.contextMenus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.contextMenus.create")
@js.native
object create extends js.Object {
  /**
    * Creates a new context menu item. Note that if an error occurs during creation, you may not find out until the creation callback fires (the details will be in chrome.runtime.lastError).
    * @param callback Called when the item has been created in the browser. If there were any problems creating the item, details will be available in chrome.runtime.lastError.
    */
  def apply(createProperties: CreateProperties): Unit = js.native
  def apply(createProperties: CreateProperties, callback: js.Function0[Unit]): Unit = js.native
}

