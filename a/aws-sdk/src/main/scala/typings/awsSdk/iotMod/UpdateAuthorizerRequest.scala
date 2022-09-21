package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAuthorizerRequest extends StObject {
  
  /**
    * The ARN of the authorizer's Lambda function.
    */
  var authorizerFunctionArn: js.UndefOr[AuthorizerFunctionArn] = js.undefined
  
  /**
    * The authorizer name.
    */
  var authorizerName: AuthorizerName
  
  /**
    * When true, the result from the authorizer’s Lambda function is cached for the time specified in refreshAfterInSeconds. The cached result is used while the device reuses the same HTTP connection.
    */
  var enableCachingForHttp: js.UndefOr[EnableCachingForHttp] = js.undefined
  
  /**
    * The status of the update authorizer request.
    */
  var status: js.UndefOr[AuthorizerStatus] = js.undefined
  
  /**
    * The key used to extract the token from the HTTP headers. 
    */
  var tokenKeyName: js.UndefOr[TokenKeyName] = js.undefined
  
  /**
    * The public keys used to verify the token signature.
    */
  var tokenSigningPublicKeys: js.UndefOr[PublicKeyMap] = js.undefined
}
object UpdateAuthorizerRequest {
  
  inline def apply(authorizerName: AuthorizerName): UpdateAuthorizerRequest = {
    val __obj = js.Dynamic.literal(authorizerName = authorizerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAuthorizerRequest]
  }
  
  extension [Self <: UpdateAuthorizerRequest](x: Self) {
    
    inline def setAuthorizerFunctionArn(value: AuthorizerFunctionArn): Self = StObject.set(x, "authorizerFunctionArn", value.asInstanceOf[js.Any])
    
    inline def setAuthorizerFunctionArnUndefined: Self = StObject.set(x, "authorizerFunctionArn", js.undefined)
    
    inline def setAuthorizerName(value: AuthorizerName): Self = StObject.set(x, "authorizerName", value.asInstanceOf[js.Any])
    
    inline def setEnableCachingForHttp(value: EnableCachingForHttp): Self = StObject.set(x, "enableCachingForHttp", value.asInstanceOf[js.Any])
    
    inline def setEnableCachingForHttpUndefined: Self = StObject.set(x, "enableCachingForHttp", js.undefined)
    
    inline def setStatus(value: AuthorizerStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTokenKeyName(value: TokenKeyName): Self = StObject.set(x, "tokenKeyName", value.asInstanceOf[js.Any])
    
    inline def setTokenKeyNameUndefined: Self = StObject.set(x, "tokenKeyName", js.undefined)
    
    inline def setTokenSigningPublicKeys(value: PublicKeyMap): Self = StObject.set(x, "tokenSigningPublicKeys", value.asInstanceOf[js.Any])
    
    inline def setTokenSigningPublicKeysUndefined: Self = StObject.set(x, "tokenSigningPublicKeys", js.undefined)
  }
}
