package typings.awsSdk.daxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateClusterResponse extends js.Object {
  /**
    * A description of the DAX cluster, after it has been modified.
    */
  var Cluster: js.UndefOr[typings.awsSdk.daxMod.Cluster] = js.native
}

object UpdateClusterResponse {
  @scala.inline
  def apply(Cluster: Cluster = null): UpdateClusterResponse = {
    val __obj = js.Dynamic.literal()
    if (Cluster != null) __obj.updateDynamic("Cluster")(Cluster.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateClusterResponse]
  }
}

