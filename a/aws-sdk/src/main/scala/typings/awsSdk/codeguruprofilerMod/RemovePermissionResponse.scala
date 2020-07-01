package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemovePermissionResponse extends js.Object {
  /**
    *  The JSON-formatted resource-based policy on the profiling group after the specified permissions were removed. 
    */
  var policy: String = js.native
  /**
    *  A universally unique identifier (UUID) for the revision of the resource-based policy after the specified permissions were removed. The updated JSON-formatted policy is in the policy element of the response. 
    */
  var revisionId: RevisionId = js.native
}

object RemovePermissionResponse {
  @scala.inline
  def apply(policy: String, revisionId: RevisionId): RemovePermissionResponse = {
    val __obj = js.Dynamic.literal(policy = policy.asInstanceOf[js.Any], revisionId = revisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemovePermissionResponse]
  }
}

