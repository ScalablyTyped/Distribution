package typings.awsSdkClientCognitoIdentity.models0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCredentialsForIdentityResponse extends StObject {
  
  /**
    * <p>Credentials for the provided identity ID.</p>
    */
  var Credentials: js.UndefOr[typings.awsSdkClientCognitoIdentity.models0Mod.Credentials] = js.undefined
  
  /**
    * <p>A unique identifier in the format REGION:GUID.</p>
    */
  var IdentityId: js.UndefOr[String] = js.undefined
}
object GetCredentialsForIdentityResponse {
  
  @scala.inline
  def apply(): GetCredentialsForIdentityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCredentialsForIdentityResponse]
  }
  
  @JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "GetCredentialsForIdentityResponse")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def filterSensitiveLog(obj: GetCredentialsForIdentityResponse): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("filterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  implicit class GetCredentialsForIdentityResponseMutableBuilder[Self <: GetCredentialsForIdentityResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCredentials(value: Credentials): Self = StObject.set(x, "Credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentialsUndefined: Self = StObject.set(x, "Credentials", js.undefined)
    
    @scala.inline
    def setIdentityId(value: String): Self = StObject.set(x, "IdentityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityIdUndefined: Self = StObject.set(x, "IdentityId", js.undefined)
  }
}
