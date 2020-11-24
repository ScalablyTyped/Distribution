package typings.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FacilitatorDetails extends js.Object {
  
  var oauthApplicationClientId: String = js.native
  
  var oauthApplicationName: String = js.native
  
  var sourcePaymentMethodToken: String = js.native
}
object FacilitatorDetails {
  
  @scala.inline
  def apply(oauthApplicationClientId: String, oauthApplicationName: String, sourcePaymentMethodToken: String): FacilitatorDetails = {
    val __obj = js.Dynamic.literal(oauthApplicationClientId = oauthApplicationClientId.asInstanceOf[js.Any], oauthApplicationName = oauthApplicationName.asInstanceOf[js.Any], sourcePaymentMethodToken = sourcePaymentMethodToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[FacilitatorDetails]
  }
  
  @scala.inline
  implicit class FacilitatorDetailsOps[Self <: FacilitatorDetails] (val x: Self) extends AnyVal {
    
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
    def setOauthApplicationClientId(value: String): Self = this.set("oauthApplicationClientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOauthApplicationName(value: String): Self = this.set("oauthApplicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcePaymentMethodToken(value: String): Self = this.set("sourcePaymentMethodToken", value.asInstanceOf[js.Any])
  }
}
