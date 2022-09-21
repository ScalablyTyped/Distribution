package typings.awsSdk.codestarMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProjectsResult extends StObject {
  
  /**
    * The continuation token to use when requesting the next set of results, if there are more results to be returned.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * A list of projects.
    */
  var projects: ProjectsList
}
object ListProjectsResult {
  
  inline def apply(projects: ProjectsList): ListProjectsResult = {
    val __obj = js.Dynamic.literal(projects = projects.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProjectsResult]
  }
  
  extension [Self <: ListProjectsResult](x: Self) {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setProjects(value: ProjectsList): Self = StObject.set(x, "projects", value.asInstanceOf[js.Any])
    
    inline def setProjectsVarargs(value: ProjectSummary*): Self = StObject.set(x, "projects", js.Array(value*))
  }
}
