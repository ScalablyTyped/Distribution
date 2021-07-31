package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlackoutSlate extends StObject {
  
  /**
    * Blackout slate image to be used. Leave empty for solid black. Only bmp and png images are supported.
    */
  var BlackoutSlateImage: js.UndefOr[InputLocation] = js.undefined
  
  /**
    * Setting to enabled causes the encoder to blackout the video, audio, and captions, and raise the "Network Blackout Image" slate when an SCTE104/35 Network End Segmentation Descriptor is encountered. The blackout will be lifted when the Network Start Segmentation Descriptor is encountered. The Network End and Network Start descriptors must contain a network ID that matches the value entered in "Network ID".
    */
  var NetworkEndBlackout: js.UndefOr[BlackoutSlateNetworkEndBlackout] = js.undefined
  
  /**
    * Path to local file to use as Network End Blackout image. Image will be scaled to fill the entire output raster.
    */
  var NetworkEndBlackoutImage: js.UndefOr[InputLocation] = js.undefined
  
  /**
    * Provides Network ID that matches EIDR ID format (e.g., "10.XXXX/XXXX-XXXX-XXXX-XXXX-XXXX-C").
    */
  var NetworkId: js.UndefOr[stringMin34Max34] = js.undefined
  
  /**
    * When set to enabled, causes video, audio and captions to be blanked when indicated by program metadata.
    */
  var State: js.UndefOr[BlackoutSlateState] = js.undefined
}
object BlackoutSlate {
  
  @scala.inline
  def apply(): BlackoutSlate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlackoutSlate]
  }
  
  @scala.inline
  implicit class BlackoutSlateMutableBuilder[Self <: BlackoutSlate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlackoutSlateImage(value: InputLocation): Self = StObject.set(x, "BlackoutSlateImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlackoutSlateImageUndefined: Self = StObject.set(x, "BlackoutSlateImage", js.undefined)
    
    @scala.inline
    def setNetworkEndBlackout(value: BlackoutSlateNetworkEndBlackout): Self = StObject.set(x, "NetworkEndBlackout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkEndBlackoutImage(value: InputLocation): Self = StObject.set(x, "NetworkEndBlackoutImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkEndBlackoutImageUndefined: Self = StObject.set(x, "NetworkEndBlackoutImage", js.undefined)
    
    @scala.inline
    def setNetworkEndBlackoutUndefined: Self = StObject.set(x, "NetworkEndBlackout", js.undefined)
    
    @scala.inline
    def setNetworkId(value: stringMin34Max34): Self = StObject.set(x, "NetworkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkIdUndefined: Self = StObject.set(x, "NetworkId", js.undefined)
    
    @scala.inline
    def setState(value: BlackoutSlateState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
