package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemovePermissionRequest extends js.Object {
  /**
    * The list of actions that the users and roles can perform on the profiling group.
    */
  var actionGroup: ActionGroup = js.native
  /**
    * The name of the profiling group.
    */
  var profilingGroupName: ProfilingGroupName = js.native
  /**
    * A unique identifier for the current revision of the policy.
    */
  var revisionId: RevisionId = js.native
}

object RemovePermissionRequest {
  @scala.inline
  def apply(actionGroup: ActionGroup, profilingGroupName: ProfilingGroupName, revisionId: RevisionId): RemovePermissionRequest = {
    val __obj = js.Dynamic.literal(actionGroup = actionGroup.asInstanceOf[js.Any], profilingGroupName = profilingGroupName.asInstanceOf[js.Any], revisionId = revisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemovePermissionRequest]
  }
}

