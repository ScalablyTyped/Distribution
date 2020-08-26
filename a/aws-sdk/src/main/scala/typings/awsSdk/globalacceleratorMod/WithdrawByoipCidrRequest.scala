package typings.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WithdrawByoipCidrRequest extends js.Object {
  /**
    * The address range, in CIDR notation.
    */
  var Cidr: GenericString = js.native
}

object WithdrawByoipCidrRequest {
  @scala.inline
  def apply(Cidr: GenericString): WithdrawByoipCidrRequest = {
    val __obj = js.Dynamic.literal(Cidr = Cidr.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithdrawByoipCidrRequest]
  }
  @scala.inline
  implicit class WithdrawByoipCidrRequestOps[Self <: WithdrawByoipCidrRequest] (val x: Self) extends AnyVal {
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
    def setCidr(value: GenericString): Self = this.set("Cidr", value.asInstanceOf[js.Any])
  }
  
}

