package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeVpcClassicLinkDnsSupportResult extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[DescribeVpcClassicLinkDnsSupportNextToken] = js.native
  
  /**
    * Information about the ClassicLink DNS support status of the VPCs.
    */
  var Vpcs: js.UndefOr[ClassicLinkDnsSupportList] = js.native
}
object DescribeVpcClassicLinkDnsSupportResult {
  
  @scala.inline
  def apply(): DescribeVpcClassicLinkDnsSupportResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVpcClassicLinkDnsSupportResult]
  }
  
  @scala.inline
  implicit class DescribeVpcClassicLinkDnsSupportResultMutableBuilder[Self <: DescribeVpcClassicLinkDnsSupportResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: DescribeVpcClassicLinkDnsSupportNextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setVpcs(value: ClassicLinkDnsSupportList): Self = StObject.set(x, "Vpcs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcsUndefined: Self = StObject.set(x, "Vpcs", js.undefined)
    
    @scala.inline
    def setVpcsVarargs(value: ClassicLinkDnsSupport*): Self = StObject.set(x, "Vpcs", js.Array(value :_*))
  }
}
