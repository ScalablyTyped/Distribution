package typings.awsSdk.kinesisvideoarchivedmediaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDASHStreamingSessionURLInput extends StObject {
  
  /**
    * The time range of the requested fragment and the source of the timestamps. This parameter is required if PlaybackMode is ON_DEMAND or LIVE_REPLAY. This parameter is optional if PlaybackMode is LIVE. If PlaybackMode is LIVE, the FragmentSelectorType can be set, but the TimestampRange should not be set. If PlaybackMode is ON_DEMAND or LIVE_REPLAY, both FragmentSelectorType and TimestampRange must be set.
    */
  var DASHFragmentSelector: js.UndefOr[typings.awsSdk.kinesisvideoarchivedmediaMod.DASHFragmentSelector] = js.native
  
  /**
    * Fragments are identified in the manifest file based on their sequence number in the session. If DisplayFragmentNumber is set to ALWAYS, the Kinesis Video Streams fragment number is added to each S element in the manifest file with the attribute name “kvs:fn”. These fragment numbers can be used for logging or for use with other APIs (e.g. GetMedia and GetMediaForFragmentList). A custom MPEG-DASH media player is necessary to leverage these this custom attribute. The default value is NEVER.
    */
  var DisplayFragmentNumber: js.UndefOr[DASHDisplayFragmentNumber] = js.native
  
  /**
    * Per the MPEG-DASH specification, the wall-clock time of fragments in the manifest file can be derived using attributes in the manifest itself. However, typically, MPEG-DASH compatible media players do not properly handle gaps in the media timeline. Kinesis Video Streams adjusts the media timeline in the manifest file to enable playback of media with discontinuities. Therefore, the wall-clock time derived from the manifest file may be inaccurate. If DisplayFragmentTimestamp is set to ALWAYS, the accurate fragment timestamp is added to each S element in the manifest file with the attribute name “kvs:ts”. A custom MPEG-DASH media player is necessary to leverage this custom attribute. The default value is NEVER. When DASHFragmentSelector is SERVER_TIMESTAMP, the timestamps will be the server start timestamps. Similarly, when DASHFragmentSelector is PRODUCER_TIMESTAMP, the timestamps will be the producer start timestamps. 
    */
  var DisplayFragmentTimestamp: js.UndefOr[DASHDisplayFragmentTimestamp] = js.native
  
  /**
    * The time in seconds until the requested session expires. This value can be between 300 (5 minutes) and 43200 (12 hours). When a session expires, no new calls to GetDashManifest, GetMP4InitFragment, or GetMP4MediaFragment can be made for that session. The default is 300 (5 minutes).
    */
  var Expires: js.UndefOr[typings.awsSdk.kinesisvideoarchivedmediaMod.Expires] = js.native
  
  /**
    * The maximum number of fragments that are returned in the MPEG-DASH manifest. When the PlaybackMode is LIVE, the most recent fragments are returned up to this value. When the PlaybackMode is ON_DEMAND, the oldest fragments are returned, up to this maximum number. When there are a higher number of fragments available in a live MPEG-DASH manifest, video players often buffer content before starting playback. Increasing the buffer size increases the playback latency, but it decreases the likelihood that rebuffering will occur during playback. We recommend that a live MPEG-DASH manifest have a minimum of 3 fragments and a maximum of 10 fragments. The default is 5 fragments if PlaybackMode is LIVE or LIVE_REPLAY, and 1,000 if PlaybackMode is ON_DEMAND.  The maximum value of 1,000 fragments corresponds to more than 16 minutes of video on streams with 1-second fragments, and more than 2 1/2 hours of video on streams with 10-second fragments.
    */
  var MaxManifestFragmentResults: js.UndefOr[PageLimit] = js.native
  
  /**
    * Whether to retrieve live, live replay, or archived, on-demand data. Features of the three types of sessions include the following:     LIVE : For sessions of this type, the MPEG-DASH manifest is continually updated with the latest fragments as they become available. We recommend that the media player retrieve a new manifest on a one-second interval. When this type of session is played in a media player, the user interface typically displays a "live" notification, with no scrubber control for choosing the position in the playback window to display.  In LIVE mode, the newest available fragments are included in an MPEG-DASH manifest, even if there is a gap between fragments (that is, if a fragment is missing). A gap like this might cause a media player to halt or cause a jump in playback. In this mode, fragments are not added to the MPEG-DASH manifest if they are older than the newest fragment in the playlist. If the missing fragment becomes available after a subsequent fragment is added to the manifest, the older fragment is not added, and the gap is not filled.      LIVE_REPLAY : For sessions of this type, the MPEG-DASH manifest is updated similarly to how it is updated for LIVE mode except that it starts by including fragments from a given start time. Instead of fragments being added as they are ingested, fragments are added as the duration of the next fragment elapses. For example, if the fragments in the session are two seconds long, then a new fragment is added to the manifest every two seconds. This mode is useful to be able to start playback from when an event is detected and continue live streaming media that has not yet been ingested as of the time of the session creation. This mode is also useful to stream previously archived media without being limited by the 1,000 fragment limit in the ON_DEMAND mode.      ON_DEMAND : For sessions of this type, the MPEG-DASH manifest contains all the fragments for the session, up to the number that is specified in MaxMediaPlaylistFragmentResults. The manifest must be retrieved only once for each session. When this type of session is played in a media player, the user interface typically displays a scrubber control for choosing the position in the playback window to display.   In all playback modes, if FragmentSelectorType is PRODUCER_TIMESTAMP, and if there are multiple fragments with the same start timestamp, the fragment that has the larger fragment number (that is, the newer fragment) is included in the MPEG-DASH manifest. The other fragments are not included. Fragments that have different timestamps but have overlapping durations are still included in the MPEG-DASH manifest. This can lead to unexpected behavior in the media player. The default is LIVE.
    */
  var PlaybackMode: js.UndefOr[DASHPlaybackMode] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the stream for which to retrieve the MPEG-DASH manifest URL. You must specify either the StreamName or the StreamARN.
    */
  var StreamARN: js.UndefOr[ResourceARN] = js.native
  
  /**
    * The name of the stream for which to retrieve the MPEG-DASH manifest URL. You must specify either the StreamName or the StreamARN.
    */
  var StreamName: js.UndefOr[typings.awsSdk.kinesisvideoarchivedmediaMod.StreamName] = js.native
}
object GetDASHStreamingSessionURLInput {
  
