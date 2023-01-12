package typings.coinbase.mod

import typings.coinbase.coinbaseStrings.transfer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransferMoneyOpts extends StObject {
  
  /**
    * Amount to be transferred
    */
  var amount: String
  
  /**
    * Currency for the amount (see Client#getCurrencies() for available strings)
    */
  var currency: String
  
  /**
    * Notes to be included in the transfer
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * ID of the receiving account
    */
  var to: String
  
  /**
    * Type transfer is required when transferring bitcoin or ethereum between accounts
    */
  var `type`: transfer
}
object TransferMoneyOpts {
  
  inline def apply(amount: String, currency: String, to: String): TransferMoneyOpts = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("transfer")
    __obj.asInstanceOf[TransferMoneyOpts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransferMoneyOpts] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setType(value: transfer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
