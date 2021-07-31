package typings.awsSdk.supportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCaseRequest extends StObject {
  
  /**
    * The ID of a set of one or more attachments for the case. Create the set by using the AddAttachmentsToSet operation.
    */
  var attachmentSetId: js.UndefOr[AttachmentSetId] = js.undefined
  
  /**
    * The category of problem for the AWS Support case. You also use the DescribeServices operation to get the category code for a service. Each AWS service defines its own set of category codes.
    */
  var categoryCode: js.UndefOr[CategoryCode] = js.undefined
  
  /**
    * A list of email addresses that AWS Support copies on case correspondence. AWS Support identifies the account that creates the case when you specify your AWS credentials in an HTTP POST method or use the AWS SDKs. 
    */
  var ccEmailAddresses: js.UndefOr[CcEmailAddressList] = js.undefined
  
  /**
    * The communication body text that describes the issue. This text appears in the Description field on the AWS Support Center Create Case page.
    */
  var communicationBody: CommunicationBody
  
  /**
    * The type of issue for the case. You can specify customer-service or technical. If you don't specify a value, the default is technical.
    */
  var issueType: js.UndefOr[IssueType] = js.undefined
  
  /**
    * The language in which AWS Support handles the case. You must specify the ISO 639-1 code for the language parameter if you want support in that language. Currently, English ("en") and Japanese ("ja") are supported.
    */
  var language: js.UndefOr[Language] = js.undefined
  
  /**
    * The code for the AWS service. You can use the DescribeServices operation to get the possible serviceCode values.
    */
  var serviceCode: js.UndefOr[ServiceCode] = js.undefined
  
  /**
    * A value that indicates the urgency of the case. This value determines the response time according to your service level agreement with AWS Support. You can use the DescribeSeverityLevels operation to get the possible values for severityCode.  For more information, see SeverityLevel and Choosing a Severity in the AWS Support User Guide.  The availability of severity levels depends on the support plan for the AWS account. 
    */
  var severityCode: js.UndefOr[SeverityCode] = js.undefined
  
  /**
    * The title of the AWS Support case. The title appears in the Subject field on the AWS Support Center Create Case page.
    */
  var subject: Subject
}
object CreateCaseRequest {
  
  @scala.inline
  def apply(communicationBody: CommunicationBody, subject: Subject): CreateCaseRequest = {
    val __obj = js.Dynamic.literal(communicationBody = communicationBody.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCaseRequest]
  }
  
  @scala.inline
  implicit class CreateCaseRequestMutableBuilder[Self <: CreateCaseRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachmentSetId(value: AttachmentSetId): Self = StObject.set(x, "attachmentSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentSetIdUndefined: Self = StObject.set(x, "attachmentSetId", js.undefined)
    
    @scala.inline
    def setCategoryCode(value: CategoryCode): Self = StObject.set(x, "categoryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryCodeUndefined: Self = StObject.set(x, "categoryCode", js.undefined)
    
    @scala.inline
    def setCcEmailAddresses(value: CcEmailAddressList): Self = StObject.set(x, "ccEmailAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCcEmailAddressesUndefined: Self = StObject.set(x, "ccEmailAddresses", js.undefined)
    
    @scala.inline
    def setCcEmailAddressesVarargs(value: CcEmailAddress*): Self = StObject.set(x, "ccEmailAddresses", js.Array(value :_*))
    
    @scala.inline
    def setCommunicationBody(value: CommunicationBody): Self = StObject.set(x, "communicationBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssueType(value: IssueType): Self = StObject.set(x, "issueType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssueTypeUndefined: Self = StObject.set(x, "issueType", js.undefined)
    
    @scala.inline
    def setLanguage(value: Language): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setServiceCode(value: ServiceCode): Self = StObject.set(x, "serviceCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceCodeUndefined: Self = StObject.set(x, "serviceCode", js.undefined)
    
    @scala.inline
    def setSeverityCode(value: SeverityCode): Self = StObject.set(x, "severityCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeverityCodeUndefined: Self = StObject.set(x, "severityCode", js.undefined)
    
    @scala.inline
    def setSubject(value: Subject): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
  }
}
