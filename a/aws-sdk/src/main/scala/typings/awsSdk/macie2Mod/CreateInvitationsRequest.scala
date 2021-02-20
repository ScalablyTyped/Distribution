package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateInvitationsRequest extends StObject {
  
  /**
    * An array that lists AWS account IDs, one for each account to send the invitation to.
    */
  var accountIds: listOfString = js.native
  
  /**
    * Specifies whether to send an email notification to the root user of each account that the invitation will be sent to. This notification is in addition to an alert that the root user receives in AWS Personal Health Dashboard. To send an email notification to the root user of each account, set this value to true.
    */
  var disableEmailNotification: js.UndefOr[boolean] = js.native
  
  /**
    * A custom message to include in the invitation. Amazon Macie adds this message to the standard content that it sends for an invitation.
    */
  var message: js.UndefOr[string] = js.native
}
object CreateInvitationsRequest {
  
  @scala.inline
  def apply(accountIds: listOfString): CreateInvitationsRequest = {
    val __obj = js.Dynamic.literal(accountIds = accountIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateInvitationsRequest]
  }
  
  @scala.inline
  implicit class CreateInvitationsRequestMutableBuilder[Self <: CreateInvitationsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountIds(value: listOfString): Self = StObject.set(x, "accountIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdsVarargs(value: string*): Self = StObject.set(x, "accountIds", js.Array(value :_*))
    
    @scala.inline
    def setDisableEmailNotification(value: boolean): Self = StObject.set(x, "disableEmailNotification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableEmailNotificationUndefined: Self = StObject.set(x, "disableEmailNotification", js.undefined)
    
    @scala.inline
    def setMessage(value: string): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
