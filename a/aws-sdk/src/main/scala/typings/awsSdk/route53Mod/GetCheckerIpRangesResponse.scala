package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCheckerIpRangesResponse extends js.Object {
  
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
  implicit class GetCheckerIpRangesResponseOps[Self <: GetCheckerIpRangesResponse] (val x: Self) extends AnyVal {
    
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
    def setCheckerIpRangesVarargs(value: IPAddressCidr*): Self = this.set("CheckerIpRanges", js.Array(value :_*))
    
    @scala.inline
    def setCheckerIpRanges(value: CheckerIpRanges): Self = this.set("CheckerIpRanges", value.asInstanceOf[js.Any])
  }
}
