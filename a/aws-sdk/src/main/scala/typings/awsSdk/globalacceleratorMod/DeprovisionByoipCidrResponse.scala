package typings.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeprovisionByoipCidrResponse extends js.Object {
  /**
    * Information about the address range.
    */
  var ByoipCidr: js.UndefOr[typings.awsSdk.globalacceleratorMod.ByoipCidr] = js.native
}

object DeprovisionByoipCidrResponse {
  @scala.inline
  def apply(): DeprovisionByoipCidrResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeprovisionByoipCidrResponse]
  }
  @scala.inline
  implicit class DeprovisionByoipCidrResponseOps[Self <: DeprovisionByoipCidrResponse] (val x: Self) extends AnyVal {
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
    def setByoipCidr(value: ByoipCidr): Self = this.set("ByoipCidr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteByoipCidr: Self = this.set("ByoipCidr", js.undefined)
  }
  
}

