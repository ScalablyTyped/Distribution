package typings.awsSdkClientCognitoIdentity.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListIdentitiesResponse extends StObject {
  
  /**
    * <p>An object containing a set of identities and associated mappings.</p>
    */
  var Identities: js.UndefOr[js.Array[IdentityDescription]] = js.undefined
  
  /**
    * <p>An identity pool ID in the format REGION:GUID.</p>
    */
  var IdentityPoolId: js.UndefOr[String] = js.undefined
  
  /**
    * <p>A pagination token.</p>
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListIdentitiesResponse {
  
  inline def apply(): ListIdentitiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListIdentitiesResponse]
  }
  
  extension [Self <: ListIdentitiesResponse](x: Self) {
    
    inline def setIdentities(value: js.Array[IdentityDescription]): Self = StObject.set(x, "Identities", value.asInstanceOf[js.Any])
    
    inline def setIdentitiesUndefined: Self = StObject.set(x, "Identities", js.undefined)
    
    inline def setIdentitiesVarargs(value: IdentityDescription*): Self = StObject.set(x, "Identities", js.Array(value*))
    
    inline def setIdentityPoolId(value: String): Self = StObject.set(x, "IdentityPoolId", value.asInstanceOf[js.Any])
    
    inline def setIdentityPoolIdUndefined: Self = StObject.set(x, "IdentityPoolId", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
