package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkEmailDestinationStatus extends js.Object {
  
  /**
    * A description of an error that prevented a message being sent using the SendBulkTemplatedEmail operation.
    */
  var Error: js.UndefOr[typings.awsSdk.sesMod.Error] = js.native
  
  /**
    * The unique message identifier returned from the SendBulkTemplatedEmail operation.
    */
  var MessageId: js.UndefOr[typings.awsSdk.sesMod.MessageId] = js.native
  
  /**
    * The status of a message sent using the SendBulkTemplatedEmail operation. Possible values for this parameter include:    Success: Amazon SES accepted the message, and will attempt to deliver it to the recipients.    MessageRejected: The message was rejected because it contained a virus.    MailFromDomainNotVerified: The sender's email address or domain was not verified.    ConfigurationSetDoesNotExist: The configuration set you specified does not exist.    TemplateDoesNotExist: The template you specified does not exist.    AccountSuspended: Your account has been shut down because of issues related to your email sending practices.    AccountThrottled: The number of emails you can send has been reduced because your account has exceeded its allocated sending limit.    AccountDailyQuotaExceeded: You have reached or exceeded the maximum number of emails you can send from your account in a 24-hour period.    InvalidSendingPoolName: The configuration set you specified refers to an IP pool that does not exist.    AccountSendingPaused: Email sending for the Amazon SES account was disabled using the UpdateAccountSendingEnabled operation.    ConfigurationSetSendingPaused: Email sending for this configuration set was disabled using the UpdateConfigurationSetSendingEnabled operation.    InvalidParameterValue: One or more of the parameters you specified when calling this operation was invalid. See the error message for additional information.    TransientFailure: Amazon SES was unable to process your request because of a temporary issue.    Failed: Amazon SES was unable to process your request. See the error message for additional information.  
    */
  var Status: js.UndefOr[BulkEmailStatus] = js.native
}
object BulkEmailDestinationStatus {
  
  @scala.inline
  def apply(): BulkEmailDestinationStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkEmailDestinationStatus]
  }
  
  @scala.inline
  implicit class BulkEmailDestinationStatusOps[Self <: BulkEmailDestinationStatus] (val x: Self) extends AnyVal {
    
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
    def setError(value: Error): Self = this.set("Error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("Error", js.undefined)
    
    @scala.inline
    def setMessageId(value: MessageId): Self = this.set("MessageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageId: Self = this.set("MessageId", js.undefined)
    
    @scala.inline
    def setStatus(value: BulkEmailStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
}
