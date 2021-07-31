package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateServiceActionFromProvisioningArtifactInput extends StObject {
  
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsSdk.servicecatalogMod.AcceptLanguage] = js.undefined
  
  /**
    * The product identifier. For example, prod-abcdzk7xy33qa.
    */
  var ProductId: Id
  
  /**
    * The identifier of the provisioning artifact. For example, pa-4abcdjnxjj6ne.
    */
  var ProvisioningArtifactId: Id
  
  /**
    * The self-service action identifier. For example, act-fs7abcd89wxyz.
    */
  var ServiceActionId: Id
}
object DisassociateServiceActionFromProvisioningArtifactInput {
  
  @scala.inline
  def apply(ProductId: Id, ProvisioningArtifactId: Id, ServiceActionId: Id): DisassociateServiceActionFromProvisioningArtifactInput = {
    val __obj = js.Dynamic.literal(ProductId = ProductId.asInstanceOf[js.Any], ProvisioningArtifactId = ProvisioningArtifactId.asInstanceOf[js.Any], ServiceActionId = ServiceActionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateServiceActionFromProvisioningArtifactInput]
  }
  
  @scala.inline
  implicit class DisassociateServiceActionFromProvisioningArtifactInputMutableBuilder[Self <: DisassociateServiceActionFromProvisioningArtifactInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceptLanguage(value: AcceptLanguage): Self = StObject.set(x, "AcceptLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptLanguageUndefined: Self = StObject.set(x, "AcceptLanguage", js.undefined)
    
    @scala.inline
    def setProductId(value: Id): Self = StObject.set(x, "ProductId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisioningArtifactId(value: Id): Self = StObject.set(x, "ProvisioningArtifactId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceActionId(value: Id): Self = StObject.set(x, "ServiceActionId", value.asInstanceOf[js.Any])
  }
}
