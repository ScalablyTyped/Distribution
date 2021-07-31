package typings.awsSdkClientCognitoIdentity.models0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteIdentityPoolInput extends StObject {
  
  /**
    * <p>An identity pool ID in the format REGION:GUID.</p>
    */
  var IdentityPoolId: js.UndefOr[String] = js.undefined
}
object DeleteIdentityPoolInput {
  
  @scala.inline
  def apply(): DeleteIdentityPoolInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteIdentityPoolInput]
  }
  
  @JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "DeleteIdentityPoolInput")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def filterSensitiveLog(obj: DeleteIdentityPoolInput): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("filterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  implicit class DeleteIdentityPoolInputMutableBuilder[Self <: DeleteIdentityPoolInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentityPoolId(value: String): Self = StObject.set(x, "IdentityPoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityPoolIdUndefined: Self = StObject.set(x, "IdentityPoolId", js.undefined)
  }
}
