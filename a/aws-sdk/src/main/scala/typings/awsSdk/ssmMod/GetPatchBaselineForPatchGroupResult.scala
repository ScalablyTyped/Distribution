package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPatchBaselineForPatchGroupResult extends js.Object {
  /**
    * The ID of the patch baseline that should be used for the patch group.
    */
  var BaselineId: js.UndefOr[typings.awsSdk.ssmMod.BaselineId] = js.native
  /**
    * The operating system rule specified for patch groups using the patch baseline.
    */
  var OperatingSystem: js.UndefOr[typings.awsSdk.ssmMod.OperatingSystem] = js.native
  /**
    * The name of the patch group.
    */
  var PatchGroup: js.UndefOr[typings.awsSdk.ssmMod.PatchGroup] = js.native
}

object GetPatchBaselineForPatchGroupResult {
  @scala.inline
  def apply(
    BaselineId: BaselineId = null,
    OperatingSystem: OperatingSystem = null,
    PatchGroup: PatchGroup = null
  ): GetPatchBaselineForPatchGroupResult = {
    val __obj = js.Dynamic.literal()
    if (BaselineId != null) __obj.updateDynamic("BaselineId")(BaselineId.asInstanceOf[js.Any])
    if (OperatingSystem != null) __obj.updateDynamic("OperatingSystem")(OperatingSystem.asInstanceOf[js.Any])
    if (PatchGroup != null) __obj.updateDynamic("PatchGroup")(PatchGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPatchBaselineForPatchGroupResult]
  }
}

