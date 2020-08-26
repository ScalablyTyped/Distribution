package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentTargets extends js.Object {
  /**
    * The names of one or more AWS accounts for which you want to deploy stack set updates.
    */
  var Accounts: js.UndefOr[AccountList] = js.native
  /**
    * The organization root ID or organizational unit (OU) IDs to which StackSets deploys.
    */
  var OrganizationalUnitIds: js.UndefOr[OrganizationalUnitIdList] = js.native
}

object DeploymentTargets {
  @scala.inline
  def apply(): DeploymentTargets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentTargets]
  }
  @scala.inline
  implicit class DeploymentTargetsOps[Self <: DeploymentTargets] (val x: Self) extends AnyVal {
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
    def setAccountsVarargs(value: Account*): Self = this.set("Accounts", js.Array(value :_*))
    @scala.inline
    def setAccounts(value: AccountList): Self = this.set("Accounts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccounts: Self = this.set("Accounts", js.undefined)
    @scala.inline
    def setOrganizationalUnitIdsVarargs(value: OrganizationalUnitId*): Self = this.set("OrganizationalUnitIds", js.Array(value :_*))
    @scala.inline
    def setOrganizationalUnitIds(value: OrganizationalUnitIdList): Self = this.set("OrganizationalUnitIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrganizationalUnitIds: Self = this.set("OrganizationalUnitIds", js.undefined)
  }
  
}

