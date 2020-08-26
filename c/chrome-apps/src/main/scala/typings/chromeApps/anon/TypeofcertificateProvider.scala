package typings.chromeApps.anon

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

@js.native
trait TypeofcertificateProvider extends js.Object {
  /**
    * The types of errors that can be presented to the user through the requestPin function.
    * @enum
    */
  val PinRequestErrorType: INVALIDPIN = js.native
  /**
    * The type of code being requested by the extension with requestPin function.
    * @enum
    */
  val PinRequestType: PIN = js.native
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
  ] = js.native
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
  ] = js.native
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
  ): Unit = js.native
  /**
    * @description Stops the pin request started by the *requestPin* function.
    * @param details Contains the details about the reason for stopping the request flow.
    * @param callback To be used by Chrome to send to the app the status from
    * their request to close PIN dialog for user.
    */
  def stopPinRequest(details: StopRequestPinDetails, callback: js.Function0[Unit]): Unit = js.native
}

object TypeofcertificateProvider {
  @scala.inline
  def apply(
    PinRequestErrorType: INVALIDPIN,
    PinRequestType: PIN,
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
  @scala.inline
  implicit class TypeofcertificateProviderOps[Self <: TypeofcertificateProvider] (val x: Self) extends AnyVal {
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
    def setPinRequestErrorType(value: INVALIDPIN): Self = this.set("PinRequestErrorType", value.asInstanceOf[js.Any])
    @scala.inline
    def setPinRequestType(value: PIN): Self = this.set("PinRequestType", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnCertificatesRequested(
      value: Event[
          js.Function2[
            /* certificates */ js.Array[CertificateInfo], 
            /* callback */ js.Function1[/* rejectedCertificates */ js.Array[ArrayBuffer], Unit], 
            _
          ]
        ]
    ): Self = this.set("onCertificatesRequested", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnSignDigestRequested(
      value: Event[
          js.Function2[
            /* signRequest */ SignRequest, 
            /* signCallback */ js.Function1[/* signature */ js.UndefOr[ArrayBuffer], Unit], 
            _
          ]
        ]
    ): Self = this.set("onSignDigestRequested", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestPin(
      value: (RequestPinDetails, js.Function1[/* details */ js.UndefOr[PinResponseDetails], Unit]) => Unit
    ): Self = this.set("requestPin", js.Any.fromFunction2(value))
    @scala.inline
    def setStopPinRequest(value: (StopRequestPinDetails, js.Function0[Unit]) => Unit): Self = this.set("stopPinRequest", js.Any.fromFunction2(value))
  }
  
}

