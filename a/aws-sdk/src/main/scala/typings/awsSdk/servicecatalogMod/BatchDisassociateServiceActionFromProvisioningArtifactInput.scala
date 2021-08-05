package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDisassociateServiceActionFromProvisioningArtifactInput extends StObject {
  
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsSdk.servicecatalogMod.AcceptLanguage] = js.undefined
  
  /**
    * One or more associations, each consisting of the Action ID, the Product ID, and the Provisioning Artifact ID.
    */
  var ServiceActionAssociations: typings.awsSdk.servicecatalogMod.ServiceActionAssociations
}
object BatchDisassociateServiceActionFromProvisioningArtifactInput {
  
  inline def apply(ServiceActionAssociations: ServiceActionAssociations): BatchDisassociateServiceActionFromProvisioningArtifactInput = {
    val __obj = js.Dynamic.literal(ServiceActionAssociations = ServiceActionAssociations.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDisassociateServiceActionFromProvisioningArtifactInput]
  }
  
  extension [Self <: BatchDisassociateServiceActionFromProvisioningArtifactInput](x: Self) {
    
    inline def setAcceptLanguage(value: AcceptLanguage): Self = StObject.set(x, "AcceptLanguage", value.asInstanceOf[js.Any])
    
    inline def setAcceptLanguageUndefined: Self = StObject.set(x, "AcceptLanguage", js.undefined)
    
    inline def setServiceActionAssociations(value: ServiceActionAssociations): Self = StObject.set(x, "ServiceActionAssociations", value.asInstanceOf[js.Any])
    
    inline def setServiceActionAssociationsVarargs(value: ServiceActionAssociation*): Self = StObject.set(x, "ServiceActionAssociations", js.Array(value :_*))
  }
}
