package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VPCConfigResponse extends js.Object {
  /**
    * A boolean indicating if a public IP was assigned.
    */
  var assignPublicIp: js.UndefOr[Boolean] = js.native
  /**
    * A list of security group IDs associated with the simulation job.
    */
  var securityGroups: js.UndefOr[SecurityGroups] = js.native
  /**
    * A list of subnet IDs associated with the simulation job.
    */
  var subnets: js.UndefOr[Subnets] = js.native
  /**
    * The VPC ID associated with your simulation job.
    */
  var vpcId: js.UndefOr[GenericString] = js.native
}

object VPCConfigResponse {
  @scala.inline
  def apply(
    assignPublicIp: js.UndefOr[Boolean] = js.undefined,
    securityGroups: SecurityGroups = null,
    subnets: Subnets = null,
    vpcId: GenericString = null
  ): VPCConfigResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(assignPublicIp)) __obj.updateDynamic("assignPublicIp")(assignPublicIp.get.asInstanceOf[js.Any])
    if (securityGroups != null) __obj.updateDynamic("securityGroups")(securityGroups.asInstanceOf[js.Any])
    if (subnets != null) __obj.updateDynamic("subnets")(subnets.asInstanceOf[js.Any])
    if (vpcId != null) __obj.updateDynamic("vpcId")(vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VPCConfigResponse]
  }
}

