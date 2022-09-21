package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProductViewSummary extends StObject {
  
  /**
    * The distributor of the product. Contact the product administrator for the significance of this value.
    */
  var Distributor: js.UndefOr[ProductViewDistributor] = js.undefined
  
  /**
    * Indicates whether the product has a default path. If the product does not have a default path, call ListLaunchPaths to disambiguate between paths. Otherwise, ListLaunchPaths is not required, and the output of ProductViewSummary can be used directly with DescribeProvisioningParameters.
    */
  var HasDefaultPath: js.UndefOr[typings.awsSdk.servicecatalogMod.HasDefaultPath] = js.undefined
  
  /**
    * The product view identifier.
    */
  var Id: js.UndefOr[typings.awsSdk.servicecatalogMod.Id] = js.undefined
  
  /**
    * The name of the product.
    */
  var Name: js.UndefOr[ProductViewName] = js.undefined
  
  /**
    * The owner of the product. Contact the product administrator for the significance of this value.
    */
  var Owner: js.UndefOr[ProductViewOwner] = js.undefined
  
  /**
    * The product identifier.
    */
  var ProductId: js.UndefOr[Id] = js.undefined
  
  /**
    * Short description of the product.
    */
  var ShortDescription: js.UndefOr[ProductViewShortDescription] = js.undefined
  
  /**
    * The description of the support for this Product.
    */
  var SupportDescription: js.UndefOr[typings.awsSdk.servicecatalogMod.SupportDescription] = js.undefined
  
  /**
    * The email contact information to obtain support for this Product.
    */
  var SupportEmail: js.UndefOr[typings.awsSdk.servicecatalogMod.SupportEmail] = js.undefined
  
  /**
    * The URL information to obtain support for this Product.
    */
  var SupportUrl: js.UndefOr[typings.awsSdk.servicecatalogMod.SupportUrl] = js.undefined
  
  /**
    * The product type. Contact the product administrator for the significance of this value. If this value is MARKETPLACE, the product was created by Amazon Web Services Marketplace.
    */
  var Type: js.UndefOr[ProductType] = js.undefined
}
object ProductViewSummary {
  
  inline def apply(): ProductViewSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductViewSummary]
  }
  
  extension [Self <: ProductViewSummary](x: Self) {
    
    inline def setDistributor(value: ProductViewDistributor): Self = StObject.set(x, "Distributor", value.asInstanceOf[js.Any])
    
    inline def setDistributorUndefined: Self = StObject.set(x, "Distributor", js.undefined)
    
    inline def setHasDefaultPath(value: HasDefaultPath): Self = StObject.set(x, "HasDefaultPath", value.asInstanceOf[js.Any])
    
    inline def setHasDefaultPathUndefined: Self = StObject.set(x, "HasDefaultPath", js.undefined)
    
    inline def setId(value: Id): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setName(value: ProductViewName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setOwner(value: ProductViewOwner): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "Owner", js.undefined)
    
    inline def setProductId(value: Id): Self = StObject.set(x, "ProductId", value.asInstanceOf[js.Any])
    
    inline def setProductIdUndefined: Self = StObject.set(x, "ProductId", js.undefined)
    
    inline def setShortDescription(value: ProductViewShortDescription): Self = StObject.set(x, "ShortDescription", value.asInstanceOf[js.Any])
    
    inline def setShortDescriptionUndefined: Self = StObject.set(x, "ShortDescription", js.undefined)
    
    inline def setSupportDescription(value: SupportDescription): Self = StObject.set(x, "SupportDescription", value.asInstanceOf[js.Any])
    
    inline def setSupportDescriptionUndefined: Self = StObject.set(x, "SupportDescription", js.undefined)
    
    inline def setSupportEmail(value: SupportEmail): Self = StObject.set(x, "SupportEmail", value.asInstanceOf[js.Any])
    
    inline def setSupportEmailUndefined: Self = StObject.set(x, "SupportEmail", js.undefined)
    
    inline def setSupportUrl(value: SupportUrl): Self = StObject.set(x, "SupportUrl", value.asInstanceOf[js.Any])
    
    inline def setSupportUrlUndefined: Self = StObject.set(x, "SupportUrl", js.undefined)
    
    inline def setType(value: ProductType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
