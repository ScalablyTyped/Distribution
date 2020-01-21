package typings.coinbase.mod

import typings.coinbase.coinbaseStrings.transaction
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("coinbase", "Transaction")
@js.native
class Transaction () extends Resource {
  /**
    * Account associated with the transaction
    */
  var account: Account = js.native
  /**
    * Associated bitcoin, litecoin or ethereum address for received payment
    */
  var address: js.UndefOr[Address] = js.native
  /**
    * Amount in bitcoin, litecoin or ethereum
    */
  var amount: MoneyHash = js.native
  /**
    * Associated OAuth2 application
    */
  var application: js.UndefOr[js.Any] = js.native
  /**
    * User defined description
    */
  var description: String = js.native
  /**
    * Detailed information about the transaction
    */
  var details: js.Any = js.native
  /**
    * The originating party of a credit transaction. Usually another resource but can also be another type like bitcoin network.
    * Only available for certain types of transactions
    */
  var from: js.UndefOr[ResourceRef | String] = js.native
  /**
    * Indicator if the transaction was instant exchanged (received into a bitcoin address for a fiat account)
    */
  var instant_exchange: Boolean = js.native
  /**
    * Amount in user's native currency
    */
  var native_amount: MoneyHash = js.native
  /**
    * Information about bitcoin, litecoin or ethereum network including network transaction hash if transaction was on-blockchain.
    * Only available for certain types of transactions
    */
  var network: js.UndefOr[js.Any] = js.native
  /**
    * Resource type
    */
  /* CompleteClass */
  override var resource: ResourceType = js.native
  /**
    * Constant "transaction"
    */
  @JSName("resource")
  var resource_Transaction: transaction = js.native
  /**
    * Transaction status
    */
  var status: TransactionStatus = js.native
  /**
    * The receiving party of a debit transaction. Usually another resource but can also be another type like email.
    * Only available for certain types of transactions
    */
  var to: js.UndefOr[ResourceRef | String] = js.native
  /**
    * Transaction type
    */
  var `type`: TransactionType = js.native
  /**
    * Lets a user cancel a money request. Money requests can be canceled by the sender or the recipient.
    * Scope: wallet:transactions:request
    */
  def cancel(cb: js.Function2[/* error */ Error | Null, /* result */ this.type, Unit]): Unit = js.native
  /**
    * Lets the recipient of a money request complete the request by sending money to the user who requested the money.
    * This can only be completed by the user to whom the request was made, not the user who sent the request.
    * Scope: wallet:transactions:request
    */
  def complete(cb: js.Function2[/* error */ Error | Null, /* result */ this.type, Unit]): Unit = js.native
  /**
    * Lets the user resend a money request. This will notify recipient with a new email.
    * Scope: wallet:transactions:request
    */
  def resend(cb: js.Function2[/* error */ Error | Null, /* result */ this.type, Unit]): Unit = js.native
}

