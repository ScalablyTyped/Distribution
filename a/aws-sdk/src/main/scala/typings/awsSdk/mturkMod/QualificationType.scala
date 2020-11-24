package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QualificationType extends js.Object {
  
  /**
    * The answers to the Qualification test specified in the Test parameter.
    */
  var AnswerKey: js.UndefOr[String] = js.native
  
  /**
    * Specifies that requests for the Qualification type are granted immediately, without prompting the Worker with a Qualification test. Valid values are True | False.
    */
  var AutoGranted: js.UndefOr[Boolean] = js.native
  
  /**
    *  The Qualification integer value to use for automatically granted Qualifications, if AutoGranted is true. This is 1 by default. 
    */
  var AutoGrantedValue: js.UndefOr[Integer] = js.native
  
  /**
    *  The date and time the Qualification type was created. 
    */
  var CreationTime: js.UndefOr[Timestamp] = js.native
  
  /**
    *  A long description for the Qualification type. 
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    *  Specifies whether the Qualification type is one that a user can request through the Amazon Mechanical Turk web site, such as by taking a Qualification test. This value is False for Qualifications assigned automatically by the system. Valid values are True | False. 
    */
  var IsRequestable: js.UndefOr[Boolean] = js.native
  
  /**
    *  One or more words or phrases that describe theQualification type, separated by commas. The Keywords make the type easier to find using a search. 
    */
  var Keywords: js.UndefOr[String] = js.native
  
  /**
    *  The name of the Qualification type. The type name is used to identify the type, and to find the type using a Qualification type search. 
    */
  var Name: js.UndefOr[String] = js.native
  
  /**
    *  A unique identifier for the Qualification type. A Qualification type is given a Qualification type ID when you call the CreateQualificationType operation. 
    */
  var QualificationTypeId: js.UndefOr[EntityId] = js.native
  
  /**
    *  The status of the Qualification type. A Qualification type's status determines if users can apply to receive a Qualification of this type, and if HITs can be created with requirements based on this type. Valid values are Active | Inactive. 
    */
  var QualificationTypeStatus: js.UndefOr[typings.awsSdk.mturkMod.QualificationTypeStatus] = js.native
  
  /**
    *  The amount of time, in seconds, Workers must wait after taking the Qualification test before they can take it again. Workers can take a Qualification test multiple times if they were not granted the Qualification from a previous attempt, or if the test offers a gradient score and they want a better score. If not specified, retries are disabled and Workers can request a Qualification only once. 
    */
  var RetryDelayInSeconds: js.UndefOr[Long] = js.native
  
  /**
    *  The questions for a Qualification test associated with this Qualification type that a user can take to obtain a Qualification of this type. This parameter must be specified if AnswerKey is present. A Qualification type cannot have both a specified Test parameter and an AutoGranted value of true. 
    */
  var Test: js.UndefOr[String] = js.native
  
  /**
    *  The amount of time, in seconds, given to a Worker to complete the Qualification test, beginning from the time the Worker requests the Qualification. 
    */
  var TestDurationInSeconds: js.UndefOr[Long] = js.native
}
object QualificationType {
  
  @scala.inline
  def apply(): QualificationType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QualificationType]
  }
  
  @scala.inline
  implicit class QualificationTypeOps[Self <: QualificationType] (val x: Self) extends AnyVal {
    
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
    def setCreationTime(value: Timestamp): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setIsRequestable(value: Boolean): Self = this.set("IsRequestable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsRequestable: Self = this.set("IsRequestable", js.undefined)
    
    @scala.inline
    def setKeywords(value: String): Self = this.set("Keywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeywords: Self = this.set("Keywords", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setQualificationTypeId(value: EntityId): Self = this.set("QualificationTypeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQualificationTypeId: Self = this.set("QualificationTypeId", js.undefined)
    
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
