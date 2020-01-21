package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VPCConfig extends js.Object {
  /**
    * A boolean indicating whether to assign a public IP address.
    */
  var assignPublicIp: js.UndefOr[Boolean] = js.native
  /**
    * A list of one or more security groups IDs in your VPC.
    */
  var securityGroups: js.UndefOr[SecurityGroups] = js.native
  /**
    * A list of one or more subnet IDs in your VPC.
    */
  var subnets: Subnets = js.native
}

object VPCConfig {
  @scala.inline
  def apply(
    subnets: Subnets,
    assignPublicIp: js.UndefOr[scala.Boolean] = js.undefined,
    securityGroups: SecurityGroups = null
  ): VPCConfig = {
    val __obj = js.Dynamic.literal(subnets = subnets.asInstanceOf[js.Any])
    if (!js.isUndefined(assignPublicIp)) __obj.updateDynamic("assignPublicIp")(assignPublicIp.asInstanceOf[js.Any])
    if (securityGroups != null) __obj.updateDynamic("securityGroups")(securityGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[VPCConfig]
  }
}

