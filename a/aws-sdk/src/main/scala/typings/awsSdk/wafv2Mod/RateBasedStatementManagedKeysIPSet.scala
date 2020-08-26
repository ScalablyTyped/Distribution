package typings.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RateBasedStatementManagedKeysIPSet extends js.Object {
  /**
    * The IP addresses that are currently blocked.
    */
  var Addresses: js.UndefOr[IPAddresses] = js.native
  var IPAddressVersion: js.UndefOr[typings.awsSdk.wafv2Mod.IPAddressVersion] = js.native
}

object RateBasedStatementManagedKeysIPSet {
  @scala.inline
  def apply(): RateBasedStatementManagedKeysIPSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RateBasedStatementManagedKeysIPSet]
  }
  @scala.inline
  implicit class RateBasedStatementManagedKeysIPSetOps[Self <: RateBasedStatementManagedKeysIPSet] (val x: Self) extends AnyVal {
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
    def setAddressesVarargs(value: IPAddress*): Self = this.set("Addresses", js.Array(value :_*))
    @scala.inline
    def setAddresses(value: IPAddresses): Self = this.set("Addresses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddresses: Self = this.set("Addresses", js.undefined)
    @scala.inline
    def setIPAddressVersion(value: IPAddressVersion): Self = this.set("IPAddressVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIPAddressVersion: Self = this.set("IPAddressVersion", js.undefined)
  }
  
}

