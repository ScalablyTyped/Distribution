package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FailedServiceActionAssociation extends js.Object {
  
  /**
    * The error code. Valid values are listed below.
    */
  var ErrorCode: js.UndefOr[ServiceActionAssociationErrorCode] = js.native
  
  /**
    * A text description of the error.
    */
  var ErrorMessage: js.UndefOr[ServiceActionAssociationErrorMessage] = js.native
  
  /**
    * The product identifier. For example, prod-abcdzk7xy33qa.
    */
  var ProductId: js.UndefOr[Id] = js.native
  
  /**
    * The identifier of the provisioning artifact. For example, pa-4abcdjnxjj6ne.
    */
  var ProvisioningArtifactId: js.UndefOr[Id] = js.native
  
  /**
    * The self-service action identifier. For example, act-fs7abcd89wxyz.
    */
  var ServiceActionId: js.UndefOr[Id] = js.native
}
object FailedServiceActionAssociation {
  
  @scala.inline
  def apply(): FailedServiceActionAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailedServiceActionAssociation]
  }
  
  @scala.inline
  implicit class FailedServiceActionAssociationOps[Self <: FailedServiceActionAssociation] (val x: Self) extends AnyVal {
    
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
    def setErrorCode(value: ServiceActionAssociationErrorCode): Self = this.set("ErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorCode: Self = this.set("ErrorCode", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: ServiceActionAssociationErrorMessage): Self = this.set("ErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMessage: Self = this.set("ErrorMessage", js.undefined)
    
    @scala.inline
    def setProductId(value: Id): Self = this.set("ProductId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductId: Self = this.set("ProductId", js.undefined)
    
    @scala.inline
    def setProvisioningArtifactId(value: Id): Self = this.set("ProvisioningArtifactId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvisioningArtifactId: Self = this.set("ProvisioningArtifactId", js.undefined)
    
    @scala.inline
    def setServiceActionId(value: Id): Self = this.set("ServiceActionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceActionId: Self = this.set("ServiceActionId", js.undefined)
  }
}
