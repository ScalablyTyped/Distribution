package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPatchBaselineRequest extends js.Object {
  /**
    * The ID of the patch baseline to retrieve.
    */
  var BaselineId: typings.awsSdk.ssmMod.BaselineId = js.native
}

object GetPatchBaselineRequest {
  @scala.inline
  def apply(BaselineId: BaselineId): GetPatchBaselineRequest = {
    val __obj = js.Dynamic.literal(BaselineId = BaselineId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetPatchBaselineRequest]
  }
}

