package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetEmailIdentityPoliciesResponse extends js.Object {
  /**
    * A map of policy names to policies.
    */
  var Policies: js.UndefOr[PolicyMap] = js.native
}

object GetEmailIdentityPoliciesResponse {
  @scala.inline
  def apply(): GetEmailIdentityPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEmailIdentityPoliciesResponse]
  }
  @scala.inline
  implicit class GetEmailIdentityPoliciesResponseOps[Self <: GetEmailIdentityPoliciesResponse] (val x: Self) extends AnyVal {
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
    def setPolicies(value: PolicyMap): Self = this.set("Policies", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicies: Self = this.set("Policies", js.undefined)
  }
  
}

