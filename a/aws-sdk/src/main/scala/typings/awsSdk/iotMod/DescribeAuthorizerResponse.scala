package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAuthorizerResponse extends StObject {
  
  /**
    * The authorizer description.
    */
  var authorizerDescription: js.UndefOr[AuthorizerDescription] = js.undefined
}
object DescribeAuthorizerResponse {
  
  @scala.inline
  def apply(): DescribeAuthorizerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAuthorizerResponse]
  }
  
  @scala.inline
  implicit class DescribeAuthorizerResponseMutableBuilder[Self <: DescribeAuthorizerResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorizerDescription(value: AuthorizerDescription): Self = StObject.set(x, "authorizerDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizerDescriptionUndefined: Self = StObject.set(x, "authorizerDescription", js.undefined)
  }
}
