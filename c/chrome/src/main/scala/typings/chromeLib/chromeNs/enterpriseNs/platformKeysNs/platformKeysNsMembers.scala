package typings
package chromeLib.chromeNs.enterpriseNs.platformKeysNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.enterprise.platformKeys")
@js.native
object platformKeysNsMembers extends js.Object {
  def getCertificates(
    tokenId: java.lang.String,
    callback: js.Function1[/* certificates */ stdLib.ArrayBuffer, scala.Unit]
  ): scala.Unit = js.native
  def getToken(callback: js.Function1[/* tokens */ js.Array[Token], scala.Unit]): scala.Unit = js.native
  def importCertificate(tokenId: java.lang.String, certificate: stdLib.ArrayBuffer): scala.Unit = js.native
  def importCertificate(tokenId: java.lang.String, certificate: stdLib.ArrayBuffer, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def removeCertificate(tokenId: java.lang.String, certificate: stdLib.ArrayBuffer): scala.Unit = js.native
  def removeCertificate(tokenId: java.lang.String, certificate: stdLib.ArrayBuffer, callback: js.Function0[scala.Unit]): scala.Unit = js.native
}

