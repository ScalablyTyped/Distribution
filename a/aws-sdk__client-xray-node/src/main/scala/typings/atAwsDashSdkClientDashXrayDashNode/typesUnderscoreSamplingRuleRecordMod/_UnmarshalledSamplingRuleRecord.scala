package typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreSamplingRuleRecordMod

import typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreSamplingRuleMod._UnmarshalledSamplingRule
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledSamplingRuleRecord extends _SamplingRuleRecord {
  /**
    * <p>When the rule was created.</p>
    */
  @JSName("CreatedAt")
  var CreatedAt__UnmarshalledSamplingRuleRecord: js.UndefOr[Date] = js.undefined
  /**
    * <p>When the rule was last modified.</p>
    */
  @JSName("ModifiedAt")
  var ModifiedAt__UnmarshalledSamplingRuleRecord: js.UndefOr[Date] = js.undefined
  /**
    * <p>The sampling rule.</p>
    */
  @JSName("SamplingRule")
  var SamplingRule__UnmarshalledSamplingRuleRecord: js.UndefOr[_UnmarshalledSamplingRule] = js.undefined
}

object _UnmarshalledSamplingRuleRecord {
  @scala.inline
  def apply(CreatedAt: Date = null, ModifiedAt: Date = null, SamplingRule: _UnmarshalledSamplingRule = null): _UnmarshalledSamplingRuleRecord = {
    val __obj = js.Dynamic.literal()
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt.asInstanceOf[js.Any])
    if (ModifiedAt != null) __obj.updateDynamic("ModifiedAt")(ModifiedAt.asInstanceOf[js.Any])
    if (SamplingRule != null) __obj.updateDynamic("SamplingRule")(SamplingRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledSamplingRuleRecord]
  }
}

