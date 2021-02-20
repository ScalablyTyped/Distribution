package typings.awsSdk.worklinkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDeviceResponse extends StObject {
  
  /**
    * The date that the device first signed in to Amazon WorkLink.
    */
  var FirstAccessedTime: js.UndefOr[DateTime] = js.native
  
  /**
    * The date that the device last accessed Amazon WorkLink.
    */
  var LastAccessedTime: js.UndefOr[DateTime] = js.native
  
  /**
    * The manufacturer of the device.
    */
  var Manufacturer: js.UndefOr[DeviceManufacturer] = js.native
  
  /**
    * The model of the device.
    */
  var Model: js.UndefOr[DeviceModel] = js.native
  
  /**
    * The operating system of the device.
    */
  var OperatingSystem: js.UndefOr[DeviceOperatingSystemName] = js.native
  
  /**
    * The operating system version of the device.
    */
  var OperatingSystemVersion: js.UndefOr[DeviceOperatingSystemVersion] = js.native
  
  /**
    * The operating system patch level of the device.
    */
  var PatchLevel: js.UndefOr[DevicePatchLevel] = js.native
  
  /**
    * The current state of the device.
    */
  var Status: js.UndefOr[DeviceStatus] = js.native
  
  /**
    * The user name associated with the device.
    */
  var Username: js.UndefOr[typings.awsSdk.worklinkMod.Username] = js.native
}
object DescribeDeviceResponse {
  
  @scala.inline
  def apply(): DescribeDeviceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDeviceResponse]
  }
  
  @scala.inline
  implicit class DescribeDeviceResponseMutableBuilder[Self <: DescribeDeviceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirstAccessedTime(value: DateTime): Self = StObject.set(x, "FirstAccessedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstAccessedTimeUndefined: Self = StObject.set(x, "FirstAccessedTime", js.undefined)
    
    @scala.inline
    def setLastAccessedTime(value: DateTime): Self = StObject.set(x, "LastAccessedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastAccessedTimeUndefined: Self = StObject.set(x, "LastAccessedTime", js.undefined)
    
    @scala.inline
    def setManufacturer(value: DeviceManufacturer): Self = StObject.set(x, "Manufacturer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManufacturerUndefined: Self = StObject.set(x, "Manufacturer", js.undefined)
    
    @scala.inline
    def setModel(value: DeviceModel): Self = StObject.set(x, "Model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "Model", js.undefined)
    
    @scala.inline
    def setOperatingSystem(value: DeviceOperatingSystemName): Self = StObject.set(x, "OperatingSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatingSystemUndefined: Self = StObject.set(x, "OperatingSystem", js.undefined)
    
    @scala.inline
    def setOperatingSystemVersion(value: DeviceOperatingSystemVersion): Self = StObject.set(x, "OperatingSystemVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatingSystemVersionUndefined: Self = StObject.set(x, "OperatingSystemVersion", js.undefined)
    
    @scala.inline
    def setPatchLevel(value: DevicePatchLevel): Self = StObject.set(x, "PatchLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatchLevelUndefined: Self = StObject.set(x, "PatchLevel", js.undefined)
    
    @scala.inline
    def setStatus(value: DeviceStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setUsername(value: Username): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "Username", js.undefined)
  }
}
