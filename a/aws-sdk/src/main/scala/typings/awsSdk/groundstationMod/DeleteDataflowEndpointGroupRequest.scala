package typings.awsSdk.groundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDataflowEndpointGroupRequest extends StObject {
  
  /**
    * UUID of a dataflow endpoint group.
    */
  var dataflowEndpointGroupId: String = js.native
}
object DeleteDataflowEndpointGroupRequest {
  
  @scala.inline
  def apply(dataflowEndpointGroupId: String): DeleteDataflowEndpointGroupRequest = {
    val __obj = js.Dynamic.literal(dataflowEndpointGroupId = dataflowEndpointGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDataflowEndpointGroupRequest]
  }
  
  @scala.inline
  implicit class DeleteDataflowEndpointGroupRequestMutableBuilder[Self <: DeleteDataflowEndpointGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataflowEndpointGroupId(value: String): Self = StObject.set(x, "dataflowEndpointGroupId", value.asInstanceOf[js.Any])
  }
}
