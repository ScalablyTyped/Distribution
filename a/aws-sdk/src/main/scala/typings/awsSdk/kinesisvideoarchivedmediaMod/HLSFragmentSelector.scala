package typings.awsSdk.kinesisvideoarchivedmediaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HLSFragmentSelector extends js.Object {
  
  /**
    * The source of the timestamps for the requested media. When FragmentSelectorType is set to PRODUCER_TIMESTAMP and GetHLSStreamingSessionURLInput$PlaybackMode is ON_DEMAND or LIVE_REPLAY, the first fragment ingested with a producer timestamp within the specified FragmentSelector$TimestampRange is included in the media playlist. In addition, the fragments with producer timestamps within the TimestampRange ingested immediately following the first fragment (up to the GetHLSStreamingSessionURLInput$MaxMediaPlaylistFragmentResults value) are included.  Fragments that have duplicate producer timestamps are deduplicated. This means that if producers are producing a stream of fragments with producer timestamps that are approximately equal to the true clock time, the HLS media playlists will contain all of the fragments within the requested timestamp range. If some fragments are ingested within the same time range and very different points in time, only the oldest ingested collection of fragments are returned. When FragmentSelectorType is set to PRODUCER_TIMESTAMP and GetHLSStreamingSessionURLInput$PlaybackMode is LIVE, the producer timestamps are used in the MP4 fragments and for deduplication. But the most recently ingested fragments based on server timestamps are included in the HLS media playlist. This means that even if fragments ingested in the past have producer timestamps with values now, they are not included in the HLS media playlist. The default is SERVER_TIMESTAMP.
    */
  var FragmentSelectorType: js.UndefOr[HLSFragmentSelectorType] = js.native
  
  /**
    * The start and end of the timestamp range for the requested media. This value should not be present if PlaybackType is LIVE.
    */
  var TimestampRange: js.UndefOr[HLSTimestampRange] = js.native
}
object HLSFragmentSelector {
  
  @scala.inline
  def apply(): HLSFragmentSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HLSFragmentSelector]
  }
  
  @scala.inline
  implicit class HLSFragmentSelectorOps[Self <: HLSFragmentSelector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFragmentSelectorType(value: HLSFragmentSelectorType): Self = this.set("FragmentSelectorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFragmentSelectorType: Self = this.set("FragmentSelectorType", js.undefined)
    
    @scala.inline
    def setTimestampRange(value: HLSTimestampRange): Self = this.set("TimestampRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestampRange: Self = this.set("TimestampRange", js.undefined)
  }
}
