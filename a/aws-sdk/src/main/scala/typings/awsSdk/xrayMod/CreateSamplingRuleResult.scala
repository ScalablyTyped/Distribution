package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSamplingRuleResult extends js.Object {
  /**
    * The saved rule definition and metadata.
    */
  var SamplingRuleRecord: js.UndefOr[typings.awsSdk.xrayMod.SamplingRuleRecord] = js.native
}

object CreateSamplingRuleResult {
  @scala.inline
  def apply(): CreateSamplingRuleResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSamplingRuleResult]
  }
  @scala.inline
  implicit class CreateSamplingRuleResultOps[Self <: CreateSamplingRuleResult] (val x: Self) extends AnyVal {
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
    def setSamplingRuleRecord(value: SamplingRuleRecord): Self = this.set("SamplingRuleRecord", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSamplingRuleRecord: Self = this.set("SamplingRuleRecord", js.undefined)
  }
  
}

