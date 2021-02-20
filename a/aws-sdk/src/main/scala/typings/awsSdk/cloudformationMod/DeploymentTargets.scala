package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeploymentTargets extends StObject {
  
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
  implicit class DeploymentTargetsMutableBuilder[Self <: DeploymentTargets] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccounts(value: AccountList): Self = StObject.set(x, "Accounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountsUndefined: Self = StObject.set(x, "Accounts", js.undefined)
    
    @scala.inline
    def setAccountsVarargs(value: Account*): Self = StObject.set(x, "Accounts", js.Array(value :_*))
    
    @scala.inline
    def setOrganizationalUnitIds(value: OrganizationalUnitIdList): Self = StObject.set(x, "OrganizationalUnitIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationalUnitIdsUndefined: Self = StObject.set(x, "OrganizationalUnitIds", js.undefined)
    
    @scala.inline
    def setOrganizationalUnitIdsVarargs(value: OrganizationalUnitId*): Self = StObject.set(x, "OrganizationalUnitIds", js.Array(value :_*))
  }
}
