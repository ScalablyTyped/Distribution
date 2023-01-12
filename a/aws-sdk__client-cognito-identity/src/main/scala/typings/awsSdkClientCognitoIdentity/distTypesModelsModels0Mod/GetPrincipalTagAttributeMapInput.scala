package typings.awsSdkClientCognitoIdentity.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPrincipalTagAttributeMapInput extends StObject {
  
  /**
    * <p>You can use this operation to get the ID of the Identity Pool you setup attribute mappings for.</p>
    */
  var IdentityPoolId: js.UndefOr[String] = js.undefined
  
  /**
    * <p>You can use this operation to get the provider name.</p>
    */
  var IdentityProviderName: js.UndefOr[String] = js.undefined
}
object GetPrincipalTagAttributeMapInput {
  
  inline def apply(): GetPrincipalTagAttributeMapInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPrincipalTagAttributeMapInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetPrincipalTagAttributeMapInput] (val x: Self) extends AnyVal {
    
    inline def setIdentityPoolId(value: String): Self = StObject.set(x, "IdentityPoolId", value.asInstanceOf[js.Any])
    
    inline def setIdentityPoolIdUndefined: Self = StObject.set(x, "IdentityPoolId", js.undefined)
    
    inline def setIdentityProviderName(value: String): Self = StObject.set(x, "IdentityProviderName", value.asInstanceOf[js.Any])
    
    inline def setIdentityProviderNameUndefined: Self = StObject.set(x, "IdentityProviderName", js.undefined)
  }
}
