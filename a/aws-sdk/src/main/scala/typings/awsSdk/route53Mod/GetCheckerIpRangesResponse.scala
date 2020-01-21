package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

