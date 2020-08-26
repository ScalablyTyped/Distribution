package typings.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicaSettingsUpdate extends js.Object {
  /**
    * The Region of the replica to be added.
    */
  var RegionName: typings.awsSdk.dynamodbMod.RegionName = js.native
  /**
    * Represents the settings of a global secondary index for a global table that will be modified.
    */
  var ReplicaGlobalSecondaryIndexSettingsUpdate: js.UndefOr[ReplicaGlobalSecondaryIndexSettingsUpdateList] = js.native
  /**
    * Auto scaling settings for managing a global table replica's read capacity units.
    */
  var ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate: js.UndefOr[AutoScalingSettingsUpdate] = js.native
  /**
    * The maximum number of strongly consistent reads consumed per second before DynamoDB returns a ThrottlingException. For more information, see Specifying Read and Write Requirements in the Amazon DynamoDB Developer Guide. 
    */
  var ReplicaProvisionedReadCapacityUnits: js.UndefOr[PositiveLongObject] = js.native
}

object ReplicaSettingsUpdate {
  @scala.inline
  def apply(RegionName: RegionName): ReplicaSettingsUpdate = {
    val __obj = js.Dynamic.literal(RegionName = RegionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicaSettingsUpdate]
  }
  @scala.inline
  implicit class ReplicaSettingsUpdateOps[Self <: ReplicaSettingsUpdate] (val x: Self) extends AnyVal {
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
    def setRegionName(value: RegionName): Self = this.set("RegionName", value.asInstanceOf[js.Any])
    @scala.inline
    def setReplicaGlobalSecondaryIndexSettingsUpdateVarargs(value: ReplicaGlobalSecondaryIndexSettingsUpdate*): Self = this.set("ReplicaGlobalSecondaryIndexSettingsUpdate", js.Array(value :_*))
    @scala.inline
    def setReplicaGlobalSecondaryIndexSettingsUpdate(value: ReplicaGlobalSecondaryIndexSettingsUpdateList): Self = this.set("ReplicaGlobalSecondaryIndexSettingsUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicaGlobalSecondaryIndexSettingsUpdate: Self = this.set("ReplicaGlobalSecondaryIndexSettingsUpdate", js.undefined)
    @scala.inline
    def setReplicaProvisionedReadCapacityAutoScalingSettingsUpdate(value: AutoScalingSettingsUpdate): Self = this.set("ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicaProvisionedReadCapacityAutoScalingSettingsUpdate: Self = this.set("ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate", js.undefined)
    @scala.inline
    def setReplicaProvisionedReadCapacityUnits(value: PositiveLongObject): Self = this.set("ReplicaProvisionedReadCapacityUnits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicaProvisionedReadCapacityUnits: Self = this.set("ReplicaProvisionedReadCapacityUnits", js.undefined)
  }
  
}

