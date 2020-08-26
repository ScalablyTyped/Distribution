package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OriginRequestPolicySummary extends js.Object {
  /**
    * The origin request policy.
    */
  var OriginRequestPolicy: typings.awsSdk.cloudfrontMod.OriginRequestPolicy = js.native
  /**
    * The type of origin request policy, either managed (created by AWS) or custom (created in this AWS account).
    */
  var Type: OriginRequestPolicyType = js.native
}

object OriginRequestPolicySummary {
  @scala.inline
  def apply(OriginRequestPolicy: OriginRequestPolicy, Type: OriginRequestPolicyType): OriginRequestPolicySummary = {
    val __obj = js.Dynamic.literal(OriginRequestPolicy = OriginRequestPolicy.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginRequestPolicySummary]
  }
  @scala.inline
  implicit class OriginRequestPolicySummaryOps[Self <: OriginRequestPolicySummary] (val x: Self) extends AnyVal {
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
    def setOriginRequestPolicy(value: OriginRequestPolicy): Self = this.set("OriginRequestPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: OriginRequestPolicyType): Self = this.set("Type", value.asInstanceOf[js.Any])
  }
  
}

