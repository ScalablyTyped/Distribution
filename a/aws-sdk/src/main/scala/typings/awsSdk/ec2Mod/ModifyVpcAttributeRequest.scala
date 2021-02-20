package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyVpcAttributeRequest extends StObject {
  
  /**
    * Indicates whether the instances launched in the VPC get DNS hostnames. If enabled, instances in the VPC get DNS hostnames; otherwise, they do not. You cannot modify the DNS resolution and DNS hostnames attributes in the same request. Use separate requests for each attribute. You can only enable DNS hostnames if you've enabled DNS support.
    */
  var EnableDnsHostnames: js.UndefOr[AttributeBooleanValue] = js.native
  
  /**
    * Indicates whether the DNS resolution is supported for the VPC. If enabled, queries to the Amazon provided DNS server at the 169.254.169.253 IP address, or the reserved IP address at the base of the VPC network range "plus two" succeed. If disabled, the Amazon provided DNS service in the VPC that resolves public DNS hostnames to IP addresses is not enabled. You cannot modify the DNS resolution and DNS hostnames attributes in the same request. Use separate requests for each attribute.
    */
  var EnableDnsSupport: js.UndefOr[AttributeBooleanValue] = js.native
  
  /**
    * The ID of the VPC.
    */
  var VpcId: typings.awsSdk.ec2Mod.VpcId = js.native
}
object ModifyVpcAttributeRequest {
  
  @scala.inline
  def apply(VpcId: VpcId): ModifyVpcAttributeRequest = {
    val __obj = js.Dynamic.literal(VpcId = VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyVpcAttributeRequest]
  }
  
  @scala.inline
  implicit class ModifyVpcAttributeRequestMutableBuilder[Self <: ModifyVpcAttributeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnableDnsHostnames(value: AttributeBooleanValue): Self = StObject.set(x, "EnableDnsHostnames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableDnsHostnamesUndefined: Self = StObject.set(x, "EnableDnsHostnames", js.undefined)
    
    @scala.inline
    def setEnableDnsSupport(value: AttributeBooleanValue): Self = StObject.set(x, "EnableDnsSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableDnsSupportUndefined: Self = StObject.set(x, "EnableDnsSupport", js.undefined)
    
    @scala.inline
    def setVpcId(value: VpcId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
  }
}
