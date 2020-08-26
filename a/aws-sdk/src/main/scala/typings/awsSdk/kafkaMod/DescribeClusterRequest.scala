package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeClusterRequest extends js.Object {
  /**
    * 
    The Amazon Resource Name (ARN) that uniquely identifies the cluster.
    
    */
  var ClusterArn: string = js.native
}

object DescribeClusterRequest {
  @scala.inline
  def apply(ClusterArn: string): DescribeClusterRequest = {
    val __obj = js.Dynamic.literal(ClusterArn = ClusterArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeClusterRequest]
  }
  @scala.inline
  implicit class DescribeClusterRequestOps[Self <: DescribeClusterRequest] (val x: Self) extends AnyVal {
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
  }
  
}

