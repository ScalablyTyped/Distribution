package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeClusterOperationRequest extends js.Object {
  /**
    * 
    The Amazon Resource Name (ARN) that uniquely identifies the MSK cluster operation.
    
    */
  var ClusterOperationArn: string = js.native
}

object DescribeClusterOperationRequest {
  @scala.inline
  def apply(ClusterOperationArn: string): DescribeClusterOperationRequest = {
    val __obj = js.Dynamic.literal(ClusterOperationArn = ClusterOperationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeClusterOperationRequest]
  }
}

