package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetGroupCertificateAuthorityRequest extends StObject {
  
  /**
    * The ID of the certificate authority.
    */
  var CertificateAuthorityId: string
  
  /**
    * The ID of the Greengrass group.
    */
  var GroupId: string
}
object GetGroupCertificateAuthorityRequest {
  
  @scala.inline
  def apply(CertificateAuthorityId: string, GroupId: string): GetGroupCertificateAuthorityRequest = {
    val __obj = js.Dynamic.literal(CertificateAuthorityId = CertificateAuthorityId.asInstanceOf[js.Any], GroupId = GroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGroupCertificateAuthorityRequest]
  }
  
  @scala.inline
  implicit class GetGroupCertificateAuthorityRequestMutableBuilder[Self <: GetGroupCertificateAuthorityRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateAuthorityId(value: string): Self = StObject.set(x, "CertificateAuthorityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupId(value: string): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
  }
}
