package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterDefaultPatchBaselineRequest extends js.Object {
  /**
    * The ID of the patch baseline that should be the default patch baseline.
    */
  var BaselineId: typings.awsSdk.ssmMod.BaselineId = js.native
}

object RegisterDefaultPatchBaselineRequest {
  @scala.inline
  def apply(BaselineId: BaselineId): RegisterDefaultPatchBaselineRequest = {
    val __obj = js.Dynamic.literal(BaselineId = BaselineId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterDefaultPatchBaselineRequest]
  }
}

