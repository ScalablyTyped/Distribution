package typings.coinbase.mod

import typings.coinbase.coinbaseStrings.transfer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransferMoneyOpts extends StObject {
  
  /**
    * Amount to be transferred
    */
  var amount: String = js.native
  
  /**
    * Currency for the amount (see Client#getCurrencies() for available strings)
    */
  var currency: String = js.native
  
  /**
    * Notes to be included in the transfer
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * ID of the receiving account
    */
  var to: String = js.native
  
  /**
    * Type transfer is required when transferring bitcoin or ethereum between accounts
    */
  var `type`: transfer = js.native
}
object TransferMoneyOpts {
  
  @scala.inline
  def apply(amount: String, currency: String, to: String, `type`: transfer): TransferMoneyOpts = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferMoneyOpts]
  }
  
  @scala.inline
  implicit class TransferMoneyOptsMutableBuilder[Self <: TransferMoneyOpts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: transfer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
