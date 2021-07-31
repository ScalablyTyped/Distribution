package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchProductsAsAdminInput extends StObject {
  
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsSdk.servicecatalogMod.AcceptLanguage] = js.undefined
  
  /**
    * The search filters. If no search filters are specified, the output includes all products to which the administrator has access.
    */
  var Filters: js.UndefOr[ProductViewFilters] = js.undefined
  
  /**
    * The maximum number of items to return with this call.
    */
  var PageSize: js.UndefOr[typings.awsSdk.servicecatalogMod.PageSize] = js.undefined
  
  /**
    * The page token for the next set of results. To retrieve the first set of results, use null.
    */
  var PageToken: js.UndefOr[typings.awsSdk.servicecatalogMod.PageToken] = js.undefined
  
  /**
    * The portfolio identifier.
    */
  var PortfolioId: js.UndefOr[Id] = js.undefined
  
  /**
    * Access level of the source of the product.
    */
  var ProductSource: js.UndefOr[typings.awsSdk.servicecatalogMod.ProductSource] = js.undefined
  
  /**
    * The sort field. If no value is specified, the results are not sorted.
    */
  var SortBy: js.UndefOr[ProductViewSortBy] = js.undefined
  
  /**
    * The sort order. If no value is specified, the results are not sorted.
    */
  var SortOrder: js.UndefOr[typings.awsSdk.servicecatalogMod.SortOrder] = js.undefined
}
object SearchProductsAsAdminInput {
  
  @scala.inline
  def apply(): SearchProductsAsAdminInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchProductsAsAdminInput]
  }
  
  @scala.inline
  implicit class SearchProductsAsAdminInputMutableBuilder[Self <: SearchProductsAsAdminInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceptLanguage(value: AcceptLanguage): Self = StObject.set(x, "AcceptLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptLanguageUndefined: Self = StObject.set(x, "AcceptLanguage", js.undefined)
    
    @scala.inline
    def setFilters(value: ProductViewFilters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    @scala.inline
    def setPageSize(value: PageSize): Self = StObject.set(x, "PageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "PageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: PageToken): Self = StObject.set(x, "PageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "PageToken", js.undefined)
    
    @scala.inline
    def setPortfolioId(value: Id): Self = StObject.set(x, "PortfolioId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortfolioIdUndefined: Self = StObject.set(x, "PortfolioId", js.undefined)
    
    @scala.inline
    def setProductSource(value: ProductSource): Self = StObject.set(x, "ProductSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductSourceUndefined: Self = StObject.set(x, "ProductSource", js.undefined)
    
    @scala.inline
    def setSortBy(value: ProductViewSortBy): Self = StObject.set(x, "SortBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortByUndefined: Self = StObject.set(x, "SortBy", js.undefined)
    
    @scala.inline
    def setSortOrder(value: SortOrder): Self = StObject.set(x, "SortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortOrderUndefined: Self = StObject.set(x, "SortOrder", js.undefined)
  }
}
