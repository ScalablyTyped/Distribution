package typings.awsSdkClientCognitoIdentity.models0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MergeDeveloperIdentitiesResponse extends StObject {
  
  /**
    * <p>A unique identifier in the format REGION:GUID.</p>
    */
  var IdentityId: js.UndefOr[String] = js.undefined
}
object MergeDeveloperIdentitiesResponse {
  
  inline def apply(): MergeDeveloperIdentitiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MergeDeveloperIdentitiesResponse]
  }
  
  @JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "MergeDeveloperIdentitiesResponse")
  @js.native
  val ^ : js.Any = js.native
  
  inline def filterSensitiveLog(obj: MergeDeveloperIdentitiesResponse): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("filterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  extension [Self <: MergeDeveloperIdentitiesResponse](x: Self) {
    
    inline def setIdentityId(value: String): Self = StObject.set(x, "IdentityId", value.asInstanceOf[js.Any])
    
    inline def setIdentityIdUndefined: Self = StObject.set(x, "IdentityId", js.undefined)
  }
}
