package typings.awsSdk.globalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateEndpointGroupResponse extends StObject {
  
  /**
    * The information about the endpoint group that was created.
    */
  var EndpointGroup: js.UndefOr[typings.awsSdk.globalacceleratorMod.EndpointGroup] = js.native
}
object CreateEndpointGroupResponse {
  
  @scala.inline
  def apply(): CreateEndpointGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateEndpointGroupResponse]
  }
  
  @scala.inline
  implicit class CreateEndpointGroupResponseMutableBuilder[Self <: CreateEndpointGroupResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpointGroup(value: EndpointGroup): Self = StObject.set(x, "EndpointGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointGroupUndefined: Self = StObject.set(x, "EndpointGroup", js.undefined)
  }
}
