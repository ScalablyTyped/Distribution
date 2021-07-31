package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateGroupCertificateConfigurationResponse extends StObject {
  
  /**
    * The amount of time remaining before the certificate authority expires, in milliseconds.
    */
  var CertificateAuthorityExpiryInMilliseconds: js.UndefOr[string] = js.undefined
  
  /**
    * The amount of time remaining before the certificate expires, in milliseconds.
    */
  var CertificateExpiryInMilliseconds: js.UndefOr[string] = js.undefined
  
  /**
    * The ID of the group certificate configuration.
    */
  var GroupId: js.UndefOr[string] = js.undefined
}
object UpdateGroupCertificateConfigurationResponse {
  
  @scala.inline
  def apply(): UpdateGroupCertificateConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateGroupCertificateConfigurationResponse]
  }
  
  @scala.inline
  implicit class UpdateGroupCertificateConfigurationResponseMutableBuilder[Self <: UpdateGroupCertificateConfigurationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateAuthorityExpiryInMilliseconds(value: string): Self = StObject.set(x, "CertificateAuthorityExpiryInMilliseconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateAuthorityExpiryInMillisecondsUndefined: Self = StObject.set(x, "CertificateAuthorityExpiryInMilliseconds", js.undefined)
    
    @scala.inline
    def setCertificateExpiryInMilliseconds(value: string): Self = StObject.set(x, "CertificateExpiryInMilliseconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateExpiryInMillisecondsUndefined: Self = StObject.set(x, "CertificateExpiryInMilliseconds", js.undefined)
    
    @scala.inline
    def setGroupId(value: string): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupIdUndefined: Self = StObject.set(x, "GroupId", js.undefined)
  }
}
