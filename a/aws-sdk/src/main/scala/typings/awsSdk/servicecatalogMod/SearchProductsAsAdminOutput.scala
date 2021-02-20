package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchProductsAsAdminOutput extends StObject {
  
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.native
  
  /**
    * Information about the product views.
    */
  var ProductViewDetails: js.UndefOr[typings.awsSdk.servicecatalogMod.ProductViewDetails] = js.native
}
object SearchProductsAsAdminOutput {
  
  @scala.inline
  def apply(): SearchProductsAsAdminOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchProductsAsAdminOutput]
  }
  
  @scala.inline
  implicit class SearchProductsAsAdminOutputMutableBuilder[Self <: SearchProductsAsAdminOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: PageToken): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
    
    @scala.inline
    def setProductViewDetails(value: ProductViewDetails): Self = StObject.set(x, "ProductViewDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductViewDetailsUndefined: Self = StObject.set(x, "ProductViewDetails", js.undefined)
    
    @scala.inline
    def setProductViewDetailsVarargs(value: ProductViewDetail*): Self = StObject.set(x, "ProductViewDetails", js.Array(value :_*))
  }
}
