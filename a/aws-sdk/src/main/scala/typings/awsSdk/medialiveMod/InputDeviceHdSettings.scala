package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputDeviceHdSettings extends js.Object {
  
  /**
    * If you specified Auto as the configured input, specifies which of the sources is currently active (SDI or HDMI).
    */
  var ActiveInput: js.UndefOr[InputDeviceActiveInput] = js.native
  
  /**
    * The source at the input device that is currently active. You can specify this source.
    */
  var ConfiguredInput: js.UndefOr[InputDeviceConfiguredInput] = js.native
  
  /**
    * The state of the input device.
    */
  var DeviceState: js.UndefOr[InputDeviceState] = js.native
  
  /**
    * The frame rate of the video source.
    */
  var Framerate: js.UndefOr[double] = js.native
  
  /**
    * The height of the video source, in pixels.
    */
  var Height: js.UndefOr[integer] = js.native
  
  /**
    * The current maximum bitrate for ingesting this source, in bits per second. You can specify this maximum.
    */
  var MaxBitrate: js.UndefOr[integer] = js.native
  
  /**
    * The scan type of the video source.
    */
  var ScanType: js.UndefOr[InputDeviceScanType] = js.native
  
  /**
    * The width of the video source, in pixels.
    */
  var Width: js.UndefOr[integer] = js.native
}
object InputDeviceHdSettings {
  
  @scala.inline
  def apply(): InputDeviceHdSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputDeviceHdSettings]
  }
  
  @scala.inline
  implicit class InputDeviceHdSettingsOps[Self <: InputDeviceHdSettings] (val x: Self) extends AnyVal {
    
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
    def setActiveInput(value: InputDeviceActiveInput): Self = this.set("ActiveInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveInput: Self = this.set("ActiveInput", js.undefined)
    
    @scala.inline
    def setConfiguredInput(value: InputDeviceConfiguredInput): Self = this.set("ConfiguredInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfiguredInput: Self = this.set("ConfiguredInput", js.undefined)
    
    @scala.inline
    def setDeviceState(value: InputDeviceState): Self = this.set("DeviceState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceState: Self = this.set("DeviceState", js.undefined)
    
    @scala.inline
    def setFramerate(value: double): Self = this.set("Framerate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFramerate: Self = this.set("Framerate", js.undefined)
    
    @scala.inline
    def setHeight(value: integer): Self = this.set("Height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("Height", js.undefined)
    
    @scala.inline
    def setMaxBitrate(value: integer): Self = this.set("MaxBitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxBitrate: Self = this.set("MaxBitrate", js.undefined)
    
    @scala.inline
    def setScanType(value: InputDeviceScanType): Self = this.set("ScanType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScanType: Self = this.set("ScanType", js.undefined)
    
    @scala.inline
    def setWidth(value: integer): Self = this.set("Width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("Width", js.undefined)
  }
}
