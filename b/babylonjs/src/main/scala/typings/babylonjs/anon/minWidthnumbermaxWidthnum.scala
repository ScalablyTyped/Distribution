package typings.babylonjs.anon

import typings.std.ConstrainBoolean
import typings.std.ConstrainDOMString
import typings.std.ConstrainDouble
import typings.std.ConstrainULong
import typings.std.MediaTrackConstraintSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  minWidth :number,   maxWidth :number,   minHeight :number,   maxHeight :number,   deviceId :string} & std.MediaTrackConstraints */
@js.native
trait minWidthnumbermaxWidthnum extends StObject {
  
  var advanced: js.UndefOr[js.Array[MediaTrackConstraintSet]] = js.native
  
  var aspectRatio: js.UndefOr[ConstrainDouble] = js.native
  
  var autoGainControl: js.UndefOr[ConstrainBoolean] = js.native
  
  var channelCount: js.UndefOr[ConstrainULong] = js.native
  
  var deviceId: String with js.UndefOr[ConstrainDOMString] = js.native
  
  var echoCancellation: js.UndefOr[ConstrainBoolean] = js.native
  
  var facingMode: js.UndefOr[ConstrainDOMString] = js.native
  
  var frameRate: js.UndefOr[ConstrainDouble] = js.native
  
  var groupId: js.UndefOr[ConstrainDOMString] = js.native
  
  var height: js.UndefOr[ConstrainULong] = js.native
  
  var latency: js.UndefOr[ConstrainDouble] = js.native
  
  var maxHeight: Double = js.native
  
  var maxWidth: Double = js.native
  
  var minHeight: Double = js.native
  
  var minWidth: Double = js.native
  
  var noiseSuppression: js.UndefOr[ConstrainBoolean] = js.native
  
  var resizeMode: js.UndefOr[ConstrainDOMString] = js.native
  
  var sampleRate: js.UndefOr[ConstrainULong] = js.native
  
  var sampleSize: js.UndefOr[ConstrainULong] = js.native
  
  var width: js.UndefOr[ConstrainULong] = js.native
}
object minWidthnumbermaxWidthnum {
  
  @scala.inline
  def apply(
    deviceId: String with js.UndefOr[ConstrainDOMString],
    maxHeight: Double,
    maxWidth: Double,
    minHeight: Double,
    minWidth: Double
  ): minWidthnumbermaxWidthnum = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any], maxHeight = maxHeight.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], minHeight = minHeight.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[minWidthnumbermaxWidthnum]
  }
  
  @scala.inline
  implicit class minWidthnumbermaxWidthnumMutableBuilder[Self <: minWidthnumbermaxWidthnum] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdvanced(value: js.Array[MediaTrackConstraintSet]): Self = StObject.set(x, "advanced", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvancedUndefined: Self = StObject.set(x, "advanced", js.undefined)
    
    @scala.inline
    def setAdvancedVarargs(value: MediaTrackConstraintSet*): Self = StObject.set(x, "advanced", js.Array(value :_*))
    
    @scala.inline
    def setAspectRatio(value: ConstrainDouble): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
    
    @scala.inline
    def setAutoGainControl(value: ConstrainBoolean): Self = StObject.set(x, "autoGainControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoGainControlUndefined: Self = StObject.set(x, "autoGainControl", js.undefined)
    
    @scala.inline
    def setChannelCount(value: ConstrainULong): Self = StObject.set(x, "channelCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelCountUndefined: Self = StObject.set(x, "channelCount", js.undefined)
    
    @scala.inline
    def setDeviceId(value: String with js.UndefOr[ConstrainDOMString]): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEchoCancellation(value: ConstrainBoolean): Self = StObject.set(x, "echoCancellation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEchoCancellationUndefined: Self = StObject.set(x, "echoCancellation", js.undefined)
    
    @scala.inline
    def setFacingMode(value: ConstrainDOMString): Self = StObject.set(x, "facingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacingModeUndefined: Self = StObject.set(x, "facingMode", js.undefined)
    
    @scala.inline
    def setFacingModeVarargs(value: String*): Self = StObject.set(x, "facingMode", js.Array(value :_*))
    
    @scala.inline
    def setFrameRate(value: ConstrainDouble): Self = StObject.set(x, "frameRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameRateUndefined: Self = StObject.set(x, "frameRate", js.undefined)
    
    @scala.inline
    def setGroupId(value: ConstrainDOMString): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
    
    @scala.inline
    def setGroupIdVarargs(value: String*): Self = StObject.set(x, "groupId", js.Array(value :_*))
    
    @scala.inline
    def setHeight(value: ConstrainULong): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setLatency(value: ConstrainDouble): Self = StObject.set(x, "latency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatencyUndefined: Self = StObject.set(x, "latency", js.undefined)
    
    @scala.inline
    def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoiseSuppression(value: ConstrainBoolean): Self = StObject.set(x, "noiseSuppression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoiseSuppressionUndefined: Self = StObject.set(x, "noiseSuppression", js.undefined)
    
    @scala.inline
    def setResizeMode(value: ConstrainDOMString): Self = StObject.set(x, "resizeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizeModeUndefined: Self = StObject.set(x, "resizeMode", js.undefined)
    
    @scala.inline
    def setResizeModeVarargs(value: String*): Self = StObject.set(x, "resizeMode", js.Array(value :_*))
    
    @scala.inline
    def setSampleRate(value: ConstrainULong): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleRateUndefined: Self = StObject.set(x, "sampleRate", js.undefined)
    
    @scala.inline
    def setSampleSize(value: ConstrainULong): Self = StObject.set(x, "sampleSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleSizeUndefined: Self = StObject.set(x, "sampleSize", js.undefined)
    
    @scala.inline
    def setWidth(value: ConstrainULong): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
