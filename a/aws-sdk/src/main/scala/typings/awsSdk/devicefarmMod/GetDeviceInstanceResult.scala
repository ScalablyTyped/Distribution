package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDeviceInstanceResult extends StObject {
  
  /**
    * An object that contains information about your device instance.
    */
  var deviceInstance: js.UndefOr[DeviceInstance] = js.native
}
object GetDeviceInstanceResult {
  
  @scala.inline
  def apply(): GetDeviceInstanceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDeviceInstanceResult]
  }
  
  @scala.inline
  implicit class GetDeviceInstanceResultMutableBuilder[Self <: GetDeviceInstanceResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceInstance(value: DeviceInstance): Self = StObject.set(x, "deviceInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceInstanceUndefined: Self = StObject.set(x, "deviceInstance", js.undefined)
  }
}
