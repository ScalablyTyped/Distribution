package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaTrackCapabilities extends StObject {
  
  var aspectRatio: js.UndefOr[DoubleRange] = js.undefined
  
  var autoGainControl: js.UndefOr[Array[scala.Boolean]] = js.undefined
  
  var channelCount: js.UndefOr[ULongRange] = js.undefined
  
  var cursor: js.UndefOr[Array[java.lang.String]] = js.undefined
  
  var deviceId: js.UndefOr[java.lang.String] = js.undefined
  
  var displaySurface: js.UndefOr[java.lang.String] = js.undefined
  
  var echoCancellation: js.UndefOr[Array[scala.Boolean]] = js.undefined
  
  var facingMode: js.UndefOr[Array[java.lang.String]] = js.undefined
  
  var frameRate: js.UndefOr[DoubleRange] = js.undefined
  
  var groupId: js.UndefOr[java.lang.String] = js.undefined
  
  var height: js.UndefOr[ULongRange] = js.undefined
  
  var latency: js.UndefOr[DoubleRange] = js.undefined
  
  var logicalSurface: js.UndefOr[scala.Boolean] = js.undefined
  
  var noiseSuppression: js.UndefOr[Array[scala.Boolean]] = js.undefined
  
  var resizeMode: js.UndefOr[Array[java.lang.String]] = js.undefined
  
  var sampleRate: js.UndefOr[ULongRange] = js.undefined
  
  var sampleSize: js.UndefOr[ULongRange] = js.undefined
  
  var width: js.UndefOr[ULongRange] = js.undefined
}
object MediaTrackCapabilities {
  
  inline def apply(): MediaTrackCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaTrackCapabilities]
  }
  
  extension [Self <: MediaTrackCapabilities](x: Self) {
    
    inline def setAspectRatio(value: DoubleRange): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
    
    inline def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
    
    inline def setAutoGainControl(value: Array[scala.Boolean]): Self = StObject.set(x, "autoGainControl", value.asInstanceOf[js.Any])
    
    inline def setAutoGainControlUndefined: Self = StObject.set(x, "autoGainControl", js.undefined)
    
    inline def setChannelCount(value: ULongRange): Self = StObject.set(x, "channelCount", value.asInstanceOf[js.Any])
    
    inline def setChannelCountUndefined: Self = StObject.set(x, "channelCount", js.undefined)
    
    inline def setCursor(value: Array[java.lang.String]): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    inline def setDeviceId(value: java.lang.String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    inline def setDisplaySurface(value: java.lang.String): Self = StObject.set(x, "displaySurface", value.asInstanceOf[js.Any])
    
    inline def setDisplaySurfaceUndefined: Self = StObject.set(x, "displaySurface", js.undefined)
    
    inline def setEchoCancellation(value: Array[scala.Boolean]): Self = StObject.set(x, "echoCancellation", value.asInstanceOf[js.Any])
    
    inline def setEchoCancellationUndefined: Self = StObject.set(x, "echoCancellation", js.undefined)
    
    inline def setFacingMode(value: Array[java.lang.String]): Self = StObject.set(x, "facingMode", value.asInstanceOf[js.Any])
    
    inline def setFacingModeUndefined: Self = StObject.set(x, "facingMode", js.undefined)
    
    inline def setFrameRate(value: DoubleRange): Self = StObject.set(x, "frameRate", value.asInstanceOf[js.Any])
    
    inline def setFrameRateUndefined: Self = StObject.set(x, "frameRate", js.undefined)
    
    inline def setGroupId(value: java.lang.String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
    
    inline def setHeight(value: ULongRange): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setLatency(value: DoubleRange): Self = StObject.set(x, "latency", value.asInstanceOf[js.Any])
    
    inline def setLatencyUndefined: Self = StObject.set(x, "latency", js.undefined)
    
    inline def setLogicalSurface(value: scala.Boolean): Self = StObject.set(x, "logicalSurface", value.asInstanceOf[js.Any])
    
    inline def setLogicalSurfaceUndefined: Self = StObject.set(x, "logicalSurface", js.undefined)
    
    inline def setNoiseSuppression(value: Array[scala.Boolean]): Self = StObject.set(x, "noiseSuppression", value.asInstanceOf[js.Any])
    
    inline def setNoiseSuppressionUndefined: Self = StObject.set(x, "noiseSuppression", js.undefined)
    
    inline def setResizeMode(value: Array[java.lang.String]): Self = StObject.set(x, "resizeMode", value.asInstanceOf[js.Any])
    
    inline def setResizeModeUndefined: Self = StObject.set(x, "resizeMode", js.undefined)
    
    inline def setSampleRate(value: ULongRange): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
    
    inline def setSampleRateUndefined: Self = StObject.set(x, "sampleRate", js.undefined)
    
    inline def setSampleSize(value: ULongRange): Self = StObject.set(x, "sampleSize", value.asInstanceOf[js.Any])
    
    inline def setSampleSizeUndefined: Self = StObject.set(x, "sampleSize", js.undefined)
    
    inline def setWidth(value: ULongRange): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
