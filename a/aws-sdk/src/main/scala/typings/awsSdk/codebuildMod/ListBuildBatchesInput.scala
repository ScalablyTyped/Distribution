package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListBuildBatchesInput extends StObject {
  
  /**
    * A BuildBatchFilter object that specifies the filters for the search.
    */
  var filter: js.UndefOr[BuildBatchFilter] = js.native
  
  /**
    * The maximum number of results to return.
    */
  var maxResults: js.UndefOr[PageSize] = js.native
  
  /**
    * The nextToken value returned from a previous call to ListBuildBatches. This specifies the next item to return. To return the beginning of the list, exclude this parameter.
    */
  var nextToken: js.UndefOr[String] = js.native
  
  /**
    * Specifies the sort order of the returned items. Valid values include:    ASCENDING: List the batch build identifiers in ascending order by identifier.    DESCENDING: List the batch build identifiers in descending order by identifier.  
    */
  var sortOrder: js.UndefOr[SortOrderType] = js.native
}
object ListBuildBatchesInput {
  
  @scala.inline
  def apply(): ListBuildBatchesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBuildBatchesInput]
  }
  
  @scala.inline
  implicit class ListBuildBatchesInputMutableBuilder[Self <: ListBuildBatchesInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: BuildBatchFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setMaxResults(value: PageSize): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setSortOrder(value: SortOrderType): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
  }
}
