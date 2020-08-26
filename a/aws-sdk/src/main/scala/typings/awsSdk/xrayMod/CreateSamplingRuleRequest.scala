package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSamplingRuleRequest extends js.Object {
  /**
    * The rule definition.
    */
  var SamplingRule: typings.awsSdk.xrayMod.SamplingRule = js.native
}

object CreateSamplingRuleRequest {
  @scala.inline
  def apply(SamplingRule: SamplingRule): CreateSamplingRuleRequest = {
    val __obj = js.Dynamic.literal(SamplingRule = SamplingRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSamplingRuleRequest]
  }
  @scala.inline
  implicit class CreateSamplingRuleRequestOps[Self <: CreateSamplingRuleRequest] (val x: Self) extends AnyVal {
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
    def setSamplingRule(value: SamplingRule): Self = this.set("SamplingRule", value.asInstanceOf[js.Any])
  }
  
}

