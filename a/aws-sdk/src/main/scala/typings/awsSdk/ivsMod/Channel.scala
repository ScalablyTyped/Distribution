package typings.awsSdk.ivsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Channel extends js.Object {
  
  /**
    * Channel ARN.
    */
  var arn: js.UndefOr[ChannelArn] = js.native
  
  /**
    * Whether the channel is authorized.
    */
  var authorized: js.UndefOr[IsAuthorized] = js.native
  
  /**
    * Channel ingest endpoint, part of the definition of an ingest server, used when you set up streaming software.
    */
  var ingestEndpoint: js.UndefOr[IngestEndpoint] = js.native
  
  /**
    * Channel latency mode. Default: LOW.
    */
  var latencyMode: js.UndefOr[ChannelLatencyMode] = js.native
  
  /**
    * Channel name.
    */
  var name: js.UndefOr[ChannelName] = js.native
  
  /**
    * Channel playback URL.
    */
  var playbackUrl: js.UndefOr[PlaybackURL] = js.native
  
  /**
    * Array of 1-50 maps, each of the form string:string (key:value).
    */
  var tags: js.UndefOr[Tags] = js.native
  
  /**
    * Channel type, which determines the allowable resolution and bitrate. If you exceed the allowable resolution or bitrate, the stream probably will disconnect immediately. Valid values:    STANDARD: Multiple qualities are generated from the original input, to automatically give viewers the best experience for their devices and network conditions. Vertical resolution can be up to 1080 and bitrate can be up to 8.5 Mbps.    BASIC: Amazon IVS delivers the original input to viewers. The viewer’s video-quality choice is limited to the original input. Vertical resolution can be up to 480 and bitrate can be up to 1.5 Mbps.   Default: STANDARD.
    */
  var `type`: js.UndefOr[ChannelType] = js.native
}
object Channel {
  
  @scala.inline
  def apply(): Channel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Channel]
  }
  
  @scala.inline
  implicit class ChannelOps[Self <: Channel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArn(value: ChannelArn): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setAuthorized(value: IsAuthorized): Self = this.set("authorized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorized: Self = this.set("authorized", js.undefined)
    
    @scala.inline
    def setIngestEndpoint(value: IngestEndpoint): Self = this.set("ingestEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIngestEndpoint: Self = this.set("ingestEndpoint", js.undefined)
    
    @scala.inline
    def setLatencyMode(value: ChannelLatencyMode): Self = this.set("latencyMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatencyMode: Self = this.set("latencyMode", js.undefined)
    
    @scala.inline
    def setName(value: ChannelName): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPlaybackUrl(value: PlaybackURL): Self = this.set("playbackUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaybackUrl: Self = this.set("playbackUrl", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setType(value: ChannelType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
