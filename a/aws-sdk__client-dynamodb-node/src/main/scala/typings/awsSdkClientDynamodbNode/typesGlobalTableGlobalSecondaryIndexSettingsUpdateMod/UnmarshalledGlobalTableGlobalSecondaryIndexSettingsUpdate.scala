package typings.awsSdkClientDynamodbNode.typesGlobalTableGlobalSecondaryIndexSettingsUpdateMod

import typings.awsSdkClientDynamodbNode.typesAutoScalingSettingsUpdateMod.UnmarshalledAutoScalingSettingsUpdate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledGlobalTableGlobalSecondaryIndexSettingsUpdate extends GlobalTableGlobalSecondaryIndexSettingsUpdate {
  /**
    * <p>AutoScaling settings for managing a global secondary index's write capacity units.</p>
    */
  @JSName("ProvisionedWriteCapacityAutoScalingSettingsUpdate")
  var ProvisionedWriteCapacityAutoScalingSettingsUpdate_UnmarshalledGlobalTableGlobalSecondaryIndexSettingsUpdate: js.UndefOr[UnmarshalledAutoScalingSettingsUpdate] = js.native
}

object UnmarshalledGlobalTableGlobalSecondaryIndexSettingsUpdate {
  @scala.inline
  def apply(IndexName: String): UnmarshalledGlobalTableGlobalSecondaryIndexSettingsUpdate = {
    val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledGlobalTableGlobalSecondaryIndexSettingsUpdate]
  }
  @scala.inline
  implicit class UnmarshalledGlobalTableGlobalSecondaryIndexSettingsUpdateOps[Self <: UnmarshalledGlobalTableGlobalSecondaryIndexSettingsUpdate] (val x: Self) extends AnyVal {
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
    def setProvisionedWriteCapacityAutoScalingSettingsUpdate(value: UnmarshalledAutoScalingSettingsUpdate): Self = this.set("ProvisionedWriteCapacityAutoScalingSettingsUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvisionedWriteCapacityAutoScalingSettingsUpdate: Self = this.set("ProvisionedWriteCapacityAutoScalingSettingsUpdate", js.undefined)
  }
  
}

