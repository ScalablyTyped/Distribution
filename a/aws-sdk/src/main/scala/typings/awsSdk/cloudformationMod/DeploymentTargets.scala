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
  def apply(Accounts: AccountList = null, OrganizationalUnitIds: OrganizationalUnitIdList = null): DeploymentTargets = {
    val __obj = js.Dynamic.literal()
    if (Accounts != null) __obj.updateDynamic("Accounts")(Accounts.asInstanceOf[js.Any])
    if (OrganizationalUnitIds != null) __obj.updateDynamic("OrganizationalUnitIds")(OrganizationalUnitIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentTargets]
  }
}

