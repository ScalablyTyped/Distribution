package typings.awsSdkClientCognitoIdentity.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteIdentitiesResponse extends StObject {
  
  /**
    * <p>An array of UnprocessedIdentityId objects, each of which contains an ErrorCode and
    *          IdentityId.</p>
    */
  var UnprocessedIdentityIds: js.UndefOr[js.Array[UnprocessedIdentityId]] = js.undefined
}
object DeleteIdentitiesResponse {
  
  inline def apply(): DeleteIdentitiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteIdentitiesResponse]
  }
  
  extension [Self <: DeleteIdentitiesResponse](x: Self) {
    
    inline def setUnprocessedIdentityIds(value: js.Array[UnprocessedIdentityId]): Self = StObject.set(x, "UnprocessedIdentityIds", value.asInstanceOf[js.Any])
    
    inline def setUnprocessedIdentityIdsUndefined: Self = StObject.set(x, "UnprocessedIdentityIds", js.undefined)
    
    inline def setUnprocessedIdentityIdsVarargs(value: UnprocessedIdentityId*): Self = StObject.set(x, "UnprocessedIdentityIds", js.Array(value*))
  }
}
