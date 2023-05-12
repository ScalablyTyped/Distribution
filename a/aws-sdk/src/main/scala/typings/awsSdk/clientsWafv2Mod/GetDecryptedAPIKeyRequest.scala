package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDecryptedAPIKeyRequest extends StObject {
  
  /**
    * The encrypted API key. 
    */
  var APIKey: typings.awsSdk.clientsWafv2Mod.APIKey
  
  /**
    * Specifies whether this is for an Amazon CloudFront distribution or for a regional application. A regional application can be an Application Load Balancer (ALB), an Amazon API Gateway REST API, an AppSync GraphQL API, an Amazon Cognito user pool, an App Runner service, or an Amazon Web Services Verified Access instance.  To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:    CLI - Specify the Region when you use the CloudFront scope: --scope=CLOUDFRONT --region=us-east-1.    API and SDKs - For all calls, use the Region endpoint us-east-1.   
    */
  var Scope: typings.awsSdk.clientsWafv2Mod.Scope
}
object GetDecryptedAPIKeyRequest {
  
  inline def apply(APIKey: APIKey, Scope: Scope): GetDecryptedAPIKeyRequest = {
    val __obj = js.Dynamic.literal(APIKey = APIKey.asInstanceOf[js.Any], Scope = Scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDecryptedAPIKeyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDecryptedAPIKeyRequest] (val x: Self) extends AnyVal {
    
    inline def setAPIKey(value: APIKey): Self = StObject.set(x, "APIKey", value.asInstanceOf[js.Any])
    
    inline def setScope(value: Scope): Self = StObject.set(x, "Scope", value.asInstanceOf[js.Any])
  }
}
