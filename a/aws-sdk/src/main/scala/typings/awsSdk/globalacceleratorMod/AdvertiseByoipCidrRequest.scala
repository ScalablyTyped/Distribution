package typings.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdvertiseByoipCidrRequest extends js.Object {
  /**
    * The address range, in CIDR notation. This must be the exact range that you provisioned. You can't advertise only a portion of the provisioned range.
    */
  var Cidr: GenericString = js.native
}

object AdvertiseByoipCidrRequest {
  @scala.inline
  def apply(Cidr: GenericString): AdvertiseByoipCidrRequest = {
    val __obj = js.Dynamic.literal(Cidr = Cidr.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdvertiseByoipCidrRequest]
  }
  @scala.inline
  implicit class AdvertiseByoipCidrRequestOps[Self <: AdvertiseByoipCidrRequest] (val x: Self) extends AnyVal {
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

