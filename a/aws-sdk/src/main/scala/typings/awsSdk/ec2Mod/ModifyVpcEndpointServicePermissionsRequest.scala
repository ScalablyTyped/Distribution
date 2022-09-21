package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyVpcEndpointServicePermissionsRequest extends StObject {
  
  /**
    * The Amazon Resource Names (ARN) of one or more principals. Permissions are granted to the principals in this list. To grant permissions to all principals, specify an asterisk (*).
    */
  var AddAllowedPrincipals: js.UndefOr[ValueStringList] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Amazon Resource Names (ARN) of one or more principals. Permissions are revoked for principals in this list.
    */
  var RemoveAllowedPrincipals: js.UndefOr[ValueStringList] = js.undefined
  
  /**
    * The ID of the service.
    */
  var ServiceId: VpcEndpointServiceId
}
object ModifyVpcEndpointServicePermissionsRequest {
  
  inline def apply(ServiceId: VpcEndpointServiceId): ModifyVpcEndpointServicePermissionsRequest = {
    val __obj = js.Dynamic.literal(ServiceId = ServiceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyVpcEndpointServicePermissionsRequest]
  }
  
  extension [Self <: ModifyVpcEndpointServicePermissionsRequest](x: Self) {
    
    inline def setAddAllowedPrincipals(value: ValueStringList): Self = StObject.set(x, "AddAllowedPrincipals", value.asInstanceOf[js.Any])
    
    inline def setAddAllowedPrincipalsUndefined: Self = StObject.set(x, "AddAllowedPrincipals", js.undefined)
    
    inline def setAddAllowedPrincipalsVarargs(value: String*): Self = StObject.set(x, "AddAllowedPrincipals", js.Array(value*))
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setRemoveAllowedPrincipals(value: ValueStringList): Self = StObject.set(x, "RemoveAllowedPrincipals", value.asInstanceOf[js.Any])
    
    inline def setRemoveAllowedPrincipalsUndefined: Self = StObject.set(x, "RemoveAllowedPrincipals", js.undefined)
    
    inline def setRemoveAllowedPrincipalsVarargs(value: String*): Self = StObject.set(x, "RemoveAllowedPrincipals", js.Array(value*))
    
    inline def setServiceId(value: VpcEndpointServiceId): Self = StObject.set(x, "ServiceId", value.asInstanceOf[js.Any])
  }
}
