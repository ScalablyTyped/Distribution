package typings.awsSdk.marketplacecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListChangeSetsRequest extends js.Object {
  
  /**
    * The catalog related to the request. Fixed value: AWSMarketplace 
    */
  var Catalog: typings.awsSdk.marketplacecatalogMod.Catalog = js.native
  
  /**
    * An array of filter objects.
    */
  var FilterList: js.UndefOr[typings.awsSdk.marketplacecatalogMod.FilterList] = js.native
  
  /**
    * The maximum number of results returned by a single call. This value must be provided in the next call to retrieve the next set of results. By default, this value is 20.
    */
  var MaxResults: js.UndefOr[MaxResultInteger] = js.native
  
  /**
    * The token value retrieved from a previous call to access the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.marketplacecatalogMod.NextToken] = js.native
  
  /**
    * An object that contains two attributes, SortBy and SortOrder.
    */
  var Sort: js.UndefOr[typings.awsSdk.marketplacecatalogMod.Sort] = js.native
}
object ListChangeSetsRequest {
  
  @scala.inline
  def apply(Catalog: Catalog): ListChangeSetsRequest = {
    val __obj = js.Dynamic.literal(Catalog = Catalog.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListChangeSetsRequest]
  }
  
  @scala.inline
  implicit class ListChangeSetsRequestOps[Self <: ListChangeSetsRequest] (val x: Self) extends AnyVal {
    
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
    def setCatalog(value: Catalog): Self = this.set("Catalog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterListVarargs(value: Filter*): Self = this.set("FilterList", js.Array(value :_*))
    
    @scala.inline
    def setFilterList(value: FilterList): Self = this.set("FilterList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterList: Self = this.set("FilterList", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxResultInteger): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setSort(value: Sort): Self = this.set("Sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSort: Self = this.set("Sort", js.undefined)
  }
}
