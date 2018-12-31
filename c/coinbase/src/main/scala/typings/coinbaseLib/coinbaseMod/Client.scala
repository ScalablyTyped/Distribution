package typings
package coinbaseLib.coinbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("coinbase", "Client")
@js.native
class Client protected () extends js.Object {
  def this(opts: ClientConstructOpts) = this()
  /**
    * Creates a new account for user.
    * Scopes: wallet:accounts:create
    */
  def createAccount(
    opts: CreateAccountOpts,
    cb: js.Function2[/* error */ stdLib.Error, /* result */ Account, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Get one account by its Resource ID
    * Scope: wallet:accounts:read
    * @param id resource ID or "primary"
    */
  def getAccount(id: java.lang.String, cb: js.Function2[/* error */ stdLib.Error, /* result */ Account, scala.Unit]): scala.Unit = js.native
  /**
    * Returns all accounts for the current user
    * Scope: wallet:accounts:read
    */
  def getAccounts(
    opts: js.Object,
    cb: js.Function2[/* error */ stdLib.Error, /* result */ js.Array[Account], scala.Unit]
  ): scala.Unit = js.native
  /**
    * Get the total price to buy one bitcoin or ether. Note that exchange rates fluctuates so the price is only correct for seconds at the time.
    * This buy price includes standard Coinbase fee (1%) but excludes any other fees including bank fees.
    * If you need more accurate price estimate for a specific payment method or amount, @see Account#buy() and `quote: true` option.
    * Scope: none
    */
  def getBuyPrice(opts: GetBuyPriceOpts, cb: js.Function2[/* error */ stdLib.Error, /* result */ Price, scala.Unit]): scala.Unit = js.native
  /**
    * List known currencies. Currency codes will conform to the ISO 4217 standard where possible. Currencies which have or had no
    * representation in ISO 4217 may use a custom code (e.g. BTC).
    * Scope: none
    */
  def getCurrencies(cb: js.Function2[/* error */ stdLib.Error, /* result */ js.Array[Currency], scala.Unit]): scala.Unit = js.native
  /**
    * Get the current user. To get user’s email or private information, use permissions wallet:user:email and wallet:user:read. If current
    * request has a wallet:transactions:send scope, then the response will contain a boolean sends_disabled field that indicates
    * if the user’s send functionality has been disabled.
    */
  def getCurrentUser(cb: js.Function2[/* error */ stdLib.Error, /* result */ User, scala.Unit]): scala.Unit = js.native
  /**
    * Get current exchange rates. Default base currency is USD but it can be defined as any supported currency.
    * Returned rates will define the exchange rate for one unit of the base currency.
    * Scope: none
    */
  def getExchangeRates(
    opts: GetExchangeRateOpts,
    cb: js.Function2[/* error */ stdLib.Error, /* result */ ExchangeRate, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Show current user’s payment method.
    * Scope: wallet:payment-methods:read
    */
  def getPaymentMethod(
    id: java.lang.String,
    cb: js.Function2[/* error */ stdLib.Error, /* result */ PaymentMethod, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Lists current user’s payment methods
    * Scope: wallet:payment-methods:read
    */
  def getPaymentMethods(cb: js.Function2[/* error */ stdLib.Error, /* result */ js.Array[PaymentMethod], scala.Unit]): scala.Unit = js.native
  /**
    * Get the total price to sell one bitcoin or ether. Note that exchange rates fluctuates so the price is only correct for seconds at the time.
    * This sell price includes standard Coinbase fee (1%) but excludes any other fees including bank fees. If you need more accurate price
    * estimate for a specific payment method or amount, see sell bitcoin endpoint and quote: true option.
    * Scope: none
    */
  def getSellPrice(opts: GetSellPriceOpts, cb: js.Function2[/* error */ stdLib.Error, /* result */ Price, scala.Unit]): scala.Unit = js.native
  /**
    * Get the current market price for bitcoin. This is usually somewhere in between the buy and sell price.
    * Note that exchange rates fluctuates so the price is only correct for seconds at the time.
    * You can also get historic prices with date parameter.
    * Scope: none
    */
  def getSpotPrice(opts: GetSpotPriceOpts, cb: js.Function2[/* error */ stdLib.Error, /* result */ Price, scala.Unit]): scala.Unit = js.native
  /**
    * Get the API server time.
    */
  def getTime(cb: js.Function2[/* error */ stdLib.Error, /* result */ Time, scala.Unit]): scala.Unit = js.native
  /**
    * Get any user’s information with their ID.
    * Scopes: none
    * @param id resource id
    */
  def getUser(id: java.lang.String, cb: js.Function2[/* error */ stdLib.Error, /* result */ User, scala.Unit]): scala.Unit = js.native
}

