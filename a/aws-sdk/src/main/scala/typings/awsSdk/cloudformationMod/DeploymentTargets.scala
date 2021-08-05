package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentTargets extends StObject {
  
  /**
    * The names of one or more AWS accounts for which you want to deploy stack set updates.
    */
  var Accounts: js.UndefOr[AccountList] = js.undefined
  
  /**
    * The organization root ID or organizational unit (OU) IDs to which StackSets deploys.
    */
  var OrganizationalUnitIds: js.UndefOr[OrganizationalUnitIdList] = js.undefined
}
object DeploymentTargets {
  
  inline def apply(): DeploymentTargets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentTargets]
  }
  
  extension [Self <: DeploymentTargets](x: Self) {
    
    inline def setAccounts(value: AccountList): Self = StObject.set(x, "Accounts", value.asInstanceOf[js.Any])
    
    inline def setAccountsUndefined: Self = StObject.set(x, "Accounts", js.undefined)
    
    inline def setAccountsVarargs(value: Account*): Self = StObject.set(x, "Accounts", js.Array(value :_*))
    
    inline def setOrganizationalUnitIds(value: OrganizationalUnitIdList): Self = StObject.set(x, "OrganizationalUnitIds", value.asInstanceOf[js.Any])
    
    inline def setOrganizationalUnitIdsUndefined: Self = StObject.set(x, "OrganizationalUnitIds", js.undefined)
    
    inline def setOrganizationalUnitIdsVarargs(value: OrganizationalUnitId*): Self = StObject.set(x, "OrganizationalUnitIds", js.Array(value :_*))
  }
}
