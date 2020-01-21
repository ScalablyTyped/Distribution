package typings.chromeApps.chrome.system.display

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.system.display.setDisplayProperties")
@js.native
object setDisplayProperties extends js.Object {
  /**
    * @requires(CrOS Kiosk apps | WebUI) This is only available to Chrome OS Kiosk apps and Web UI.
    * @description
    * Updates the properties for the display specified by **id**,
    * according to the information provided in **info**.
    * On failure, runtime.lastError will be set.
    * @param {string} id The display's unique identifier.
    * @param {DisplayPropertiesInfo} info The information about display properties that should be changed. A property will be changed only if a new value for it is specified in |info|.
    * @param {() => void} [callback] Empty function called when the function finishes. To find out whether the function succeeded, runtime.lastError should be queried.
    */
  def apply(id: String, info: DisplayPropertiesInfo): Unit = js.native
  def apply(id: String, info: DisplayPropertiesInfo, callback: js.Function0[Unit]): Unit = js.native
}

