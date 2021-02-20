package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchTablesRequest extends StObject {
  
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
  implicit class SearchTablesRequestMutableBuilder[Self <: SearchTablesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    @scala.inline
    def setFilters(value: SearchPropertyPredicates): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: PropertyPredicate*): Self = StObject.set(x, "Filters", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: PageSize): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setResourceShareType(value: ResourceShareType): Self = StObject.set(x, "ResourceShareType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceShareTypeUndefined: Self = StObject.set(x, "ResourceShareType", js.undefined)
    
    @scala.inline
    def setSearchText(value: ValueString): Self = StObject.set(x, "SearchText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchTextUndefined: Self = StObject.set(x, "SearchText", js.undefined)
    
    @scala.inline
    def setSortCriteria(value: SortCriteria): Self = StObject.set(x, "SortCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortCriteriaUndefined: Self = StObject.set(x, "SortCriteria", js.undefined)
    
    @scala.inline
    def setSortCriteriaVarargs(value: SortCriterion*): Self = StObject.set(x, "SortCriteria", js.Array(value :_*))
  }
}
