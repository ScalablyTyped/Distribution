package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplicaAutoScalingDescription extends StObject {
  
  /**
    * Replica-specific global secondary index auto scaling settings.
    */
  var GlobalSecondaryIndexes: js.UndefOr[ReplicaGlobalSecondaryIndexAutoScalingDescriptionList] = js.native
  
  /**
    * The Region where the replica exists.
    */
  var RegionName: js.UndefOr[typings.awsSdk.dynamodbMod.RegionName] = js.native
  
  var ReplicaProvisionedReadCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.native
  
  var ReplicaProvisionedWriteCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.native
  
  /**
    * The current state of the replica:    CREATING - The replica is being created.    UPDATING - The replica is being updated.    DELETING - The replica is being deleted.    ACTIVE - The replica is ready for use.  
    */
  var ReplicaStatus: js.UndefOr[typings.awsSdk.dynamodbMod.ReplicaStatus] = js.native
}
object ReplicaAutoScalingDescription {
  
  @scala.inline
  def apply(): ReplicaAutoScalingDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicaAutoScalingDescription]
  }
  
  @scala.inline
  implicit class ReplicaAutoScalingDescriptionMutableBuilder[Self <: ReplicaAutoScalingDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGlobalSecondaryIndexes(value: ReplicaGlobalSecondaryIndexAutoScalingDescriptionList): Self = StObject.set(x, "GlobalSecondaryIndexes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalSecondaryIndexesUndefined: Self = StObject.set(x, "GlobalSecondaryIndexes", js.undefined)
    
    @scala.inline
    def setGlobalSecondaryIndexesVarargs(value: ReplicaGlobalSecondaryIndexAutoScalingDescription*): Self = StObject.set(x, "GlobalSecondaryIndexes", js.Array(value :_*))
    
    @scala.inline
    def setRegionName(value: RegionName): Self = StObject.set(x, "RegionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionNameUndefined: Self = StObject.set(x, "RegionName", js.undefined)
    
    @scala.inline
    def setReplicaProvisionedReadCapacityAutoScalingSettings(value: AutoScalingSettingsDescription): Self = StObject.set(x, "ReplicaProvisionedReadCapacityAutoScalingSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicaProvisionedReadCapacityAutoScalingSettingsUndefined: Self = StObject.set(x, "ReplicaProvisionedReadCapacityAutoScalingSettings", js.undefined)
    
    @scala.inline
    def setReplicaProvisionedWriteCapacityAutoScalingSettings(value: AutoScalingSettingsDescription): Self = StObject.set(x, "ReplicaProvisionedWriteCapacityAutoScalingSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicaProvisionedWriteCapacityAutoScalingSettingsUndefined: Self = StObject.set(x, "ReplicaProvisionedWriteCapacityAutoScalingSettings", js.undefined)
    
    @scala.inline
    def setReplicaStatus(value: ReplicaStatus): Self = StObject.set(x, "ReplicaStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicaStatusUndefined: Self = StObject.set(x, "ReplicaStatus", js.undefined)
  }
}
