package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class GetGroupCertificateAuthorityRequestOps[Self <: GetGroupCertificateAuthorityRequest] (val x: Self) extends AnyVal {
    
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
    def setCertificateAuthorityId(value: string): Self = this.set("CertificateAuthorityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupId(value: string): Self = this.set("GroupId", value.asInstanceOf[js.Any])
  }
}
