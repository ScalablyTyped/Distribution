package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateDeviceInstanceResult extends js.Object {
  
  /**
    * An object that contains information about your device instance.
    */
  var deviceInstance: js.UndefOr[DeviceInstance] = js.native
}
object UpdateDeviceInstanceResult {
  
  @scala.inline
  def apply(): UpdateDeviceInstanceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDeviceInstanceResult]
  }
  
  @scala.inline
  implicit class UpdateDeviceInstanceResultOps[Self <: UpdateDeviceInstanceResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDeviceInstance(value: DeviceInstance): Self = this.set("deviceInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceInstance: Self = this.set("deviceInstance", js.undefined)
  }
}
