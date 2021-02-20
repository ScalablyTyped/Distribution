package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkInterfacePermission extends StObject {
  
  /**
    * The AWS account ID.
    */
  var AwsAccountId: js.UndefOr[String] = js.native
  
  /**
    * The AWS service.
    */
  var AwsService: js.UndefOr[String] = js.native
  
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the network interface permission.
    */
  var NetworkInterfacePermissionId: js.UndefOr[String] = js.native
  
  /**
    * The type of permission.
    */
  var Permission: js.UndefOr[InterfacePermissionType] = js.native
  
  /**
    * Information about the state of the permission.
    */
  var PermissionState: js.UndefOr[NetworkInterfacePermissionState] = js.native
}
object NetworkInterfacePermission {
  
  @scala.inline
  def apply(): NetworkInterfacePermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkInterfacePermission]
  }
  
  @scala.inline
  implicit class NetworkInterfacePermissionMutableBuilder[Self <: NetworkInterfacePermission] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAwsAccountId(value: String): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsAccountIdUndefined: Self = StObject.set(x, "AwsAccountId", js.undefined)
    
    @scala.inline
    def setAwsService(value: String): Self = StObject.set(x, "AwsService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsServiceUndefined: Self = StObject.set(x, "AwsService", js.undefined)
    
    @scala.inline
    def setNetworkInterfaceId(value: String): Self = StObject.set(x, "NetworkInterfaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkInterfaceIdUndefined: Self = StObject.set(x, "NetworkInterfaceId", js.undefined)
    
    @scala.inline
    def setNetworkInterfacePermissionId(value: String): Self = StObject.set(x, "NetworkInterfacePermissionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkInterfacePermissionIdUndefined: Self = StObject.set(x, "NetworkInterfacePermissionId", js.undefined)
    
    @scala.inline
    def setPermission(value: InterfacePermissionType): Self = StObject.set(x, "Permission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionState(value: NetworkInterfacePermissionState): Self = StObject.set(x, "PermissionState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionStateUndefined: Self = StObject.set(x, "PermissionState", js.undefined)
    
    @scala.inline
    def setPermissionUndefined: Self = StObject.set(x, "Permission", js.undefined)
  }
}
