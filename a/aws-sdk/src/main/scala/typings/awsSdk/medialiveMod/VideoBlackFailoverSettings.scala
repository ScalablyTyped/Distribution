package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoBlackFailoverSettings extends StObject {
  
  /**
    * A value used in calculating the threshold below which MediaLive considers a pixel to be 'black'. For the input to be considered black, every pixel in a frame must be below this threshold. The threshold is calculated as a percentage (expressed as a decimal) of white. Therefore .1 means 10% white (or 90% black). Note how the formula works for any color depth. For example, if you set this field to 0.1 in 10-bit color depth: (1023*0.1=102.3), which means a pixel value of 102 or less is 'black'. If you set this field to .1 in an 8-bit color depth: (255*0.1=25.5), which means a pixel value of 25 or less is 'black'. The range is 0.0 to 1.0, with any number of decimal places.
    */
  var BlackDetectThreshold: js.UndefOr[doubleMin0Max1] = js.undefined
  
  /**
    * The amount of time (in milliseconds) that the active input must be black before automatic input failover occurs.
    */
  var VideoBlackThresholdMsec: js.UndefOr[integerMin1000] = js.undefined
}
object VideoBlackFailoverSettings {
  
  inline def apply(): VideoBlackFailoverSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoBlackFailoverSettings]
  }
  
  extension [Self <: VideoBlackFailoverSettings](x: Self) {
    
    inline def setBlackDetectThreshold(value: doubleMin0Max1): Self = StObject.set(x, "BlackDetectThreshold", value.asInstanceOf[js.Any])
    
    inline def setBlackDetectThresholdUndefined: Self = StObject.set(x, "BlackDetectThreshold", js.undefined)
    
    inline def setVideoBlackThresholdMsec(value: integerMin1000): Self = StObject.set(x, "VideoBlackThresholdMsec", value.asInstanceOf[js.Any])
    
    inline def setVideoBlackThresholdMsecUndefined: Self = StObject.set(x, "VideoBlackThresholdMsec", js.undefined)
  }
}
