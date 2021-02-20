package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateAuthorizerRequest extends StObject {
  
  /**
    * The ARN of the authorizer's Lambda function.
    */
  var authorizerFunctionArn: js.UndefOr[AuthorizerFunctionArn] = js.native
  
  /**
    * The authorizer name.
    */
  var authorizerName: AuthorizerName = js.native
  
  /**
    * The status of the update authorizer request.
    */
  var status: js.UndefOr[AuthorizerStatus] = js.native
  
  /**
    * The key used to extract the token from the HTTP headers. 
    */
  var tokenKeyName: js.UndefOr[TokenKeyName] = js.native
  
  /**
    * The public keys used to verify the token signature.
    */
  var tokenSigningPublicKeys: js.UndefOr[PublicKeyMap] = js.native
}
object UpdateAuthorizerRequest {
  
  @scala.inline
  def apply(authorizerName: AuthorizerName): UpdateAuthorizerRequest = {
    val __obj = js.Dynamic.literal(authorizerName = authorizerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAuthorizerRequest]
  }
  
  @scala.inline
  implicit class UpdateAuthorizerRequestMutableBuilder[Self <: UpdateAuthorizerRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorizerFunctionArn(value: AuthorizerFunctionArn): Self = StObject.set(x, "authorizerFunctionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizerFunctionArnUndefined: Self = StObject.set(x, "authorizerFunctionArn", js.undefined)
    
    @scala.inline
    def setAuthorizerName(value: AuthorizerName): Self = StObject.set(x, "authorizerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: AuthorizerStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTokenKeyName(value: TokenKeyName): Self = StObject.set(x, "tokenKeyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenKeyNameUndefined: Self = StObject.set(x, "tokenKeyName", js.undefined)
    
    @scala.inline
    def setTokenSigningPublicKeys(value: PublicKeyMap): Self = StObject.set(x, "tokenSigningPublicKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenSigningPublicKeysUndefined: Self = StObject.set(x, "tokenSigningPublicKeys", js.undefined)
  }
}
