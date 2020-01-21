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
  def apply(StackSetAccounts: StackSetAccounts = null, StackSetRegions: StackSetRegions = null): ProvisioningArtifactPreferences = {
    val __obj = js.Dynamic.literal()
    if (StackSetAccounts != null) __obj.updateDynamic("StackSetAccounts")(StackSetAccounts.asInstanceOf[js.Any])
    if (StackSetRegions != null) __obj.updateDynamic("StackSetRegions")(StackSetRegions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvisioningArtifactPreferences]
  }
}

