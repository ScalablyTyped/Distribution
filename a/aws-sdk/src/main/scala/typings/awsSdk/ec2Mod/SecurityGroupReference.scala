package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecurityGroupReference extends js.Object {
  
  /**
    * The ID of your security group.
    */
  var GroupId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the VPC with the referencing security group.
    */
  var ReferencingVpcId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the VPC peering connection.
    */
  var VpcPeeringConnectionId: js.UndefOr[String] = js.native
}
object SecurityGroupReference {
  
  @scala.inline
  def apply(): SecurityGroupReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityGroupReference]
  }
  
  @scala.inline
  implicit class SecurityGroupReferenceOps[Self <: SecurityGroupReference] (val x: Self) extends AnyVal {
    
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
    def setGroupId(value: String): Self = this.set("GroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupId: Self = this.set("GroupId", js.undefined)
    
    @scala.inline
    def setReferencingVpcId(value: String): Self = this.set("ReferencingVpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferencingVpcId: Self = this.set("ReferencingVpcId", js.undefined)
    
    @scala.inline
    def setVpcPeeringConnectionId(value: String): Self = this.set("VpcPeeringConnectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcPeeringConnectionId: Self = this.set("VpcPeeringConnectionId", js.undefined)
  }
}
