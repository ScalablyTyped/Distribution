package typings
package botvsLib.botvsMod.Global.botvsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 标准OHLC结构, 用来画K线和指标分析用的，由GetRecords函数返回此结构数组
  */
trait Record extends js.Object {
  /**
    * 收盘价
    */
  var Close: scala.Double
  /**
    * 最高价
    */
  var High: scala.Double
  /**
    * 最低价
    */
  var Low: scala.Double
  /**
    * 开盘价
    */
  var Open: scala.Double
  /**
    * 一个时间戳, 精确到毫秒，与Javascript的 new Date().getTime() 得到的结果格式一样
    */
  var Time: scala.Double
  /**
    * 成交量
    */
  var Volume: scala.Double
}

object Record {
  @scala.inline
  def apply(
    Close: scala.Double,
    High: scala.Double,
    Low: scala.Double,
    Open: scala.Double,
    Time: scala.Double,
    Volume: scala.Double
  ): Record = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Close")(Close)
    __obj.updateDynamic("High")(High)
    __obj.updateDynamic("Low")(Low)
    __obj.updateDynamic("Open")(Open)
    __obj.updateDynamic("Time")(Time)
    __obj.updateDynamic("Volume")(Volume)
    __obj.asInstanceOf[Record]
  }
}

