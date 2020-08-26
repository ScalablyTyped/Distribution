package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBSubnetGroup extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the DB subnet group.
    */
  var DBSubnetGroupArn: js.UndefOr[String] = js.native
  /**
    * Provides the description of the DB subnet group.
    */
  var DBSubnetGroupDescription: js.UndefOr[String] = js.native
  /**
    * The name of the DB subnet group.
    */
  var DBSubnetGroupName: js.UndefOr[String] = js.native
  /**
    * Provides the status of the DB subnet group.
    */
  var SubnetGroupStatus: js.UndefOr[String] = js.native
  /**
    *  Contains a list of Subnet elements. 
    */
  var Subnets: js.UndefOr[SubnetList] = js.native
  /**
    * Provides the VpcId of the DB subnet group.
    */
  var VpcId: js.UndefOr[String] = js.native
}

object DBSubnetGroup {
  @scala.inline
  def apply(): DBSubnetGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBSubnetGroup]
  }
  @scala.inline
  implicit class DBSubnetGroupOps[Self <: DBSubnetGroup] (val x: Self) extends AnyVal {
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
    def setDBSubnetGroupArn(value: String): Self = this.set("DBSubnetGroupArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBSubnetGroupArn: Self = this.set("DBSubnetGroupArn", js.undefined)
    @scala.inline
    def setDBSubnetGroupDescription(value: String): Self = this.set("DBSubnetGroupDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBSubnetGroupDescription: Self = this.set("DBSubnetGroupDescription", js.undefined)
    @scala.inline
    def setDBSubnetGroupName(value: String): Self = this.set("DBSubnetGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBSubnetGroupName: Self = this.set("DBSubnetGroupName", js.undefined)
    @scala.inline
    def setSubnetGroupStatus(value: String): Self = this.set("SubnetGroupStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubnetGroupStatus: Self = this.set("SubnetGroupStatus", js.undefined)
    @scala.inline
    def setSubnetsVarargs(value: Subnet*): Self = this.set("Subnets", js.Array(value :_*))
    @scala.inline
    def setSubnets(value: SubnetList): Self = this.set("Subnets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubnets: Self = this.set("Subnets", js.undefined)
    @scala.inline
    def setVpcId(value: String): Self = this.set("VpcId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcId: Self = this.set("VpcId", js.undefined)
  }
  
}

