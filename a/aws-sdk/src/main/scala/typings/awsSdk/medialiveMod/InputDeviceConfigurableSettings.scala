package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputDeviceConfigurableSettings extends StObject {
  
  /**
    * The input source that you want to use. If the device has a source connected to only one of its input ports, or if you don't care which source the device sends, specify Auto. If the device has sources connected to both its input ports, and you want to use a specific source, specify the source.
    */
  var ConfiguredInput: js.UndefOr[InputDeviceConfiguredInput] = js.native
  
  /**
    * The maximum bitrate in bits per second. Set a value here to throttle the bitrate of the source video.
    */
  var MaxBitrate: js.UndefOr[integer] = js.native
}
object InputDeviceConfigurableSettings {
  
  @scala.inline
  def apply(): InputDeviceConfigurableSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputDeviceConfigurableSettings]
  }
  
  @scala.inline
  implicit class InputDeviceConfigurableSettingsMutableBuilder[Self <: InputDeviceConfigurableSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfiguredInput(value: InputDeviceConfiguredInput): Self = StObject.set(x, "ConfiguredInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfiguredInputUndefined: Self = StObject.set(x, "ConfiguredInput", js.undefined)
    
    @scala.inline
    def setMaxBitrate(value: integer): Self = StObject.set(x, "MaxBitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxBitrateUndefined: Self = StObject.set(x, "MaxBitrate", js.undefined)
  }
}
