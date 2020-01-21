package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupCertificateAuthorityProperties extends js.Object {
  /**
    * The ARN of the certificate authority for the group.
    */
  var GroupCertificateAuthorityArn: js.UndefOr[string] = js.native
  /**
    * The ID of the certificate authority for the group.
    */
  var GroupCertificateAuthorityId: js.UndefOr[string] = js.native
}

object GroupCertificateAuthorityProperties {
  @scala.inline
  def apply(GroupCertificateAuthorityArn: string = null, GroupCertificateAuthorityId: string = null): GroupCertificateAuthorityProperties = {
    val __obj = js.Dynamic.literal()
    if (GroupCertificateAuthorityArn != null) __obj.updateDynamic("GroupCertificateAuthorityArn")(GroupCertificateAuthorityArn.asInstanceOf[js.Any])
    if (GroupCertificateAuthorityId != null) __obj.updateDynamic("GroupCertificateAuthorityId")(GroupCertificateAuthorityId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupCertificateAuthorityProperties]
  }
}

