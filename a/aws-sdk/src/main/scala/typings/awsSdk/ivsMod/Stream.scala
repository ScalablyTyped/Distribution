package typings.awsSdk.ivsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Stream extends StObject {
  
  /**
    * Channel ARN for the stream.
    */
  var channelArn: js.UndefOr[ChannelArn] = js.native
  
  /**
    * The stream’s health.
    */
  var health: js.UndefOr[StreamHealth] = js.native
  
  /**
    * URL of the video master manifest, required by the video player to play the HLS stream.
    */
  var playbackUrl: js.UndefOr[PlaybackURL] = js.native
  
  /**
    * ISO-8601 formatted timestamp of the stream’s start.
    */
  var startTime: js.UndefOr[StreamStartTime] = js.native
  
  /**
    * The stream’s state.
    */
  var state: js.UndefOr[StreamState] = js.native
  
  /**
    * Number of current viewers of the stream.
    */
  var viewerCount: js.UndefOr[StreamViewerCount] = js.native
}
object Stream {
  
  @scala.inline
  def apply(): Stream = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Stream]
  }
  
  @scala.inline
  implicit class StreamMutableBuilder[Self <: Stream] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelArn(value: ChannelArn): Self = StObject.set(x, "channelArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelArnUndefined: Self = StObject.set(x, "channelArn", js.undefined)
    
    @scala.inline
    def setHealth(value: StreamHealth): Self = StObject.set(x, "health", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthUndefined: Self = StObject.set(x, "health", js.undefined)
    
    @scala.inline
    def setPlaybackUrl(value: PlaybackURL): Self = StObject.set(x, "playbackUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaybackUrlUndefined: Self = StObject.set(x, "playbackUrl", js.undefined)
    
    @scala.inline
    def setStartTime(value: StreamStartTime): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setState(value: StreamState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setViewerCount(value: StreamViewerCount): Self = StObject.set(x, "viewerCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewerCountUndefined: Self = StObject.set(x, "viewerCount", js.undefined)
  }
}
