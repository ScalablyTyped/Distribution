package typings.chromeApps.chrome.networking.config

import typings.chromeApps.chromeAppsStrings.failed_
import typings.chromeApps.chromeAppsStrings.rejected_
import typings.chromeApps.chromeAppsStrings.succeeded_
import typings.chromeApps.chromeAppsStrings.unhandled_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Argument to finishAuthentication indicating the result of the captive portal authentication attempt.
  * **'unhandled':** - The extension does not handle this network or captive portal (e.g. server end-point not found or not compatible).
  * **'succeeded':** - The extension handled this network and authenticated successfully.
  * **'rejected':** - The extension handled this network, tried to authenticate, however was rejected by the server.
  * **'failed':** - The extension handled this network, tried to authenticate, however failed due to an unspecified error.
  */
@JSGlobal("chrome.networking.config.AuthenticationResult")
@js.native
object AuthenticationResult extends js.Object {
  var FAILED: failed_ = js.native
  var REJECTED: rejected_ = js.native
  var SUCCEEDED: succeeded_ = js.native
  var UNHANDLED: unhandled_ = js.native
}

