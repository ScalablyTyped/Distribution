package typings.awsSdk.kinesisvideoarchivedmediaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetHLSStreamingSessionURLInput extends StObject {
  
  /**
    * Specifies which format should be used for packaging the media. Specifying the FRAGMENTED_MP4 container format packages the media into MP4 fragments (fMP4 or CMAF). This is the recommended packaging because there is minimal packaging overhead. The other container format option is MPEG_TS. HLS has supported MPEG TS chunks since it was released and is sometimes the only supported packaging on older HLS players. MPEG TS typically has a 5-25 percent packaging overhead. This means MPEG TS typically requires 5-25 percent more bandwidth and cost than fMP4. The default is FRAGMENTED_MP4.
    */
  var ContainerFormat: js.UndefOr[typings.awsSdk.kinesisvideoarchivedmediaMod.ContainerFormat] = js.native
  
  /**
    * Specifies when flags marking discontinuities between fragments are added to the media playlists. Media players typically build a timeline of media content to play, based on the timestamps of each fragment. This means that if there is any overlap or gap between fragments (as is typical if HLSFragmentSelector is set to SERVER_TIMESTAMP), the media player timeline will also have small gaps between fragments in some places, and will overwrite frames in other places. Gaps in the media player timeline can cause playback to stall and overlaps can cause playback to be jittery. When there are discontinuity flags between fragments, the media player is expected to reset the timeline, resulting in the next fragment being played immediately after the previous fragment.  The following modes are supported:    ALWAYS: a discontinuity marker is placed between every fragment in the HLS media playlist. It is recommended to use a value of ALWAYS if the fragment timestamps are not accurate.    NEVER: no discontinuity markers are placed anywhere. It is recommended to use a value of NEVER to ensure the media player timeline most accurately maps to the producer timestamps.     ON_DISCONTIUNITY: a discontinuity marker is placed between fragments that have a gap or overlap of more than 50 milliseconds. For most playback scenarios, it is recommended to use a value of ON_DISCONTINUITY so that the media player timeline is only reset when there is a significant issue with the media timeline (e.g. a missing fragment).   The default is ALWAYS when HLSFragmentSelector is set to SERVER_TIMESTAMP, and NEVER when it is set to PRODUCER_TIMESTAMP.
    */
  var DiscontinuityMode: js.UndefOr[HLSDiscontinuityMode] = js.native
  
  /**
    * Specifies when the fragment start timestamps should be included in the HLS media playlist. Typically, media players report the playhead position as a time relative to the start of the first fragment in the playback session. However, when the start timestamps are included in the HLS media playlist, some media players might report the current playhead as an absolute time based on the fragment timestamps. This can be useful for creating a playback experience that shows viewers the wall-clock time of the media. The default is NEVER. When HLSFragmentSelector is SERVER_TIMESTAMP, the timestamps will be the server start timestamps. Similarly, when HLSFragmentSelector is PRODUCER_TIMESTAMP, the timestamps will be the producer start timestamps. 
    */
  var DisplayFragmentTimestamp: js.UndefOr[HLSDisplayFragmentTimestamp] = js.native
  
  /**
    * The time in seconds until the requested session expires. This value can be between 300 (5 minutes) and 43200 (12 hours). When a session expires, no new calls to GetHLSMasterPlaylist, GetHLSMediaPlaylist, GetMP4InitFragment, GetMP4MediaFragment, or GetTSFragment can be made for that session. The default is 300 (5 minutes).
    */
  var Expires: js.UndefOr[typings.awsSdk.kinesisvideoarchivedmediaMod.Expires] = js.native
  
  /**
    * The time range of the requested fragment and the source of the timestamps. This parameter is required if PlaybackMode is ON_DEMAND or LIVE_REPLAY. This parameter is optional if PlaybackMode is LIVE. If PlaybackMode is LIVE, the FragmentSelectorType can be set, but the TimestampRange should not be set. If PlaybackMode is ON_DEMAND or LIVE_REPLAY, both FragmentSelectorType and TimestampRange must be set.
    */
  var HLSFragmentSelector: js.UndefOr[typings.awsSdk.kinesisvideoarchivedmediaMod.HLSFragmentSelector] = js.native
  
  /**
    * The maximum number of fragments that are returned in the HLS media playlists. When the PlaybackMode is LIVE, the most recent fragments are returned up to this value. When the PlaybackMode is ON_DEMAND, the oldest fragments are returned, up to this maximum number. When there are a higher number of fragments available in a live HLS media playlist, video players often buffer content before starting playback. Increasing the buffer size increases the playback latency, but it decreases the likelihood that rebuffering will occur during playback. We recommend that a live HLS media playlist have a minimum of 3 fragments and a maximum of 10 fragments. The default is 5 fragments if PlaybackMode is LIVE or LIVE_REPLAY, and 1,000 if PlaybackMode is ON_DEMAND.  The maximum value of 1,000 fragments corresponds to more than 16 minutes of video on streams with 1-second fragments, and more than 2 1/2 hours of video on streams with 10-second fragments.
    */
  var MaxMediaPlaylistFragmentResults: js.UndefOr[PageLimit] = js.native
  
  /**
    * Whether to retrieve live, live replay, or archived, on-demand data. Features of the three types of sessions include the following:     LIVE : For sessions of this type, the HLS media playlist is continually updated with the latest fragments as they become available. We recommend that the media player retrieve a new playlist on a one-second interval. When this type of session is played in a media player, the user interface typically displays a "live" notification, with no scrubber control for choosing the position in the playback window to display.  In LIVE mode, the newest available fragments are included in an HLS media playlist, even if there is a gap between fragments (that is, if a fragment is missing). A gap like this might cause a media player to halt or cause a jump in playback. In this mode, fragments are not added to the HLS media playlist if they are older than the newest fragment in the playlist. If the missing fragment becomes available after a subsequent fragment is added to the playlist, the older fragment is not added, and the gap is not filled.      LIVE_REPLAY : For sessions of this type, the HLS media playlist is updated similarly to how it is updated for LIVE mode except that it starts by including fragments from a given start time. Instead of fragments being added as they are ingested, fragments are added as the duration of the next fragment elapses. For example, if the fragments in the session are two seconds long, then a new fragment is added to the media playlist every two seconds. This mode is useful to be able to start playback from when an event is detected and continue live streaming media that has not yet been ingested as of the time of the session creation. This mode is also useful to stream previously archived media without being limited by the 1,000 fragment limit in the ON_DEMAND mode.      ON_DEMAND : For sessions of this type, the HLS media playlist contains all the fragments for the session, up to the number that is specified in MaxMediaPlaylistFragmentResults. The playlist must be retrieved only once for each session. When this type of session is played in a media player, the user interface typically displays a scrubber control for choosing the position in the playback window to display.   In all playback modes, if FragmentSelectorType is PRODUCER_TIMESTAMP, and if there are multiple fragments with the same start timestamp, the fragment that has the larger fragment number (that is, the newer fragment) is included in the HLS media playlist. The other fragments are not included. Fragments that have different timestamps but have overlapping durations are still included in the HLS media playlist. This can lead to unexpected behavior in the media player. The default is LIVE.
    */
  var PlaybackMode: js.UndefOr[HLSPlaybackMode] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the stream for which to retrieve the HLS master playlist URL. You must specify either the StreamName or the StreamARN.
    */
  var StreamARN: js.UndefOr[ResourceARN] = js.native
  
  /**
    * The name of the stream for which to retrieve the HLS master playlist URL. You must specify either the StreamName or the StreamARN.
    */
  var StreamName: js.UndefOr[typings.awsSdk.kinesisvideoarchivedmediaMod.StreamName] = js.native
}
object GetHLSStreamingSessionURLInput {
  
