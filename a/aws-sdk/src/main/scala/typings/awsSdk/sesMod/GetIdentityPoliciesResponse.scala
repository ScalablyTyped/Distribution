package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetIdentityPoliciesResponse extends js.Object {
  /**
    * A map of policy names to policies.
    */
  var Policies: PolicyMap = js.native
}

object GetIdentityPoliciesResponse {
  @scala.inline
  def apply(Policies: PolicyMap): GetIdentityPoliciesResponse = {
    val __obj = js.Dynamic.literal(Policies = Policies.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIdentityPoliciesResponse]
  }
  @scala.inline
  implicit class GetIdentityPoliciesResponseOps[Self <: GetIdentityPoliciesResponse] (val x: Self) extends AnyVal {
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
  }
  
}

