package typings.awsSdkClientDynamodbBrowser.typesReplicaSettingsUpdateMod

import typings.awsSdkClientDynamodbBrowser.typesAutoScalingSettingsUpdateMod.AutoScalingSettingsUpdate
import typings.awsSdkClientDynamodbBrowser.typesReplicaGlobalSecondaryIndexSettingsUpdateMod.ReplicaGlobalSecondaryIndexSettingsUpdate
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicaSettingsUpdate extends js.Object {
  /**
    * <p>The region of the replica to be added.</p>
    */
  var RegionName: String = js.native
  /**
    * <p>Represents the settings of a global secondary index for a global table that will be modified.</p>
    */
  var ReplicaGlobalSecondaryIndexSettingsUpdate: js.UndefOr[
    (js.Array[
      typings.awsSdkClientDynamodbBrowser.typesReplicaGlobalSecondaryIndexSettingsUpdateMod.ReplicaGlobalSecondaryIndexSettingsUpdate
    ]) | (Iterable[
      typings.awsSdkClientDynamodbBrowser.typesReplicaGlobalSecondaryIndexSettingsUpdateMod.ReplicaGlobalSecondaryIndexSettingsUpdate
    ])
  ] = js.native
  /**
    * <p>Autoscaling settings for managing a global table replica's read capacity units.</p>
    */
  var ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate: js.UndefOr[AutoScalingSettingsUpdate] = js.native
  /**
    * <p>The maximum number of strongly consistent reads consumed per second before DynamoDB returns a <code>ThrottlingException</code>. For more information, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput">Specifying Read and Write Requirements</a> in the <i>Amazon DynamoDB Developer Guide</i>. </p>
    */
  var ReplicaProvisionedReadCapacityUnits: js.UndefOr[Double] = js.native
}

object ReplicaSettingsUpdate {
  @scala.inline
  def apply(RegionName: String): ReplicaSettingsUpdate = {
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRegionName(value: String): Self = this.set("RegionName", value.asInstanceOf[js.Any])
    @scala.inline
    def setReplicaGlobalSecondaryIndexSettingsUpdateVarargs(value: ReplicaGlobalSecondaryIndexSettingsUpdate*): Self = this.set("ReplicaGlobalSecondaryIndexSettingsUpdate", js.Array(value :_*))
    @scala.inline
    def setReplicaGlobalSecondaryIndexSettingsUpdate(
      value: js.Array[ReplicaGlobalSecondaryIndexSettingsUpdate] | Iterable[ReplicaGlobalSecondaryIndexSettingsUpdate]
    ): Self = this.set("ReplicaGlobalSecondaryIndexSettingsUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicaGlobalSecondaryIndexSettingsUpdate: Self = this.set("ReplicaGlobalSecondaryIndexSettingsUpdate", js.undefined)
    @scala.inline
    def setReplicaProvisionedReadCapacityAutoScalingSettingsUpdate(value: AutoScalingSettingsUpdate): Self = this.set("ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicaProvisionedReadCapacityAutoScalingSettingsUpdate: Self = this.set("ReplicaProvisionedReadCapacityAutoScalingSettingsUpdate", js.undefined)
    @scala.inline
    def setReplicaProvisionedReadCapacityUnits(value: Double): Self = this.set("ReplicaProvisionedReadCapacityUnits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicaProvisionedReadCapacityUnits: Self = this.set("ReplicaProvisionedReadCapacityUnits", js.undefined)
  }
  
}

