package typings.awsSdk.cloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListEventSourcesResponse extends StObject {
  
  /**
    * The list of event sources.
    */
  var EventSources: js.UndefOr[EventSourceList] = js.native
  
  /**
    * A token you can use in a subsequent operation to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.cloudwatcheventsMod.NextToken] = js.native
}
object ListEventSourcesResponse {
  
  @scala.inline
  def apply(): ListEventSourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEventSourcesResponse]
  }
  
  @scala.inline
  implicit class ListEventSourcesResponseMutableBuilder[Self <: ListEventSourcesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventSources(value: EventSourceList): Self = StObject.set(x, "EventSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventSourcesUndefined: Self = StObject.set(x, "EventSources", js.undefined)
    
    @scala.inline
    def setEventSourcesVarargs(value: EventSource*): Self = StObject.set(x, "EventSources", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
