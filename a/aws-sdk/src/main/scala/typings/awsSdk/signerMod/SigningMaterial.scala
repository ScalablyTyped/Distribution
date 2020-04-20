package typings.awsSdk.signerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SigningMaterial extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the certificates that is used to sign your code.
    */
  var certificateArn: CertificateArn = js.native
}

object SigningMaterial {
  @scala.inline
  def apply(certificateArn: CertificateArn): SigningMaterial = {
    val __obj = js.Dynamic.literal(certificateArn = certificateArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SigningMaterial]
  }
}

