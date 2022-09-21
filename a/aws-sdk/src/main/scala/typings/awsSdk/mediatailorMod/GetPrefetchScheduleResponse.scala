package typings.awsSdk.mediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPrefetchScheduleResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the prefetch schedule.
    */
  var Arn: js.UndefOr[string] = js.undefined
  
  /**
    * Consumption settings determine how, and when, MediaTailor places the prefetched ads into ad breaks. Ad consumption occurs within a span of time that you define, called a consumption window. You can designate which ad breaks that MediaTailor fills with prefetch ads by setting avail matching criteria.
    */
  var Consumption: js.UndefOr[PrefetchConsumption] = js.undefined
  
  /**
    * The name of the prefetch schedule. The name must be unique among all prefetch schedules that are associated with the specified playback configuration.
    */
  var Name: js.UndefOr[string] = js.undefined
  
  /**
    * The name of the playback configuration to create the prefetch schedule for.
    */
  var PlaybackConfigurationName: js.UndefOr[string] = js.undefined
  
  /**
    * A complex type that contains settings for prefetch retrieval from the ad decision server (ADS).
    */
  var Retrieval: js.UndefOr[PrefetchRetrieval] = js.undefined
  
  /**
    * An optional stream identifier that you can specify in order to prefetch for multiple streams that use the same playback configuration.
    */
  var StreamId: js.UndefOr[string] = js.undefined
}
object GetPrefetchScheduleResponse {
  
  inline def apply(): GetPrefetchScheduleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPrefetchScheduleResponse]
  }
  
  extension [Self <: GetPrefetchScheduleResponse](x: Self) {
    
    inline def setArn(value: string): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setConsumption(value: PrefetchConsumption): Self = StObject.set(x, "Consumption", value.asInstanceOf[js.Any])
    
    inline def setConsumptionUndefined: Self = StObject.set(x, "Consumption", js.undefined)
    
    inline def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setPlaybackConfigurationName(value: string): Self = StObject.set(x, "PlaybackConfigurationName", value.asInstanceOf[js.Any])
    
    inline def setPlaybackConfigurationNameUndefined: Self = StObject.set(x, "PlaybackConfigurationName", js.undefined)
    
    inline def setRetrieval(value: PrefetchRetrieval): Self = StObject.set(x, "Retrieval", value.asInstanceOf[js.Any])
    
    inline def setRetrievalUndefined: Self = StObject.set(x, "Retrieval", js.undefined)
    
    inline def setStreamId(value: string): Self = StObject.set(x, "StreamId", value.asInstanceOf[js.Any])
    
    inline def setStreamIdUndefined: Self = StObject.set(x, "StreamId", js.undefined)
  }
}
