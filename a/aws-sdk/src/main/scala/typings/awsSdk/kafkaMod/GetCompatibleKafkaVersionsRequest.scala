package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCompatibleKafkaVersionsRequest extends js.Object {
  /**
    * 
    The Amazon Resource Name (ARN) of the cluster check.
    
    */
  var ClusterArn: js.UndefOr[string] = js.native
}

object GetCompatibleKafkaVersionsRequest {
  @scala.inline
  def apply(ClusterArn: string = null): GetCompatibleKafkaVersionsRequest = {
    val __obj = js.Dynamic.literal()
    if (ClusterArn != null) __obj.updateDynamic("ClusterArn")(ClusterArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCompatibleKafkaVersionsRequest]
  }
}

