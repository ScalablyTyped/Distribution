package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateClusterSubnetGroupResult extends js.Object {
  var ClusterSubnetGroup: js.UndefOr[typings.awsSdk.redshiftMod.ClusterSubnetGroup] = js.native
}

object CreateClusterSubnetGroupResult {
  @scala.inline
  def apply(ClusterSubnetGroup: ClusterSubnetGroup = null): CreateClusterSubnetGroupResult = {
    val __obj = js.Dynamic.literal()
    if (ClusterSubnetGroup != null) __obj.updateDynamic("ClusterSubnetGroup")(ClusterSubnetGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClusterSubnetGroupResult]
  }
}

