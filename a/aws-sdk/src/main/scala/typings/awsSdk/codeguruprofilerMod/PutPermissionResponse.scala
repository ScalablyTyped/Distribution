package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutPermissionResponse extends js.Object {
  /**
    *  The JSON-formatted resource-based policy on the profiling group that includes the added permissions. 
    */
  var policy: String = js.native
  /**
    *  A universally unique identifier (UUID) for the revision of the resource-based policy that includes the added permissions. The JSON-formatted policy is in the policy element of the response. 
    */
  var revisionId: RevisionId = js.native
}

object PutPermissionResponse {
  @scala.inline
  def apply(policy: String, revisionId: RevisionId): PutPermissionResponse = {
    val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any], revisionId = revisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutPermissionResponse]
  }
  @scala.inline
  implicit class PutPermissionResponseOps[Self <: PutPermissionResponse] (val x: Self) extends AnyVal {
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
    def setPolicy(value: String): Self = this.set("policy", value.asInstanceOf[js.Any])
    @scala.inline
    def setRevisionId(value: RevisionId): Self = this.set("revisionId", value.asInstanceOf[js.Any])
  }
  
}

