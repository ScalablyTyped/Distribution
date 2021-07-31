package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateProvisioningArtifactInput extends StObject {
  
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsSdk.servicecatalogMod.AcceptLanguage] = js.undefined
  
  /**
    * Indicates whether the product version is active. Inactive provisioning artifacts are invisible to end users. End users cannot launch or update a provisioned product from an inactive provisioning artifact.
    */
  var Active: js.UndefOr[ProvisioningArtifactActive] = js.undefined
  
  /**
    * The updated description of the provisioning artifact.
    */
  var Description: js.UndefOr[ProvisioningArtifactDescription] = js.undefined
  
  /**
    * Information set by the administrator to provide guidance to end users about which provisioning artifacts to use. The DEFAULT value indicates that the product version is active. The administrator can set the guidance to DEPRECATED to inform users that the product version is deprecated. Users are able to make updates to a provisioned product of a deprecated version but cannot launch new provisioned products using a deprecated version.
    */
  var Guidance: js.UndefOr[ProvisioningArtifactGuidance] = js.undefined
  
  /**
    * The updated name of the provisioning artifact.
    */
  var Name: js.UndefOr[ProvisioningArtifactName] = js.undefined
  
  /**
    * The product identifier.
    */
  var ProductId: Id
  
  /**
    * The identifier of the provisioning artifact.
    */
  var ProvisioningArtifactId: Id
}
object UpdateProvisioningArtifactInput {
  
  @scala.inline
  def apply(ProductId: Id, ProvisioningArtifactId: Id): UpdateProvisioningArtifactInput = {
    val __obj = js.Dynamic.literal(ProductId = ProductId.asInstanceOf[js.Any], ProvisioningArtifactId = ProvisioningArtifactId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProvisioningArtifactInput]
  }
  
  @scala.inline
  implicit class UpdateProvisioningArtifactInputMutableBuilder[Self <: UpdateProvisioningArtifactInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceptLanguage(value: AcceptLanguage): Self = StObject.set(x, "AcceptLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptLanguageUndefined: Self = StObject.set(x, "AcceptLanguage", js.undefined)
    
    @scala.inline
    def setActive(value: ProvisioningArtifactActive): Self = StObject.set(x, "Active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "Active", js.undefined)
    
    @scala.inline
    def setDescription(value: ProvisioningArtifactDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setGuidance(value: ProvisioningArtifactGuidance): Self = StObject.set(x, "Guidance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuidanceUndefined: Self = StObject.set(x, "Guidance", js.undefined)
    
    @scala.inline
    def setName(value: ProvisioningArtifactName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setProductId(value: Id): Self = StObject.set(x, "ProductId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisioningArtifactId(value: Id): Self = StObject.set(x, "ProvisioningArtifactId", value.asInstanceOf[js.Any])
  }
}
