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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coinbaseStrings {
  
  @js.native
  sealed trait account
    extends StObject
       with ResourceType
  inline def account: account = "account".asInstanceOf[account]
  
  @js.native
  sealed trait ach_bank_account
    extends StObject
       with PaymentMethodType
  inline def ach_bank_account: ach_bank_account = "ach_bank_account".asInstanceOf[ach_bank_account]
  
  @js.native
  sealed trait address
    extends StObject
       with ResourceType
  inline def address: address = "address".asInstanceOf[address]
  
  @js.native
  sealed trait asc extends StObject
  inline def asc: asc = "asc".asInstanceOf[asc]
  
  @js.native
  sealed trait bank_wire
    extends StObject
       with PaymentMethodType
  inline def bank_wire: bank_wire = "bank_wire".asInstanceOf[bank_wire]
  
  @js.native
  sealed trait buy
    extends StObject
       with ResourceType
       with TransactionType
  inline def buy: buy = "buy".asInstanceOf[buy]
  
  @js.native
  sealed trait canceled
    extends StObject
       with BuyStatus
       with DepositStatus
       with SellStatus
       with TransactionStatus
       with WithdrawalStatus
  inline def canceled: canceled = "canceled".asInstanceOf[canceled]
  
  @js.native
  sealed trait completed
    extends StObject
       with BuyStatus
       with DepositStatus
       with SellStatus
       with TransactionStatus
       with WithdrawalStatus
  inline def completed: completed = "completed".asInstanceOf[completed]
  
  @js.native
  sealed trait created
    extends StObject
       with BuyStatus
       with DepositStatus
       with SellStatus
       with WithdrawalStatus
  inline def created: created = "created".asInstanceOf[created]
  
  @js.native
  sealed trait credit_card
    extends StObject
       with PaymentMethodType
  inline def credit_card: credit_card = "credit_card".asInstanceOf[credit_card]
  
  @js.native
  sealed trait deposit
    extends StObject
       with ResourceType
  inline def deposit: deposit = "deposit".asInstanceOf[deposit]
  
  @js.native
  sealed trait desc extends StObject
  inline def desc: desc = "desc".asInstanceOf[desc]
  
  @js.native
  sealed trait eft_bank_account
    extends StObject
       with PaymentMethodType
  inline def eft_bank_account: eft_bank_account = "eft_bank_account".asInstanceOf[eft_bank_account]
  
  @js.native
  sealed trait exchange_deposit
    extends StObject
       with TransactionType
  inline def exchange_deposit: exchange_deposit = "exchange_deposit".asInstanceOf[exchange_deposit]
  
  @js.native
  sealed trait exchange_withdrawal
    extends StObject
       with TransactionType
  inline def exchange_withdrawal: exchange_withdrawal = "exchange_withdrawal".asInstanceOf[exchange_withdrawal]
  
  @js.native
  sealed trait expired
    extends StObject
       with TransactionStatus
  inline def expired: expired = "expired".asInstanceOf[expired]
  
  @js.native
  sealed trait failed
    extends StObject
       with TransactionStatus
  inline def failed: failed = "failed".asInstanceOf[failed]
  
  @js.native
  sealed trait fiat
    extends StObject
       with AccountType
  inline def fiat: fiat = "fiat".asInstanceOf[fiat]
  
  @js.native
  sealed trait fiat_account
    extends StObject
       with PaymentMethodType
  inline def fiat_account: fiat_account = "fiat_account".asInstanceOf[fiat_account]
  
  @js.native
  sealed trait fiat_deposit
    extends StObject
       with TransactionType
  inline def fiat_deposit: fiat_deposit = "fiat_deposit".asInstanceOf[fiat_deposit]
  
  @js.native
  sealed trait fiat_withdrawal
    extends StObject
       with TransactionType
  inline def fiat_withdrawal: fiat_withdrawal = "fiat_withdrawal".asInstanceOf[fiat_withdrawal]
  
  @js.native
  sealed trait ideal_bank_account
    extends StObject
       with PaymentMethodType
  inline def ideal_bank_account: ideal_bank_account = "ideal_bank_account".asInstanceOf[ideal_bank_account]
  
  @js.native
  sealed trait interac
    extends StObject
       with PaymentMethodType
  inline def interac: interac = "interac".asInstanceOf[interac]
  
  @js.native
  sealed trait multisig
    extends StObject
       with AccountType
  inline def multisig: multisig = "multisig".asInstanceOf[multisig]
  
  @js.native
  sealed trait multisig_vault
    extends StObject
       with AccountType
  inline def multisig_vault: multisig_vault = "multisig_vault".asInstanceOf[multisig_vault]
  
  @js.native
  sealed trait payment_method
    extends StObject
       with ResourceType
  inline def payment_method: payment_method = "payment_method".asInstanceOf[payment_method]
  
  @js.native
  sealed trait pending
    extends StObject
       with TransactionStatus
  inline def pending: pending = "pending".asInstanceOf[pending]
  
  @js.native
  sealed trait request
    extends StObject
       with TransactionType
  inline def request: request = "request".asInstanceOf[request]
  
  @js.native
  sealed trait secure3d_card
    extends StObject
       with PaymentMethodType
  inline def secure3d_card: secure3d_card = "secure3d_card".asInstanceOf[secure3d_card]
  
  @js.native
  sealed trait sell
    extends StObject
       with ResourceType
       with TransactionType
  inline def sell: sell = "sell".asInstanceOf[sell]
  
  @js.native
  sealed trait send
    extends StObject
       with TransactionType
  inline def send: send = "send".asInstanceOf[send]
  
  @js.native
  sealed trait sepa_bank_account
    extends StObject
       with PaymentMethodType
  inline def sepa_bank_account: sepa_bank_account = "sepa_bank_account".asInstanceOf[sepa_bank_account]
  
  @js.native
  sealed trait trade
    extends StObject
       with TransactionType
  inline def trade: trade = "trade".asInstanceOf[trade]
  
  @js.native
  sealed trait transaction
    extends StObject
       with ResourceType
  inline def transaction: transaction = "transaction".asInstanceOf[transaction]
  
  @js.native
  sealed trait transfer
    extends StObject
       with TransactionType
  inline def transfer: transfer = "transfer".asInstanceOf[transfer]
  
  @js.native
  sealed trait user
    extends StObject
       with ResourceType
  inline def user: user = "user".asInstanceOf[user]
  
  @js.native
  sealed trait vault
    extends StObject
       with AccountType
  inline def vault: vault = "vault".asInstanceOf[vault]
  
  @js.native
  sealed trait vault_withdrawal
    extends StObject
       with TransactionType
  inline def vault_withdrawal: vault_withdrawal = "vault_withdrawal".asInstanceOf[vault_withdrawal]
  
  @js.native
  sealed trait waiting_for_clearing
    extends StObject
       with TransactionStatus
  inline def waiting_for_clearing: waiting_for_clearing = "waiting_for_clearing".asInstanceOf[waiting_for_clearing]
  
  @js.native
  sealed trait waiting_for_signature
    extends StObject
       with TransactionStatus
  inline def waiting_for_signature: waiting_for_signature = "waiting_for_signature".asInstanceOf[waiting_for_signature]
  
  @js.native
  sealed trait wallet
    extends StObject
       with AccountType
  inline def wallet: wallet = "wallet".asInstanceOf[wallet]
  
  @js.native
  sealed trait withdrawal
    extends StObject
       with ResourceType
  inline def withdrawal: withdrawal = "withdrawal".asInstanceOf[withdrawal]
}
