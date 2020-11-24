package typings.botvs.mod.global.botvs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 期货交易中的持有仓位信息, 由GetPosition()函数返回此结构数组
  */
@js.native
trait Position extends js.Object {
  
  /**
    * 持仓量, 796期货表示持币的数量, BitVC指持仓的总金额(100的倍数),
    * OKCoin表示合约的份数(整数且大于1)
    */
  var Amount: Double = js.native
  
  /**
    * 可平量, 只有股票有此选项, 表示可以平仓的数量(股票为T+1)今日仓不能平
    */
  var CanCover: Double = js.native
  
  /**
    * 商品期货为合约代码, 股票为'交易所代码_股票代码', 具体参数SetContractType的传入类型
    */
  var ContractType: String = js.native
  
  /**
    * 仓位冻结量
    */
  var FrozenAmount: Double = js.native
  
  /**
    * 杆杠大小, 796期货有可能为5, 10, 20三个参数, OKCoin为10或者20,
    * BitVC期货和OK期货的全仓模式返回为固定的10, 因为原生API不支持
    */
  var MarginLevel: Double = js.native
  
  /**
    * 持仓均价
    */
  var Price: Double = js.native
  
  /**
    * 持仓浮动盈亏(数据货币单位：BTC/LTC, 传统期货单位:RMB, 股票不支持此字段,
    * 注: OKCoin期货全仓情况下指实现盈余, 并非持仓盈亏, 逐仓下指持仓盈亏)
    */
  var Profit: Double = js.native
  
  /**
    * PD_LONG为多头仓位(CTP中用closebuy_today平仓), PD_SHORT为空头仓位(CTP用closesell_today)平仓,
    * (CTP期货中)PD_LONG_YD为咋日多头仓位(用closebuy平), PD_SHORT_YD为咋日空头仓位(用closesell平)
    */
  var Type: VPositionType = js.native
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
    val __obj = js.Dynamic.literal(Amount = Amount.asInstanceOf[js.Any], CanCover = CanCover.asInstanceOf[js.Any], ContractType = ContractType.asInstanceOf[js.Any], FrozenAmount = FrozenAmount.asInstanceOf[js.Any], MarginLevel = MarginLevel.asInstanceOf[js.Any], Price = Price.asInstanceOf[js.Any], Profit = Profit.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position]
  }
  
  @scala.inline
  implicit class PositionOps[Self <: Position] (val x: Self) extends AnyVal {
    
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
    def setAmount(value: Double): Self = this.set("Amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanCover(value: Double): Self = this.set("CanCover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContractType(value: String): Self = this.set("ContractType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrozenAmount(value: Double): Self = this.set("FrozenAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginLevel(value: Double): Self = this.set("MarginLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrice(value: Double): Self = this.set("Price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfit(value: Double): Self = this.set("Profit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: VPositionType): Self = this.set("Type", value.asInstanceOf[js.Any])
  }
}
