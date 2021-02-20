package typings.awsSdk.supportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Communication extends StObject {
  
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
  def apply(): Communication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Communication]
  }
  
  @scala.inline
  implicit class CommunicationMutableBuilder[Self <: Communication] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachmentSet(value: AttachmentSet): Self = StObject.set(x, "attachmentSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentSetUndefined: Self = StObject.set(x, "attachmentSet", js.undefined)
    
    @scala.inline
    def setAttachmentSetVarargs(value: AttachmentDetails*): Self = StObject.set(x, "attachmentSet", js.Array(value :_*))
    
    @scala.inline
    def setBody(value: CommunicationBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setCaseId(value: CaseId): Self = StObject.set(x, "caseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaseIdUndefined: Self = StObject.set(x, "caseId", js.undefined)
    
    @scala.inline
    def setSubmittedBy(value: SubmittedBy): Self = StObject.set(x, "submittedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmittedByUndefined: Self = StObject.set(x, "submittedBy", js.undefined)
    
    @scala.inline
    def setTimeCreated(value: TimeCreated): Self = StObject.set(x, "timeCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeCreatedUndefined: Self = StObject.set(x, "timeCreated", js.undefined)
  }
}
