package typings.chromeDashApps.chrome.syncFileSystem

import typings.chromeDashApps.Anon_AUTHENTICATIONREQUIRED
import typings.chromeDashApps.chrome.ToStringLiteral
import typings.chromeDashApps.chromeDashAppsStrings.authentication_required
import typings.chromeDashApps.chromeDashAppsStrings.disabled_
import typings.chromeDashApps.chromeDashAppsStrings.initializing
import typings.chromeDashApps.chromeDashAppsStrings.running
import typings.chromeDashApps.chromeDashAppsStrings.temporary_unavailable
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.syncFileSystem.getServiceStatus")
@js.native
object getServiceStatus extends js.Object {
  /**
    * Returns the current sync backend status.
    * @since Chrome 31.
    * @param callback
    * @see ServiceStatus
    */
  def apply(
    callback: js.Function1[
      /* status */ ToStringLiteral[
        Anon_AUTHENTICATIONREQUIRED, 
        String, 
        Exclude[
          String, 
          initializing | running | temporary_unavailable | authentication_required | disabled_
        ]
      ], 
      Unit
    ]
  ): Unit = js.native
}

