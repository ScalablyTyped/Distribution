package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMLTaskRunsRequest extends StObject {
  
  /**
    * The filter criteria, in the TaskRunFilterCriteria structure, for the task run.
    */
  var Filter: js.UndefOr[TaskRunFilterCriteria] = js.undefined
  
  /**
    * The maximum number of results to return. 
    */
  var MaxResults: js.UndefOr[PageSize] = js.undefined
  
  /**
    * A token for pagination of the results. The default is empty.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The sorting criteria, in the TaskRunSortCriteria structure, for the task run.
    */
  var Sort: js.UndefOr[TaskRunSortCriteria] = js.undefined
  
  /**
    * The unique identifier of the machine learning transform.
    */
  var TransformId: HashString
}
object GetMLTaskRunsRequest {
  
  inline def apply(TransformId: HashString): GetMLTaskRunsRequest = {
    val __obj = js.Dynamic.literal(TransformId = TransformId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMLTaskRunsRequest]
  }
  
  extension [Self <: GetMLTaskRunsRequest](x: Self) {
    
    inline def setFilter(value: TaskRunFilterCriteria): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
    
    inline def setMaxResults(value: PageSize): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSort(value: TaskRunSortCriteria): Self = StObject.set(x, "Sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "Sort", js.undefined)
    
    inline def setTransformId(value: HashString): Self = StObject.set(x, "TransformId", value.asInstanceOf[js.Any])
  }
}
