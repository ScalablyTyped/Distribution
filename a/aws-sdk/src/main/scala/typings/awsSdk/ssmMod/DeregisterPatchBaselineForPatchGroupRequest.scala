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
}

