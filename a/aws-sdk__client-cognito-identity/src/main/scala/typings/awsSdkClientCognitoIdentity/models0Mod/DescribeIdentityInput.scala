package typings.awsSdkClientCognitoIdentity.models0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeIdentityInput extends StObject {
  
  /**
    * <p>A unique identifier in the format REGION:GUID.</p>
    */
  var IdentityId: js.UndefOr[String] = js.native
}
object DescribeIdentityInput {
  
  @scala.inline
  def apply(): DescribeIdentityInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeIdentityInput]
  }
  
  @JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "DescribeIdentityInput.filterSensitiveLog")
  @js.native
  def filterSensitiveLog(obj: DescribeIdentityInput): js.Any = js.native
  
  @scala.inline
  implicit class DescribeIdentityInputMutableBuilder[Self <: DescribeIdentityInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentityId(value: String): Self = StObject.set(x, "IdentityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityIdUndefined: Self = StObject.set(x, "IdentityId", js.undefined)
  }
}
