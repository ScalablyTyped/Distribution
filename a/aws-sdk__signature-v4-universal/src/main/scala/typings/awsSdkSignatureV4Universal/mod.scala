package typings.awsSdkSignatureV4Universal

import typings.awsSdkSignatureV4.signatureV4Mod.SignatureV4Init
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/signature-v4-universal", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class SignatureV4 protected ()
    extends typings.awsSdkSignatureV4.mod.SignatureV4 {
    def this(hasSha256Rest: SignatureV4Init) = this()
  }
  
}

