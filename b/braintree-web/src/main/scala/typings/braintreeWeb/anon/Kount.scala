package typings.braintreeWeb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Kount extends StObject {
  
  var client: typings.braintreeWeb.modulesClientMod.Client
  
  var kount: js.UndefOr[Boolean] = js.undefined
  
  var paypal: js.UndefOr[Boolean] = js.undefined
}
object Kount {
  
  inline def apply(client: typings.braintreeWeb.modulesClientMod.Client): Kount = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
    __obj.asInstanceOf[Kount]
  }
  
  extension [Self <: Kount](x: Self) {
    
    inline def setClient(value: typings.braintreeWeb.modulesClientMod.Client): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setKount(value: Boolean): Self = StObject.set(x, "kount", value.asInstanceOf[js.Any])
    
    inline def setKountUndefined: Self = StObject.set(x, "kount", js.undefined)
    
    inline def setPaypal(value: Boolean): Self = StObject.set(x, "paypal", value.asInstanceOf[js.Any])
    
    inline def setPaypalUndefined: Self = StObject.set(x, "paypal", js.undefined)
  }
}
