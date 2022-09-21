package typings.babylonjs.anon

import typings.std.ConstrainBoolean
import typings.std.ConstrainDOMString
import typings.std.ConstrainDouble
import typings.std.ConstrainULong
import typings.std.MediaTrackConstraintSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  minWidth :number,   maxWidth :number,   minHeight :number,   maxHeight :number,   deviceId :string} & std.MediaTrackConstraints */
trait minWidthnumbermaxWidthnum extends StObject {
  
  /* standard dom */
  var advanced: js.UndefOr[js.Array[MediaTrackConstraintSet]] = js.undefined
  
  /* standard dom */
  var aspectRatio: js.UndefOr[ConstrainDouble] = js.undefined
  
  /* standard dom */
  var autoGainControl: js.UndefOr[ConstrainBoolean] = js.undefined
  
  /* standard dom */
  var channelCount: js.UndefOr[ConstrainULong] = js.undefined
  
  /* standard dom */
  var deviceId: String & js.UndefOr[ConstrainDOMString]
  
  /* standard dom */
  var echoCancellation: js.UndefOr[ConstrainBoolean] = js.undefined
  
  /* standard dom */
  var facingMode: js.UndefOr[ConstrainDOMString] = js.undefined
  
  /* standard dom */
  var frameRate: js.UndefOr[ConstrainDouble] = js.undefined
  
  /* standard dom */
  var groupId: js.UndefOr[ConstrainDOMString] = js.undefined
  
  /* standard dom */
  var height: js.UndefOr[ConstrainULong] = js.undefined
  
  /* standard dom */
  var latency: js.UndefOr[ConstrainDouble] = js.undefined
  
  var maxHeight: Double
  
  var maxWidth: Double
  
  var minHeight: Double
  
  var minWidth: Double
  
  /* standard dom */
  var noiseSuppression: js.UndefOr[ConstrainBoolean] = js.undefined
  
  /* standard dom */
  var sampleRate: js.UndefOr[ConstrainULong] = js.undefined
  
  /* standard dom */
  var sampleSize: js.UndefOr[ConstrainULong] = js.undefined
  
  /* standard dom */
  var suppressLocalAudioPlayback: js.UndefOr[ConstrainBoolean] = js.undefined
  
  /* standard dom */
  var width: js.UndefOr[ConstrainULong] = js.undefined
}
object minWidthnumbermaxWidthnum {
  
  inline def apply(
    deviceId: String & js.UndefOr[ConstrainDOMString],
    maxHeight: Double,
    maxWidth: Double,
    minHeight: Double,
    minWidth: Double
  ): minWidthnumbermaxWidthnum = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any], maxHeight = maxHeight.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], minHeight = minHeight.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[minWidthnumbermaxWidthnum]
  }
  
  extension [Self <: minWidthnumbermaxWidthnum](x: Self) {
    
    inline def setAdvanced(value: js.Array[MediaTrackConstraintSet]): Self = StObject.set(x, "advanced", value.asInstanceOf[js.Any])
    
    inline def setAdvancedUndefined: Self = StObject.set(x, "advanced", js.undefined)
    
    inline def setAdvancedVarargs(value: MediaTrackConstraintSet*): Self = StObject.set(x, "advanced", js.Array(value*))
    
    inline def setAspectRatio(value: ConstrainDouble): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
    
    inline def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
    
    inline def setAutoGainControl(value: ConstrainBoolean): Self = StObject.set(x, "autoGainControl", value.asInstanceOf[js.Any])
    
    inline def setAutoGainControlUndefined: Self = StObject.set(x, "autoGainControl", js.undefined)
    
    inline def setChannelCount(value: ConstrainULong): Self = StObject.set(x, "channelCount", value.asInstanceOf[js.Any])
    
    inline def setChannelCountUndefined: Self = StObject.set(x, "channelCount", js.undefined)
    
    inline def setDeviceId(value: String & js.UndefOr[ConstrainDOMString]): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setEchoCancellation(value: ConstrainBoolean): Self = StObject.set(x, "echoCancellation", value.asInstanceOf[js.Any])
    
    inline def setEchoCancellationUndefined: Self = StObject.set(x, "echoCancellation", js.undefined)
    
    inline def setFacingMode(value: ConstrainDOMString): Self = StObject.set(x, "facingMode", value.asInstanceOf[js.Any])
    
    inline def setFacingModeUndefined: Self = StObject.set(x, "facingMode", js.undefined)
    
    inline def setFacingModeVarargs(value: String*): Self = StObject.set(x, "facingMode", js.Array(value*))
    
    inline def setFrameRate(value: ConstrainDouble): Self = StObject.set(x, "frameRate", value.asInstanceOf[js.Any])
    
    inline def setFrameRateUndefined: Self = StObject.set(x, "frameRate", js.undefined)
    
    inline def setGroupId(value: ConstrainDOMString): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
    
    inline def setGroupIdVarargs(value: String*): Self = StObject.set(x, "groupId", js.Array(value*))
    
    inline def setHeight(value: ConstrainULong): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setLatency(value: ConstrainDouble): Self = StObject.set(x, "latency", value.asInstanceOf[js.Any])
    
    inline def setLatencyUndefined: Self = StObject.set(x, "latency", js.undefined)
    
    inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    inline def setNoiseSuppression(value: ConstrainBoolean): Self = StObject.set(x, "noiseSuppression", value.asInstanceOf[js.Any])
    
    inline def setNoiseSuppressionUndefined: Self = StObject.set(x, "noiseSuppression", js.undefined)
    
    inline def setSampleRate(value: ConstrainULong): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
    
    inline def setSampleRateUndefined: Self = StObject.set(x, "sampleRate", js.undefined)
    
    inline def setSampleSize(value: ConstrainULong): Self = StObject.set(x, "sampleSize", value.asInstanceOf[js.Any])
    
    inline def setSampleSizeUndefined: Self = StObject.set(x, "sampleSize", js.undefined)
    
    inline def setSuppressLocalAudioPlayback(value: ConstrainBoolean): Self = StObject.set(x, "suppressLocalAudioPlayback", value.asInstanceOf[js.Any])
    
    inline def setSuppressLocalAudioPlaybackUndefined: Self = StObject.set(x, "suppressLocalAudioPlayback", js.undefined)
    
    inline def setWidth(value: ConstrainULong): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
