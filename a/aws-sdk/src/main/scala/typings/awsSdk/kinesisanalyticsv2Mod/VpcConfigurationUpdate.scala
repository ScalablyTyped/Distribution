package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcConfigurationUpdate extends js.Object {
  /**
    * Describes updates to the array of SecurityGroup IDs used by the VPC configuration.
    */
  var SecurityGroupIdUpdates: js.UndefOr[SecurityGroupIds] = js.native
  /**
    * Describes updates to the array of Subnet IDs used by the VPC configuration.
    */
  var SubnetIdUpdates: js.UndefOr[SubnetIds] = js.native
  /**
    * Describes an update to the ID of the VPC configuration.
    */
  var VpcConfigurationId: Id = js.native
}

object VpcConfigurationUpdate {
  @scala.inline
  def apply(VpcConfigurationId: Id): VpcConfigurationUpdate = {
    val __obj = js.Dynamic.literal(VpcConfigurationId = VpcConfigurationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcConfigurationUpdate]
  }
  @scala.inline
  implicit class VpcConfigurationUpdateOps[Self <: VpcConfigurationUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setVpcConfigurationId(value: Id): Self = this.set("VpcConfigurationId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecurityGroupIdUpdatesVarargs(value: SecurityGroupId*): Self = this.set("SecurityGroupIdUpdates", js.Array(value :_*))
    @scala.inline
    def setSecurityGroupIdUpdates(value: SecurityGroupIds): Self = this.set("SecurityGroupIdUpdates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityGroupIdUpdates: Self = this.set("SecurityGroupIdUpdates", js.undefined)
    @scala.inline
    def setSubnetIdUpdatesVarargs(value: SubnetId*): Self = this.set("SubnetIdUpdates", js.Array(value :_*))
    @scala.inline
    def setSubnetIdUpdates(value: SubnetIds): Self = this.set("SubnetIdUpdates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubnetIdUpdates: Self = this.set("SubnetIdUpdates", js.undefined)
  }
  
}

