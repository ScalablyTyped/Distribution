package typings.awsSdk.marketplacecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListChangeSetsRequest extends StObject {
  
  /**
    * The catalog related to the request. Fixed value: AWSMarketplace 
    */
  var Catalog: typings.awsSdk.marketplacecatalogMod.Catalog
  
  /**
    * An array of filter objects.
    */
  var FilterList: js.UndefOr[typings.awsSdk.marketplacecatalogMod.FilterList] = js.undefined
  
  /**
    * The maximum number of results returned by a single call. This value must be provided in the next call to retrieve the next set of results. By default, this value is 20.
    */
  var MaxResults: js.UndefOr[MaxResultInteger] = js.undefined
  
  /**
    * The token value retrieved from a previous call to access the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.marketplacecatalogMod.NextToken] = js.undefined
  
  /**
    * An object that contains two attributes, SortBy and SortOrder.
    */
  var Sort: js.UndefOr[typings.awsSdk.marketplacecatalogMod.Sort] = js.undefined
}
object ListChangeSetsRequest {
  
  @scala.inline
  def apply(Catalog: Catalog): ListChangeSetsRequest = {
    val __obj = js.Dynamic.literal(Catalog = Catalog.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListChangeSetsRequest]
  }
  
  @scala.inline
  implicit class ListChangeSetsRequestMutableBuilder[Self <: ListChangeSetsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatalog(value: Catalog): Self = StObject.set(x, "Catalog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterList(value: FilterList): Self = StObject.set(x, "FilterList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterListUndefined: Self = StObject.set(x, "FilterList", js.undefined)
    
    @scala.inline
    def setFilterListVarargs(value: Filter*): Self = StObject.set(x, "FilterList", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: MaxResultInteger): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSort(value: Sort): Self = StObject.set(x, "Sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "Sort", js.undefined)
  }
}
