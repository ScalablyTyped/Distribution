package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCheckerIpRangesResponse extends StObject {
  
  /**
    * A complex type that contains sorted list of IP ranges in CIDR format for Amazon Route 53 health checkers.
    */
  var CheckerIpRanges: typings.awsSdk.route53Mod.CheckerIpRanges
}
object GetCheckerIpRangesResponse {
  
  inline def apply(CheckerIpRanges: CheckerIpRanges): GetCheckerIpRangesResponse = {
    val __obj = js.Dynamic.literal(CheckerIpRanges = CheckerIpRanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCheckerIpRangesResponse]
  }
  
  extension [Self <: GetCheckerIpRangesResponse](x: Self) {
    
    inline def setCheckerIpRanges(value: CheckerIpRanges): Self = StObject.set(x, "CheckerIpRanges", value.asInstanceOf[js.Any])
    
    inline def setCheckerIpRangesVarargs(value: IPAddressCidr*): Self = StObject.set(x, "CheckerIpRanges", js.Array(value*))
  }
}
