package typings.awsSdkClientCognitoIdentity.models0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentityPoolShortDescription extends StObject {
  
  /**
    * <p>An identity pool ID in the format REGION:GUID.</p>
    */
  var IdentityPoolId: js.UndefOr[String] = js.undefined
  
  /**
    * <p>A string that you provide.</p>
    */
  var IdentityPoolName: js.UndefOr[String] = js.undefined
}
object IdentityPoolShortDescription {
  
  inline def apply(): IdentityPoolShortDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityPoolShortDescription]
  }
  
  @JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "IdentityPoolShortDescription")
  @js.native
  val ^ : js.Any = js.native
  
  inline def filterSensitiveLog(obj: IdentityPoolShortDescription): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("filterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  extension [Self <: IdentityPoolShortDescription](x: Self) {
    
    inline def setIdentityPoolId(value: String): Self = StObject.set(x, "IdentityPoolId", value.asInstanceOf[js.Any])
    
    inline def setIdentityPoolIdUndefined: Self = StObject.set(x, "IdentityPoolId", js.undefined)
    
    inline def setIdentityPoolName(value: String): Self = StObject.set(x, "IdentityPoolName", value.asInstanceOf[js.Any])
    
    inline def setIdentityPoolNameUndefined: Self = StObject.set(x, "IdentityPoolName", js.undefined)
  }
}
