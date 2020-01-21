package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveFromGlobalClusterResult extends js.Object {
  var GlobalCluster: js.UndefOr[typings.awsSdk.rdsMod.GlobalCluster] = js.native
}

object RemoveFromGlobalClusterResult {
  @scala.inline
  def apply(GlobalCluster: GlobalCluster = null): RemoveFromGlobalClusterResult = {
    val __obj = js.Dynamic.literal()
    if (GlobalCluster != null) __obj.updateDynamic("GlobalCluster")(GlobalCluster.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveFromGlobalClusterResult]
  }
}

