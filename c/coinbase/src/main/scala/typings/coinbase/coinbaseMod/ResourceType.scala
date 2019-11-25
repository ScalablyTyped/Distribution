package typings.coinbase.coinbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.coinbase.coinbaseStrings.account
  - typings.coinbase.coinbaseStrings.transaction
  - typings.coinbase.coinbaseStrings.address
  - typings.coinbase.coinbaseStrings.user
  - typings.coinbase.coinbaseStrings.buy
  - typings.coinbase.coinbaseStrings.sell
  - typings.coinbase.coinbaseStrings.deposit
  - typings.coinbase.coinbaseStrings.withdrawal
  - typings.coinbase.coinbaseStrings.payment_method
*/
trait ResourceType extends js.Object

object ResourceType {
  @scala.inline
  def account: typings.coinbase.coinbaseStrings.account = this.cast("account")
  @scala.inline
  def address: typings.coinbase.coinbaseStrings.address = this.cast("address")
  @scala.inline
  def buy: typings.coinbase.coinbaseStrings.buy = this.cast("buy")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def deposit: typings.coinbase.coinbaseStrings.deposit = this.cast("deposit")
  @scala.inline
  def payment_method: typings.coinbase.coinbaseStrings.payment_method = this.cast("payment_method")
  @scala.inline
  def sell: typings.coinbase.coinbaseStrings.sell = this.cast("sell")
  @scala.inline
  def transaction: typings.coinbase.coinbaseStrings.transaction = this.cast("transaction")
  @scala.inline
  def user: typings.coinbase.coinbaseStrings.user = this.cast("user")
  @scala.inline
  def withdrawal: typings.coinbase.coinbaseStrings.withdrawal = this.cast("withdrawal")
}

