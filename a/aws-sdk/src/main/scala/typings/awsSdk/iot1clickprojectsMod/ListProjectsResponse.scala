package typings.awsSdk.iot1clickprojectsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListProjectsResponse extends StObject {
  
  /**
    * The token used to retrieve the next set of results - will be effectively empty if there are no further results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  
  /**
    * An object containing the list of projects.
    */
  var projects: ProjectSummaryList = js.native
}
object ListProjectsResponse {
  
  @scala.inline
  def apply(projects: ProjectSummaryList): ListProjectsResponse = {
    val __obj = js.Dynamic.literal(projects = projects.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProjectsResponse]
  }
  
  @scala.inline
  implicit class ListProjectsResponseMutableBuilder[Self <: ListProjectsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setProjects(value: ProjectSummaryList): Self = StObject.set(x, "projects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectsVarargs(value: ProjectSummary*): Self = StObject.set(x, "projects", js.Array(value :_*))
  }
}
