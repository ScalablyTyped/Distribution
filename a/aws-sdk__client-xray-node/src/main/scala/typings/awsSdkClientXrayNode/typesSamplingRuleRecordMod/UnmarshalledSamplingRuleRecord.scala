package typings.awsSdkClientXrayNode.typesSamplingRuleRecordMod

import typings.awsSdkClientXrayNode.typesSamplingRuleMod.UnmarshalledSamplingRule
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledSamplingRuleRecord extends SamplingRuleRecord {
  /**
    * <p>When the rule was created.</p>
    */
  @JSName("CreatedAt")
  var CreatedAt_UnmarshalledSamplingRuleRecord: js.UndefOr[Date] = js.undefined
  /**
    * <p>When the rule was last modified.</p>
    */
  @JSName("ModifiedAt")
  var ModifiedAt_UnmarshalledSamplingRuleRecord: js.UndefOr[Date] = js.undefined
  /**
    * <p>The sampling rule.</p>
    */
  @JSName("SamplingRule")
  var SamplingRule_UnmarshalledSamplingRuleRecord: js.UndefOr[UnmarshalledSamplingRule] = js.undefined
}

object UnmarshalledSamplingRuleRecord {
  @scala.inline
  def apply(CreatedAt: Date = null, ModifiedAt: Date = null, SamplingRule: UnmarshalledSamplingRule = null): UnmarshalledSamplingRuleRecord = {
    val __obj = js.Dynamic.literal()
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt.asInstanceOf[js.Any])
    if (ModifiedAt != null) __obj.updateDynamic("ModifiedAt")(ModifiedAt.asInstanceOf[js.Any])
    if (SamplingRule != null) __obj.updateDynamic("SamplingRule")(SamplingRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledSamplingRuleRecord]
  }
}

