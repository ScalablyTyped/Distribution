package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeCertificateRequest extends js.Object {
  /**
    * The identifier of the certificate.
    */
  var CertificateId: typings.awsSdk.directoryserviceMod.CertificateId = js.native
  /**
    * The identifier of the directory.
    */
  var DirectoryId: typings.awsSdk.directoryserviceMod.DirectoryId = js.native
}

object DescribeCertificateRequest {
  @scala.inline
  def apply(CertificateId: CertificateId, DirectoryId: DirectoryId): DescribeCertificateRequest = {
    val __obj = js.Dynamic.literal(CertificateId = CertificateId.asInstanceOf[js.Any], DirectoryId = DirectoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCertificateRequest]
  }
}

