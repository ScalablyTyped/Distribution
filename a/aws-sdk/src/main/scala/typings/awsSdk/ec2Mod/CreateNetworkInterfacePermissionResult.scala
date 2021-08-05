package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateNetworkInterfacePermissionResult extends StObject {
  
  /**
    * Information about the permission for the network interface.
    */
  var InterfacePermission: js.UndefOr[NetworkInterfacePermission] = js.undefined
}
object CreateNetworkInterfacePermissionResult {
  
  inline def apply(): CreateNetworkInterfacePermissionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateNetworkInterfacePermissionResult]
  }
  
  extension [Self <: CreateNetworkInterfacePermissionResult](x: Self) {
    
    inline def setInterfacePermission(value: NetworkInterfacePermission): Self = StObject.set(x, "InterfacePermission", value.asInstanceOf[js.Any])
    
    inline def setInterfacePermissionUndefined: Self = StObject.set(x, "InterfacePermission", js.undefined)
  }
}
