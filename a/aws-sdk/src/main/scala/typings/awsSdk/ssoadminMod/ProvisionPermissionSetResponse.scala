package typings.awsSdk.ssoadminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProvisionPermissionSetResponse extends StObject {
  
  /**
    * The status object for the permission set provisioning operation.
    */
  var PermissionSetProvisioningStatus: js.UndefOr[typings.awsSdk.ssoadminMod.PermissionSetProvisioningStatus] = js.undefined
}
object ProvisionPermissionSetResponse {
  
  @scala.inline
  def apply(): ProvisionPermissionSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisionPermissionSetResponse]
  }
  
  @scala.inline
  implicit class ProvisionPermissionSetResponseMutableBuilder[Self <: ProvisionPermissionSetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPermissionSetProvisioningStatus(value: PermissionSetProvisioningStatus): Self = StObject.set(x, "PermissionSetProvisioningStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionSetProvisioningStatusUndefined: Self = StObject.set(x, "PermissionSetProvisioningStatus", js.undefined)
  }
}
