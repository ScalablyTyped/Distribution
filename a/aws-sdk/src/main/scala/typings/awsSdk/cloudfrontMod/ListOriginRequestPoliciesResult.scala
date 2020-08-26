package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListOriginRequestPoliciesResult extends js.Object {
  /**
    * A list of origin request policies.
    */
  var OriginRequestPolicyList: js.UndefOr[typings.awsSdk.cloudfrontMod.OriginRequestPolicyList] = js.native
}

object ListOriginRequestPoliciesResult {
  @scala.inline
  def apply(): ListOriginRequestPoliciesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOriginRequestPoliciesResult]
  }
  @scala.inline
  implicit class ListOriginRequestPoliciesResultOps[Self <: ListOriginRequestPoliciesResult] (val x: Self) extends AnyVal {
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
    def setOriginRequestPolicyList(value: OriginRequestPolicyList): Self = this.set("OriginRequestPolicyList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginRequestPolicyList: Self = this.set("OriginRequestPolicyList", js.undefined)
  }
  
}

