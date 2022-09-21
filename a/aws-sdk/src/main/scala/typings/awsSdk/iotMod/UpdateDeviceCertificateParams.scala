package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDeviceCertificateParams extends StObject {
  
  /**
    * The action that you want to apply to the device certificate. The only supported value is DEACTIVATE.
    */
  var action: DeviceCertificateUpdateAction
}
object UpdateDeviceCertificateParams {
  
  inline def apply(action: DeviceCertificateUpdateAction): UpdateDeviceCertificateParams = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDeviceCertificateParams]
  }
  
  extension [Self <: UpdateDeviceCertificateParams](x: Self) {
    
    inline def setAction(value: DeviceCertificateUpdateAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
  }
}
