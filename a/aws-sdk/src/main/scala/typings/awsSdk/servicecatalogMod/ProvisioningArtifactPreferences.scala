package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProvisioningArtifactPreferences extends js.Object {
  /**
    * One or more AWS accounts where stack instances are deployed from the stack set. These accounts can be scoped in ProvisioningPreferences$StackSetAccounts and UpdateProvisioningPreferences$StackSetAccounts. Applicable only to a CFN_STACKSET provisioned product type.
    */
  var StackSetAccounts: js.UndefOr[typings.awsSdk.servicecatalogMod.StackSetAccounts] = js.native
  /**
    * One or more AWS Regions where stack instances are deployed from the stack set. These regions can be scoped in ProvisioningPreferences$StackSetRegions and UpdateProvisioningPreferences$StackSetRegions. Applicable only to a CFN_STACKSET provisioned product type.
    */
  var StackSetRegions: js.UndefOr[typings.awsSdk.servicecatalogMod.StackSetRegions] = js.native
}

object ProvisioningArtifactPreferences {
  @scala.inline
  def apply(): ProvisioningArtifactPreferences = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisioningArtifactPreferences]
  }
  @scala.inline
  implicit class ProvisioningArtifactPreferencesOps[Self <: ProvisioningArtifactPreferences] (val x: Self) extends AnyVal {
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
    def setStackSetAccountsVarargs(value: AccountId*): Self = this.set("StackSetAccounts", js.Array(value :_*))
    @scala.inline
    def setStackSetAccounts(value: StackSetAccounts): Self = this.set("StackSetAccounts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStackSetAccounts: Self = this.set("StackSetAccounts", js.undefined)
    @scala.inline
    def setStackSetRegionsVarargs(value: Region*): Self = this.set("StackSetRegions", js.Array(value :_*))
    @scala.inline
    def setStackSetRegions(value: StackSetRegions): Self = this.set("StackSetRegions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStackSetRegions: Self = this.set("StackSetRegions", js.undefined)
  }
  
}

