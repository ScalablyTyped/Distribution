package typings.botvs.botvsMod.Global

import typings.botvs.botvsMod.Global.botvs.ChartOptions
import typings.botvs.botvsMod.Global.botvs.RChart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Chart")
@js.native
object Chart extends js.Object {
  /**
    * 图表绘图函数
    *
    * 参数为可以JSON序列化的HighStocks的Highcharts.StockChart参数, 比原生的参数增加一个
    * __isStock属性, 如果指定__isStock: false, 则显示为普通图表
    * 返回对像可以调用add([series索引(如0), 数据])向指定索引的series添加数据, 调用reset()
    * 清空图表数据, reset可以带一个数字参数, 指定保留的条数
    * 可以调用add([series索引(如0), 数据, 此数据在series中的索引])来更改数据
    * 可以为负数, -1指最后一个, -2是倒数第二个, 如:
    * chart.add([0, 13.5, -1]), 更改series[0].data的倒数第一个点的数据
    * 支持显示多个图表, 配置时只需传入数组参数即可如: var chart = Chart([{...}, {...}, {...}]),
    * 比如图表一有两个series, 图表二有一个series, 图表三有一个series,
    * 那么add时指定0与1序列ID代表更新图表1的两个序列的数据, add时指定序列ID为2指图表2的第一个
    * series的数据, 指定序列3指的是图表3的第一个series的数据 HighStocks:
    * http://api.highcharts.com/highstock
    *
    * @param {botvs.ChartOptions} options
    * @return {botvs.RChart}
    */
  def apply(options: ChartOptions*): RChart = js.native
}

