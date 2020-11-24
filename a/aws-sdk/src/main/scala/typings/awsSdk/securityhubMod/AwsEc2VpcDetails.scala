package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsEc2VpcDetails extends js.Object {
  
  /**
    * Information about the IPv4 CIDR blocks associated with the VPC.
    */
  var CidrBlockAssociationSet: js.UndefOr[CidrBlockAssociationList] = js.native
  
  /**
    * The identifier of the set of Dynamic Host Configuration Protocol (DHCP) options that are associated with the VPC. If the default options are associated with the VPC, then this is default.
    */
  var DhcpOptionsId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Information about the IPv6 CIDR blocks associated with the VPC.
    */
  var Ipv6CidrBlockAssociationSet: js.UndefOr[Ipv6CidrBlockAssociationList] = js.native
  
  /**
    * The current state of the VPC.
    */
  var State: js.UndefOr[NonEmptyString] = js.native
}
object AwsEc2VpcDetails {
  
  @scala.inline
  def apply(): AwsEc2VpcDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2VpcDetails]
  }
  
  @scala.inline
  implicit class AwsEc2VpcDetailsOps[Self <: AwsEc2VpcDetails] (val x: Self) extends AnyVal {
    
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
    def setCidrBlockAssociationSetVarargs(value: CidrBlockAssociation*): Self = this.set("CidrBlockAssociationSet", js.Array(value :_*))
    
    @scala.inline
    def setCidrBlockAssociationSet(value: CidrBlockAssociationList): Self = this.set("CidrBlockAssociationSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCidrBlockAssociationSet: Self = this.set("CidrBlockAssociationSet", js.undefined)
    
    @scala.inline
    def setDhcpOptionsId(value: NonEmptyString): Self = this.set("DhcpOptionsId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDhcpOptionsId: Self = this.set("DhcpOptionsId", js.undefined)
    
    @scala.inline
    def setIpv6CidrBlockAssociationSetVarargs(value: Ipv6CidrBlockAssociation*): Self = this.set("Ipv6CidrBlockAssociationSet", js.Array(value :_*))
    
    @scala.inline
    def setIpv6CidrBlockAssociationSet(value: Ipv6CidrBlockAssociationList): Self = this.set("Ipv6CidrBlockAssociationSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpv6CidrBlockAssociationSet: Self = this.set("Ipv6CidrBlockAssociationSet", js.undefined)
    
    @scala.inline
    def setState(value: NonEmptyString): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
  }
}
