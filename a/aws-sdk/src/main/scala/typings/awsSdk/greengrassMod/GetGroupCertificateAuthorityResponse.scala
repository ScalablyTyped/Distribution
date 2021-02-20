package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetGroupCertificateAuthorityResponse extends StObject {
  
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
  implicit class GetGroupCertificateAuthorityResponseMutableBuilder[Self <: GetGroupCertificateAuthorityResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupCertificateAuthorityArn(value: string): Self = StObject.set(x, "GroupCertificateAuthorityArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupCertificateAuthorityArnUndefined: Self = StObject.set(x, "GroupCertificateAuthorityArn", js.undefined)
    
    @scala.inline
    def setGroupCertificateAuthorityId(value: string): Self = StObject.set(x, "GroupCertificateAuthorityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupCertificateAuthorityIdUndefined: Self = StObject.set(x, "GroupCertificateAuthorityId", js.undefined)
    
    @scala.inline
    def setPemEncodedCertificate(value: string): Self = StObject.set(x, "PemEncodedCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPemEncodedCertificateUndefined: Self = StObject.set(x, "PemEncodedCertificate", js.undefined)
  }
}
