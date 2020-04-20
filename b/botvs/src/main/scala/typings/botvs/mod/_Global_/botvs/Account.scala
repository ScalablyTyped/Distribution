package typings.botvs.mod._Global_.botvs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 账户信息, 由GetAccount函数返回
  */
trait Account extends js.Object {
  /**
    * 余额(人民币或者美元, 在Poloniex交易所里BTC_ETC这样的品种, Balance就指的是BTC的数量,
    * Stocks指的是ETC数量, BTC38的ETC_BTC相当于Poloniex的BTC_ETC, 指的是以BTC计价)
    */
  var Balance: Double
  /**
    * 冻结的余额
    */
  var FrozenBalance: Double
  /**
    * 冻结的BTC/LTC数量(传统期货无此属性)
    */
  var FrozenStocks: Double
  /**
    * BTC/LTC数量, 现货为当前可操作币的余额(去掉冻结的币),
    * 期货的话为合约当前可用保证金(传统期货为此属性)
    */
  var Stocks: Double
}

object Account {
  @scala.inline
  def apply(Balance: Double, FrozenBalance: Double, FrozenStocks: Double, Stocks: Double): Account = {
    val __obj = js.Dynamic.literal(Balance = Balance.asInstanceOf[js.Any], FrozenBalance = FrozenBalance.asInstanceOf[js.Any], FrozenStocks = FrozenStocks.asInstanceOf[js.Any], Stocks = Stocks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Account]
  }
}

