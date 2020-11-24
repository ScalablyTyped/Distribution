package typings.awsSdkSignatureV4.signatureV4Mod

import typings.awsSdkTypes.signatureMod.EventSigner
import typings.awsSdkTypes.signatureMod.RequestPresigner
import typings.awsSdkTypes.signatureMod.RequestSigner
import typings.awsSdkTypes.signatureMod.StringSigner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/signature-v4/dist/cjs/SignatureV4", "SignatureV4")
@js.native
class SignatureV4 protected ()
  extends RequestPresigner
     with RequestSigner
     with StringSigner
     with EventSigner {
  def this(hasApplyChecksumCredentialsRegionServiceSha256UriEscapePath: SignatureV4Init with SignatureV4CryptoInit) = this()
  
  val applyChecksum: js.Any = js.native
  
  var createCanonicalRequest: js.Any = js.native
  
  var createStringToSign: js.Any = js.native
  
  val credentialProvider: js.Any = js.native
  
  var getCanonicalPath: js.Any = js.native
  
  var getSignature: js.Any = js.native
  
  var getSigningKey: js.Any = js.native
  
  val regionProvider: js.Any = js.native
  
  val service: js.Any = js.native
  
  val sha256: js.Any = js.native
  
  var signEvent: js.Any = js.native
  
  var signRequest: js.Any = js.native
  
  var signString: js.Any = js.native
  
  val uriEscapePath: js.Any = js.native
}
