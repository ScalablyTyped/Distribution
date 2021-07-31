package typings.awsSdk.groundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDataflowEndpointGroupRequest extends StObject {
  
  /**
    * UUID of a dataflow endpoint group.
    */
  var dataflowEndpointGroupId: String
}
object GetDataflowEndpointGroupRequest {
  
  @scala.inline
  def apply(dataflowEndpointGroupId: String): GetDataflowEndpointGroupRequest = {
    val __obj = js.Dynamic.literal(dataflowEndpointGroupId = dataflowEndpointGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDataflowEndpointGroupRequest]
  }
  
  @scala.inline
  implicit class GetDataflowEndpointGroupRequestMutableBuilder[Self <: GetDataflowEndpointGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataflowEndpointGroupId(value: String): Self = StObject.set(x, "dataflowEndpointGroupId", value.asInstanceOf[js.Any])
  }
}
