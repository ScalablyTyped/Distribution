package typings.awsSdk.panoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDeviceMetadataResponse extends StObject {
  
  /**
    * The device's ID.
    */
  var DeviceId: js.UndefOr[typings.awsSdk.panoramaMod.DeviceId] = js.undefined
}
object UpdateDeviceMetadataResponse {
  
  inline def apply(): UpdateDeviceMetadataResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDeviceMetadataResponse]
  }
  
  extension [Self <: UpdateDeviceMetadataResponse](x: Self) {
    
    inline def setDeviceId(value: DeviceId): Self = StObject.set(x, "DeviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "DeviceId", js.undefined)
  }
}
