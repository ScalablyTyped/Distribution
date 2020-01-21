package typings.awsSdk.snowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateClusterResult extends js.Object {
  /**
    * The automatically generated ID for a cluster.
    */
  var ClusterId: js.UndefOr[typings.awsSdk.snowballMod.ClusterId] = js.native
}

object CreateClusterResult {
  @scala.inline
  def apply(ClusterId: ClusterId = null): CreateClusterResult = {
    val __obj = js.Dynamic.literal()
    if (ClusterId != null) __obj.updateDynamic("ClusterId")(ClusterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClusterResult]
  }
}

