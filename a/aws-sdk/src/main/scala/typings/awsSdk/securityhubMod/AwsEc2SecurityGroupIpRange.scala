package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsEc2SecurityGroupIpRange extends StObject {
  
  /**
    * The IPv4 CIDR range. You can specify either a CIDR range or a source security group, but not both. To specify a single IPv4 address, use the /32 prefix length.
    */
  var CidrIp: js.UndefOr[NonEmptyString] = js.native
}
object AwsEc2SecurityGroupIpRange {
  
  @scala.inline
  def apply(): AwsEc2SecurityGroupIpRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2SecurityGroupIpRange]
  }
  
  @scala.inline
  implicit class AwsEc2SecurityGroupIpRangeMutableBuilder[Self <: AwsEc2SecurityGroupIpRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCidrIp(value: NonEmptyString): Self = StObject.set(x, "CidrIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCidrIpUndefined: Self = StObject.set(x, "CidrIp", js.undefined)
  }
}
