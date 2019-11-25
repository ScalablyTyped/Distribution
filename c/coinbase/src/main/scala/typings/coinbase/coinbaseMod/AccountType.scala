package typings.coinbase.coinbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.coinbase.coinbaseStrings.wallet
  - typings.coinbase.coinbaseStrings.fiat
  - typings.coinbase.coinbaseStrings.multisig
  - typings.coinbase.coinbaseStrings.vault
  - typings.coinbase.coinbaseStrings.multisig_vault
*/
trait AccountType extends js.Object

object AccountType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fiat: typings.coinbase.coinbaseStrings.fiat = this.cast("fiat")
  @scala.inline
  def multisig: typings.coinbase.coinbaseStrings.multisig = this.cast("multisig")
  @scala.inline
  def multisig_vault: typings.coinbase.coinbaseStrings.multisig_vault = this.cast("multisig_vault")
  @scala.inline
  def vault: typings.coinbase.coinbaseStrings.vault = this.cast("vault")
  @scala.inline
  def wallet: typings.coinbase.coinbaseStrings.wallet = this.cast("wallet")
}

