package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListProjectsResponse extends js.Object {
  
  /**
    * The token for the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * A list that summarizes each project in the portal.
    */
  var projectSummaries: ProjectSummaries = js.native
}
object ListProjectsResponse {
  
  @scala.inline
  def apply(projectSummaries: ProjectSummaries): ListProjectsResponse = {
    val __obj = js.Dynamic.literal(projectSummaries = projectSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProjectsResponse]
  }
  
  @scala.inline
  implicit class ListProjectsResponseOps[Self <: ListProjectsResponse] (val x: Self) extends AnyVal {
    
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
    def setProjectSummariesVarargs(value: ProjectSummary*): Self = this.set("projectSummaries", js.Array(value :_*))
    
    @scala.inline
    def setProjectSummaries(value: ProjectSummaries): Self = this.set("projectSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
