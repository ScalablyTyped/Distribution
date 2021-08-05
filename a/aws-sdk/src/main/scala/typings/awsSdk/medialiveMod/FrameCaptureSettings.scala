package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FrameCaptureSettings extends StObject {
  
  /**
    * The frequency at which to capture frames for inclusion in the output. May be specified in either seconds or milliseconds, as specified by captureIntervalUnits.
    */
  var CaptureInterval: integerMin1Max3600000
  
  /**
    * Unit for the frame capture interval.
    */
  var CaptureIntervalUnits: js.UndefOr[FrameCaptureIntervalUnit] = js.undefined
}
object FrameCaptureSettings {
  
  inline def apply(CaptureInterval: integerMin1Max3600000): FrameCaptureSettings = {
    val __obj = js.Dynamic.literal(CaptureInterval = CaptureInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameCaptureSettings]
  }
  
  extension [Self <: FrameCaptureSettings](x: Self) {
    
    inline def setCaptureInterval(value: integerMin1Max3600000): Self = StObject.set(x, "CaptureInterval", value.asInstanceOf[js.Any])
    
    inline def setCaptureIntervalUnits(value: FrameCaptureIntervalUnit): Self = StObject.set(x, "CaptureIntervalUnits", value.asInstanceOf[js.Any])
    
    inline def setCaptureIntervalUnitsUndefined: Self = StObject.set(x, "CaptureIntervalUnits", js.undefined)
  }
}
