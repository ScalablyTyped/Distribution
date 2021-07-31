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
  
  @scala.inline
  def apply(): CreateNetworkInterfacePermissionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateNetworkInterfacePermissionResult]
  }
  
  @scala.inline
  implicit class CreateNetworkInterfacePermissionResultMutableBuilder[Self <: CreateNetworkInterfacePermissionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInterfacePermission(value: NetworkInterfacePermission): Self = StObject.set(x, "InterfacePermission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterfacePermissionUndefined: Self = StObject.set(x, "InterfacePermission", js.undefined)
  }
}
