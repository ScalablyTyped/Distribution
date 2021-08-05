package typings.awsSdk.kinesisvideoarchivedmediaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DASHFragmentSelector extends StObject {
  
  /**
    * The source of the timestamps for the requested media. When FragmentSelectorType is set to PRODUCER_TIMESTAMP and GetDASHStreamingSessionURLInput$PlaybackMode is ON_DEMAND or LIVE_REPLAY, the first fragment ingested with a producer timestamp within the specified FragmentSelector$TimestampRange is included in the media playlist. In addition, the fragments with producer timestamps within the TimestampRange ingested immediately following the first fragment (up to the GetDASHStreamingSessionURLInput$MaxManifestFragmentResults value) are included.  Fragments that have duplicate producer timestamps are deduplicated. This means that if producers are producing a stream of fragments with producer timestamps that are approximately equal to the true clock time, the MPEG-DASH manifest will contain all of the fragments within the requested timestamp range. If some fragments are ingested within the same time range and very different points in time, only the oldest ingested collection of fragments are returned. When FragmentSelectorType is set to PRODUCER_TIMESTAMP and GetDASHStreamingSessionURLInput$PlaybackMode is LIVE, the producer timestamps are used in the MP4 fragments and for deduplication. But the most recently ingested fragments based on server timestamps are included in the MPEG-DASH manifest. This means that even if fragments ingested in the past have producer timestamps with values now, they are not included in the HLS media playlist. The default is SERVER_TIMESTAMP.
    */
  var FragmentSelectorType: js.UndefOr[DASHFragmentSelectorType] = js.undefined
  
  /**
    * The start and end of the timestamp range for the requested media. This value should not be present if PlaybackType is LIVE.
    */
  var TimestampRange: js.UndefOr[DASHTimestampRange] = js.undefined
}
object DASHFragmentSelector {
  
  inline def apply(): DASHFragmentSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DASHFragmentSelector]
  }
  
  extension [Self <: DASHFragmentSelector](x: Self) {
    
    inline def setFragmentSelectorType(value: DASHFragmentSelectorType): Self = StObject.set(x, "FragmentSelectorType", value.asInstanceOf[js.Any])
    
    inline def setFragmentSelectorTypeUndefined: Self = StObject.set(x, "FragmentSelectorType", js.undefined)
    
    inline def setTimestampRange(value: DASHTimestampRange): Self = StObject.set(x, "TimestampRange", value.asInstanceOf[js.Any])
    
    inline def setTimestampRangeUndefined: Self = StObject.set(x, "TimestampRange", js.undefined)
  }
}
