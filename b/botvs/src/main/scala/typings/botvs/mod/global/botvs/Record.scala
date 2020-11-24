package typings.botvs.mod.global.botvs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 标准OHLC结构, 用来画K线和指标分析用的，由GetRecords函数返回此结构数组
  */
@js.native
trait Record extends js.Object {
  
  /**
    * 收盘价
    */
  var Close: Double = js.native
  
  /**
    * 最高价
    */
  var High: Double = js.native
  
  /**
    * 最低价
    */
  var Low: Double = js.native
  
  /**
    * 开盘价
    */
  var Open: Double = js.native
  
  /**
    * 一个时间戳, 精确到毫秒，与Javascript的 new Date().getTime() 得到的结果格式一样
    */
  var Time: Double = js.native
  
  /**
    * 成交量
    */
  var Volume: Double = js.native
}
object Record {
  
  @scala.inline
  def apply(Close: Double, High: Double, Low: Double, Open: Double, Time: Double, Volume: Double): Record = {
    val __obj = js.Dynamic.literal(Close = Close.asInstanceOf[js.Any], High = High.asInstanceOf[js.Any], Low = Low.asInstanceOf[js.Any], Open = Open.asInstanceOf[js.Any], Time = Time.asInstanceOf[js.Any], Volume = Volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[Record]
  }
  
  @scala.inline
  implicit class RecordOps[Self <: Record] (val x: Self) extends AnyVal {
    
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
    def setClose(value: Double): Self = this.set("Close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHigh(value: Double): Self = this.set("High", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLow(value: Double): Self = this.set("Low", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpen(value: Double): Self = this.set("Open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: Double): Self = this.set("Time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolume(value: Double): Self = this.set("Volume", value.asInstanceOf[js.Any])
  }
}
