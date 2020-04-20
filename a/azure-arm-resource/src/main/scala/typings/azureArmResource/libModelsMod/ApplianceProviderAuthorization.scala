package typings.azureArmResource.libModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplianceProviderAuthorization extends js.Object {
  /**
    * The provider's principal identifier. This is the identity that the provider will use to call
    * ARM to manage the appliance resources.
    */
  var principalId: String
  /**
    * The provider's role definition identifier. This role will define all the permissions that the
    * provider must have on the appliance's container resource group. This role definition cannot
    * have permission to delete the resource group.
    */
  var roleDefinitionId: String
}

object ApplianceProviderAuthorization {
  @scala.inline
  def apply(principalId: String, roleDefinitionId: String): ApplianceProviderAuthorization = {
    val __obj = js.Dynamic.literal(principalId = principalId.asInstanceOf[js.Any], roleDefinitionId = roleDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplianceProviderAuthorization]
  }
}

