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
  def apply(): GetPatchBaselineForPatchGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPatchBaselineForPatchGroupResult]
  }
  @scala.inline
  implicit class GetPatchBaselineForPatchGroupResultOps[Self <: GetPatchBaselineForPatchGroupResult] (val x: Self) extends AnyVal {
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
    def deleteBaselineId: Self = this.set("BaselineId", js.undefined)
    @scala.inline
    def setOperatingSystem(value: OperatingSystem): Self = this.set("OperatingSystem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperatingSystem: Self = this.set("OperatingSystem", js.undefined)
    @scala.inline
    def setPatchGroup(value: PatchGroup): Self = this.set("PatchGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePatchGroup: Self = this.set("PatchGroup", js.undefined)
  }
  
}

