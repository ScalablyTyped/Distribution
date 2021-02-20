package typings.chrome.anon

import typings.chrome.chrome.enterprise.platformKeys.Token
import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofplatformKeys extends StObject {
  
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
  
  def getCertificates(tokenId: String, callback: js.Function1[/* certificates */ js.Array[ArrayBuffer], Unit]): Unit = js.native
  
  def getTokens(callback: js.Function1[/* tokens */ js.Array[Token], Unit]): Unit = js.native
  
  def importCertificate(tokenId: String, certificate: ArrayBuffer): Unit = js.native
  def importCertificate(tokenId: String, certificate: ArrayBuffer, callback: js.Function0[Unit]): Unit = js.native
  
  def removeCertificate(tokenId: String, certificate: ArrayBuffer): Unit = js.native
  def removeCertificate(tokenId: String, certificate: ArrayBuffer, callback: js.Function0[Unit]): Unit = js.native
}
