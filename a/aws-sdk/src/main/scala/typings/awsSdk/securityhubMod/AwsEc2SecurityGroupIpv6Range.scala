package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsEc2SecurityGroupIpv6Range extends StObject {
  
  /**
    * The IPv6 CIDR range. You can specify either a CIDR range or a source security group, but not both. To specify a single IPv6 address, use the /128 prefix length.
    */
  var CidrIpv6: js.UndefOr[NonEmptyString] = js.native
}
object AwsEc2SecurityGroupIpv6Range {
  
  @scala.inline
  def apply(): AwsEc2SecurityGroupIpv6Range = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2SecurityGroupIpv6Range]
  }
  
  @scala.inline
  implicit class AwsEc2SecurityGroupIpv6RangeMutableBuilder[Self <: AwsEc2SecurityGroupIpv6Range] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCidrIpv6(value: NonEmptyString): Self = StObject.set(x, "CidrIpv6", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCidrIpv6Undefined: Self = StObject.set(x, "CidrIpv6", js.undefined)
  }
}
