package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateServiceRequest extends StObject {
  
  /**
    * The type of IAM policy.    NONE: The resource does not use an IAM policy. This is the default.    AWS_IAM: The resource uses an IAM policy. When this type is used, auth is enabled and an auth policy is required.  
    */
  var authType: js.UndefOr[AuthType] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the certificate.
    */
  var certificateArn: js.UndefOr[CertificateArn] = js.undefined
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you retry a request that completed successfully using the same client token and parameters, the retry succeeds without performing any actions. If the parameters aren't identical, the retry fails.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The custom domain name of the service.
    */
  var customDomainName: js.UndefOr[ServiceCustomDomainName] = js.undefined
  
  /**
    * The name of the service. The name must be unique within the account. The valid characters are a-z, 0-9, and hyphens (-). You can't use a hyphen as the first or last character, or immediately after another hyphen.
    */
  var name: ServiceName
  
  /**
    * The tags for the service.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object CreateServiceRequest {
  
  inline def apply(name: ServiceName): CreateServiceRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateServiceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateServiceRequest] (val x: Self) extends AnyVal {
    
    inline def setAuthType(value: AuthType): Self = StObject.set(x, "authType", value.asInstanceOf[js.Any])
    
    inline def setAuthTypeUndefined: Self = StObject.set(x, "authType", js.undefined)
    
    inline def setCertificateArn(value: CertificateArn): Self = StObject.set(x, "certificateArn", value.asInstanceOf[js.Any])
    
    inline def setCertificateArnUndefined: Self = StObject.set(x, "certificateArn", js.undefined)
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setCustomDomainName(value: ServiceCustomDomainName): Self = StObject.set(x, "customDomainName", value.asInstanceOf[js.Any])
    
    inline def setCustomDomainNameUndefined: Self = StObject.set(x, "customDomainName", js.undefined)
    
    inline def setName(value: ServiceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
