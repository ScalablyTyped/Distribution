package typings.coinbase.mod

import typings.coinbase.coinbaseStrings.buy
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("coinbase", "Buy")
@js.native
class Buy () extends Resource {
  
  /**
    * Amount in bitcoin, litecoin or ethereum
    */
  var amount: MoneyHash = js.native
  
  /**
    * Completes a buy that is created in commit: false state.
    * If the exchange rate has changed since the buy was created, this call will fail with the error “The exchange rate updated while you
    * were waiting. The new total is shown below”. The buy’s total will also be updated. You can repeat the `commit` call to accept the new
    * values and start the buy at the new rates.
    * Scope: wallet:buys:create
    */
  def commit(cb: js.Function2[/* error */ Error | Null, /* result */ this.type, Unit]): Unit = js.native
  
  /**
    * Has this buy been committed?
    */
  var committed: Boolean = js.native
  
  /**
    * ISO timestamp
    */
  var created_at: String = js.native
  
  /**
    * Fees associated to this buy
    */
  var fees: js.Array[Fee] = js.native
  
  /**
    * Hold period for transfer.
    */
  var hold_business_days: Double = js.native
  
  /**
    * Transfer identifier
    */
  var id: String = js.native
  
  /**
    * Was this buy executed instantly?
    */
  var instant: Boolean = js.native
  
  /**
    * Is it the first buy for this symbol?
    */
  var is_first_buy: Boolean = js.native
  
  /**
    * Associated payment method (e.g. a bank, fiat account)
    */
  var payment_method: ResourceRef = js.native
  
  /**
    * When a buy isn’t executed instantly, it will receive a payout date for the time it will be executed. ISO timestamp
    */
  var payout_at: js.UndefOr[String] = js.native
  
  /**
    * Is there another action required to make the transfer pass?
    */
  var requires_completion_step: Boolean = js.native
  
  /**
    * Constant "buy"
    */
  @JSName("resource")
  var resource_Buy: buy = js.native
  
  /**
    * Status
    */
  var status: BuyStatus = js.native
  
  /**
    * Fiat amount without fees
    */
  var subtotal: MoneyHash = js.native
  
  /**
    * Fiat amount with fees
    */
  var total: MoneyHash = js.native
  
  /**
    * Associated transaction (e.g. a bank, fiat account)
    */
  var transaction: ResourceRef | Null = js.native
  
  /**
    * Unit price of the base currency.
    */
  var unit_price: UnitPrice = js.native
  
  /**
    * ISO timestamp
    */
  var updated_at: String = js.native
  
  /**
    * Reference code shown in user's dashboard.
    */
  var user_reference: String = js.native
}
