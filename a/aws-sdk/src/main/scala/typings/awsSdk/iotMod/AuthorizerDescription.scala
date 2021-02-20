package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthorizerDescription extends StObject {
  
  /**
    * The authorizer ARN.
    */
  var authorizerArn: js.UndefOr[AuthorizerArn] = js.native
  
  /**
    * The authorizer's Lambda function ARN.
    */
  var authorizerFunctionArn: js.UndefOr[AuthorizerFunctionArn] = js.native
  
  /**
    * The authorizer name.
    */
  var authorizerName: js.UndefOr[AuthorizerName] = js.native
  
  /**
    * The UNIX timestamp of when the authorizer was created.
    */
  var creationDate: js.UndefOr[DateType] = js.native
  
  /**
    * The UNIX timestamp of when the authorizer was last updated.
    */
  var lastModifiedDate: js.UndefOr[DateType] = js.native
  
  /**
    * Specifies whether AWS IoT validates the token signature in an authorization request.
    */
  var signingDisabled: js.UndefOr[BooleanKey] = js.native
  
  /**
    * The status of the authorizer.
    */
  var status: js.UndefOr[AuthorizerStatus] = js.native
  
  /**
    * The key used to extract the token from the HTTP headers.
    */
  var tokenKeyName: js.UndefOr[TokenKeyName] = js.native
  
  /**
    * The public keys used to validate the token signature returned by your custom authentication service.
    */
  var tokenSigningPublicKeys: js.UndefOr[PublicKeyMap] = js.native
}
object AuthorizerDescription {
  
  @scala.inline
  def apply(): AuthorizerDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizerDescription]
  }
  
  @scala.inline
  implicit class AuthorizerDescriptionMutableBuilder[Self <: AuthorizerDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorizerArn(value: AuthorizerArn): Self = StObject.set(x, "authorizerArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizerArnUndefined: Self = StObject.set(x, "authorizerArn", js.undefined)
    
    @scala.inline
    def setAuthorizerFunctionArn(value: AuthorizerFunctionArn): Self = StObject.set(x, "authorizerFunctionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizerFunctionArnUndefined: Self = StObject.set(x, "authorizerFunctionArn", js.undefined)
    
    @scala.inline
    def setAuthorizerName(value: AuthorizerName): Self = StObject.set(x, "authorizerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizerNameUndefined: Self = StObject.set(x, "authorizerName", js.undefined)
    
    @scala.inline
    def setCreationDate(value: DateType): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    @scala.inline
    def setLastModifiedDate(value: DateType): Self = StObject.set(x, "lastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDateUndefined: Self = StObject.set(x, "lastModifiedDate", js.undefined)
    
    @scala.inline
    def setSigningDisabled(value: BooleanKey): Self = StObject.set(x, "signingDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigningDisabledUndefined: Self = StObject.set(x, "signingDisabled", js.undefined)
    
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
