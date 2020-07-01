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
}

