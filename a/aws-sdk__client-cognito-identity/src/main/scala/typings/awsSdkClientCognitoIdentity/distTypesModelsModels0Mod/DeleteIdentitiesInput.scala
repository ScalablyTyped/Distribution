package typings.awsSdkClientCognitoIdentity.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteIdentitiesInput extends StObject {
  
  /**
    * <p>A list of 1-60 identities that you want to delete.</p>
    */
  var IdentityIdsToDelete: js.UndefOr[js.Array[String]] = js.undefined
}
object DeleteIdentitiesInput {
  
  inline def apply(): DeleteIdentitiesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteIdentitiesInput]
  }
  
  extension [Self <: DeleteIdentitiesInput](x: Self) {
    
    inline def setIdentityIdsToDelete(value: js.Array[String]): Self = StObject.set(x, "IdentityIdsToDelete", value.asInstanceOf[js.Any])
    
    inline def setIdentityIdsToDeleteUndefined: Self = StObject.set(x, "IdentityIdsToDelete", js.undefined)
    
    inline def setIdentityIdsToDeleteVarargs(value: String*): Self = StObject.set(x, "IdentityIdsToDelete", js.Array(value*))
  }
}
