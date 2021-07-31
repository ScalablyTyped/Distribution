package typings.awsSdkClientCognitoIdentity.models0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeIdentityPoolInput extends StObject {
  
  /**
    * <p>An identity pool ID in the format REGION:GUID.</p>
    */
  var IdentityPoolId: js.UndefOr[String] = js.undefined
}
object DescribeIdentityPoolInput {
  
  @scala.inline
  def apply(): DescribeIdentityPoolInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeIdentityPoolInput]
  }
  
  @JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "DescribeIdentityPoolInput")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def filterSensitiveLog(obj: DescribeIdentityPoolInput): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("filterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  implicit class DescribeIdentityPoolInputMutableBuilder[Self <: DescribeIdentityPoolInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentityPoolId(value: String): Self = StObject.set(x, "IdentityPoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityPoolIdUndefined: Self = StObject.set(x, "IdentityPoolId", js.undefined)
  }
}
