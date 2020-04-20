package typings.botvs.mod._Global_.botvs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 市场深度单
  */
trait MarketOrder extends js.Object {
  /**
    * 数量
    */
  var Amount: Double
  /**
    * 价格
    */
  var Price: Double
}

object MarketOrder {
  @scala.inline
  def apply(Amount: Double, Price: Double): MarketOrder = {
    val __obj = js.Dynamic.literal(Amount = Amount.asInstanceOf[js.Any], Price = Price.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarketOrder]
  }
}

