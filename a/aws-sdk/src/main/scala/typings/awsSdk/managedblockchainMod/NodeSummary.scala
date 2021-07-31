package typings.awsSdk.managedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeSummary extends StObject {
  
  /**
    * The Availability Zone in which the node exists.
    */
  var AvailabilityZone: js.UndefOr[AvailabilityZoneString] = js.undefined
  
  /**
    * The date and time that the node was created.
    */
  var CreationDate: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The unique identifier of the node.
    */
  var Id: js.UndefOr[ResourceIdString] = js.undefined
  
  /**
    * The EC2 instance type for the node.
    */
  var InstanceType: js.UndefOr[InstanceTypeString] = js.undefined
  
  /**
    * The status of the node.
    */
  var Status: js.UndefOr[NodeStatus] = js.undefined
}
object NodeSummary {
  
  @scala.inline
  def apply(): NodeSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeSummary]
  }
  
  @scala.inline
  implicit class NodeSummaryMutableBuilder[Self <: NodeSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailabilityZone(value: AvailabilityZoneString): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    @scala.inline
    def setCreationDate(value: Timestamp): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    @scala.inline
    def setId(value: ResourceIdString): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setInstanceType(value: InstanceTypeString): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    @scala.inline
    def setStatus(value: NodeStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
