package typings.awsSdk.groundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataflowEndpointListItem extends StObject {
  
  /**
    * ARN of a dataflow endpoint group.
    */
  var dataflowEndpointGroupArn: js.UndefOr[DataflowEndpointGroupArn] = js.undefined
  
  /**
    * UUID of a dataflow endpoint group.
    */
  var dataflowEndpointGroupId: js.UndefOr[String] = js.undefined
}
object DataflowEndpointListItem {
  
  @scala.inline
  def apply(): DataflowEndpointListItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataflowEndpointListItem]
  }
  
  @scala.inline
  implicit class DataflowEndpointListItemMutableBuilder[Self <: DataflowEndpointListItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataflowEndpointGroupArn(value: DataflowEndpointGroupArn): Self = StObject.set(x, "dataflowEndpointGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataflowEndpointGroupArnUndefined: Self = StObject.set(x, "dataflowEndpointGroupArn", js.undefined)
    
    @scala.inline
    def setDataflowEndpointGroupId(value: String): Self = StObject.set(x, "dataflowEndpointGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataflowEndpointGroupIdUndefined: Self = StObject.set(x, "dataflowEndpointGroupId", js.undefined)
  }
}
