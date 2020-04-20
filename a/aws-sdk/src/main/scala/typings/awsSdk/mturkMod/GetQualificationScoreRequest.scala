package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetQualificationScoreRequest extends js.Object {
  /**
    * The ID of the QualificationType.
    */
  var QualificationTypeId: EntityId = js.native
  /**
    * The ID of the Worker whose Qualification is being updated.
    */
  var WorkerId: CustomerId = js.native
}

object GetQualificationScoreRequest {
  @scala.inline
  def apply(QualificationTypeId: EntityId, WorkerId: CustomerId): GetQualificationScoreRequest = {
    val __obj = js.Dynamic.literal(QualificationTypeId = QualificationTypeId.asInstanceOf[js.Any], WorkerId = WorkerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetQualificationScoreRequest]
  }
}

