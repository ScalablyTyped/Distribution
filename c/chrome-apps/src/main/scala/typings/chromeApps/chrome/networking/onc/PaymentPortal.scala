package typings.chromeApps.chrome.networking.onc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaymentPortal extends js.Object {
  
  /** The HTTP method to use for the payment portal. */
  var Method: String = js.native
  
  /** The payment portal URL. */
  var Url: js.UndefOr[String] = js.native
}
object PaymentPortal {
  
  @scala.inline
  def apply(Method: String): PaymentPortal = {
    val __obj = js.Dynamic.literal(Method = Method.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentPortal]
  }
  
  @scala.inline
  implicit class PaymentPortalOps[Self <: PaymentPortal] (val x: Self) extends AnyVal {
    
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
    def setMethod(value: String): Self = this.set("Method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("Url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("Url", js.undefined)
  }
}
