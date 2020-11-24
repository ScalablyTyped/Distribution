package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkAclAssociation extends js.Object {
  
  /**
    * The ID of the association between a network ACL and a subnet.
    */
  var NetworkAclAssociationId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the network ACL.
    */
  var NetworkAclId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the subnet.
    */
  var SubnetId: js.UndefOr[String] = js.native
}
object NetworkAclAssociation {
  
  @scala.inline
  def apply(): NetworkAclAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkAclAssociation]
  }
  
  @scala.inline
  implicit class NetworkAclAssociationOps[Self <: NetworkAclAssociation] (val x: Self) extends AnyVal {
    
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
    def setNetworkAclAssociationId(value: String): Self = this.set("NetworkAclAssociationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkAclAssociationId: Self = this.set("NetworkAclAssociationId", js.undefined)
    
    @scala.inline
    def setNetworkAclId(value: String): Self = this.set("NetworkAclId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkAclId: Self = this.set("NetworkAclId", js.undefined)
    
    @scala.inline
    def setSubnetId(value: String): Self = this.set("SubnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnetId: Self = this.set("SubnetId", js.undefined)
  }
}
