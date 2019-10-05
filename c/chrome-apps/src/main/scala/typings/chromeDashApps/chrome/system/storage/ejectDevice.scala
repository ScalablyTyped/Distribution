package typings.chromeDashApps.chrome.system.storage

import typings.chromeDashApps.Anon_FAILURE
import typings.chromeDashApps.chrome.ToStringLiteral
import typings.chromeDashApps.chromeDashAppsStrings.failure
import typings.chromeDashApps.chromeDashAppsStrings.in_use
import typings.chromeDashApps.chromeDashAppsStrings.no_such_device
import typings.chromeDashApps.chromeDashAppsStrings.success
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
      /* result */ ToStringLiteral[Anon_FAILURE, String, Exclude[String, success | in_use | no_such_device | failure]], 
      Unit
    ]
  ): Unit = js.native
}

