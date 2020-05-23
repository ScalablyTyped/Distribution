package typings.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcConfiguration extends js.Object {
  /**
    * The ARN of the IAM role that you want the delivery stream to use to create endpoints in the destination VPC.
    */
  var RoleARN: typings.awsSdk.firehoseMod.RoleARN = js.native
  /**
    * The IDs of the security groups that you want Kinesis Data Firehose to use when it creates ENIs in the VPC of the Amazon ES destination.
    */
  var SecurityGroupIds: SecurityGroupIdList = js.native
  /**
    * The IDs of the subnets that you want Kinesis Data Firehose to use to create ENIs in the VPC of the Amazon ES destination. Make sure that the routing tables and inbound and outbound rules allow traffic to flow from the subnets whose IDs are specified here to the subnets that have the destination Amazon ES endpoints. Kinesis Data Firehose creates at least one ENI in each of the subnets that are specified here. Do not delete or modify these ENIs. The number of ENIs that Kinesis Data Firehose creates in the subnets specified here scales up and down automatically based on throughput. To enable Kinesis Data Firehose to scale up the number of ENIs to match throughput, ensure that you have sufficient quota. To help you calculate the quota you need, assume that Kinesis Data Firehose can create up to three ENIs for this delivery stream for each of the subnets specified here. For more information about ENI quota, see Network Interfaces  in the Amazon VPC Quotas topic.
    */
  var SubnetIds: SubnetIdList = js.native
}

object VpcConfiguration {
  @scala.inline
  def apply(RoleARN: RoleARN, SecurityGroupIds: SecurityGroupIdList, SubnetIds: SubnetIdList): VpcConfiguration = {
    val __obj = js.Dynamic.literal(RoleARN = RoleARN.asInstanceOf[js.Any], SecurityGroupIds = SecurityGroupIds.asInstanceOf[js.Any], SubnetIds = SubnetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcConfiguration]
  }
}

