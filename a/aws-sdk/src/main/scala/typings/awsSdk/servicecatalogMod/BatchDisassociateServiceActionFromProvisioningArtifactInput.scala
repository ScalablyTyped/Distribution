package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchDisassociateServiceActionFromProvisioningArtifactInput extends js.Object {
  
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsSdk.servicecatalogMod.AcceptLanguage] = js.native
  
  /**
    * One or more associations, each consisting of the Action ID, the Product ID, and the Provisioning Artifact ID.
    */
  var ServiceActionAssociations: typings.awsSdk.servicecatalogMod.ServiceActionAssociations = js.native
}
object BatchDisassociateServiceActionFromProvisioningArtifactInput {
  
  @scala.inline
  def apply(ServiceActionAssociations: ServiceActionAssociations): BatchDisassociateServiceActionFromProvisioningArtifactInput = {
    val __obj = js.Dynamic.literal(ServiceActionAssociations = ServiceActionAssociations.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDisassociateServiceActionFromProvisioningArtifactInput]
  }
  
  @scala.inline
  implicit class BatchDisassociateServiceActionFromProvisioningArtifactInputOps[Self <: BatchDisassociateServiceActionFromProvisioningArtifactInput] (val x: Self) extends AnyVal {
    
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
    def setServiceActionAssociationsVarargs(value: ServiceActionAssociation*): Self = this.set("ServiceActionAssociations", js.Array(value :_*))
    
    @scala.inline
    def setServiceActionAssociations(value: ServiceActionAssociations): Self = this.set("ServiceActionAssociations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptLanguage(value: AcceptLanguage): Self = this.set("AcceptLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcceptLanguage: Self = this.set("AcceptLanguage", js.undefined)
  }
}
