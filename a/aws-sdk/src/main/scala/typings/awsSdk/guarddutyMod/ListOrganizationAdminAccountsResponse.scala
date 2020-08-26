package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListOrganizationAdminAccountsResponse extends js.Object {
  /**
    * An AdminAccounts object that includes a list of accounts configured as GuardDuty delegated administrators.
    */
  var AdminAccounts: js.UndefOr[typings.awsSdk.guarddutyMod.AdminAccounts] = js.native
  /**
    * The pagination parameter to be used on the next list operation to retrieve more items.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListOrganizationAdminAccountsResponse {
  @scala.inline
  def apply(): ListOrganizationAdminAccountsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOrganizationAdminAccountsResponse]
  }
  @scala.inline
  implicit class ListOrganizationAdminAccountsResponseOps[Self <: ListOrganizationAdminAccountsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdminAccountsVarargs(value: AdminAccount*): Self = this.set("AdminAccounts", js.Array(value :_*))
    @scala.inline
    def setAdminAccounts(value: AdminAccounts): Self = this.set("AdminAccounts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdminAccounts: Self = this.set("AdminAccounts", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

