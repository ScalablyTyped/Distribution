package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReservationResourceSpecification extends StObject {
  
  /**
    * Channel class, e.g. 'STANDARD'
    */
  var ChannelClass: js.UndefOr[typings.awsSdk.medialiveMod.ChannelClass] = js.undefined
  
  /**
    * Codec, e.g. 'AVC'
    */
  var Codec: js.UndefOr[ReservationCodec] = js.undefined
  
  /**
    * Maximum bitrate, e.g. 'MAX_20_MBPS'
    */
  var MaximumBitrate: js.UndefOr[ReservationMaximumBitrate] = js.undefined
  
  /**
    * Maximum framerate, e.g. 'MAX_30_FPS' (Outputs only)
    */
  var MaximumFramerate: js.UndefOr[ReservationMaximumFramerate] = js.undefined
  
  /**
    * Resolution, e.g. 'HD'
    */
  var Resolution: js.UndefOr[ReservationResolution] = js.undefined
  
  /**
    * Resource type, 'INPUT', 'OUTPUT', 'MULTIPLEX', or 'CHANNEL'
    */
  var ResourceType: js.UndefOr[ReservationResourceType] = js.undefined
  
  /**
    * Special feature, e.g. 'AUDIO_NORMALIZATION' (Channels only)
    */
  var SpecialFeature: js.UndefOr[ReservationSpecialFeature] = js.undefined
  
  /**
    * Video quality, e.g. 'STANDARD' (Outputs only)
    */
  var VideoQuality: js.UndefOr[ReservationVideoQuality] = js.undefined
}
object ReservationResourceSpecification {
  
  inline def apply(): ReservationResourceSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservationResourceSpecification]
  }
  
  extension [Self <: ReservationResourceSpecification](x: Self) {
    
    inline def setChannelClass(value: ChannelClass): Self = StObject.set(x, "ChannelClass", value.asInstanceOf[js.Any])
    
    inline def setChannelClassUndefined: Self = StObject.set(x, "ChannelClass", js.undefined)
    
    inline def setCodec(value: ReservationCodec): Self = StObject.set(x, "Codec", value.asInstanceOf[js.Any])
    
    inline def setCodecUndefined: Self = StObject.set(x, "Codec", js.undefined)
    
    inline def setMaximumBitrate(value: ReservationMaximumBitrate): Self = StObject.set(x, "MaximumBitrate", value.asInstanceOf[js.Any])
    
    inline def setMaximumBitrateUndefined: Self = StObject.set(x, "MaximumBitrate", js.undefined)
    
    inline def setMaximumFramerate(value: ReservationMaximumFramerate): Self = StObject.set(x, "MaximumFramerate", value.asInstanceOf[js.Any])
    
    inline def setMaximumFramerateUndefined: Self = StObject.set(x, "MaximumFramerate", js.undefined)
    
    inline def setResolution(value: ReservationResolution): Self = StObject.set(x, "Resolution", value.asInstanceOf[js.Any])
    
    inline def setResolutionUndefined: Self = StObject.set(x, "Resolution", js.undefined)
    
    inline def setResourceType(value: ReservationResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    inline def setSpecialFeature(value: ReservationSpecialFeature): Self = StObject.set(x, "SpecialFeature", value.asInstanceOf[js.Any])
    
    inline def setSpecialFeatureUndefined: Self = StObject.set(x, "SpecialFeature", js.undefined)
    
    inline def setVideoQuality(value: ReservationVideoQuality): Self = StObject.set(x, "VideoQuality", value.asInstanceOf[js.Any])
    
    inline def setVideoQualityUndefined: Self = StObject.set(x, "VideoQuality", js.undefined)
  }
}
