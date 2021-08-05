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
  
  inline def apply(dataflowEndpointGroupId: String): GetDataflowEndpointGroupRequest = {
    val __obj = js.Dynamic.literal(dataflowEndpointGroupId = dataflowEndpointGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDataflowEndpointGroupRequest]
  }
  
  extension [Self <: GetDataflowEndpointGroupRequest](x: Self) {
    
    inline def setDataflowEndpointGroupId(value: String): Self = StObject.set(x, "dataflowEndpointGroupId", value.asInstanceOf[js.Any])
  }
}
