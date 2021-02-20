package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndpointsResponse extends StObject {
  
  /**
    * An array of responses, one for each endpoint that's associated with the user ID.
    */
  var Item: ListOfEndpointResponse = js.native
}
object EndpointsResponse {
  
  @scala.inline
  def apply(Item: ListOfEndpointResponse): EndpointsResponse = {
    val __obj = js.Dynamic.literal(Item = Item.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointsResponse]
  }
  
  @scala.inline
  implicit class EndpointsResponseMutableBuilder[Self <: EndpointsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItem(value: ListOfEndpointResponse): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemVarargs(value: EndpointResponse*): Self = StObject.set(x, "Item", js.Array(value :_*))
  }
}
