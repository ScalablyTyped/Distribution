package typings.coinbaseCommerceNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Pricing object.
  */
trait Pricing
  extends StObject
     with CryptoPricing {
  
  var local: Price[FiatCurrency]
}
object Pricing {
  
  inline def apply(local: Price[FiatCurrency]): Pricing = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pricing]
  }
  
  extension [Self <: Pricing](x: Self) {
    
    inline def setLocal(value: Price[FiatCurrency]): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
  }
}
