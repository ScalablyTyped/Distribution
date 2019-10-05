package typings.chrome.chrome.platformKeys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.platformKeys.verifyTLSServerCertificate")
@js.native
object verifyTLSServerCertificate extends js.Object {
  def apply(
    details: ServerCertificateVerificationDetails,
    callback: js.Function1[/* result */ ServerCertificateVerificationResult, Unit]
  ): Unit = js.native
}

