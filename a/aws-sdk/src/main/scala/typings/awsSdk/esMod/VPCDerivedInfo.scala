package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VPCDerivedInfo extends js.Object {
  /**
    * The availability zones for the Elasticsearch domain. Exists only if the domain was created with VPCOptions.
    */
  var AvailabilityZones: js.UndefOr[StringList] = js.native
  /**
    * Specifies the security groups for VPC endpoint.
    */
  var SecurityGroupIds: js.UndefOr[StringList] = js.native
  /**
    * Specifies the subnets for VPC endpoint.
    */
  var SubnetIds: js.UndefOr[StringList] = js.native
  /**
    * The VPC Id for the Elasticsearch domain. Exists only if the domain was created with VPCOptions.
    */
  var VPCId: js.UndefOr[String] = js.native
}

object VPCDerivedInfo {
  @scala.inline
  def apply(
    AvailabilityZones: StringList = null,
    SecurityGroupIds: StringList = null,
    SubnetIds: StringList = null,
    VPCId: String = null
  ): VPCDerivedInfo = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityZones != null) __obj.updateDynamic("AvailabilityZones")(AvailabilityZones.asInstanceOf[js.Any])
    if (SecurityGroupIds != null) __obj.updateDynamic("SecurityGroupIds")(SecurityGroupIds.asInstanceOf[js.Any])
    if (SubnetIds != null) __obj.updateDynamic("SubnetIds")(SubnetIds.asInstanceOf[js.Any])
    if (VPCId != null) __obj.updateDynamic("VPCId")(VPCId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VPCDerivedInfo]
  }
}

