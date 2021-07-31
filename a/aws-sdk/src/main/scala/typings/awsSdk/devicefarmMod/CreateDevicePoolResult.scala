package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDevicePoolResult extends StObject {
  
  /**
    * The newly created device pool.
    */
  var devicePool: js.UndefOr[DevicePool] = js.undefined
}
object CreateDevicePoolResult {
  
  @scala.inline
  def apply(): CreateDevicePoolResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDevicePoolResult]
  }
  
  @scala.inline
  implicit class CreateDevicePoolResultMutableBuilder[Self <: CreateDevicePoolResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevicePool(value: DevicePool): Self = StObject.set(x, "devicePool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevicePoolUndefined: Self = StObject.set(x, "devicePool", js.undefined)
  }
}
