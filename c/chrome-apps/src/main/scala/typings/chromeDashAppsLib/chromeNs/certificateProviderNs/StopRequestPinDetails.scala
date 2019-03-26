package typings
package chromeDashAppsLib.chromeNs.certificateProviderNs

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
    chromeDashAppsLib.chromeNs.ToStringLiteral[
      chromeDashAppsLib.Anon_INVALIDPIN, 
      java.lang.String, 
      stdLib.Exclude[
        java.lang.String, 
        chromeDashAppsLib.chromeDashAppsLibStrings.INVALID_PIN | chromeDashAppsLib.chromeDashAppsLibStrings.INVALID_PUK | chromeDashAppsLib.chromeDashAppsLibStrings.MAX_ATTEMPTS_EXCEEDED | chromeDashAppsLib.chromeDashAppsLibStrings.UNKNOWN_ERROR
      ]
    ]
  ] = js.undefined
  /**
    * The ID given by Chrome in SignRequest
    */
  var signRequestId: scala.Double
}

object StopRequestPinDetails {
  @scala.inline
  def apply(
    signRequestId: scala.Double,
    errorType: chromeDashAppsLib.chromeNs.ToStringLiteral[
      chromeDashAppsLib.Anon_INVALIDPIN, 
      java.lang.String, 
      stdLib.Exclude[
        java.lang.String, 
        chromeDashAppsLib.chromeDashAppsLibStrings.INVALID_PIN | chromeDashAppsLib.chromeDashAppsLibStrings.INVALID_PUK | chromeDashAppsLib.chromeDashAppsLibStrings.MAX_ATTEMPTS_EXCEEDED | chromeDashAppsLib.chromeDashAppsLibStrings.UNKNOWN_ERROR
      ]
    ] = null
  ): StopRequestPinDetails = {
    val __obj = js.Dynamic.literal(signRequestId = signRequestId)
    if (errorType != null) __obj.updateDynamic("errorType")(errorType.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopRequestPinDetails]
  }
}

