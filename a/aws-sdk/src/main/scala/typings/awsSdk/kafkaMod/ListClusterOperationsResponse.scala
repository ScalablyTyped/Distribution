package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListClusterOperationsResponse extends js.Object {
  
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
  implicit class ListClusterOperationsResponseOps[Self <: ListClusterOperationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClusterOperationInfoListVarargs(value: ClusterOperationInfo*): Self = this.set("ClusterOperationInfoList", js.Array(value :_*))
    
    @scala.inline
    def setClusterOperationInfoList(value: listOfClusterOperationInfo): Self = this.set("ClusterOperationInfoList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterOperationInfoList: Self = this.set("ClusterOperationInfoList", js.undefined)
    
    @scala.inline
    def setNextToken(value: string): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
