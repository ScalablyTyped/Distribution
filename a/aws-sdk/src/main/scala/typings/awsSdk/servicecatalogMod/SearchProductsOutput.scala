package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchProductsOutput extends StObject {
  
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.native
  
  /**
    * The product view aggregations.
    */
  var ProductViewAggregations: js.UndefOr[typings.awsSdk.servicecatalogMod.ProductViewAggregations] = js.native
  
  /**
    * Information about the product views.
    */
  var ProductViewSummaries: js.UndefOr[typings.awsSdk.servicecatalogMod.ProductViewSummaries] = js.native
}
object SearchProductsOutput {
  
  @scala.inline
  def apply(): SearchProductsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchProductsOutput]
  }
  
  @scala.inline
  implicit class SearchProductsOutputMutableBuilder[Self <: SearchProductsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: PageToken): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
    
    @scala.inline
    def setProductViewAggregations(value: ProductViewAggregations): Self = StObject.set(x, "ProductViewAggregations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductViewAggregationsUndefined: Self = StObject.set(x, "ProductViewAggregations", js.undefined)
    
    @scala.inline
    def setProductViewSummaries(value: ProductViewSummaries): Self = StObject.set(x, "ProductViewSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductViewSummariesUndefined: Self = StObject.set(x, "ProductViewSummaries", js.undefined)
    
    @scala.inline
    def setProductViewSummariesVarargs(value: ProductViewSummary*): Self = StObject.set(x, "ProductViewSummaries", js.Array(value :_*))
  }
}
