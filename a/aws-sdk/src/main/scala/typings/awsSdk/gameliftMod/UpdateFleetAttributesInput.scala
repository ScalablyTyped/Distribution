package typings.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFleetAttributesInput extends StObject {
  
  /**
    * Human-readable description of a fleet.
    */
  var Description: js.UndefOr[NonZeroAndMaxString] = js.undefined
  
  /**
    * A unique identifier for a fleet to update attribute metadata for. You can use either the fleet ID or ARN value.
    */
  var FleetId: FleetIdOrArn
  
  /**
    * Names of metric groups to include this fleet in. Amazon CloudWatch uses a fleet metric group is to aggregate metrics from multiple fleets. Use an existing metric group name to add this fleet to the group. Or use a new name to create a new metric group. A fleet can only be included in one metric group at a time.
    */
  var MetricGroups: js.UndefOr[MetricGroupList] = js.undefined
  
  /**
    * A descriptive label that is associated with a fleet. Fleet names do not need to be unique.
    */
  var Name: js.UndefOr[NonZeroAndMaxString] = js.undefined
  
  /**
    * Game session protection policy to apply to all new instances created in this fleet. Instances that already exist are not affected. You can set protection for individual instances using UpdateGameSession.    NoProtection -- The game session can be terminated during a scale-down event.    FullProtection -- If the game session is in an ACTIVE status, it cannot be terminated during a scale-down event.  
    */
  var NewGameSessionProtectionPolicy: js.UndefOr[ProtectionPolicy] = js.undefined
  
  /**
    * Policy that limits the number of game sessions an individual player can create over a span of time. 
    */
  var ResourceCreationLimitPolicy: js.UndefOr[typings.awsSdk.gameliftMod.ResourceCreationLimitPolicy] = js.undefined
}
object UpdateFleetAttributesInput {
  
  inline def apply(FleetId: FleetIdOrArn): UpdateFleetAttributesInput = {
    val __obj = js.Dynamic.literal(FleetId = FleetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFleetAttributesInput]
  }
  
  extension [Self <: UpdateFleetAttributesInput](x: Self) {
    
    inline def setDescription(value: NonZeroAndMaxString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setFleetId(value: FleetIdOrArn): Self = StObject.set(x, "FleetId", value.asInstanceOf[js.Any])
    
    inline def setMetricGroups(value: MetricGroupList): Self = StObject.set(x, "MetricGroups", value.asInstanceOf[js.Any])
    
    inline def setMetricGroupsUndefined: Self = StObject.set(x, "MetricGroups", js.undefined)
    
    inline def setMetricGroupsVarargs(value: MetricGroup*): Self = StObject.set(x, "MetricGroups", js.Array(value :_*))
    
    inline def setName(value: NonZeroAndMaxString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setNewGameSessionProtectionPolicy(value: ProtectionPolicy): Self = StObject.set(x, "NewGameSessionProtectionPolicy", value.asInstanceOf[js.Any])
    
    inline def setNewGameSessionProtectionPolicyUndefined: Self = StObject.set(x, "NewGameSessionProtectionPolicy", js.undefined)
    
    inline def setResourceCreationLimitPolicy(value: ResourceCreationLimitPolicy): Self = StObject.set(x, "ResourceCreationLimitPolicy", value.asInstanceOf[js.Any])
    
    inline def setResourceCreationLimitPolicyUndefined: Self = StObject.set(x, "ResourceCreationLimitPolicy", js.undefined)
  }
}
