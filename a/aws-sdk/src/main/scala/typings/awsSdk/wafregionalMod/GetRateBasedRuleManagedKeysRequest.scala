package typings.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRateBasedRuleManagedKeysRequest extends js.Object {
  /**
    * A null value and not currently used. Do not include this in your request.
    */
  var NextMarker: js.UndefOr[typings.awsSdk.wafregionalMod.NextMarker] = js.native
  /**
    * The RuleId of the RateBasedRule for which you want to get a list of ManagedKeys. RuleId is returned by CreateRateBasedRule and by ListRateBasedRules.
    */
  var RuleId: ResourceId = js.native
}

object GetRateBasedRuleManagedKeysRequest {
  @scala.inline
  def apply(RuleId: ResourceId, NextMarker: NextMarker = null): GetRateBasedRuleManagedKeysRequest = {
    val __obj = js.Dynamic.literal(RuleId = RuleId.asInstanceOf[js.Any])
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRateBasedRuleManagedKeysRequest]
  }
}

