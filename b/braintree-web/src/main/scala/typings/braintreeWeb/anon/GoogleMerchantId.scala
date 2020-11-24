package typings.braintreeWeb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleMerchantId extends js.Object {
  
  var authorization: js.UndefOr[String] = js.native
  
  var client: js.UndefOr[typings.braintreeWeb.clientMod.Client] = js.native
  
  var googleMerchantId: js.UndefOr[String] = js.native
  
  var googlePayVersion: js.UndefOr[Double] = js.native
  
  var useDeferredClient: js.UndefOr[Boolean] = js.native
}
object GoogleMerchantId {
  
  @scala.inline
  def apply(): GoogleMerchantId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleMerchantId]
  }
  
  @scala.inline
  implicit class GoogleMerchantIdOps[Self <: GoogleMerchantId] (val x: Self) extends AnyVal {
    
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
    def setAuthorization(value: String): Self = this.set("authorization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorization: Self = this.set("authorization", js.undefined)
    
    @scala.inline
    def setClient(value: typings.braintreeWeb.clientMod.Client): Self = this.set("client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClient: Self = this.set("client", js.undefined)
    
    @scala.inline
    def setGoogleMerchantId(value: String): Self = this.set("googleMerchantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoogleMerchantId: Self = this.set("googleMerchantId", js.undefined)
    
    @scala.inline
    def setGooglePayVersion(value: Double): Self = this.set("googlePayVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGooglePayVersion: Self = this.set("googlePayVersion", js.undefined)
    
    @scala.inline
    def setUseDeferredClient(value: Boolean): Self = this.set("useDeferredClient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseDeferredClient: Self = this.set("useDeferredClient", js.undefined)
  }
}
