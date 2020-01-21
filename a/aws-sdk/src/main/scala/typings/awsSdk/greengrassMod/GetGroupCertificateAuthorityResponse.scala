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
  def apply(
    GroupCertificateAuthorityArn: string = null,
    GroupCertificateAuthorityId: string = null,
    PemEncodedCertificate: string = null
  ): GetGroupCertificateAuthorityResponse = {
    val __obj = js.Dynamic.literal()
    if (GroupCertificateAuthorityArn != null) __obj.updateDynamic("GroupCertificateAuthorityArn")(GroupCertificateAuthorityArn.asInstanceOf[js.Any])
    if (GroupCertificateAuthorityId != null) __obj.updateDynamic("GroupCertificateAuthorityId")(GroupCertificateAuthorityId.asInstanceOf[js.Any])
    if (PemEncodedCertificate != null) __obj.updateDynamic("PemEncodedCertificate")(PemEncodedCertificate.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGroupCertificateAuthorityResponse]
  }
}

