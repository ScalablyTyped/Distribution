package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeregisterCertificateRequest extends js.Object {
  /**
    * The identifier of the certificate.
    */
  var CertificateId: typings.awsSdk.directoryserviceMod.CertificateId = js.native
  /**
    * The identifier of the directory.
    */
  var DirectoryId: typings.awsSdk.directoryserviceMod.DirectoryId = js.native
}

object DeregisterCertificateRequest {
  @scala.inline
  def apply(CertificateId: CertificateId, DirectoryId: DirectoryId): DeregisterCertificateRequest = {
    val __obj = js.Dynamic.literal(CertificateId = CertificateId.asInstanceOf[js.Any], DirectoryId = DirectoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterCertificateRequest]
  }
  @scala.inline
  implicit class DeregisterCertificateRequestOps[Self <: DeregisterCertificateRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCertificateId(value: CertificateId): Self = this.set("CertificateId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirectoryId(value: DirectoryId): Self = this.set("DirectoryId", value.asInstanceOf[js.Any])
  }
  
}

