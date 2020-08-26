package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputWhitelistRuleCidr extends js.Object {
  /**
    * The IPv4 CIDR to whitelist.
    */
  var Cidr: js.UndefOr[string] = js.native
}

object InputWhitelistRuleCidr {
  @scala.inline
  def apply(): InputWhitelistRuleCidr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputWhitelistRuleCidr]
  }
  @scala.inline
  implicit class InputWhitelistRuleCidrOps[Self <: InputWhitelistRuleCidr] (val x: Self) extends AnyVal {
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
    def setCidr(value: string): Self = this.set("Cidr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCidr: Self = this.set("Cidr", js.undefined)
  }
  
}

