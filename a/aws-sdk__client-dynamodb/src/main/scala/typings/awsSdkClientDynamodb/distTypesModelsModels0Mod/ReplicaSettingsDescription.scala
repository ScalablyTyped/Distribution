package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplicaSettingsDescription extends StObject {
  
  /**
    * <p>The Region name of the replica.</p>
    */
  var RegionName: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The read/write capacity mode of the replica.</p>
    */
  var ReplicaBillingModeSummary: js.UndefOr[BillingModeSummary] = js.undefined
  
  /**
    * <p>Replica global secondary index settings for the global table.</p>
    */
  var ReplicaGlobalSecondaryIndexSettings: js.UndefOr[js.Array[ReplicaGlobalSecondaryIndexSettingsDescription]] = js.undefined
  
  /**
    * <p>Auto scaling settings for a global table replica's read capacity units.</p>
    */
  var ReplicaProvisionedReadCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.undefined
  
  /**
    * <p>The maximum number of strongly consistent reads consumed per second before DynamoDB
    *             returns a <code>ThrottlingException</code>. For more information, see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput">Specifying Read and Write Requirements</a> in the <i>Amazon DynamoDB
    *                 Developer Guide</i>. </p>
    */
  var ReplicaProvisionedReadCapacityUnits: js.UndefOr[Double] = js.undefined
  
  /**
    * <p>Auto scaling settings for a global table replica's write capacity units.</p>
    */
  var ReplicaProvisionedWriteCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.undefined
  
  /**
    * <p>The maximum number of writes consumed per second before DynamoDB returns a
    *                 <code>ThrottlingException</code>. For more information, see <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput">Specifying Read and Write Requirements</a> in the <i>Amazon DynamoDB
    *                 Developer Guide</i>.</p>
    */
  var ReplicaProvisionedWriteCapacityUnits: js.UndefOr[Double] = js.undefined
  
  /**
    * <p>The current state of the Region:</p>
    *          <ul>
    *             <li>
    *                <p>
    *                   <code>CREATING</code> - The Region is being created.</p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>UPDATING</code> - The Region is being updated.</p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>DELETING</code> - The Region is being deleted.</p>
    *             </li>
    *             <li>
    *                <p>
    *                   <code>ACTIVE</code> - The Region is ready for use.</p>
    *             </li>
    *          </ul>
    */
  var ReplicaStatus: js.UndefOr[typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ReplicaStatus | String] = js.undefined
  
  /**
    * <p>Contains details of the table class.</p>
    */
  var ReplicaTableClassSummary: js.UndefOr[TableClassSummary] = js.undefined
}
object ReplicaSettingsDescription {
  
  inline def apply(): ReplicaSettingsDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicaSettingsDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReplicaSettingsDescription] (val x: Self) extends AnyVal {
    
    inline def setRegionName(value: String): Self = StObject.set(x, "RegionName", value.asInstanceOf[js.Any])
    
    inline def setRegionNameUndefined: Self = StObject.set(x, "RegionName", js.undefined)
    
    inline def setReplicaBillingModeSummary(value: BillingModeSummary): Self = StObject.set(x, "ReplicaBillingModeSummary", value.asInstanceOf[js.Any])
    
    inline def setReplicaBillingModeSummaryUndefined: Self = StObject.set(x, "ReplicaBillingModeSummary", js.undefined)
    
    inline def setReplicaGlobalSecondaryIndexSettings(value: js.Array[ReplicaGlobalSecondaryIndexSettingsDescription]): Self = StObject.set(x, "ReplicaGlobalSecondaryIndexSettings", value.asInstanceOf[js.Any])
    
    inline def setReplicaGlobalSecondaryIndexSettingsUndefined: Self = StObject.set(x, "ReplicaGlobalSecondaryIndexSettings", js.undefined)
    
    inline def setReplicaGlobalSecondaryIndexSettingsVarargs(value: ReplicaGlobalSecondaryIndexSettingsDescription*): Self = StObject.set(x, "ReplicaGlobalSecondaryIndexSettings", js.Array(value*))
    
    inline def setReplicaProvisionedReadCapacityAutoScalingSettings(value: AutoScalingSettingsDescription): Self = StObject.set(x, "ReplicaProvisionedReadCapacityAutoScalingSettings", value.asInstanceOf[js.Any])
    
    inline def setReplicaProvisionedReadCapacityAutoScalingSettingsUndefined: Self = StObject.set(x, "ReplicaProvisionedReadCapacityAutoScalingSettings", js.undefined)
    
    inline def setReplicaProvisionedReadCapacityUnits(value: Double): Self = StObject.set(x, "ReplicaProvisionedReadCapacityUnits", value.asInstanceOf[js.Any])
    
    inline def setReplicaProvisionedReadCapacityUnitsUndefined: Self = StObject.set(x, "ReplicaProvisionedReadCapacityUnits", js.undefined)
    
    inline def setReplicaProvisionedWriteCapacityAutoScalingSettings(value: AutoScalingSettingsDescription): Self = StObject.set(x, "ReplicaProvisionedWriteCapacityAutoScalingSettings", value.asInstanceOf[js.Any])
    
    inline def setReplicaProvisionedWriteCapacityAutoScalingSettingsUndefined: Self = StObject.set(x, "ReplicaProvisionedWriteCapacityAutoScalingSettings", js.undefined)
    
    inline def setReplicaProvisionedWriteCapacityUnits(value: Double): Self = StObject.set(x, "ReplicaProvisionedWriteCapacityUnits", value.asInstanceOf[js.Any])
    
    inline def setReplicaProvisionedWriteCapacityUnitsUndefined: Self = StObject.set(x, "ReplicaProvisionedWriteCapacityUnits", js.undefined)
    
    inline def setReplicaStatus(value: ReplicaStatus | String): Self = StObject.set(x, "ReplicaStatus", value.asInstanceOf[js.Any])
    
    inline def setReplicaStatusUndefined: Self = StObject.set(x, "ReplicaStatus", js.undefined)
    
    inline def setReplicaTableClassSummary(value: TableClassSummary): Self = StObject.set(x, "ReplicaTableClassSummary", value.asInstanceOf[js.Any])
    
    inline def setReplicaTableClassSummaryUndefined: Self = StObject.set(x, "ReplicaTableClassSummary", js.undefined)
  }
}
