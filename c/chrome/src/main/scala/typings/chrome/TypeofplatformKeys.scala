package typings.chrome

import typings.chrome.chrome.enterprise.platformKeys.Token
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofplatformKeys extends js.Object {
  def challengeMachineKey(challenge: ArrayBuffer, callback: js.Function1[/* response */ ArrayBuffer, Unit]): Unit = js.native
  def challengeMachineKey(
    challenge: ArrayBuffer,
    registerKey: Boolean,
    callback: js.Function1[/* response */ ArrayBuffer, Unit]
  ): Unit = js.native
  def challengeUserKey(
    challenge: ArrayBuffer,
    registerKey: Boolean,
    callback: js.Function1[/* response */ ArrayBuffer, Unit]
  ): Unit = js.native
  def getCertificates(tokenId: String, callback: js.Function1[/* certificates */ ArrayBuffer, Unit]): Unit = js.native
  def getTokens(callback: js.Function1[/* tokens */ js.Array[Token], Unit]): Unit = js.native
  def importCertificate(tokenId: String, certificate: ArrayBuffer): Unit = js.native
  def importCertificate(tokenId: String, certificate: ArrayBuffer, callback: js.Function0[Unit]): Unit = js.native
  def removeCertificate(tokenId: String, certificate: ArrayBuffer): Unit = js.native
  def removeCertificate(tokenId: String, certificate: ArrayBuffer, callback: js.Function0[Unit]): Unit = js.native
}

