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
  def apply(Patch: Patch = null, PatchStatus: PatchStatus = null): EffectivePatch = {
    val __obj = js.Dynamic.literal()
    if (Patch != null) __obj.updateDynamic("Patch")(Patch.asInstanceOf[js.Any])
    if (PatchStatus != null) __obj.updateDynamic("PatchStatus")(PatchStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[EffectivePatch]
  }
}

