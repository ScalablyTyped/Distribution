package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateSubnetCidrBlockRequest extends StObject {
  
  /**
    * The IPv6 CIDR block for your subnet. The subnet must have a /64 prefix length.
    */
  var Ipv6CidrBlock: String
  
  /**
    * The ID of your subnet.
    */
  var SubnetId: typings.awsSdk.ec2Mod.SubnetId
}
object AssociateSubnetCidrBlockRequest {
  
  @scala.inline
  def apply(Ipv6CidrBlock: String, SubnetId: SubnetId): AssociateSubnetCidrBlockRequest = {
    val __obj = js.Dynamic.literal(Ipv6CidrBlock = Ipv6CidrBlock.asInstanceOf[js.Any], SubnetId = SubnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateSubnetCidrBlockRequest]
  }
  
  @scala.inline
  implicit class AssociateSubnetCidrBlockRequestMutableBuilder[Self <: AssociateSubnetCidrBlockRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIpv6CidrBlock(value: String): Self = StObject.set(x, "Ipv6CidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetId(value: SubnetId): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
  }
}
