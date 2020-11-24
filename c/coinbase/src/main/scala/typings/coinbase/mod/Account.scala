package typings.coinbase.mod

import typings.coinbase.coinbaseStrings.account
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("coinbase", "Account")
@js.native
class Account () extends Resource {
  
  /**
    * Allow deposits
    */
  var allow_deposits: Boolean = js.native
  
  /**
    * Allow withdrawls
    */
  var allow_withdrawals: Boolean = js.native
  
  /**
    * Balance
    */
  var balance: MoneyHash = js.native
  
  /**
    * Buys a user-defined amount of bitcoin, litecoin or ethereum.
    * There are two ways to define buy amounts–you can use either the amount or the total parameter:
    * - When supplying amount, you’ll get the amount of bitcoin, litecoin or ethereum defined. With amount it’s recommended to use BTC or
    *   ETH as the currency value, but you can always specify a fiat currency and and the amount will be converted to BTC or ETH respectively.
    * - When supplying total, your payment method will be debited the total amount and you’ll get the amount in BTC or ETH after fees have
    *   been reduced from the total. With total it’s recommended to use the currency of the payment method as the currency parameter,
    *   but you can always specify a different currency and it will be converted.
    * Given the price of digital currency depends on the time of the call and on the amount of purchase, it’s recommended to use the
    * commit: false parameter to create an uncommitted buy to show the confirmation for the user or get the final quote, and commit that
    * with a separate request.
    * If you need to query the buy price without locking in the buy, you can use quote: true option. This returns an unsaved buy and
    * unlike commit: false, this buy can’t be completed. This option is useful when you need to show the detailed buy price quote
    * for the user when they are filling a form or similar situation.
    * Scope: wallet:buys:create
    * @param opts indicates what to buy
    * @param cb receives transaction that you can use to commit the buy
    */
  def buy(opts: BuyOpts, cb: js.Function2[/* error */ Error | Null, /* result */ Buy, Unit]): Unit = js.native
  
  def createAddress(opts: Null, cb: js.Function2[/* error */ Error | Null, /* result */ Address, Unit]): Unit = js.native
  /**
    * Creates a new address for an account. As all the arguments are optinal, it’s possible just to do a empty POST which will create a new
    * address. This is handy if you need to create new receive addresses for an account on-demand.
    * Addresses can be created for all account types. With fiat accounts, funds will be received with Instant Exchange
    * Scope: wallet:addresses:create
    * @param opts can be null, optional address name
    */
  def createAddress(opts: CreateAddressOpts, cb: js.Function2[/* error */ Error | Null, /* result */ Address, Unit]): Unit = js.native
  
  /**
    * ISO timestamp (sometimes needs additional permissions)
    */
  var created_at: js.UndefOr[String] = js.native
  
  /**
    * Account’s currency (see Client#getCurrencies() for available strings)
    */
  var currency: String = js.native
  
  /**
    * Removes user’s account. In order to remove an account it can’t be:
    * - Primary account
    * - Account with non-zero balance
    * - Fiat account
    * - Vault with a pending withdrawal
    * Scope: wallet:accounts:delete
    */
  def delete(cb: js.Function1[/* error */ Error | Null, Unit]): Unit = js.native
  
  /**
    * Deposits user-defined amount of funds to a fiat account.
    * Scope: wallet:deposits:create
    */
  def deposit(opts: DepositOpts, cb: js.Function2[/* error */ Error | Null, /* result */ Deposit, Unit]): Unit = js.native
  
  /**
    * Show an individual address for an account. A regular bitcoin, litecoin or ethereum address can be used in place of `id` but the
    * address has to be associated to the correct account. Important: Addresses should be considered one time use only. Create new addresses.
    * Scope: wallet:addresses:read
    * @param id resource id or a regular bitcoin, litecoin or ethereum address
    */
  def getAddress(id: String, cb: js.Function2[/* error */ Error | Null, /* result */ Address, Unit]): Unit = js.native
  
  /**
    * Lists addresses for an account. Important: Addresses should be considered one time use only. Create new addresses.
    * Scope: wallet:addresses:read
    */
  def getAddresses(cb: js.Function2[/* error */ Error | Null, /* result */ js.Array[Address], Unit]): Unit = js.native
  
  /**
    * Show an individual buy.
    * Scope: wallet:buys:read
    * @param id resource id
    */
  def getBuy(id: String, cb: js.Function2[/* error */ Error | Null, /* result */ Buy, Unit]): Unit = js.native
  
  /**
    * Lists buys for an account.
    * Scope: wallet:buys:read
    */
  def getBuys(opts: Null, cb: js.Function2[/* error */ Error | Null, /* result */ js.Array[Buy], Unit]): Unit = js.native
  
  /**
    * Show an individual deposit.
    * Scope: wallet:deposits:read
    * @param id resource id
    */
  def getDeposit(id: String, cb: js.Function2[/* error */ Error | Null, /* result */ Deposit, Unit]): Unit = js.native
  
  /**
    * Lists deposits for an account.
    * Scope: wallet:deposits:read
    */
  def getDeposits(cb: js.Function2[/* error */ Error | Null, /* result */ js.Array[Deposit], Unit]): Unit = js.native
  
  /**
    * Show an individual sell.
    * Scope: wallet:sells:read
    * @param id resource id
    */
  def getSell(id: String, cb: js.Function2[/* error */ Error | Null, /* result */ Sell, Unit]): Unit = js.native
  
  /**
    * Lists sells for an account.
    * Scope: wallet:sells:read
    */
  def getSells(opts: Null, cb: js.Function2[/* error */ Error | Null, /* result */ js.Array[Sell], Unit]): Unit = js.native
  
