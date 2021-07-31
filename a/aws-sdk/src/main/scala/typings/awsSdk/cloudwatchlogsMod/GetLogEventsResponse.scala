package typings.awsSdk.cloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLogEventsResponse extends StObject {
  
  /**
    * The events.
    */
  var events: js.UndefOr[OutputLogEvents] = js.undefined
  
  /**
    * The token for the next set of items in the backward direction. The token expires after 24 hours. This token is never null. If you have reached the end of the stream, it returns the same token you passed in.
    */
  var nextBackwardToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The token for the next set of items in the forward direction. The token expires after 24 hours. If you have reached the end of the stream, it returns the same token you passed in.
    */
  var nextForwardToken: js.UndefOr[NextToken] = js.undefined
}
object GetLogEventsResponse {
  
  @scala.inline
  def apply(): GetLogEventsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLogEventsResponse]
  }
  
  @scala.inline
  implicit class GetLogEventsResponseMutableBuilder[Self <: GetLogEventsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvents(value: OutputLogEvents): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    @scala.inline
    def setEventsVarargs(value: OutputLogEvent*): Self = StObject.set(x, "events", js.Array(value :_*))
    
    @scala.inline
    def setNextBackwardToken(value: NextToken): Self = StObject.set(x, "nextBackwardToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextBackwardTokenUndefined: Self = StObject.set(x, "nextBackwardToken", js.undefined)
    
    @scala.inline
    def setNextForwardToken(value: NextToken): Self = StObject.set(x, "nextForwardToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextForwardTokenUndefined: Self = StObject.set(x, "nextForwardToken", js.undefined)
  }
}
