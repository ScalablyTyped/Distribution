package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociateSubnetCidrBlockRequest extends js.Object {
  
  /**
    * The IPv6 CIDR block for your subnet. The subnet must have a /64 prefix length.
    */
  var Ipv6CidrBlock: String = js.native
  
  /**
    * The ID of your subnet.
    */
  var SubnetId: typings.awsSdk.ec2Mod.SubnetId = js.native
}
object AssociateSubnetCidrBlockRequest {
  
  @scala.inline
  def apply(Ipv6CidrBlock: String, SubnetId: SubnetId): AssociateSubnetCidrBlockRequest = {
    val __obj = js.Dynamic.literal(Ipv6CidrBlock = Ipv6CidrBlock.asInstanceOf[js.Any], SubnetId = SubnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateSubnetCidrBlockRequest]
  }
  
  @scala.inline
  implicit class AssociateSubnetCidrBlockRequestOps[Self <: AssociateSubnetCidrBlockRequest] (val x: Self) extends AnyVal {
    
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
    def setIpv6CidrBlock(value: String): Self = this.set("Ipv6CidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetId(value: SubnetId): Self = this.set("SubnetId", value.asInstanceOf[js.Any])
  }
}
