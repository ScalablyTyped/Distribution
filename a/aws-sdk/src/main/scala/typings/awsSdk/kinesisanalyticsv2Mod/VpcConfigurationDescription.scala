package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcConfigurationDescription extends js.Object {
  /**
    * The array of SecurityGroup IDs used by the VPC configuration.
    */
  var SecurityGroupIds: typings.awsSdk.kinesisanalyticsv2Mod.SecurityGroupIds = js.native
  /**
    * The array of Subnet IDs used by the VPC configuration.
    */
  var SubnetIds: typings.awsSdk.kinesisanalyticsv2Mod.SubnetIds = js.native
  /**
    * The ID of the VPC configuration.
    */
  var VpcConfigurationId: Id = js.native
  /**
    * The ID of the associated VPC.
    */
  var VpcId: typings.awsSdk.kinesisanalyticsv2Mod.VpcId = js.native
}

object VpcConfigurationDescription {
  @scala.inline
  def apply(SecurityGroupIds: SecurityGroupIds, SubnetIds: SubnetIds, VpcConfigurationId: Id, VpcId: VpcId): VpcConfigurationDescription = {
    val __obj = js.Dynamic.literal(SecurityGroupIds = SecurityGroupIds.asInstanceOf[js.Any], SubnetIds = SubnetIds.asInstanceOf[js.Any], VpcConfigurationId = VpcConfigurationId.asInstanceOf[js.Any], VpcId = VpcId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VpcConfigurationDescription]
  }
}

