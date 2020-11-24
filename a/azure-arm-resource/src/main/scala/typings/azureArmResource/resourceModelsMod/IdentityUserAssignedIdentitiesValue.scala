package typings.azureArmResource.resourceModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdentityUserAssignedIdentitiesValue extends js.Object {
  
  /**
    * The client id of user assigned identity.
    */
  val clientId: js.UndefOr[String] = js.native
  
  /**
    * The principal id of user assigned identity.
    */
  val principalId: js.UndefOr[String] = js.native
}
object IdentityUserAssignedIdentitiesValue {
  
  @scala.inline
  def apply(): IdentityUserAssignedIdentitiesValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityUserAssignedIdentitiesValue]
  }
  
  @scala.inline
  implicit class IdentityUserAssignedIdentitiesValueOps[Self <: IdentityUserAssignedIdentitiesValue] (val x: Self) extends AnyVal {
    
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
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientId: Self = this.set("clientId", js.undefined)
    
    @scala.inline
    def setPrincipalId(value: String): Self = this.set("principalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrincipalId: Self = this.set("principalId", js.undefined)
  }
}
