package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDevicePoolResult extends StObject {
  
  /**
    * The device pool you just updated.
    */
  var devicePool: js.UndefOr[DevicePool] = js.undefined
}
object UpdateDevicePoolResult {
  
  @scala.inline
  def apply(): UpdateDevicePoolResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDevicePoolResult]
  }
  
  @scala.inline
  implicit class UpdateDevicePoolResultMutableBuilder[Self <: UpdateDevicePoolResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevicePool(value: DevicePool): Self = StObject.set(x, "devicePool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevicePoolUndefined: Self = StObject.set(x, "devicePool", js.undefined)
  }
}
