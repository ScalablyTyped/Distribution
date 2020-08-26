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
  def apply(): GetRateBasedRuleManagedKeysResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRateBasedRuleManagedKeysResponse]
  }
  @scala.inline
  implicit class GetRateBasedRuleManagedKeysResponseOps[Self <: GetRateBasedRuleManagedKeysResponse] (val x: Self) extends AnyVal {
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
    def setManagedKeysVarargs(value: ManagedKey*): Self = this.set("ManagedKeys", js.Array(value :_*))
    @scala.inline
    def setManagedKeys(value: ManagedKeys): Self = this.set("ManagedKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManagedKeys: Self = this.set("ManagedKeys", js.undefined)
    @scala.inline
    def setNextMarker(value: NextMarker): Self = this.set("NextMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextMarker: Self = this.set("NextMarker", js.undefined)
  }
  
}

