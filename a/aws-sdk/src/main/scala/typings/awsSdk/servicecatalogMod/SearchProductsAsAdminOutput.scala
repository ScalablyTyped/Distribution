package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchProductsAsAdminOutput extends StObject {
  
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.undefined
  
  /**
    * Information about the product views.
    */
  var ProductViewDetails: js.UndefOr[typings.awsSdk.servicecatalogMod.ProductViewDetails] = js.undefined
}
object SearchProductsAsAdminOutput {
  
  inline def apply(): SearchProductsAsAdminOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchProductsAsAdminOutput]
  }
  
  extension [Self <: SearchProductsAsAdminOutput](x: Self) {
    
    inline def setNextPageToken(value: PageToken): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
    
    inline def setProductViewDetails(value: ProductViewDetails): Self = StObject.set(x, "ProductViewDetails", value.asInstanceOf[js.Any])
    
    inline def setProductViewDetailsUndefined: Self = StObject.set(x, "ProductViewDetails", js.undefined)
    
    inline def setProductViewDetailsVarargs(value: ProductViewDetail*): Self = StObject.set(x, "ProductViewDetails", js.Array(value :_*))
  }
}
