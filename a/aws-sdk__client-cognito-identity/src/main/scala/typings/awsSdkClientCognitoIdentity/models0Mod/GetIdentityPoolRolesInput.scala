package typings.awsSdkClientCognitoIdentity.models0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetIdentityPoolRolesInput extends StObject {
  
  /**
    * <p>An identity pool ID in the format REGION:GUID.</p>
    */
  var IdentityPoolId: js.UndefOr[String] = js.native
}
object GetIdentityPoolRolesInput {
  
  @scala.inline
  def apply(): GetIdentityPoolRolesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetIdentityPoolRolesInput]
  }
  
  @JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "GetIdentityPoolRolesInput.filterSensitiveLog")
  @js.native
  def filterSensitiveLog(obj: GetIdentityPoolRolesInput): js.Any = js.native
  
  @scala.inline
  implicit class GetIdentityPoolRolesInputMutableBuilder[Self <: GetIdentityPoolRolesInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentityPoolId(value: String): Self = StObject.set(x, "IdentityPoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityPoolIdUndefined: Self = StObject.set(x, "IdentityPoolId", js.undefined)
  }
}
