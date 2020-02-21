package typings.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopDBClusterResult extends js.Object {
  var DBCluster: js.UndefOr[typings.awsSdk.neptuneMod.DBCluster] = js.native
}

object StopDBClusterResult {
  @scala.inline
  def apply(DBCluster: DBCluster = null): StopDBClusterResult = {
    val __obj = js.Dynamic.literal()
    if (DBCluster != null) __obj.updateDynamic("DBCluster")(DBCluster.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopDBClusterResult]
  }
}

