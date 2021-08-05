package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFleetCapacityInput extends StObject {
  
  /**
    * Number of EC2 instances you want this fleet to host.
    */
  var DesiredInstances: js.UndefOr[WholeNumber] = js.undefined
  
  /**
    * A unique identifier for a fleet to update capacity for. You can use either the fleet ID or ARN value.
    */
  var FleetId: FleetIdOrArn
  
  /**
    * The maximum value allowed for the fleet's instance count. Default if not set is 1.
    */
  var MaxSize: js.UndefOr[WholeNumber] = js.undefined
  
  /**
    * The minimum value allowed for the fleet's instance count. Default if not set is 0.
    */
  var MinSize: js.UndefOr[WholeNumber] = js.undefined
}
object UpdateFleetCapacityInput {
  
  inline def apply(FleetId: FleetIdOrArn): UpdateFleetCapacityInput = {
    val __obj = js.Dynamic.literal(FleetId = FleetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFleetCapacityInput]
  }
  
  extension [Self <: UpdateFleetCapacityInput](x: Self) {
    
    inline def setDesiredInstances(value: WholeNumber): Self = StObject.set(x, "DesiredInstances", value.asInstanceOf[js.Any])
    
    inline def setDesiredInstancesUndefined: Self = StObject.set(x, "DesiredInstances", js.undefined)
    
    inline def setFleetId(value: FleetIdOrArn): Self = StObject.set(x, "FleetId", value.asInstanceOf[js.Any])
    
    inline def setMaxSize(value: WholeNumber): Self = StObject.set(x, "MaxSize", value.asInstanceOf[js.Any])
    
    inline def setMaxSizeUndefined: Self = StObject.set(x, "MaxSize", js.undefined)
    
    inline def setMinSize(value: WholeNumber): Self = StObject.set(x, "MinSize", value.asInstanceOf[js.Any])
    
    inline def setMinSizeUndefined: Self = StObject.set(x, "MinSize", js.undefined)
  }
}
