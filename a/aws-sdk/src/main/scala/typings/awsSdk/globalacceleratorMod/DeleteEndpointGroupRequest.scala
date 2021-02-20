package typings.awsSdk.globalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteEndpointGroupRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the endpoint group to delete.
    */
  var EndpointGroupArn: GenericString = js.native
}
object DeleteEndpointGroupRequest {
  
  @scala.inline
  def apply(EndpointGroupArn: GenericString): DeleteEndpointGroupRequest = {
    val __obj = js.Dynamic.literal(EndpointGroupArn = EndpointGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEndpointGroupRequest]
  }
  
  @scala.inline
  implicit class DeleteEndpointGroupRequestMutableBuilder[Self <: DeleteEndpointGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpointGroupArn(value: GenericString): Self = StObject.set(x, "EndpointGroupArn", value.asInstanceOf[js.Any])
  }
}
