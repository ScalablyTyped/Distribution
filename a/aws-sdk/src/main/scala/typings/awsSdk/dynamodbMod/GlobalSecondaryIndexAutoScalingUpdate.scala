package typings.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalSecondaryIndexAutoScalingUpdate extends js.Object {
  /**
    * The name of the global secondary index.
    */
  var IndexName: js.UndefOr[typings.awsSdk.dynamodbMod.IndexName] = js.native
  var ProvisionedWriteCapacityAutoScalingUpdate: js.UndefOr[AutoScalingSettingsUpdate] = js.native
}

object GlobalSecondaryIndexAutoScalingUpdate {
  @scala.inline
  def apply(
    IndexName: IndexName = null,
    ProvisionedWriteCapacityAutoScalingUpdate: AutoScalingSettingsUpdate = null
  ): GlobalSecondaryIndexAutoScalingUpdate = {
    val __obj = js.Dynamic.literal()
    if (IndexName != null) __obj.updateDynamic("IndexName")(IndexName.asInstanceOf[js.Any])
    if (ProvisionedWriteCapacityAutoScalingUpdate != null) __obj.updateDynamic("ProvisionedWriteCapacityAutoScalingUpdate")(ProvisionedWriteCapacityAutoScalingUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalSecondaryIndexAutoScalingUpdate]
  }
}

