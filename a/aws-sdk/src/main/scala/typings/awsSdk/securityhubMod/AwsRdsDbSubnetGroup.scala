package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsRdsDbSubnetGroup extends js.Object {
  
  /**
    * The ARN of the subnet group.
    */
  var DbSubnetGroupArn: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The description of the subnet group.
    */
  var DbSubnetGroupDescription: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The name of the subnet group.
    */
  var DbSubnetGroupName: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The status of the subnet group.
    */
  var SubnetGroupStatus: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * A list of subnets in the subnet group.
    */
  var Subnets: js.UndefOr[AwsRdsDbSubnetGroupSubnets] = js.native
  
  /**
    * The VPC ID of the subnet group.
    */
  var VpcId: js.UndefOr[NonEmptyString] = js.native
}
object AwsRdsDbSubnetGroup {
  
  @scala.inline
  def apply(): AwsRdsDbSubnetGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRdsDbSubnetGroup]
  }
  
  @scala.inline
  implicit class AwsRdsDbSubnetGroupOps[Self <: AwsRdsDbSubnetGroup] (val x: Self) extends AnyVal {
    
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
    def setDbSubnetGroupArn(value: NonEmptyString): Self = this.set("DbSubnetGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDbSubnetGroupArn: Self = this.set("DbSubnetGroupArn", js.undefined)
    
    @scala.inline
    def setDbSubnetGroupDescription(value: NonEmptyString): Self = this.set("DbSubnetGroupDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDbSubnetGroupDescription: Self = this.set("DbSubnetGroupDescription", js.undefined)
    
    @scala.inline
    def setDbSubnetGroupName(value: NonEmptyString): Self = this.set("DbSubnetGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDbSubnetGroupName: Self = this.set("DbSubnetGroupName", js.undefined)
    
    @scala.inline
    def setSubnetGroupStatus(value: NonEmptyString): Self = this.set("SubnetGroupStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnetGroupStatus: Self = this.set("SubnetGroupStatus", js.undefined)
    
    @scala.inline
    def setSubnetsVarargs(value: AwsRdsDbSubnetGroupSubnet*): Self = this.set("Subnets", js.Array(value :_*))
    
    @scala.inline
    def setSubnets(value: AwsRdsDbSubnetGroupSubnets): Self = this.set("Subnets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnets: Self = this.set("Subnets", js.undefined)
    
    @scala.inline
    def setVpcId(value: NonEmptyString): Self = this.set("VpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcId: Self = this.set("VpcId", js.undefined)
  }
}
