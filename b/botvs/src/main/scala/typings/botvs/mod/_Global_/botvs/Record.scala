package typings.botvs.mod._Global_.botvs

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
  var Close: Double
  /**
    * 最高价
    */
  var High: Double
  /**
    * 最低价
    */
  var Low: Double
  /**
    * 开盘价
    */
  var Open: Double
  /**
    * 一个时间戳, 精确到毫秒，与Javascript的 new Date().getTime() 得到的结果格式一样
    */
  var Time: Double
  /**
    * 成交量
    */
  var Volume: Double
}

object Record {
  @scala.inline
  def apply(Close: Double, High: Double, Low: Double, Open: Double, Time: Double, Volume: Double): Record = {
    val __obj = js.Dynamic.literal(Close = Close.asInstanceOf[js.Any], High = High.asInstanceOf[js.Any], Low = Low.asInstanceOf[js.Any], Open = Open.asInstanceOf[js.Any], Time = Time.asInstanceOf[js.Any], Volume = Volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[Record]
  }
}

