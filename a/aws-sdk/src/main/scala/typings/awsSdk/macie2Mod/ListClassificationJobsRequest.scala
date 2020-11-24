package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListClassificationJobsRequest extends js.Object {
  
  /**
    * The criteria to use to filter the results.
    */
  var filterCriteria: js.UndefOr[ListJobsFilterCriteria] = js.native
  
  /**
    * The maximum number of items to include in each page of the response.
    */
  var maxResults: js.UndefOr[integer] = js.native
  
  /**
    * The nextToken string that specifies which page of results to return in a paginated response.
    */
  var nextToken: js.UndefOr[string] = js.native
  
  /**
    * The criteria to use to sort the results.
    */
  var sortCriteria: js.UndefOr[ListJobsSortCriteria] = js.native
}
object ListClassificationJobsRequest {
  
  @scala.inline
  def apply(): ListClassificationJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListClassificationJobsRequest]
  }
  
  @scala.inline
  implicit class ListClassificationJobsRequestOps[Self <: ListClassificationJobsRequest] (val x: Self) extends AnyVal {
    
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
    def setFilterCriteria(value: ListJobsFilterCriteria): Self = this.set("filterCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterCriteria: Self = this.set("filterCriteria", js.undefined)
    
    @scala.inline
    def setMaxResults(value: integer): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: string): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    
    @scala.inline
    def setSortCriteria(value: ListJobsSortCriteria): Self = this.set("sortCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortCriteria: Self = this.set("sortCriteria", js.undefined)
  }
}
