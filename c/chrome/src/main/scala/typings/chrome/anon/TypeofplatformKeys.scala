package typings.chrome.anon

import typings.chrome.chrome.enterprise.platformKeys.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofplatformKeys extends StObject {
  
  def challengeMachineKey(
    challenge: js.typedarray.ArrayBuffer,
    callback: js.Function1[/* response */ js.typedarray.ArrayBuffer, Unit]
  ): Unit = js.native
  def challengeMachineKey(
    challenge: js.typedarray.ArrayBuffer,
    registerKey: Boolean,
    callback: js.Function1[/* response */ js.typedarray.ArrayBuffer, Unit]
  ): Unit = js.native
  
  def challengeUserKey(
    challenge: js.typedarray.ArrayBuffer,
    registerKey: Boolean,
    callback: js.Function1[/* response */ js.typedarray.ArrayBuffer, Unit]
  ): Unit = js.native
  
  def getCertificates(
    tokenId: String,
    callback: js.Function1[/* certificates */ js.Array[js.typedarray.ArrayBuffer], Unit]
  ): Unit = js.native
  
  def getTokens(callback: js.Function1[/* tokens */ js.Array[Token], Unit]): Unit = js.native
  
  def importCertificate(tokenId: String, certificate: js.typedarray.ArrayBuffer): Unit = js.native
  def importCertificate(tokenId: String, certificate: js.typedarray.ArrayBuffer, callback: js.Function0[Unit]): Unit = js.native
  
  def removeCertificate(tokenId: String, certificate: js.typedarray.ArrayBuffer): Unit = js.native
  def removeCertificate(tokenId: String, certificate: js.typedarray.ArrayBuffer, callback: js.Function0[Unit]): Unit = js.native
}
