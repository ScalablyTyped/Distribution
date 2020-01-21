package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeletePatchBaselineRequest extends js.Object {
  /**
    * The ID of the patch baseline to delete.
    */
  var BaselineId: typings.awsSdk.ssmMod.BaselineId = js.native
}

object DeletePatchBaselineRequest {
  @scala.inline
  def apply(BaselineId: BaselineId): DeletePatchBaselineRequest = {
    val __obj = js.Dynamic.literal(BaselineId = BaselineId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeletePatchBaselineRequest]
  }
}

