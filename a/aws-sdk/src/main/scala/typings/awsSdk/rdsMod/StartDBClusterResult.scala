package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartDBClusterResult extends js.Object {
  var DBCluster: js.UndefOr[typings.awsSdk.rdsMod.DBCluster] = js.native
}

object StartDBClusterResult {
  @scala.inline
  def apply(DBCluster: DBCluster = null): StartDBClusterResult = {
    val __obj = js.Dynamic.literal()
    if (DBCluster != null) __obj.updateDynamic("DBCluster")(DBCluster.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartDBClusterResult]
  }
}

