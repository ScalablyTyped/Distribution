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
  @scala.inline
  implicit class DescribeAccountRequestOps[Self <: DescribeAccountRequest] (val x: Self) extends AnyVal {
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
    def setAccountId(value: AccountId): Self = this.set("AccountId", value.asInstanceOf[js.Any])
  }
  
}

