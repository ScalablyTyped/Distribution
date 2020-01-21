package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteCACertificateRequest extends js.Object {
  /**
    * The ID of the certificate to delete. (The last part of the certificate ARN contains the certificate ID.)
    */
  var certificateId: CertificateId = js.native
}

object DeleteCACertificateRequest {
  @scala.inline
  def apply(certificateId: CertificateId): DeleteCACertificateRequest = {
    val __obj = js.Dynamic.literal(certificateId = certificateId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteCACertificateRequest]
  }
}

