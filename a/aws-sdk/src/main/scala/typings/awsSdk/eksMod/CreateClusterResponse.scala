package typings.awsSdk.eksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateClusterResponse extends js.Object {
  /**
    * The full description of your new cluster.
    */
  var cluster: js.UndefOr[Cluster] = js.native
}

object CreateClusterResponse {
  @scala.inline
  def apply(cluster: Cluster = null): CreateClusterResponse = {
    val __obj = js.Dynamic.literal()
    if (cluster != null) __obj.updateDynamic("cluster")(cluster.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClusterResponse]
  }
}

