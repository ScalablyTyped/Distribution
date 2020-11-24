package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsEc2SecurityGroupIpv6Range extends js.Object {
  
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
  implicit class AwsEc2SecurityGroupIpv6RangeOps[Self <: AwsEc2SecurityGroupIpv6Range] (val x: Self) extends AnyVal {
    
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
    def setCidrIpv6(value: NonEmptyString): Self = this.set("CidrIpv6", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCidrIpv6: Self = this.set("CidrIpv6", js.undefined)
  }
}
