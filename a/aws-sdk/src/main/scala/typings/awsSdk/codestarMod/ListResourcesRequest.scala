package typings.awsSdk.codestarMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListResourcesRequest extends StObject {
  
  /**
    * The maximum amount of data that can be contained in a single set of results.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The continuation token for the next set of results, if the results cannot be returned in one response.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The ID of the project.
    */
  var projectId: ProjectId
}
object ListResourcesRequest {
  
  @scala.inline
  def apply(projectId: ProjectId): ListResourcesRequest = {
    val __obj = js.Dynamic.literal(projectId = projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListResourcesRequest]
  }
  
  @scala.inline
  implicit class ListResourcesRequestMutableBuilder[Self <: ListResourcesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setProjectId(value: ProjectId): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
  }
}
