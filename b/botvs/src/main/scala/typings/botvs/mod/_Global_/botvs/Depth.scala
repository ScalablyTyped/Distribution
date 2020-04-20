package typings.botvs.mod._Global_.botvs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 市场深度,由GetDepth函数返回
  */
trait Depth extends js.Object {
  /**
    * 卖单数组, MarketOrder数组, 按价格从低向高排序
    */
  var Asks: js.Array[MarketOrder]
  /**
    * 买单数组, MarketOrder数组, 按价格从高向低排序
    */
  var Bids: js.Array[MarketOrder]
  var Time: Double
}

object Depth {
  @scala.inline
  def apply(Asks: js.Array[MarketOrder], Bids: js.Array[MarketOrder], Time: Double): Depth = {
    val __obj = js.Dynamic.literal(Asks = Asks.asInstanceOf[js.Any], Bids = Bids.asInstanceOf[js.Any], Time = Time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Depth]
  }
}

