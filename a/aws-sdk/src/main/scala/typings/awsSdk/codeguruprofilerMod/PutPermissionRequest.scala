package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutPermissionRequest extends js.Object {
  /**
    *  Specifies an action group that contains permissions to add to a profiling group resource. One action group is supported, agentPermissions, which grants permission to perform actions required by the profiling agent, ConfigureAgent and PostAgentProfile permissions. 
    */
  var actionGroup: ActionGroup = js.native
  /**
    *  A list ARNs for the roles and users you want to grant access to the profiling group. Wildcards are not are supported in the ARNs. 
    */
  var principals: Principals = js.native
  /**
    * The name of the profiling group to grant access to.
    */
  var profilingGroupName: ProfilingGroupName = js.native
  /**
    *  A universally unique identifier (UUID) for the revision of the policy you are adding to the profiling group. Do not specify this when you add permissions to a profiling group for the first time. If a policy already exists on the profiling group, you must specify the revisionId. 
    */
  var revisionId: js.UndefOr[RevisionId] = js.native
}

object PutPermissionRequest {
  @scala.inline
  def apply(actionGroup: ActionGroup, principals: Principals, profilingGroupName: ProfilingGroupName): PutPermissionRequest = {
    val __obj = js.Dynamic.literal(actionGroup = actionGroup.asInstanceOf[js.Any], principals = principals.asInstanceOf[js.Any], profilingGroupName = profilingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutPermissionRequest]
  }
  @scala.inline
  implicit class PutPermissionRequestOps[Self <: PutPermissionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActionGroup(value: ActionGroup): Self = this.set("actionGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrincipalsVarargs(value: Principal*): Self = this.set("principals", js.Array(value :_*))
    @scala.inline
    def setPrincipals(value: Principals): Self = this.set("principals", value.asInstanceOf[js.Any])
    @scala.inline
    def setProfilingGroupName(value: ProfilingGroupName): Self = this.set("profilingGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def setRevisionId(value: RevisionId): Self = this.set("revisionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevisionId: Self = this.set("revisionId", js.undefined)
  }
  
}

