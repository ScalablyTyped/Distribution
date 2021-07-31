package typings.awsSdk.snsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTopicsResponse extends StObject {
  
  /**
    * Token to pass along to the next ListTopics request. This element is returned if there are additional topics to retrieve.
    */
  var NextToken: js.UndefOr[nextToken] = js.undefined
  
  /**
    * A list of topic ARNs.
    */
  var Topics: js.UndefOr[TopicsList] = js.undefined
}
object ListTopicsResponse {
  
  @scala.inline
  def apply(): ListTopicsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTopicsResponse]
  }
  
  @scala.inline
  implicit class ListTopicsResponseMutableBuilder[Self <: ListTopicsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: nextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setTopics(value: TopicsList): Self = StObject.set(x, "Topics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicsUndefined: Self = StObject.set(x, "Topics", js.undefined)
    
    @scala.inline
    def setTopicsVarargs(value: Topic*): Self = StObject.set(x, "Topics", js.Array(value :_*))
  }
}
