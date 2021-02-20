package typings.coinbase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSellPriceOpts extends StObject {
  
  /**
    * Currency pair, e.g. 'BTC-USD'
    */
  var currencyPair: String = js.native
}
object GetSellPriceOpts {
  
  @scala.inline
  def apply(currencyPair: String): GetSellPriceOpts = {
    val __obj = js.Dynamic.literal(currencyPair = currencyPair.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSellPriceOpts]
  }
  
  @scala.inline
  implicit class GetSellPriceOptsMutableBuilder[Self <: GetSellPriceOpts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrencyPair(value: String): Self = StObject.set(x, "currencyPair", value.asInstanceOf[js.Any])
  }
}
