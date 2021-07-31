package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProjectsResponse extends StObject {
  
  /**
    * The token for the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * A list that summarizes each project in the portal.
    */
  var projectSummaries: ProjectSummaries
}
object ListProjectsResponse {
  
  @scala.inline
  def apply(projectSummaries: ProjectSummaries): ListProjectsResponse = {
    val __obj = js.Dynamic.literal(projectSummaries = projectSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProjectsResponse]
  }
  
  @scala.inline
  implicit class ListProjectsResponseMutableBuilder[Self <: ListProjectsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setProjectSummaries(value: ProjectSummaries): Self = StObject.set(x, "projectSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectSummariesVarargs(value: ProjectSummary*): Self = StObject.set(x, "projectSummaries", js.Array(value :_*))
  }
}
