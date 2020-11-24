package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchTablesRequest extends js.Object {
  
  /**
    * A unique identifier, consisting of  account_id .
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.native
  
  /**
    * A list of key-value pairs, and a comparator used to filter the search results. Returns all entities matching the predicate. The Comparator member of the PropertyPredicate struct is used only for time fields, and can be omitted for other field types. Also, when comparing string values, such as when Key=Name, a fuzzy match algorithm is used. The Key field (for example, the value of the Name field) is split on certain punctuation characters, for example, -, :, #, etc. into tokens. Then each token is exact-match compared with the Value member of PropertyPredicate. For example, if Key=Name and Value=link, tables named customer-link and xx-link-yy are returned, but xxlinkyy is not returned.
    */
  var Filters: js.UndefOr[SearchPropertyPredicates] = js.native
  
  /**
    * The maximum number of tables to return in a single response.
    */
  var MaxResults: js.UndefOr[PageSize] = js.native
  
  /**
    * A continuation token, included if this is a continuation call.
    */
  var NextToken: js.UndefOr[Token] = js.native
  
  /**
    * Allows you to specify that you want to search the tables shared with your account. The allowable values are FOREIGN or ALL.    If set to FOREIGN, will search the tables shared with your account.    If set to ALL, will search the tables shared with your account, as well as the tables in yor local account.   
    */
  var ResourceShareType: js.UndefOr[typings.awsSdk.glueMod.ResourceShareType] = js.native
  
  /**
    * A string used for a text search. Specifying a value in quotes filters based on an exact match to the value.
    */
  var SearchText: js.UndefOr[ValueString] = js.native
  
  /**
    * A list of criteria for sorting the results by a field name, in an ascending or descending order.
    */
  var SortCriteria: js.UndefOr[typings.awsSdk.glueMod.SortCriteria] = js.native
}
object SearchTablesRequest {
  
  @scala.inline
  def apply(): SearchTablesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchTablesRequest]
  }
  
  @scala.inline
  implicit class SearchTablesRequestOps[Self <: SearchTablesRequest] (val x: Self) extends AnyVal {
    
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
    def setCatalogId(value: CatalogIdString): Self = this.set("CatalogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCatalogId: Self = this.set("CatalogId", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: PropertyPredicate*): Self = this.set("Filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: SearchPropertyPredicates): Self = this.set("Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("Filters", js.undefined)
    
    @scala.inline
    def setMaxResults(value: PageSize): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: Token): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setResourceShareType(value: ResourceShareType): Self = this.set("ResourceShareType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceShareType: Self = this.set("ResourceShareType", js.undefined)
    
    @scala.inline
    def setSearchText(value: ValueString): Self = this.set("SearchText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchText: Self = this.set("SearchText", js.undefined)
    
    @scala.inline
    def setSortCriteriaVarargs(value: SortCriterion*): Self = this.set("SortCriteria", js.Array(value :_*))
    
    @scala.inline
    def setSortCriteria(value: SortCriteria): Self = this.set("SortCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortCriteria: Self = this.set("SortCriteria", js.undefined)
  }
}
