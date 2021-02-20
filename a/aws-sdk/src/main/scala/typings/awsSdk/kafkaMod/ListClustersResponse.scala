package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListClustersResponse extends StObject {
  
  /**
    * 
    Information on each of the MSK clusters in the response.
    
    */
  var ClusterInfoList: js.UndefOr[listOfClusterInfo] = js.native
  
  /**
    * 
    The paginated results marker. When the result of a ListClusters operation is truncated, the call returns NextToken in the response. 
    To get another batch of clusters, provide this token in your next request.
    
    */
  var NextToken: js.UndefOr[string] = js.native
}
object ListClustersResponse {
  
  @scala.inline
  def apply(): ListClustersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListClustersResponse]
  }
  
  @scala.inline
  implicit class ListClustersResponseMutableBuilder[Self <: ListClustersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterInfoList(value: listOfClusterInfo): Self = StObject.set(x, "ClusterInfoList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterInfoListUndefined: Self = StObject.set(x, "ClusterInfoList", js.undefined)
    
    @scala.inline
    def setClusterInfoListVarargs(value: ClusterInfo*): Self = StObject.set(x, "ClusterInfoList", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
