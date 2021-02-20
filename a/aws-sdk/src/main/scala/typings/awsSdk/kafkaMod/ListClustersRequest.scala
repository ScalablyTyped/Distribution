package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListClustersRequest extends StObject {
  
  /**
    * 
    Specify a prefix of the name of the clusters that you want to list. The service lists all the clusters whose names start with this prefix.
    
    */
  var ClusterNameFilter: js.UndefOr[string] = js.native
  
  /**
    * 
    The maximum number of results to return in the response. If there are more results, the response includes a NextToken parameter.
    
    */
  var MaxResults: js.UndefOr[typings.awsSdk.kafkaMod.MaxResults] = js.native
  
  /**
    * 
    The paginated results marker. When the result of the operation is truncated, the call returns NextToken in the response. 
    To get the next batch, provide this token in your next request.
    
    */
  var NextToken: js.UndefOr[string] = js.native
}
object ListClustersRequest {
  
  @scala.inline
  def apply(): ListClustersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListClustersRequest]
  }
  
  @scala.inline
  implicit class ListClustersRequestMutableBuilder[Self <: ListClustersRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterNameFilter(value: string): Self = StObject.set(x, "ClusterNameFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterNameFilterUndefined: Self = StObject.set(x, "ClusterNameFilter", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
