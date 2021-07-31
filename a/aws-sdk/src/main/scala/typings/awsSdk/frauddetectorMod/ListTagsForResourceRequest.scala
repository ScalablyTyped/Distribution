package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForResourceRequest extends StObject {
  
  /**
    * The maximum number of objects to return for the request. 
    */
  var maxResults: js.UndefOr[TagsMaxResults] = js.undefined
  
  /**
    * The next token from the previous results.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The ARN that specifies the resource whose tags you want to list.
    */
  var resourceARN: fraudDetectorArn
}
object ListTagsForResourceRequest {
  
  @scala.inline
  def apply(resourceARN: fraudDetectorArn): ListTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(resourceARN = resourceARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceRequest]
  }
  
  @scala.inline
  implicit class ListTagsForResourceRequestMutableBuilder[Self <: ListTagsForResourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: TagsMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setResourceARN(value: fraudDetectorArn): Self = StObject.set(x, "resourceARN", value.asInstanceOf[js.Any])
  }
}
