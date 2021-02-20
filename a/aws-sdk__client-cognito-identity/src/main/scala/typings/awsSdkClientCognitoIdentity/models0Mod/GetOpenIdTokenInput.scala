package typings.awsSdkClientCognitoIdentity.models0Mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetOpenIdTokenInput extends StObject {
  
  /**
    * <p>A unique identifier in the format REGION:GUID.</p>
    */
  var IdentityId: js.UndefOr[String] = js.native
  
  /**
    * <p>A set of optional name-value pairs that map provider names to provider tokens. When
    *          using graph.facebook.com and www.amazon.com, supply the access_token returned from the
    *          provider's authflow. For accounts.google.com, an Amazon Cognito user pool provider, or any
    *          other OpenId Connect provider, always include the <code>id_token</code>.</p>
    */
  var Logins: js.UndefOr[StringDictionary[String]] = js.native
}
object GetOpenIdTokenInput {
  
  @scala.inline
  def apply(): GetOpenIdTokenInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOpenIdTokenInput]
  }
  
  @JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "GetOpenIdTokenInput.filterSensitiveLog")
  @js.native
  def filterSensitiveLog(obj: GetOpenIdTokenInput): js.Any = js.native
  
  @scala.inline
  implicit class GetOpenIdTokenInputMutableBuilder[Self <: GetOpenIdTokenInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentityId(value: String): Self = StObject.set(x, "IdentityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityIdUndefined: Self = StObject.set(x, "IdentityId", js.undefined)
    
    @scala.inline
    def setLogins(value: StringDictionary[String]): Self = StObject.set(x, "Logins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoginsUndefined: Self = StObject.set(x, "Logins", js.undefined)
  }
}
