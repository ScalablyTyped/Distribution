package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProvisionProductInput extends StObject {
  
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsSdk.servicecatalogMod.AcceptLanguage] = js.native
  
  /**
    * Passed to CloudFormation. The SNS topic ARNs to which to publish stack-related events.
    */
  var NotificationArns: js.UndefOr[typings.awsSdk.servicecatalogMod.NotificationArns] = js.native
  
  /**
    * The path identifier of the product. This value is optional if the product has a default path, and required if the product has more than one path. To list the paths for a product, use ListLaunchPaths. You must provide the name or ID, but not both.
    */
  var PathId: js.UndefOr[Id] = js.native
  
  /**
    * The name of the path. You must provide the name or ID, but not both.
    */
  var PathName: js.UndefOr[PortfolioDisplayName] = js.native
  
  /**
    * The product identifier. You must provide the name or ID, but not both.
    */
  var ProductId: js.UndefOr[Id] = js.native
  
  /**
    * The name of the product. You must provide the name or ID, but not both.
    */
  var ProductName: js.UndefOr[ProductViewName] = js.native
  
  /**
    * An idempotency token that uniquely identifies the provisioning request.
    */
  var ProvisionToken: IdempotencyToken = js.native
  
  /**
    * A user-friendly name for the provisioned product. This value must be unique for the AWS account and cannot be updated after the product is provisioned.
    */
  var ProvisionedProductName: typings.awsSdk.servicecatalogMod.ProvisionedProductName = js.native
  
  /**
    * The identifier of the provisioning artifact. You must provide the name or ID, but not both.
    */
  var ProvisioningArtifactId: js.UndefOr[Id] = js.native
  
  /**
    * The name of the provisioning artifact. You must provide the name or ID, but not both.
    */
  var ProvisioningArtifactName: js.UndefOr[typings.awsSdk.servicecatalogMod.ProvisioningArtifactName] = js.native
  
  /**
    * Parameters specified by the administrator that are required for provisioning the product.
    */
  var ProvisioningParameters: js.UndefOr[typings.awsSdk.servicecatalogMod.ProvisioningParameters] = js.native
  
  /**
    * An object that contains information about the provisioning preferences for a stack set.
    */
  var ProvisioningPreferences: js.UndefOr[typings.awsSdk.servicecatalogMod.ProvisioningPreferences] = js.native
  
  /**
    * One or more tags.
    */
  var Tags: js.UndefOr[typings.awsSdk.servicecatalogMod.Tags] = js.native
}
object ProvisionProductInput {
  
  @scala.inline
  def apply(ProvisionToken: IdempotencyToken, ProvisionedProductName: ProvisionedProductName): ProvisionProductInput = {
    val __obj = js.Dynamic.literal(ProvisionToken = ProvisionToken.asInstanceOf[js.Any], ProvisionedProductName = ProvisionedProductName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvisionProductInput]
  }
  
  @scala.inline
  implicit class ProvisionProductInputMutableBuilder[Self <: ProvisionProductInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceptLanguage(value: AcceptLanguage): Self = StObject.set(x, "AcceptLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptLanguageUndefined: Self = StObject.set(x, "AcceptLanguage", js.undefined)
    
    @scala.inline
    def setNotificationArns(value: NotificationArns): Self = StObject.set(x, "NotificationArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationArnsUndefined: Self = StObject.set(x, "NotificationArns", js.undefined)
    
    @scala.inline
    def setNotificationArnsVarargs(value: NotificationArn*): Self = StObject.set(x, "NotificationArns", js.Array(value :_*))
    
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
    def setProvisionToken(value: IdempotencyToken): Self = StObject.set(x, "ProvisionToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisionedProductName(value: ProvisionedProductName): Self = StObject.set(x, "ProvisionedProductName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisioningArtifactId(value: Id): Self = StObject.set(x, "ProvisioningArtifactId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisioningArtifactIdUndefined: Self = StObject.set(x, "ProvisioningArtifactId", js.undefined)
    
    @scala.inline
    def setProvisioningArtifactName(value: ProvisioningArtifactName): Self = StObject.set(x, "ProvisioningArtifactName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisioningArtifactNameUndefined: Self = StObject.set(x, "ProvisioningArtifactName", js.undefined)
    
    @scala.inline
    def setProvisioningParameters(value: ProvisioningParameters): Self = StObject.set(x, "ProvisioningParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisioningParametersUndefined: Self = StObject.set(x, "ProvisioningParameters", js.undefined)
    
    @scala.inline
    def setProvisioningParametersVarargs(value: ProvisioningParameter*): Self = StObject.set(x, "ProvisioningParameters", js.Array(value :_*))
    
    @scala.inline
    def setProvisioningPreferences(value: ProvisioningPreferences): Self = StObject.set(x, "ProvisioningPreferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisioningPreferencesUndefined: Self = StObject.set(x, "ProvisioningPreferences", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
