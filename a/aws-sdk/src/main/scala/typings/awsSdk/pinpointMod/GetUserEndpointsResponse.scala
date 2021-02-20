package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetUserEndpointsResponse extends StObject {
  
  var EndpointsResponse: typings.awsSdk.pinpointMod.EndpointsResponse = js.native
}
object GetUserEndpointsResponse {
  
  @scala.inline
  def apply(EndpointsResponse: EndpointsResponse): GetUserEndpointsResponse = {
    val __obj = js.Dynamic.literal(EndpointsResponse = EndpointsResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUserEndpointsResponse]
  }
  
  @scala.inline
  implicit class GetUserEndpointsResponseMutableBuilder[Self <: GetUserEndpointsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpointsResponse(value: EndpointsResponse): Self = StObject.set(x, "EndpointsResponse", value.asInstanceOf[js.Any])
  }
}
