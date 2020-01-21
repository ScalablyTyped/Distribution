package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateVpcEndpointServiceConfigurationResult extends js.Object {
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var ClientToken: js.UndefOr[String] = js.native
  /**
    * Information about the service configuration.
    */
  var ServiceConfiguration: js.UndefOr[typings.awsSdk.ec2Mod.ServiceConfiguration] = js.native
}

object CreateVpcEndpointServiceConfigurationResult {
  @scala.inline
  def apply(ClientToken: String = null, ServiceConfiguration: ServiceConfiguration = null): CreateVpcEndpointServiceConfigurationResult = {
    val __obj = js.Dynamic.literal()
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken.asInstanceOf[js.Any])
    if (ServiceConfiguration != null) __obj.updateDynamic("ServiceConfiguration")(ServiceConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVpcEndpointServiceConfigurationResult]
  }
}

