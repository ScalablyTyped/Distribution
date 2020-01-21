package typings.awsSdk.daxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecreaseReplicationFactorResponse extends js.Object {
  /**
    * A description of the DAX cluster, after you have decreased its replication factor.
    */
  var Cluster: js.UndefOr[typings.awsSdk.daxMod.Cluster] = js.native
}

object DecreaseReplicationFactorResponse {
  @scala.inline
  def apply(Cluster: Cluster = null): DecreaseReplicationFactorResponse = {
    val __obj = js.Dynamic.literal()
    if (Cluster != null) __obj.updateDynamic("Cluster")(Cluster.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecreaseReplicationFactorResponse]
  }
}

