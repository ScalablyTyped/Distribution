package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeVpcAttributeResult extends StObject {
  
  /**
    * Indicates whether the instances launched in the VPC get DNS hostnames. If this attribute is true, instances in the VPC get DNS hostnames; otherwise, they do not.
    */
  var EnableDnsHostnames: js.UndefOr[AttributeBooleanValue] = js.native
  
  /**
    * Indicates whether DNS resolution is enabled for the VPC. If this attribute is true, the Amazon DNS server resolves DNS hostnames for your instances to their corresponding IP addresses; otherwise, it does not.
    */
  var EnableDnsSupport: js.UndefOr[AttributeBooleanValue] = js.native
  
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[String] = js.native
}
object DescribeVpcAttributeResult {
  
  @scala.inline
  def apply(): DescribeVpcAttributeResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVpcAttributeResult]
  }
  
  @scala.inline
  implicit class DescribeVpcAttributeResultMutableBuilder[Self <: DescribeVpcAttributeResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnableDnsHostnames(value: AttributeBooleanValue): Self = StObject.set(x, "EnableDnsHostnames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableDnsHostnamesUndefined: Self = StObject.set(x, "EnableDnsHostnames", js.undefined)
    
    @scala.inline
    def setEnableDnsSupport(value: AttributeBooleanValue): Self = StObject.set(x, "EnableDnsSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableDnsSupportUndefined: Self = StObject.set(x, "EnableDnsSupport", js.undefined)
    
    @scala.inline
    def setVpcId(value: String): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
