package typings.coinbase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SellOpts extends StObject {
  
  /**
    * Whether or not you would still like to sell if you have to wait for your money to arrive to lock in a price
    */
  var agree_btc_amount_varies: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sell amount without fees (alternative to total)
    */
  var amount: js.UndefOr[String] = js.undefined
  
  /**
    * If set to false, this sell will not be immediately completed. Use the commit call to complete it. Default value: true
    */
  var commit: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Currency for the amount (see Client#getCurrencies() for available strings)
    */
  var currency: String
  
  /**
    * The ID of the payment method that should be used for the sell.
    */
  var payment_method: js.UndefOr[String] = js.undefined
  
  /**
    * If set to true, response will return an unsave sell for detailed price quote. Default value: false
    */
  var quote: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sell amount with fees (alternative to amount)
    */
  var total: js.UndefOr[String] = js.undefined
}
object SellOpts {
  
  inline def apply(currency: String): SellOpts = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any])
    __obj.asInstanceOf[SellOpts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SellOpts] (val x: Self) extends AnyVal {
    
    inline def setAgree_btc_amount_varies(value: Boolean): Self = StObject.set(x, "agree_btc_amount_varies", value.asInstanceOf[js.Any])
    
    inline def setAgree_btc_amount_variesUndefined: Self = StObject.set(x, "agree_btc_amount_varies", js.undefined)
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setCommit(value: Boolean): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
    
    inline def setCommitUndefined: Self = StObject.set(x, "commit", js.undefined)
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setPayment_method(value: String): Self = StObject.set(x, "payment_method", value.asInstanceOf[js.Any])
    
    inline def setPayment_methodUndefined: Self = StObject.set(x, "payment_method", js.undefined)
    
    inline def setQuote(value: Boolean): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
    
    inline def setQuoteUndefined: Self = StObject.set(x, "quote", js.undefined)
    
    inline def setTotal(value: String): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
  }
}
