package typings.coinbase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetExchangeRateOpts extends StObject {
  
  /**
    * Base currency, default USD
    */
  var currency: js.UndefOr[String] = js.undefined
}
object GetExchangeRateOpts {
  
  inline def apply(): GetExchangeRateOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetExchangeRateOpts]
  }
  
  extension [Self <: GetExchangeRateOpts](x: Self) {
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
  }
}
