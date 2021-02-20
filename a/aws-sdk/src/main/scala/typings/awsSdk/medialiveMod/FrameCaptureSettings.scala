package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FrameCaptureSettings extends StObject {
  
  /**
    * The frequency at which to capture frames for inclusion in the output. May be specified in either seconds or milliseconds, as specified by captureIntervalUnits.
    */
  var CaptureInterval: integerMin1Max3600000 = js.native
  
  /**
    * Unit for the frame capture interval.
    */
  var CaptureIntervalUnits: js.UndefOr[FrameCaptureIntervalUnit] = js.native
}
object FrameCaptureSettings {
  
  @scala.inline
  def apply(CaptureInterval: integerMin1Max3600000): FrameCaptureSettings = {
    val __obj = js.Dynamic.literal(CaptureInterval = CaptureInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameCaptureSettings]
  }
  
  @scala.inline
  implicit class FrameCaptureSettingsMutableBuilder[Self <: FrameCaptureSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaptureInterval(value: integerMin1Max3600000): Self = StObject.set(x, "CaptureInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptureIntervalUnits(value: FrameCaptureIntervalUnit): Self = StObject.set(x, "CaptureIntervalUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptureIntervalUnitsUndefined: Self = StObject.set(x, "CaptureIntervalUnits", js.undefined)
  }
}
