package typings.awsSdk.worklinkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDeviceResponse extends StObject {
  
  /**
    * The date that the device first signed in to Amazon WorkLink.
    */
  var FirstAccessedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date that the device last accessed Amazon WorkLink.
    */
  var LastAccessedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The manufacturer of the device.
    */
  var Manufacturer: js.UndefOr[DeviceManufacturer] = js.undefined
  
  /**
    * The model of the device.
    */
  var Model: js.UndefOr[DeviceModel] = js.undefined
  
  /**
    * The operating system of the device.
    */
  var OperatingSystem: js.UndefOr[DeviceOperatingSystemName] = js.undefined
  
  /**
    * The operating system version of the device.
    */
  var OperatingSystemVersion: js.UndefOr[DeviceOperatingSystemVersion] = js.undefined
  
  /**
    * The operating system patch level of the device.
    */
  var PatchLevel: js.UndefOr[DevicePatchLevel] = js.undefined
  
  /**
    * The current state of the device.
    */
  var Status: js.UndefOr[DeviceStatus] = js.undefined
  
  /**
    * The user name associated with the device.
    */
  var Username: js.UndefOr[typings.awsSdk.worklinkMod.Username] = js.undefined
}
object DescribeDeviceResponse {
  
  inline def apply(): DescribeDeviceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDeviceResponse]
  }
  
  extension [Self <: DescribeDeviceResponse](x: Self) {
    
    inline def setFirstAccessedTime(value: js.Date): Self = StObject.set(x, "FirstAccessedTime", value.asInstanceOf[js.Any])
    
    inline def setFirstAccessedTimeUndefined: Self = StObject.set(x, "FirstAccessedTime", js.undefined)
    
    inline def setLastAccessedTime(value: js.Date): Self = StObject.set(x, "LastAccessedTime", value.asInstanceOf[js.Any])
    
    inline def setLastAccessedTimeUndefined: Self = StObject.set(x, "LastAccessedTime", js.undefined)
    
    inline def setManufacturer(value: DeviceManufacturer): Self = StObject.set(x, "Manufacturer", value.asInstanceOf[js.Any])
    
    inline def setManufacturerUndefined: Self = StObject.set(x, "Manufacturer", js.undefined)
    
    inline def setModel(value: DeviceModel): Self = StObject.set(x, "Model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "Model", js.undefined)
    
    inline def setOperatingSystem(value: DeviceOperatingSystemName): Self = StObject.set(x, "OperatingSystem", value.asInstanceOf[js.Any])
    
    inline def setOperatingSystemUndefined: Self = StObject.set(x, "OperatingSystem", js.undefined)
    
    inline def setOperatingSystemVersion(value: DeviceOperatingSystemVersion): Self = StObject.set(x, "OperatingSystemVersion", value.asInstanceOf[js.Any])
    
    inline def setOperatingSystemVersionUndefined: Self = StObject.set(x, "OperatingSystemVersion", js.undefined)
    
    inline def setPatchLevel(value: DevicePatchLevel): Self = StObject.set(x, "PatchLevel", value.asInstanceOf[js.Any])
    
    inline def setPatchLevelUndefined: Self = StObject.set(x, "PatchLevel", js.undefined)
    
    inline def setStatus(value: DeviceStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setUsername(value: Username): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "Username", js.undefined)
  }
}
