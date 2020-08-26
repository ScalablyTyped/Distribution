package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeregisterPatchBaselineForPatchGroupRequest extends js.Object {
  /**
    * The ID of the patch baseline to deregister the patch group from.
    */
  var BaselineId: typings.awsSdk.ssmMod.BaselineId = js.native
  /**
    * The name of the patch group that should be deregistered from the patch baseline.
    */
  var PatchGroup: typings.awsSdk.ssmMod.PatchGroup = js.native
}

object DeregisterPatchBaselineForPatchGroupRequest {
  @scala.inline
  def apply(BaselineId: BaselineId, PatchGroup: PatchGroup): DeregisterPatchBaselineForPatchGroupRequest = {
    val __obj = js.Dynamic.literal(BaselineId = BaselineId.asInstanceOf[js.Any], PatchGroup = PatchGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterPatchBaselineForPatchGroupRequest]
  }
  @scala.inline
  implicit class DeregisterPatchBaselineForPatchGroupRequestOps[Self <: DeregisterPatchBaselineForPatchGroupRequest] (val x: Self) extends AnyVal {
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
    def setBaselineId(value: BaselineId): Self = this.set("BaselineId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPatchGroup(value: PatchGroup): Self = this.set("PatchGroup", value.asInstanceOf[js.Any])
  }
  
}

