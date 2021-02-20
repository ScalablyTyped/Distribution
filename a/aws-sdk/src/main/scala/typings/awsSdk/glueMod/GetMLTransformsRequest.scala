package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetMLTransformsRequest extends StObject {
  
  /**
    * The filter transformation criteria.
    */
  var Filter: js.UndefOr[TransformFilterCriteria] = js.native
  
  /**
    * The maximum number of results to return.
    */
  var MaxResults: js.UndefOr[PageSize] = js.native
  
  /**
    * A paginated token to offset the results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * The sorting criteria.
    */
  var Sort: js.UndefOr[TransformSortCriteria] = js.native
}
object GetMLTransformsRequest {
  
  @scala.inline
  def apply(): GetMLTransformsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMLTransformsRequest]
  }
  
  @scala.inline
  implicit class GetMLTransformsRequestMutableBuilder[Self <: GetMLTransformsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: TransformFilterCriteria): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
    
    @scala.inline
    def setMaxResults(value: PageSize): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSort(value: TransformSortCriteria): Self = StObject.set(x, "Sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "Sort", js.undefined)
  }
}
