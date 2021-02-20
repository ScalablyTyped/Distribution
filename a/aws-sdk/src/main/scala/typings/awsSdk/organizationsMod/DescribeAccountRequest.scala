package typings.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAccountRequest extends StObject {
  
  /**
    * The unique identifier (ID) of the AWS account that you want information about. You can get the ID from the ListAccounts or ListAccountsForParent operations. The regex pattern for an account ID string requires exactly 12 digits.
    */
  var AccountId: typings.awsSdk.organizationsMod.AccountId = js.native
}
object DescribeAccountRequest {
  
  @scala.inline
  def apply(AccountId: AccountId): DescribeAccountRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAccountRequest]
  }
  
  @scala.inline
  implicit class DescribeAccountRequestMutableBuilder[Self <: DescribeAccountRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
  }
}
