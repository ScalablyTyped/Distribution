package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetMLTaskRunsRequest extends js.Object {
  
  /**
    * The filter criteria, in the TaskRunFilterCriteria structure, for the task run.
    */
  var Filter: js.UndefOr[TaskRunFilterCriteria] = js.native
  
  /**
    * The maximum number of results to return. 
    */
  var MaxResults: js.UndefOr[PageSize] = js.native
  
  /**
    * A token for pagination of the results. The default is empty.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * The sorting criteria, in the TaskRunSortCriteria structure, for the task run.
    */
  var Sort: js.UndefOr[TaskRunSortCriteria] = js.native
  
  /**
    * The unique identifier of the machine learning transform.
    */
  var TransformId: HashString = js.native
}
object GetMLTaskRunsRequest {
  
  @scala.inline
  def apply(TransformId: HashString): GetMLTaskRunsRequest = {
    val __obj = js.Dynamic.literal(TransformId = TransformId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMLTaskRunsRequest]
  }
  
  @scala.inline
  implicit class GetMLTaskRunsRequestOps[Self <: GetMLTaskRunsRequest] (val x: Self) extends AnyVal {
    
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
    def setTransformId(value: HashString): Self = this.set("TransformId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilter(value: TaskRunFilterCriteria): Self = this.set("Filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("Filter", js.undefined)
    
    @scala.inline
    def setMaxResults(value: PageSize): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setSort(value: TaskRunSortCriteria): Self = this.set("Sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSort: Self = this.set("Sort", js.undefined)
  }
}
