package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkEmailEntryResult extends StObject {
  
  /**
    * A description of an error that prevented a message being sent using the SendBulkTemplatedEmail operation.
    */
  var Error: js.UndefOr[ErrorMessage] = js.native
  
  /**
    * The unique message identifier returned from the SendBulkTemplatedEmail operation.
    */
  var MessageId: js.UndefOr[OutboundMessageId] = js.native
  
  /**
    * The status of a message sent using the SendBulkTemplatedEmail operation. Possible values for this parameter include:   SUCCESS: Amazon SES accepted the message, and will attempt to deliver it to the recipients.   MESSAGE_REJECTED: The message was rejected because it contained a virus.   MAIL_FROM_DOMAIN_NOT_VERIFIED: The sender's email address or domain was not verified.   CONFIGURATION_SET_DOES_NOT_EXIST: The configuration set you specified does not exist.   TEMPLATE_DOES_NOT_EXIST: The template you specified does not exist.   ACCOUNT_SUSPENDED: Your account has been shut down because of issues related to your email sending practices.   ACCOUNT_THROTTLED: The number of emails you can send has been reduced because your account has exceeded its allocated sending limit.   ACCOUNT_DAILY_QUOTA_EXCEEDED: You have reached or exceeded the maximum number of emails you can send from your account in a 24-hour period.   INVALID_SENDING_POOL_NAME: The configuration set you specified refers to an IP pool that does not exist.   ACCOUNT_SENDING_PAUSED: Email sending for the Amazon SES account was disabled using the UpdateAccountSendingEnabled operation.   CONFIGURATION_SET_SENDING_PAUSED: Email sending for this configuration set was disabled using the UpdateConfigurationSetSendingEnabled operation.   INVALID_PARAMETER_VALUE: One or more of the parameters you specified when calling this operation was invalid. See the error message for additional information.   TRANSIENT_FAILURE: Amazon SES was unable to process your request because of a temporary issue.   FAILED: Amazon SES was unable to process your request. See the error message for additional information.  
    */
  var Status: js.UndefOr[BulkEmailStatus] = js.native
}
object BulkEmailEntryResult {
  
  @scala.inline
  def apply(): BulkEmailEntryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkEmailEntryResult]
  }
  
  @scala.inline
  implicit class BulkEmailEntryResultMutableBuilder[Self <: BulkEmailEntryResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: ErrorMessage): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "Error", js.undefined)
    
    @scala.inline
    def setMessageId(value: OutboundMessageId): Self = StObject.set(x, "MessageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageIdUndefined: Self = StObject.set(x, "MessageId", js.undefined)
    
    @scala.inline
    def setStatus(value: BulkEmailStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
