package typings.awsSdk.globalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateEndpointGroupResponse extends StObject {
  
  /**
    * The information about the endpoint group that was updated.
    */
  var EndpointGroup: js.UndefOr[typings.awsSdk.globalacceleratorMod.EndpointGroup] = js.undefined
}
object UpdateEndpointGroupResponse {
  
  @scala.inline
  def apply(): UpdateEndpointGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateEndpointGroupResponse]
  }
  
  @scala.inline
  implicit class UpdateEndpointGroupResponseMutableBuilder[Self <: UpdateEndpointGroupResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpointGroup(value: EndpointGroup): Self = StObject.set(x, "EndpointGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointGroupUndefined: Self = StObject.set(x, "EndpointGroup", js.undefined)
  }
}
