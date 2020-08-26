package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetGroupCertificateAuthorityResponse extends js.Object {
  /**
    * The ARN of the certificate authority for the group.
    */
  var GroupCertificateAuthorityArn: js.UndefOr[string] = js.native
  /**
    * The ID of the certificate authority for the group.
    */
  var GroupCertificateAuthorityId: js.UndefOr[string] = js.native
  /**
    * The PEM encoded certificate for the group.
    */
  var PemEncodedCertificate: js.UndefOr[string] = js.native
}

object GetGroupCertificateAuthorityResponse {
  @scala.inline
  def apply(): GetGroupCertificateAuthorityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetGroupCertificateAuthorityResponse]
  }
  @scala.inline
  implicit class GetGroupCertificateAuthorityResponseOps[Self <: GetGroupCertificateAuthorityResponse] (val x: Self) extends AnyVal {
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
    def setGroupCertificateAuthorityArn(value: string): Self = this.set("GroupCertificateAuthorityArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupCertificateAuthorityArn: Self = this.set("GroupCertificateAuthorityArn", js.undefined)
    @scala.inline
    def setGroupCertificateAuthorityId(value: string): Self = this.set("GroupCertificateAuthorityId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupCertificateAuthorityId: Self = this.set("GroupCertificateAuthorityId", js.undefined)
    @scala.inline
    def setPemEncodedCertificate(value: string): Self = this.set("PemEncodedCertificate", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePemEncodedCertificate: Self = this.set("PemEncodedCertificate", js.undefined)
  }
  
}

