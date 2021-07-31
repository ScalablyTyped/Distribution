package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProvisioningArtifactPreferences extends StObject {
  
  /**
    * One or more AWS accounts where stack instances are deployed from the stack set. These accounts can be scoped in ProvisioningPreferences$StackSetAccounts and UpdateProvisioningPreferences$StackSetAccounts. Applicable only to a CFN_STACKSET provisioned product type.
    */
  var StackSetAccounts: js.UndefOr[typings.awsSdk.servicecatalogMod.StackSetAccounts] = js.undefined
  
  /**
    * One or more AWS Regions where stack instances are deployed from the stack set. These regions can be scoped in ProvisioningPreferences$StackSetRegions and UpdateProvisioningPreferences$StackSetRegions. Applicable only to a CFN_STACKSET provisioned product type.
    */
  var StackSetRegions: js.UndefOr[typings.awsSdk.servicecatalogMod.StackSetRegions] = js.undefined
}
object ProvisioningArtifactPreferences {
  
  @scala.inline
  def apply(): ProvisioningArtifactPreferences = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisioningArtifactPreferences]
  }
  
  @scala.inline
  implicit class ProvisioningArtifactPreferencesMutableBuilder[Self <: ProvisioningArtifactPreferences] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStackSetAccounts(value: StackSetAccounts): Self = StObject.set(x, "StackSetAccounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackSetAccountsUndefined: Self = StObject.set(x, "StackSetAccounts", js.undefined)
    
    @scala.inline
    def setStackSetAccountsVarargs(value: AccountId*): Self = StObject.set(x, "StackSetAccounts", js.Array(value :_*))
    
    @scala.inline
    def setStackSetRegions(value: StackSetRegions): Self = StObject.set(x, "StackSetRegions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackSetRegionsUndefined: Self = StObject.set(x, "StackSetRegions", js.undefined)
    
    @scala.inline
    def setStackSetRegionsVarargs(value: Region*): Self = StObject.set(x, "StackSetRegions", js.Array(value :_*))
  }
}
