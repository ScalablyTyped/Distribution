package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDefaultAuthorizerResponse extends StObject {
  
  /**
    * The default authorizer's description.
    */
  var authorizerDescription: js.UndefOr[AuthorizerDescription] = js.undefined
}
object DescribeDefaultAuthorizerResponse {
  
  inline def apply(): DescribeDefaultAuthorizerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDefaultAuthorizerResponse]
  }
  
  extension [Self <: DescribeDefaultAuthorizerResponse](x: Self) {
    
    inline def setAuthorizerDescription(value: AuthorizerDescription): Self = StObject.set(x, "authorizerDescription", value.asInstanceOf[js.Any])
    
    inline def setAuthorizerDescriptionUndefined: Self = StObject.set(x, "authorizerDescription", js.undefined)
  }
}
