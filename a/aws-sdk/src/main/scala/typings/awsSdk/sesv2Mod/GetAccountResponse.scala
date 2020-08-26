package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAccountResponse extends js.Object {
  /**
    * Indicates whether or not the automatic warm-up feature is enabled for dedicated IP addresses that are associated with your account.
    */
  var DedicatedIpAutoWarmupEnabled: js.UndefOr[Enabled] = js.native
  /**
    * An object that defines your account details.
    */
  var Details: js.UndefOr[AccountDetails] = js.native
  /**
    * The reputation status of your Amazon SES account. The status can be one of the following:    HEALTHY – There are no reputation-related issues that currently impact your account.    PROBATION – We've identified potential issues with your Amazon SES account. We're placing your account under review while you work on correcting these issues.    SHUTDOWN – Your account's ability to send email is currently paused because of an issue with the email sent from your account. When you correct the issue, you can contact us and request that your account's ability to send email is resumed.  
    */
  var EnforcementStatus: js.UndefOr[GeneralEnforcementStatus] = js.native
  /**
    * Indicates whether or not your account has production access in the current AWS Region. If the value is false, then your account is in the sandbox. When your account is in the sandbox, you can only send email to verified identities. Additionally, the maximum number of emails you can send in a 24-hour period (your sending quota) is 200, and the maximum number of emails you can send per second (your maximum sending rate) is 1. If the value is true, then your account has production access. When your account has production access, you can send email to any address. The sending quota and maximum sending rate for your account vary based on your specific use case.
    */
  var ProductionAccessEnabled: js.UndefOr[Enabled] = js.native
  /**
    * An object that contains information about the per-day and per-second sending limits for your Amazon SES account in the current AWS Region.
    */
  var SendQuota: js.UndefOr[typings.awsSdk.sesv2Mod.SendQuota] = js.native
  /**
    * Indicates whether or not email sending is enabled for your Amazon SES account in the current AWS Region.
    */
  var SendingEnabled: js.UndefOr[Enabled] = js.native
  /**
    * An object that contains information about the email address suppression preferences for your account in the current AWS Region.
    */
  var SuppressionAttributes: js.UndefOr[typings.awsSdk.sesv2Mod.SuppressionAttributes] = js.native
}

object GetAccountResponse {
  @scala.inline
  def apply(): GetAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAccountResponse]
  }
  @scala.inline
  implicit class GetAccountResponseOps[Self <: GetAccountResponse] (val x: Self) extends AnyVal {
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
    def setDedicatedIpAutoWarmupEnabled(value: Enabled): Self = this.set("DedicatedIpAutoWarmupEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDedicatedIpAutoWarmupEnabled: Self = this.set("DedicatedIpAutoWarmupEnabled", js.undefined)
    @scala.inline
    def setDetails(value: AccountDetails): Self = this.set("Details", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetails: Self = this.set("Details", js.undefined)
    @scala.inline
    def setEnforcementStatus(value: GeneralEnforcementStatus): Self = this.set("EnforcementStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnforcementStatus: Self = this.set("EnforcementStatus", js.undefined)
    @scala.inline
    def setProductionAccessEnabled(value: Enabled): Self = this.set("ProductionAccessEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductionAccessEnabled: Self = this.set("ProductionAccessEnabled", js.undefined)
    @scala.inline
    def setSendQuota(value: SendQuota): Self = this.set("SendQuota", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSendQuota: Self = this.set("SendQuota", js.undefined)
    @scala.inline
    def setSendingEnabled(value: Enabled): Self = this.set("SendingEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSendingEnabled: Self = this.set("SendingEnabled", js.undefined)
    @scala.inline
    def setSuppressionAttributes(value: SuppressionAttributes): Self = this.set("SuppressionAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressionAttributes: Self = this.set("SuppressionAttributes", js.undefined)
  }
  
}

