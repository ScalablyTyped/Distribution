package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplicaSettingsUpdate extends StObject {
  
  /**
    * The Region of the replica to be added.
    */
  var RegionName: typings.awsSdk.dynamodbMod.RegionName
  
  /**
    * Represents the settings of a global secondary index for a global table that will be modified.
    */
  var ReplicaGlobalSecondaryIndexSettingsUpdate: js.UndefOr[ReplicaGlobalSecondaryIndexSettingsUpdateList] = js.undefined
  
  /**
    * Auto scaling settings for managing a global table replica's read capacity units.
    */
  var ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate: js.UndefOr[AutoScalingSettingsUpdate] = js.undefined
  
  /**
    * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a ThrottlingException. For more information, see Specifying Read and Write Requirements in the Amazon DynamoDB Developer Guide. 
    */
  var ReplicaProvisionedReadCapacityUnits: js.UndefOr[PositiveLongObject] = js.undefined
}
object ReplicaSettingsUpdate {
  
  @scala.inline
  def apply(RegionName: RegionName): ReplicaSettingsUpdate = {
    val __obj = js.Dynamic.literal(RegionName = RegionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicaSettingsUpdate]
  }
  
  @scala.inline
  implicit class ReplicaSettingsUpdateMutableBuilder[Self <: ReplicaSettingsUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRegionName(value: RegionName): Self = StObject.set(x, "RegionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicaGlobalSecondaryIndexSettingsUpdate(value: ReplicaGlobalSecondaryIndexSettingsUpdateList): Self = StObject.set(x, "ReplicaGlobalSecondaryIndexSettingsUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicaGlobalSecondaryIndexSettingsUpdateUndefined: Self = StObject.set(x, "ReplicaGlobalSecondaryIndexSettingsUpdate", js.undefined)
    
    @scala.inline
    def setReplicaGlobalSecondaryIndexSettingsUpdateVarargs(value: ReplicaGlobalSecondaryIndexSettingsUpdate*): Self = StObject.set(x, "ReplicaGlobalSecondaryIndexSettingsUpdate", js.Array(value :_*))
    
    @scala.inline
    def setReplicaProvisionedReadCapacityAutoScalingSettingsUpdate(value: AutoScalingSettingsUpdate): Self = StObject.set(x, "ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicaProvisionedReadCapacityAutoScalingSettingsUpdateUndefined: Self = StObject.set(x, "ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate", js.undefined)
    
    @scala.inline
    def setReplicaProvisionedReadCapacityUnits(value: PositiveLongObject): Self = StObject.set(x, "ReplicaProvisionedReadCapacityUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicaProvisionedReadCapacityUnitsUndefined: Self = StObject.set(x, "ReplicaProvisionedReadCapacityUnits", js.undefined)
  }
}
