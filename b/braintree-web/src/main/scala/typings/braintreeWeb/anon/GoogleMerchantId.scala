package typings.braintreeWeb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleMerchantId extends StObject {
  
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
  implicit class GoogleMerchantIdMutableBuilder[Self <: GoogleMerchantId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorization(value: String): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizationUndefined: Self = StObject.set(x, "authorization", js.undefined)
    
    @scala.inline
    def setClient(value: typings.braintreeWeb.clientMod.Client): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
    
    @scala.inline
    def setGoogleMerchantId(value: String): Self = StObject.set(x, "googleMerchantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoogleMerchantIdUndefined: Self = StObject.set(x, "googleMerchantId", js.undefined)
    
    @scala.inline
    def setGooglePayVersion(value: Double): Self = StObject.set(x, "googlePayVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGooglePayVersionUndefined: Self = StObject.set(x, "googlePayVersion", js.undefined)
    
    @scala.inline
    def setUseDeferredClient(value: Boolean): Self = StObject.set(x, "useDeferredClient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseDeferredClientUndefined: Self = StObject.set(x, "useDeferredClient", js.undefined)
  }
}
