package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartVpcEndpointServicePrivateDnsVerificationRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The ID of the endpoint service.
    */
  var ServiceId: VpcEndpointServiceId = js.native
}
object StartVpcEndpointServicePrivateDnsVerificationRequest {
  
  @scala.inline
  def apply(ServiceId: VpcEndpointServiceId): StartVpcEndpointServicePrivateDnsVerificationRequest = {
    val __obj = js.Dynamic.literal(ServiceId = ServiceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartVpcEndpointServicePrivateDnsVerificationRequest]
  }
  
  @scala.inline
  implicit class StartVpcEndpointServicePrivateDnsVerificationRequestMutableBuilder[Self <: StartVpcEndpointServicePrivateDnsVerificationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setServiceId(value: VpcEndpointServiceId): Self = StObject.set(x, "ServiceId", value.asInstanceOf[js.Any])
  }
}
