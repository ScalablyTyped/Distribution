package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAssignmentRequest extends js.Object {
  /**
    * The ID of the Assignment to be retrieved.
    */
  var AssignmentId: EntityId = js.native
}

object GetAssignmentRequest {
  @scala.inline
  def apply(AssignmentId: EntityId): GetAssignmentRequest = {
    val __obj = js.Dynamic.literal(AssignmentId = AssignmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAssignmentRequest]
  }
}

