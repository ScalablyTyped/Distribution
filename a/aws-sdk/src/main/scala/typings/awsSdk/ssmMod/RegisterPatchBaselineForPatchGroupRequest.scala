package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterPatchBaselineForPatchGroupRequest extends js.Object {
  /**
    * The ID of the patch baseline to register the patch group with.
    */
  var BaselineId: typings.awsSdk.ssmMod.BaselineId = js.native
  /**
    * The name of the patch group that should be registered with the patch baseline.
    */
  var PatchGroup: typings.awsSdk.ssmMod.PatchGroup = js.native
}

object RegisterPatchBaselineForPatchGroupRequest {
  @scala.inline
  def apply(BaselineId: BaselineId, PatchGroup: PatchGroup): RegisterPatchBaselineForPatchGroupRequest = {
    val __obj = js.Dynamic.literal(BaselineId = BaselineId.asInstanceOf[js.Any], PatchGroup = PatchGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterPatchBaselineForPatchGroupRequest]
  }
}

