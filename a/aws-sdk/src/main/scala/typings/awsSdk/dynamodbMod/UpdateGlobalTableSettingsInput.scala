package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateGlobalTableSettingsInput extends StObject {
  
  /**
    * The billing mode of the global table. If GlobalTableBillingMode is not specified, the global table defaults to PROVISIONED capacity billing mode.    PROVISIONED - We recommend using PROVISIONED for predictable workloads. PROVISIONED sets the billing mode to Provisioned Mode.    PAY_PER_REQUEST - We recommend using PAY_PER_REQUEST for unpredictable workloads. PAY_PER_REQUEST sets the billing mode to On-Demand Mode.   
    */
  var GlobalTableBillingMode: js.UndefOr[BillingMode] = js.native
  
  /**
    * Represents the settings of a global secondary index for a global table that will be modified.
    */
  var GlobalTableGlobalSecondaryIndexSettingsUpdate: js.UndefOr[GlobalTableGlobalSecondaryIndexSettingsUpdateList] = js.native
  
  /**
    * The name of the global table
    */
  var GlobalTableName: TableName = js.native
  
  /**
    * Auto scaling settings for managing provisioned write capacity for the global table.
    */
  var GlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate: js.UndefOr[AutoScalingSettingsUpdate] = js.native
  
  /**
    * The maximum number of writes consumed per second before DynamoDB returns a ThrottlingException. 
    */
  var GlobalTableProvisionedWriteCapacityUnits: js.UndefOr[PositiveLongObject] = js.native
  
  /**
    * Represents the settings for a global table in a Region that will be modified.
    */
  var ReplicaSettingsUpdate: js.UndefOr[ReplicaSettingsUpdateList] = js.native
}
object UpdateGlobalTableSettingsInput {
  
  @scala.inline
  def apply(GlobalTableName: TableName): UpdateGlobalTableSettingsInput = {
    val __obj = js.Dynamic.literal(GlobalTableName = GlobalTableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGlobalTableSettingsInput]
  }
  
  @scala.inline
  implicit class UpdateGlobalTableSettingsInputMutableBuilder[Self <: UpdateGlobalTableSettingsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGlobalTableBillingMode(value: BillingMode): Self = StObject.set(x, "GlobalTableBillingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalTableBillingModeUndefined: Self = StObject.set(x, "GlobalTableBillingMode", js.undefined)
    
    @scala.inline
    def setGlobalTableGlobalSecondaryIndexSettingsUpdate(value: GlobalTableGlobalSecondaryIndexSettingsUpdateList): Self = StObject.set(x, "GlobalTableGlobalSecondaryIndexSettingsUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalTableGlobalSecondaryIndexSettingsUpdateUndefined: Self = StObject.set(x, "GlobalTableGlobalSecondaryIndexSettingsUpdate", js.undefined)
    
    @scala.inline
    def setGlobalTableGlobalSecondaryIndexSettingsUpdateVarargs(value: GlobalTableGlobalSecondaryIndexSettingsUpdate*): Self = StObject.set(x, "GlobalTableGlobalSecondaryIndexSettingsUpdate", js.Array(value :_*))
    
    @scala.inline
    def setGlobalTableName(value: TableName): Self = StObject.set(x, "GlobalTableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate(value: AutoScalingSettingsUpdate): Self = StObject.set(x, "GlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdateUndefined: Self = StObject.set(x, "GlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate", js.undefined)
    
    @scala.inline
    def setGlobalTableProvisionedWriteCapacityUnits(value: PositiveLongObject): Self = StObject.set(x, "GlobalTableProvisionedWriteCapacityUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalTableProvisionedWriteCapacityUnitsUndefined: Self = StObject.set(x, "GlobalTableProvisionedWriteCapacityUnits", js.undefined)
    
    @scala.inline
    def setReplicaSettingsUpdate(value: ReplicaSettingsUpdateList): Self = StObject.set(x, "ReplicaSettingsUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicaSettingsUpdateUndefined: Self = StObject.set(x, "ReplicaSettingsUpdate", js.undefined)
    
    @scala.inline
    def setReplicaSettingsUpdateVarargs(value: ReplicaSettingsUpdate*): Self = StObject.set(x, "ReplicaSettingsUpdate", js.Array(value :_*))
  }
}
