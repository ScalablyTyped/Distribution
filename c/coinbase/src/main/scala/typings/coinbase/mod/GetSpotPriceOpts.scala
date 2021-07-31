package typings.coinbase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSpotPriceOpts extends StObject {
  
  /**
    * Currency pair, e.g. 'BTC-USD'
    */
  var currencyPair: String
  
  /**
    * Specify date for historic spot price in format YYYY-MM-DD (UTC)
    */
  var date: js.UndefOr[String] = js.undefined
}
object GetSpotPriceOpts {
  
  @scala.inline
  def apply(currencyPair: String): GetSpotPriceOpts = {
    val __obj = js.Dynamic.literal(currencyPair = currencyPair.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSpotPriceOpts]
  }
  
  @scala.inline
  implicit class GetSpotPriceOptsMutableBuilder[Self <: GetSpotPriceOpts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrencyPair(value: String): Self = StObject.set(x, "currencyPair", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
  }
}
