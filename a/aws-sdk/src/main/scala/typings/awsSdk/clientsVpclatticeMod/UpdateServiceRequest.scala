package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateServiceRequest extends StObject {
  
  /**
    * The type of IAM policy.    NONE: The resource does not use an IAM policy. This is the default.    AWS_IAM: The resource uses an IAM policy. When this type is used, auth is enabled and an auth policy is required.  
    */
  var authType: js.UndefOr[AuthType] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the certificate. 
    */
  var certificateArn: js.UndefOr[CertificateArn] = js.undefined
  
  /**
    * The ID or Amazon Resource Name (ARN) of the service.
    */
  var serviceIdentifier: ServiceIdentifier
}
object UpdateServiceRequest {
  
  inline def apply(serviceIdentifier: ServiceIdentifier): UpdateServiceRequest = {
    val __obj = js.Dynamic.literal(serviceIdentifier = serviceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateServiceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateServiceRequest] (val x: Self) extends AnyVal {
    
    inline def setAuthType(value: AuthType): Self = StObject.set(x, "authType", value.asInstanceOf[js.Any])
    
    inline def setAuthTypeUndefined: Self = StObject.set(x, "authType", js.undefined)
    
    inline def setCertificateArn(value: CertificateArn): Self = StObject.set(x, "certificateArn", value.asInstanceOf[js.Any])
    
    inline def setCertificateArnUndefined: Self = StObject.set(x, "certificateArn", js.undefined)
    
    inline def setServiceIdentifier(value: ServiceIdentifier): Self = StObject.set(x, "serviceIdentifier", value.asInstanceOf[js.Any])
  }
}
