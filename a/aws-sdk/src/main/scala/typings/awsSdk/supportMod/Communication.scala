package typings.awsSdk.supportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Communication extends js.Object {
  /**
    * Information about the attachments to the case communication.
    */
  var attachmentSet: js.UndefOr[AttachmentSet] = js.native
  /**
    * The text of the communication between the customer and AWS Support.
    */
  var body: js.UndefOr[CommunicationBody] = js.native
  /**
    * The AWS Support case ID requested or returned in the call. The case ID is an alphanumeric string formatted as shown in this example: case-12345678910-2013-c4c1d2bf33c5cf47 
    */
  var caseId: js.UndefOr[CaseId] = js.native
  /**
    * The identity of the account that submitted, or responded to, the support case. Customer entries include the role or IAM user as well as the email address. For example, "AdminRole (Role) &lt;someone@example.com&gt;. Entries from the AWS Support team display "Amazon Web Services," and do not show an email address. 
    */
  var submittedBy: js.UndefOr[SubmittedBy] = js.native
  /**
    * The time the communication was created.
    */
  var timeCreated: js.UndefOr[TimeCreated] = js.native
}

object Communication {
  @scala.inline
  def apply(
    attachmentSet: AttachmentSet = null,
    body: CommunicationBody = null,
    caseId: CaseId = null,
    submittedBy: SubmittedBy = null,
    timeCreated: TimeCreated = null
  ): Communication = {
    val __obj = js.Dynamic.literal()
    if (attachmentSet != null) __obj.updateDynamic("attachmentSet")(attachmentSet.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (caseId != null) __obj.updateDynamic("caseId")(caseId.asInstanceOf[js.Any])
    if (submittedBy != null) __obj.updateDynamic("submittedBy")(submittedBy.asInstanceOf[js.Any])
    if (timeCreated != null) __obj.updateDynamic("timeCreated")(timeCreated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Communication]
  }
}

