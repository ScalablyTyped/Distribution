package typings.awsSdk.ramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociateResourceShareResponse extends js.Object {
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientToken: js.UndefOr[String] = js.native
  
  /**
    * Information about the associations.
    */
  var resourceShareAssociations: js.UndefOr[ResourceShareAssociationList] = js.native
}
object AssociateResourceShareResponse {
  
  @scala.inline
  def apply(): AssociateResourceShareResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateResourceShareResponse]
  }
  
  @scala.inline
  implicit class AssociateResourceShareResponseOps[Self <: AssociateResourceShareResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClientToken(value: String): Self = this.set("clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientToken: Self = this.set("clientToken", js.undefined)
    
    @scala.inline
    def setResourceShareAssociationsVarargs(value: ResourceShareAssociation*): Self = this.set("resourceShareAssociations", js.Array(value :_*))
    
    @scala.inline
    def setResourceShareAssociations(value: ResourceShareAssociationList): Self = this.set("resourceShareAssociations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceShareAssociations: Self = this.set("resourceShareAssociations", js.undefined)
  }
}
