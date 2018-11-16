package typings
package coinbaseLib.coinbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("coinbase", "Withdrawal")
@js.native
class Withdrawal () extends Resource {
  /**
       * Amount
       */
  var amount: MoneyHash = js.native
  /**
       * Has this withdrawal been committed?
       */
  var committed: scala.Boolean = js.native
  /**
       * ISO timestamp (sometimes needs additional permissions)
       */
  var created_at: js.UndefOr[java.lang.String] = js.native
  /**
       * Fee associated to this withdrawal
       */
  var fee: MoneyHash = js.native
  /**
       * Resource ID
       */
  var id: java.lang.String = js.native
  /**
       * Associated payment method (e.g. a bank)
       */
  var payment_method: ResourceRef = js.native
  /**
       * When a withdrawal isn’t executed instantly, it will receive a payout date for the time it will be executed. ISO timestamp
       */
  var payout_at: js.UndefOr[java.lang.String] = js.native
  /**
       * Resource type
       */
  /* CompleteClass */
  override var resource: ResourceType = js.native
  @JSName("resource")
  var resource_Withdrawal: coinbaseLib.coinbaseLibStrings.deposit = js.native
  /**
       * REST endpoint
       */
  var resource_path: java.lang.String = js.native
  /**
       * Status of the deposit. Currently available values: created, completed, canceled
       */
  var status: WithdrawalStatus = js.native
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
  var updated_at: js.UndefOr[java.lang.String] = js.native
  /**
       * Completes a withdrawal that is created in commit: false state.
       * Scope: wallet:withdrawals:create
       */
  def commit(cb: js.Function2[/* error */ stdLib.Error, /* result */ this.type, scala.Unit]): scala.Unit = js.native
}

