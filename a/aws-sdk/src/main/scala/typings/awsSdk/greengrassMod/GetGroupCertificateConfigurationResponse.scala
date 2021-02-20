package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetGroupCertificateConfigurationResponse extends StObject {
  
  /**
    * The amount of time remaining before the certificate authority expires, in milliseconds.
    */
  var CertificateAuthorityExpiryInMilliseconds: js.UndefOr[string] = js.native
  
  /**
    * The amount of time remaining before the certificate expires, in milliseconds.
    */
  var CertificateExpiryInMilliseconds: js.UndefOr[string] = js.native
  
  /**
    * The ID of the group certificate configuration.
    */
  var GroupId: js.UndefOr[string] = js.native
}
object GetGroupCertificateConfigurationResponse {
  
  @scala.inline
  def apply(): GetGroupCertificateConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetGroupCertificateConfigurationResponse]
  }
  
  @scala.inline
  implicit class GetGroupCertificateConfigurationResponseMutableBuilder[Self <: GetGroupCertificateConfigurationResponse] (val x: Self) extends AnyVal {
    
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
