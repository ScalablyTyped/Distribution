package typings.awsSdkClientCognitoIdentity.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetIdentityPoolRolesInput extends StObject {
  
  /**
    * <p>An identity pool ID in the format REGION:GUID.</p>
    */
  var IdentityPoolId: js.UndefOr[String] = js.undefined
}
object GetIdentityPoolRolesInput {
  
  inline def apply(): GetIdentityPoolRolesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetIdentityPoolRolesInput]
  }
  
  extension [Self <: GetIdentityPoolRolesInput](x: Self) {
    
    inline def setIdentityPoolId(value: String): Self = StObject.set(x, "IdentityPoolId", value.asInstanceOf[js.Any])
    
    inline def setIdentityPoolIdUndefined: Self = StObject.set(x, "IdentityPoolId", js.undefined)
  }
}
