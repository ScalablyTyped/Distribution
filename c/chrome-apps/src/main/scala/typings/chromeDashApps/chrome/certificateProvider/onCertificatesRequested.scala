package typings.chromeDashApps.chrome.certificateProvider

import org.scalablytyped.runtime.TopLevel
import typings.chromeDashApps.chrome.events.Event
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This event fires every time the browser requests the current list of
  * certificates provided by this app. The app must call *reportCallback*
  * exactly once with the current list of certificates.
  */
@JSGlobal("chrome.certificateProvider.onCertificatesRequested")
@js.native
object onCertificatesRequested
  extends TopLevel[
      Event[
        js.Function2[
          /* certificates */ js.Array[CertificateInfo], 
          /* callback */ js.Function1[/* rejectedCertificates */ js.Array[ArrayBuffer], Unit], 
          js.Any
        ]
      ]
    ]

