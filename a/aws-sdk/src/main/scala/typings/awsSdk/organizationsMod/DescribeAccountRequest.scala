package typings.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAccountRequest extends js.Object {
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
}

