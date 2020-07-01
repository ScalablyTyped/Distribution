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
}

