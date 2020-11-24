package typings.coinbase

import typings.coinbase.mod.AccountType
import typings.coinbase.mod.BuyStatus
import typings.coinbase.mod.DepositStatus
import typings.coinbase.mod.PaymentMethodType
import typings.coinbase.mod.ResourceType
import typings.coinbase.mod.SellStatus
import typings.coinbase.mod.TransactionStatus
import typings.coinbase.mod.TransactionType
import typings.coinbase.mod.WithdrawalStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coinbaseStrings {
  
  @scala.inline
  def account: account = "account".asInstanceOf[account]
  
  @scala.inline
  def ach_bank_account: ach_bank_account = "ach_bank_account".asInstanceOf[ach_bank_account]
  
  @scala.inline
  def address: address = "address".asInstanceOf[address]
  
  @scala.inline
  def bank_wire: bank_wire = "bank_wire".asInstanceOf[bank_wire]
  
  @scala.inline
  def buy: buy = "buy".asInstanceOf[buy]
  
  @scala.inline
  def canceled: canceled = "canceled".asInstanceOf[canceled]
  
  @scala.inline
  def completed: completed = "completed".asInstanceOf[completed]
  
  @scala.inline
  def created: created = "created".asInstanceOf[created]
  
  @scala.inline
  def credit_card: credit_card = "credit_card".asInstanceOf[credit_card]
  
  @scala.inline
  def deposit: deposit = "deposit".asInstanceOf[deposit]
  
  @scala.inline
  def eft_bank_account: eft_bank_account = "eft_bank_account".asInstanceOf[eft_bank_account]
  
  @scala.inline
  def exchange_deposit: exchange_deposit = "exchange_deposit".asInstanceOf[exchange_deposit]
  
  @scala.inline
  def exchange_withdrawal: exchange_withdrawal = "exchange_withdrawal".asInstanceOf[exchange_withdrawal]
  
  @scala.inline
  def expired: expired = "expired".asInstanceOf[expired]
  
  @scala.inline
  def failed: failed = "failed".asInstanceOf[failed]
  
  @scala.inline
  def fiat: fiat = "fiat".asInstanceOf[fiat]
  
  @scala.inline
  def fiat_account: fiat_account = "fiat_account".asInstanceOf[fiat_account]
  
  @scala.inline
  def fiat_deposit: fiat_deposit = "fiat_deposit".asInstanceOf[fiat_deposit]
  
  @scala.inline
  def fiat_withdrawal: fiat_withdrawal = "fiat_withdrawal".asInstanceOf[fiat_withdrawal]
  
  @scala.inline
  def ideal_bank_account: ideal_bank_account = "ideal_bank_account".asInstanceOf[ideal_bank_account]
  
  @scala.inline
  def interac: interac = "interac".asInstanceOf[interac]
  
  @scala.inline
  def multisig: multisig = "multisig".asInstanceOf[multisig]
  
  @scala.inline
  def multisig_vault: multisig_vault = "multisig_vault".asInstanceOf[multisig_vault]
  
  @scala.inline
  def payment_method: payment_method = "payment_method".asInstanceOf[payment_method]
  
  @scala.inline
  def pending: pending = "pending".asInstanceOf[pending]
  
  @scala.inline
  def request: request = "request".asInstanceOf[request]
  
  @scala.inline
  def secure3d_card: secure3d_card = "secure3d_card".asInstanceOf[secure3d_card]
  
  @scala.inline
  def sell: sell = "sell".asInstanceOf[sell]
  
  @scala.inline
  def send: send = "send".asInstanceOf[send]
  
  @scala.inline
  def sepa_bank_account: sepa_bank_account = "sepa_bank_account".asInstanceOf[sepa_bank_account]
  
  @scala.inline
  def transaction: transaction = "transaction".asInstanceOf[transaction]
  
  @scala.inline
  def transfer: transfer = "transfer".asInstanceOf[transfer]
  
  @scala.inline
  def user: user = "user".asInstanceOf[user]
  
  @scala.inline
  def vault: vault = "vault".asInstanceOf[vault]
  
  @scala.inline
  def vault_withdrawal: vault_withdrawal = "vault_withdrawal".asInstanceOf[vault_withdrawal]
  
  @scala.inline
  def waiting_for_clearing: waiting_for_clearing = "waiting_for_clearing".asInstanceOf[waiting_for_clearing]
  
  @scala.inline
  def waiting_for_signature: waiting_for_signature = "waiting_for_signature".asInstanceOf[waiting_for_signature]
  
  @scala.inline
  def wallet: wallet = "wallet".asInstanceOf[wallet]
  
  @scala.inline
  def withdrawal: withdrawal = "withdrawal".asInstanceOf[withdrawal]
  
  @js.native
  sealed trait account extends ResourceType
  
  @js.native
  sealed trait ach_bank_account extends PaymentMethodType
  
  @js.native
  sealed trait address extends ResourceType
  
  @js.native
  sealed trait bank_wire extends PaymentMethodType
  
  @js.native
  sealed trait buy
    extends ResourceType
       with TransactionType
  
  @js.native
  sealed trait canceled
    extends BuyStatus
       with DepositStatus
       with SellStatus
       with TransactionStatus
       with WithdrawalStatus
  
  @js.native
  sealed trait completed
    extends BuyStatus
       with DepositStatus
       with SellStatus
       with TransactionStatus
       with WithdrawalStatus
  
  @js.native
  sealed trait created
    extends BuyStatus
       with DepositStatus
       with SellStatus
       with WithdrawalStatus
  
  @js.native
  sealed trait credit_card extends PaymentMethodType
  
  @js.native
  sealed trait deposit extends ResourceType
  
  @js.native
  sealed trait eft_bank_account extends PaymentMethodType
  
  @js.native
  sealed trait exchange_deposit extends TransactionType
  
  @js.native
  sealed trait exchange_withdrawal extends TransactionType
  
  @js.native
  sealed trait expired extends TransactionStatus
  
  @js.native
  sealed trait failed extends TransactionStatus
  
  @js.native
  sealed trait fiat extends AccountType
  
  @js.native
  sealed trait fiat_account extends PaymentMethodType
  
  @js.native
  sealed trait fiat_deposit extends TransactionType
  
  @js.native
  sealed trait fiat_withdrawal extends TransactionType
  
  @js.native
  sealed trait ideal_bank_account extends PaymentMethodType
  
  @js.native
  sealed trait interac extends PaymentMethodType
  
  @js.native
  sealed trait multisig extends AccountType
  
  @js.native
  sealed trait multisig_vault extends AccountType
  
  @js.native
  sealed trait payment_method extends ResourceType
  
  @js.native
  sealed trait pending extends TransactionStatus
  
  @js.native
  sealed trait request extends TransactionType
  
  @js.native
  sealed trait secure3d_card extends PaymentMethodType
  
  @js.native
  sealed trait sell
    extends ResourceType
       with TransactionType
  
  @js.native
  sealed trait send extends TransactionType
  
  @js.native
  sealed trait sepa_bank_account extends PaymentMethodType
  
  @js.native
  sealed trait transaction extends ResourceType
  
  @js.native
  sealed trait transfer extends TransactionType
  
  @js.native
  sealed trait user extends ResourceType
  
  @js.native
  sealed trait vault extends AccountType
  
  @js.native
  sealed trait vault_withdrawal extends TransactionType
  
  @js.native
  sealed trait waiting_for_clearing extends TransactionStatus
  
  @js.native
  sealed trait waiting_for_signature extends TransactionStatus
  
  @js.native
  sealed trait wallet extends AccountType
  
  @js.native
  sealed trait withdrawal extends ResourceType
}
