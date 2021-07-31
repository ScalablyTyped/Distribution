package typings.awsSdkClientCognitoIdentity.models0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeIdentityInput extends StObject {
  
  /**
    * <p>A unique identifier in the format REGION:GUID.</p>
    */
  var IdentityId: js.UndefOr[String] = js.undefined
}
object DescribeIdentityInput {
  
  @scala.inline
  def apply(): DescribeIdentityInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeIdentityInput]
  }
  
  @JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "DescribeIdentityInput")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def filterSensitiveLog(obj: DescribeIdentityInput): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("filterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  implicit class DescribeIdentityInputMutableBuilder[Self <: DescribeIdentityInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentityId(value: String): Self = StObject.set(x, "IdentityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityIdUndefined: Self = StObject.set(x, "IdentityId", js.undefined)
  }
}
