package typings.chrome.chromeNs.enterpriseNs.platformKeysNs

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.enterprise.platformKeys")
@js.native
object ^ extends js.Object {
  def getCertificates(tokenId: String, callback: js.Function1[/* certificates */ ArrayBuffer, Unit]): Unit = js.native
  def getToken(callback: js.Function1[/* tokens */ js.Array[Token], Unit]): Unit = js.native
  def importCertificate(tokenId: String, certificate: ArrayBuffer): Unit = js.native
  def importCertificate(tokenId: String, certificate: ArrayBuffer, callback: js.Function0[Unit]): Unit = js.native
  def removeCertificate(tokenId: String, certificate: ArrayBuffer): Unit = js.native
  def removeCertificate(tokenId: String, certificate: ArrayBuffer, callback: js.Function0[Unit]): Unit = js.native
}

