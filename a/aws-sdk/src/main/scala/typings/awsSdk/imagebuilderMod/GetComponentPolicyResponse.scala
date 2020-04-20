package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetComponentPolicyResponse extends js.Object {
  /**
    * The component policy. 
    */
  var policy: js.UndefOr[ResourcePolicyDocument] = js.native
  /**
    * The request ID that uniquely identifies this request. 
    */
  var requestId: js.UndefOr[NonEmptyString] = js.native
}

object GetComponentPolicyResponse {
  @scala.inline
  def apply(policy: ResourcePolicyDocument = null, requestId: NonEmptyString = null): GetComponentPolicyResponse = {
    val __obj = js.Dynamic.literal()
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    if (requestId != null) __obj.updateDynamic("requestId")(requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetComponentPolicyResponse]
  }
}

