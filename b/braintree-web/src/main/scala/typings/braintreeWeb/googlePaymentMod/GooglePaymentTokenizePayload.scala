package typings.braintreeWeb.googlePaymentMod

import typings.braintreeWeb.anon.Bin
import typings.braintreeWeb.anon.Commercial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GooglePaymentTokenizePayload extends js.Object {
  
  var binData: Commercial = js.native
  
  var description: String = js.native
  
  var details: Bin = js.native
  
  var nonce: String = js.native
  
  var `type`: String = js.native
}
object GooglePaymentTokenizePayload {
  
  @scala.inline
  def apply(binData: Commercial, description: String, details: Bin, nonce: String, `type`: String): GooglePaymentTokenizePayload = {
    val __obj = js.Dynamic.literal(binData = binData.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GooglePaymentTokenizePayload]
  }
  
  @scala.inline
  implicit class GooglePaymentTokenizePayloadOps[Self <: GooglePaymentTokenizePayload] (val x: Self) extends AnyVal {
    
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
    def setBinData(value: Commercial): Self = this.set("binData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetails(value: Bin): Self = this.set("details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonce(value: String): Self = this.set("nonce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
