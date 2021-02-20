package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateInputDeviceRequest extends StObject {
  
  /**
    * The settings that you want to apply to the input device.
    */
  var HdDeviceSettings: js.UndefOr[InputDeviceConfigurableSettings] = js.native
  
  /**
    * The unique ID of the input device. For example, hd-123456789abcdef.
    */
  var InputDeviceId: string = js.native
  
  /**
    * The name that you assigned to this input device (not the unique ID).
    */
  var Name: js.UndefOr[string] = js.native
}
object UpdateInputDeviceRequest {
  
  @scala.inline
  def apply(InputDeviceId: string): UpdateInputDeviceRequest = {
    val __obj = js.Dynamic.literal(InputDeviceId = InputDeviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateInputDeviceRequest]
  }
  
  @scala.inline
  implicit class UpdateInputDeviceRequestMutableBuilder[Self <: UpdateInputDeviceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHdDeviceSettings(value: InputDeviceConfigurableSettings): Self = StObject.set(x, "HdDeviceSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHdDeviceSettingsUndefined: Self = StObject.set(x, "HdDeviceSettings", js.undefined)
    
    @scala.inline
    def setInputDeviceId(value: string): Self = StObject.set(x, "InputDeviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
