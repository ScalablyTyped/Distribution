package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAuthorizerRequest extends StObject {
  
  /**
    * The ARN of the authorizer's Lambda function.
    */
  var authorizerFunctionArn: AuthorizerFunctionArn = js.native
  
  /**
    * The authorizer name.
    */
  var authorizerName: AuthorizerName = js.native
  
  /**
    * Specifies whether AWS IoT validates the token signature in an authorization request.
    */
  var signingDisabled: js.UndefOr[BooleanKey] = js.native
  
  /**
    * The status of the create authorizer request.
    */
  var status: js.UndefOr[AuthorizerStatus] = js.native
  
  /**
    * Metadata which can be used to manage the custom authorizer.  For URI Request parameters use format: ...key1=value1&amp;key2=value2... For the CLI command-line parameter use format: &amp;&amp;tags "key1=value1&amp;key2=value2..." For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..." 
    */
  var tags: js.UndefOr[TagList] = js.native
  
  /**
    * The name of the token key used to extract the token from the HTTP headers.
    */
  var tokenKeyName: js.UndefOr[TokenKeyName] = js.native
  
  /**
    * The public keys used to verify the digital signature returned by your custom authentication service.
    */
  var tokenSigningPublicKeys: js.UndefOr[PublicKeyMap] = js.native
}
object CreateAuthorizerRequest {
  
  @scala.inline
  def apply(authorizerFunctionArn: AuthorizerFunctionArn, authorizerName: AuthorizerName): CreateAuthorizerRequest = {
    val __obj = js.Dynamic.literal(authorizerFunctionArn = authorizerFunctionArn.asInstanceOf[js.Any], authorizerName = authorizerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAuthorizerRequest]
  }
  
  @scala.inline
  implicit class CreateAuthorizerRequestMutableBuilder[Self <: CreateAuthorizerRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorizerFunctionArn(value: AuthorizerFunctionArn): Self = StObject.set(x, "authorizerFunctionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizerName(value: AuthorizerName): Self = StObject.set(x, "authorizerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigningDisabled(value: BooleanKey): Self = StObject.set(x, "signingDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigningDisabledUndefined: Self = StObject.set(x, "signingDisabled", js.undefined)
    
    @scala.inline
    def setStatus(value: AuthorizerStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
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
