package typings.chromeApps.chrome.certificateProvider

import typings.chromeApps.anon.INVALIDPIN
import typings.chromeApps.anon.PIN
import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chromeAppsStrings.INVALID_PIN
import typings.chromeApps.chromeAppsStrings.INVALID_PUK
import typings.chromeApps.chromeAppsStrings.MAX_ATTEMPTS_EXCEEDED
import typings.chromeApps.chromeAppsStrings.PUK
import typings.chromeApps.chromeAppsStrings.UNKNOWN_ERROR
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestPinDetails extends js.Object {
  
  /**
    * The number of attempts left. This is provided so that any UI can present
    * this information to the user. Chrome is not expected to enforce this,
    * instead stopPinRequest should be called by the app with
    * errorType = MAX_ATTEMPTS_EXCEEDED when the number of pin requests is
    * exceeded.
    */
  var attemptsLeft: js.UndefOr[Double] = js.native
  
  /**
    * The error template displayed to the user. This should be set if the
    * previous request failed, to notify the user of the failure reason.
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
    * The type of code requested. Default is PIN.
    * @see PinRequestType
    */
  var requestType: js.UndefOr[
    ToStringLiteral[
      PIN, 
      /* keyof chrome-apps.anon.PIN */ typings.chromeApps.chromeAppsStrings.PIN | PUK, 
      Exclude[
        /* keyof chrome-apps.anon.PIN */ typings.chromeApps.chromeAppsStrings.PIN | PUK, 
        typings.chromeApps.chromeAppsStrings.PIN | PUK
      ]
    ]
  ] = js.native
  
  /**
    * The ID given by Chrome in SignRequest.
    */
  var signRequestId: Double = js.native
}
object RequestPinDetails {
  
  @scala.inline
  def apply(signRequestId: Double): RequestPinDetails = {
    val __obj = js.Dynamic.literal(signRequestId = signRequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestPinDetails]
  }
  
  @scala.inline
  implicit class RequestPinDetailsOps[Self <: RequestPinDetails] (val x: Self) extends AnyVal {
    
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
    def setAttemptsLeft(value: Double): Self = this.set("attemptsLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttemptsLeft: Self = this.set("attemptsLeft", js.undefined)
    
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
    
    @scala.inline
    def setRequestType(
      value: ToStringLiteral[
          PIN, 
          /* keyof chrome-apps.anon.PIN */ typings.chromeApps.chromeAppsStrings.PIN | PUK, 
          Exclude[
            /* keyof chrome-apps.anon.PIN */ typings.chromeApps.chromeAppsStrings.PIN | PUK, 
            typings.chromeApps.chromeAppsStrings.PIN | PUK
          ]
        ]
    ): Self = this.set("requestType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestType: Self = this.set("requestType", js.undefined)
  }
}
