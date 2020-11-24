package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateFleetAttributesInput extends js.Object {
  
  /**
    * Human-readable description of a fleet.
    */
  var Description: js.UndefOr[NonZeroAndMaxString] = js.native
  
  /**
    * A unique identifier for a fleet to update attribute metadata for. You can use either the fleet ID or ARN value.
    */
  var FleetId: FleetIdOrArn = js.native
  
  /**
    * Names of metric groups to include this fleet in. Amazon CloudWatch uses a fleet metric group is to aggregate metrics from multiple fleets. Use an existing metric group name to add this fleet to the group. Or use a new name to create a new metric group. A fleet can only be included in one metric group at a time.
    */
  var MetricGroups: js.UndefOr[MetricGroupList] = js.native
  
  /**
    * A descriptive label that is associated with a fleet. Fleet names do not need to be unique.
    */
  var Name: js.UndefOr[NonZeroAndMaxString] = js.native
  
  /**
    * Game session protection policy to apply to all new instances created in this fleet. Instances that already exist are not affected. You can set protection for individual instances using UpdateGameSession.    NoProtection -- The game session can be terminated during a scale-down event.    FullProtection -- If the game session is in an ACTIVE status, it cannot be terminated during a scale-down event.  
    */
  var NewGameSessionProtectionPolicy: js.UndefOr[ProtectionPolicy] = js.native
  
  /**
    * Policy that limits the number of game sessions an individual player can create over a span of time. 
    */
  var ResourceCreationLimitPolicy: js.UndefOr[typings.awsSdk.gameliftMod.ResourceCreationLimitPolicy] = js.native
}
object UpdateFleetAttributesInput {
  
  @scala.inline
  def apply(FleetId: FleetIdOrArn): UpdateFleetAttributesInput = {
    val __obj = js.Dynamic.literal(FleetId = FleetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFleetAttributesInput]
  }
  
  @scala.inline
  implicit class UpdateFleetAttributesInputOps[Self <: UpdateFleetAttributesInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFleetId(value: FleetIdOrArn): Self = this.set("FleetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: NonZeroAndMaxString): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setMetricGroupsVarargs(value: MetricGroup*): Self = this.set("MetricGroups", js.Array(value :_*))
    
    @scala.inline
    def setMetricGroups(value: MetricGroupList): Self = this.set("MetricGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetricGroups: Self = this.set("MetricGroups", js.undefined)
    
    @scala.inline
    def setName(value: NonZeroAndMaxString): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setNewGameSessionProtectionPolicy(value: ProtectionPolicy): Self = this.set("NewGameSessionProtectionPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewGameSessionProtectionPolicy: Self = this.set("NewGameSessionProtectionPolicy", js.undefined)
    
    @scala.inline
    def setResourceCreationLimitPolicy(value: ResourceCreationLimitPolicy): Self = this.set("ResourceCreationLimitPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceCreationLimitPolicy: Self = this.set("ResourceCreationLimitPolicy", js.undefined)
  }
}
