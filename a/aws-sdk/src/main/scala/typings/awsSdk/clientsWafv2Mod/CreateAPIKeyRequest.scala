package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAPIKeyRequest extends StObject {
  
  /**
    * Specifies whether this is for an Amazon CloudFront distribution or for a regional application. A regional application can be an Application Load Balancer (ALB), an Amazon API Gateway REST API, an AppSync GraphQL API, an Amazon Cognito user pool, an App Runner service, or an Amazon Web Services Verified Access instance.  To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:    CLI - Specify the Region when you use the CloudFront scope: --scope=CLOUDFRONT --region=us-east-1.    API and SDKs - For all calls, use the Region endpoint us-east-1.   
    */
  var Scope: typings.awsSdk.clientsWafv2Mod.Scope
  
  /**
    * The client application domains that you want to use this API key for.  Example JSON: "TokenDomains": ["abc.com", "store.abc.com"]  Public suffixes aren't allowed. For example, you can't use usa.gov or co.uk as token domains.
    */
  var TokenDomains: APIKeyTokenDomains
}
object CreateAPIKeyRequest {
  
  inline def apply(Scope: Scope, TokenDomains: APIKeyTokenDomains): CreateAPIKeyRequest = {
    val __obj = js.Dynamic.literal(Scope = Scope.asInstanceOf[js.Any], TokenDomains = TokenDomains.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAPIKeyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateAPIKeyRequest] (val x: Self) extends AnyVal {
    
    inline def setScope(value: Scope): Self = StObject.set(x, "Scope", value.asInstanceOf[js.Any])
    
    inline def setTokenDomains(value: APIKeyTokenDomains): Self = StObject.set(x, "TokenDomains", value.asInstanceOf[js.Any])
    
    inline def setTokenDomainsVarargs(value: TokenDomain*): Self = StObject.set(x, "TokenDomains", js.Array(value*))
  }
}
