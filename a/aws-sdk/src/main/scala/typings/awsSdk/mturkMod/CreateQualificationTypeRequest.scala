package typings.awsSdk.mturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateQualificationTypeRequest extends StObject {
  
  /**
    * The answers to the Qualification test specified in the Test parameter, in the form of an AnswerKey data structure. Constraints: Must not be longer than 65535 bytes. Constraints: None. If not specified, you must process Qualification requests manually.
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
    * A long description for the Qualification type. On the Amazon Mechanical Turk website, the long description is displayed when a Worker examines a Qualification type.
    */
  var Description: String = js.native
  
  /**
    * One or more words or phrases that describe the Qualification type, separated by commas. The keywords of a type make the type easier to find during a search.
    */
  var Keywords: js.UndefOr[String] = js.native
  
  /**
    *  The name you give to the Qualification type. The type name is used to represent the Qualification to Workers, and to find the type using a Qualification type search. It must be unique across all of your Qualification types.
    */
  var Name: String = js.native
  
  /**
    * The initial status of the Qualification type. Constraints: Valid values are: Active | Inactive
    */
  var QualificationTypeStatus: typings.awsSdk.mturkMod.QualificationTypeStatus = js.native
  
  /**
    * The number of seconds that a Worker must wait after requesting a Qualification of the Qualification type before the worker can retry the Qualification request. Constraints: None. If not specified, retries are disabled and Workers can request a Qualification of this type only once, even if the Worker has not been granted the Qualification. It is not possible to disable retries for a Qualification type after it has been created with retries enabled. If you want to disable retries, you must delete existing retry-enabled Qualification type and then create a new Qualification type with retries disabled.
    */
  var RetryDelayInSeconds: js.UndefOr[Long] = js.native
  
  /**
    *  The questions for the Qualification test a Worker must answer correctly to obtain a Qualification of this type. If this parameter is specified, TestDurationInSeconds must also be specified.  Constraints: Must not be longer than 65535 bytes. Must be a QuestionForm data structure. This parameter cannot be specified if AutoGranted is true. Constraints: None. If not specified, the Worker may request the Qualification without answering any questions.
    */
  var Test: js.UndefOr[String] = js.native
  
  /**
    * The number of seconds the Worker has to complete the Qualification test, starting from the time the Worker requests the Qualification.
    */
  var TestDurationInSeconds: js.UndefOr[Long] = js.native
}
object CreateQualificationTypeRequest {
  
  @scala.inline
  def apply(Description: String, Name: String, QualificationTypeStatus: QualificationTypeStatus): CreateQualificationTypeRequest = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], QualificationTypeStatus = QualificationTypeStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateQualificationTypeRequest]
  }
  
  @scala.inline
  implicit class CreateQualificationTypeRequestMutableBuilder[Self <: CreateQualificationTypeRequest] (val x: Self) extends AnyVal {
    
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
    def setKeywords(value: String): Self = StObject.set(x, "Keywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeywordsUndefined: Self = StObject.set(x, "Keywords", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualificationTypeStatus(value: QualificationTypeStatus): Self = StObject.set(x, "QualificationTypeStatus", value.asInstanceOf[js.Any])
    
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
