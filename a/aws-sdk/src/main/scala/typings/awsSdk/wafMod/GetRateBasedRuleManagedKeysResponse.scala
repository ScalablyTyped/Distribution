package typings.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRateBasedRuleManagedKeysResponse extends js.Object {
  /**
    * An array of IP addresses that currently are blocked by the specified RateBasedRule. 
    */
  var ManagedKeys: js.UndefOr[typings.awsSdk.wafMod.ManagedKeys] = js.native
  /**
    * A null value and not currently used.
    */
  var NextMarker: js.UndefOr[typings.awsSdk.wafMod.NextMarker] = js.native
}

object GetRateBasedRuleManagedKeysResponse {
  @scala.inline
  def apply(ManagedKeys: ManagedKeys = null, NextMarker: NextMarker = null): GetRateBasedRuleManagedKeysResponse = {
    val __obj = js.Dynamic.literal()
    if (ManagedKeys != null) __obj.updateDynamic("ManagedKeys")(ManagedKeys.asInstanceOf[js.Any])
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRateBasedRuleManagedKeysResponse]
  }
}

