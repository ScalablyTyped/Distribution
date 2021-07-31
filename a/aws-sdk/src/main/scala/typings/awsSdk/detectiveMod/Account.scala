package typings.awsSdk.detectiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Account extends StObject {
  
  /**
    * The account identifier of the AWS account.
    */
  var AccountId: typings.awsSdk.detectiveMod.AccountId
  
  /**
    * The AWS account root user email address for the AWS account.
    */
  var EmailAddress: typings.awsSdk.detectiveMod.EmailAddress
}
object Account {
  
  @scala.inline
  def apply(AccountId: AccountId, EmailAddress: EmailAddress): Account = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], EmailAddress = EmailAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[Account]
  }
  
  @scala.inline
  implicit class AccountMutableBuilder[Self <: Account] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailAddress(value: EmailAddress): Self = StObject.set(x, "EmailAddress", value.asInstanceOf[js.Any])
  }
}
