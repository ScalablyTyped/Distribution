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
  @scala.inline
  implicit class DataSourceVpcConfigurationOps[Self <: DataSourceVpcConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSecurityGroupIdsVarargs(value: VpcSecurityGroupId*): Self = this.set("SecurityGroupIds", js.Array(value :_*))
    @scala.inline
    def setSecurityGroupIds(value: SecurityGroupIdList): Self = this.set("SecurityGroupIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubnetIdsVarargs(value: SubnetId*): Self = this.set("SubnetIds", js.Array(value :_*))
    @scala.inline
    def setSubnetIds(value: SubnetIdList): Self = this.set("SubnetIds", value.asInstanceOf[js.Any])
  }
  
}

