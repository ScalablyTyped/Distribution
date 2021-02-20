package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetDefaultAuthorizerRequest extends StObject {
  
  /**
    * The authorizer name.
    */
  var authorizerName: AuthorizerName = js.native
}
object SetDefaultAuthorizerRequest {
  
  @scala.inline
  def apply(authorizerName: AuthorizerName): SetDefaultAuthorizerRequest = {
    val __obj = js.Dynamic.literal(authorizerName = authorizerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetDefaultAuthorizerRequest]
  }
  
  @scala.inline
  implicit class SetDefaultAuthorizerRequestMutableBuilder[Self <: SetDefaultAuthorizerRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorizerName(value: AuthorizerName): Self = StObject.set(x, "authorizerName", value.asInstanceOf[js.Any])
  }
}
