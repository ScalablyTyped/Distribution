package typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreSamplingRuleRecordMod

import typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreSamplingRuleMod._SamplingRule
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _SamplingRuleRecord extends js.Object {
  /**
    * <p>When the rule was created.</p>
    */
  var CreatedAt: js.UndefOr[Date | String | Double] = js.undefined
  /**
    * <p>When the rule was last modified.</p>
    */
  var ModifiedAt: js.UndefOr[Date | String | Double] = js.undefined
  /**
    * <p>The sampling rule.</p>
    */
  var SamplingRule: js.UndefOr[_SamplingRule] = js.undefined
}

object _SamplingRuleRecord {
  @scala.inline
  def apply(
    CreatedAt: Date | String | Double = null,
    ModifiedAt: Date | String | Double = null,
    SamplingRule: _SamplingRule = null
  ): _SamplingRuleRecord = {
    val __obj = js.Dynamic.literal()
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt.asInstanceOf[js.Any])
    if (ModifiedAt != null) __obj.updateDynamic("ModifiedAt")(ModifiedAt.asInstanceOf[js.Any])
    if (SamplingRule != null) __obj.updateDynamic("SamplingRule")(SamplingRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[_SamplingRuleRecord]
  }
}

