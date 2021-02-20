package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetEndpointResponse extends StObject {
  
  var EndpointResponse: typings.awsSdk.pinpointMod.EndpointResponse = js.native
}
object GetEndpointResponse {
  
  @scala.inline
  def apply(EndpointResponse: EndpointResponse): GetEndpointResponse = {
    val __obj = js.Dynamic.literal(EndpointResponse = EndpointResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEndpointResponse]
  }
  
  @scala.inline
  implicit class GetEndpointResponseMutableBuilder[Self <: GetEndpointResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpointResponse(value: EndpointResponse): Self = StObject.set(x, "EndpointResponse", value.asInstanceOf[js.Any])
  }
}
