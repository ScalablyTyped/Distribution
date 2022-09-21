package typings.awsSdk.mediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPrefetchSchedulesRequest extends StObject {
  
  /**
    * The maximum number of prefetch schedules that you want MediaTailor to return in response to the current request. If the playback configuration has more than MaxResults prefetch schedules, use the value of NextToken in the response to get the next page of results.
    */
  var MaxResults: js.UndefOr[integerMin1Max100] = js.undefined
  
  /**
    * (Optional) If the playback configuration has more than MaxResults prefetch schedules, use NextToken to get the second and subsequent pages of results. For the first ListPrefetchSchedulesRequest request, omit this value. For the second and subsequent requests, get the value of NextToken from the previous response and specify that value for NextToken in the request. If the previous response didn't include a NextToken element, there are no more prefetch schedules to get.
    */
  var NextToken: js.UndefOr[string] = js.undefined
  
  /**
    * The name of the playback configuration.
    */
  var PlaybackConfigurationName: string
  
  /**
    * An optional filtering parameter whereby MediaTailor filters the prefetch schedules to include only specific streams.
    */
  var StreamId: js.UndefOr[string] = js.undefined
}
object ListPrefetchSchedulesRequest {
  
  inline def apply(PlaybackConfigurationName: string): ListPrefetchSchedulesRequest = {
    val __obj = js.Dynamic.literal(PlaybackConfigurationName = PlaybackConfigurationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPrefetchSchedulesRequest]
  }
  
  extension [Self <: ListPrefetchSchedulesRequest](x: Self) {
    
    inline def setMaxResults(value: integerMin1Max100): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPlaybackConfigurationName(value: string): Self = StObject.set(x, "PlaybackConfigurationName", value.asInstanceOf[js.Any])
    
    inline def setStreamId(value: string): Self = StObject.set(x, "StreamId", value.asInstanceOf[js.Any])
    
    inline def setStreamIdUndefined: Self = StObject.set(x, "StreamId", js.undefined)
  }
}
