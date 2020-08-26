package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EffectivePatch extends js.Object {
  /**
    * Provides metadata for a patch, including information such as the KB ID, severity, classification and a URL for where more information can be obtained about the patch.
    */
  var Patch: js.UndefOr[typings.awsSdk.ssmMod.Patch] = js.native
  /**
    * The status of the patch in a patch baseline. This includes information about whether the patch is currently approved, due to be approved by a rule, explicitly approved, or explicitly rejected and the date the patch was or will be approved.
    */
  var PatchStatus: js.UndefOr[typings.awsSdk.ssmMod.PatchStatus] = js.native
}

object EffectivePatch {
  @scala.inline
  def apply(): EffectivePatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EffectivePatch]
  }
  @scala.inline
  implicit class EffectivePatchOps[Self <: EffectivePatch] (val x: Self) extends AnyVal {
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
    def setPatch(value: Patch): Self = this.set("Patch", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePatch: Self = this.set("Patch", js.undefined)
    @scala.inline
    def setPatchStatus(value: PatchStatus): Self = this.set("PatchStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePatchStatus: Self = this.set("PatchStatus", js.undefined)
  }
  
}

