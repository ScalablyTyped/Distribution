package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlackFrame extends StObject {
  
  /**
    *  A threshold used to determine the maximum luminance value for a pixel to be considered black. In a full color range video, luminance values range from 0-255. A pixel value of 0 is pure black, and the most strict filter. The maximum black pixel value is computed as follows: max_black_pixel_value = minimum_luminance + MaxPixelThreshold *luminance_range.  For example, for a full range video with BlackPixelThreshold = 0.1, max_black_pixel_value is 0 + 0.1 * (255-0) = 25.5. The default value of MaxPixelThreshold is 0.2, which maps to a max_black_pixel_value of 51 for a full range video. You can lower this threshold to be more strict on black levels.
    */
  var MaxPixelThreshold: js.UndefOr[typings.awsSdk.rekognitionMod.MaxPixelThreshold] = js.undefined
  
  /**
    *  The minimum percentage of pixels in a frame that need to have a luminance below the max_black_pixel_value for a frame to be considered a black frame. Luminance is calculated using the BT.709 matrix.  The default value is 99, which means at least 99% of all pixels in the frame are black pixels as per the MaxPixelThreshold set. You can reduce this value to allow more noise on the black frame.
    */
  var MinCoveragePercentage: js.UndefOr[typings.awsSdk.rekognitionMod.MinCoveragePercentage] = js.undefined
}
object BlackFrame {
  
  inline def apply(): BlackFrame = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlackFrame]
  }
  
  extension [Self <: BlackFrame](x: Self) {
    
    inline def setMaxPixelThreshold(value: MaxPixelThreshold): Self = StObject.set(x, "MaxPixelThreshold", value.asInstanceOf[js.Any])
    
    inline def setMaxPixelThresholdUndefined: Self = StObject.set(x, "MaxPixelThreshold", js.undefined)
    
    inline def setMinCoveragePercentage(value: MinCoveragePercentage): Self = StObject.set(x, "MinCoveragePercentage", value.asInstanceOf[js.Any])
    
    inline def setMinCoveragePercentageUndefined: Self = StObject.set(x, "MinCoveragePercentage", js.undefined)
  }
}
