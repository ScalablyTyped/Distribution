package typings.awsSdk.cloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterLogEventsResponse extends StObject {
  
  /**
    * The matched events.
    */
  var events: js.UndefOr[FilteredLogEvents] = js.undefined
  
  /**
    * The token to use when requesting the next set of items. The token expires after 24 hours.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    *  IMPORTANT Starting on May 15, 2020, this parameter will be deprecated. This parameter will be an empty list after the deprecation occurs. Indicates which log streams have been searched and whether each has been searched completely.
    */
  var searchedLogStreams: js.UndefOr[SearchedLogStreams] = js.undefined
}
object FilterLogEventsResponse {
  
  inline def apply(): FilterLogEventsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterLogEventsResponse]
  }
  
  extension [Self <: FilterLogEventsResponse](x: Self) {
    
    inline def setEvents(value: FilteredLogEvents): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setEventsVarargs(value: FilteredLogEvent*): Self = StObject.set(x, "events", js.Array(value :_*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSearchedLogStreams(value: SearchedLogStreams): Self = StObject.set(x, "searchedLogStreams", value.asInstanceOf[js.Any])
    
    inline def setSearchedLogStreamsUndefined: Self = StObject.set(x, "searchedLogStreams", js.undefined)
    
    inline def setSearchedLogStreamsVarargs(value: SearchedLogStream*): Self = StObject.set(x, "searchedLogStreams", js.Array(value :_*))
  }
}
