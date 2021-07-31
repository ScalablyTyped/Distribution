package typings.awsSdk.groundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataflowEndpointGroupIdResponse extends StObject {
  
  /**
    * UUID of a dataflow endpoint group.
    */
  var dataflowEndpointGroupId: js.UndefOr[String] = js.undefined
}
object DataflowEndpointGroupIdResponse {
  
  @scala.inline
  def apply(): DataflowEndpointGroupIdResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataflowEndpointGroupIdResponse]
  }
  
  @scala.inline
  implicit class DataflowEndpointGroupIdResponseMutableBuilder[Self <: DataflowEndpointGroupIdResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataflowEndpointGroupId(value: String): Self = StObject.set(x, "dataflowEndpointGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataflowEndpointGroupIdUndefined: Self = StObject.set(x, "dataflowEndpointGroupId", js.undefined)
  }
}
