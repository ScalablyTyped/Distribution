package typings.chromeApps.chrome.certificateProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The types of errors that can be presented to the user through the requestPin function.
  * @enum
  */
@JSGlobal("chrome.certificateProvider.PinRequestErrorType")
@js.native
object PinRequestErrorType extends js.Object {
  var INVALID_PIN: typings.chromeApps.chromeAppsStrings.INVALID_PIN = js.native
  var INVALID_PUK: typings.chromeApps.chromeAppsStrings.INVALID_PUK = js.native
  var MAX_ATTEMPTS_EXCEEDED: typings.chromeApps.chromeAppsStrings.MAX_ATTEMPTS_EXCEEDED = js.native
  var UNKNOWN_ERROR: typings.chromeApps.chromeAppsStrings.UNKNOWN_ERROR = js.native
}

