package typings.awsSdk.eksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeClusterResponse extends js.Object {
  /**
    * The full description of your specified cluster.
    */
  var cluster: js.UndefOr[Cluster] = js.native
}

object DescribeClusterResponse {
  @scala.inline
  def apply(cluster: Cluster = null): DescribeClusterResponse = {
    val __obj = js.Dynamic.literal()
    if (cluster != null) __obj.updateDynamic("cluster")(cluster.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeClusterResponse]
  }
}

