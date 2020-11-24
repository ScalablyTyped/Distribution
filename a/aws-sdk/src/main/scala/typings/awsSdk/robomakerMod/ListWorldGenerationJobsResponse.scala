package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListWorldGenerationJobsResponse extends js.Object {
  
  /**
    * If the previous paginated request did not return all of the remaining results, the response object's nextToken parameter value is set to a token. To retrieve the next set of results, call ListWorldGeneratorJobsRequest again and assign that token to the request object's nextToken parameter. If there are no remaining results, the previous response object's NextToken parameter is set to null. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * Summary information for world generator jobs.
    */
  var worldGenerationJobSummaries: WorldGenerationJobSummaries = js.native
}
object ListWorldGenerationJobsResponse {
  
  @scala.inline
  def apply(worldGenerationJobSummaries: WorldGenerationJobSummaries): ListWorldGenerationJobsResponse = {
    val __obj = js.Dynamic.literal(worldGenerationJobSummaries = worldGenerationJobSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListWorldGenerationJobsResponse]
  }
  
  @scala.inline
  implicit class ListWorldGenerationJobsResponseOps[Self <: ListWorldGenerationJobsResponse] (val x: Self) extends AnyVal {
    
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
    def setWorldGenerationJobSummariesVarargs(value: WorldGenerationJobSummary*): Self = this.set("worldGenerationJobSummaries", js.Array(value :_*))
    
    @scala.inline
    def setWorldGenerationJobSummaries(value: WorldGenerationJobSummaries): Self = this.set("worldGenerationJobSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
