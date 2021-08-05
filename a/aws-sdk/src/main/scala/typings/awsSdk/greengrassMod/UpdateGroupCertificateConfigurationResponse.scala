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
  
  inline def apply(): UpdateGroupCertificateConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateGroupCertificateConfigurationResponse]
  }
  
  extension [Self <: UpdateGroupCertificateConfigurationResponse](x: Self) {
    
    inline def setCertificateAuthorityExpiryInMilliseconds(value: string): Self = StObject.set(x, "CertificateAuthorityExpiryInMilliseconds", value.asInstanceOf[js.Any])
    
    inline def setCertificateAuthorityExpiryInMillisecondsUndefined: Self = StObject.set(x, "CertificateAuthorityExpiryInMilliseconds", js.undefined)
    
    inline def setCertificateExpiryInMilliseconds(value: string): Self = StObject.set(x, "CertificateExpiryInMilliseconds", value.asInstanceOf[js.Any])
    
    inline def setCertificateExpiryInMillisecondsUndefined: Self = StObject.set(x, "CertificateExpiryInMilliseconds", js.undefined)
    
    inline def setGroupId(value: string): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "GroupId", js.undefined)
  }
}
