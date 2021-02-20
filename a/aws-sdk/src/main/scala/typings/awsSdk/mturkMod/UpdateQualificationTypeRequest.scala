package typings.awsSdk.mturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateQualificationTypeRequest extends StObject {
  
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
  implicit class UpdateQualificationTypeRequestMutableBuilder[Self <: UpdateQualificationTypeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnswerKey(value: String): Self = StObject.set(x, "AnswerKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnswerKeyUndefined: Self = StObject.set(x, "AnswerKey", js.undefined)
    
    @scala.inline
    def setAutoGranted(value: Boolean): Self = StObject.set(x, "AutoGranted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoGrantedUndefined: Self = StObject.set(x, "AutoGranted", js.undefined)
    
    @scala.inline
    def setAutoGrantedValue(value: Integer): Self = StObject.set(x, "AutoGrantedValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoGrantedValueUndefined: Self = StObject.set(x, "AutoGrantedValue", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setQualificationTypeId(value: EntityId): Self = StObject.set(x, "QualificationTypeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualificationTypeStatus(value: QualificationTypeStatus): Self = StObject.set(x, "QualificationTypeStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualificationTypeStatusUndefined: Self = StObject.set(x, "QualificationTypeStatus", js.undefined)
    
    @scala.inline
    def setRetryDelayInSeconds(value: Long): Self = StObject.set(x, "RetryDelayInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryDelayInSecondsUndefined: Self = StObject.set(x, "RetryDelayInSeconds", js.undefined)
    
    @scala.inline
    def setTest(value: String): Self = StObject.set(x, "Test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestDurationInSeconds(value: Long): Self = StObject.set(x, "TestDurationInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestDurationInSecondsUndefined: Self = StObject.set(x, "TestDurationInSeconds", js.undefined)
    
    @scala.inline
    def setTestUndefined: Self = StObject.set(x, "Test", js.undefined)
  }
}
