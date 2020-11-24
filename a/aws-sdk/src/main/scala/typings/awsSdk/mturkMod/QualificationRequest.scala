package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QualificationRequest extends js.Object {
  
  /**
    *  The Worker's answers for the Qualification type's test contained in a QuestionFormAnswers document, if the type has a test and the Worker has submitted answers. If the Worker does not provide any answers, Answer may be empty. 
    */
  var Answer: js.UndefOr[String] = js.native
  
  /**
    * The ID of the Qualification request, a unique identifier generated when the request was submitted. 
    */
  var QualificationRequestId: js.UndefOr[String] = js.native
  
  /**
    *  The ID of the Qualification type the Worker is requesting, as returned by the CreateQualificationType operation. 
    */
  var QualificationTypeId: js.UndefOr[EntityId] = js.native
  
  /**
    * The date and time the Qualification request had a status of Submitted. This is either the time the Worker submitted answers for a Qualification test, or the time the Worker requested the Qualification if the Qualification type does not have a test. 
    */
  var SubmitTime: js.UndefOr[Timestamp] = js.native
  
  /**
    *  The contents of the Qualification test that was presented to the Worker, if the type has a test and the Worker has submitted answers. This value is identical to the QuestionForm associated with the Qualification type at the time the Worker requests the Qualification.
    */
  var Test: js.UndefOr[String] = js.native
  
  /**
    *  The ID of the Worker requesting the Qualification.
    */
  var WorkerId: js.UndefOr[CustomerId] = js.native
}
object QualificationRequest {
  
  @scala.inline
  def apply(): QualificationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QualificationRequest]
  }
  
  @scala.inline
  implicit class QualificationRequestOps[Self <: QualificationRequest] (val x: Self) extends AnyVal {
    
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
    def setAnswer(value: String): Self = this.set("Answer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnswer: Self = this.set("Answer", js.undefined)
    
    @scala.inline
    def setQualificationRequestId(value: String): Self = this.set("QualificationRequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQualificationRequestId: Self = this.set("QualificationRequestId", js.undefined)
    
    @scala.inline
    def setQualificationTypeId(value: EntityId): Self = this.set("QualificationTypeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQualificationTypeId: Self = this.set("QualificationTypeId", js.undefined)
    
    @scala.inline
    def setSubmitTime(value: Timestamp): Self = this.set("SubmitTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubmitTime: Self = this.set("SubmitTime", js.undefined)
    
    @scala.inline
    def setTest(value: String): Self = this.set("Test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTest: Self = this.set("Test", js.undefined)
    
    @scala.inline
    def setWorkerId(value: CustomerId): Self = this.set("WorkerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkerId: Self = this.set("WorkerId", js.undefined)
  }
}
