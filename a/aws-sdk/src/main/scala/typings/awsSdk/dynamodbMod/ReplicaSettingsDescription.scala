package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplicaSettingsDescription extends StObject {
  
  /**
    * The Region name of the replica.
    */
  var RegionName: typings.awsSdk.dynamodbMod.RegionName
  
  /**
    * The read/write capacity mode of the replica.
    */
  var ReplicaBillingModeSummary: js.UndefOr[BillingModeSummary] = js.undefined
  
  /**
    * Replica global secondary index settings for the global table.
    */
  var ReplicaGlobalSecondaryIndexSettings: js.UndefOr[ReplicaGlobalSecondaryIndexSettingsDescriptionList] = js.undefined
  
  /**
    * Auto scaling settings for a global table replica's read capacity units.
    */
  var ReplicaProvisionedReadCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.undefined
  
  /**
    * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a ThrottlingException. For more information, see Specifying Read and Write Requirements in the Amazon DynamoDB Developer Guide. 
    */
  var ReplicaProvisionedReadCapacityUnits: js.UndefOr[NonNegativeLongObject] = js.undefined
  
  /**
    * Auto scaling settings for a global table replica's write capacity units.
    */
  var ReplicaProvisionedWriteCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.undefined
  
  /**
    * The maximum number of writes consumed per second before DynamoDB returns a ThrottlingException. For more information, see Specifying Read and Write Requirements in the Amazon DynamoDB Developer Guide.
    */
  var ReplicaProvisionedWriteCapacityUnits: js.UndefOr[NonNegativeLongObject] = js.undefined
  
  /**
    * The current state of the Region:    CREATING - The Region is being created.    UPDATING - The Region is being updated.    DELETING - The Region is being deleted.    ACTIVE - The Region is ready for use.  
    */
  var ReplicaStatus: js.UndefOr[typings.awsSdk.dynamodbMod.ReplicaStatus] = js.undefined
}
object ReplicaSettingsDescription {
  
  @scala.inline
  def apply(RegionName: RegionName): ReplicaSettingsDescription = {
    val __obj = js.Dynamic.literal(RegionName = RegionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicaSettingsDescription]
  }
  
  @scala.inline
  implicit class ReplicaSettingsDescriptionMutableBuilder[Self <: ReplicaSettingsDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRegionName(value: RegionName): Self = StObject.set(x, "RegionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicaBillingModeSummary(value: BillingModeSummary): Self = StObject.set(x, "ReplicaBillingModeSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicaBillingModeSummaryUndefined: Self = StObject.set(x, "ReplicaBillingModeSummary", js.undefined)
    
    @scala.inline
    def setReplicaGlobalSecondaryIndexSettings(value: ReplicaGlobalSecondaryIndexSettingsDescriptionList): Self = StObject.set(x, "ReplicaGlobalSecondaryIndexSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicaGlobalSecondaryIndexSettingsUndefined: Self = StObject.set(x, "ReplicaGlobalSecondaryIndexSettings", js.undefined)
    
    @scala.inline
    def setReplicaGlobalSecondaryIndexSettingsVarargs(value: ReplicaGlobalSecondaryIndexSettingsDescription*): Self = StObject.set(x, "ReplicaGlobalSecondaryIndexSettings", js.Array(value :_*))
    
    @scala.inline
    def setReplicaProvisionedReadCapacityAutoScalingSettings(value: AutoScalingSettingsDescription): Self = StObject.set(x, "ReplicaProvisionedReadCapacityAutoScalingSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicaProvisionedReadCapacityAutoScalingSettingsUndefined: Self = StObject.set(x, "ReplicaProvisionedReadCapacityAutoScalingSettings", js.undefined)
    
    @scala.inline
    def setReplicaProvisionedReadCapacityUnits(value: NonNegativeLongObject): Self = StObject.set(x, "ReplicaProvisionedReadCapacityUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicaProvisionedReadCapacityUnitsUndefined: Self = StObject.set(x, "ReplicaProvisionedReadCapacityUnits", js.undefined)
    
    @scala.inline
    def setReplicaProvisionedWriteCapacityAutoScalingSettings(value: AutoScalingSettingsDescription): Self = StObject.set(x, "ReplicaProvisionedWriteCapacityAutoScalingSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicaProvisionedWriteCapacityAutoScalingSettingsUndefined: Self = StObject.set(x, "ReplicaProvisionedWriteCapacityAutoScalingSettings", js.undefined)
    
    @scala.inline
    def setReplicaProvisionedWriteCapacityUnits(value: NonNegativeLongObject): Self = StObject.set(x, "ReplicaProvisionedWriteCapacityUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicaProvisionedWriteCapacityUnitsUndefined: Self = StObject.set(x, "ReplicaProvisionedWriteCapacityUnits", js.undefined)
    
    @scala.inline
    def setReplicaStatus(value: ReplicaStatus): Self = StObject.set(x, "ReplicaStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicaStatusUndefined: Self = StObject.set(x, "ReplicaStatus", js.undefined)
  }
}
