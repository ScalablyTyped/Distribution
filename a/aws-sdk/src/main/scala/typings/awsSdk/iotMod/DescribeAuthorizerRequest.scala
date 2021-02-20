package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAuthorizerRequest extends StObject {
  
  /**
    * The name of the authorizer to describe.
    */
  var authorizerName: AuthorizerName = js.native
}
object DescribeAuthorizerRequest {
  
  @scala.inline
  def apply(authorizerName: AuthorizerName): DescribeAuthorizerRequest = {
    val __obj = js.Dynamic.literal(authorizerName = authorizerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAuthorizerRequest]
  }
  
  @scala.inline
  implicit class DescribeAuthorizerRequestMutableBuilder[Self <: DescribeAuthorizerRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorizerName(value: AuthorizerName): Self = StObject.set(x, "authorizerName", value.asInstanceOf[js.Any])
  }
}
