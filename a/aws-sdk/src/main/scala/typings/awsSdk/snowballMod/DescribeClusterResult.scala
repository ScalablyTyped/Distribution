package typings.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeClusterResult extends js.Object {
  /**
    * Information about a specific cluster, including shipping information, cluster status, and other important metadata.
    */
  var ClusterMetadata: js.UndefOr[typings.awsSdk.snowballMod.ClusterMetadata] = js.native
}

object DescribeClusterResult {
  @scala.inline
  def apply(ClusterMetadata: ClusterMetadata = null): DescribeClusterResult = {
    val __obj = js.Dynamic.literal()
    if (ClusterMetadata != null) __obj.updateDynamic("ClusterMetadata")(ClusterMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeClusterResult]
  }
}

