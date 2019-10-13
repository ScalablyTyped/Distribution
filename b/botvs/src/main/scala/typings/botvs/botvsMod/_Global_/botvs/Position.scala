package typings.botvs.botvsMod._Global_.botvs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 期货交易中的持有仓位信息, 由GetPosition()函数返回此结构数组
  */
trait Position extends js.Object {
  /**
    * 持仓量, 796期货表示持币的数量, BitVC指持仓的总金额(100的倍数),
    * OKCoin表示合约的份数(整数且大于1)
    */
  var Amount: Double
  /**
    * 可平量, 只有股票有此选项, 表示可以平仓的数量(股票为T+1)今日仓不能平
    */
  var CanCover: Double
  /**
    * 商品期货为合约代码, 股票为'交易所代码_股票代码', 具体参数SetContractType的传入类型
    */
  var ContractType: String
  /**
    * 仓位冻结量
    */
  var FrozenAmount: Double
  /**
    * 杆杠大小, 796期货有可能为5, 10, 20三个参数, OKCoin为10或者20,
    * BitVC期货和OK期货的全仓模式返回为固定的10, 因为原生API不支持
    */
  var MarginLevel: Double
  /**
    * 持仓均价
    */
  var Price: Double
  /**
    * 持仓浮动盈亏(数据货币单位：BTC/LTC, 传统期货单位:RMB, 股票不支持此字段,
    * 注: OKCoin期货全仓情况下指实现盈余, 并非持仓盈亏, 逐仓下指持仓盈亏)
    */
  var Profit: Double
  /**
    * PD_LONG为多头仓位(CTP中用closebuy_today平仓), PD_SHORT为空头仓位(CTP用closesell_today)平仓,
    * (CTP期货中)PD_LONG_YD为咋日多头仓位(用closebuy平), PD_SHORT_YD为咋日空头仓位(用closesell平)
    */
  var Type: VPositionType
}

object Position {
  @scala.inline
  def apply(
    Amount: Double,
    CanCover: Double,
    ContractType: String,
    FrozenAmount: Double,
    MarginLevel: Double,
    Price: Double,
    Profit: Double,
    Type: VPositionType
  ): Position = {
    val __obj = js.Dynamic.literal(Amount = Amount, CanCover = CanCover, ContractType = ContractType, FrozenAmount = FrozenAmount, MarginLevel = MarginLevel, Price = Price, Profit = Profit, Type = Type)
  
    __obj.asInstanceOf[Position]
  }
}

