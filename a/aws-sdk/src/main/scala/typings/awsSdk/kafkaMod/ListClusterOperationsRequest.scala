package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListClusterOperationsRequest extends js.Object {
  /**
    * 
    The Amazon Resource Name (ARN) that uniquely identifies the cluster.
    
    */
  var ClusterArn: string = js.native
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

object ListClusterOperationsRequest {
  @scala.inline
  def apply(ClusterArn: string): ListClusterOperationsRequest = {
    val __obj = js.Dynamic.literal(ClusterArn = ClusterArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListClusterOperationsRequest]
  }
  @scala.inline
  implicit class ListClusterOperationsRequestOps[Self <: ListClusterOperationsRequest] (val x: Self) extends AnyVal {
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
    def setClusterArn(value: string): Self = this.set("ClusterArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: string): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

