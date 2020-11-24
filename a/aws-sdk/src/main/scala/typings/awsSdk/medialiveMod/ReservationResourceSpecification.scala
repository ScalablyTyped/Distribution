package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReservationResourceSpecification extends js.Object {
  
  /**
    * Channel class, e.g. 'STANDARD'
    */
  var ChannelClass: js.UndefOr[typings.awsSdk.medialiveMod.ChannelClass] = js.native
  
  /**
    * Codec, e.g. 'AVC'
    */
  var Codec: js.UndefOr[ReservationCodec] = js.native
  
  /**
    * Maximum bitrate, e.g. 'MAX_20_MBPS'
    */
  var MaximumBitrate: js.UndefOr[ReservationMaximumBitrate] = js.native
  
  /**
    * Maximum framerate, e.g. 'MAX_30_FPS' (Outputs only)
    */
  var MaximumFramerate: js.UndefOr[ReservationMaximumFramerate] = js.native
  
  /**
    * Resolution, e.g. 'HD'
    */
  var Resolution: js.UndefOr[ReservationResolution] = js.native
  
  /**
    * Resource type, 'INPUT', 'OUTPUT', 'MULTIPLEX', or 'CHANNEL'
    */
  var ResourceType: js.UndefOr[ReservationResourceType] = js.native
  
  /**
    * Special feature, e.g. 'AUDIO_NORMALIZATION' (Channels only)
    */
  var SpecialFeature: js.UndefOr[ReservationSpecialFeature] = js.native
  
  /**
    * Video quality, e.g. 'STANDARD' (Outputs only)
    */
  var VideoQuality: js.UndefOr[ReservationVideoQuality] = js.native
}
object ReservationResourceSpecification {
  
  @scala.inline
  def apply(): ReservationResourceSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservationResourceSpecification]
  }
  
  @scala.inline
  implicit class ReservationResourceSpecificationOps[Self <: ReservationResourceSpecification] (val x: Self) extends AnyVal {
    
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
    def setChannelClass(value: ChannelClass): Self = this.set("ChannelClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelClass: Self = this.set("ChannelClass", js.undefined)
    
    @scala.inline
    def setCodec(value: ReservationCodec): Self = this.set("Codec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodec: Self = this.set("Codec", js.undefined)
    
    @scala.inline
    def setMaximumBitrate(value: ReservationMaximumBitrate): Self = this.set("MaximumBitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumBitrate: Self = this.set("MaximumBitrate", js.undefined)
    
    @scala.inline
    def setMaximumFramerate(value: ReservationMaximumFramerate): Self = this.set("MaximumFramerate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumFramerate: Self = this.set("MaximumFramerate", js.undefined)
    
    @scala.inline
    def setResolution(value: ReservationResolution): Self = this.set("Resolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolution: Self = this.set("Resolution", js.undefined)
    
    @scala.inline
    def setResourceType(value: ReservationResourceType): Self = this.set("ResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceType: Self = this.set("ResourceType", js.undefined)
    
    @scala.inline
    def setSpecialFeature(value: ReservationSpecialFeature): Self = this.set("SpecialFeature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpecialFeature: Self = this.set("SpecialFeature", js.undefined)
    
    @scala.inline
    def setVideoQuality(value: ReservationVideoQuality): Self = this.set("VideoQuality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoQuality: Self = this.set("VideoQuality", js.undefined)
  }
}
