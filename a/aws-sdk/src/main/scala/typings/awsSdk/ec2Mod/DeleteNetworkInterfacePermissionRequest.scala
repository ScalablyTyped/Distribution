package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteNetworkInterfacePermissionRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specify true to remove the permission even if the network interface is attached to an instance.
    */
  var Force: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the network interface permission.
    */
  var NetworkInterfacePermissionId: typings.awsSdk.ec2Mod.NetworkInterfacePermissionId
}
object DeleteNetworkInterfacePermissionRequest {
  
  @scala.inline
  def apply(NetworkInterfacePermissionId: NetworkInterfacePermissionId): DeleteNetworkInterfacePermissionRequest = {
    val __obj = js.Dynamic.literal(NetworkInterfacePermissionId = NetworkInterfacePermissionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteNetworkInterfacePermissionRequest]
  }
  
  @scala.inline
  implicit class DeleteNetworkInterfacePermissionRequestMutableBuilder[Self <: DeleteNetworkInterfacePermissionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setForce(value: Boolean): Self = StObject.set(x, "Force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceUndefined: Self = StObject.set(x, "Force", js.undefined)
    
    @scala.inline
    def setNetworkInterfacePermissionId(value: NetworkInterfacePermissionId): Self = StObject.set(x, "NetworkInterfacePermissionId", value.asInstanceOf[js.Any])
  }
}
