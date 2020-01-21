package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateVpcPeeringAuthorizationOutput extends js.Object {
  /**
    * Details on the requested VPC peering authorization, including expiration.
    */
  var VpcPeeringAuthorization: js.UndefOr[typings.awsSdk.gameliftMod.VpcPeeringAuthorization] = js.native
}

object CreateVpcPeeringAuthorizationOutput {
  @scala.inline
  def apply(VpcPeeringAuthorization: VpcPeeringAuthorization = null): CreateVpcPeeringAuthorizationOutput = {
    val __obj = js.Dynamic.literal()
    if (VpcPeeringAuthorization != null) __obj.updateDynamic("VpcPeeringAuthorization")(VpcPeeringAuthorization.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVpcPeeringAuthorizationOutput]
  }
}

