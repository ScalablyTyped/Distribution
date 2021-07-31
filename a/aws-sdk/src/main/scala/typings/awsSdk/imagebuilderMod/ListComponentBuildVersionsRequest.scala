package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListComponentBuildVersionsRequest extends StObject {
  
  /**
    * The component version Amazon Resource Name (ARN) whose versions you want to list. 
    */
  var componentVersionArn: ComponentVersionArn
  
  /**
    * The maximum items to return in a request. 
    */
  var maxResults: js.UndefOr[RestrictedInteger] = js.undefined
  
  /**
    * A token to specify where to start paginating. This is the NextToken from a previously truncated response. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListComponentBuildVersionsRequest {
  
  @scala.inline
  def apply(componentVersionArn: ComponentVersionArn): ListComponentBuildVersionsRequest = {
    val __obj = js.Dynamic.literal(componentVersionArn = componentVersionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListComponentBuildVersionsRequest]
  }
  
  @scala.inline
  implicit class ListComponentBuildVersionsRequestMutableBuilder[Self <: ListComponentBuildVersionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponentVersionArn(value: ComponentVersionArn): Self = StObject.set(x, "componentVersionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: RestrictedInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
