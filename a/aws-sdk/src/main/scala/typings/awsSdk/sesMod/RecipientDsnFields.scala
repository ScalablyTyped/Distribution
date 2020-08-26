package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecipientDsnFields extends js.Object {
  /**
    * The action performed by the reporting mail transfer agent (MTA) as a result of its attempt to deliver the message to the recipient address. This is required by RFC 3464.
    */
  var Action: DsnAction = js.native
  /**
    * An extended explanation of what went wrong; this is usually an SMTP response. See RFC 3463 for the correct formatting of this parameter.
    */
  var DiagnosticCode: js.UndefOr[typings.awsSdk.sesMod.DiagnosticCode] = js.native
  /**
    * Additional X-headers to include in the DSN.
    */
  var ExtensionFields: js.UndefOr[ExtensionFieldList] = js.native
  /**
    * The email address that the message was ultimately delivered to. This corresponds to the Final-Recipient in the DSN. If not specified, FinalRecipient will be set to the Recipient specified in the BouncedRecipientInfo structure. Either FinalRecipient or the recipient in BouncedRecipientInfo must be a recipient of the original bounced message.  Do not prepend the FinalRecipient email address with rfc 822;, as described in RFC 3798. 
    */
  var FinalRecipient: js.UndefOr[Address] = js.native
  /**
    * The time the final delivery attempt was made, in RFC 822 date-time format.
    */
  var LastAttemptDate: js.UndefOr[typings.awsSdk.sesMod.LastAttemptDate] = js.native
  /**
    * The MTA to which the remote MTA attempted to deliver the message, formatted as specified in RFC 3464 (mta-name-type; mta-name). This parameter typically applies only to propagating synchronous bounces.
    */
  var RemoteMta: js.UndefOr[typings.awsSdk.sesMod.RemoteMta] = js.native
  /**
    * The status code that indicates what went wrong. This is required by RFC 3464.
    */
  var Status: DsnStatus = js.native
}

object RecipientDsnFields {
  @scala.inline
  def apply(Action: DsnAction, Status: DsnStatus): RecipientDsnFields = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecipientDsnFields]
  }
  @scala.inline
  implicit class RecipientDsnFieldsOps[Self <: RecipientDsnFields] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAction(value: DsnAction): Self = this.set("Action", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: DsnStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def setDiagnosticCode(value: DiagnosticCode): Self = this.set("DiagnosticCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiagnosticCode: Self = this.set("DiagnosticCode", js.undefined)
    @scala.inline
    def setExtensionFieldsVarargs(value: ExtensionField*): Self = this.set("ExtensionFields", js.Array(value :_*))
    @scala.inline
    def setExtensionFields(value: ExtensionFieldList): Self = this.set("ExtensionFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensionFields: Self = this.set("ExtensionFields", js.undefined)
    @scala.inline
    def setFinalRecipient(value: Address): Self = this.set("FinalRecipient", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFinalRecipient: Self = this.set("FinalRecipient", js.undefined)
    @scala.inline
    def setLastAttemptDate(value: LastAttemptDate): Self = this.set("LastAttemptDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastAttemptDate: Self = this.set("LastAttemptDate", js.undefined)
    @scala.inline
    def setRemoteMta(value: RemoteMta): Self = this.set("RemoteMta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoteMta: Self = this.set("RemoteMta", js.undefined)
  }
  
}

