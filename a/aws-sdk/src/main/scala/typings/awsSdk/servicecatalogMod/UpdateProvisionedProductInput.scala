package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateProvisionedProductInput extends StObject {
  
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsSdk.servicecatalogMod.AcceptLanguage] = js.undefined
  
  /**
    * The path identifier. This value is optional if the product has a default path, and required if the product has more than one path. You must provide the name or ID, but not both.
    */
  var PathId: js.UndefOr[Id] = js.undefined
  
  /**
    * The name of the path. You must provide the name or ID, but not both.
    */
  var PathName: js.UndefOr[PortfolioDisplayName] = js.undefined
  
  /**
    * The identifier of the product. You must provide the name or ID, but not both.
    */
  var ProductId: js.UndefOr[Id] = js.undefined
  
  /**
    * The name of the product. You must provide the name or ID, but not both.
    */
  var ProductName: js.UndefOr[ProductViewName] = js.undefined
  
  /**
    * The identifier of the provisioned product. You must provide the name or ID, but not both.
    */
  var ProvisionedProductId: js.UndefOr[Id] = js.undefined
  
  /**
    * The name of the provisioned product. You cannot specify both ProvisionedProductName and ProvisionedProductId.
    */
  var ProvisionedProductName: js.UndefOr[ProvisionedProductNameOrArn] = js.undefined
  
  /**
    * The identifier of the provisioning artifact.
    */
  var ProvisioningArtifactId: js.UndefOr[Id] = js.undefined
  
  /**
    * The name of the provisioning artifact. You must provide the name or ID, but not both.
    */
  var ProvisioningArtifactName: js.UndefOr[typings.awsSdk.servicecatalogMod.ProvisioningArtifactName] = js.undefined
  
  /**
    * The new parameters.
    */
  var ProvisioningParameters: js.UndefOr[UpdateProvisioningParameters] = js.undefined
  
  /**
    * An object that contains information about the provisioning preferences for a stack set.
    */
  var ProvisioningPreferences: js.UndefOr[UpdateProvisioningPreferences] = js.undefined
  
  /**
    * One or more tags. Requires the product to have RESOURCE_UPDATE constraint with TagUpdatesOnProvisionedProduct set to ALLOWED to allow tag updates.
    */
  var Tags: js.UndefOr[typings.awsSdk.servicecatalogMod.Tags] = js.undefined
  
  /**
    * The idempotency token that uniquely identifies the provisioning update request.
    */
  var UpdateToken: IdempotencyToken
}
object UpdateProvisionedProductInput {
  
  @scala.inline
  def apply(UpdateToken: IdempotencyToken): UpdateProvisionedProductInput = {
    val __obj = js.Dynamic.literal(UpdateToken = UpdateToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProvisionedProductInput]
  }
  
  @scala.inline
  implicit class UpdateProvisionedProductInputMutableBuilder[Self <: UpdateProvisionedProductInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceptLanguage(value: AcceptLanguage): Self = StObject.set(x, "AcceptLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptLanguageUndefined: Self = StObject.set(x, "AcceptLanguage", js.undefined)
    
    @scala.inline
    def setPathId(value: Id): Self = StObject.set(x, "PathId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathIdUndefined: Self = StObject.set(x, "PathId", js.undefined)
    
    @scala.inline
    def setPathName(value: PortfolioDisplayName): Self = StObject.set(x, "PathName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathNameUndefined: Self = StObject.set(x, "PathName", js.undefined)
    
    @scala.inline
    def setProductId(value: Id): Self = StObject.set(x, "ProductId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductIdUndefined: Self = StObject.set(x, "ProductId", js.undefined)
    
    @scala.inline
    def setProductName(value: ProductViewName): Self = StObject.set(x, "ProductName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductNameUndefined: Self = StObject.set(x, "ProductName", js.undefined)
    
    @scala.inline
    def setProvisionedProductId(value: Id): Self = StObject.set(x, "ProvisionedProductId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisionedProductIdUndefined: Self = StObject.set(x, "ProvisionedProductId", js.undefined)
    
    @scala.inline
    def setProvisionedProductName(value: ProvisionedProductNameOrArn): Self = StObject.set(x, "ProvisionedProductName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisionedProductNameUndefined: Self = StObject.set(x, "ProvisionedProductName", js.undefined)
    
    @scala.inline
    def setProvisioningArtifactId(value: Id): Self = StObject.set(x, "ProvisioningArtifactId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisioningArtifactIdUndefined: Self = StObject.set(x, "ProvisioningArtifactId", js.undefined)
    
    @scala.inline
    def setProvisioningArtifactName(value: ProvisioningArtifactName): Self = StObject.set(x, "ProvisioningArtifactName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisioningArtifactNameUndefined: Self = StObject.set(x, "ProvisioningArtifactName", js.undefined)
    
    @scala.inline
    def setProvisioningParameters(value: UpdateProvisioningParameters): Self = StObject.set(x, "ProvisioningParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisioningParametersUndefined: Self = StObject.set(x, "ProvisioningParameters", js.undefined)
    
    @scala.inline
    def setProvisioningParametersVarargs(value: UpdateProvisioningParameter*): Self = StObject.set(x, "ProvisioningParameters", js.Array(value :_*))
    
    @scala.inline
    def setProvisioningPreferences(value: UpdateProvisioningPreferences): Self = StObject.set(x, "ProvisioningPreferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisioningPreferencesUndefined: Self = StObject.set(x, "ProvisioningPreferences", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setUpdateToken(value: IdempotencyToken): Self = StObject.set(x, "UpdateToken", value.asInstanceOf[js.Any])
  }
}
