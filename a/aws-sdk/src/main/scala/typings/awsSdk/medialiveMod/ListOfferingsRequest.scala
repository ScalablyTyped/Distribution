package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListOfferingsRequest extends StObject {
  
  /**
    * Filter by channel class, 'STANDARD' or 'SINGLE_PIPELINE'
    */
  var ChannelClass: js.UndefOr[string] = js.undefined
  
  /**
    * Filter to offerings that match the configuration of an existing channel, e.g. '2345678' (a channel ID)
    */
  var ChannelConfiguration: js.UndefOr[string] = js.undefined
  
  /**
    * Filter by codec, 'AVC', 'HEVC', 'MPEG2', 'AUDIO', or 'LINK'
    */
  var Codec: js.UndefOr[string] = js.undefined
  
  /**
    * Filter by offering duration, e.g. '12'
    */
  var Duration: js.UndefOr[string] = js.undefined
  
  var MaxResults: js.UndefOr[typings.awsSdk.medialiveMod.MaxResults] = js.undefined
  
  /**
    * Filter by bitrate, 'MAX_10_MBPS', 'MAX_20_MBPS', or 'MAX_50_MBPS'
    */
  var MaximumBitrate: js.UndefOr[string] = js.undefined
  
  /**
    * Filter by framerate, 'MAX_30_FPS' or 'MAX_60_FPS'
    */
  var MaximumFramerate: js.UndefOr[string] = js.undefined
  
  var NextToken: js.UndefOr[string] = js.undefined
  
  /**
    * Filter by resolution, 'SD', 'HD', 'FHD', or 'UHD'
    */
  var Resolution: js.UndefOr[string] = js.undefined
  
  /**
    * Filter by resource type, 'INPUT', 'OUTPUT', 'MULTIPLEX', or 'CHANNEL'
    */
  var ResourceType: js.UndefOr[string] = js.undefined
  
  /**
    * Filter by special feature, 'ADVANCED_AUDIO' or 'AUDIO_NORMALIZATION'
    */
  var SpecialFeature: js.UndefOr[string] = js.undefined
  
  /**
    * Filter by video quality, 'STANDARD', 'ENHANCED', or 'PREMIUM'
    */
  var VideoQuality: js.UndefOr[string] = js.undefined
}
object ListOfferingsRequest {
  
  inline def apply(): ListOfferingsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOfferingsRequest]
  }
  
  extension [Self <: ListOfferingsRequest](x: Self) {
    
    inline def setChannelClass(value: string): Self = StObject.set(x, "ChannelClass", value.asInstanceOf[js.Any])
    
    inline def setChannelClassUndefined: Self = StObject.set(x, "ChannelClass", js.undefined)
    
    inline def setChannelConfiguration(value: string): Self = StObject.set(x, "ChannelConfiguration", value.asInstanceOf[js.Any])
    
    inline def setChannelConfigurationUndefined: Self = StObject.set(x, "ChannelConfiguration", js.undefined)
    
    inline def setCodec(value: string): Self = StObject.set(x, "Codec", value.asInstanceOf[js.Any])
    
    inline def setCodecUndefined: Self = StObject.set(x, "Codec", js.undefined)
    
    inline def setDuration(value: string): Self = StObject.set(x, "Duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "Duration", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setMaximumBitrate(value: string): Self = StObject.set(x, "MaximumBitrate", value.asInstanceOf[js.Any])
    
    inline def setMaximumBitrateUndefined: Self = StObject.set(x, "MaximumBitrate", js.undefined)
    
    inline def setMaximumFramerate(value: string): Self = StObject.set(x, "MaximumFramerate", value.asInstanceOf[js.Any])
    
    inline def setMaximumFramerateUndefined: Self = StObject.set(x, "MaximumFramerate", js.undefined)
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResolution(value: string): Self = StObject.set(x, "Resolution", value.asInstanceOf[js.Any])
    
    inline def setResolutionUndefined: Self = StObject.set(x, "Resolution", js.undefined)
    
    inline def setResourceType(value: string): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    inline def setSpecialFeature(value: string): Self = StObject.set(x, "SpecialFeature", value.asInstanceOf[js.Any])
    
    inline def setSpecialFeatureUndefined: Self = StObject.set(x, "SpecialFeature", js.undefined)
    
    inline def setVideoQuality(value: string): Self = StObject.set(x, "VideoQuality", value.asInstanceOf[js.Any])
    
    inline def setVideoQualityUndefined: Self = StObject.set(x, "VideoQuality", js.undefined)
  }
}
