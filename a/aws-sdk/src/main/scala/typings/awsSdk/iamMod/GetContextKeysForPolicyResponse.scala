package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetContextKeysForPolicyResponse extends js.Object {
  /**
    * The list of context keys that are referenced in the input policies.
    */
  var ContextKeyNames: js.UndefOr[ContextKeyNamesResultListType] = js.native
}

object GetContextKeysForPolicyResponse {
  @scala.inline
  def apply(ContextKeyNames: ContextKeyNamesResultListType = null): GetContextKeysForPolicyResponse = {
    val __obj = js.Dynamic.literal()
    if (ContextKeyNames != null) __obj.updateDynamic("ContextKeyNames")(ContextKeyNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetContextKeysForPolicyResponse]
  }
}

