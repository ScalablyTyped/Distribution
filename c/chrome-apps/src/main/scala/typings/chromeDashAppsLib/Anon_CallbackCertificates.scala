package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CallbackCertificates extends js.Object {
  /**
    * The types of errors that can be presented to the user through the requestPin function.
    * @enum
    */
  val PinRequestErrorType: Anon_INVALIDPIN
  /**
    * The type of code being requested by the extension with requestPin function.
    * @enum
    */
  val PinRequestType: Anon_PIN
  /**
    * This event fires every time the browser requests the current list of
    * certificates provided by this app. The app must call *reportCallback*
    * exactly once with the current list of certificates.
    */
  val onCertificatesRequested: chromeDashAppsLib.chromeNs.eventsNs.Event[
    js.Function2[
      /* certificates */ js.Array[chromeDashAppsLib.chromeNs.certificateProviderNs.CertificateInfo], 
      /* callback */ js.Function1[/* rejectedCertificates */ js.Array[stdLib.ArrayBuffer], scala.Unit], 
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
  val onSignDigestRequested: chromeDashAppsLib.chromeNs.eventsNs.Event[
    js.Function2[
      /* signRequest */ chromeDashAppsLib.chromeNs.certificateProviderNs.SignRequest, 
      /* signCallback */ js.Function1[/* signature */ js.UndefOr[stdLib.ArrayBuffer], scala.Unit], 
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
    details: chromeDashAppsLib.chromeNs.certificateProviderNs.RequestPinDetails,
    callback: js.Function1[
      /* details */ js.UndefOr[chromeDashAppsLib.chromeNs.certificateProviderNs.PinResponseDetails], 
      scala.Unit
    ]
  ): scala.Unit
  /**
    * @description Stops the pin request started by the *requestPin* function.
    * @param details Contains the details about the reason for stopping the request flow.
    * @param callback To be used by Chrome to send to the app the status from
    * their request to close PIN dialog for user.
    */
  def stopPinRequest(
    details: chromeDashAppsLib.chromeNs.certificateProviderNs.StopRequestPinDetails,
    callback: js.Function0[scala.Unit]
  ): scala.Unit
}

object Anon_CallbackCertificates {
  @scala.inline
  def apply(
    PinRequestErrorType: Anon_INVALIDPIN,
    PinRequestType: Anon_PIN,
    onCertificatesRequested: chromeDashAppsLib.chromeNs.eventsNs.Event[
      js.Function2[
        /* certificates */ js.Array[chromeDashAppsLib.chromeNs.certificateProviderNs.CertificateInfo], 
        /* callback */ js.Function1[/* rejectedCertificates */ js.Array[stdLib.ArrayBuffer], scala.Unit], 
        _
      ]
    ],
    onSignDigestRequested: chromeDashAppsLib.chromeNs.eventsNs.Event[
      js.Function2[
        /* signRequest */ chromeDashAppsLib.chromeNs.certificateProviderNs.SignRequest, 
        /* signCallback */ js.Function1[/* signature */ js.UndefOr[stdLib.ArrayBuffer], scala.Unit], 
        _
      ]
    ],
    requestPin: js.Function2[
      chromeDashAppsLib.chromeNs.certificateProviderNs.RequestPinDetails, 
      js.Function1[
        /* details */ js.UndefOr[chromeDashAppsLib.chromeNs.certificateProviderNs.PinResponseDetails], 
        scala.Unit
      ], 
      scala.Unit
    ],
    stopPinRequest: js.Function2[
      chromeDashAppsLib.chromeNs.certificateProviderNs.StopRequestPinDetails, 
      js.Function0[scala.Unit], 
      scala.Unit
    ]
  ): Anon_CallbackCertificates = {
    val __obj = js.Dynamic.literal(PinRequestErrorType = PinRequestErrorType, PinRequestType = PinRequestType, onCertificatesRequested = onCertificatesRequested, onSignDigestRequested = onSignDigestRequested, requestPin = requestPin, stopPinRequest = stopPinRequest)
  
    __obj.asInstanceOf[Anon_CallbackCertificates]
  }
}

