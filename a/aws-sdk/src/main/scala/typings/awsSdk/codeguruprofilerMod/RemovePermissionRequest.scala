package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemovePermissionRequest extends js.Object {
  /**
    *  Specifies an action group that contains the permissions to remove from a profiling group's resource-based policy. One action group is supported, agentPermissions, which grants ConfigureAgent and PostAgentProfile permissions. 
    */
  var actionGroup: ActionGroup = js.native
  /**
    * The name of the profiling group.
    */
  var profilingGroupName: ProfilingGroupName = js.native
  /**
    *  A universally unique identifier (UUID) for the revision of the resource-based policy from which you want to remove permissions. 
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

