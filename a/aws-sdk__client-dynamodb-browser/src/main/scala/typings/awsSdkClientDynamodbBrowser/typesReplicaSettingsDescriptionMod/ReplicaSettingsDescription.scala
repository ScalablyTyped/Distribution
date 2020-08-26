package typings.awsSdkClientDynamodbBrowser.typesReplicaSettingsDescriptionMod

import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.ACTIVE
import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.CREATING
import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.DELETING
import typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.UPDATING
import typings.awsSdkClientDynamodbBrowser.typesAutoScalingSettingsDescriptionMod.AutoScalingSettingsDescription
import typings.awsSdkClientDynamodbBrowser.typesReplicaGlobalSecondaryIndexSettingsDescriptionMod.ReplicaGlobalSecondaryIndexSettingsDescription
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicaSettingsDescription extends js.Object {
  /**
    * <p>The region name of the replica.</p>
    */
  var RegionName: String = js.native
  /**
    * <p>Replica global secondary index settings for the global table.</p>
    */
  var ReplicaGlobalSecondaryIndexSettings: js.UndefOr[
    js.Array[ReplicaGlobalSecondaryIndexSettingsDescription] | Iterable[ReplicaGlobalSecondaryIndexSettingsDescription]
  ] = js.native
  /**
    * <p>Autoscaling settings for a global table replica's read capacity units.</p>
    */
  var ReplicaProvisionedReadCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.native
  /**
    * <p>The maximum number of strongly consistent reads consumed per second before DynamoDB returns a <code>ThrottlingException</code>. For more information, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput">Specifying Read and Write Requirements</a> in the <i>Amazon DynamoDB Developer Guide</i>. </p>
    */
  var ReplicaProvisionedReadCapacityUnits: js.UndefOr[Double] = js.native
  /**
    * <p>AutoScaling settings for a global table replica's write capacity units.</p>
    */
  var ReplicaProvisionedWriteCapacityAutoScalingSettings: js.UndefOr[AutoScalingSettingsDescription] = js.native
  /**
    * <p>The maximum number of writes consumed per second before DynamoDB returns a <code>ThrottlingException</code>. For more information, see <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#ProvisionedThroughput">Specifying Read and Write Requirements</a> in the <i>Amazon DynamoDB Developer Guide</i>.</p>
    */
  var ReplicaProvisionedWriteCapacityUnits: js.UndefOr[Double] = js.native
  /**
    * <p>The current state of the region:</p> <ul> <li> <p> <code>CREATING</code> - The region is being created.</p> </li> <li> <p> <code>UPDATING</code> - The region is being updated.</p> </li> <li> <p> <code>DELETING</code> - The region is being deleted.</p> </li> <li> <p> <code>ACTIVE</code> - The region is ready for use.</p> </li> </ul>
    */
  var ReplicaStatus: js.UndefOr[CREATING | UPDATING | DELETING | ACTIVE | String] = js.native
}

object ReplicaSettingsDescription {
  @scala.inline
  def apply(RegionName: String): ReplicaSettingsDescription = {
    val __obj = js.Dynamic.literal(RegionName = RegionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicaSettingsDescription]
  }
  @scala.inline
  implicit class ReplicaSettingsDescriptionOps[Self <: ReplicaSettingsDescription] (val x: Self) extends AnyVal {
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
    def setReplicaGlobalSecondaryIndexSettingsVarargs(value: ReplicaGlobalSecondaryIndexSettingsDescription*): Self = this.set("ReplicaGlobalSecondaryIndexSettings", js.Array(value :_*))
    @scala.inline
    def setReplicaGlobalSecondaryIndexSettings(
      value: js.Array[ReplicaGlobalSecondaryIndexSettingsDescription] | Iterable[ReplicaGlobalSecondaryIndexSettingsDescription]
    ): Self = this.set("ReplicaGlobalSecondaryIndexSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicaGlobalSecondaryIndexSettings: Self = this.set("ReplicaGlobalSecondaryIndexSettings", js.undefined)
    @scala.inline
    def setReplicaProvisionedReadCapacityAutoScalingSettings(value: AutoScalingSettingsDescription): Self = this.set("ReplicaProvisionedReadCapacityAutoScalingSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicaProvisionedReadCapacityAutoScalingSettings: Self = this.set("ReplicaProvisionedReadCapacityAutoScalingSettings", js.undefined)
    @scala.inline
    def setReplicaProvisionedReadCapacityUnits(value: Double): Self = this.set("ReplicaProvisionedReadCapacityUnits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicaProvisionedReadCapacityUnits: Self = this.set("ReplicaProvisionedReadCapacityUnits", js.undefined)
    @scala.inline
    def setReplicaProvisionedWriteCapacityAutoScalingSettings(value: AutoScalingSettingsDescription): Self = this.set("ReplicaProvisionedWriteCapacityAutoScalingSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicaProvisionedWriteCapacityAutoScalingSettings: Self = this.set("ReplicaProvisionedWriteCapacityAutoScalingSettings", js.undefined)
    @scala.inline
    def setReplicaProvisionedWriteCapacityUnits(value: Double): Self = this.set("ReplicaProvisionedWriteCapacityUnits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicaProvisionedWriteCapacityUnits: Self = this.set("ReplicaProvisionedWriteCapacityUnits", js.undefined)
    @scala.inline
    def setReplicaStatus(value: CREATING | UPDATING | DELETING | ACTIVE | String): Self = this.set("ReplicaStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicaStatus: Self = this.set("ReplicaStatus", js.undefined)
  }
  
}

