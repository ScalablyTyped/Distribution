package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScanProvisionedProductsOutput extends StObject {
  
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.undefined
  
  /**
    * Information about the provisioned products.
    */
  var ProvisionedProducts: js.UndefOr[ProvisionedProductDetails] = js.undefined
}
object ScanProvisionedProductsOutput {
  
  inline def apply(): ScanProvisionedProductsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScanProvisionedProductsOutput]
  }
  
  extension [Self <: ScanProvisionedProductsOutput](x: Self) {
    
    inline def setNextPageToken(value: PageToken): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
    
    inline def setProvisionedProducts(value: ProvisionedProductDetails): Self = StObject.set(x, "ProvisionedProducts", value.asInstanceOf[js.Any])
    
    inline def setProvisionedProductsUndefined: Self = StObject.set(x, "ProvisionedProducts", js.undefined)
    
    inline def setProvisionedProductsVarargs(value: ProvisionedProductDetail*): Self = StObject.set(x, "ProvisionedProducts", js.Array(value :_*))
  }
}