  /**
    * Show an individual transaction for an account
    * Scope: wallet:transactions:read
    * @param id resource id
    */
  def getTransaction(id: String, cb: js.Function2[/* error */ Error | Null, /* result */ Transaction, Unit]): Unit = js.native
  
  /**
    * Lists account’s transactions.
    * Scope: wallet:transactions:read
    */
  def getTransactions(
    opts: js.Object,
    cb: js.Function2[/* error */ Error | Null, /* result */ js.Array[Transaction], Unit]
  ): Unit = js.native
  
  /**
    * Show an individual withdrawal.
    * Scope: wallet:withdrawals:read
    * @param id resource id
    */
  def getWithdrawal(id: String, cb: js.Function2[/* error */ Error | Null, /* result */ Withdrawal, Unit]): Unit = js.native
  
  /**
    * Lists withdrawals for an account.
    * Scope: wallet:withdrawals:read
    */
  def getWithdrawals(cb: js.Function2[/* error */ Error | Null, /* result */ js.Array[Withdrawal], Unit]): Unit = js.native
  
  /**
    * Resource ID
    */
  var id: String = js.native
  
  /**
    * User or system defined name
    */
  var name: String = js.native
  
  /**
    * Account worth in fiat.
    */
  var native_balance: MoneyHash = js.native
  
  /**
    * Primary account
    */
  var primary: Boolean = js.native
  
  /**
    * Requests money from an email address.
    * Scope: wallet:transactions:request
    */
  def requestMoney(opts: RequestMoneyOpts, cb: js.Function2[/* error */ Error | Null, /* result */ Transaction, Unit]): Unit = js.native
  
  /**
    * Type of resource, constant string "account"
    */
  @JSName("resource")
  var resource_Account: account = js.native
  
  /**
    * REST endpoint
    */
  var resource_path: String = js.native
  
  /**
    * Sells a user-defined amount of bitcoin, litecoin or ethereum.
    *
    * There are two ways to define sell amounts–you can use either the amount or the total parameter:
    * - When supplying amount, you’ll get the amount of bitcoin, litecoin or ethereum defined. With amount it’s recommended to use BTC or
    *   ETH as the currency value, but you can always specify a fiat currency and the amount will be converted to BTC or ETH respectively.
    * - When supplying total, your payment method will be credited the total amount and you’ll get the amount in BTC or ETH after fees
    *   have been reduced from the subtotal. With total it’s recommended to use the currency of the payment method as the currency parameter,
    *   but you can always specify a different currency and it will be converted.
    *
    * Given the price of digital currency depends on the time of the call and amount of the sell, it’s recommended to use the commit: false
    * parameter to create an uncommitted sell to get a quote and then to commit that with a separate request.
    *
    * If you need to query the sell price without locking in the sell, you can use quote: true option. This returns an unsaved sell and
    * unlike commit: false, this sell can’t be completed. This option is useful when you need to show the detailed sell price quote for
    * the user when they are filling a form or similar situation.
    * Scope: wallet:sells:create
    */
  def sell(opts: SellOpts, cb: js.Function2[/* error */ Error | Null, /* result */ Sell, Unit]): Unit = js.native
  
  /**
    * Send funds to a bitcoin address, litecoin address, ethereum address, or email address. No transaction fees are required for off
    * blockchain bitcoin transactions.
    *
    * It’s recommended to always supply a unique `idem` field for each transaction. This prevents you from sending the same transaction
    * twice if there has been an unexpected network outage or other issue.
    *
    * When used with OAuth2 authentication, this endpoint requires two factor authentication unless used with
    * wallet:transactions:send:bypass-2fa scope.
    *
    * If the user is able to buy bitcoin, they can send funds from their fiat account using instant exchange feature.
    * Buy fees will be included in the created transaction and the recipient will receive the user defined amount.
    * To create a multisig transaction, visit Multisig documentation.
    *
    * Scope: wallet:transactions:send, wallet:transactions:send:bypass-2fa
    */
  def sendMoney(opts: SendMoneyOpts, cb: js.Function2[/* error */ Error | Null, /* result */ Transaction, Unit]): Unit = js.native
  
  /**
    * Promote an account as primary account.
    * Scope: wallet:accounts:update
    */
  def setPrimary(cb: js.Function2[/* error */ Error | Null, /* result */ this.type, Unit]): Unit = js.native
  
  /**
    * Transfer bitcoin, litecoin or ethereum between two of a user’s accounts. Following transfers are allowed:
    * - wallet to wallet
    * - wallet to vault
    * Scope: wallet:transactions:transfer
    */
  def transferMoney(
    opts: TransferMoneyOpts,
    cb: js.Function2[/* error */ Error | Null, /* result */ Transaction, Unit]
  ): Unit = js.native
  
  /**
    * Account’s type
    */
  var `type`: AccountType = js.native
  
  /**
    * Modifies user’s account.
    * Scope: wallet:accounts:update
    */
  def update(opts: UpdateAccountOpts, cb: js.Function2[/* error */ Error | Null, /* result */ this.type, Unit]): Unit = js.native
  
  /**
    * ISO timestamp (sometimes needs additional permissions)
    */
  var updated_at: js.UndefOr[String] = js.native
  
  /**
    * Withdraws user-defined amount of funds from a fiat account.
    * Scope: wallet:withdrawals:create
    */
  def withdraw(opts: WithdrawOpts, cb: js.Function2[/* error */ Error | Null, /* result */ Withdrawal, Unit]): Unit = js.native
}
