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
  def apply(): GetContextKeysForPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetContextKeysForPolicyResponse]
  }
  @scala.inline
  implicit class GetContextKeysForPolicyResponseOps[Self <: GetContextKeysForPolicyResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContextKeyNamesVarargs(value: ContextKeyNameType*): Self = this.set("ContextKeyNames", js.Array(value :_*))
    @scala.inline
    def setContextKeyNames(value: ContextKeyNamesResultListType): Self = this.set("ContextKeyNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContextKeyNames: Self = this.set("ContextKeyNames", js.undefined)
  }
  
}

