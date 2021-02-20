package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateNetworkInterfacePermissionRequest extends StObject {
  
  /**
    * The AWS account ID.
    */
  var AwsAccountId: js.UndefOr[String] = js.native
  
  /**
    * The AWS service. Currently not supported.
    */
  var AwsService: js.UndefOr[String] = js.native
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: typings.awsSdk.ec2Mod.NetworkInterfaceId = js.native
  
  /**
    * The type of permission to grant.
    */
  var Permission: InterfacePermissionType = js.native
}
object CreateNetworkInterfacePermissionRequest {
  
  @scala.inline
  def apply(NetworkInterfaceId: NetworkInterfaceId, Permission: InterfacePermissionType): CreateNetworkInterfacePermissionRequest = {
    val __obj = js.Dynamic.literal(NetworkInterfaceId = NetworkInterfaceId.asInstanceOf[js.Any], Permission = Permission.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNetworkInterfacePermissionRequest]
  }
  
  @scala.inline
  implicit class CreateNetworkInterfacePermissionRequestMutableBuilder[Self <: CreateNetworkInterfacePermissionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAwsAccountId(value: String): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsAccountIdUndefined: Self = StObject.set(x, "AwsAccountId", js.undefined)
    
    @scala.inline
    def setAwsService(value: String): Self = StObject.set(x, "AwsService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsServiceUndefined: Self = StObject.set(x, "AwsService", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setNetworkInterfaceId(value: NetworkInterfaceId): Self = StObject.set(x, "NetworkInterfaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermission(value: InterfacePermissionType): Self = StObject.set(x, "Permission", value.asInstanceOf[js.Any])
  }
}
