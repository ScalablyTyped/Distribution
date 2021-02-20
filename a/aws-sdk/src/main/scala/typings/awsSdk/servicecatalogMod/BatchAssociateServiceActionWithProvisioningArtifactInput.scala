package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchAssociateServiceActionWithProvisioningArtifactInput extends StObject {
  
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsSdk.servicecatalogMod.AcceptLanguage] = js.native
  
  /**
    * One or more associations, each consisting of the Action ID, the Product ID, and the Provisioning Artifact ID.
    */
  var ServiceActionAssociations: typings.awsSdk.servicecatalogMod.ServiceActionAssociations = js.native
}
object BatchAssociateServiceActionWithProvisioningArtifactInput {
  
  @scala.inline
  def apply(ServiceActionAssociations: ServiceActionAssociations): BatchAssociateServiceActionWithProvisioningArtifactInput = {
    val __obj = js.Dynamic.literal(ServiceActionAssociations = ServiceActionAssociations.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchAssociateServiceActionWithProvisioningArtifactInput]
  }
  
  @scala.inline
  implicit class BatchAssociateServiceActionWithProvisioningArtifactInputMutableBuilder[Self <: BatchAssociateServiceActionWithProvisioningArtifactInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceptLanguage(value: AcceptLanguage): Self = StObject.set(x, "AcceptLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptLanguageUndefined: Self = StObject.set(x, "AcceptLanguage", js.undefined)
    
    @scala.inline
    def setServiceActionAssociations(value: ServiceActionAssociations): Self = StObject.set(x, "ServiceActionAssociations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceActionAssociationsVarargs(value: ServiceActionAssociation*): Self = StObject.set(x, "ServiceActionAssociations", js.Array(value :_*))
  }
}
