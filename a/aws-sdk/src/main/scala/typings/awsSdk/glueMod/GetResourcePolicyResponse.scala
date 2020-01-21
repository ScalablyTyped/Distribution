package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetResourcePolicyResponse extends js.Object {
  /**
    * The date and time at which the policy was created.
    */
  var CreateTime: js.UndefOr[Timestamp] = js.native
  /**
    * Contains the hash value associated with this policy.
    */
  var PolicyHash: js.UndefOr[HashString] = js.native
  /**
    * Contains the requested policy document, in JSON format.
    */
  var PolicyInJson: js.UndefOr[PolicyJsonString] = js.native
  /**
    * The date and time at which the policy was last updated.
    */
  var UpdateTime: js.UndefOr[Timestamp] = js.native
}

object GetResourcePolicyResponse {
  @scala.inline
  def apply(
    CreateTime: Timestamp = null,
    PolicyHash: HashString = null,
    PolicyInJson: PolicyJsonString = null,
    UpdateTime: Timestamp = null
  ): GetResourcePolicyResponse = {
    val __obj = js.Dynamic.literal()
    if (CreateTime != null) __obj.updateDynamic("CreateTime")(CreateTime.asInstanceOf[js.Any])
    if (PolicyHash != null) __obj.updateDynamic("PolicyHash")(PolicyHash.asInstanceOf[js.Any])
    if (PolicyInJson != null) __obj.updateDynamic("PolicyInJson")(PolicyInJson.asInstanceOf[js.Any])
    if (UpdateTime != null) __obj.updateDynamic("UpdateTime")(UpdateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourcePolicyResponse]
  }
}

