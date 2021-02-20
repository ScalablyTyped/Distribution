package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReservationResourceSpecification extends StObject {
  
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
  implicit class ReservationResourceSpecificationMutableBuilder[Self <: ReservationResourceSpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelClass(value: ChannelClass): Self = StObject.set(x, "ChannelClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelClassUndefined: Self = StObject.set(x, "ChannelClass", js.undefined)
    
    @scala.inline
    def setCodec(value: ReservationCodec): Self = StObject.set(x, "Codec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodecUndefined: Self = StObject.set(x, "Codec", js.undefined)
    
    @scala.inline
    def setMaximumBitrate(value: ReservationMaximumBitrate): Self = StObject.set(x, "MaximumBitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumBitrateUndefined: Self = StObject.set(x, "MaximumBitrate", js.undefined)
    
    @scala.inline
    def setMaximumFramerate(value: ReservationMaximumFramerate): Self = StObject.set(x, "MaximumFramerate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumFramerateUndefined: Self = StObject.set(x, "MaximumFramerate", js.undefined)
    
    @scala.inline
    def setResolution(value: ReservationResolution): Self = StObject.set(x, "Resolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolutionUndefined: Self = StObject.set(x, "Resolution", js.undefined)
    
    @scala.inline
    def setResourceType(value: ReservationResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    @scala.inline
    def setSpecialFeature(value: ReservationSpecialFeature): Self = StObject.set(x, "SpecialFeature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecialFeatureUndefined: Self = StObject.set(x, "SpecialFeature", js.undefined)
    
    @scala.inline
    def setVideoQuality(value: ReservationVideoQuality): Self = StObject.set(x, "VideoQuality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoQualityUndefined: Self = StObject.set(x, "VideoQuality", js.undefined)
  }
}
