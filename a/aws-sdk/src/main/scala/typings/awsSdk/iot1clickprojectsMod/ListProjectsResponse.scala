package typings.awsSdk.iot1clickprojectsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProjectsResponse extends StObject {
  
  /**
    * The token used to retrieve the next set of results - will be effectively empty if there are no further results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * An object containing the list of projects.
    */
  var projects: ProjectSummaryList
}
object ListProjectsResponse {
  
  inline def apply(projects: ProjectSummaryList): ListProjectsResponse = {
    val __obj = js.Dynamic.literal(projects = projects.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProjectsResponse]
  }
  
  extension [Self <: ListProjectsResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setProjects(value: ProjectSummaryList): Self = StObject.set(x, "projects", value.asInstanceOf[js.Any])
    
    inline def setProjectsVarargs(value: ProjectSummary*): Self = StObject.set(x, "projects", js.Array(value :_*))
  }
}
