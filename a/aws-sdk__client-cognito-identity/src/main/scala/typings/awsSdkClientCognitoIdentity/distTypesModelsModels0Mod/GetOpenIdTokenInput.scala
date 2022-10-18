package typings.awsSdkClientCognitoIdentity.distTypesModelsModels0Mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetOpenIdTokenInput extends StObject {
  
  /**
    * <p>A unique identifier in the format REGION:GUID.</p>
    */
  var IdentityId: js.UndefOr[String] = js.undefined
  
  /**
    * <p>A set of optional name-value pairs that map provider names to provider tokens. When
    *          using graph.facebook.com and www.amazon.com, supply the access_token returned from the
    *          provider's authflow. For accounts.google.com, an Amazon Cognito user pool provider, or any
    *          other OpenID Connect provider, always include the <code>id_token</code>.</p>
    */
  var Logins: js.UndefOr[Record[String, String]] = js.undefined
}
object GetOpenIdTokenInput {
  
  inline def apply(): GetOpenIdTokenInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOpenIdTokenInput]
  }
  
  extension [Self <: GetOpenIdTokenInput](x: Self) {
    
    inline def setIdentityId(value: String): Self = StObject.set(x, "IdentityId", value.asInstanceOf[js.Any])
    
    inline def setIdentityIdUndefined: Self = StObject.set(x, "IdentityId", js.undefined)
    
    inline def setLogins(value: Record[String, String]): Self = StObject.set(x, "Logins", value.asInstanceOf[js.Any])
    
    inline def setLoginsUndefined: Self = StObject.set(x, "Logins", js.undefined)
  }
}
