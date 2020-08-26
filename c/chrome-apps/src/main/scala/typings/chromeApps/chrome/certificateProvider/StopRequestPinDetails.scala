package typings.chromeApps.chrome.certificateProvider

import typings.chromeApps.anon.INVALIDPIN
import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chromeAppsStrings.INVALID_PIN
import typings.chromeApps.chromeAppsStrings.INVALID_PUK
import typings.chromeApps.chromeAppsStrings.MAX_ATTEMPTS_EXCEEDED
import typings.chromeApps.chromeAppsStrings.UNKNOWN_ERROR
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopRequestPinDetails extends js.Object {
  /**
    * The error template. If present it is displayed to user. Intended to
    * contain the reason for stopping the flow if it was caused by an error,
    * e.g. MAX_ATTEMPTS_EXCEEDED.
    * @see PinRequestErrorType
    */
  var errorType: js.UndefOr[
    ToStringLiteral[
      INVALIDPIN, 
      /* keyof chrome-apps.anon.INVALIDPIN */ INVALID_PIN | INVALID_PUK | MAX_ATTEMPTS_EXCEEDED | UNKNOWN_ERROR, 
      Exclude[
        /* keyof chrome-apps.anon.INVALIDPIN */ INVALID_PIN | INVALID_PUK | MAX_ATTEMPTS_EXCEEDED | UNKNOWN_ERROR, 
        INVALID_PIN | INVALID_PUK | MAX_ATTEMPTS_EXCEEDED | UNKNOWN_ERROR
      ]
    ]
  ] = js.native
  /**
    * The ID given by Chrome in SignRequest
    */
  var signRequestId: Double = js.native
}

object StopRequestPinDetails {
  @scala.inline
  def apply(signRequestId: Double): StopRequestPinDetails = {
    val __obj = js.Dynamic.literal(signRequestId = signRequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopRequestPinDetails]
  }
  @scala.inline
  implicit class StopRequestPinDetailsOps[Self <: StopRequestPinDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSignRequestId(value: Double): Self = this.set("signRequestId", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorType(
      value: ToStringLiteral[
          INVALIDPIN, 
          /* keyof chrome-apps.anon.INVALIDPIN */ INVALID_PIN | INVALID_PUK | MAX_ATTEMPTS_EXCEEDED | UNKNOWN_ERROR, 
          Exclude[
            /* keyof chrome-apps.anon.INVALIDPIN */ INVALID_PIN | INVALID_PUK | MAX_ATTEMPTS_EXCEEDED | UNKNOWN_ERROR, 
            INVALID_PIN | INVALID_PUK | MAX_ATTEMPTS_EXCEEDED | UNKNOWN_ERROR
          ]
        ]
    ): Self = this.set("errorType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorType: Self = this.set("errorType", js.undefined)
  }
  
}

