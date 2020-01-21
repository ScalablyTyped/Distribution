package typings.chromeApps.chrome.system.storage

import typings.chromeApps.AnonFAILURE
import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chromeAppsStrings.failure
import typings.chromeApps.chromeAppsStrings.in_use_
import typings.chromeApps.chromeAppsStrings.no_such_device
import typings.chromeApps.chromeAppsStrings.success
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.system.storage.ejectDevice")
@js.native
object ejectDevice extends js.Object {
  /**
    * Ejects a removable storage device.
    * @param callback
    * Parameter **result**:
    *
    * **success:** The ejection command is successful -- the application can prompt the user to remove the device;
    *
    * **in_use:** The device is in use by another application. The ejection did not succeed;
    *   the user should not remove the device until the other application is done with the device;
    *
    * **no_such_device:** There is no such device known.
    *
    * **failure:** The ejection command failed.
    */
  def apply(
    id: String,
    callback: js.Function1[
      /* result */ ToStringLiteral[AnonFAILURE, String, Exclude[String, success | in_use_ | no_such_device | failure]], 
      Unit
    ]
  ): Unit = js.native
}

