package typings
package coinbaseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object coinbaseMod {
  type AccountType = coinbaseLib.coinbaseLibStrings.wallet | coinbaseLib.coinbaseLibStrings.fiat | coinbaseLib.coinbaseLibStrings.multisig | coinbaseLib.coinbaseLibStrings.vault | coinbaseLib.coinbaseLibStrings.multisig_vault
  type BuyStatus = coinbaseLib.coinbaseLibStrings.created | coinbaseLib.coinbaseLibStrings.completed | coinbaseLib.coinbaseLibStrings.canceled
  type DepositStatus = coinbaseLib.coinbaseLibStrings.created | coinbaseLib.coinbaseLibStrings.completed | coinbaseLib.coinbaseLibStrings.canceled
  type PaymentMethodType = coinbaseLib.coinbaseLibStrings.ach_bank_account | coinbaseLib.coinbaseLibStrings.sepa_bank_account | coinbaseLib.coinbaseLibStrings.ideal_bank_account | coinbaseLib.coinbaseLibStrings.fiat_account | coinbaseLib.coinbaseLibStrings.bank_wire | coinbaseLib.coinbaseLibStrings.credit_card | coinbaseLib.coinbaseLibStrings.secure3d_card | coinbaseLib.coinbaseLibStrings.eft_bank_account | coinbaseLib.coinbaseLibStrings.interac
  type ResourceType = coinbaseLib.coinbaseLibStrings.account | coinbaseLib.coinbaseLibStrings.transaction | coinbaseLib.coinbaseLibStrings.address | coinbaseLib.coinbaseLibStrings.user | coinbaseLib.coinbaseLibStrings.buy | coinbaseLib.coinbaseLibStrings.sell | coinbaseLib.coinbaseLibStrings.deposit | coinbaseLib.coinbaseLibStrings.withdrawal | coinbaseLib.coinbaseLibStrings.payment_method
  type SellStatus = coinbaseLib.coinbaseLibStrings.created | coinbaseLib.coinbaseLibStrings.completed | coinbaseLib.coinbaseLibStrings.canceled
  type TransactionStatus = coinbaseLib.coinbaseLibStrings.pending | coinbaseLib.coinbaseLibStrings.completed | coinbaseLib.coinbaseLibStrings.failed | coinbaseLib.coinbaseLibStrings.expired | coinbaseLib.coinbaseLibStrings.canceled | coinbaseLib.coinbaseLibStrings.waiting_for_signature | coinbaseLib.coinbaseLibStrings.waiting_for_clearing
  type TransactionType = coinbaseLib.coinbaseLibStrings.send | coinbaseLib.coinbaseLibStrings.request | coinbaseLib.coinbaseLibStrings.transfer | coinbaseLib.coinbaseLibStrings.buy | coinbaseLib.coinbaseLibStrings.sell | coinbaseLib.coinbaseLibStrings.fiat_deposit | coinbaseLib.coinbaseLibStrings.fiat_withdrawal | coinbaseLib.coinbaseLibStrings.exchange_deposit | coinbaseLib.coinbaseLibStrings.exchange_withdrawal | coinbaseLib.coinbaseLibStrings.vault_withdrawal
  type WithdrawalStatus = coinbaseLib.coinbaseLibStrings.created | coinbaseLib.coinbaseLibStrings.completed | coinbaseLib.coinbaseLibStrings.canceled
}
