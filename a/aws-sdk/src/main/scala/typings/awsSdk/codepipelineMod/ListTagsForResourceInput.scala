package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForResourceInput extends StObject {
  
  /**
    * The maximum number of results to return in a single call.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The token that was returned from the previous API call, which would be used to return the next page of the list. The ListTagsforResource call lists all available tags in one call and does not use pagination.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the resource to get tags for.
    */
  var resourceArn: ResourceArn
}
object ListTagsForResourceInput {
  
  @scala.inline
  def apply(resourceArn: ResourceArn): ListTagsForResourceInput = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceInput]
  }
  
  @scala.inline
  implicit class ListTagsForResourceInputMutableBuilder[Self <: ListTagsForResourceInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setResourceArn(value: ResourceArn): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
  }
}
