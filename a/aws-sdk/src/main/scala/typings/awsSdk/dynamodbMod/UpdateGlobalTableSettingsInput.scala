package typings.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateGlobalTableSettingsInput extends js.Object {
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
  implicit class UpdateGlobalTableSettingsInputOps[Self <: UpdateGlobalTableSettingsInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGlobalTableName(value: TableName): Self = this.set("GlobalTableName", value.asInstanceOf[js.Any])
    @scala.inline
    def setGlobalTableBillingMode(value: BillingMode): Self = this.set("GlobalTableBillingMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobalTableBillingMode: Self = this.set("GlobalTableBillingMode", js.undefined)
    @scala.inline
    def setGlobalTableGlobalSecondaryIndexSettingsUpdateVarargs(value: GlobalTableGlobalSecondaryIndexSettingsUpdate*): Self = this.set("GlobalTableGlobalSecondaryIndexSettingsUpdate", js.Array(value :_*))
    @scala.inline
    def setGlobalTableGlobalSecondaryIndexSettingsUpdate(value: GlobalTableGlobalSecondaryIndexSettingsUpdateList): Self = this.set("GlobalTableGlobalSecondaryIndexSettingsUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobalTableGlobalSecondaryIndexSettingsUpdate: Self = this.set("GlobalTableGlobalSecondaryIndexSettingsUpdate", js.undefined)
    @scala.inline
    def setGlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate(value: AutoScalingSettingsUpdate): Self = this.set("GlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate: Self = this.set("GlobalTableProvisionedWriteCapacityAutoScalingSettingsUpdate", js.undefined)
    @scala.inline
    def setGlobalTableProvisionedWriteCapacityUnits(value: PositiveLongObject): Self = this.set("GlobalTableProvisionedWriteCapacityUnits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobalTableProvisionedWriteCapacityUnits: Self = this.set("GlobalTableProvisionedWriteCapacityUnits", js.undefined)
    @scala.inline
    def setReplicaSettingsUpdateVarargs(value: ReplicaSettingsUpdate*): Self = this.set("ReplicaSettingsUpdate", js.Array(value :_*))
    @scala.inline
    def setReplicaSettingsUpdate(value: ReplicaSettingsUpdateList): Self = this.set("ReplicaSettingsUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicaSettingsUpdate: Self = this.set("ReplicaSettingsUpdate", js.undefined)
  }
  
}

