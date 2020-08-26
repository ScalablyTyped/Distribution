package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBSecurityGroup extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the DB security group.
    */
  var DBSecurityGroupArn: js.UndefOr[String] = js.native
  /**
    * Provides the description of the DB security group.
    */
  var DBSecurityGroupDescription: js.UndefOr[String] = js.native
  /**
    * Specifies the name of the DB security group.
    */
  var DBSecurityGroupName: js.UndefOr[String] = js.native
  /**
    *  Contains a list of EC2SecurityGroup elements. 
    */
  var EC2SecurityGroups: js.UndefOr[EC2SecurityGroupList] = js.native
  /**
    *  Contains a list of IPRange elements. 
    */
  var IPRanges: js.UndefOr[IPRangeList] = js.native
  /**
    * Provides the AWS ID of the owner of a specific DB security group.
    */
  var OwnerId: js.UndefOr[String] = js.native
  /**
    * Provides the VpcId of the DB security group.
    */
  var VpcId: js.UndefOr[String] = js.native
}

object DBSecurityGroup {
  @scala.inline
  def apply(): DBSecurityGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBSecurityGroup]
  }
  @scala.inline
  implicit class DBSecurityGroupOps[Self <: DBSecurityGroup] (val x: Self) extends AnyVal {
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
    def setDBSecurityGroupArn(value: String): Self = this.set("DBSecurityGroupArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBSecurityGroupArn: Self = this.set("DBSecurityGroupArn", js.undefined)
    @scala.inline
    def setDBSecurityGroupDescription(value: String): Self = this.set("DBSecurityGroupDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBSecurityGroupDescription: Self = this.set("DBSecurityGroupDescription", js.undefined)
    @scala.inline
    def setDBSecurityGroupName(value: String): Self = this.set("DBSecurityGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBSecurityGroupName: Self = this.set("DBSecurityGroupName", js.undefined)
    @scala.inline
    def setEC2SecurityGroupsVarargs(value: EC2SecurityGroup*): Self = this.set("EC2SecurityGroups", js.Array(value :_*))
    @scala.inline
    def setEC2SecurityGroups(value: EC2SecurityGroupList): Self = this.set("EC2SecurityGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEC2SecurityGroups: Self = this.set("EC2SecurityGroups", js.undefined)
    @scala.inline
    def setIPRangesVarargs(value: IPRange*): Self = this.set("IPRanges", js.Array(value :_*))
    @scala.inline
    def setIPRanges(value: IPRangeList): Self = this.set("IPRanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIPRanges: Self = this.set("IPRanges", js.undefined)
    @scala.inline
    def setOwnerId(value: String): Self = this.set("OwnerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwnerId: Self = this.set("OwnerId", js.undefined)
    @scala.inline
    def setVpcId(value: String): Self = this.set("VpcId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcId: Self = this.set("VpcId", js.undefined)
  }
  
}

