package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PatchGroupPatchBaselineMapping extends js.Object {
  /**
    * The patch baseline the patch group is registered with.
    */
  var BaselineIdentity: js.UndefOr[PatchBaselineIdentity] = js.native
  /**
    * The name of the patch group registered with the patch baseline.
    */
  var PatchGroup: js.UndefOr[typings.awsSdk.ssmMod.PatchGroup] = js.native
}

object PatchGroupPatchBaselineMapping {
  @scala.inline
  def apply(BaselineIdentity: PatchBaselineIdentity = null, PatchGroup: PatchGroup = null): PatchGroupPatchBaselineMapping = {
    val __obj = js.Dynamic.literal()
    if (BaselineIdentity != null) __obj.updateDynamic("BaselineIdentity")(BaselineIdentity.asInstanceOf[js.Any])
    if (PatchGroup != null) __obj.updateDynamic("PatchGroup")(PatchGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchGroupPatchBaselineMapping]
  }
}

