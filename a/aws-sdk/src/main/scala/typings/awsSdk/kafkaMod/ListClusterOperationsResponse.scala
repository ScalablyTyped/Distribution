package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListClusterOperationsResponse extends StObject {
  
  /**
    * 
    An array of cluster operation information objects.
    
    */
  var ClusterOperationInfoList: js.UndefOr[listOfClusterOperationInfo] = js.native
  
  /**
    * 
    If the response of ListClusterOperations is truncated, it returns a NextToken in the response. This Nexttoken should be sent in the subsequent request to ListClusterOperations.
    
    */
  var NextToken: js.UndefOr[string] = js.native
}
object ListClusterOperationsResponse {
  
  @scala.inline
  def apply(): ListClusterOperationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListClusterOperationsResponse]
  }
  
  @scala.inline
  implicit class ListClusterOperationsResponseMutableBuilder[Self <: ListClusterOperationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterOperationInfoList(value: listOfClusterOperationInfo): Self = StObject.set(x, "ClusterOperationInfoList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterOperationInfoListUndefined: Self = StObject.set(x, "ClusterOperationInfoList", js.undefined)
    
    @scala.inline
    def setClusterOperationInfoListVarargs(value: ClusterOperationInfo*): Self = StObject.set(x, "ClusterOperationInfoList", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
