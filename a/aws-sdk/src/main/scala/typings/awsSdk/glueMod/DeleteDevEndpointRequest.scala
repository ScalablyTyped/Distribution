package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDevEndpointRequest extends StObject {
  
  /**
    * The name of the DevEndpoint.
    */
  var EndpointName: GenericString = js.native
}
object DeleteDevEndpointRequest {
  
  @scala.inline
  def apply(EndpointName: GenericString): DeleteDevEndpointRequest = {
    val __obj = js.Dynamic.literal(EndpointName = EndpointName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDevEndpointRequest]
  }
  
  @scala.inline
  implicit class DeleteDevEndpointRequestMutableBuilder[Self <: DeleteDevEndpointRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpointName(value: GenericString): Self = StObject.set(x, "EndpointName", value.asInstanceOf[js.Any])
  }
}
