package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisassociateVpcCidrBlockResult extends StObject {
  
  /**
    * Information about the IPv4 CIDR block association.
    */
  var CidrBlockAssociation: js.UndefOr[VpcCidrBlockAssociation] = js.native
  
  /**
    * Information about the IPv6 CIDR block association.
    */
  var Ipv6CidrBlockAssociation: js.UndefOr[VpcIpv6CidrBlockAssociation] = js.native
  
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[String] = js.native
}
object DisassociateVpcCidrBlockResult {
  
  @scala.inline
  def apply(): DisassociateVpcCidrBlockResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisassociateVpcCidrBlockResult]
  }
  
  @scala.inline
  implicit class DisassociateVpcCidrBlockResultMutableBuilder[Self <: DisassociateVpcCidrBlockResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCidrBlockAssociation(value: VpcCidrBlockAssociation): Self = StObject.set(x, "CidrBlockAssociation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCidrBlockAssociationUndefined: Self = StObject.set(x, "CidrBlockAssociation", js.undefined)
    
    @scala.inline
    def setIpv6CidrBlockAssociation(value: VpcIpv6CidrBlockAssociation): Self = StObject.set(x, "Ipv6CidrBlockAssociation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpv6CidrBlockAssociationUndefined: Self = StObject.set(x, "Ipv6CidrBlockAssociation", js.undefined)
    
    @scala.inline
    def setVpcId(value: String): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
