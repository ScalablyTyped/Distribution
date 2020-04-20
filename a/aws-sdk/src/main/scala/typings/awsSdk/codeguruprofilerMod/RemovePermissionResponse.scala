package typings.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemovePermissionResponse extends js.Object {
  /**
    * The resource-based policy.
    */
  var policy: String = js.native
  /**
    * A unique identifier for the current revision of the policy.
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

