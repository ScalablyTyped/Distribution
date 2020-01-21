package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SamplingRuleRecord extends js.Object {
  /**
    * When the rule was created.
    */
  var CreatedAt: js.UndefOr[Timestamp] = js.native
  /**
    * When the rule was last modified.
    */
  var ModifiedAt: js.UndefOr[Timestamp] = js.native
  /**
    * The sampling rule.
    */
  var SamplingRule: js.UndefOr[typings.awsSdk.xrayMod.SamplingRule] = js.native
}

object SamplingRuleRecord {
  @scala.inline
  def apply(CreatedAt: Timestamp = null, ModifiedAt: Timestamp = null, SamplingRule: SamplingRule = null): SamplingRuleRecord = {
    val __obj = js.Dynamic.literal()
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt.asInstanceOf[js.Any])
    if (ModifiedAt != null) __obj.updateDynamic("ModifiedAt")(ModifiedAt.asInstanceOf[js.Any])
    if (SamplingRule != null) __obj.updateDynamic("SamplingRule")(SamplingRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[SamplingRuleRecord]
  }
}

