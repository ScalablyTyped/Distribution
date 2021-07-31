package typings.awsSdk.eksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListNodegroupsRequest extends StObject {
  
  /**
    * The name of the Amazon EKS cluster that you would like to list node groups in.
    */
  var clusterName: String
  
  /**
    * The maximum number of node group results returned by ListNodegroups in paginated output. When you use this parameter, ListNodegroups returns only maxResults results in a single page along with a nextToken response element. You can see the remaining results of the initial request by sending another ListNodegroups request with the returned nextToken value. This value can be between 1 and 100. If you don't use this parameter, ListNodegroups returns up to 100 results and a nextToken value if applicable.
    */
  var maxResults: js.UndefOr[ListNodegroupsRequestMaxResults] = js.undefined
  
  /**
    * The nextToken value returned from a previous paginated ListNodegroups request where maxResults was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the nextToken value.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object ListNodegroupsRequest {
  
  @scala.inline
  def apply(clusterName: String): ListNodegroupsRequest = {
    val __obj = js.Dynamic.literal(clusterName = clusterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListNodegroupsRequest]
  }
  
  @scala.inline
  implicit class ListNodegroupsRequestMutableBuilder[Self <: ListNodegroupsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterName(value: String): Self = StObject.set(x, "clusterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: ListNodegroupsRequestMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
