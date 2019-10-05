package typings.chromeDashApps.chrome.certificateProvider

import org.scalablytyped.runtime.TopLevel
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
@JSGlobal("chrome.certificateProvider.onSignDigestRequested")
@js.native
object onSignDigestRequested
  extends TopLevel[
      typings.chromeDashApps.chrome.events.Event[
        js.Function2[
          /* signRequest */ SignRequest, 
          /* signCallback */ js.Function1[/* signature */ js.UndefOr[ArrayBuffer], Unit], 
          js.Any
        ]
      ]
    ]

