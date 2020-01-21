package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLayerVersionPolicyResponse extends js.Object {
  /**
    * The policy document.
    */
  var Policy: js.UndefOr[String] = js.native
  /**
    * A unique identifier for the current revision of the policy.
    */
  var RevisionId: js.UndefOr[String] = js.native
}

object GetLayerVersionPolicyResponse {
  @scala.inline
  def apply(Policy: String = null, RevisionId: String = null): GetLayerVersionPolicyResponse = {
    val __obj = js.Dynamic.literal()
    if (Policy != null) __obj.updateDynamic("Policy")(Policy.asInstanceOf[js.Any])
    if (RevisionId != null) __obj.updateDynamic("RevisionId")(RevisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLayerVersionPolicyResponse]
  }
}

