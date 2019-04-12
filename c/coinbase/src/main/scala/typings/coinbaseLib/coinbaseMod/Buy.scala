package typings
package coinbaseLib.coinbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("coinbase", "Buy")
@js.native
class Buy () extends Resource {
  /**
    * Amount in bitcoin, litecoin or ethereum
    */
  var amount: MoneyHash = js.native
  /**
    * Has this buy been committed?
    */
  var committed: scala.Boolean = js.native
  /**
    * ISO timestamp
    */
  var created_at: java.lang.String = js.native
  /**
    * Fees associated to this buy
    */
  var fees: js.Array[Fee] = js.native
  /**
    * Hold period for transfer.
    */
  var hold_business_days: scala.Double = js.native
  /**
    * Transfer identifier
    */
  var id: java.lang.String = js.native
  /**
    * Was this buy executed instantly?
    */
  var instant: scala.Boolean = js.native
  /**
    * Is it the first buy for this symbol?
    */
  var is_first_buy: scala.Boolean = js.native
  /**
    * Associated payment method (e.g. a bank, fiat account)
    */
  var payment_method: ResourceRef = js.native
  /**
    * When a buy isn’t executed instantly, it will receive a payout date for the time it will be executed. ISO timestamp
    */
  var payout_at: js.UndefOr[java.lang.String] = js.native
  /**
    * Is there another action required to make the transfer pass?
    */
  var requires_completion_step: scala.Boolean = js.native
  /**
    * Resource type
    */
  /* CompleteClass */
  override var resource: ResourceType = js.native
  /**
    * Constant "buy"
    */
  @JSName("resource")
  var resource_Buy: coinbaseLib.coinbaseLibStrings.buy = js.native
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
  var transaction: ResourceRef | scala.Null = js.native
  /**
    * Unit price of the base currency.
    */
  var unit_price: UnitPrice = js.native
  /**
    * ISO timestamp
    */
  var updated_at: java.lang.String = js.native
  /**
    * Reference code shown in user's dashboard.
    */
  var user_reference: java.lang.String = js.native
  /**
    * Completes a buy that is created in commit: false state.
    * If the exchange rate has changed since the buy was created, this call will fail with the error “The exchange rate updated while you
    * were waiting. The new total is shown below”. The buy’s total will also be updated. You can repeat the `commit` call to accept the new
    * values and start the buy at the new rates.
    * Scope: wallet:buys:create
    */
  def commit(cb: js.Function2[/* error */ stdLib.Error | scala.Null, /* result */ this.type, scala.Unit]): scala.Unit = js.native
}

