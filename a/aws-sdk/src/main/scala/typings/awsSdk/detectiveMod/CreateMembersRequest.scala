package typings.awsSdk.detectiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMembersRequest extends StObject {
  
  /**
    * The list of Amazon Web Services accounts to invite or to enable. You can invite or enable up to 50 accounts at a time. For each invited account, the account list contains the account identifier and the Amazon Web Services account root user email address. For organization accounts in the organization behavior graph, the email address is not required.
    */
  var Accounts: AccountList
  
  /**
    * if set to true, then the invited accounts do not receive email notifications. By default, this is set to false, and the invited accounts receive email notifications. Organization accounts in the organization behavior graph do not receive email notifications.
    */
  var DisableEmailNotification: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ARN of the behavior graph.
    */
  var GraphArn: typings.awsSdk.detectiveMod.GraphArn
  
  /**
    * Customized message text to include in the invitation email message to the invited member accounts.
    */
  var Message: js.UndefOr[EmailMessage] = js.undefined
}
object CreateMembersRequest {
  
  inline def apply(Accounts: AccountList, GraphArn: GraphArn): CreateMembersRequest = {
    val __obj = js.Dynamic.literal(Accounts = Accounts.asInstanceOf[js.Any], GraphArn = GraphArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMembersRequest]
  }
  
  extension [Self <: CreateMembersRequest](x: Self) {
    
    inline def setAccounts(value: AccountList): Self = StObject.set(x, "Accounts", value.asInstanceOf[js.Any])
    
    inline def setAccountsVarargs(value: Account*): Self = StObject.set(x, "Accounts", js.Array(value*))
    
    inline def setDisableEmailNotification(value: Boolean): Self = StObject.set(x, "DisableEmailNotification", value.asInstanceOf[js.Any])
    
    inline def setDisableEmailNotificationUndefined: Self = StObject.set(x, "DisableEmailNotification", js.undefined)
    
    inline def setGraphArn(value: GraphArn): Self = StObject.set(x, "GraphArn", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: EmailMessage): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
