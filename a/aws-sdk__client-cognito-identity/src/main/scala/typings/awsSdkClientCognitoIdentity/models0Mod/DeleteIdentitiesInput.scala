package typings.awsSdkClientCognitoIdentity.models0Mod

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
  
  @JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "DeleteIdentitiesInput")
  @js.native
  val ^ : js.Any = js.native
  
  inline def filterSensitiveLog(obj: DeleteIdentitiesInput): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("filterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  extension [Self <: DeleteIdentitiesInput](x: Self) {
    
    inline def setIdentityIdsToDelete(value: js.Array[String]): Self = StObject.set(x, "IdentityIdsToDelete", value.asInstanceOf[js.Any])
    
    inline def setIdentityIdsToDeleteUndefined: Self = StObject.set(x, "IdentityIdsToDelete", js.undefined)
    
    inline def setIdentityIdsToDeleteVarargs(value: String*): Self = StObject.set(x, "IdentityIdsToDelete", js.Array(value :_*))
  }
}
