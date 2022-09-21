package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaTrackSettings extends StObject {
  
  var aspectRatio: js.UndefOr[Double] = js.undefined
  
  var autoGainControl: js.UndefOr[scala.Boolean] = js.undefined
  
  var deviceId: js.UndefOr[java.lang.String] = js.undefined
  
  var echoCancellation: js.UndefOr[scala.Boolean] = js.undefined
  
  var facingMode: js.UndefOr[java.lang.String] = js.undefined
  
  var frameRate: js.UndefOr[Double] = js.undefined
  
  var groupId: js.UndefOr[java.lang.String] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var noiseSuppression: js.UndefOr[scala.Boolean] = js.undefined
  
  var restrictOwnAudio: js.UndefOr[scala.Boolean] = js.undefined
  
  var sampleRate: js.UndefOr[Double] = js.undefined
  
  var sampleSize: js.UndefOr[Double] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object MediaTrackSettings {
  
  inline def apply(): MediaTrackSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaTrackSettings]
  }
  
  extension [Self <: MediaTrackSettings](x: Self) {
    
    inline def setAspectRatio(value: Double): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
    
    inline def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
    
    inline def setAutoGainControl(value: scala.Boolean): Self = StObject.set(x, "autoGainControl", value.asInstanceOf[js.Any])
    
    inline def setAutoGainControlUndefined: Self = StObject.set(x, "autoGainControl", js.undefined)
    
    inline def setDeviceId(value: java.lang.String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    inline def setEchoCancellation(value: scala.Boolean): Self = StObject.set(x, "echoCancellation", value.asInstanceOf[js.Any])
    
    inline def setEchoCancellationUndefined: Self = StObject.set(x, "echoCancellation", js.undefined)
    
    inline def setFacingMode(value: java.lang.String): Self = StObject.set(x, "facingMode", value.asInstanceOf[js.Any])
    
    inline def setFacingModeUndefined: Self = StObject.set(x, "facingMode", js.undefined)
    
    inline def setFrameRate(value: Double): Self = StObject.set(x, "frameRate", value.asInstanceOf[js.Any])
    
    inline def setFrameRateUndefined: Self = StObject.set(x, "frameRate", js.undefined)
    
    inline def setGroupId(value: java.lang.String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setNoiseSuppression(value: scala.Boolean): Self = StObject.set(x, "noiseSuppression", value.asInstanceOf[js.Any])
    
    inline def setNoiseSuppressionUndefined: Self = StObject.set(x, "noiseSuppression", js.undefined)
    
    inline def setRestrictOwnAudio(value: scala.Boolean): Self = StObject.set(x, "restrictOwnAudio", value.asInstanceOf[js.Any])
    
    inline def setRestrictOwnAudioUndefined: Self = StObject.set(x, "restrictOwnAudio", js.undefined)
    
    inline def setSampleRate(value: Double): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
    
    inline def setSampleRateUndefined: Self = StObject.set(x, "sampleRate", js.undefined)
    
    inline def setSampleSize(value: Double): Self = StObject.set(x, "sampleSize", value.asInstanceOf[js.Any])
    
    inline def setSampleSizeUndefined: Self = StObject.set(x, "sampleSize", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
