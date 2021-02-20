package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountDetail extends StObject {
  
  /**
    * The AWS account ID for the account.
    */
  var accountId: string = js.native
  
  /**
    * The email address for the account.
    */
  var email: string = js.native
}
object AccountDetail {
  
  @scala.inline
  def apply(accountId: string, email: string): AccountDetail = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountDetail]
  }
  
  @scala.inline
  implicit class AccountDetailMutableBuilder[Self <: AccountDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: string): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail(value: string): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
  }
}
