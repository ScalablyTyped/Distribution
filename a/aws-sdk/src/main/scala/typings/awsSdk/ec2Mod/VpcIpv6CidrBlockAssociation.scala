package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VpcIpv6CidrBlockAssociation extends js.Object {
  
  /**
    * The association ID for the IPv6 CIDR block.
    */
  var AssociationId: js.UndefOr[String] = js.native
  
  /**
    * The IPv6 CIDR block.
    */
  var Ipv6CidrBlock: js.UndefOr[String] = js.native
  
  /**
    * Information about the state of the CIDR block.
    */
  var Ipv6CidrBlockState: js.UndefOr[VpcCidrBlockState] = js.native
  
  /**
    * The ID of the IPv6 address pool from which the IPv6 CIDR block is allocated.
    */
  var Ipv6Pool: js.UndefOr[String] = js.native
  
  /**
    * The name of the unique set of Availability Zones, Local Zones, or Wavelength Zones from which AWS advertises IP addresses, for example, us-east-1-wl1-bos-wlz-1.
    */
  var NetworkBorderGroup: js.UndefOr[String] = js.native
}
object VpcIpv6CidrBlockAssociation {
  
  @scala.inline
  def apply(): VpcIpv6CidrBlockAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcIpv6CidrBlockAssociation]
  }
  
  @scala.inline
  implicit class VpcIpv6CidrBlockAssociationOps[Self <: VpcIpv6CidrBlockAssociation] (val x: Self) extends AnyVal {
    
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
    def setAssociationId(value: String): Self = this.set("AssociationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssociationId: Self = this.set("AssociationId", js.undefined)
    
    @scala.inline
    def setIpv6CidrBlock(value: String): Self = this.set("Ipv6CidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpv6CidrBlock: Self = this.set("Ipv6CidrBlock", js.undefined)
    
    @scala.inline
    def setIpv6CidrBlockState(value: VpcCidrBlockState): Self = this.set("Ipv6CidrBlockState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpv6CidrBlockState: Self = this.set("Ipv6CidrBlockState", js.undefined)
    
    @scala.inline
    def setIpv6Pool(value: String): Self = this.set("Ipv6Pool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpv6Pool: Self = this.set("Ipv6Pool", js.undefined)
    
    @scala.inline
    def setNetworkBorderGroup(value: String): Self = this.set("NetworkBorderGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkBorderGroup: Self = this.set("NetworkBorderGroup", js.undefined)
  }
}
