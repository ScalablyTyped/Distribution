package typings
package botvsLib.botvsMod.Global.botvsNs

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
  var Amount: scala.Double
  /**
    * 价格
    */
  var Price: scala.Double
}

object MarketOrder {
  @scala.inline
  def apply(Amount: scala.Double, Price: scala.Double): MarketOrder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Amount")(Amount)
    __obj.updateDynamic("Price")(Price)
    __obj.asInstanceOf[MarketOrder]
  }
}

