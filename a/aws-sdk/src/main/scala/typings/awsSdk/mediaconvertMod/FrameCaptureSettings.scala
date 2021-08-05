package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FrameCaptureSettings extends StObject {
  
  /**
    * Frame capture will encode the first frame of the output stream, then one frame every framerateDenominator/framerateNumerator seconds. For example, settings of framerateNumerator = 1 and framerateDenominator = 3 (a rate of 1/3 frame per second) will capture the first frame, then 1 frame every 3s. Files will be named as filename.n.jpg where n is the 0-based sequence number of each Capture.
    */
  var FramerateDenominator: js.UndefOr[integerMin1Max2147483647] = js.undefined
  
  /**
    * Frame capture will encode the first frame of the output stream, then one frame every framerateDenominator/framerateNumerator seconds. For example, settings of framerateNumerator = 1 and framerateDenominator = 3 (a rate of 1/3 frame per second) will capture the first frame, then 1 frame every 3s. Files will be named as filename.NNNNNNN.jpg where N is the 0-based frame sequence number zero padded to 7 decimal places.
    */
  var FramerateNumerator: js.UndefOr[integerMin1Max2147483647] = js.undefined
  
  /**
    * Maximum number of captures (encoded jpg output files).
    */
  var MaxCaptures: js.UndefOr[integerMin1Max10000000] = js.undefined
  
  /**
    * JPEG Quality - a higher value equals higher quality.
    */
  var Quality: js.UndefOr[integerMin1Max100] = js.undefined
}
object FrameCaptureSettings {
  
  inline def apply(): FrameCaptureSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FrameCaptureSettings]
  }
  
  extension [Self <: FrameCaptureSettings](x: Self) {
    
    inline def setFramerateDenominator(value: integerMin1Max2147483647): Self = StObject.set(x, "FramerateDenominator", value.asInstanceOf[js.Any])
    
    inline def setFramerateDenominatorUndefined: Self = StObject.set(x, "FramerateDenominator", js.undefined)
    
    inline def setFramerateNumerator(value: integerMin1Max2147483647): Self = StObject.set(x, "FramerateNumerator", value.asInstanceOf[js.Any])
    
    inline def setFramerateNumeratorUndefined: Self = StObject.set(x, "FramerateNumerator", js.undefined)
    
    inline def setMaxCaptures(value: integerMin1Max10000000): Self = StObject.set(x, "MaxCaptures", value.asInstanceOf[js.Any])
    
    inline def setMaxCapturesUndefined: Self = StObject.set(x, "MaxCaptures", js.undefined)
    
    inline def setQuality(value: integerMin1Max100): Self = StObject.set(x, "Quality", value.asInstanceOf[js.Any])
    
    inline def setQualityUndefined: Self = StObject.set(x, "Quality", js.undefined)
  }
}
