package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ByoipCidr extends js.Object {
  /**
    * The address range, in CIDR notation.
    */
  var Cidr: js.UndefOr[String] = js.native
  /**
    * The description of the address range.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The state of the address pool.
    */
  var State: js.UndefOr[ByoipCidrState] = js.native
  /**
    * Upon success, contains the ID of the address pool. Otherwise, contains an error message.
    */
  var StatusMessage: js.UndefOr[String] = js.native
}

object ByoipCidr {
  @scala.inline
  def apply(): ByoipCidr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ByoipCidr]
  }
  @scala.inline
  implicit class ByoipCidrOps[Self <: ByoipCidr] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCidr(value: String): Self = this.set("Cidr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCidr: Self = this.set("Cidr", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setState(value: ByoipCidrState): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    @scala.inline
    def setStatusMessage(value: String): Self = this.set("StatusMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusMessage: Self = this.set("StatusMessage", js.undefined)
  }
  
}

