package typings.awsSdkSignatureV4

import typings.awsSdkSignatureV4.signatureV4Mod.SignatureV4CryptoInit
import typings.awsSdkSignatureV4.signatureV4Mod.SignatureV4Init
import typings.awsSdkTypes.credentialsMod.Credentials
import typings.awsSdkTypes.cryptoMod.HashConstructor
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/signature-v4", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@aws-sdk/signature-v4", "SignatureV4")
  @js.native
  class SignatureV4 protected ()
    extends typings.awsSdkSignatureV4.signatureV4Mod.SignatureV4 {
    def this(hasApplyChecksumCredentialsRegionServiceSha256UriEscapePath: SignatureV4Init & SignatureV4CryptoInit) = this()
  }
  
  @scala.inline
  def createScope(shortDate: String, region: String, service: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createScope")(shortDate.asInstanceOf[js.Any], region.asInstanceOf[js.Any], service.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def getSigningKey(
    sha256Constructor: HashConstructor,
    credentials: Credentials,
    shortDate: String,
    region: String,
    service: String
  ): js.Promise[Uint8Array] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSigningKey")(sha256Constructor.asInstanceOf[js.Any], credentials.asInstanceOf[js.Any], shortDate.asInstanceOf[js.Any], region.asInstanceOf[js.Any], service.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Uint8Array]]
}
