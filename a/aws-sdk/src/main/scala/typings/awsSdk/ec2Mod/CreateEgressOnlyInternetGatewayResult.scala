package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateEgressOnlyInternetGatewayResult extends js.Object {
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var ClientToken: js.UndefOr[String] = js.native
  /**
    * Information about the egress-only internet gateway.
    */
  var EgressOnlyInternetGateway: js.UndefOr[typings.awsSdk.ec2Mod.EgressOnlyInternetGateway] = js.native
}

object CreateEgressOnlyInternetGatewayResult {
  @scala.inline
  def apply(ClientToken: String = null, EgressOnlyInternetGateway: EgressOnlyInternetGateway = null): CreateEgressOnlyInternetGatewayResult = {
    val __obj = js.Dynamic.literal()
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken.asInstanceOf[js.Any])
    if (EgressOnlyInternetGateway != null) __obj.updateDynamic("EgressOnlyInternetGateway")(EgressOnlyInternetGateway.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEgressOnlyInternetGatewayResult]
  }
}

