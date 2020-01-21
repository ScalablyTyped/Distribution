package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetGroupCertificateAuthorityRequest extends js.Object {
  /**
    * The ID of the certificate authority.
    */
  var CertificateAuthorityId: string = js.native
  /**
    * The ID of the Greengrass group.
    */
  var GroupId: string = js.native
}

object GetGroupCertificateAuthorityRequest {
  @scala.inline
  def apply(CertificateAuthorityId: string, GroupId: string): GetGroupCertificateAuthorityRequest = {
    val __obj = js.Dynamic.literal(CertificateAuthorityId = CertificateAuthorityId.asInstanceOf[js.Any], GroupId = GroupId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetGroupCertificateAuthorityRequest]
  }
}

