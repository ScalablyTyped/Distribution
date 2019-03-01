package typings
package botvsLib.botvsMod.Global.botvsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 市场行情
  */
trait Ticker extends js.Object {
  /**
    * 买一价
    */
  var Buy: scala.Double
  /**
    * 最高价
    */
  var High: scala.Double
  /**
    * 最后成交价
    */
  var Last: scala.Double
  /**
    * 最低价
    */
  var Low: scala.Double
  /**
    * 卖一价
    */
  var Sell: scala.Double
  var Time: scala.Double
  /**
    * 最近成交量
    */
  var Volume: scala.Double
}

object Ticker {
  @scala.inline
  def apply(
    Buy: scala.Double,
    High: scala.Double,
    Last: scala.Double,
    Low: scala.Double,
    Sell: scala.Double,
    Time: scala.Double,
    Volume: scala.Double
  ): Ticker = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Buy")(Buy)
    __obj.updateDynamic("High")(High)
    __obj.updateDynamic("Last")(Last)
    __obj.updateDynamic("Low")(Low)
    __obj.updateDynamic("Sell")(Sell)
    __obj.updateDynamic("Time")(Time)
    __obj.updateDynamic("Volume")(Volume)
    __obj.asInstanceOf[Ticker]
  }
}

