package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeletePatchBaselineResult extends js.Object {
  /**
    * The ID of the deleted patch baseline.
    */
  var BaselineId: js.UndefOr[typings.awsSdk.ssmMod.BaselineId] = js.native
}

object DeletePatchBaselineResult {
  @scala.inline
  def apply(BaselineId: BaselineId = null): DeletePatchBaselineResult = {
    val __obj = js.Dynamic.literal()
    if (BaselineId != null) __obj.updateDynamic("BaselineId")(BaselineId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePatchBaselineResult]
  }
}

