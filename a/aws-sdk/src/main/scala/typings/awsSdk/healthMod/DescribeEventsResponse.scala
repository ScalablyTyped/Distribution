package typings.awsSdk.healthMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEventsResponse extends StObject {
  
  /**
    * The events that match the specified filter criteria.
    */
  var events: js.UndefOr[EventList] = js.undefined
  
  /**
    * If the results of a search are large, only a portion of the results are returned, and a nextToken pagination token is returned in the response. To retrieve the next batch of results, reissue the search request and include the returned token. When all results have been returned, the response does not contain a pagination token value.
    */
  var nextToken: js.UndefOr[typings.awsSdk.healthMod.nextToken] = js.undefined
}
object DescribeEventsResponse {
  
  @scala.inline
  def apply(): DescribeEventsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEventsResponse]
  }
  
  @scala.inline
  implicit class DescribeEventsResponseMutableBuilder[Self <: DescribeEventsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvents(value: EventList): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    @scala.inline
    def setEventsVarargs(value: Event*): Self = StObject.set(x, "events", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: nextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
