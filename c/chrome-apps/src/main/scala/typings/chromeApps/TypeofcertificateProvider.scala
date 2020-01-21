package typings.chromeApps

import typings.chromeApps.chrome.certificateProvider.CertificateInfo
import typings.chromeApps.chrome.certificateProvider.PinResponseDetails
import typings.chromeApps.chrome.certificateProvider.RequestPinDetails
import typings.chromeApps.chrome.certificateProvider.SignRequest
import typings.chromeApps.chrome.certificateProvider.StopRequestPinDetails
import typings.chromeApps.chrome.events.Event
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofcertificateProvider extends js.Object {
  /**
    * The types of errors that can be presented to the user through the requestPin function.
    * @enum
    */
  val PinRequestErrorType: AnonINVALIDPIN
  /**
    * The type of code being requested by the extension with requestPin function.
    * @enum
    */
  val PinRequestType: AnonPIN
  /**
    * This event fires every time the browser requests the current list of
    * certificates provided by this app. The app must call *reportCallback*
    * exactly once with the current list of certificates.
    */
  val onCertificatesRequested: Event[
    js.Function2[
      /* certificates */ js.Array[CertificateInfo], 
      /* callback */ js.Function1[/* rejectedCertificates */ js.Array[ArrayBuffer], Unit], 
      _
    ]
  ]
  /**
    * This event fires every time the browser needs to sign
    * a message using a certificate provided by this app
    * in reply to an *onCertificatesRequested* event.
    *
    * The app must sign the data in *request* using the
    * appropriate algorithm and private key and return it by calling
    * *reportCallback*. *reportCallback* must be called exactly once.
    * @param request: Contains the details about the sign request.
    */
  val onSignDigestRequested: Event[
    js.Function2[
      /* signRequest */ SignRequest, 
      /* signCallback */ js.Function1[/* signature */ js.UndefOr[ArrayBuffer], Unit], 
      _
    ]
  ]
  /**
    * Requests the PIN from the user. Only one ongoing request at a time is
    * allowed. The requests issued while another flow is ongoing are rejected.
    * It's the apps's responsibility to try again later if another flow is
    * in progress.
    * @param details Contains the details about the requested dialog.
    * @param callback Is called when the dialog is resolved with the user input, or
    * when the dialog request finishes unsuccessfully (e.g. the dialog was
    * canceled by the user or was not allowed to be shown).
    */
  def requestPin(
    details: RequestPinDetails,
    callback: js.Function1[/* details */ js.UndefOr[PinResponseDetails], Unit]
  ): Unit
  /**
    * @description Stops the pin request started by the *requestPin* function.
    * @param details Contains the details about the reason for stopping the request flow.
    * @param callback To be used by Chrome to send to the app the status from
    * their request to close PIN dialog for user.
    */
  def stopPinRequest(details: StopRequestPinDetails, callback: js.Function0[Unit]): Unit
}

object TypeofcertificateProvider {
  @scala.inline
  def apply(
    PinRequestErrorType: AnonINVALIDPIN,
    PinRequestType: AnonPIN,
    onCertificatesRequested: Event[
      js.Function2[
        /* certificates */ js.Array[CertificateInfo], 
        /* callback */ js.Function1[/* rejectedCertificates */ js.Array[ArrayBuffer], Unit], 
        _
      ]
    ],
    onSignDigestRequested: Event[
      js.Function2[
        /* signRequest */ SignRequest, 
        /* signCallback */ js.Function1[/* signature */ js.UndefOr[ArrayBuffer], Unit], 
        _
      ]
    ],
    requestPin: (RequestPinDetails, js.Function1[/* details */ js.UndefOr[PinResponseDetails], Unit]) => Unit,
    stopPinRequest: (StopRequestPinDetails, js.Function0[Unit]) => Unit
  ): TypeofcertificateProvider = {
    val __obj = js.Dynamic.literal(PinRequestErrorType = PinRequestErrorType.asInstanceOf[js.Any], PinRequestType = PinRequestType.asInstanceOf[js.Any], onCertificatesRequested = onCertificatesRequested.asInstanceOf[js.Any], onSignDigestRequested = onSignDigestRequested.asInstanceOf[js.Any], requestPin = js.Any.fromFunction2(requestPin), stopPinRequest = js.Any.fromFunction2(stopPinRequest))
  
    __obj.asInstanceOf[TypeofcertificateProvider]
  }
}

