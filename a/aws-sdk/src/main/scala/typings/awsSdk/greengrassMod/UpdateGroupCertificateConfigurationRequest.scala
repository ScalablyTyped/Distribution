package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateGroupCertificateConfigurationRequest extends StObject {
  
  /**
    * The amount of time remaining before the certificate expires, in milliseconds.
    */
  var CertificateExpiryInMilliseconds: js.UndefOr[string] = js.undefined
  
  /**
    * The ID of the Greengrass group.
    */
  var GroupId: string
}
object UpdateGroupCertificateConfigurationRequest {
  
  @scala.inline
  def apply(GroupId: string): UpdateGroupCertificateConfigurationRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGroupCertificateConfigurationRequest]
  }
  
  @scala.inline
  implicit class UpdateGroupCertificateConfigurationRequestMutableBuilder[Self <: UpdateGroupCertificateConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateExpiryInMilliseconds(value: string): Self = StObject.set(x, "CertificateExpiryInMilliseconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateExpiryInMillisecondsUndefined: Self = StObject.set(x, "CertificateExpiryInMilliseconds", js.undefined)
    
    @scala.inline
    def setGroupId(value: string): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
  }
}