  @scala.inline
  def apply(): GetHLSStreamingSessionURLInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetHLSStreamingSessionURLInput]
  }
  
  @scala.inline
  implicit class GetHLSStreamingSessionURLInputMutableBuilder[Self <: GetHLSStreamingSessionURLInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContainerFormat(value: ContainerFormat): Self = StObject.set(x, "ContainerFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerFormatUndefined: Self = StObject.set(x, "ContainerFormat", js.undefined)
    
    @scala.inline
    def setDiscontinuityMode(value: HLSDiscontinuityMode): Self = StObject.set(x, "DiscontinuityMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscontinuityModeUndefined: Self = StObject.set(x, "DiscontinuityMode", js.undefined)
    
    @scala.inline
    def setDisplayFragmentTimestamp(value: HLSDisplayFragmentTimestamp): Self = StObject.set(x, "DisplayFragmentTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayFragmentTimestampUndefined: Self = StObject.set(x, "DisplayFragmentTimestamp", js.undefined)
    
    @scala.inline
    def setExpires(value: Expires): Self = StObject.set(x, "Expires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiresUndefined: Self = StObject.set(x, "Expires", js.undefined)
    
    @scala.inline
    def setHLSFragmentSelector(value: HLSFragmentSelector): Self = StObject.set(x, "HLSFragmentSelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHLSFragmentSelectorUndefined: Self = StObject.set(x, "HLSFragmentSelector", js.undefined)
    
    @scala.inline
    def setMaxMediaPlaylistFragmentResults(value: PageLimit): Self = StObject.set(x, "MaxMediaPlaylistFragmentResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxMediaPlaylistFragmentResultsUndefined: Self = StObject.set(x, "MaxMediaPlaylistFragmentResults", js.undefined)
    
    @scala.inline
    def setPlaybackMode(value: HLSPlaybackMode): Self = StObject.set(x, "PlaybackMode", value.asInstanceOf[js.Any])
    
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
