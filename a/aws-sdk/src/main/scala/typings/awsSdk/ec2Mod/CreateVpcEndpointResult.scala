package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateVpcEndpointResult extends js.Object {
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var ClientToken: js.UndefOr[String] = js.native
  /**
    * Information about the endpoint.
    */
  var VpcEndpoint: js.UndefOr[typings.awsSdk.ec2Mod.VpcEndpoint] = js.native
}

object CreateVpcEndpointResult {
  @scala.inline
  def apply(ClientToken: String = null, VpcEndpoint: VpcEndpoint = null): CreateVpcEndpointResult = {
    val __obj = js.Dynamic.literal()
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken.asInstanceOf[js.Any])
    if (VpcEndpoint != null) __obj.updateDynamic("VpcEndpoint")(VpcEndpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVpcEndpointResult]
  }
}

