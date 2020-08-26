package typings.braintreeWeb.venmoMod

import typings.braintreeWeb.anon.Username
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VenmoTokenizePayload extends js.Object {
  var details: Username = js.native
  var nonce: String = js.native
  var `type`: String = js.native
}

object VenmoTokenizePayload {
  @scala.inline
  def apply(details: Username, nonce: String, `type`: String): VenmoTokenizePayload = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VenmoTokenizePayload]
  }
  @scala.inline
  implicit class VenmoTokenizePayloadOps[Self <: VenmoTokenizePayload] (val x: Self) extends AnyVal {
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
    def setDetails(value: Username): Self = this.set("details", value.asInstanceOf[js.Any])
    @scala.inline
    def setNonce(value: String): Self = this.set("nonce", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

