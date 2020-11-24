package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchProductsOutput extends js.Object {
  
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
  implicit class SearchProductsOutputOps[Self <: SearchProductsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNextPageToken(value: PageToken): Self = this.set("NextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("NextPageToken", js.undefined)
    
    @scala.inline
    def setProductViewAggregations(value: ProductViewAggregations): Self = this.set("ProductViewAggregations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductViewAggregations: Self = this.set("ProductViewAggregations", js.undefined)
    
    @scala.inline
    def setProductViewSummariesVarargs(value: ProductViewSummary*): Self = this.set("ProductViewSummaries", js.Array(value :_*))
    
    @scala.inline
    def setProductViewSummaries(value: ProductViewSummaries): Self = this.set("ProductViewSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductViewSummaries: Self = this.set("ProductViewSummaries", js.undefined)
  }
}
