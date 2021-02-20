package typings.awsSdk.codestarMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListProjectsResult extends StObject {
  
  /**
    * The continuation token to use when requesting the next set of results, if there are more results to be returned.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * A list of projects.
    */
  var projects: ProjectsList = js.native
}
object ListProjectsResult {
  
  @scala.inline
  def apply(projects: ProjectsList): ListProjectsResult = {
    val __obj = js.Dynamic.literal(projects = projects.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProjectsResult]
  }
  
  @scala.inline
  implicit class ListProjectsResultMutableBuilder[Self <: ListProjectsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setProjects(value: ProjectsList): Self = StObject.set(x, "projects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectsVarargs(value: ProjectSummary*): Self = StObject.set(x, "projects", js.Array(value :_*))
  }
}
