package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateQualificationTypeRequest extends js.Object {
  /**
    * The answers to the Qualification test specified in the Test parameter, in the form of an AnswerKey data structure.
    */
  var AnswerKey: js.UndefOr[String] = js.native
  /**
    * Specifies whether requests for the Qualification type are granted immediately, without prompting the Worker with a Qualification test. Constraints: If the Test parameter is specified, this parameter cannot be true.
    */
  var AutoGranted: js.UndefOr[Boolean] = js.native
  /**
    * The Qualification value to use for automatically granted Qualifications. This parameter is used only if the AutoGranted parameter is true.
    */
  var AutoGrantedValue: js.UndefOr[Integer] = js.native
  /**
    * The new description of the Qualification type.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The ID of the Qualification type to update.
    */
  var QualificationTypeId: EntityId = js.native
  /**
    * The new status of the Qualification type - Active | Inactive
    */
  var QualificationTypeStatus: js.UndefOr[typings.awsSdk.mturkMod.QualificationTypeStatus] = js.native
  /**
    * The amount of time, in seconds, that Workers must wait after requesting a Qualification of the specified Qualification type before they can retry the Qualification request. It is not possible to disable retries for a Qualification type after it has been created with retries enabled. If you want to disable retries, you must dispose of the existing retry-enabled Qualification type using DisposeQualificationType and then create a new Qualification type with retries disabled using CreateQualificationType.
    */
  var RetryDelayInSeconds: js.UndefOr[Long] = js.native
  /**
    * The questions for the Qualification test a Worker must answer correctly to obtain a Qualification of this type. If this parameter is specified, TestDurationInSeconds must also be specified. Constraints: Must not be longer than 65535 bytes. Must be a QuestionForm data structure. This parameter cannot be specified if AutoGranted is true. Constraints: None. If not specified, the Worker may request the Qualification without answering any questions.
    */
  var Test: js.UndefOr[String] = js.native
  /**
    * The number of seconds the Worker has to complete the Qualification test, starting from the time the Worker requests the Qualification.
    */
  var TestDurationInSeconds: js.UndefOr[Long] = js.native
}

object UpdateQualificationTypeRequest {
  @scala.inline
  def apply(QualificationTypeId: EntityId): UpdateQualificationTypeRequest = {
    val __obj = js.Dynamic.literal(QualificationTypeId = QualificationTypeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateQualificationTypeRequest]
  }
  @scala.inline
  implicit class UpdateQualificationTypeRequestOps[Self <: UpdateQualificationTypeRequest] (val x: Self) extends AnyVal {
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
    def setQualificationTypeId(value: EntityId): Self = this.set("QualificationTypeId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnswerKey(value: String): Self = this.set("AnswerKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnswerKey: Self = this.set("AnswerKey", js.undefined)
    @scala.inline
    def setAutoGranted(value: Boolean): Self = this.set("AutoGranted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoGranted: Self = this.set("AutoGranted", js.undefined)
    @scala.inline
    def setAutoGrantedValue(value: Integer): Self = this.set("AutoGrantedValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoGrantedValue: Self = this.set("AutoGrantedValue", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setQualificationTypeStatus(value: QualificationTypeStatus): Self = this.set("QualificationTypeStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQualificationTypeStatus: Self = this.set("QualificationTypeStatus", js.undefined)
    @scala.inline
    def setRetryDelayInSeconds(value: Long): Self = this.set("RetryDelayInSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetryDelayInSeconds: Self = this.set("RetryDelayInSeconds", js.undefined)
    @scala.inline
    def setTest(value: String): Self = this.set("Test", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTest: Self = this.set("Test", js.undefined)
    @scala.inline
    def setTestDurationInSeconds(value: Long): Self = this.set("TestDurationInSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTestDurationInSeconds: Self = this.set("TestDurationInSeconds", js.undefined)
  }
  
}

