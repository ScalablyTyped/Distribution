package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeEcsClustersRequest extends StObject {
  
  /**
    * A list of ARNs, one for each cluster to be described.
    */
  var EcsClusterArns: js.UndefOr[Strings] = js.native
  
  /**
    * To receive a paginated response, use this parameter to specify the maximum number of results to be returned with a single call. If the number of available results exceeds this maximum, the response includes a NextToken value that you can assign to the NextToken request parameter to get the next set of results.
    */
  var MaxResults: js.UndefOr[Integer] = js.native
  
  /**
    * If the previous paginated request did not return all of the remaining results, the response object'sNextToken parameter value is set to a token. To retrieve the next set of results, call DescribeEcsClusters again and assign that token to the request object's NextToken parameter. If there are no remaining results, the previous response object's NextToken parameter is set to null.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * A stack ID. DescribeEcsClusters returns a description of the cluster that is registered with the stack.
    */
  var StackId: js.UndefOr[String] = js.native
}
object DescribeEcsClustersRequest {
  
  @scala.inline
  def apply(): DescribeEcsClustersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEcsClustersRequest]
  }
  
  @scala.inline
  implicit class DescribeEcsClustersRequestMutableBuilder[Self <: DescribeEcsClustersRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEcsClusterArns(value: Strings): Self = StObject.set(x, "EcsClusterArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEcsClusterArnsUndefined: Self = StObject.set(x, "EcsClusterArns", js.undefined)
    
    @scala.inline
    def setEcsClusterArnsVarargs(value: String*): Self = StObject.set(x, "EcsClusterArns", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: Integer): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setStackId(value: String): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackIdUndefined: Self = StObject.set(x, "StackId", js.undefined)
  }
}
