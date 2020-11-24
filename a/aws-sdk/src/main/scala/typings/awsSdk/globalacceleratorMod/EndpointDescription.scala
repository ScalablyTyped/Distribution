package typings.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndpointDescription extends js.Object {
  
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
  implicit class EndpointDescriptionOps[Self <: EndpointDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClientIPPreservationEnabled(value: GenericBoolean): Self = this.set("ClientIPPreservationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientIPPreservationEnabled: Self = this.set("ClientIPPreservationEnabled", js.undefined)
    
    @scala.inline
    def setEndpointId(value: GenericString): Self = this.set("EndpointId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpointId: Self = this.set("EndpointId", js.undefined)
    
    @scala.inline
    def setHealthReason(value: GenericString): Self = this.set("HealthReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthReason: Self = this.set("HealthReason", js.undefined)
    
    @scala.inline
    def setHealthState(value: HealthState): Self = this.set("HealthState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthState: Self = this.set("HealthState", js.undefined)
    
    @scala.inline
    def setWeight(value: EndpointWeight): Self = this.set("Weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeight: Self = this.set("Weight", js.undefined)
  }
}
