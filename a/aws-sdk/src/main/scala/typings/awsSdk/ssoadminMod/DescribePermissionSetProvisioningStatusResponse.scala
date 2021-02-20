package typings.awsSdk.ssoadminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribePermissionSetProvisioningStatusResponse extends StObject {
  
  /**
    * The status object for the permission set provisioning operation.
    */
  var PermissionSetProvisioningStatus: js.UndefOr[typings.awsSdk.ssoadminMod.PermissionSetProvisioningStatus] = js.native
}
object DescribePermissionSetProvisioningStatusResponse {
  
  @scala.inline
  def apply(): DescribePermissionSetProvisioningStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePermissionSetProvisioningStatusResponse]
  }
  
  @scala.inline
  implicit class DescribePermissionSetProvisioningStatusResponseMutableBuilder[Self <: DescribePermissionSetProvisioningStatusResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPermissionSetProvisioningStatus(value: PermissionSetProvisioningStatus): Self = StObject.set(x, "PermissionSetProvisioningStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionSetProvisioningStatusUndefined: Self = StObject.set(x, "PermissionSetProvisioningStatus", js.undefined)
  }
}
