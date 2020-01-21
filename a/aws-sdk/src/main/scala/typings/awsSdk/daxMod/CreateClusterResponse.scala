package typings.awsSdk.daxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateClusterResponse extends js.Object {
  /**
    * A description of the DAX cluster that you have created.
    */
  var Cluster: js.UndefOr[typings.awsSdk.daxMod.Cluster] = js.native
}

object CreateClusterResponse {
  @scala.inline
  def apply(Cluster: Cluster = null): CreateClusterResponse = {
    val __obj = js.Dynamic.literal()
    if (Cluster != null) __obj.updateDynamic("Cluster")(Cluster.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClusterResponse]
  }
}

