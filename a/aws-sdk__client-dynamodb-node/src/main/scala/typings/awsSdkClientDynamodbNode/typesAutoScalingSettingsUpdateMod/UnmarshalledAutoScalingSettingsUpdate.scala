package typings.awsSdkClientDynamodbNode.typesAutoScalingSettingsUpdateMod

import typings.awsSdkClientDynamodbNode.typesAutoScalingPolicyUpdateMod.UnmarshalledAutoScalingPolicyUpdate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledAutoScalingSettingsUpdate extends AutoScalingSettingsUpdate {
  /**
    * <p>The scaling policy to apply for scaling target global table or global secondary index capacity units.</p>
    */
  @JSName("ScalingPolicyUpdate")
  var ScalingPolicyUpdate_UnmarshalledAutoScalingSettingsUpdate: js.UndefOr[UnmarshalledAutoScalingPolicyUpdate] = js.native
}

object UnmarshalledAutoScalingSettingsUpdate {
  @scala.inline
  def apply(): UnmarshalledAutoScalingSettingsUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledAutoScalingSettingsUpdate]
  }
  @scala.inline
  implicit class UnmarshalledAutoScalingSettingsUpdateOps[Self <: UnmarshalledAutoScalingSettingsUpdate] (val x: Self) extends AnyVal {
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
    def setScalingPolicyUpdate(value: UnmarshalledAutoScalingPolicyUpdate): Self = this.set("ScalingPolicyUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScalingPolicyUpdate: Self = this.set("ScalingPolicyUpdate", js.undefined)
  }
  
}

