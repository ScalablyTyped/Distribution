package typings.awsSdk.evidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProjectsResponse extends StObject {
  
  /**
    * The token to use in a subsequent ListProjects operation to return the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * An array of structures that contain the configuration details of the projects in the Region.
    */
  var projects: js.UndefOr[ProjectSummariesList] = js.undefined
}
object ListProjectsResponse {
  
  inline def apply(): ListProjectsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProjectsResponse]
  }
  
  extension [Self <: ListProjectsResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setProjects(value: ProjectSummariesList): Self = StObject.set(x, "projects", value.asInstanceOf[js.Any])
    
    inline def setProjectsUndefined: Self = StObject.set(x, "projects", js.undefined)
    
    inline def setProjectsVarargs(value: ProjectSummary*): Self = StObject.set(x, "projects", js.Array(value*))
  }
}
