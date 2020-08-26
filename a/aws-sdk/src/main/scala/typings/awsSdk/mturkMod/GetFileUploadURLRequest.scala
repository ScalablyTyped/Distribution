package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFileUploadURLRequest extends js.Object {
  /**
    * The ID of the assignment that contains the question with a FileUploadAnswer.
    */
  var AssignmentId: EntityId = js.native
  /**
    * The identifier of the question with a FileUploadAnswer, as specified in the QuestionForm of the HIT.
    */
  var QuestionIdentifier: String = js.native
}

object GetFileUploadURLRequest {
  @scala.inline
  def apply(AssignmentId: EntityId, QuestionIdentifier: String): GetFileUploadURLRequest = {
    val __obj = js.Dynamic.literal(AssignmentId = AssignmentId.asInstanceOf[js.Any], QuestionIdentifier = QuestionIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFileUploadURLRequest]
  }
  @scala.inline
  implicit class GetFileUploadURLRequestOps[Self <: GetFileUploadURLRequest] (val x: Self) extends AnyVal {
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
    def setAssignmentId(value: EntityId): Self = this.set("AssignmentId", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuestionIdentifier(value: String): Self = this.set("QuestionIdentifier", value.asInstanceOf[js.Any])
  }
  
}

