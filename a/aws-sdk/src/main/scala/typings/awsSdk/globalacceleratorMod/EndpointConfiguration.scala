package typings.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndpointConfiguration extends js.Object {
  /**
    * Indicates whether client IP address preservation is enabled for an Application Load Balancer endpoint. The value is true or false. The default value is true for new accelerators.  If the value is set to true, the client's IP address is preserved in the X-Forwarded-For request header as traffic travels to applications on the Application Load Balancer endpoint fronted by the accelerator. For more information, see  Preserve Client IP Addresses in AWS Global Accelerator in the AWS Global Accelerator Developer Guide.
    */
  var ClientIPPreservationEnabled: js.UndefOr[GenericBoolean] = js.native
  /**
    * An ID for the endpoint. If the endpoint is a Network Load Balancer or Application Load Balancer, this is the Amazon Resource Name (ARN) of the resource. If the endpoint is an Elastic IP address, this is the Elastic IP address allocation ID. For EC2 instances, this is the EC2 instance ID.  An Application Load Balancer can be either internal or internet-facing.
    */
  var EndpointId: js.UndefOr[GenericString] = js.native
  /**
    * The weight associated with the endpoint. When you add weights to endpoints, you configure AWS Global Accelerator to route traffic based on proportions that you specify. For example, you might specify endpoint weights of 4, 5, 5, and 6 (sum=20). The result is that 4/20 of your traffic, on average, is routed to the first endpoint, 5/20 is routed both to the second and third endpoints, and 6/20 is routed to the last endpoint. For more information, see Endpoint Weights in the AWS Global Accelerator Developer Guide.
    */
  var Weight: js.UndefOr[EndpointWeight] = js.native
}

object EndpointConfiguration {
  @scala.inline
  def apply(): EndpointConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointConfiguration]
  }
  @scala.inline
  implicit class EndpointConfigurationOps[Self <: EndpointConfiguration] (val x: Self) extends AnyVal {
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
    def setWeight(value: EndpointWeight): Self = this.set("Weight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeight: Self = this.set("Weight", js.undefined)
  }
  
}

