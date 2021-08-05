package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkInterfacePermissionState extends StObject {
  
  /**
    * The state of the permission.
    */
  var State: js.UndefOr[NetworkInterfacePermissionStateCode] = js.undefined
  
  /**
    * A status message, if applicable.
    */
  var StatusMessage: js.UndefOr[String] = js.undefined
}
object NetworkInterfacePermissionState {
  
  inline def apply(): NetworkInterfacePermissionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkInterfacePermissionState]
  }
  
  extension [Self <: NetworkInterfacePermissionState](x: Self) {
    
    inline def setState(value: NetworkInterfacePermissionStateCode): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
  }
}
