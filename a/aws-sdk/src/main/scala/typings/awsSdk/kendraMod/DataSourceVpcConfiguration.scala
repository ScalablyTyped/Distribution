package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceVpcConfiguration extends js.Object {
  /**
    * A list of identifiers of security groups within your Amazon VPC. The security groups should enable Amazon Kendra to connect to the data source.
    */
  var SecurityGroupIds: SecurityGroupIdList = js.native
  /**
    * A list of identifiers for subnets within your Amazon VPC. The subnets should be able to connect to each other in the VPC, and they should have outgoing access to the Internet through a NAT device.
    */
  var SubnetIds: SubnetIdList = js.native
}

object DataSourceVpcConfiguration {
  @scala.inline
  def apply(SecurityGroupIds: SecurityGroupIdList, SubnetIds: SubnetIdList): DataSourceVpcConfiguration = {
    val __obj = js.Dynamic.literal(SecurityGroupIds = SecurityGroupIds.asInstanceOf[js.Any], SubnetIds = SubnetIds.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DataSourceVpcConfiguration]
  }
}

