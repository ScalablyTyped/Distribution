package typings.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Policy extends js.Object {
  /**
    * The text content of the policy.
    */
  var Content: js.UndefOr[PolicyContent] = js.native
  /**
    * A structure that contains additional details about the policy.
    */
  var PolicySummary: js.UndefOr[typings.awsSdk.organizationsMod.PolicySummary] = js.native
}

object Policy {
  @scala.inline
  def apply(): Policy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Policy]
  }
  @scala.inline
  implicit class PolicyOps[Self <: Policy] (val x: Self) extends AnyVal {
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
    def setContent(value: PolicyContent): Self = this.set("Content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("Content", js.undefined)
    @scala.inline
    def setPolicySummary(value: PolicySummary): Self = this.set("PolicySummary", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicySummary: Self = this.set("PolicySummary", js.undefined)
  }
  
}

