package typings.awsSdk.supportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCaseRequest extends js.Object {
  /**
    * The ID of a set of one or more attachments for the case. Create the set by using the AddAttachmentsToSet operation.
    */
  var attachmentSetId: js.UndefOr[AttachmentSetId] = js.native
  /**
    * The category of problem for the AWS Support case. You also use the DescribeServices operation to get the category code for a service. Each AWS service defines its own set of category codes.
    */
  var categoryCode: js.UndefOr[CategoryCode] = js.native
  /**
    * A list of email addresses that AWS Support copies on case correspondence. AWS Support identifies the account that creates the case when you specify your AWS credentials in an HTTP POST method or use the AWS SDKs. 
    */
  var ccEmailAddresses: js.UndefOr[CcEmailAddressList] = js.native
  /**
    * The communication body text that describes the issue. This text appears in the Description field on the AWS Support Center Create Case page.
    */
  var communicationBody: CommunicationBody = js.native
  /**
    * The type of issue for the case. You can specify customer-service or technical. If you don't specify a value, the default is technical.
    */
  var issueType: js.UndefOr[IssueType] = js.native
  /**
    * The language in which AWS Support handles the case. You must specify the ISO 639-1 code for the language parameter if you want support in that language. Currently, English ("en") and Japanese ("ja") are supported.
    */
  var language: js.UndefOr[Language] = js.native
  /**
    * The code for the AWS service. You can use the DescribeServices operation to get the possible serviceCode values.
    */
  var serviceCode: js.UndefOr[ServiceCode] = js.native
  /**
    * A value that indicates the urgency of the case. This value determines the response time according to your service level agreement with AWS Support. You can use the DescribeSeverityLevels operation to get the possible values for severityCode.  For more information, see SeverityLevel and Choosing a Severity in the AWS Support User Guide.  The availability of severity levels depends on the support plan for the AWS account. 
    */
  var severityCode: js.UndefOr[SeverityCode] = js.native
  /**
    * The title of the AWS Support case. The title appears in the Subject field on the AWS Support Center Create Case page.
    */
  var subject: Subject = js.native
}

object CreateCaseRequest {
  @scala.inline
  def apply(communicationBody: CommunicationBody, subject: Subject): CreateCaseRequest = {
    val __obj = js.Dynamic.literal(communicationBody = communicationBody.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCaseRequest]
  }
  @scala.inline
  implicit class CreateCaseRequestOps[Self <: CreateCaseRequest] (val x: Self) extends AnyVal {
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
    def setCommunicationBody(value: CommunicationBody): Self = this.set("communicationBody", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubject(value: Subject): Self = this.set("subject", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttachmentSetId(value: AttachmentSetId): Self = this.set("attachmentSetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttachmentSetId: Self = this.set("attachmentSetId", js.undefined)
    @scala.inline
    def setCategoryCode(value: CategoryCode): Self = this.set("categoryCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategoryCode: Self = this.set("categoryCode", js.undefined)
    @scala.inline
    def setCcEmailAddressesVarargs(value: CcEmailAddress*): Self = this.set("ccEmailAddresses", js.Array(value :_*))
    @scala.inline
    def setCcEmailAddresses(value: CcEmailAddressList): Self = this.set("ccEmailAddresses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCcEmailAddresses: Self = this.set("ccEmailAddresses", js.undefined)
    @scala.inline
    def setIssueType(value: IssueType): Self = this.set("issueType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIssueType: Self = this.set("issueType", js.undefined)
    @scala.inline
    def setLanguage(value: Language): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setServiceCode(value: ServiceCode): Self = this.set("serviceCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceCode: Self = this.set("serviceCode", js.undefined)
    @scala.inline
    def setSeverityCode(value: SeverityCode): Self = this.set("severityCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeverityCode: Self = this.set("severityCode", js.undefined)
  }
  
}

