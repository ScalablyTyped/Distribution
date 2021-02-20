package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCheckerIpRangesResponse extends StObject {
  
  /**
    * A complex type that contains sorted list of IP ranges in CIDR format for Amazon Route 53 health checkers.
    */
  var CheckerIpRanges: typings.awsSdk.route53Mod.CheckerIpRanges = js.native
}
object GetCheckerIpRangesResponse {
  
  @scala.inline
  def apply(CheckerIpRanges: CheckerIpRanges): GetCheckerIpRangesResponse = {
    val __obj = js.Dynamic.literal(CheckerIpRanges = CheckerIpRanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCheckerIpRangesResponse]
  }
  
  @scala.inline
  implicit class GetCheckerIpRangesResponseMutableBuilder[Self <: GetCheckerIpRangesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckerIpRanges(value: CheckerIpRanges): Self = StObject.set(x, "CheckerIpRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckerIpRangesVarargs(value: IPAddressCidr*): Self = StObject.set(x, "CheckerIpRanges", js.Array(value :_*))
  }
}
