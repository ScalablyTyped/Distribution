package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateGroupCertificateAuthorityResponse extends StObject {
  
  /**
    * The ARN of the group certificate authority.
    */
  var GroupCertificateAuthorityArn: js.UndefOr[string] = js.undefined
}
object CreateGroupCertificateAuthorityResponse {
  
  @scala.inline
  def apply(): CreateGroupCertificateAuthorityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateGroupCertificateAuthorityResponse]
  }
  
  @scala.inline
  implicit class CreateGroupCertificateAuthorityResponseMutableBuilder[Self <: CreateGroupCertificateAuthorityResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupCertificateAuthorityArn(value: string): Self = StObject.set(x, "GroupCertificateAuthorityArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupCertificateAuthorityArnUndefined: Self = StObject.set(x, "GroupCertificateAuthorityArn", js.undefined)
  }
}
