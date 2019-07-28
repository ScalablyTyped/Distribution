package typings.coinbase.coinbaseMod

import typings.coinbase.coinbaseStrings.deposit
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("coinbase", "Deposit")
@js.native
class Deposit () extends Resource {
  /**
    * Amount
    */
  var amount: MoneyHash = js.native
  /**
    * Has this deposit been committed?
    */
  var committed: Boolean = js.native
  /**
    * ISO timestamp (sometimes needs additional permissions)
    */
  var created_at: js.UndefOr[String] = js.native
  /**
    * Fee associated to this deposit
    */
  var fee: MoneyHash = js.native
  /**
    * Resource ID
    */
  var id: String = js.native
  /**
    * Associated payment method (e.g. a bank)
    */
  var payment_method: ResourceRef = js.native
  /**
    * When a deposit isn’t executed instantly, it will receive a payout date for the time it will be executed. ISO timestamp
    */
  var payout_at: js.UndefOr[String] = js.native
  /**
    * Resource type
    */
  /* CompleteClass */
  override var resource: ResourceType = js.native
  @JSName("resource")
  var resource_Deposit: deposit = js.native
  /**
    * REST endpoint
    */
  var resource_path: String = js.native
  /**
    * Status of the deposit. Currently available values: created, completed, canceled
    */
  var status: DepositStatus = js.native
  /**
    * Amount without fees
    */
  var subtotal: MoneyHash = js.native
  /**
    * Associated transaction (e.g. a bank, fiat account)
    */
  var transaction: ResourceRef = js.native
  /**
    * ISO timestamp (sometimes needs additional permissions)
    */
  var updated_at: js.UndefOr[String] = js.native
  /**
    * Completes a deposit that is created in commit: false state.
    * Scope: wallet:deposits:create
    */
  def commit(cb: js.Function2[/* error */ Error | Null, /* result */ this.type, Unit]): Unit = js.native
}

