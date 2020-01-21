package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcConfiguration extends js.Object {
  /**
    * The array of SecurityGroup IDs used by the VPC configuration.
    */
  var SecurityGroupIds: typings.awsSdk.kinesisanalyticsv2Mod.SecurityGroupIds = js.native
  /**
    * The array of Subnet IDs used by the VPC configuration.
    */
  var SubnetIds: typings.awsSdk.kinesisanalyticsv2Mod.SubnetIds = js.native
}

object VpcConfiguration {
  @scala.inline
  def apply(SecurityGroupIds: SecurityGroupIds, SubnetIds: SubnetIds): VpcConfiguration = {
    val __obj = js.Dynamic.literal(SecurityGroupIds = SecurityGroupIds.asInstanceOf[js.Any], SubnetIds = SubnetIds.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VpcConfiguration]
  }
}

