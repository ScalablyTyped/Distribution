package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDefaultAuthorizerResponse extends StObject {
  
  /**
    * The default authorizer's description.
    */
  var authorizerDescription: js.UndefOr[AuthorizerDescription] = js.native
}
object DescribeDefaultAuthorizerResponse {
  
  @scala.inline
  def apply(): DescribeDefaultAuthorizerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDefaultAuthorizerResponse]
  }
  
  @scala.inline
  implicit class DescribeDefaultAuthorizerResponseMutableBuilder[Self <: DescribeDefaultAuthorizerResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorizerDescription(value: AuthorizerDescription): Self = StObject.set(x, "authorizerDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizerDescriptionUndefined: Self = StObject.set(x, "authorizerDescription", js.undefined)
  }
}
