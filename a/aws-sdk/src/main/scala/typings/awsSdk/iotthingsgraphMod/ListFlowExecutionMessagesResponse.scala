package typings.awsSdk.iotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFlowExecutionMessagesResponse extends StObject {
  
  /**
    * A list of objects that contain information about events in the specified flow execution.
    */
  var messages: js.UndefOr[FlowExecutionMessages] = js.undefined
  
  /**
    * The string to specify as nextToken when you request the next page of results. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListFlowExecutionMessagesResponse {
  
  @scala.inline
  def apply(): ListFlowExecutionMessagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFlowExecutionMessagesResponse]
  }
  
  @scala.inline
  implicit class ListFlowExecutionMessagesResponseMutableBuilder[Self <: ListFlowExecutionMessagesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessages(value: FlowExecutionMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    @scala.inline
    def setMessagesVarargs(value: FlowExecutionMessage*): Self = StObject.set(x, "messages", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
