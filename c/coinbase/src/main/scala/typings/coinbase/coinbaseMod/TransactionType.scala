package typings.coinbase.coinbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.coinbase.coinbaseStrings.send
  - typings.coinbase.coinbaseStrings.request
  - typings.coinbase.coinbaseStrings.transfer
  - typings.coinbase.coinbaseStrings.buy
  - typings.coinbase.coinbaseStrings.sell
  - typings.coinbase.coinbaseStrings.fiat_deposit
  - typings.coinbase.coinbaseStrings.fiat_withdrawal
  - typings.coinbase.coinbaseStrings.exchange_deposit
  - typings.coinbase.coinbaseStrings.exchange_withdrawal
  - typings.coinbase.coinbaseStrings.vault_withdrawal
*/
trait TransactionType extends js.Object

object TransactionType {
  @scala.inline
  def buy: typings.coinbase.coinbaseStrings.buy = this.cast("buy")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def exchange_deposit: typings.coinbase.coinbaseStrings.exchange_deposit = this.cast("exchange_deposit")
  @scala.inline
  def exchange_withdrawal: typings.coinbase.coinbaseStrings.exchange_withdrawal = this.cast("exchange_withdrawal")
  @scala.inline
  def fiat_deposit: typings.coinbase.coinbaseStrings.fiat_deposit = this.cast("fiat_deposit")
  @scala.inline
  def fiat_withdrawal: typings.coinbase.coinbaseStrings.fiat_withdrawal = this.cast("fiat_withdrawal")
  @scala.inline
  def request: typings.coinbase.coinbaseStrings.request = this.cast("request")
  @scala.inline
  def sell: typings.coinbase.coinbaseStrings.sell = this.cast("sell")
  @scala.inline
  def send: typings.coinbase.coinbaseStrings.send = this.cast("send")
  @scala.inline
  def transfer: typings.coinbase.coinbaseStrings.transfer = this.cast("transfer")
  @scala.inline
  def vault_withdrawal: typings.coinbase.coinbaseStrings.vault_withdrawal = this.cast("vault_withdrawal")
}

