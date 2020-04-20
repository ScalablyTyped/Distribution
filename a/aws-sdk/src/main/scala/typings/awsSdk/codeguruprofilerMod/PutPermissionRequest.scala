package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutPermissionRequest extends js.Object {
  /**
    * The list of actions that the users and roles can perform on the profiling group.
    */
  var actionGroup: ActionGroup = js.native
  /**
    * The list of role and user ARNs or the accountId that needs access (wildcards are not allowed).
    */
  var principals: Principals = js.native
  /**
    * The name of the profiling group.
    */
  var profilingGroupName: ProfilingGroupName = js.native
  /**
    * A unique identifier for the current revision of the policy. This is required, if a policy exists for the profiling group. This is not required when creating the policy for the first time.
    */
  var revisionId: js.UndefOr[RevisionId] = js.native
}

object PutPermissionRequest {
  @scala.inline
  def apply(
    actionGroup: ActionGroup,
    principals: Principals,
    profilingGroupName: ProfilingGroupName,
    revisionId: RevisionId = null
  ): PutPermissionRequest = {
    val __obj = js.Dynamic.literal(actionGroup = actionGroup.asInstanceOf[js.Any], principals = principals.asInstanceOf[js.Any], profilingGroupName = profilingGroupName.asInstanceOf[js.Any])
    if (revisionId != null) __obj.updateDynamic("revisionId")(revisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutPermissionRequest]
  }
}

