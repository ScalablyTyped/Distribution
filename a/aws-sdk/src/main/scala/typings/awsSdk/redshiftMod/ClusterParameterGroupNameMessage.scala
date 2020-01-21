package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterParameterGroupNameMessage extends js.Object {
  /**
    * The name of the cluster parameter group.
    */
  var ParameterGroupName: js.UndefOr[String] = js.native
  /**
    * The status of the parameter group. For example, if you made a change to a parameter group name-value pair, then the change could be pending a reboot of an associated cluster.
    */
  var ParameterGroupStatus: js.UndefOr[String] = js.native
}

object ClusterParameterGroupNameMessage {
  @scala.inline
  def apply(ParameterGroupName: String = null, ParameterGroupStatus: String = null): ClusterParameterGroupNameMessage = {
    val __obj = js.Dynamic.literal()
    if (ParameterGroupName != null) __obj.updateDynamic("ParameterGroupName")(ParameterGroupName.asInstanceOf[js.Any])
    if (ParameterGroupStatus != null) __obj.updateDynamic("ParameterGroupStatus")(ParameterGroupStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterParameterGroupNameMessage]
  }
}

