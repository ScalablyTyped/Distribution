package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerCertificate extends js.Object {
  /**
    * The contents of the public key certificate.
    */
  var CertificateBody: certificateBodyType = js.native
  /**
    * The contents of the public key certificate chain.
    */
  var CertificateChain: js.UndefOr[certificateChainType] = js.native
  /**
    * The meta information of the server certificate, such as its name, path, ID, and ARN.
    */
  var ServerCertificateMetadata: typings.awsSdk.iamMod.ServerCertificateMetadata = js.native
}

object ServerCertificate {
  @scala.inline
  def apply(
    CertificateBody: certificateBodyType,
    ServerCertificateMetadata: ServerCertificateMetadata,
    CertificateChain: certificateChainType = null
  ): ServerCertificate = {
    val __obj = js.Dynamic.literal(CertificateBody = CertificateBody.asInstanceOf[js.Any], ServerCertificateMetadata = ServerCertificateMetadata.asInstanceOf[js.Any])
    if (CertificateChain != null) __obj.updateDynamic("CertificateChain")(CertificateChain.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerCertificate]
  }
}

