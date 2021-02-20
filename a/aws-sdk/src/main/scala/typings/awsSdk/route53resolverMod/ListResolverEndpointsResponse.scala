package typings.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListResolverEndpointsResponse extends StObject {
  
  /**
    * The value that you specified for MaxResults in the request.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.route53resolverMod.MaxResults] = js.native
  
  /**
    * If more than MaxResults IP addresses match the specified criteria, you can submit another ListResolverEndpoint request to get the next group of results. In the next request, specify the value of NextToken from the previous response. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.route53resolverMod.NextToken] = js.native
  
  /**
    * The Resolver endpoints that were created by using the current AWS account, and that match the specified filters, if any.
    */
  var ResolverEndpoints: js.UndefOr[typings.awsSdk.route53resolverMod.ResolverEndpoints] = js.native
}
object ListResolverEndpointsResponse {
  
  @scala.inline
  def apply(): ListResolverEndpointsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResolverEndpointsResponse]
  }
  
  @scala.inline
  implicit class ListResolverEndpointsResponseMutableBuilder[Self <: ListResolverEndpointsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setResolverEndpoints(value: ResolverEndpoints): Self = StObject.set(x, "ResolverEndpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolverEndpointsUndefined: Self = StObject.set(x, "ResolverEndpoints", js.undefined)
    
    @scala.inline
    def setResolverEndpointsVarargs(value: ResolverEndpoint*): Self = StObject.set(x, "ResolverEndpoints", js.Array(value :_*))
  }
}
