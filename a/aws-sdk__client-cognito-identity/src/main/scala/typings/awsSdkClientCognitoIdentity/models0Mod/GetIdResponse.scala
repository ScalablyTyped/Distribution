package typings.awsSdkClientCognitoIdentity.models0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetIdResponse extends StObject {
  
  /**
    * <p>A unique identifier in the format REGION:GUID.</p>
    */
  var IdentityId: js.UndefOr[String] = js.undefined
}
object GetIdResponse {
  
  @scala.inline
  def apply(): GetIdResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetIdResponse]
  }
  
  @JSImport("@aws-sdk/client-cognito-identity/types/models/models_0", "GetIdResponse")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def filterSensitiveLog(obj: GetIdResponse): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("filterSensitiveLog")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  implicit class GetIdResponseMutableBuilder[Self <: GetIdResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentityId(value: String): Self = StObject.set(x, "IdentityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityIdUndefined: Self = StObject.set(x, "IdentityId", js.undefined)
  }
}
