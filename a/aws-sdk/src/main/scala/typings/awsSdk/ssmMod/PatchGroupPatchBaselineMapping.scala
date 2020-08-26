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
  def apply(): PatchGroupPatchBaselineMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PatchGroupPatchBaselineMapping]
  }
  @scala.inline
  implicit class PatchGroupPatchBaselineMappingOps[Self <: PatchGroupPatchBaselineMapping] (val x: Self) extends AnyVal {
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
    def setBaselineIdentity(value: PatchBaselineIdentity): Self = this.set("BaselineIdentity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaselineIdentity: Self = this.set("BaselineIdentity", js.undefined)
    @scala.inline
    def setPatchGroup(value: PatchGroup): Self = this.set("PatchGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePatchGroup: Self = this.set("PatchGroup", js.undefined)
  }
  
}

