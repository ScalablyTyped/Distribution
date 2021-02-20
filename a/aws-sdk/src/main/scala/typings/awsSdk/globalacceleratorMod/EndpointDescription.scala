package typings.awsSdk.globalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndpointDescription extends StObject {
  
  /**
    * Indicates whether client IP address preservation is enabled for an Application Load Balancer endpoint. The value is true or false. The default value is true for new accelerators.  If the value is set to true, the client's IP address is preserved in the X-Forwarded-For request header as traffic travels to applications on the Application Load Balancer endpoint fronted by the accelerator. For more information, see  Viewing Client IP Addresses in AWS Global Accelerator in the AWS Global Accelerator Developer Guide.
    */
  var ClientIPPreservationEnabled: js.UndefOr[GenericBoolean] = js.native
  
  /**
    * An ID for the endpoint. If the endpoint is a Network Load Balancer or Application Load Balancer, this is the Amazon Resource Name (ARN) of the resource. If the endpoint is an Elastic IP address, this is the Elastic IP address allocation ID. For EC2 instances, this is the EC2 instance ID.  An Application Load Balancer can be either internal or internet-facing.
    */
  var EndpointId: js.UndefOr[GenericString] = js.native
  
  /**
    * The reason code associated with why the endpoint is not healthy. If the endpoint state is healthy, a reason code is not provided. If the endpoint state is unhealthy, the reason code can be one of the following values:    Timeout: The health check requests to the endpoint are timing out before returning a status.    Failed: The health check failed, for example because the endpoint response was invalid (malformed).   If the endpoint state is initial, the reason code can be one of the following values:    ProvisioningInProgress: The endpoint is in the process of being provisioned.    InitialHealthChecking: Global Accelerator is still setting up the minimum number of health checks for the endpoint that are required to determine its health status.  
    */
  var HealthReason: js.UndefOr[GenericString] = js.native
  
  /**
    * The health status of the endpoint.
    */
  var HealthState: js.UndefOr[typings.awsSdk.globalacceleratorMod.HealthState] = js.native
  
  /**
    * The weight associated with the endpoint. When you add weights to endpoints, you configure AWS Global Accelerator to route traffic based on proportions that you specify. For example, you might specify endpoint weights of 4, 5, 5, and 6 (sum=20). The result is that 4/20 of your traffic, on average, is routed to the first endpoint, 5/20 is routed both to the second and third endpoints, and 6/20 is routed to the last endpoint. For more information, see Endpoint Weights in the AWS Global Accelerator Developer Guide. 
    */
  var Weight: js.UndefOr[EndpointWeight] = js.native
}
object EndpointDescription {
  
  @scala.inline
  def apply(): EndpointDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointDescription]
  }
  
  @scala.inline
  implicit class EndpointDescriptionMutableBuilder[Self <: EndpointDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientIPPreservationEnabled(value: GenericBoolean): Self = StObject.set(x, "ClientIPPreservationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIPPreservationEnabledUndefined: Self = StObject.set(x, "ClientIPPreservationEnabled", js.undefined)
    
    @scala.inline
    def setEndpointId(value: GenericString): Self = StObject.set(x, "EndpointId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointIdUndefined: Self = StObject.set(x, "EndpointId", js.undefined)
    
    @scala.inline
    def setHealthReason(value: GenericString): Self = StObject.set(x, "HealthReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthReasonUndefined: Self = StObject.set(x, "HealthReason", js.undefined)
    
    @scala.inline
    def setHealthState(value: HealthState): Self = StObject.set(x, "HealthState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthStateUndefined: Self = StObject.set(x, "HealthState", js.undefined)
    
    @scala.inline
    def setWeight(value: EndpointWeight): Self = StObject.set(x, "Weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightUndefined: Self = StObject.set(x, "Weight", js.undefined)
  }
}
