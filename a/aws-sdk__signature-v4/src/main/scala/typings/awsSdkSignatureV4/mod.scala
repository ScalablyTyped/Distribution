package typings.awsSdkSignatureV4

import typings.awsSdkSignatureV4.signatureV4Mod.SignatureV4CryptoInit
import typings.awsSdkSignatureV4.signatureV4Mod.SignatureV4Init
import typings.awsSdkTypes.credentialsMod.Credentials
import typings.awsSdkTypes.cryptoMod.HashConstructor
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/signature-v4", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def createScope(shortDate: String, region: String, service: String): String = js.native
  
  def getSigningKey(
    sha256Constructor: HashConstructor,
    credentials: Credentials,
    shortDate: String,
    region: String,
    service: String
  ): js.Promise[Uint8Array] = js.native
  
  @js.native
  class SignatureV4 protected ()
    extends typings.awsSdkSignatureV4.signatureV4Mod.SignatureV4 {
    def this(hasApplyChecksumCredentialsRegionServiceSha256UriEscapePath: SignatureV4Init with SignatureV4CryptoInit) = this()
  }
}
