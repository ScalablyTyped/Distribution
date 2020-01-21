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
  def apply(
    Name: ReceiptRuleName,
    Actions: ReceiptActionsList = null,
    Enabled: js.UndefOr[Boolean] = js.undefined,
    Recipients: RecipientsList = null,
    ScanEnabled: js.UndefOr[Boolean] = js.undefined,
    TlsPolicy: TlsPolicy = null
  ): ReceiptRule = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    if (Actions != null) __obj.updateDynamic("Actions")(Actions.asInstanceOf[js.Any])
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.asInstanceOf[js.Any])
    if (Recipients != null) __obj.updateDynamic("Recipients")(Recipients.asInstanceOf[js.Any])
    if (!js.isUndefined(ScanEnabled)) __obj.updateDynamic("ScanEnabled")(ScanEnabled.asInstanceOf[js.Any])
    if (TlsPolicy != null) __obj.updateDynamic("TlsPolicy")(TlsPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceiptRule]
  }
}

