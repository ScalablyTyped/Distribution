package typings.awsSdk.panoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceJob extends StObject {
  
  /**
    * When the job was created.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ID of the target device.
    */
  var DeviceId: js.UndefOr[typings.awsSdk.panoramaMod.DeviceId] = js.undefined
  
  /**
    * The name of the target device
    */
  var DeviceName: js.UndefOr[typings.awsSdk.panoramaMod.DeviceName] = js.undefined
  
  /**
    * The job's ID.
    */
  var JobId: js.UndefOr[typings.awsSdk.panoramaMod.JobId] = js.undefined
}
object DeviceJob {
  
  inline def apply(): DeviceJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceJob]
  }
  
  extension [Self <: DeviceJob](x: Self) {
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    inline def setDeviceId(value: DeviceId): Self = StObject.set(x, "DeviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "DeviceId", js.undefined)
    
    inline def setDeviceName(value: DeviceName): Self = StObject.set(x, "DeviceName", value.asInstanceOf[js.Any])
    
    inline def setDeviceNameUndefined: Self = StObject.set(x, "DeviceName", js.undefined)
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
  }
}
