package typings.chromeDashApps.chrome.certificateProvider

import typings.chromeDashApps.Anon_INVALIDPIN
import typings.chromeDashApps.chrome.ToStringLiteral
import typings.chromeDashApps.chromeDashAppsStrings.INVALID_PIN
import typings.chromeDashApps.chromeDashAppsStrings.INVALID_PUK
import typings.chromeDashApps.chromeDashAppsStrings.MAX_ATTEMPTS_EXCEEDED
import typings.chromeDashApps.chromeDashAppsStrings.UNKNOWN_ERROR
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopRequestPinDetails extends js.Object {
  /**
    * The error template. If present it is displayed to user. Intended to
    * contain the reason for stopping the flow if it was caused by an error,
    * e.g. MAX_ATTEMPTS_EXCEEDED.
    * @see PinRequestErrorType
    */
  var errorType: js.UndefOr[
    ToStringLiteral[
      Anon_INVALIDPIN, 
      String, 
      Exclude[String, INVALID_PIN | INVALID_PUK | MAX_ATTEMPTS_EXCEEDED | UNKNOWN_ERROR]
    ]
  ] = js.undefined
  /**
    * The ID given by Chrome in SignRequest
    */
  var signRequestId: Double
}

object StopRequestPinDetails {
  @scala.inline
  def apply(
    signRequestId: Double,
    errorType: ToStringLiteral[
      Anon_INVALIDPIN, 
      String, 
      Exclude[String, INVALID_PIN | INVALID_PUK | MAX_ATTEMPTS_EXCEEDED | UNKNOWN_ERROR]
    ] = null
  ): StopRequestPinDetails = {
    val __obj = js.Dynamic.literal(signRequestId = signRequestId)
    if (errorType != null) __obj.updateDynamic("errorType")(errorType.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopRequestPinDetails]
  }
}

