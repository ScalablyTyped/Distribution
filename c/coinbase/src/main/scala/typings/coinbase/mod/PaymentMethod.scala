package typings.coinbase.mod

import typings.coinbase.coinbaseStrings.payment_method
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentMethod
  extends StObject
     with Resource {
  
  /**
    * Is buying allowed with this method?
    */
  var allow_buy: Boolean
  
  /**
    * Is selling allowed with this method?
    */
  var allow_sell: Boolean
  
  /**
    * Payment method’s native currency (see Client#getCurrencies() for available strings)
    */
  var currency: String
  
  /**
    * Does this method allow for instant buys?
    */
  var instant_buy: Boolean
  
  /**
    * Does this method allow for instant sells?
    */
  var instant_sell: Boolean
  
  /**
    * If the user has obtained optional wallet:payment-methods:limits permission, an additional field, limits, will be embedded into payment
    * method data. It will contain information about buy, instant buy, sell and deposit limits (there’s no limits for withdrawals at this time).
    * As each one of these can have several limits you should always look for the lowest remaining value when performing the relevant action.
    */
  var limits: js.UndefOr[PaymentMethodLimits] = js.undefined
  
  /**
    * Method name
    */
  var name: String
  
  /**
    * Is primary buying method?
    */
  var primary_buy: Boolean
  
  /**
    * Is primary selling method?
    */
  var primary_sell: Boolean
  
  /**
    * Resource type, constant "payment_method"
    */
  @JSName("resource")
  var resource_PaymentMethod: payment_method
  
  /**
    * Payment method type
    */
  var `type`: PaymentMethodType
}
object PaymentMethod {
  
  @scala.inline
  def apply(
    allow_buy: Boolean,
    allow_sell: Boolean,
    currency: String,
    instant_buy: Boolean,
    instant_sell: Boolean,
    name: String,
    primary_buy: Boolean,
    primary_sell: Boolean,
    `type`: PaymentMethodType
  ): PaymentMethod = {
    val __obj = js.Dynamic.literal(allow_buy = allow_buy.asInstanceOf[js.Any], allow_sell = allow_sell.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], instant_buy = instant_buy.asInstanceOf[js.Any], instant_sell = instant_sell.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], primary_buy = primary_buy.asInstanceOf[js.Any], primary_sell = primary_sell.asInstanceOf[js.Any], resource = "payment_method")
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethod]
  }
  
  @scala.inline
  implicit class PaymentMethodMutableBuilder[Self <: PaymentMethod] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllow_buy(value: Boolean): Self = StObject.set(x, "allow_buy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllow_sell(value: Boolean): Self = StObject.set(x, "allow_sell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstant_buy(value: Boolean): Self = StObject.set(x, "instant_buy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstant_sell(value: Boolean): Self = StObject.set(x, "instant_sell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimits(value: PaymentMethodLimits): Self = StObject.set(x, "limits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitsUndefined: Self = StObject.set(x, "limits", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimary_buy(value: Boolean): Self = StObject.set(x, "primary_buy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimary_sell(value: Boolean): Self = StObject.set(x, "primary_sell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResource(value: payment_method): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: PaymentMethodType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
