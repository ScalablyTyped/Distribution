package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListClustersV2Request extends StObject {
  
  /**
    * 
    Specify a prefix of the names of the clusters that you want to list. The service lists all the clusters whose names start with this prefix.
    
    */
  var ClusterNameFilter: js.UndefOr[string] = js.undefined
  
  /**
    * 
    Specify either PROVISIONED or SERVERLESS.
    
    */
  var ClusterTypeFilter: js.UndefOr[string] = js.undefined
  
  /**
    * 
    The maximum number of results to return in the response. If there are more results, the response includes a NextToken parameter.
    
    */
  var MaxResults: js.UndefOr[typings.awsSdk.kafkaMod.MaxResults] = js.undefined
  
  /**
    * 
    The paginated results marker. When the result of the operation is truncated, the call returns NextToken in the response. 
    To get the next batch, provide this token in your next request.
    
    */
  var NextToken: js.UndefOr[string] = js.undefined
}
object ListClustersV2Request {
  
  inline def apply(): ListClustersV2Request = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListClustersV2Request]
  }
  
  extension [Self <: ListClustersV2Request](x: Self) {
    
    inline def setClusterNameFilter(value: string): Self = StObject.set(x, "ClusterNameFilter", value.asInstanceOf[js.Any])
    
    inline def setClusterNameFilterUndefined: Self = StObject.set(x, "ClusterNameFilter", js.undefined)
    
    inline def setClusterTypeFilter(value: string): Self = StObject.set(x, "ClusterTypeFilter", value.asInstanceOf[js.Any])
    
    inline def setClusterTypeFilterUndefined: Self = StObject.set(x, "ClusterTypeFilter", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
