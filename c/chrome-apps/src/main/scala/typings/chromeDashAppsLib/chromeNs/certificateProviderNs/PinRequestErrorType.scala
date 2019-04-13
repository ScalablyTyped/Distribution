package typings
package chromeDashAppsLib.chromeNs.certificateProviderNs

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
  var INVALID_PIN: chromeDashAppsLib.chromeDashAppsLibStrings.INVALID_PIN = js.native
  var INVALID_PUK: chromeDashAppsLib.chromeDashAppsLibStrings.INVALID_PUK = js.native
  var MAX_ATTEMPTS_EXCEEDED: chromeDashAppsLib.chromeDashAppsLibStrings.MAX_ATTEMPTS_EXCEEDED = js.native
  var UNKNOWN_ERROR: chromeDashAppsLib.chromeDashAppsLibStrings.UNKNOWN_ERROR = js.native
}

