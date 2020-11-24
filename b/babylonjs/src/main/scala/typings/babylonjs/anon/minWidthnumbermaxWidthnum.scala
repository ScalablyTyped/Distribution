package typings.babylonjs.anon

import typings.std.ConstrainBoolean
import typings.std.ConstrainDOMString
import typings.std.ConstrainDouble
import typings.std.ConstrainULong
import typings.std.MediaTrackConstraintSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  minWidth :number,   maxWidth :number,   minHeight :number,   maxHeight :number,   deviceId :string} & std.MediaTrackConstraints */
@js.native
trait minWidthnumbermaxWidthnum extends js.Object {
  
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
  implicit class minWidthnumbermaxWidthnumOps[Self <: minWidthnumbermaxWidthnum] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDeviceId(value: String with js.UndefOr[ConstrainDOMString]): Self = this.set("deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxHeight(value: Double): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinHeight(value: Double): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvancedVarargs(value: MediaTrackConstraintSet*): Self = this.set("advanced", js.Array(value :_*))
    
    @scala.inline
    def setAdvanced(value: js.Array[MediaTrackConstraintSet]): Self = this.set("advanced", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvanced: Self = this.set("advanced", js.undefined)
    
    @scala.inline
    def setAspectRatio(value: ConstrainDouble): Self = this.set("aspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAspectRatio: Self = this.set("aspectRatio", js.undefined)
    
    @scala.inline
    def setAutoGainControl(value: ConstrainBoolean): Self = this.set("autoGainControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoGainControl: Self = this.set("autoGainControl", js.undefined)
    
    @scala.inline
    def setChannelCount(value: ConstrainULong): Self = this.set("channelCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelCount: Self = this.set("channelCount", js.undefined)
    
    @scala.inline
    def setEchoCancellation(value: ConstrainBoolean): Self = this.set("echoCancellation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEchoCancellation: Self = this.set("echoCancellation", js.undefined)
    
    @scala.inline
    def setFacingModeVarargs(value: String*): Self = this.set("facingMode", js.Array(value :_*))
    
    @scala.inline
    def setFacingMode(value: ConstrainDOMString): Self = this.set("facingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFacingMode: Self = this.set("facingMode", js.undefined)
    
    @scala.inline
    def setFrameRate(value: ConstrainDouble): Self = this.set("frameRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrameRate: Self = this.set("frameRate", js.undefined)
    
    @scala.inline
    def setGroupIdVarargs(value: String*): Self = this.set("groupId", js.Array(value :_*))
    
    @scala.inline
    def setGroupId(value: ConstrainDOMString): Self = this.set("groupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupId: Self = this.set("groupId", js.undefined)
    
    @scala.inline
    def setHeight(value: ConstrainULong): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setLatency(value: ConstrainDouble): Self = this.set("latency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatency: Self = this.set("latency", js.undefined)
    
    @scala.inline
    def setNoiseSuppression(value: ConstrainBoolean): Self = this.set("noiseSuppression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoiseSuppression: Self = this.set("noiseSuppression", js.undefined)
    
    @scala.inline
    def setResizeModeVarargs(value: String*): Self = this.set("resizeMode", js.Array(value :_*))
    
    @scala.inline
    def setResizeMode(value: ConstrainDOMString): Self = this.set("resizeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizeMode: Self = this.set("resizeMode", js.undefined)
    
    @scala.inline
    def setSampleRate(value: ConstrainULong): Self = this.set("sampleRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSampleRate: Self = this.set("sampleRate", js.undefined)
    
    @scala.inline
    def setSampleSize(value: ConstrainULong): Self = this.set("sampleSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSampleSize: Self = this.set("sampleSize", js.undefined)
    
    @scala.inline
    def setWidth(value: ConstrainULong): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
