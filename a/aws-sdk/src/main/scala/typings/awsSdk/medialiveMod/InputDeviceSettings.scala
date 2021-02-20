package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputDeviceSettings extends StObject {
  
  /**
    * The unique ID for the device.
    */
  var Id: js.UndefOr[string] = js.native
}
object InputDeviceSettings {
  
  @scala.inline
  def apply(): InputDeviceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputDeviceSettings]
  }
  
  @scala.inline
  implicit class InputDeviceSettingsMutableBuilder[Self <: InputDeviceSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
  }
}
