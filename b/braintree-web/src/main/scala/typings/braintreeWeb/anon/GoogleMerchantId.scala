package typings.braintreeWeb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleMerchantId extends StObject {
  
  var authorization: js.UndefOr[String] = js.undefined
  
  var client: js.UndefOr[typings.braintreeWeb.modulesClientMod.Client] = js.undefined
  
  var googleMerchantId: js.UndefOr[String] = js.undefined
  
  var googlePayVersion: js.UndefOr[Double] = js.undefined
  
  var useDeferredClient: js.UndefOr[Boolean] = js.undefined
}
object GoogleMerchantId {
  
  inline def apply(): GoogleMerchantId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleMerchantId]
  }
  
  extension [Self <: GoogleMerchantId](x: Self) {
    
    inline def setAuthorization(value: String): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationUndefined: Self = StObject.set(x, "authorization", js.undefined)
    
    inline def setClient(value: typings.braintreeWeb.modulesClientMod.Client): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
    
    inline def setGoogleMerchantId(value: String): Self = StObject.set(x, "googleMerchantId", value.asInstanceOf[js.Any])
    
    inline def setGoogleMerchantIdUndefined: Self = StObject.set(x, "googleMerchantId", js.undefined)
    
    inline def setGooglePayVersion(value: Double): Self = StObject.set(x, "googlePayVersion", value.asInstanceOf[js.Any])
    
    inline def setGooglePayVersionUndefined: Self = StObject.set(x, "googlePayVersion", js.undefined)
    
    inline def setUseDeferredClient(value: Boolean): Self = StObject.set(x, "useDeferredClient", value.asInstanceOf[js.Any])
    
    inline def setUseDeferredClientUndefined: Self = StObject.set(x, "useDeferredClient", js.undefined)
  }
}
