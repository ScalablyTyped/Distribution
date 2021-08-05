package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FleetCapacity extends StObject {
  
  /**
    * A unique identifier for a fleet.
    */
  var FleetId: js.UndefOr[typings.awsSdk.gameliftMod.FleetId] = js.undefined
  
  /**
    * Current status of fleet capacity.
    */
  var InstanceCounts: js.UndefOr[EC2InstanceCounts] = js.undefined
  
  /**
    * Name of an EC2 instance type that is supported in Amazon GameLift. A fleet instance type determines the computing resources of each instance in the fleet, including CPU, memory, storage, and networking capacity. Amazon GameLift supports the following EC2 instance types. See Amazon EC2 Instance Types for detailed descriptions.
    */
  var InstanceType: js.UndefOr[EC2InstanceType] = js.undefined
}
object FleetCapacity {
  
  inline def apply(): FleetCapacity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FleetCapacity]
  }
  
  extension [Self <: FleetCapacity](x: Self) {
    
    inline def setFleetId(value: FleetId): Self = StObject.set(x, "FleetId", value.asInstanceOf[js.Any])
    
    inline def setFleetIdUndefined: Self = StObject.set(x, "FleetId", js.undefined)
    
    inline def setInstanceCounts(value: EC2InstanceCounts): Self = StObject.set(x, "InstanceCounts", value.asInstanceOf[js.Any])
    
    inline def setInstanceCountsUndefined: Self = StObject.set(x, "InstanceCounts", js.undefined)
    
    inline def setInstanceType(value: EC2InstanceType): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
  }
}
