package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeClusterOperationResponse extends js.Object {
  /**
    * 
    Cluster operation information
    
    */
  var ClusterOperationInfo: js.UndefOr[typings.awsSdk.kafkaMod.ClusterOperationInfo] = js.native
}

object DescribeClusterOperationResponse {
  @scala.inline
  def apply(ClusterOperationInfo: ClusterOperationInfo = null): DescribeClusterOperationResponse = {
    val __obj = js.Dynamic.literal()
    if (ClusterOperationInfo != null) __obj.updateDynamic("ClusterOperationInfo")(ClusterOperationInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeClusterOperationResponse]
  }
}

