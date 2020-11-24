package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListWorldExportJobsResponse extends js.Object {
  
  /**
    * If the previous paginated request did not return all of the remaining results, the response object's nextToken parameter value is set to a token. To retrieve the next set of results, call ListWorldExportJobsRequest again and assign that token to the request object's nextToken parameter. If there are no remaining results, the previous response object's NextToken parameter is set to null. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * Summary information for world export jobs.
    */
  var worldExportJobSummaries: WorldExportJobSummaries = js.native
}
object ListWorldExportJobsResponse {
  
  @scala.inline
  def apply(worldExportJobSummaries: WorldExportJobSummaries): ListWorldExportJobsResponse = {
    val __obj = js.Dynamic.literal(worldExportJobSummaries = worldExportJobSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListWorldExportJobsResponse]
  }
  
  @scala.inline
  implicit class ListWorldExportJobsResponseOps[Self <: ListWorldExportJobsResponse] (val x: Self) extends AnyVal {
    
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
    def setWorldExportJobSummariesVarargs(value: WorldExportJobSummary*): Self = this.set("worldExportJobSummaries", js.Array(value :_*))
    
    @scala.inline
    def setWorldExportJobSummaries(value: WorldExportJobSummaries): Self = this.set("worldExportJobSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
