package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryResult extends js.Object {
  
  /**
    * Contains the facet results. A FacetResult contains the counts for each attribute key that was specified in the Facets input parameter.
    */
  var FacetResults: js.UndefOr[FacetResultList] = js.native
  
  /**
    * The unique identifier for the search. You use QueryId to identify the search when using the feedback API.
    */
  var QueryId: js.UndefOr[typings.awsSdk.kendraMod.QueryId] = js.native
  
  /**
    * The results of the search.
    */
  var ResultItems: js.UndefOr[QueryResultItemList] = js.native
  
  /**
    * The total number of items found by the search; however, you can only retrieve up to 100 items. For example, if the search found 192 items, you can only retrieve the first 100 of the items.
    */
  var TotalNumberOfResults: js.UndefOr[Integer] = js.native
}
object QueryResult {
  
  @scala.inline
  def apply(): QueryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryResult]
  }
  
  @scala.inline
  implicit class QueryResultOps[Self <: QueryResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFacetResultsVarargs(value: FacetResult*): Self = this.set("FacetResults", js.Array(value :_*))
    
    @scala.inline
    def setFacetResults(value: FacetResultList): Self = this.set("FacetResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFacetResults: Self = this.set("FacetResults", js.undefined)
    
    @scala.inline
    def setQueryId(value: QueryId): Self = this.set("QueryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryId: Self = this.set("QueryId", js.undefined)
    
    @scala.inline
    def setResultItemsVarargs(value: QueryResultItem*): Self = this.set("ResultItems", js.Array(value :_*))
    
    @scala.inline
    def setResultItems(value: QueryResultItemList): Self = this.set("ResultItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResultItems: Self = this.set("ResultItems", js.undefined)
    
    @scala.inline
    def setTotalNumberOfResults(value: Integer): Self = this.set("TotalNumberOfResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalNumberOfResults: Self = this.set("TotalNumberOfResults", js.undefined)
  }
}
