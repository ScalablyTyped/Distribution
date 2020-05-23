package typings.awsSdk.schemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetResourcePolicyResponse extends js.Object {
  /**
    * The resource-based policy.
    */
  var Policy: js.UndefOr[string] = js.native
  /**
    * The revision ID.
    */
  var RevisionId: js.UndefOr[string] = js.native
}

object GetResourcePolicyResponse {
  @scala.inline
  def apply(Policy: string = null, RevisionId: string = null): GetResourcePolicyResponse = {
    val __obj = js.Dynamic.literal()
    if (Policy != null) __obj.updateDynamic("Policy")(Policy.asInstanceOf[js.Any])
    if (RevisionId != null) __obj.updateDynamic("RevisionId")(RevisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourcePolicyResponse]
  }
}

