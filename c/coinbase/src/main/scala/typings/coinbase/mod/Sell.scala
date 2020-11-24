package typings.coinbase.mod

import typings.coinbase.coinbaseStrings.sell
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("coinbase", "Sell")
@js.native
class Sell () extends Resource {
  
  /**
    * Amount in bitcoin, litecoin or ethereum
    */
  var amount: MoneyHash = js.native
  
  /**
    * Completes a sell that is created in commit: false state.
    * If the exchange rate has changed since the sell was created, this call will fail with the error “The exchange rate updated while you
    * were waiting. The new total is shown below”. The buy’s total will also be updated. You can repeat the `commit` call to accept the new
    * values and start the buy at the new rates.
    * Scope: wallet:sells:create
    */
  def commit(cb: js.Function2[/* error */ Error | Null, /* result */ this.type, Unit]): Unit = js.native
  
  /**
    * Has this sell been committed?
    */
  var committed: Boolean = js.native
  
  /**
    * ISO timestamp
    */
  var created_at: String = js.native
  
  /**
    * Fees associated to this sell
    */
  var fees: js.Array[MoneyHash] = js.native
  
  /**
    * Transfer identifier
    */
  var id: String = js.native
  
  /**
    * Was this sell executed instantly?
    */
  var instant: Boolean = js.native
  
  /**
    * Associated payment method (e.g. a bank, fiat account)
    */
  var payment_method: ResourceRef = js.native
  
  /**
    * When a sell isn’t executed instantly, it will receive a payout date for the time it will be executed. ISO timestamp
    */
  var payout_at: js.UndefOr[String] = js.native
  
  /**
    * Constant "sell"
    */
  @JSName("resource")
  var resource_Sell: sell = js.native
  
  /**
    * Status of the sell. Currently available values: created, completed, canceled
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
    * ISO timestamp
    */
  var updated_at: String = js.native
  
  /**
    * Reference code shown in user's dashboard.
    */
  var user_reference: String = js.native
}
