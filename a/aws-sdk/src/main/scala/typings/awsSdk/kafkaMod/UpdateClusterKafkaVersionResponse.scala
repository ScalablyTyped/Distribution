package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateClusterKafkaVersionResponse extends js.Object {
  /**
    * 
    The Amazon Resource Name (ARN) of the cluster.
    
    */
  var ClusterArn: js.UndefOr[string] = js.native
  /**
    * 
    The Amazon Resource Name (ARN) of the cluster operation.
    
    */
  var ClusterOperationArn: js.UndefOr[string] = js.native
}

object UpdateClusterKafkaVersionResponse {
  @scala.inline
  def apply(ClusterArn: string = null, ClusterOperationArn: string = null): UpdateClusterKafkaVersionResponse = {
    val __obj = js.Dynamic.literal()
    if (ClusterArn != null) __obj.updateDynamic("ClusterArn")(ClusterArn.asInstanceOf[js.Any])
    if (ClusterOperationArn != null) __obj.updateDynamic("ClusterOperationArn")(ClusterOperationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateClusterKafkaVersionResponse]
  }
}

