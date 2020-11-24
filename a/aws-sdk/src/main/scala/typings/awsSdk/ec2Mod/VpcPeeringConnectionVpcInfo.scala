package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VpcPeeringConnectionVpcInfo extends js.Object {
  
  /**
    * The IPv4 CIDR block for the VPC.
    */
  var CidrBlock: js.UndefOr[String] = js.native
  
  /**
    * Information about the IPv4 CIDR blocks for the VPC.
    */
  var CidrBlockSet: js.UndefOr[typings.awsSdk.ec2Mod.CidrBlockSet] = js.native
  
  /**
    * The IPv6 CIDR block for the VPC.
    */
  var Ipv6CidrBlockSet: js.UndefOr[typings.awsSdk.ec2Mod.Ipv6CidrBlockSet] = js.native
  
  /**
    * The AWS account ID of the VPC owner.
    */
  var OwnerId: js.UndefOr[String] = js.native
  
  /**
    * Information about the VPC peering connection options for the accepter or requester VPC.
    */
  var PeeringOptions: js.UndefOr[VpcPeeringConnectionOptionsDescription] = js.native
  
  /**
    * The Region in which the VPC is located.
    */
  var Region: js.UndefOr[String] = js.native
  
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[String] = js.native
}
object VpcPeeringConnectionVpcInfo {
  
  @scala.inline
  def apply(): VpcPeeringConnectionVpcInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcPeeringConnectionVpcInfo]
  }
  
  @scala.inline
  implicit class VpcPeeringConnectionVpcInfoOps[Self <: VpcPeeringConnectionVpcInfo] (val x: Self) extends AnyVal {
    
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
    def setCidrBlock(value: String): Self = this.set("CidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCidrBlock: Self = this.set("CidrBlock", js.undefined)
    
    @scala.inline
    def setCidrBlockSetVarargs(value: CidrBlock*): Self = this.set("CidrBlockSet", js.Array(value :_*))
    
    @scala.inline
    def setCidrBlockSet(value: CidrBlockSet): Self = this.set("CidrBlockSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCidrBlockSet: Self = this.set("CidrBlockSet", js.undefined)
    
    @scala.inline
    def setIpv6CidrBlockSetVarargs(value: Ipv6CidrBlock*): Self = this.set("Ipv6CidrBlockSet", js.Array(value :_*))
    
    @scala.inline
    def setIpv6CidrBlockSet(value: Ipv6CidrBlockSet): Self = this.set("Ipv6CidrBlockSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpv6CidrBlockSet: Self = this.set("Ipv6CidrBlockSet", js.undefined)
    
    @scala.inline
    def setOwnerId(value: String): Self = this.set("OwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerId: Self = this.set("OwnerId", js.undefined)
    
    @scala.inline
    def setPeeringOptions(value: VpcPeeringConnectionOptionsDescription): Self = this.set("PeeringOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePeeringOptions: Self = this.set("PeeringOptions", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = this.set("Region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("Region", js.undefined)
    
    @scala.inline
    def setVpcId(value: String): Self = this.set("VpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcId: Self = this.set("VpcId", js.undefined)
  }
}
