package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyVpcEndpointServicePayerResponsibilityRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The entity that is responsible for the endpoint costs. The default is the endpoint owner. If you set the payer responsibility to the service owner, you cannot set it back to the endpoint owner.
    */
  var PayerResponsibility: typings.awsSdk.ec2Mod.PayerResponsibility
  
  /**
    * The ID of the service.
    */
  var ServiceId: VpcEndpointServiceId
}
object ModifyVpcEndpointServicePayerResponsibilityRequest {
  
  inline def apply(PayerResponsibility: PayerResponsibility, ServiceId: VpcEndpointServiceId): ModifyVpcEndpointServicePayerResponsibilityRequest = {
    val __obj = js.Dynamic.literal(PayerResponsibility = PayerResponsibility.asInstanceOf[js.Any], ServiceId = ServiceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyVpcEndpointServicePayerResponsibilityRequest]
  }
  
  extension [Self <: ModifyVpcEndpointServicePayerResponsibilityRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setPayerResponsibility(value: PayerResponsibility): Self = StObject.set(x, "PayerResponsibility", value.asInstanceOf[js.Any])
    
    inline def setServiceId(value: VpcEndpointServiceId): Self = StObject.set(x, "ServiceId", value.asInstanceOf[js.Any])
  }
}
