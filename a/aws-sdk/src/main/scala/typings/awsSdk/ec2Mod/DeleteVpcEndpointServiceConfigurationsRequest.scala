package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteVpcEndpointServiceConfigurationsRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The IDs of one or more services.
    */
  var ServiceIds: VpcEndpointServiceIdList
}
object DeleteVpcEndpointServiceConfigurationsRequest {
  
  @scala.inline
  def apply(ServiceIds: VpcEndpointServiceIdList): DeleteVpcEndpointServiceConfigurationsRequest = {
    val __obj = js.Dynamic.literal(ServiceIds = ServiceIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVpcEndpointServiceConfigurationsRequest]
  }
  
  @scala.inline
  implicit class DeleteVpcEndpointServiceConfigurationsRequestMutableBuilder[Self <: DeleteVpcEndpointServiceConfigurationsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setServiceIds(value: VpcEndpointServiceIdList): Self = StObject.set(x, "ServiceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceIdsVarargs(value: VpcEndpointServiceId*): Self = StObject.set(x, "ServiceIds", js.Array(value :_*))
  }
}
