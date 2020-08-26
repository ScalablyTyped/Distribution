package typings.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEffectivePolicyResponse extends js.Object {
  /**
    * The contents of the effective policy.
    */
  var EffectivePolicy: js.UndefOr[typings.awsSdk.organizationsMod.EffectivePolicy] = js.native
}

object DescribeEffectivePolicyResponse {
  @scala.inline
  def apply(): DescribeEffectivePolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEffectivePolicyResponse]
  }
  @scala.inline
  implicit class DescribeEffectivePolicyResponseOps[Self <: DescribeEffectivePolicyResponse] (val x: Self) extends AnyVal {
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
    def setEffectivePolicy(value: EffectivePolicy): Self = this.set("EffectivePolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEffectivePolicy: Self = this.set("EffectivePolicy", js.undefined)
  }
  
}

