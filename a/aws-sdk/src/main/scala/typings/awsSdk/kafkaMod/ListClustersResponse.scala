package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListClustersResponse extends js.Object {
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
  implicit class ListClustersResponseOps[Self <: ListClustersResponse] (val x: Self) extends AnyVal {
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
    def setClusterInfoListVarargs(value: ClusterInfo*): Self = this.set("ClusterInfoList", js.Array(value :_*))
    @scala.inline
    def setClusterInfoList(value: listOfClusterInfo): Self = this.set("ClusterInfoList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusterInfoList: Self = this.set("ClusterInfoList", js.undefined)
    @scala.inline
    def setNextToken(value: string): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

