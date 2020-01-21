package typings.chromeApps.chrome.networking.config

import typings.chromeApps.AnonFAILED
import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chromeAppsStrings.failed_
import typings.chromeApps.chromeAppsStrings.rejected
import typings.chromeApps.chromeAppsStrings.succeeded
import typings.chromeApps.chromeAppsStrings.unhandled
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
    result: ToStringLiteral[AnonFAILED, String, Exclude[String, unhandled | succeeded | rejected | failed_]]
  ): Unit = js.native
  def apply(
    GUID: String,
    result: ToStringLiteral[AnonFAILED, String, Exclude[String, unhandled | succeeded | rejected | failed_]],
    callback: js.Function0[Unit]
  ): Unit = js.native
}

