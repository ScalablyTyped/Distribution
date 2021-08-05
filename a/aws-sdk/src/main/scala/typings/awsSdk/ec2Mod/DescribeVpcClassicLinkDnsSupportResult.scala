package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeVpcClassicLinkDnsSupportResult extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[DescribeVpcClassicLinkDnsSupportNextToken] = js.undefined
  
  /**
    * Information about the ClassicLink DNS support status of the VPCs.
    */
  var Vpcs: js.UndefOr[ClassicLinkDnsSupportList] = js.undefined
}
object DescribeVpcClassicLinkDnsSupportResult {
  
  inline def apply(): DescribeVpcClassicLinkDnsSupportResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVpcClassicLinkDnsSupportResult]
  }
  
  extension [Self <: DescribeVpcClassicLinkDnsSupportResult](x: Self) {
    
    inline def setNextToken(value: DescribeVpcClassicLinkDnsSupportNextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setVpcs(value: ClassicLinkDnsSupportList): Self = StObject.set(x, "Vpcs", value.asInstanceOf[js.Any])
    
    inline def setVpcsUndefined: Self = StObject.set(x, "Vpcs", js.undefined)
    
    inline def setVpcsVarargs(value: ClassicLinkDnsSupport*): Self = StObject.set(x, "Vpcs", js.Array(value :_*))
  }
}
