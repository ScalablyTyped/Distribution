package typings.awsSdk.daxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RebootNodeResponse extends js.Object {
  /**
    * A description of the DAX cluster after a node has been rebooted.
    */
  var Cluster: js.UndefOr[typings.awsSdk.daxMod.Cluster] = js.native
}

object RebootNodeResponse {
  @scala.inline
  def apply(Cluster: Cluster = null): RebootNodeResponse = {
    val __obj = js.Dynamic.literal()
    if (Cluster != null) __obj.updateDynamic("Cluster")(Cluster.asInstanceOf[js.Any])
    __obj.asInstanceOf[RebootNodeResponse]
  }
}

