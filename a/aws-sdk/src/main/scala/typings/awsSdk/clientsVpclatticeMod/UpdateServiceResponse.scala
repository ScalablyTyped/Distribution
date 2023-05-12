package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateServiceResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the service.
    */
  var arn: js.UndefOr[ServiceArn] = js.undefined
  
  /**
    * The type of IAM policy.
    */
  var authType: js.UndefOr[AuthType] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the certificate. 
    */
  var certificateArn: js.UndefOr[CertificateArn] = js.undefined
  
  /**
    * The custom domain name of the service.
    */
  var customDomainName: js.UndefOr[ServiceCustomDomainName] = js.undefined
  
  /**
    * The ID of the service.
    */
  var id: js.UndefOr[ServiceId] = js.undefined
  
  /**
    * The name of the service.
    */
  var name: js.UndefOr[ServiceName] = js.undefined
}
object UpdateServiceResponse {
  
  inline def apply(): UpdateServiceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateServiceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateServiceResponse] (val x: Self) extends AnyVal {
    
    inline def setArn(value: ServiceArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setAuthType(value: AuthType): Self = StObject.set(x, "authType", value.asInstanceOf[js.Any])
    
    inline def setAuthTypeUndefined: Self = StObject.set(x, "authType", js.undefined)
    
    inline def setCertificateArn(value: CertificateArn): Self = StObject.set(x, "certificateArn", value.asInstanceOf[js.Any])
    
    inline def setCertificateArnUndefined: Self = StObject.set(x, "certificateArn", js.undefined)
    
    inline def setCustomDomainName(value: ServiceCustomDomainName): Self = StObject.set(x, "customDomainName", value.asInstanceOf[js.Any])
    
    inline def setCustomDomainNameUndefined: Self = StObject.set(x, "customDomainName", js.undefined)
    
    inline def setId(value: ServiceId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: ServiceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
