package typings.awsSdk.worklinkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceSummary extends StObject {
  
  /**
    * The ID of the device.
    */
  var DeviceId: js.UndefOr[Id] = js.undefined
  
  /**
    * The status of the device.
    */
  var DeviceStatus: js.UndefOr[typings.awsSdk.worklinkMod.DeviceStatus] = js.undefined
}
object DeviceSummary {
  
  @scala.inline
  def apply(): DeviceSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceSummary]
  }
  
  @scala.inline
  implicit class DeviceSummaryMutableBuilder[Self <: DeviceSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceId(value: Id): Self = StObject.set(x, "DeviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceIdUndefined: Self = StObject.set(x, "DeviceId", js.undefined)
    
    @scala.inline
    def setDeviceStatus(value: DeviceStatus): Self = StObject.set(x, "DeviceStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceStatusUndefined: Self = StObject.set(x, "DeviceStatus", js.undefined)
  }
}
