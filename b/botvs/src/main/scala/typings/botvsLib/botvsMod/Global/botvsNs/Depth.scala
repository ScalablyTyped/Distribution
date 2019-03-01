package typings
package botvsLib.botvsMod.Global.botvsNs

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
  var Time: scala.Double
}

object Depth {
  @scala.inline
  def apply(Asks: js.Array[MarketOrder], Bids: js.Array[MarketOrder], Time: scala.Double): Depth = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Asks")(Asks)
    __obj.updateDynamic("Bids")(Bids)
    __obj.updateDynamic("Time")(Time)
    __obj.asInstanceOf[Depth]
  }
}

