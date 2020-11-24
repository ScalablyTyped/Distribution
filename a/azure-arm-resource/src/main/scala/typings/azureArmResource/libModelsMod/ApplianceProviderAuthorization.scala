package typings.azureArmResource.libModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplianceProviderAuthorization extends js.Object {
  
  /**
    * The provider's principal identifier. This is the identity that the provider will use to call
    * ARM to manage the appliance resources.
    */
  var principalId: String = js.native
  
  /**
    * The provider's role definition identifier. This role will define all the permissions that the
    * provider must have on the appliance's container resource group. This role definition cannot
    * have permission to delete the resource group.
    */
  var roleDefinitionId: String = js.native
}
object ApplianceProviderAuthorization {
  
  @scala.inline
  def apply(principalId: String, roleDefinitionId: String): ApplianceProviderAuthorization = {
    val __obj = js.Dynamic.literal(principalId = principalId.asInstanceOf[js.Any], roleDefinitionId = roleDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplianceProviderAuthorization]
  }
  
  @scala.inline
  implicit class ApplianceProviderAuthorizationOps[Self <: ApplianceProviderAuthorization] (val x: Self) extends AnyVal {
    
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
    def setPrincipalId(value: String): Self = this.set("principalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleDefinitionId(value: String): Self = this.set("roleDefinitionId", value.asInstanceOf[js.Any])
  }
}
