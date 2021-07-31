package typings.coinbase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WithdrawOpts extends StObject {
  
  /**
    * Withdrawal amount
    */
  var amount: String
  
  /**
    * If set to false, this withdrawal will not be immediately completed. Use the commit call to complete it. Default value: true
    */
  var commit: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Currency for the amount (see Client#getCurrencies() for available strings)
    */
  var currency: String
  
  /**
    * The ID of the payment method that should be used for the buy. (todo get payment methods)
    */
  var payment_method: js.UndefOr[String] = js.undefined
}
object WithdrawOpts {
  
  @scala.inline
  def apply(amount: String, currency: String): WithdrawOpts = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithdrawOpts]
  }
  
  @scala.inline
  implicit class WithdrawOptsMutableBuilder[Self <: WithdrawOpts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommit(value: Boolean): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitUndefined: Self = StObject.set(x, "commit", js.undefined)
    
    @scala.inline
    def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayment_method(value: String): Self = StObject.set(x, "payment_method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayment_methodUndefined: Self = StObject.set(x, "payment_method", js.undefined)
  }
}
