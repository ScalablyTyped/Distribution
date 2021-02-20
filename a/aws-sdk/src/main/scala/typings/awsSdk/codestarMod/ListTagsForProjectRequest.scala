package typings.awsSdk.codestarMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTagsForProjectRequest extends StObject {
  
  /**
    * The ID of the project to get tags for.
    */
  var id: ProjectId = js.native
  
  /**
    * Reserved for future use.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  
  /**
    * Reserved for future use.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
}
object ListTagsForProjectRequest {
  
  @scala.inline
  def apply(id: ProjectId): ListTagsForProjectRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForProjectRequest]
  }
  
  @scala.inline
  implicit class ListTagsForProjectRequestMutableBuilder[Self <: ListTagsForProjectRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: ProjectId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
