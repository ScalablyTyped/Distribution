package typings.awsSdk.daxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubnetGroup extends js.Object {
  
  /**
    * The description of the subnet group.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * The name of the subnet group.
    */
  var SubnetGroupName: js.UndefOr[String] = js.native
  
  /**
    * A list of subnets associated with the subnet group. 
    */
  var Subnets: js.UndefOr[SubnetList] = js.native
  
  /**
    * The Amazon Virtual Private Cloud identifier (VPC ID) of the subnet group.
    */
  var VpcId: js.UndefOr[String] = js.native
}
object SubnetGroup {
  
  @scala.inline
  def apply(): SubnetGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubnetGroup]
  }
  
  @scala.inline
  implicit class SubnetGroupOps[Self <: SubnetGroup] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setSubnetGroupName(value: String): Self = this.set("SubnetGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnetGroupName: Self = this.set("SubnetGroupName", js.undefined)
    
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
