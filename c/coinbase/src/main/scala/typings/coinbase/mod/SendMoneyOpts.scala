package typings.coinbase.mod

import typings.coinbase.coinbaseStrings.send
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendMoneyOpts extends StObject {
  
  /**
    * Amount to be sent
    */
  var amount: String
  
  /**
    * Currency for the amount (see Client#getCurrencies() for available strings)
    */
  var currency: String
  
  /**
    * Notes to be included in the email that the recipient receives
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Transaction fee in BTC/ETH/LTC if you would like to pay it. Fees can be added as a string, such as 0.0005
    */
  var fee: js.UndefOr[String] = js.undefined
  
  /**
    * The website of the financial institution or exchange. Required if to_financial_institution is true.
    */
  var financial_institution_website: js.UndefOr[String] = js.undefined
  
  /**
    * *Recommended* A token to ensure idempotence. If a previous transaction with the same idem parameter already exists for this sender,
    * that previous transaction will be returned and a new one will not be created. Max length 100 characters
    */
  var idem: js.UndefOr[String] = js.undefined
  
  /**
    * Don’t send notification emails for small amounts (e.g. tips)
    */
  var skip_notifications: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A bitcoin address, litecoin address, ethereum address, or an email of the recipient
    */
  var to: String
  
  /**
    * Whether this send is to another financial institution or exchange. Required if this send is to an address and is valued at over USD$3000.
    */
  var to_financial_institution: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Type send is required when sending money
    */
  var `type`: send
}
object SendMoneyOpts {
  
  @scala.inline
  def apply(amount: String, currency: String, to: String): SendMoneyOpts = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("send")
    __obj.asInstanceOf[SendMoneyOpts]
  }
  
  @scala.inline
  implicit class SendMoneyOptsMutableBuilder[Self <: SendMoneyOpts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setFee(value: String): Self = StObject.set(x, "fee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeeUndefined: Self = StObject.set(x, "fee", js.undefined)
    
    @scala.inline
    def setFinancial_institution_website(value: String): Self = StObject.set(x, "financial_institution_website", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinancial_institution_websiteUndefined: Self = StObject.set(x, "financial_institution_website", js.undefined)
    
    @scala.inline
    def setIdem(value: String): Self = StObject.set(x, "idem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdemUndefined: Self = StObject.set(x, "idem", js.undefined)
    
    @scala.inline
    def setSkip_notifications(value: Boolean): Self = StObject.set(x, "skip_notifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkip_notificationsUndefined: Self = StObject.set(x, "skip_notifications", js.undefined)
    
    @scala.inline
    def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo_financial_institution(value: Boolean): Self = StObject.set(x, "to_financial_institution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo_financial_institutionUndefined: Self = StObject.set(x, "to_financial_institution", js.undefined)
    
    @scala.inline
    def setType(value: send): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
