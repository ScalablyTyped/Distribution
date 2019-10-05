package typings.chromeDashApps.chrome.certificateProvider

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
  var INVALID_PIN: typings.chromeDashApps.chromeDashAppsStrings.INVALID_PIN = js.native
  var INVALID_PUK: typings.chromeDashApps.chromeDashAppsStrings.INVALID_PUK = js.native
  var MAX_ATTEMPTS_EXCEEDED: typings.chromeDashApps.chromeDashAppsStrings.MAX_ATTEMPTS_EXCEEDED = js.native
  var UNKNOWN_ERROR: typings.chromeDashApps.chromeDashAppsStrings.UNKNOWN_ERROR = js.native
}

