package typings.chromeDashApps.chrome.networking.config

import typings.chromeDashApps.Anon_FAILED
import typings.chromeDashApps.chrome.ToStringLiteral
import typings.chromeDashApps.chromeDashAppsStrings.failed_
import typings.chromeDashApps.chromeDashAppsStrings.rejected
import typings.chromeDashApps.chromeDashAppsStrings.succeeded
import typings.chromeDashApps.chromeDashAppsStrings.unhandled
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.networking.config.finishAuthentication")
@js.native
object finishAuthentication extends js.Object {
  /**
    * Called by the app to notify the network config API that it finished
    * a captive portal authentication attempt and hand over the result of the attempt.
    * This function must only be called with the GUID of the latest *onCaptivePortalDetected* event.
    * @param GUID Unique network identifier obtained from *onCaptivePortalDetected*.
    * @param result The result of the authentication attempt.
    * @param [callback] Called back when this operation is finished.
    */
  def apply(
    GUID: String,
    result: ToStringLiteral[Anon_FAILED, String, Exclude[String, unhandled | succeeded | rejected | failed_]]
  ): Unit = js.native
  def apply(
    GUID: String,
    result: ToStringLiteral[Anon_FAILED, String, Exclude[String, unhandled | succeeded | rejected | failed_]],
    callback: js.Function0[Unit]
  ): Unit = js.native
}

