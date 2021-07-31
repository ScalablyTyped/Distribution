package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnprocessedAccount extends StObject {
  
  /**
    * The AWS account ID.
    */
  var AccountId: typings.awsSdk.guarddutyMod.AccountId
  
  /**
    * A reason why the account hasn't been processed.
    */
  var Result: String
}
object UnprocessedAccount {
  
  @scala.inline
  def apply(AccountId: AccountId, Result: String): UnprocessedAccount = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], Result = Result.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnprocessedAccount]
  }
  
  @scala.inline
  implicit class UnprocessedAccountMutableBuilder[Self <: UnprocessedAccount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: String): Self = StObject.set(x, "Result", value.asInstanceOf[js.Any])
  }
}
