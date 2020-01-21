package typings.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeClusterRequest extends js.Object {
  /**
    * The automatically generated ID for a cluster.
    */
  var ClusterId: typings.awsSdk.snowballMod.ClusterId = js.native
}

object DescribeClusterRequest {
  @scala.inline
  def apply(ClusterId: ClusterId): DescribeClusterRequest = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeClusterRequest]
  }
}