  @scala.inline
  def apply(): GetDASHStreamingSessionURLInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDASHStreamingSessionURLInput]
  }
  
  @scala.inline
  implicit class GetDASHStreamingSessionURLInputMutableBuilder[Self <: GetDASHStreamingSessionURLInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDASHFragmentSelector(value: DASHFragmentSelector): Self = StObject.set(x, "DASHFragmentSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDASHFragmentSelectorUndefined: Self = StObject.set(x, "DASHFragmentSelector", js.undefined)
    
    @scala.inline
    def setDisplayFragmentNumber(value: DASHDisplayFragmentNumber): Self = StObject.set(x, "DisplayFragmentNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayFragmentNumberUndefined: Self = StObject.set(x, "DisplayFragmentNumber", js.undefined)
    
    @scala.inline
    def setDisplayFragmentTimestamp(value: DASHDisplayFragmentTimestamp): Self = StObject.set(x, "DisplayFragmentTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayFragmentTimestampUndefined: Self = StObject.set(x, "DisplayFragmentTimestamp", js.undefined)
    
    @scala.inline
    def setExpires(value: Expires): Self = StObject.set(x, "Expires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiresUndefined: Self = StObject.set(x, "Expires", js.undefined)
    
    @scala.inline
    def setMaxManifestFragmentResults(value: PageLimit): Self = StObject.set(x, "MaxManifestFragmentResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxManifestFragmentResultsUndefined: Self = StObject.set(x, "MaxManifestFragmentResults", js.undefined)
    
    @scala.inline
    def setPlaybackMode(value: DASHPlaybackMode): Self = StObject.set(x, "PlaybackMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaybackModeUndefined: Self = StObject.set(x, "PlaybackMode", js.undefined)
    
    @scala.inline
    def setStreamARN(value: ResourceARN): Self = StObject.set(x, "StreamARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamARNUndefined: Self = StObject.set(x, "StreamARN", js.undefined)
    
    @scala.inline
    def setStreamName(value: StreamName): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamNameUndefined: Self = StObject.set(x, "StreamName", js.undefined)
  }
}
