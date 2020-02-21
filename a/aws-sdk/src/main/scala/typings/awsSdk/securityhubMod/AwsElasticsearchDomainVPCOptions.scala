package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsElasticsearchDomainVPCOptions extends js.Object {
  /**
    * The list of Availability Zones associated with the VPC subnets.
    */
  var AvailabilityZones: js.UndefOr[NonEmptyStringList] = js.native
  /**
    * The list of security group IDs associated with the VPC endpoints for the domain.
    */
  var SecurityGroupIds: js.UndefOr[NonEmptyStringList] = js.native
  /**
    * A list of subnet IDs associated with the VPC endpoints for the domain.
    */
  var SubnetIds: js.UndefOr[NonEmptyStringList] = js.native
  /**
    * ID for the VPC.
    */
  var VPCId: js.UndefOr[NonEmptyString] = js.native
}

object AwsElasticsearchDomainVPCOptions {
  @scala.inline
  def apply(
    AvailabilityZones: NonEmptyStringList = null,
    SecurityGroupIds: NonEmptyStringList = null,
    SubnetIds: NonEmptyStringList = null,
    VPCId: NonEmptyString = null
  ): AwsElasticsearchDomainVPCOptions = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityZones != null) __obj.updateDynamic("AvailabilityZones")(AvailabilityZones.asInstanceOf[js.Any])
    if (SecurityGroupIds != null) __obj.updateDynamic("SecurityGroupIds")(SecurityGroupIds.asInstanceOf[js.Any])
    if (SubnetIds != null) __obj.updateDynamic("SubnetIds")(SubnetIds.asInstanceOf[js.Any])
    if (VPCId != null) __obj.updateDynamic("VPCId")(VPCId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsElasticsearchDomainVPCOptions]
  }
}

