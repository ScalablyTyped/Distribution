package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeVpcClassicLinkDnsSupportRequest extends StObject {
  
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[DescribeVpcClassicLinkDnsSupportMaxResults] = js.native
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[DescribeVpcClassicLinkDnsSupportNextToken] = js.native
  
  /**
    * One or more VPC IDs.
    */
  var VpcIds: js.UndefOr[VpcClassicLinkIdList] = js.native
}
object DescribeVpcClassicLinkDnsSupportRequest {
  
  @scala.inline
  def apply(): DescribeVpcClassicLinkDnsSupportRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVpcClassicLinkDnsSupportRequest]
  }
  
  @scala.inline
  implicit class DescribeVpcClassicLinkDnsSupportRequestMutableBuilder[Self <: DescribeVpcClassicLinkDnsSupportRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: DescribeVpcClassicLinkDnsSupportMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: DescribeVpcClassicLinkDnsSupportNextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setVpcIds(value: VpcClassicLinkIdList): Self = StObject.set(x, "VpcIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcIdsUndefined: Self = StObject.set(x, "VpcIds", js.undefined)
    
    @scala.inline
    def setVpcIdsVarargs(value: VpcId*): Self = StObject.set(x, "VpcIds", js.Array(value :_*))
  }
}
