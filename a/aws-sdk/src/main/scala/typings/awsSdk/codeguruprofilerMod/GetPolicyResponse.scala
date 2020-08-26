package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPolicyResponse extends js.Object {
  /**
    * The JSON-formatted resource-based policy attached to the ProfilingGroup.
    */
  var policy: String = js.native
  /**
    * A unique identifier for the current revision of the returned policy.
    */
  var revisionId: RevisionId = js.native
}

object GetPolicyResponse {
  @scala.inline
  def apply(policy: String, revisionId: RevisionId): GetPolicyResponse = {
    val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any], revisionId = revisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPolicyResponse]
  }
  @scala.inline
  implicit class GetPolicyResponseOps[Self <: GetPolicyResponse] (val x: Self) extends AnyVal {
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

