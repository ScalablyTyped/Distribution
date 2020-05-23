package typings.awsSdk.syntheticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcConfigOutput extends js.Object {
  /**
    * The IDs of the security groups for this canary.
    */
  var SecurityGroupIds: js.UndefOr[typings.awsSdk.syntheticsMod.SecurityGroupIds] = js.native
  /**
    * The IDs of the subnets where this canary is to run.
    */
  var SubnetIds: js.UndefOr[typings.awsSdk.syntheticsMod.SubnetIds] = js.native
  /**
    * The IDs of the VPC where this canary is to run.
    */
  var VpcId: js.UndefOr[typings.awsSdk.syntheticsMod.VpcId] = js.native
}

object VpcConfigOutput {
  @scala.inline
  def apply(SecurityGroupIds: SecurityGroupIds = null, SubnetIds: SubnetIds = null, VpcId: VpcId = null): VpcConfigOutput = {
    val __obj = js.Dynamic.literal()
    if (SecurityGroupIds != null) __obj.updateDynamic("SecurityGroupIds")(SecurityGroupIds.asInstanceOf[js.Any])
    if (SubnetIds != null) __obj.updateDynamic("SubnetIds")(SubnetIds.asInstanceOf[js.Any])
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcConfigOutput]
  }
}

