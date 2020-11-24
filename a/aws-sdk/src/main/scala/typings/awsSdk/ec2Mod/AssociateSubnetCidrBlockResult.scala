package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociateSubnetCidrBlockResult extends js.Object {
  
  /**
    * Information about the IPv6 CIDR block association.
    */
  var Ipv6CidrBlockAssociation: js.UndefOr[SubnetIpv6CidrBlockAssociation] = js.native
  
  /**
    * The ID of the subnet.
    */
  var SubnetId: js.UndefOr[String] = js.native
}
object AssociateSubnetCidrBlockResult {
  
  @scala.inline
  def apply(): AssociateSubnetCidrBlockResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateSubnetCidrBlockResult]
  }
  
  @scala.inline
  implicit class AssociateSubnetCidrBlockResultOps[Self <: AssociateSubnetCidrBlockResult] (val x: Self) extends AnyVal {
    
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
    def setIpv6CidrBlockAssociation(value: SubnetIpv6CidrBlockAssociation): Self = this.set("Ipv6CidrBlockAssociation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpv6CidrBlockAssociation: Self = this.set("Ipv6CidrBlockAssociation", js.undefined)
    
    @scala.inline
    def setSubnetId(value: String): Self = this.set("SubnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnetId: Self = this.set("SubnetId", js.undefined)
  }
}
