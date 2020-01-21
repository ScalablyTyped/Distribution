package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteSamplingRuleResult extends js.Object {
  /**
    * The deleted rule definition and metadata.
    */
  var SamplingRuleRecord: js.UndefOr[typings.awsSdk.xrayMod.SamplingRuleRecord] = js.native
}

object DeleteSamplingRuleResult {
  @scala.inline
  def apply(SamplingRuleRecord: SamplingRuleRecord = null): DeleteSamplingRuleResult = {
    val __obj = js.Dynamic.literal()
    if (SamplingRuleRecord != null) __obj.updateDynamic("SamplingRuleRecord")(SamplingRuleRecord.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSamplingRuleResult]
  }
}

