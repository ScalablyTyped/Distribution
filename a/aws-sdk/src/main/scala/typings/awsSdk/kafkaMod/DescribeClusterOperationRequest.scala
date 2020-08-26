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
  @scala.inline
  implicit class DescribeClusterOperationRequestOps[Self <: DescribeClusterOperationRequest] (val x: Self) extends AnyVal {
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
    def setClusterOperationArn(value: string): Self = this.set("ClusterOperationArn", value.asInstanceOf[js.Any])
  }
  
}

