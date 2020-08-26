package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParameterInlinePolicy extends js.Object {
  /**
    * The status of the policy. Policies report the following statuses: Pending (the policy has not been enforced or applied yet), Finished (the policy was applied), Failed (the policy was not applied), or InProgress (the policy is being applied now). 
    */
  var PolicyStatus: js.UndefOr[String] = js.native
  /**
    * The JSON text of the policy.
    */
  var PolicyText: js.UndefOr[String] = js.native
  /**
    * The type of policy. Parameter Store supports the following policy types: Expiration, ExpirationNotification, and NoChangeNotification. 
    */
  var PolicyType: js.UndefOr[String] = js.native
}

object ParameterInlinePolicy {
  @scala.inline
  def apply(): ParameterInlinePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParameterInlinePolicy]
  }
  @scala.inline
  implicit class ParameterInlinePolicyOps[Self <: ParameterInlinePolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPolicyStatus(value: String): Self = this.set("PolicyStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicyStatus: Self = this.set("PolicyStatus", js.undefined)
    @scala.inline
    def setPolicyText(value: String): Self = this.set("PolicyText", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicyText: Self = this.set("PolicyText", js.undefined)
    @scala.inline
    def setPolicyType(value: String): Self = this.set("PolicyType", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicyType: Self = this.set("PolicyType", js.undefined)
  }
  
}

