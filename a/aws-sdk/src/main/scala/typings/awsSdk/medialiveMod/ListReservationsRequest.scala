package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListReservationsRequest extends StObject {
  
  /**
    * Filter by channel class, 'STANDARD' or 'SINGLE_PIPELINE'
    */
  var ChannelClass: js.UndefOr[string] = js.native
  
  /**
    * Filter by codec, 'AVC', 'HEVC', 'MPEG2', 'AUDIO', or 'LINK'
    */
  var Codec: js.UndefOr[string] = js.native
  
  var MaxResults: js.UndefOr[typings.awsSdk.medialiveMod.MaxResults] = js.native
  
  /**
    * Filter by bitrate, 'MAX_10_MBPS', 'MAX_20_MBPS', or 'MAX_50_MBPS'
    */
  var MaximumBitrate: js.UndefOr[string] = js.native
  
  /**
    * Filter by framerate, 'MAX_30_FPS' or 'MAX_60_FPS'
    */
  var MaximumFramerate: js.UndefOr[string] = js.native
  
  var NextToken: js.UndefOr[string] = js.native
  
  /**
    * Filter by resolution, 'SD', 'HD', 'FHD', or 'UHD'
    */
  var Resolution: js.UndefOr[string] = js.native
  
  /**
    * Filter by resource type, 'INPUT', 'OUTPUT', 'MULTIPLEX', or 'CHANNEL'
    */
  var ResourceType: js.UndefOr[string] = js.native
  
  /**
    * Filter by special feature, 'ADVANCED_AUDIO' or 'AUDIO_NORMALIZATION'
    */
  var SpecialFeature: js.UndefOr[string] = js.native
  
  /**
    * Filter by video quality, 'STANDARD', 'ENHANCED', or 'PREMIUM'
    */
  var VideoQuality: js.UndefOr[string] = js.native
}
object ListReservationsRequest {
  
  @scala.inline
  def apply(): ListReservationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListReservationsRequest]
  }
  
  @scala.inline
  implicit class ListReservationsRequestMutableBuilder[Self <: ListReservationsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelClass(value: string): Self = StObject.set(x, "ChannelClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelClassUndefined: Self = StObject.set(x, "ChannelClass", js.undefined)
    
    @scala.inline
    def setCodec(value: string): Self = StObject.set(x, "Codec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodecUndefined: Self = StObject.set(x, "Codec", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setMaximumBitrate(value: string): Self = StObject.set(x, "MaximumBitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumBitrateUndefined: Self = StObject.set(x, "MaximumBitrate", js.undefined)
    
    @scala.inline
    def setMaximumFramerate(value: string): Self = StObject.set(x, "MaximumFramerate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumFramerateUndefined: Self = StObject.set(x, "MaximumFramerate", js.undefined)
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setResolution(value: string): Self = StObject.set(x, "Resolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolutionUndefined: Self = StObject.set(x, "Resolution", js.undefined)
    
    @scala.inline
    def setResourceType(value: string): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    @scala.inline
    def setSpecialFeature(value: string): Self = StObject.set(x, "SpecialFeature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecialFeatureUndefined: Self = StObject.set(x, "SpecialFeature", js.undefined)
    
    @scala.inline
    def setVideoQuality(value: string): Self = StObject.set(x, "VideoQuality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoQualityUndefined: Self = StObject.set(x, "VideoQuality", js.undefined)
  }
}
