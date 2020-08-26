package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReceiptRule extends js.Object {
  /**
    * An ordered list of actions to perform on messages that match at least one of the recipient email addresses or domains specified in the receipt rule.
    */
  var Actions: js.UndefOr[ReceiptActionsList] = js.native
  /**
    * If true, the receipt rule is active. The default value is false.
    */
  var Enabled: js.UndefOr[typings.awsSdk.sesMod.Enabled] = js.native
  /**
    * The name of the receipt rule. The name must:   This value can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).   Start and end with a letter or number.   Contain less than 64 characters.  
    */
  var Name: ReceiptRuleName = js.native
  /**
    * The recipient domains and email addresses that the receipt rule applies to. If this field is not specified, this rule will match all recipients under all verified domains.
    */
  var Recipients: js.UndefOr[RecipientsList] = js.native
  /**
    * If true, then messages that this receipt rule applies to are scanned for spam and viruses. The default value is false.
    */
  var ScanEnabled: js.UndefOr[Enabled] = js.native
  /**
    * Specifies whether Amazon SES should require that incoming email is delivered over a connection encrypted with Transport Layer Security (TLS). If this parameter is set to Require, Amazon SES will bounce emails that are not received over TLS. The default is Optional.
    */
  var TlsPolicy: js.UndefOr[typings.awsSdk.sesMod.TlsPolicy] = js.native
}

object ReceiptRule {
  @scala.inline
  def apply(Name: ReceiptRuleName): ReceiptRule = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceiptRule]
  }
  @scala.inline
  implicit class ReceiptRuleOps[Self <: ReceiptRule] (val x: Self) extends AnyVal {
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
    def setName(value: ReceiptRuleName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setActionsVarargs(value: ReceiptAction*): Self = this.set("Actions", js.Array(value :_*))
    @scala.inline
    def setActions(value: ReceiptActionsList): Self = this.set("Actions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActions: Self = this.set("Actions", js.undefined)
    @scala.inline
    def setEnabled(value: Enabled): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("Enabled", js.undefined)
    @scala.inline
    def setRecipientsVarargs(value: Recipient*): Self = this.set("Recipients", js.Array(value :_*))
    @scala.inline
    def setRecipients(value: RecipientsList): Self = this.set("Recipients", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecipients: Self = this.set("Recipients", js.undefined)
    @scala.inline
    def setScanEnabled(value: Enabled): Self = this.set("ScanEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScanEnabled: Self = this.set("ScanEnabled", js.undefined)
    @scala.inline
    def setTlsPolicy(value: TlsPolicy): Self = this.set("TlsPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTlsPolicy: Self = this.set("TlsPolicy", js.undefined)
  }
  
}

