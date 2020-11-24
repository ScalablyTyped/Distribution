package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociatedGateway extends js.Object {
  
  /**
    * The ID of the associated gateway.
    */
  var id: js.UndefOr[GatewayIdentifier] = js.native
  
  /**
    * The ID of the AWS account that owns the associated virtual private gateway or transit gateway.
    */
  var ownerAccount: js.UndefOr[OwnerAccount] = js.native
  
  /**
    * The Region where the associated gateway is located.
    */
  var region: js.UndefOr[Region] = js.native
  
  /**
    * The type of associated gateway.
    */
  var `type`: js.UndefOr[GatewayType] = js.native
}
object AssociatedGateway {
  
  @scala.inline
  def apply(): AssociatedGateway = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociatedGateway]
  }
  
  @scala.inline
  implicit class AssociatedGatewayOps[Self <: AssociatedGateway] (val x: Self) extends AnyVal {
    
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
    def setId(value: GatewayIdentifier): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setOwnerAccount(value: OwnerAccount): Self = this.set("ownerAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerAccount: Self = this.set("ownerAccount", js.undefined)
    
    @scala.inline
    def setRegion(value: Region): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    
    @scala.inline
    def setType(value: GatewayType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
