package typings.coinbase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetExchangeRateOpts extends StObject {
  
  /**
    * Base currency, default USD
    */
  var currency: js.UndefOr[String] = js.native
}
object GetExchangeRateOpts {
  
  @scala.inline
  def apply(): GetExchangeRateOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetExchangeRateOpts]
  }
  
  @scala.inline
  implicit class GetExchangeRateOptsMutableBuilder[Self <: GetExchangeRateOpts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
  }
}
