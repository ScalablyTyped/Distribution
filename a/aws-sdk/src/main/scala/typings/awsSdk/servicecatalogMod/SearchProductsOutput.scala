package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchProductsOutput extends StObject {
  
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.undefined
  
  /**
    * The product view aggregations.
    */
  var ProductViewAggregations: js.UndefOr[typings.awsSdk.servicecatalogMod.ProductViewAggregations] = js.undefined
  
  /**
    * Information about the product views.
    */
  var ProductViewSummaries: js.UndefOr[typings.awsSdk.servicecatalogMod.ProductViewSummaries] = js.undefined
}
object SearchProductsOutput {
  
  inline def apply(): SearchProductsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchProductsOutput]
  }
  
  extension [Self <: SearchProductsOutput](x: Self) {
    
    inline def setNextPageToken(value: PageToken): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
    
    inline def setProductViewAggregations(value: ProductViewAggregations): Self = StObject.set(x, "ProductViewAggregations", value.asInstanceOf[js.Any])
    
    inline def setProductViewAggregationsUndefined: Self = StObject.set(x, "ProductViewAggregations", js.undefined)
    
    inline def setProductViewSummaries(value: ProductViewSummaries): Self = StObject.set(x, "ProductViewSummaries", value.asInstanceOf[js.Any])
    
    inline def setProductViewSummariesUndefined: Self = StObject.set(x, "ProductViewSummaries", js.undefined)
    
    inline def setProductViewSummariesVarargs(value: ProductViewSummary*): Self = StObject.set(x, "ProductViewSummaries", js.Array(value :_*))
  }
}
