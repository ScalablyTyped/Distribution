package typings.braintreeWeb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cspnonce extends StObject {
  
  /**
    * CSP nonce used for rendering the button.
    */
  var `csp-nonce`: js.UndefOr[String] = js.undefined
  
  /**
    * Client token used for identifying your buyers.
    */
  var `data-client-token`: js.UndefOr[String] = js.undefined
  
  /**
    * Order ID used for optimizing the funding that displays.
    */
  var `data-order-id`: js.UndefOr[String] = js.undefined
  
  /**
    * Log page type and interactions for the JavaScript SDK.
    */
  var `data-page-type`: js.UndefOr[String] = js.undefined
  
  /**
    * Partner attribution ID used for revenue attribution.
    */
  var `data-partner-attribution-id`: js.UndefOr[String] = js.undefined
}
object Cspnonce {
  
  inline def apply(): Cspnonce = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cspnonce]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cspnonce] (val x: Self) extends AnyVal {
    
    inline def `setCsp-nonce`(value: String): Self = StObject.set(x, "csp-nonce", value.asInstanceOf[js.Any])
    
    inline def `setCsp-nonceUndefined`: Self = StObject.set(x, "csp-nonce", js.undefined)
    
    inline def `setData-client-token`(value: String): Self = StObject.set(x, "data-client-token", value.asInstanceOf[js.Any])
    
    inline def `setData-client-tokenUndefined`: Self = StObject.set(x, "data-client-token", js.undefined)
    
    inline def `setData-order-id`(value: String): Self = StObject.set(x, "data-order-id", value.asInstanceOf[js.Any])
    
    inline def `setData-order-idUndefined`: Self = StObject.set(x, "data-order-id", js.undefined)
    
    inline def `setData-page-type`(value: String): Self = StObject.set(x, "data-page-type", value.asInstanceOf[js.Any])
    
    inline def `setData-page-typeUndefined`: Self = StObject.set(x, "data-page-type", js.undefined)
    
    inline def `setData-partner-attribution-id`(value: String): Self = StObject.set(x, "data-partner-attribution-id", value.asInstanceOf[js.Any])
    
    inline def `setData-partner-attribution-idUndefined`: Self = StObject.set(x, "data-partner-attribution-id", js.undefined)
  }
}
