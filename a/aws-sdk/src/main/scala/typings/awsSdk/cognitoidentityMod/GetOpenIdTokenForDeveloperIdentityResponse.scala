package typings.awsSdk.cognitoidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetOpenIdTokenForDeveloperIdentityResponse extends StObject {
  
  /**
    * A unique identifier in the format REGION:GUID.
    */
  var IdentityId: js.UndefOr[typings.awsSdk.cognitoidentityMod.IdentityId] = js.undefined
  
  /**
    * An OpenID token.
    */
  var Token: js.UndefOr[OIDCToken] = js.undefined
}
object GetOpenIdTokenForDeveloperIdentityResponse {
  
  @scala.inline
  def apply(): GetOpenIdTokenForDeveloperIdentityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOpenIdTokenForDeveloperIdentityResponse]
  }
  
  @scala.inline
  implicit class GetOpenIdTokenForDeveloperIdentityResponseMutableBuilder[Self <: GetOpenIdTokenForDeveloperIdentityResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentityId(value: IdentityId): Self = StObject.set(x, "IdentityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityIdUndefined: Self = StObject.set(x, "IdentityId", js.undefined)
    
    @scala.inline
    def setToken(value: OIDCToken): Self = StObject.set(x, "Token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenUndefined: Self = StObject.set(x, "Token", js.undefined)
  }
}
