package typings.coinbase.coinbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.coinbase.coinbaseStrings.ach_bank_account
  - typings.coinbase.coinbaseStrings.sepa_bank_account
  - typings.coinbase.coinbaseStrings.ideal_bank_account
  - typings.coinbase.coinbaseStrings.fiat_account
  - typings.coinbase.coinbaseStrings.bank_wire
  - typings.coinbase.coinbaseStrings.credit_card
  - typings.coinbase.coinbaseStrings.secure3d_card
  - typings.coinbase.coinbaseStrings.eft_bank_account
  - typings.coinbase.coinbaseStrings.interac
*/
trait PaymentMethodType extends js.Object

object PaymentMethodType {
  @scala.inline
  def ach_bank_account: typings.coinbase.coinbaseStrings.ach_bank_account = this.cast("ach_bank_account")
  @scala.inline
  def bank_wire: typings.coinbase.coinbaseStrings.bank_wire = this.cast("bank_wire")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def credit_card: typings.coinbase.coinbaseStrings.credit_card = this.cast("credit_card")
  @scala.inline
  def eft_bank_account: typings.coinbase.coinbaseStrings.eft_bank_account = this.cast("eft_bank_account")
  @scala.inline
  def fiat_account: typings.coinbase.coinbaseStrings.fiat_account = this.cast("fiat_account")
  @scala.inline
  def ideal_bank_account: typings.coinbase.coinbaseStrings.ideal_bank_account = this.cast("ideal_bank_account")
  @scala.inline
  def interac: typings.coinbase.coinbaseStrings.interac = this.cast("interac")
  @scala.inline
  def secure3d_card: typings.coinbase.coinbaseStrings.secure3d_card = this.cast("secure3d_card")
  @scala.inline
  def sepa_bank_account: typings.coinbase.coinbaseStrings.sepa_bank_account = this.cast("sepa_bank_account")
}

