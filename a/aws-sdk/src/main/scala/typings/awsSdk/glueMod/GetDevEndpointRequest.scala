package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDevEndpointRequest extends StObject {
  
  /**
    * Name of the DevEndpoint to retrieve information for.
    */
  var EndpointName: GenericString = js.native
}
object GetDevEndpointRequest {
  
  @scala.inline
  def apply(EndpointName: GenericString): GetDevEndpointRequest = {
    val __obj = js.Dynamic.literal(EndpointName = EndpointName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDevEndpointRequest]
  }
  
  @scala.inline
  implicit class GetDevEndpointRequestMutableBuilder[Self <: GetDevEndpointRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpointName(value: GenericString): Self = StObject.set(x, "EndpointName", value.asInstanceOf[js.Any])
  }
}
