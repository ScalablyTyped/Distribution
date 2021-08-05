package typings.awsSdk.detectiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMembersRequest extends StObject {
  
  /**
    * The list of AWS accounts to invite to become member accounts in the behavior graph. For each invited account, the account list contains the account identifier and the AWS account root user email address.
    */
  var Accounts: AccountList
  
  /**
    * The ARN of the behavior graph to invite the member accounts to contribute their data to.
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
    
    inline def setAccountsVarargs(value: Account*): Self = StObject.set(x, "Accounts", js.Array(value :_*))
    
    inline def setGraphArn(value: GraphArn): Self = StObject.set(x, "GraphArn", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: EmailMessage): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
