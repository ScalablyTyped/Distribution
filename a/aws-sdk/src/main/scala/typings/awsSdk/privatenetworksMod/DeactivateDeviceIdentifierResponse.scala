package typings.awsSdk.privatenetworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeactivateDeviceIdentifierResponse extends StObject {
  
  /**
    * Information about the device identifier.
    */
  var deviceIdentifier: DeviceIdentifier
}
object DeactivateDeviceIdentifierResponse {
  
  inline def apply(deviceIdentifier: DeviceIdentifier): DeactivateDeviceIdentifierResponse = {
    val __obj = js.Dynamic.literal(deviceIdentifier = deviceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeactivateDeviceIdentifierResponse]
  }
  
  extension [Self <: DeactivateDeviceIdentifierResponse](x: Self) {
    
    inline def setDeviceIdentifier(value: DeviceIdentifier): Self = StObject.set(x, "deviceIdentifier", value.asInstanceOf[js.Any])
  }
}
