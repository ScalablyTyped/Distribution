package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceFleetSummary extends StObject {
  
  /**
    * Timestamp of when the device fleet was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Amazon Resource Name (ARN) of the device fleet.
    */
  var DeviceFleetArn: typings.awsSdk.sagemakerMod.DeviceFleetArn
  
  /**
    * Name of the device fleet.
    */
  var DeviceFleetName: EntityName
  
  /**
    * Timestamp of when the device fleet was last updated.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
}
object DeviceFleetSummary {
  
  inline def apply(DeviceFleetArn: DeviceFleetArn, DeviceFleetName: EntityName): DeviceFleetSummary = {
    val __obj = js.Dynamic.literal(DeviceFleetArn = DeviceFleetArn.asInstanceOf[js.Any], DeviceFleetName = DeviceFleetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceFleetSummary]
  }
  
  extension [Self <: DeviceFleetSummary](x: Self) {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDeviceFleetArn(value: DeviceFleetArn): Self = StObject.set(x, "DeviceFleetArn", value.asInstanceOf[js.Any])
    
    inline def setDeviceFleetName(value: EntityName): Self = StObject.set(x, "DeviceFleetName", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
  }
}
