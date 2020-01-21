package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetQualificationTypeRequest extends js.Object {
  /**
    * The ID of the QualificationType.
    */
  var QualificationTypeId: EntityId = js.native
}

object GetQualificationTypeRequest {
  @scala.inline
  def apply(QualificationTypeId: EntityId): GetQualificationTypeRequest = {
    val __obj = js.Dynamic.literal(QualificationTypeId = QualificationTypeId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetQualificationTypeRequest]
  }
}

