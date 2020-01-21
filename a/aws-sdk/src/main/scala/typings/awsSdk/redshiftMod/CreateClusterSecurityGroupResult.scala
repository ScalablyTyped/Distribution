package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateClusterSecurityGroupResult extends js.Object {
  var ClusterSecurityGroup: js.UndefOr[typings.awsSdk.redshiftMod.ClusterSecurityGroup] = js.native
}

object CreateClusterSecurityGroupResult {
  @scala.inline
  def apply(ClusterSecurityGroup: ClusterSecurityGroup = null): CreateClusterSecurityGroupResult = {
    val __obj = js.Dynamic.literal()
    if (ClusterSecurityGroup != null) __obj.updateDynamic("ClusterSecurityGroup")(ClusterSecurityGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClusterSecurityGroupResult]
  }
}

