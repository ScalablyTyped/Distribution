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
  def apply(
    communicationBody: CommunicationBody,
    subject: Subject,
    attachmentSetId: AttachmentSetId = null,
    categoryCode: CategoryCode = null,
    ccEmailAddresses: CcEmailAddressList = null,
    issueType: IssueType = null,
    language: Language = null,
    serviceCode: ServiceCode = null,
    severityCode: SeverityCode = null
  ): CreateCaseRequest = {
    val __obj = js.Dynamic.literal(communicationBody = communicationBody.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    if (attachmentSetId != null) __obj.updateDynamic("attachmentSetId")(attachmentSetId.asInstanceOf[js.Any])
    if (categoryCode != null) __obj.updateDynamic("categoryCode")(categoryCode.asInstanceOf[js.Any])
    if (ccEmailAddresses != null) __obj.updateDynamic("ccEmailAddresses")(ccEmailAddresses.asInstanceOf[js.Any])
    if (issueType != null) __obj.updateDynamic("issueType")(issueType.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (serviceCode != null) __obj.updateDynamic("serviceCode")(serviceCode.asInstanceOf[js.Any])
    if (severityCode != null) __obj.updateDynamic("severityCode")(severityCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCaseRequest]
  }
}

