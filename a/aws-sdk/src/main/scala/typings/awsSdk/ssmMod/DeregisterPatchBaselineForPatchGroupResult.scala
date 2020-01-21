package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeregisterPatchBaselineForPatchGroupResult extends js.Object {
  /**
    * The ID of the patch baseline the patch group was deregistered from.
    */
  var BaselineId: js.UndefOr[typings.awsSdk.ssmMod.BaselineId] = js.native
  /**
    * The name of the patch group deregistered from the patch baseline.
    */
  var PatchGroup: js.UndefOr[typings.awsSdk.ssmMod.PatchGroup] = js.native
}

object DeregisterPatchBaselineForPatchGroupResult {
  @scala.inline
  def apply(BaselineId: BaselineId = null, PatchGroup: PatchGroup = null): DeregisterPatchBaselineForPatchGroupResult = {
    val __obj = js.Dynamic.literal()
    if (BaselineId != null) __obj.updateDynamic("BaselineId")(BaselineId.asInstanceOf[js.Any])
    if (PatchGroup != null) __obj.updateDynamic("PatchGroup")(PatchGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterPatchBaselineForPatchGroupResult]
  }
}

