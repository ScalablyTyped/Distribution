package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListClusterOperationsResponse extends StObject {
  
  /**
    * 
    An array of cluster operation information objects.
    
    */
  var ClusterOperationInfoList: js.UndefOr[listOfClusterOperationInfo] = js.undefined
  
  /**
    * 
    If the response of ListClusterOperations is truncated, it returns a NextToken in the response. This Nexttoken should be sent in the subsequent request to ListClusterOperations.
    
    */
  var NextToken: js.UndefOr[string] = js.undefined
}
object ListClusterOperationsResponse {
  
  inline def apply(): ListClusterOperationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListClusterOperationsResponse]
  }
  
  extension [Self <: ListClusterOperationsResponse](x: Self) {
    
    inline def setClusterOperationInfoList(value: listOfClusterOperationInfo): Self = StObject.set(x, "ClusterOperationInfoList", value.asInstanceOf[js.Any])
    
    inline def setClusterOperationInfoListUndefined: Self = StObject.set(x, "ClusterOperationInfoList", js.undefined)
    
    inline def setClusterOperationInfoListVarargs(value: ClusterOperationInfo*): Self = StObject.set(x, "ClusterOperationInfoList", js.Array(value :_*))
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
