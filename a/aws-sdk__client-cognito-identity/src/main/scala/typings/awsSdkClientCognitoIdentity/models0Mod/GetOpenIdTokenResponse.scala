package typings.awsSdkClientCognitoIdentity.models0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetOpenIdTokenResponse extends StObject {
  
  /**
    * <p>A unique identifier in the format REGION:GUID. Note that the IdentityId returned may
    *          not match the one passed on input.</p>
    */
  var IdentityId: js.UndefOr[String] = js.undefined
  
  /**
    * <p>An OpenID token, valid for 10 minutes.</p>
    */
  var Token: js.UndefOr[String] = js.undefined
}
object GetOpenIdTokenResponse {
  
  @scala.inline
  def apply(): GetOpenIdTokenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOpenIdTokenResponse]
  }
  
  @JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "GetOpenIdTokenResponse")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def filterSensitiveLog(obj: GetOpenIdTokenResponse): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("filterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  implicit class GetOpenIdTokenResponseMutableBuilder[Self <: GetOpenIdTokenResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentityId(value: String): Self = StObject.set(x, "IdentityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityIdUndefined: Self = StObject.set(x, "IdentityId", js.undefined)
    
    @scala.inline
    def setToken(value: String): Self = StObject.set(x, "Token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenUndefined: Self = StObject.set(x, "Token", js.undefined)
  }
}
