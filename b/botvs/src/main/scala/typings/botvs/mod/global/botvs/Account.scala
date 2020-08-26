package typings.botvs.mod.global.botvs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 账户信息, 由GetAccount函数返回
  */
@js.native
trait Account extends js.Object {
  /**
    * 余额(人民币或者美元, 在Poloniex交易所里BTC_ETC这样的品种, Balance就指的是BTC的数量,
    * Stocks指的是ETC数量, BTC38的ETC_BTC相当于Poloniex的BTC_ETC, 指的是以BTC计价)
    */
  var Balance: Double = js.native
  /**
    * 冻结的余额
    */
  var FrozenBalance: Double = js.native
  /**
    * 冻结的BTC/LTC数量(传统期货无此属性)
    */
  var FrozenStocks: Double = js.native
  /**
    * BTC/LTC数量, 现货为当前可操作币的余额(去掉冻结的币),
    * 期货的话为合约当前可用保证金(传统期货为此属性)
    */
  var Stocks: Double = js.native
}

object Account {
  @scala.inline
  def apply(Balance: Double, FrozenBalance: Double, FrozenStocks: Double, Stocks: Double): Account = {
    val __obj = js.Dynamic.literal(Balance = Balance.asInstanceOf[js.Any], FrozenBalance = FrozenBalance.asInstanceOf[js.Any], FrozenStocks = FrozenStocks.asInstanceOf[js.Any], Stocks = Stocks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Account]
  }
  @scala.inline
  implicit class AccountOps[Self <: Account] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBalance(value: Double): Self = this.set("Balance", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrozenBalance(value: Double): Self = this.set("FrozenBalance", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrozenStocks(value: Double): Self = this.set("FrozenStocks", value.asInstanceOf[js.Any])
    @scala.inline
    def setStocks(value: Double): Self = this.set("Stocks", value.asInstanceOf[js.Any])
  }
  
}

