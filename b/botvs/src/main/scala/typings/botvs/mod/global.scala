package typings.botvs.mod

import typings.botvs.anon.Body
import typings.botvs.anon.Data
import typings.botvs.botvsBooleans.`true`
import typings.botvs.botvsStrings.Buy
import typings.botvs.botvsStrings.CancelOrder
import typings.botvs.botvsStrings.Close
import typings.botvs.botvsStrings.GetAccount
import typings.botvs.botvsStrings.GetBaseCurrency
import typings.botvs.botvsStrings.GetCurrency
import typings.botvs.botvsStrings.GetDepth
import typings.botvs.botvsStrings.GetFee
import typings.botvs.botvsStrings.GetLabel
import typings.botvs.botvsStrings.GetMinPrice
import typings.botvs.botvsStrings.GetMinStock
import typings.botvs.botvsStrings.GetName
import typings.botvs.botvsStrings.GetOrder
import typings.botvs.botvsStrings.GetOrders
import typings.botvs.botvsStrings.GetPosition
import typings.botvs.botvsStrings.GetRate
import typings.botvs.botvsStrings.GetRawJSON
import typings.botvs.botvsStrings.GetRecords
import typings.botvs.botvsStrings.GetTicker
import typings.botvs.botvsStrings.GetTrades
import typings.botvs.botvsStrings.GetUSDCNY
import typings.botvs.botvsStrings.High
import typings.botvs.botvsStrings.IO
import typings.botvs.botvsStrings.Log
import typings.botvs.botvsStrings.Low
import typings.botvs.botvsStrings.Open
import typings.botvs.botvsStrings.Sell
import typings.botvs.botvsStrings.SetContractType
import typings.botvs.botvsStrings.SetDirection
import typings.botvs.botvsStrings.SetMarginLevel
import typings.botvs.botvsStrings.SetPrecision
import typings.botvs.botvsStrings.SetRate
import typings.botvs.botvsStrings.Time
import typings.botvs.botvsStrings.Volume
import typings.botvs.botvsStrings.api
import typings.botvs.botvsStrings.base64
import typings.botvs.botvsStrings.buy_
import typings.botvs.botvsStrings.closebuy
import typings.botvs.botvsStrings.closebuy_today
import typings.botvs.botvsStrings.closesell
import typings.botvs.botvsStrings.closesell_today
import typings.botvs.botvsStrings.cny
import typings.botvs.botvsStrings.currency
import typings.botvs.botvsStrings.hex
import typings.botvs.botvsStrings.md5
import typings.botvs.botvsStrings.raw
import typings.botvs.botvsStrings.sell_
import typings.botvs.botvsStrings.sha1
import typings.botvs.botvsStrings.sha256
import typings.botvs.botvsStrings.sha512
import typings.botvs.botvsStrings.usd
import typings.botvs.mod.global.botvs.ChartOptions
import typings.botvs.mod.global.botvs.Exchange
import typings.botvs.mod.global.botvs.RChart
import typings.botvs.mod.global.botvs.Record
import typings.botvs.mod.global.botvs.Socket
import typings.botvs.mod.global.botvs.VLogType
import typings.botvs.mod.global.botvs.VOrderState
import typings.botvs.mod.global.botvs.VOrderType
import typings.botvs.mod.global.botvs.VPeriod
import typings.botvs.mod.global.botvs.VPositionType
import typings.highcharts.mod.Options
import typings.lodash.mod.LoDashStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /**
    * 比如_CDelay(1000), 指改变_C函数重试间隔为1秒, 默认为3秒
    *
    * @param {number} delay
    */
  @JSGlobal("_CDelay")
  @js.native
  def CDelay(delay: Double): Unit = js.native
  
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
  @JSGlobal("Chart")
  @js.native
  def Chart(options: ChartOptions*): RChart = js.native
  
  /**
    * 原始的Socket访问, 支持tcp, udp, tls, unix 协议
    *
    * @example
    *
    * ```
    * var client = Dial("tls://www.baidu.com:443"); // Dial支持tcp://, udp://, tls://, unix:// 协议, 可加一个参数指定超时的秒数
    * if (client) {
    *  client.write("GET / HTTP/1.1\nConnection: Closed\n\n"); // write可再跟一个数字参数指定超时, write返回成功发送的字节数
    *  while (true) {
    *      var buf = client.read();// read可再跟一个数字参数指定超时, 返回null指出错或者超时或者socket已经关闭
    *      if (!buf) {
    *          break;
    *      }
    *      Log(buf);
    *  }
    *  client.close();
    * }
    * ```
    *
    * @param {string} Address
    * @param {number} Timeout
    * @return {botvs.Socket}
    */
  @JSGlobal("Dial")
  @js.native
  def Dial(Address: String): Socket | Unit = js.native
  @JSGlobal("Dial")
  @js.native
  def Dial(Address: String, Timeout: Double): Socket | Unit = js.native
  
  /**
    * 打开或者关闭定单和出错信息的日志记录
    *
    * @param {boolean} IsEnable
    */
  @JSGlobal("EnableLog")
  @js.native
  def EnableLog(IsEnable: Boolean): Unit = js.native
  
  /**
    * 获取交互命令(utf-8)
    *
    * 获取策略交互界面发来的命令并清空, 没有命令则返回null, 返回的命令格式为 "按钮名称:参数", 如果没有参数, 则命令就是按钮名称
    * while (true) {
    * var cmd = GetCommand();
    * if (cmd) {
    *   Log(cmd);
    * }
    * Sleep(1000);
    * }
    *
    * @return {string}
    */
  @JSGlobal("GetCommand")
  @js.native
  def GetCommand(): String | Null = js.native
  
  /**
    * 获取最近一次出错信息,一般无需使用,因为程序会把出错信息自动上传到日志系统
    *
    * @return {string}
    */
  @JSGlobal("GetLastError")
  @js.native
  def GetLastError(): String = js.native
  
  /**
    * 返回机器人进程ID
    *
    * @return {number}
    */
  @JSGlobal("GetPid")
  @js.native
  def GetPid(): Double = js.native
  
  @JSGlobal("HMAC")
  @js.native
  def HMAC(Algo: md5, OutputAlgo: base64, Data: String, password: String): String = js.native
  /**
    * 支持 md5/sha256/sha512/sha1 的HMAC加密计算, 只支持实盘
    *
    * 第二个参数可设置为raw/hex/base64, 分别指输出加密后的 原始内容/hex编码过的/base64编码过的
    * Log(HMAC('md5', 'hex', 'hello', 'pass'));
    * Log(HMAC('sha512', 'base64', 'hello', 'pass'));
    *
    * @param {"md5" | "sha256" | "sha512" | "sha1"} Algo
    * @param {"hex" | "base64" | "raw"} OutputAlgo
    * @param {string} Data
    * @param {string} password
    * @return {string}
    */
  @JSGlobal("HMAC")
  @js.native
  def HMAC(Algo: md5, OutputAlgo: hex, Data: String, password: String): String = js.native
  @JSGlobal("HMAC")
  @js.native
  def HMAC(Algo: md5, OutputAlgo: raw, Data: String, password: String): String = js.native
  @JSGlobal("HMAC")
  @js.native
  def HMAC(Algo: sha1, OutputAlgo: base64, Data: String, password: String): String = js.native
  @JSGlobal("HMAC")
  @js.native
  def HMAC(Algo: sha1, OutputAlgo: hex, Data: String, password: String): String = js.native
  @JSGlobal("HMAC")
  @js.native
  def HMAC(Algo: sha1, OutputAlgo: raw, Data: String, password: String): String = js.native
  @JSGlobal("HMAC")
  @js.native
  def HMAC(Algo: sha256, OutputAlgo: base64, Data: String, password: String): String = js.native
  @JSGlobal("HMAC")
  @js.native
  def HMAC(Algo: sha256, OutputAlgo: hex, Data: String, password: String): String = js.native
  @JSGlobal("HMAC")
  @js.native
  def HMAC(Algo: sha256, OutputAlgo: raw, Data: String, password: String): String = js.native
  @JSGlobal("HMAC")
  @js.native
  def HMAC(Algo: sha512, OutputAlgo: base64, Data: String, password: String): String = js.native
  @JSGlobal("HMAC")
  @js.native
  def HMAC(Algo: sha512, OutputAlgo: hex, Data: String, password: String): String = js.native
  @JSGlobal("HMAC")
  @js.native
  def HMAC(Algo: sha512, OutputAlgo: raw, Data: String, password: String): String = js.native
  
  @JSGlobal("Hash")
  @js.native
  def Hash(Algo: md5, OutputAlgo: base64, Data: String): String = js.native
  /**
    * 支持 md5/sha256/sha512/sha1 的哈希计算, 只支持实盘
    *
    * 第二个参数可设置为raw/hex/base64, 分别指输出加密后的 原始内容/hex编码过的/base64编码过的
    * Log(Hash('md5', 'hex', 'hello'));
    * Log(Hash('sha512', 'base64', 'hello'));
    *
    * @param {"md5" | "sha256" | "sha512" | "sha1"} Algo
    * @param {"hex" | "base64"} OutputAlgo
    * @param {string} Data
    * @return {string}
    */
  @JSGlobal("Hash")
  @js.native
  def Hash(Algo: md5, OutputAlgo: hex, Data: String): String = js.native
  @JSGlobal("Hash")
  @js.native
  def Hash(Algo: md5, OutputAlgo: raw, Data: String): String = js.native
  @JSGlobal("Hash")
  @js.native
  def Hash(Algo: sha1, OutputAlgo: base64, Data: String): String = js.native
  @JSGlobal("Hash")
  @js.native
  def Hash(Algo: sha1, OutputAlgo: hex, Data: String): String = js.native
  @JSGlobal("Hash")
  @js.native
  def Hash(Algo: sha1, OutputAlgo: raw, Data: String): String = js.native
  @JSGlobal("Hash")
  @js.native
  def Hash(Algo: sha256, OutputAlgo: base64, Data: String): String = js.native
  @JSGlobal("Hash")
  @js.native
  def Hash(Algo: sha256, OutputAlgo: hex, Data: String): String = js.native
  @JSGlobal("Hash")
  @js.native
  def Hash(Algo: sha256, OutputAlgo: raw, Data: String): String = js.native
  @JSGlobal("Hash")
  @js.native
  def Hash(Algo: sha512, OutputAlgo: base64, Data: String): String = js.native
  @JSGlobal("Hash")
  @js.native
  def Hash(Algo: sha512, OutputAlgo: hex, Data: String): String = js.native
  @JSGlobal("Hash")
  @js.native
  def Hash(Algo: sha512, OutputAlgo: raw, Data: String): String = js.native
  
  /**
    * 网络URL访问
    *
    * HttpQuery(Url, PostData, Cookies, Headers, IsReturnHeader)
    * 获取一个Url的返回内容, 如果第二个参数PostData为字符串就以POST方式提交
    * 第二个参数PostData可以自定义方法比如HttpQuery('http://www.abc.com', {method:'PUT', data:'xx'})
    * 传递Cookie字符串需要第三个参数, 但不需要POST请将第二个参数置为null
    * 模拟测试的时候因为无法模拟访问URL, 函数就返回固定字符串 Dummy Data
    * 可以用此接口发送短信, 或者与其它API进行交互
    * HttpQuery("http://www.baidu.com/"); // Get
    * HttpQuery("http://www.163.com", "xxx"); // Post
    * HttpQuery("http://www.baidu.com/", null, "a=10; b=20", "User-Agent: Mobile\nContent-Type: text/html", true);
    * // will return {Header: HTTP Header, Body: HTML}
    *
    * @param {string} Url
    * @param {string | null | {method: string; data?: string}} PostData
    * @param {string} Cookies
    * @param {string} Headers
    * @return {string}
    */
  @JSGlobal("HttpQuery")
  @js.native
  def HttpQuery(Url: String, PostData: String, Cookies: String, Headers: String): String = js.native
  @JSGlobal("HttpQuery")
  @js.native
  def HttpQuery(Url: String, PostData: Null, Cookies: String, Headers: String): String = js.native
  @JSGlobal("HttpQuery")
  @js.native
  def HttpQuery(Url: String, PostData: Data, Cookies: String, Headers: String): String = js.native
  @JSGlobal("HttpQuery")
  @js.native
  def HttpQuery_true(Url: String, PostData: String, Cookies: String, Headers: String, IsReturnHeader: `true`): Body = js.native
  @JSGlobal("HttpQuery")
  @js.native
  def HttpQuery_true(Url: String, PostData: Null, Cookies: String, Headers: String, IsReturnHeader: `true`): Body = js.native
  @JSGlobal("HttpQuery")
  @js.native
  def HttpQuery_true(Url: String, PostData: Data, Cookies: String, Headers: String, IsReturnHeader: `true`): Body = js.native
  
  /**
    * 判断是否是模拟回测
    *
    * 模拟回测状态返回true,实盘返回false
    *
    * @return {boolean}
    */
  @JSGlobal("IsVirtual")
  @js.native
  def IsVirtual(): Boolean = js.native
  
  /**
    * 买单日志
    */
  @JSGlobal("LOG_TYPE_BUY")
  @js.native
  val LOG_TYPE_BUY: VLogType = js.native
  
  /**
    * 取消日志
    */
  @JSGlobal("LOG_TYPE_CANCEL")
  @js.native
  val LOG_TYPE_CANCEL: VLogType = js.native
  
  /**
    * 卖单日志
    */
  @JSGlobal("LOG_TYPE_SELL")
  @js.native
  val LOG_TYPE_SELL: VLogType = js.native
  
  /**
    * 保存一条信息到日志列表
    *
    * 如果在字符串后面加上@字符则消息会进入推送队列, 推送到使用绑定的微信账号上(账户安全里绑定)(50条/小时, 1条/5秒 限制)
    * 如: Log("微信你好 !@"); 或Log("微信你好, #ff0000@");
    * Log支持打印base64编码后的图片, 以"`"开头, 以"`"结尾, 如Log("`data:image/png;base64,AAAA`")
    * Log支持直接打印Python的matplotlib.pyplot对象, 只要对象包含savefig方法就可以直接Log打印, 如:
    * import matplotlib.pyplot as plt
    * def main():
    * plt.plot([3,6,2,4,7,1])
    * Log(plt)
    *
    * @param {*[]} arg
    */
  @JSGlobal("Log")
  @js.native
  def Log(arg: js.Any*): Unit = js.native
  
  /**
    * 记录盈利值,这个为总盈利的值,参数类型为浮点数
    *
    * @param {number} Profit
    * @param {*[]} args
    */
  @JSGlobal("LogProfit")
  @js.native
  def LogProfit(Profit: Double, args: js.Any*): Unit = js.native
  
  /**
    * 清空所有收益日志, 可以带一个数字参数, 指定保留的条数
    *
    * @param {number} reserve
    */
  @JSGlobal("LogProfitReset")
  @js.native
  def LogProfitReset(): Unit = js.native
  @JSGlobal("LogProfitReset")
  @js.native
  def LogProfitReset(reserve: Double): Unit = js.native
  
  /**
    * 清空所有日志, 可以带一个数字参数, 指定保留的条数
    *
    * @param {number} reserve
    */
  @JSGlobal("LogReset")
  @js.native
  def LogReset(): Unit = js.native
  @JSGlobal("LogReset")
  @js.native
  def LogReset(reserve: Double): Unit = js.native
  
  /**
    * 此信息不保存到日志列表里, 只更新当前机器人的状态信息, 在日志上方显示, 可多次调用, 更新状态
    *
    * * LogStatus('这是一个普通的状态提示');
    * LogStatus('这是一个红色字体的状态提示 #ff0000');
    * LogStatus('这是一个多行的状态信息\n我是第二行');
    * LogStatus支持打印base64编码后的图片, 以"`"开头, 以"`"结尾, 如LogStatus("`data:image/png;base64,AAAA`")
    * LogStatus支持直接传入Python的matplotlib.pyplot对象, 只要对象包含savefig方法就可以传入LogStatus, 如:
    * import matplotlib.pyplot as plt
    * def main():
    * plt.plot([3,6,2,4,7,1])
    * LogStatus(plt)
    * var table = {type: 'table', title: '持仓信息', cols: ['列1', '列2'], rows: [ ['abc', 'def'], ['ABC', 'support color
    * #ff0000']]}; LogStatus('`' + JSON.stringify(table)+'`'); // JSON序列化后两边加上`字符, 视为一个复杂消息格式(当前支持表格)
    * LogStatus('第一行消息\n`' + JSON.stringify(table)+'`\n第三行消息');
    * // 表格信息也可以在多行中出现 LogStatus('`' + JSON.stringify([table,
    * table])+'`'); // 支持多个表格同时显示, 将以TAB显示到一组里
    * // 也可以构造一个按钮在表格中, 策略用GetCommand接收cmd属性的内容
    * var table = {
    *  type: 'table',
    *  title: '持仓操作',
    *  cols: ['列1', '列2', 'Action'],
    *  rows: [
    *      ['abc', 'def', {'type':'button', 'cmd': 'coverAll', 'name': '平仓'}],
    *  ]
    * };
    * LogStatus('`' + JSON.stringify(table) + '`')
    * // 或者构造一单独的按钮
    * LogStatus('`' + JSON.stringify({'type':'button', 'cmd': 'coverAll', 'name': '平仓'}) + '`')
    * // 可以自定义按钮风格(bootstrap的按钮属性)
    * LogStatus('`' + JSON.stringify({'type':'button', 'class': 'btn btn-xs btn-danger', 'cmd': 'coverAll', 'name':
    * '平仓'}) + '`')
    *
    * @param {string} Msg
    */
  @JSGlobal("LogStatus")
  @js.native
  def LogStatus(args: js.Any*): Unit = js.native
  
  /**
    * 发送邮件函数
    *
    * Mail(smtpServer, smtpUsername, smtpPassword, mailTo, title, body); ret true or false
    * Mail("smtp.163.com", "asdf@163.com", "password", "111@163.com", "title", "body")
    *
    * @param {string} smtpServer
    * @param {string} smtpUsername
    * @param {string} smtpPassword
    * @param {string} mailTo
    * @param {string} title
    * @param {string} body
    * @return {boolean}
    */
  @JSGlobal("Mail")
  @js.native
  def Mail(
    smtpServer: String,
    smtpUsername: String,
    smtpPassword: String,
    mailTo: String,
    title: String,
    body: String
  ): Boolean = js.native
  
  /**
    * 订单的状态: 已取消
    */
  @JSGlobal("ORDER_STATE_CANCELED")
  @js.native
  val ORDER_STATE_CANCELED: VOrderState = js.native
  
  /**
    * 订单的状态: 已关闭
    */
  @JSGlobal("ORDER_STATE_CLOSED")
  @js.native
  val ORDER_STATE_CLOSED: VOrderState = js.native
  
  /**
    * 订单的状态: 未完成
    */
  @JSGlobal("ORDER_STATE_PENDING")
  @js.native
  val ORDER_STATE_PENDING: VOrderState = js.native
  
  /**
    * 订单的类型: 买单
    */
  @JSGlobal("ORDER_TYPE_BUY")
  @js.native
  val ORDER_TYPE_BUY: VOrderType = js.native
  
  /**
    * 订单的类型: 卖单
    */
  @JSGlobal("ORDER_TYPE_SELL")
  @js.native
  val ORDER_TYPE_SELL: VOrderType = js.native
  
  /**
    * 多头仓位(CTP中用closebuy_today平仓)
    */
  @JSGlobal("PD_LONG")
  @js.native
  val PD_LONG: VPositionType = js.native
  
  /**
    * (CTP期货中)PD_LONG_YD为咋日多头仓位(用closebuy平
    */
  @JSGlobal("PD_LONG_YD")
  @js.native
  val PD_LONG_YD: VPositionType = js.native
  
  /**
    * 空头仓位(CTP用closesell_today)平仓
    */
  @JSGlobal("PD_SHORT")
  @js.native
  val PD_SHORT: VPositionType = js.native
  
  /**
    * 咋日空头仓位(用closesell平)
    */
  @JSGlobal("PD_SHORT_YD")
  @js.native
  val PD_SHORT_YD: VPositionType = js.native
  
  /**
    * 1天
    */
  @JSGlobal("PERIOD_D1")
  @js.native
  val PERIOD_D1: VPeriod = js.native
  
  /**
    * 1小时
    */
  @JSGlobal("PERIOD_H1")
  @js.native
  val PERIOD_H1: VPeriod = js.native
  
  /**
    * 1分钟
    */
  @JSGlobal("PERIOD_M1")
  @js.native
  val PERIOD_M1: VPeriod = js.native
  
  /**
    * 15分钟
    */
  @JSGlobal("PERIOD_M15")
  @js.native
  val PERIOD_M15: VPeriod = js.native
  
  /**
    * 30分钟
    */
  @JSGlobal("PERIOD_M30")
  @js.native
  val PERIOD_M30: VPeriod = js.native
  
  /**
    * 5分钟
    */
  @JSGlobal("PERIOD_M5")
  @js.native
  val PERIOD_M5: VPeriod = js.native
  
  /**
    * 错误信息过滤
    *
    * 被此正则表达式匹配的错误将不上传到日志系统, 可多次调用设置多个
    * SetErrorFilter("502:|503:|tcp|character|unexpected|network|timeout|WSARecv|Connect|GetAddr|no
    * such|reset|http|received|EOF|reused");
    *
    * @param {string} RegEx
    */
  @JSGlobal("SetErrorFilter")
  @js.native
  def SetErrorFilter(RegEx: String): Unit = js.native
  
  /**
    * 休眠函数
    *
    * 参数为毫秒数,如Sleep(1000)为休眠一秒
    *
    * @param {number} Millisecond
    */
  @JSGlobal("Sleep")
  @js.native
  def Sleep(Millisecond: Double): Unit = js.native
  
  object TA {
    
    /**
      * 平均真实波幅
      *
      * ATR(数据, 周期), 默认参数为14, 返回一个一维数组
      *
      * @param {botvs.Record[]} Records
      * @param {number} Period
      * @return {number[]}
      */
    @JSGlobal("TA.ATR")
    @js.native
    def ATR(Records: js.Array[Record]): js.Array[Double] = js.native
    @JSGlobal("TA.ATR")
    @js.native
    def ATR(Records: js.Array[Record], Period: Double): js.Array[Double] = js.native
    
    /**
      * Alligator Indicator
      *
      * Alligator(数据, 下颚周期,牙齿周期,上唇周期), 鳄鱼线指标, 默认参数为(13,8,5) 返回一个二维数组[下颚,牙齿,上唇]
      *
      * @param {botvs.Record[]} Records
      * @param {number} JawPeriod
      * @param {number} TeethPeriod
      * @param {number} LibsPeriod
      * @return {[number[] , number[] , number[]]}
      */
    @JSGlobal("TA.Alligator")
    @js.native
    def Alligator(Records: js.Array[Record]): js.Tuple3[js.Array[Double], js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("TA.Alligator")
    @js.native
    def Alligator(
      Records: js.Array[Record],
      JawPeriod: js.UndefOr[scala.Nothing],
      TeethPeriod: js.UndefOr[scala.Nothing],
      LibsPeriod: Double
    ): js.Tuple3[js.Array[Double], js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("TA.Alligator")
    @js.native
    def Alligator(Records: js.Array[Record], JawPeriod: js.UndefOr[scala.Nothing], TeethPeriod: Double): js.Tuple3[js.Array[Double], js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("TA.Alligator")
    @js.native
    def Alligator(
      Records: js.Array[Record],
      JawPeriod: js.UndefOr[scala.Nothing],
      TeethPeriod: Double,
      LibsPeriod: Double
    ): js.Tuple3[js.Array[Double], js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("TA.Alligator")
    @js.native
    def Alligator(Records: js.Array[Record], JawPeriod: Double): js.Tuple3[js.Array[Double], js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("TA.Alligator")
    @js.native
    def Alligator(
      Records: js.Array[Record],
      JawPeriod: Double,
      TeethPeriod: js.UndefOr[scala.Nothing],
      LibsPeriod: Double
    ): js.Tuple3[js.Array[Double], js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("TA.Alligator")
    @js.native
    def Alligator(Records: js.Array[Record], JawPeriod: Double, TeethPeriod: Double): js.Tuple3[js.Array[Double], js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("TA.Alligator")
    @js.native
    def Alligator(Records: js.Array[Record], JawPeriod: Double, TeethPeriod: Double, LibsPeriod: Double): js.Tuple3[js.Array[Double], js.Array[Double], js.Array[Double]] = js.native
    
    /**
      * Chaikin Money Flow
      *
      * CMF(数据, 周期), 默认周期参数为20, 返回一个一维数组
      *
      * @param {botvs.Record[]} Records
      * @param {number} Period
      * @return {number[]}
      */
    @JSGlobal("TA.CMF")
    @js.native
    def CMF(Records: js.Array[Record]): js.Array[Double] = js.native
    @JSGlobal("TA.CMF")
    @js.native
    def CMF(Records: js.Array[Record], Period: Double): js.Array[Double] = js.native
    
    /**
      * 指数平均数指标
      * EMA(数据, 周期), 默认参数为9, 返回一个一维数组
      *
      * @param {botvs.Record[]} Records
      * @param {number} Period
      * @return {number[]}
      */
    @JSGlobal("TA.EMA")
    @js.native
    def EMA(Records: js.Array[Record]): js.Array[Double] = js.native
    @JSGlobal("TA.EMA")
    @js.native
    def EMA(Records: js.Array[Record], Period: Double): js.Array[Double] = js.native
    
    /**
      * 周期最高价
      *
      * Highest(数据, 周期, 属性), 返回最近周期内的最大值(不包含当前Bar),
      * 如TA.Highest(records, 30, 'High'), 如果周期为0指所有, 如属性不指定则视数据为普通数组
      *
      * @param {botvs.Record[]} Records
      * @param {number} Period
      * @param {keyof botvs.Record} Property
      * @return {number}
      * @constructor
      */
    @JSGlobal("TA.Highest")
    @js.native
    def Highest(Records: js.Array[Record]): Double = js.native
    @JSGlobal("TA.Highest")
    @js.native
    def Highest(
      Records: js.Array[Record],
      Period: js.UndefOr[scala.Nothing],
      Property: Time | Open | High | Low | Close | Volume
    ): Double = js.native
    @JSGlobal("TA.Highest")
    @js.native
    def Highest(Records: js.Array[Record], Period: Double): Double = js.native
    @JSGlobal("TA.Highest")
    @js.native
    def Highest(Records: js.Array[Record], Period: Double, Property: Time | Open | High | Low | Close | Volume): Double = js.native
    
    /**
      * 随机指标
      *
      * KDJ(数据, 周期1, 周期2, 周期3), 默认参数为(9, 3, 3), 返回二维数组, 分别是[K, D, J]
      *
      * @param {botvs.Record[]} Records
      * @param {number} FirstPeriod
      * @param {number} SecondPeriod
      * @param {number} ThirdPeriod
      * @return {[number[] , number[] , number[]]}
      */
    @JSGlobal("TA.KDJ")
    @js.native
    def KDJ(Records: js.Array[Record]): js.Tuple3[js.Array[Double], js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("TA.KDJ")
    @js.native
    def KDJ(
      Records: js.Array[Record],
      FirstPeriod: js.UndefOr[scala.Nothing],
      SecondPeriod: js.UndefOr[scala.Nothing],
      ThirdPeriod: Double
    ): js.Tuple3[js.Array[Double], js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("TA.KDJ")
    @js.native
    def KDJ(Records: js.Array[Record], FirstPeriod: js.UndefOr[scala.Nothing], SecondPeriod: Double): js.Tuple3[js.Array[Double], js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("TA.KDJ")
    @js.native
    def KDJ(
      Records: js.Array[Record],
      FirstPeriod: js.UndefOr[scala.Nothing],
      SecondPeriod: Double,
      ThirdPeriod: Double
    ): js.Tuple3[js.Array[Double], js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("TA.KDJ")
    @js.native
    def KDJ(Records: js.Array[Record], FirstPeriod: Double): js.Tuple3[js.Array[Double], js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("TA.KDJ")
    @js.native
    def KDJ(
      Records: js.Array[Record],
      FirstPeriod: Double,
      SecondPeriod: js.UndefOr[scala.Nothing],
      ThirdPeriod: Double
    ): js.Tuple3[js.Array[Double], js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("TA.KDJ")
    @js.native
    def KDJ(Records: js.Array[Record], FirstPeriod: Double, SecondPeriod: Double): js.Tuple3[js.Array[Double], js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("TA.KDJ")
    @js.native
    def KDJ(Records: js.Array[Record], FirstPeriod: Double, SecondPeriod: Double, ThirdPeriod: Double): js.Tuple3[js.Array[Double], js.Array[Double], js.Array[Double]] = js.native
    
    /**
      * 周期最低价
      *
      * Lowest(数据, 周期, 属性), 同上, 求最小值
      *
      * @param {botvs.Record[]} Records
      * @param {number} Period
      * @param {keyof botvs.Record} Property
      * @return {number}
      */
    @JSGlobal("TA.Lowest")
    @js.native
    def Lowest(Records: js.Array[Record]): Double = js.native
    @JSGlobal("TA.Lowest")
    @js.native
    def Lowest(
      Records: js.Array[Record],
      Period: js.UndefOr[scala.Nothing],
      Property: Time | Open | High | Low | Close | Volume
    ): Double = js.native
    @JSGlobal("TA.Lowest")
    @js.native
    def Lowest(Records: js.Array[Record], Period: Double): Double = js.native
    @JSGlobal("TA.Lowest")
    @js.native
    def Lowest(Records: js.Array[Record], Period: Double, Property: Time | Open | High | Low | Close | Volume): Double = js.native
    
    /**
      * 移动平均线
      *
      * MA(数据, 周期), 默认参数为9, 返回一个一维数组
      *
      * @param {botvs.Record[]} Records
      * @param {number} Period
      * @return {number[]}
      */
    @JSGlobal("TA.MA")
    @js.native
    def MA(Records: js.Array[Record]): js.Array[Double] = js.native
    @JSGlobal("TA.MA")
    @js.native
    def MA(Records: js.Array[Record], Period: Double): js.Array[Double] = js.native
    
    /**
      * 指数平滑异同平均线
      *
      * MACD(数据, 快周期, 慢周期, 信号周期), 默认参数为(12, 26, 9), 返回二维数组, 分别是[DIF, DEA, MACD]
      *
      * @param {botvs.Record[]} Records
      * @param {number} LongPeriod
      * @param {number} ShortPeriod
      * @param {number} SignalPeriod
      * @return {[number[] , number[] , number[]]}
      */
    @JSGlobal("TA.MACD")
    @js.native
    def MACD(Records: js.Array[Record]): js.Tuple3[js.Array[Double], js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("TA.MACD")
    @js.native
    def MACD(
      Records: js.Array[Record],
      LongPeriod: js.UndefOr[scala.Nothing],
      ShortPeriod: js.UndefOr[scala.Nothing],
      SignalPeriod: Double
    ): js.Tuple3[js.Array[Double], js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("TA.MACD")
    @js.native
    def MACD(Records: js.Array[Record], LongPeriod: js.UndefOr[scala.Nothing], ShortPeriod: Double): js.Tuple3[js.Array[Double], js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("TA.MACD")
    @js.native
    def MACD(
      Records: js.Array[Record],
      LongPeriod: js.UndefOr[scala.Nothing],
      ShortPeriod: Double,
      SignalPeriod: Double
    ): js.Tuple3[js.Array[Double], js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("TA.MACD")
    @js.native
    def MACD(Records: js.Array[Record], LongPeriod: Double): js.Tuple3[js.Array[Double], js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("TA.MACD")
    @js.native
    def MACD(
      Records: js.Array[Record],
      LongPeriod: Double,
      ShortPeriod: js.UndefOr[scala.Nothing],
      SignalPeriod: Double
    ): js.Tuple3[js.Array[Double], js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("TA.MACD")
    @js.native
    def MACD(Records: js.Array[Record], LongPeriod: Double, ShortPeriod: Double): js.Tuple3[js.Array[Double], js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("TA.MACD")
    @js.native
    def MACD(Records: js.Array[Record], LongPeriod: Double, ShortPeriod: Double, SignalPeriod: Double): js.Tuple3[js.Array[Double], js.Array[Double], js.Array[Double]] = js.native
    
    /**
      * 能量潮
      *
      * OBV(数据), 返回一个一维数组
      *
      * @param {botvs.Record[]} Records
      * @return {[number[] , number[]]}
      */
    @JSGlobal("TA.OBV")
    @js.native
    def OBV(Records: js.Array[Record]): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
    
    /**
      * 强弱指标
      *
      * RSI(数据, 周期), 默认参数为14, 返回一个一维数组
      *
      * @param {botvs.Record[]} Records
      * @param {number} Period
      * @return {number[]}
      */
    @JSGlobal("TA.RSI")
    @js.native
    def RSI(Records: js.Array[Record]): js.Array[Double] = js.native
    @JSGlobal("TA.RSI")
    @js.native
    def RSI(Records: js.Array[Record], Period: Double): js.Array[Double] = js.native
  }
  
  /**
    * 重试函数, 会一直调用指定函数到成功返回(函数返回null或者false会重试),
    * 比如_C(exchange.GetTicker), 默认重试间隔为3秒, 可以调用_CDelay函数来控制重试间隔
    * 比如_CDelay(1000), 指改变_C函数重试间隔为1秒
    *
    * @param {(...args: any[]) => T} func
    * @param args
    * @return {T}
    */
  @JSGlobal("_C")
  @js.native
  def _C[T](func: js.Function1[/* repeated */ js.Any, T], args: js.Any*): T = js.native
  
  /**
    * 返回指定时间戳(ms)字符串, 不传任何参数就返回当前时间,
    * 如_D(),或者_D(1478570053241), 默认格式为yyyy-MM-dd hh:mm:ss
    *
    * @param {string} timestamp
    * @param {string} format
    * @return {string}
    */
  @JSGlobal("_D")
  @js.native
  def _D(timestamp: String, format: String): String = js.native
  
  /**
    * 可保存的全局字典表
    *
    * KV表, 永久保存在本地文件, 每个机器人单独一个数据库, 重启或者托管者退出后一直存在
    * K必须为数字或者字符串, 不区分大小写, V可以为任何可以JSON序列化的内容
    * _G("num", 1); // 设置一个全局变量num, 值为1
    * _G("num", "ok"); // 更改一个全局变量num, 值为字符串ok
    * _G("num", null); // 删除全局变量 num
    * _G("num"); // 返回全局变量num的值
    * _G(); // 返回当前机器人的ID
    * _G(null); // 删除所有全局变量
    *
    * @param {string} K
    * @param {T} V
    */
  @JSGlobal("_G")
  @js.native
  def _G[T](K: String, V: T): Unit = js.native
  
  /**
    * 格式化一个浮点函数
    *
    * @param {number} num
    * @param {number=4} precision
    * @return {string}
    */
  @JSGlobal("_N")
  @js.native
  def _N(num: Double): String = js.native
  @JSGlobal("_N")
  @js.native
  def _N(num: Double, precision: Double): String = js.native
  
  @JSGlobal("_")
  @js.native
  val _underscore: LoDashStatic = js.native
  
  /**
    * 默认主交易所对像, 添加交易平台时排列第一的交易所
    */
  @JSGlobal("exchange")
  @js.native
  val exchange: Exchange = js.native
  
  /**
    * 交易所数组, 如果添加多个交易所, 可以访问此变量获取交易所对像
    */
  @JSGlobal("exchanges")
  @js.native
  val exchanges: js.Array[Exchange] = js.native
  
  object talib {
    
    /**
      * Vector Trigonometric ACos (反余弦函数)
      *
      * ACOS(Records[Close]) = Array(outReal)
      *
      * @param {botvs.Record[]|number[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.ACOS")
    @js.native
    def ACOS(Records: js.Array[Double | Record]): js.Array[Double] = js.native
    
    /**
      * Chaikin A/D Line (线随机指标)
      *
      * AD(Records[High,Low,Close,Volume]) = Array(outReal)
      *
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @param {number[]} Volume
      * @return {number[]}
      */
    @JSGlobal("talib.AD")
    @js.native
    def AD(High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
    @JSGlobal("talib.AD")
    @js.native
    def AD(High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double], Volume: js.Array[Double]): js.Array[Double] = js.native
    /**
      * Chaikin A/D Line (线随机指标)
      *
      * AD(Records[High,Low,Close,Volume]) = Array(outReal)
      *
      * @param {botvs.Record[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.AD")
    @js.native
    def AD(Records: js.Array[Record]): js.Array[Double] = js.native
    
    /**
      * Chaikin A/D Oscillator (佳庆指标)
      *
      * ADOSC(Records[High,Low,Close,Volume],Fast Period = 3,Slow Period = 10) = Array(outReal)
      *
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @param {number[]} Volume
      * @param {number=3} FastPeriod
      * @param {number=10} SlowPeriod
      * @return {number[]}
      */
    @JSGlobal("talib.ADOSC")
    @js.native
    def ADOSC(
      High: js.Array[Double],
      Low: js.Array[Double],
      Close: js.Array[Double],
      Volume: js.Array[Double],
      FastPeriod: Double,
      SlowPeriod: Double
    ): js.Array[Double] = js.native
    /**
      * Chaikin A/D Oscillator (佳庆指标)
      *
      * ADOSC(Records[High,Low,Close,Volume],Fast Period = 3,Slow Period = 10) = Array(outReal)
      *
      * @param {botvs.Record[]} Records
      * @param {number=3} FastPeriod
      * @param {number=10} SlowPeriod
      * @return {number[]}
      */
    @JSGlobal("talib.ADOSC")
    @js.native
    def ADOSC(Records: js.Array[Record]): js.Array[Double] = js.native
    @JSGlobal("talib.ADOSC")
    @js.native
    def ADOSC(Records: js.Array[Record], FastPeriod: js.UndefOr[scala.Nothing], SlowPeriod: Double): js.Array[Double] = js.native
    @JSGlobal("talib.ADOSC")
    @js.native
    def ADOSC(Records: js.Array[Record], FastPeriod: Double): js.Array[Double] = js.native
    @JSGlobal("talib.ADOSC")
    @js.native
    def ADOSC(Records: js.Array[Record], FastPeriod: Double, SlowPeriod: Double): js.Array[Double] = js.native
    
    /**
      * Average Directional Movement Index (平均趋向指数)
      *
      * ADX(Records[High,Low,Close],Time Period = 14) = Array(outReal)
      *
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @param {number=14} TimePeriod
      * @return {number[]}
      */
    @JSGlobal("talib.ADX")
    @js.native
    def ADX(High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
    @JSGlobal("talib.ADX")
    @js.native
    def ADX(High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double], TimePeriod: Double): js.Array[Double] = js.native
    /**
      * Average Directional Movement Index (平均趋向指数)
      *
      * ADX(Records[High,Low,Close],Time Period = 14) = Array(outReal)
      *
      * @param {botvs.Record[]} Records
      * @param {number=14} TimePeriod
      * @return {number[]}
      */
    @JSGlobal("talib.ADX")
    @js.native
    def ADX(Records: js.Array[Record]): js.Array[Double] = js.native
    @JSGlobal("talib.ADX")
    @js.native
    def ADX(Records: js.Array[Record], TimePeriod: Double): js.Array[Double] = js.native
    
    /**
      * Average Directional Movement Index Rating (评估指数)
      *
      * ADXR(Records[High,Low,Close],Time Period = 14) = Array(outReal)
      *
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @param {number=14} TimePeriod
      * @return {number[]}
      */
    @JSGlobal("talib.ADXR")
    @js.native
    def ADXR(High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
    @JSGlobal("talib.ADXR")
    @js.native
    def ADXR(High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double], TimePeriod: Double): js.Array[Double] = js.native
    /**
      * Average Directional Movement Index Rating (评估指数)
      *
      * ADXR(Records[High,Low,Close],Time Period = 14) = Array(outReal)
      *
      * @param {botvs.Record[]} Records
      * @param {number=14} TimePeriod
      * @return {number[]}
      */
    @JSGlobal("talib.ADXR")
    @js.native
    def ADXR(Records: js.Array[Record]): js.Array[Double] = js.native
    @JSGlobal("talib.ADXR")
    @js.native
    def ADXR(Records: js.Array[Record], TimePeriod: Double): js.Array[Double] = js.native
    
    /**
      * Absolute Price Oscillator (绝对价格振荡指数)
      *
      * APO(Records[Close],Fast Period = 12,Slow Period = 26,MA Type = 0) = Array(outReal)
      *
      * @param {botvs.Record[]|number[]} Records
      * @param {number=12} FastPeriod
      * @param {number=26} SlowPeriod
      * @param {number=0} MAType
      * @return {number[]}
      */
    @JSGlobal("talib.APO")
    @js.native
    def APO(Records: js.Array[Double | Record]): js.Array[Double] = js.native
    @JSGlobal("talib.APO")
    @js.native
    def APO(
      Records: js.Array[Double | Record],
      FastPeriod: js.UndefOr[scala.Nothing],
      SlowPeriod: js.UndefOr[scala.Nothing],
      MAType: Double
    ): js.Array[Double] = js.native
    @JSGlobal("talib.APO")
    @js.native
    def APO(Records: js.Array[Double | Record], FastPeriod: js.UndefOr[scala.Nothing], SlowPeriod: Double): js.Array[Double] = js.native
    @JSGlobal("talib.APO")
    @js.native
    def APO(
      Records: js.Array[Double | Record],
      FastPeriod: js.UndefOr[scala.Nothing],
      SlowPeriod: Double,
      MAType: Double
    ): js.Array[Double] = js.native
    @JSGlobal("talib.APO")
    @js.native
    def APO(Records: js.Array[Double | Record], FastPeriod: Double): js.Array[Double] = js.native
    @JSGlobal("talib.APO")
    @js.native
    def APO(
      Records: js.Array[Double | Record],
      FastPeriod: Double,
      SlowPeriod: js.UndefOr[scala.Nothing],
      MAType: Double
    ): js.Array[Double] = js.native
    @JSGlobal("talib.APO")
    @js.native
    def APO(Records: js.Array[Double | Record], FastPeriod: Double, SlowPeriod: Double): js.Array[Double] = js.native
    @JSGlobal("talib.APO")
    @js.native
    def APO(Records: js.Array[Double | Record], FastPeriod: Double, SlowPeriod: Double, MAType: Double): js.Array[Double] = js.native
    
    /**
      * Aroon (阿隆指标)
      *
      * AROON(Records[High,Low],Time Period = 14) = [Array(outAroonDown),Array(outAroonUp)]
      *
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number=14} TimePeriod
      * @return {[number[], number[]]}
      */
    @JSGlobal("talib.AROON")
    @js.native
    def AROON(High: js.Array[Double], Low: js.Array[Double]): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.AROON")
    @js.native
    def AROON(High: js.Array[Double], Low: js.Array[Double], TimePeriod: Double): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
    /**
      * Aroon (阿隆指标)
      *
      * AROON(Records[High,Low],Time Period = 14) = [Array(outAroonDown),Array(outAroonUp)]
      *
      * @param {botvs.Record[]} Records
      * @param {number=14} TimePeriod
      * @return {[number[], number[]]}
      */
    @JSGlobal("talib.AROON")
    @js.native
    def AROON(Records: js.Array[Record]): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.AROON")
    @js.native
    def AROON(Records: js.Array[Record], TimePeriod: Double): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
    
    /**
      * Aroon Oscillator (阿隆震荡线)
      *
      * AROONOSC(Records[High,Low],Time Period = 14) = Array(outReal)
      *
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number=14} TimePeriod
      * @return {number[]}
      */
    @JSGlobal("talib.AROONOSC")
    @js.native
    def AROONOSC(High: js.Array[Double], Low: js.Array[Double]): js.Array[Double] = js.native
    @JSGlobal("talib.AROONOSC")
    @js.native
    def AROONOSC(High: js.Array[Double], Low: js.Array[Double], TimePeriod: Double): js.Array[Double] = js.native
    /**
      * Aroon Oscillator (阿隆震荡线)
      *
      * AROONOSC(Records[High,Low],Time Period = 14) = Array(outReal)
      *
      * @param {botvs.Record[]} Records
      * @param {number=14} TimePeriod
      * @return {number[]}
      */
    @JSGlobal("talib.AROONOSC")
    @js.native
    def AROONOSC(Records: js.Array[Record]): js.Array[Double] = js.native
    @JSGlobal("talib.AROONOSC")
    @js.native
    def AROONOSC(Records: js.Array[Record], TimePeriod: Double): js.Array[Double] = js.native
    
    /**
      * Vector Trigonometric ASin (反正弦函数)
      *
      * ASIN(Records[Close]) = Array(outReal)
      *
      * @param {botvs.Record[]|number[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.ASIN")
    @js.native
    def ASIN(Records: js.Array[Double | Record]): js.Array[Double] = js.native
    
    /**
      * Vector Trigonometric ATan (反正切函数)
      *
      * ATAN(Records[Close]) = Array(outReal)
      *
      * @param {botvs.Record[]|number[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.ATAN")
    @js.native
    def ATAN(Records: js.Array[Double | Record]): js.Array[Double] = js.native
    
    /**
      * Average True Range (平均真实波幅)
      *
      * ATR(Records[High,Low,Close],Time Period = 14) = Array(outReal)
      *
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @param {number=14} TimePeriod
      * @return {number[]}
      */
    @JSGlobal("talib.ATR")
    @js.native
    def ATR(High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
    @JSGlobal("talib.ATR")
    @js.native
    def ATR(High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double], TimePeriod: Double): js.Array[Double] = js.native
    /**
      * Average True Range (平均真实波幅)
      *
      * ATR(Records[High,Low,Close],Time Period = 14) = Array(outReal)
      *
      * @param {botvs.Record[]} Records
      * @param {number=14} TimePeriod
      * @return {number[]}
      */
    @JSGlobal("talib.ATR")
    @js.native
    def ATR(Records: js.Array[Record]): js.Array[Double] = js.native
    @JSGlobal("talib.ATR")
    @js.native
    def ATR(Records: js.Array[Record], TimePeriod: Double): js.Array[Double] = js.native
    
    /**
      * Average Price (平均价格)
      *
      * AVGPRICE(Records[Open,High,Low,Close]) = Array(outReal)
      *
      * @param {number[]} Open
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @return {number[]}
      */
    @JSGlobal("talib.AVGPRICE")
    @js.native
    def AVGPRICE(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
    /**
      * Average Price (平均价格)
      *
      * AVGPRICE(Records[Open,High,Low,Close]) = Array(outReal)
      *
      * @param {botvs.Record[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.AVGPRICE")
    @js.native
    def AVGPRICE(Records: js.Array[Record]): js.Array[Double] = js.native
    
    /**
      * Bollinger Bands (布林带)
      *
      * BBANDS(Records[Close],Time Period = 5,Deviations up = 2,Deviations down = 2,MA Type = 0) =
      * [Array(outRealUpperBand),Array(outRealMiddleBand),Array(outRealLowerBand)]
      *
      * @param {botvs.Record[]|number[]} Records
      * @param {number=5} TimePeriod
      * @param {number=2} Deviationsup
      * @param {number=2} Deviationsdown
      * @param {number=0} MAType
      * @return {[number[], number[], number[]]}
      */
    @JSGlobal("talib.BBANDS")
    @js.native
    def BBANDS(Records: js.Array[Double | Record]): js.Tuple3[js.Array[Double], js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.BBANDS")
    @js.native
    def BBANDS(
      Records: js.Array[Double | Record],
      TimePeriod: js.UndefOr[scala.Nothing],
      Deviationsup: js.UndefOr[scala.Nothing],
      Deviationsdown: js.UndefOr[scala.Nothing],
      MAType: Double
    ): js.Tuple3[js.Array[Double], js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.BBANDS")
    @js.native
    def BBANDS(
      Records: js.Array[Double | Record],
      TimePeriod: js.UndefOr[scala.Nothing],
      Deviationsup: js.UndefOr[scala.Nothing],
      Deviationsdown: Double
    ): js.Tuple3[js.Array[Double], js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.BBANDS")
    @js.native
    def BBANDS(
      Records: js.Array[Double | Record],
      TimePeriod: js.UndefOr[scala.Nothing],
      Deviationsup: js.UndefOr[scala.Nothing],
      Deviationsdown: Double,
      MAType: Double
    ): js.Tuple3[js.Array[Double], js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.BBANDS")
    @js.native
    def BBANDS(Records: js.Array[Double | Record], TimePeriod: js.UndefOr[scala.Nothing], Deviationsup: Double): js.Tuple3[js.Array[Double], js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.BBANDS")
    @js.native
    def BBANDS(
      Records: js.Array[Double | Record],
      TimePeriod: js.UndefOr[scala.Nothing],
      Deviationsup: Double,
      Deviationsdown: js.UndefOr[scala.Nothing],
      MAType: Double
    ): js.Tuple3[js.Array[Double], js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.BBANDS")
    @js.native
    def BBANDS(
      Records: js.Array[Double | Record],
      TimePeriod: js.UndefOr[scala.Nothing],
      Deviationsup: Double,
      Deviationsdown: Double
    ): js.Tuple3[js.Array[Double], js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.BBANDS")
    @js.native
    def BBANDS(
      Records: js.Array[Double | Record],
      TimePeriod: js.UndefOr[scala.Nothing],
      Deviationsup: Double,
      Deviationsdown: Double,
      MAType: Double
    ): js.Tuple3[js.Array[Double], js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.BBANDS")
    @js.native
    def BBANDS(Records: js.Array[Double | Record], TimePeriod: Double): js.Tuple3[js.Array[Double], js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.BBANDS")
    @js.native
    def BBANDS(
      Records: js.Array[Double | Record],
      TimePeriod: Double,
      Deviationsup: js.UndefOr[scala.Nothing],
      Deviationsdown: js.UndefOr[scala.Nothing],
      MAType: Double
    ): js.Tuple3[js.Array[Double], js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.BBANDS")
    @js.native
    def BBANDS(
      Records: js.Array[Double | Record],
      TimePeriod: Double,
      Deviationsup: js.UndefOr[scala.Nothing],
      Deviationsdown: Double
    ): js.Tuple3[js.Array[Double], js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.BBANDS")
    @js.native
    def BBANDS(
      Records: js.Array[Double | Record],
      TimePeriod: Double,
      Deviationsup: js.UndefOr[scala.Nothing],
      Deviationsdown: Double,
      MAType: Double
    ): js.Tuple3[js.Array[Double], js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.BBANDS")
    @js.native
    def BBANDS(Records: js.Array[Double | Record], TimePeriod: Double, Deviationsup: Double): js.Tuple3[js.Array[Double], js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.BBANDS")
    @js.native
    def BBANDS(
      Records: js.Array[Double | Record],
      TimePeriod: Double,
      Deviationsup: Double,
      Deviationsdown: js.UndefOr[scala.Nothing],
      MAType: Double
    ): js.Tuple3[js.Array[Double], js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.BBANDS")
    @js.native
    def BBANDS(
      Records: js.Array[Double | Record],
      TimePeriod: Double,
      Deviationsup: Double,
      Deviationsdown: Double
    ): js.Tuple3[js.Array[Double], js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.BBANDS")
    @js.native
    def BBANDS(
      Records: js.Array[Double | Record],
      TimePeriod: Double,
      Deviationsup: Double,
      Deviationsdown: Double,
      MAType: Double
    ): js.Tuple3[js.Array[Double], js.Array[Double], js.Array[Double]] = js.native
    
    /**
      * Balance Of Power (均势指标)
      *
      * BOP(Records[Open,High,Low,Close]) = Array(outReal)
      *
      * @param {number[]} Open
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @return {number[]}
      */
    @JSGlobal("talib.BOP")
    @js.native
    def BOP(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
    /**
      * Balance Of Power (均势指标)
      *
      * BOP(Records[Open,High,Low,Close]) = Array(outReal)
      *
      * @param {botvs.Record[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.BOP")
    @js.native
    def BOP(Records: js.Array[Record]): js.Array[Double] = js.native
    
    /**
      * Commodity Channel Index (顺势指标)
      *
      * CCI(Records[High,Low,Close],Time Period = 14) = Array(outReal)
      *
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @param {number=14} TimePeriod
      * @return {number[]}
      */
    @JSGlobal("talib.CCI")
    @js.native
    def CCI(High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
    @JSGlobal("talib.CCI")
    @js.native
    def CCI(High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double], TimePeriod: Double): js.Array[Double] = js.native
    /**
      * Commodity Channel Index (顺势指标)
      *
      * CCI(Records[High,Low,Close],Time Period = 14) = Array(outReal)
      *
      * @param {botvs.Record[]} Records
      * @param {number=14} TimePeriod
      * @return {number[]}
      */
    @JSGlobal("talib.CCI")
    @js.native
    def CCI(Records: js.Array[Record]): js.Array[Double] = js.native
    @JSGlobal("talib.CCI")
    @js.native
    def CCI(Records: js.Array[Record], TimePeriod: Double): js.Array[Double] = js.native
    
    /**
      * Two Crows (K线图--两只乌鸦)
      *
      * CDL2CROWS(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {number[]} Open
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @return {number[]}
      */
    @JSGlobal("talib.CDL2CROWS")
    @js.native
    def CDL2CROWS(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
    /**
      * Two Crows (K线图--两只乌鸦)
      *
      * CDL2CROWS(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {botvs.Record[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.CDL2CROWS")
    @js.native
    def CDL2CROWS(Records: js.Array[Record]): js.Array[Double] = js.native
    
    /**
      * Three Black Crows (K线图--3只黑乌鸦)
      *
      * CDL3BLACKCROWS(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {number[]} Open
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @return {number[]}
      */
    @JSGlobal("talib.CDL3BLACKCROWS")
    @js.native
    def CDL3BLACKCROWS(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
    /**
      * Three Black Crows (K线图--3只黑乌鸦)
      *
      * CDL3BLACKCROWS(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {botvs.Record[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.CDL3BLACKCROWS")
    @js.native
    def CDL3BLACKCROWS(Records: js.Array[Record]): js.Array[Double] = js.native
    
    /**
      * Three Inside Up/Down (K线图:3内上下震荡)
      *
      * CDL3INSIDE(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {number[]} Open
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @return {number[]}
      */
    @JSGlobal("talib.CDL3INSIDE")
    @js.native
    def CDL3INSIDE(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
    /**
      * Three Inside Up/Down (K线图:3内上下震荡)
      *
      * CDL3INSIDE(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {botvs.Record[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.CDL3INSIDE")
    @js.native
    def CDL3INSIDE(Records: js.Array[Record]): js.Array[Double] = js.native
    
    /**
      * Three-Line Strike  (K线图:3线震荡)
      *
      * CDL3LINESTRIKE(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {number[]} Open
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @return {number[]}
      */
    @JSGlobal("talib.CDL3LINESTRIKE")
    @js.native
    def CDL3LINESTRIKE(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
    /**
      * Three-Line Strike  (K线图:3线震荡)
      *
      * CDL3LINESTRIKE(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {botvs.Record[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.CDL3LINESTRIKE")
    @js.native
    def CDL3LINESTRIKE(Records: js.Array[Record]): js.Array[Double] = js.native
    
    /**
      * Three Outside Up/Down (K线图:3外下震荡)
      *
      * CDL3OUTSIDE(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {number[]} Open
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @return {number[]}
      */
    @JSGlobal("talib.CDL3OUTSIDE")
    @js.native
    def CDL3OUTSIDE(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
    /**
      * Three Outside Up/Down (K线图:3外下震荡)
      *
      * CDL3OUTSIDE(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {botvs.Record[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.CDL3OUTSIDE")
    @js.native
    def CDL3OUTSIDE(Records: js.Array[Record]): js.Array[Double] = js.native
    
    /**
      * Three Stars In The South (K线图:南方三星)
      *
      * CDL3STARSINSOUTH(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {number[]} Open
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @return {number[]}
      */
    @JSGlobal("talib.CDL3STARSINSOUTH")
    @js.native
    def CDL3STARSINSOUTH(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
    /**
      * Three Stars In The South (K线图:南方三星)
      *
      * CDL3STARSINSOUTH(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {botvs.Record[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.CDL3STARSINSOUTH")
    @js.native
    def CDL3STARSINSOUTH(Records: js.Array[Record]): js.Array[Double] = js.native
    
    /**
      * Three Advancing White Soldiers (K线图:三白兵)
      *
      * CDL3WHITESOLDIERS(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {number[]} Open
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @return {number[]}
      */
    @JSGlobal("talib.CDL3WHITESOLDIERS")
    @js.native
    def CDL3WHITESOLDIERS(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
    /**
      * Three Advancing White Soldiers (K线图:三白兵)
      *
      * CDL3WHITESOLDIERS(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {botvs.Record[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.CDL3WHITESOLDIERS")
    @js.native
    def CDL3WHITESOLDIERS(Records: js.Array[Record]): js.Array[Double] = js.native
    
    /**
      * Abandoned Baby (K线图:弃婴)
      *
      * CDLABANDONEDBABY(Records[Open,High,Low,Close],Penetration = 0.3) = Array(outInteger)
      *
      * @param {number[]} Open
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @param {number=0.3} Penetration
      * @return {number[]}
      */
    @JSGlobal("talib.CDLABANDONEDBABY")
    @js.native
    def CDLABANDONEDBABY(
      Open: js.Array[Double],
      High: js.Array[Double],
      Low: js.Array[Double],
      Close: js.Array[Double],
      Penetration: Double
    ): js.Array[Double] = js.native
    /**
      * Abandoned Baby (K线图:弃婴)
      *
      * CDLABANDONEDBABY(Records[Open,High,Low,Close],Penetration = 0.3) = Array(outInteger)
      *
      * @param {botvs.Record[]} Records
      * @param {number=0.3} Penetration
      * @return {number[]}
      */
    @JSGlobal("talib.CDLABANDONEDBABY")
    @js.native
    def CDLABANDONEDBABY(Records: js.Array[Record]): js.Array[Double] = js.native
    @JSGlobal("talib.CDLABANDONEDBABY")
    @js.native
    def CDLABANDONEDBABY(Records: js.Array[Record], Penetration: Double): js.Array[Double] = js.native
    
    /**
      * Advance Block (K线图:推进)
      *
      * CDLADVANCEBLOCK(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {number[]} Open
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @return {number[]}
      */
    @JSGlobal("talib.CDLADVANCEBLOCK")
    @js.native
    def CDLADVANCEBLOCK(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
    /**
      * Advance Block (K线图:推进)
      *
      * CDLADVANCEBLOCK(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {botvs.Record[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.CDLADVANCEBLOCK")
    @js.native
    def CDLADVANCEBLOCK(Records: js.Array[Record]): js.Array[Double] = js.native
    
    /**
      * Belt-hold (K线图:带住)
      *
      * CDLBELTHOLD(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {number[]} Open
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @return {number[]}
      */
    @JSGlobal("talib.CDLBELTHOLD")
    @js.native
    def CDLBELTHOLD(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
    /**
      * Belt-hold (K线图:带住)
      *
      * CDLBELTHOLD(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {botvs.Record[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.CDLBELTHOLD")
    @js.native
    def CDLBELTHOLD(Records: js.Array[Record]): js.Array[Double] = js.native
    
    /**
      * Breakaway (K线图:分离)
      *
      * CDLBREAKAWAY(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {number[]} Open
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @return {number[]}
      */
    @JSGlobal("talib.CDLBREAKAWAY")
    @js.native
    def CDLBREAKAWAY(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
    /**
      * Breakaway (K线图:分离)
      *
      * CDLBREAKAWAY(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {botvs.Record[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.CDLBREAKAWAY")
    @js.native
    def CDLBREAKAWAY(Records: js.Array[Record]): js.Array[Double] = js.native
    
    /**
      * Closing Marubozu (K线图:收盘光头光脚)
      *
      * CDLCLOSINGMARUBOZU(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {number[]} Open
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @return {number[]}
      */
    @JSGlobal("talib.CDLCLOSINGMARUBOZU")
    @js.native
    def CDLCLOSINGMARUBOZU(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
    /**
      * Closing Marubozu (K线图:收盘光头光脚)
      *
      * CDLCLOSINGMARUBOZU(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {botvs.Record[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.CDLCLOSINGMARUBOZU")
    @js.native
    def CDLCLOSINGMARUBOZU(Records: js.Array[Record]): js.Array[Double] = js.native
    
    /**
      * Concealing Baby Swallow (K线图:藏婴吞没形态)
      *
      * CDLCONCEALBABYSWALL(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {number[]} Open
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @return {number[]}
      */
    @JSGlobal("talib.CDLCONCEALBABYSWALL")
    @js.native
    def CDLCONCEALBABYSWALL(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
    /**
      * Concealing Baby Swallow (K线图:藏婴吞没形态)
      *
      * CDLCONCEALBABYSWALL(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {botvs.Record[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.CDLCONCEALBABYSWALL")
    @js.native
    def CDLCONCEALBABYSWALL(Records: js.Array[Record]): js.Array[Double] = js.native
    
    /**
      * Counterattack (K线图:反击)
      *
      * CDLCOUNTERATTACK(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {number[]} Open
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @return {number[]}
      */
    @JSGlobal("talib.CDLCOUNTERATTACK")
    @js.native
    def CDLCOUNTERATTACK(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
    /**
      * Counterattack (K线图:反击)
      *
      * CDLCOUNTERATTACK(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {botvs.Record[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.CDLCOUNTERATTACK")
    @js.native
    def CDLCOUNTERATTACK(Records: js.Array[Record]): js.Array[Double] = js.native
    
    /**
      * Dark Cloud Cover (K线图:乌云盖)
      *
      * CDLDARKCLOUDCOVER(Records[Open,High,Low,Close],Penetration = 0.5) = Array(outInteger)
      *
      * @param {number[]} Open
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @param {number=0.5} Penetration
      * @return {number[]}
      */
    @JSGlobal("talib.CDLDARKCLOUDCOVER")
    @js.native
    def CDLDARKCLOUDCOVER(
      Open: js.Array[Double],
      High: js.Array[Double],
      Low: js.Array[Double],
      Close: js.Array[Double],
      Penetration: Double
    ): js.Array[Double] = js.native
    /**
      * Dark Cloud Cover (K线图:乌云盖)
      *
      * CDLDARKCLOUDCOVER(Records[Open,High,Low,Close],Penetration = 0.5) = Array(outInteger)
      *
      * @param {botvs.Record[]} Records
      * @param {number=0.5} Penetration
      * @return {number[]}
      */
    @JSGlobal("talib.CDLDARKCLOUDCOVER")
    @js.native
    def CDLDARKCLOUDCOVER(Records: js.Array[Record]): js.Array[Double] = js.native
    @JSGlobal("talib.CDLDARKCLOUDCOVER")
    @js.native
    def CDLDARKCLOUDCOVER(Records: js.Array[Record], Penetration: Double): js.Array[Double] = js.native
    
    /**
      * Doji (K线图:十字星 )
      *
      * CDLDOJI(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {number[]} Open
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @return {number[]}
      */
    @JSGlobal("talib.CDLDOJI")
    @js.native
    def CDLDOJI(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
    /**
      * Doji (K线图:十字星 )
      *
      * CDLDOJI(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {botvs.Record[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.CDLDOJI")
    @js.native
    def CDLDOJI(Records: js.Array[Record]): js.Array[Double] = js.native
    
    /**
      * Doji Star (K线图:十字星)
      *
      * CDLDOJISTAR(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {number[]} Open
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @return {number[]}
      */
    @JSGlobal("talib.CDLDOJISTAR")
    @js.native
    def CDLDOJISTAR(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
    /**
      * Doji Star (K线图:十字星)
      *
      * CDLDOJISTAR(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {botvs.Record[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.CDLDOJISTAR")
    @js.native
    def CDLDOJISTAR(Records: js.Array[Record]): js.Array[Double] = js.native
    
    /**
      * Dragonfly Doji (K线图:蜻蜓十字星)
      *
      * CDLDRAGONFLYDOJI(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {number[]} Open
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @return {number[]}
      */
    @JSGlobal("talib.CDLDRAGONFLYDOJI")
    @js.native
    def CDLDRAGONFLYDOJI(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
    /**
      * Dragonfly Doji (K线图:蜻蜓十字星)
      *
      * CDLDRAGONFLYDOJI(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {botvs.Record[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.CDLDRAGONFLYDOJI")
    @js.native
    def CDLDRAGONFLYDOJI(Records: js.Array[Record]): js.Array[Double] = js.native
    
    /**
      * Engulfing Pattern (K线图:吞没)
      *
      * CDLENGULFING(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {number[]} Open
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @return {number[]}
      */
    @JSGlobal("talib.CDLENGULFING")
    @js.native
    def CDLENGULFING(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
    /**
      * Engulfing Pattern (K线图:吞没)
      *
      * CDLENGULFING(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {botvs.Record[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.CDLENGULFING")
    @js.native
    def CDLENGULFING(Records: js.Array[Record]): js.Array[Double] = js.native
    
    /**
      * Evening Doji Star (K线图:黄昏十字星)
      *
      * CDLEVENINGDOJISTAR(Records[Open,High,Low,Close],Penetration = 0.3) = Array(outInteger)
      *
      * @param {number[]} Open
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @param {number=0.3} Penetration
      * @return {number[]}
      */
    @JSGlobal("talib.CDLEVENINGDOJISTAR")
    @js.native
    def CDLEVENINGDOJISTAR(
      Open: js.Array[Double],
      High: js.Array[Double],
      Low: js.Array[Double],
      Close: js.Array[Double],
      Penetration: Double
    ): js.Array[Double] = js.native
    /**
      * Evening Doji Star (K线图:黄昏十字星)
      *
      * CDLEVENINGDOJISTAR(Records[Open,High,Low,Close],Penetration = 0.3) = Array(outInteger)
      *
      * @param {botvs.Record[]} Records
      * @param {number=0.3} Penetration
      * @return {number[]}
      */
    @JSGlobal("talib.CDLEVENINGDOJISTAR")
    @js.native
    def CDLEVENINGDOJISTAR(Records: js.Array[Record]): js.Array[Double] = js.native
    @JSGlobal("talib.CDLEVENINGDOJISTAR")
    @js.native
    def CDLEVENINGDOJISTAR(Records: js.Array[Record], Penetration: Double): js.Array[Double] = js.native
    
    /**
      * Evening Star (K线图:黄昏之星)
      *
      * CDLEVENINGSTAR(Records[Open,High,Low,Close],Penetration = 0.3) = Array(outInteger)
      *
      * @param {number[]} Open
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @param {number=0.3} Penetration
      * @return {number[]}
      */
    @JSGlobal("talib.CDLEVENINGSTAR")
    @js.native
    def CDLEVENINGSTAR(
      Open: js.Array[Double],
      High: js.Array[Double],
      Low: js.Array[Double],
      Close: js.Array[Double],
      Penetration: Double
    ): js.Array[Double] = js.native
    /**
      * Evening Star (K线图:黄昏之星)
      *
      * CDLEVENINGSTAR(Records[Open,High,Low,Close],Penetration = 0.3) = Array(outInteger)
      *
      * @param {botvs.Record[]} Records
      * @param {number=0.3} Penetration
      * @return {number[]}
      */
    @JSGlobal("talib.CDLEVENINGSTAR")
    @js.native
    def CDLEVENINGSTAR(Records: js.Array[Record]): js.Array[Double] = js.native
    @JSGlobal("talib.CDLEVENINGSTAR")
    @js.native
    def CDLEVENINGSTAR(Records: js.Array[Record], Penetration: Double): js.Array[Double] = js.native
    
    /**
      * Up/Down-gap side-by-side white lines (K线图:上/下间隙并排的白色线条)
      *
      * CDLGAPSIDESIDEWHITE(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {number[]} Open
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @return {number[]}
      */
    @JSGlobal("talib.CDLGAPSIDESIDEWHITE")
    @js.native
    def CDLGAPSIDESIDEWHITE(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
    /**
      * Up/Down-gap side-by-side white lines (K线图:上/下间隙并排的白色线条)
      *
      * CDLGAPSIDESIDEWHITE(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {botvs.Record[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.CDLGAPSIDESIDEWHITE")
    @js.native
    def CDLGAPSIDESIDEWHITE(Records: js.Array[Record]): js.Array[Double] = js.native
    
    /**
      * Gravestone Doji (K线图:墓碑十字线)
      *
      * CDLGRAVESTONEDOJI(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {number[]} Open
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @return {number[]}
      */
    @JSGlobal("talib.CDLGRAVESTONEDOJI")
    @js.native
    def CDLGRAVESTONEDOJI(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
    /**
      * Gravestone Doji (K线图:墓碑十字线)
      *
      * CDLGRAVESTONEDOJI(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {botvs.Record[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.CDLGRAVESTONEDOJI")
    @js.native
    def CDLGRAVESTONEDOJI(Records: js.Array[Record]): js.Array[Double] = js.native
    
    /**
      * Hammer (K线图:锤)
      *
      * CDLHAMMER(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {number[]} Open
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @return {number[]}
      */
    @JSGlobal("talib.CDLHAMMER")
    @js.native
    def CDLHAMMER(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
    /**
      * Hammer (K线图:锤)
      *
      * CDLHAMMER(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {botvs.Record[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.CDLHAMMER")
    @js.native
    def CDLHAMMER(Records: js.Array[Record]): js.Array[Double] = js.native
    
    /**
      * Hanging Man (K线图:吊人)
      *
      * CDLHANGINGMAN(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {number[]} Open
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @return {number[]}
      */
    @JSGlobal("talib.CDLHANGINGMAN")
    @js.native
    def CDLHANGINGMAN(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
    /**
      * Hanging Man (K线图:吊人)
      *
      * CDLHANGINGMAN(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {botvs.Record[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.CDLHANGINGMAN")
    @js.native
    def CDLHANGINGMAN(Records: js.Array[Record]): js.Array[Double] = js.native
    
    /**
      * Harami Pattern (K线图:阴阳线)
      *
      * CDLHARAMI(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {number[]} Open
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @return {number[]}
      */
    @JSGlobal("talib.CDLHARAMI")
    @js.native
    def CDLHARAMI(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
    /**
      * Harami Pattern (K线图:阴阳线)
      *
      * CDLHARAMI(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {botvs.Record[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.CDLHARAMI")
    @js.native
    def CDLHARAMI(Records: js.Array[Record]): js.Array[Double] = js.native
    
    /**
      * Harami Cross Pattern (K线图:交叉阴阳线)
      *
      * CDLHARAMICROSS(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {number[]} Open
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @return {number[]}
      */
    @JSGlobal("talib.CDLHARAMICROSS")
    @js.native
    def CDLHARAMICROSS(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
    /**
      * Harami Cross Pattern (K线图:交叉阴阳线)
      *
      * CDLHARAMICROSS(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {botvs.Record[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.CDLHARAMICROSS")
    @js.native
    def CDLHARAMICROSS(Records: js.Array[Record]): js.Array[Double] = js.native
    
    /**
      * High-Wave Candle (K线图:长脚十字线 )
      *
      * CDLHIGHWAVE(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {number[]} Open
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @return {number[]}
      */
    @JSGlobal("talib.CDLHIGHWAVE")
    @js.native
    def CDLHIGHWAVE(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
    /**
      * High-Wave Candle (K线图:长脚十字线 )
      *
      * CDLHIGHWAVE(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {botvs.Record[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.CDLHIGHWAVE")
    @js.native
    def CDLHIGHWAVE(Records: js.Array[Record]): js.Array[Double] = js.native
    
    /**
      * Hikkake Pattern (K线图:陷阱)
      *
      * CDLHIKKAKE(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {number[]} Open
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @return {number[]}
      */
    @JSGlobal("talib.CDLHIKKAKE")
    @js.native
    def CDLHIKKAKE(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
    /**
      * Hikkake Pattern (K线图:陷阱)
      *
      * CDLHIKKAKE(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {botvs.Record[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.CDLHIKKAKE")
    @js.native
    def CDLHIKKAKE(Records: js.Array[Record]): js.Array[Double] = js.native
    
    /**
      * Modified Hikkake Pattern (K线图:改良的陷阱)
      *
      * CDLHIKKAKEMOD(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {number[]} Open
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @return {number[]}
      */
    @JSGlobal("talib.CDLHIKKAKEMOD")
    @js.native
    def CDLHIKKAKEMOD(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
    /**
      * Modified Hikkake Pattern (K线图:改良的陷阱)
      *
      * CDLHIKKAKEMOD(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {botvs.Record[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.CDLHIKKAKEMOD")
    @js.native
    def CDLHIKKAKEMOD(Records: js.Array[Record]): js.Array[Double] = js.native
    
    /**
      * Homing Pigeon (K线图:信鸽)
      *
      * CDLHOMINGPIGEON(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {number[]} Open
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @return {number[]}
      */
    @JSGlobal("talib.CDLHOMINGPIGEON")
    @js.native
    def CDLHOMINGPIGEON(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
    /**
      * Homing Pigeon (K线图:信鸽)
      *
      * CDLHOMINGPIGEON(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {botvs.Record[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.CDLHOMINGPIGEON")
    @js.native
    def CDLHOMINGPIGEON(Records: js.Array[Record]): js.Array[Double] = js.native
    
    /**
      * Identical Three Crows (K线图:相同的三只乌鸦)
      *
      * CDLIDENTICAL3CROWS(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {number[]} Open
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @return {number[]}
      */
    @JSGlobal("talib.CDLIDENTICAL3CROWS")
    @js.native
    def CDLIDENTICAL3CROWS(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
    /**
      * Identical Three Crows (K线图:相同的三只乌鸦)
      *
      * CDLIDENTICAL3CROWS(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {botvs.Record[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.CDLIDENTICAL3CROWS")
    @js.native
    def CDLIDENTICAL3CROWS(Records: js.Array[Record]): js.Array[Double] = js.native
    
    /**
      * In-Neck Pattern (K线图:颈纹)
      *
      * CDLINNECK(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {number[]} Open
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @return {number[]}
      */
    @JSGlobal("talib.CDLINNECK")
    @js.native
    def CDLINNECK(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
    /**
      * In-Neck Pattern (K线图:颈纹)
      *
      * CDLINNECK(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {botvs.Record[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.CDLINNECK")
    @js.native
    def CDLINNECK(Records: js.Array[Record]): js.Array[Double] = js.native
    
    /**
      * Inverted Hammer (K线图:倒锤)
      *
      * CDLINVERTEDHAMMER(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {number[]} Open
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @return {number[]}
      */
    @JSGlobal("talib.CDLINVERTEDHAMMER")
    @js.native
    def CDLINVERTEDHAMMER(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
    /**
      * Inverted Hammer (K线图:倒锤)
      *
      * CDLINVERTEDHAMMER(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {botvs.Record[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.CDLINVERTEDHAMMER")
    @js.native
    def CDLINVERTEDHAMMER(Records: js.Array[Record]): js.Array[Double] = js.native
    
    /**
      * Kicking (K线图:踢)
      *
      * CDLKICKING(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {number[]} Open
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @return {number[]}
      */
    @JSGlobal("talib.CDLKICKING")
    @js.native
    def CDLKICKING(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
    /**
      * Kicking (K线图:踢)
      *
      * CDLKICKING(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {botvs.Record[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.CDLKICKING")
    @js.native
    def CDLKICKING(Records: js.Array[Record]): js.Array[Double] = js.native
    
    /**
      * Kicking - bull/bear determined by the longer marubozu (K线图:踢牛/踢熊)
      *
      * CDLKICKINGBYLENGTH(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {number[]} Open
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @return {number[]}
      */
    @JSGlobal("talib.CDLKICKINGBYLENGTH")
    @js.native
    def CDLKICKINGBYLENGTH(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
    /**
      * Kicking - bull/bear determined by the longer marubozu (K线图:踢牛/踢熊)
      *
      * CDLKICKINGBYLENGTH(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {botvs.Record[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.CDLKICKINGBYLENGTH")
    @js.native
    def CDLKICKINGBYLENGTH(Records: js.Array[Record]): js.Array[Double] = js.native
    
    /**
      * Ladder Bottom (K线图:梯底)
      *
      * CDLLADDERBOTTOM(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {number[]} Open
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @return {number[]}
      */
    @JSGlobal("talib.CDLLADDERBOTTOM")
    @js.native
    def CDLLADDERBOTTOM(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
    /**
      * Ladder Bottom (K线图:梯底)
      *
      * CDLLADDERBOTTOM(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {botvs.Record[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.CDLLADDERBOTTOM")
    @js.native
    def CDLLADDERBOTTOM(Records: js.Array[Record]): js.Array[Double] = js.native
    
    /**
      * Long Legged Doji (K线图:长腿十字线)
      *
      * CDLLONGLEGGEDDOJI(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {number[]} Open
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @return {number[]}
      */
    @JSGlobal("talib.CDLLONGLEGGEDDOJI")
    @js.native
    def CDLLONGLEGGEDDOJI(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
    /**
      * Long Legged Doji (K线图:长腿十字线)
      *
      * CDLLONGLEGGEDDOJI(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {botvs.Record[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.CDLLONGLEGGEDDOJI")
    @js.native
    def CDLLONGLEGGEDDOJI(Records: js.Array[Record]): js.Array[Double] = js.native
    
    /**
      * Long Line Candle (K线图:长线)
      *
      * CDLLONGLINE(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {number[]} Open
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @return {number[]}
      */
    @JSGlobal("talib.CDLLONGLINE")
    @js.native
    def CDLLONGLINE(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
    /**
      * Long Line Candle (K线图:长线)
      *
      * CDLLONGLINE(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {botvs.Record[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.CDLLONGLINE")
    @js.native
    def CDLLONGLINE(Records: js.Array[Record]): js.Array[Double] = js.native
    
    /**
      * Marubozu (K线图:光头光脚 )
      *
      * CDLMARUBOZU(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {number[]} Open
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @return {number[]}
      */
    @JSGlobal("talib.CDLMARUBOZU")
    @js.native
    def CDLMARUBOZU(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
    /**
      * Marubozu (K线图:光头光脚 )
      *
      * CDLMARUBOZU(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {botvs.Record[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.CDLMARUBOZU")
    @js.native
    def CDLMARUBOZU(Records: js.Array[Record]): js.Array[Double] = js.native
    
    /**
      * Matching Low (K线图:匹配低)
      *
      * CDLMATCHINGLOW(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {number[]} Open
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @return {number[]}
      */
    @JSGlobal("talib.CDLMATCHINGLOW")
    @js.native
    def CDLMATCHINGLOW(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
    /**
      * Matching Low (K线图:匹配低)
      *
      * CDLMATCHINGLOW(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {botvs.Record[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.CDLMATCHINGLOW")
    @js.native
    def CDLMATCHINGLOW(Records: js.Array[Record]): js.Array[Double] = js.native
    
    /**
      * Mat Hold (K线图:垫住)
      *
      * CDLMATHOLD(Records[Open,High,Low,Close],Penetration = 0.5) = Array(outInteger)
      *
      * @param {number[]} Open
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @param {number=0.5} Penetration
      * @return {number[]}
      */
    @JSGlobal("talib.CDLMATHOLD")
    @js.native
    def CDLMATHOLD(
      Open: js.Array[Double],
      High: js.Array[Double],
      Low: js.Array[Double],
      Close: js.Array[Double],
      Penetration: Double
    ): js.Array[Double] = js.native
    /**
      * Mat Hold (K线图:垫住)
      *
      * CDLMATHOLD(Records[Open,High,Low,Close],Penetration = 0.5) = Array(outInteger)
      *
      * @param {botvs.Record[]} Records
      * @param {number=0.5} Penetration
      * @return {number[]}
      */
    @JSGlobal("talib.CDLMATHOLD")
    @js.native
    def CDLMATHOLD(Records: js.Array[Record]): js.Array[Double] = js.native
    @JSGlobal("talib.CDLMATHOLD")
    @js.native
    def CDLMATHOLD(Records: js.Array[Record], Penetration: Double): js.Array[Double] = js.native
    
    /**
      * Morning Doji Star (K线图:早晨十字星)
      *
      * CDLMORNINGDOJISTAR(Records[Open,High,Low,Close],Penetration = 0.3) = Array(outInteger)
      *
      * @param {number[]} Open
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @param {number=0.3} Penetration
      * @return {number[]}
      */
    @JSGlobal("talib.CDLMORNINGDOJISTAR")
    @js.native
    def CDLMORNINGDOJISTAR(
      Open: js.Array[Double],
      High: js.Array[Double],
      Low: js.Array[Double],
      Close: js.Array[Double],
      Penetration: Double
    ): js.Array[Double] = js.native
    /**
      * Morning Doji Star (K线图:早晨十字星)
      *
      * CDLMORNINGDOJISTAR(Records[Open,High,Low,Close],Penetration = 0.3) = Array(outInteger)
      *
      * @param {botvs.Record[]} Records
      * @param {number=0.3} Penetration
      * @return {number[]}
      */
    @JSGlobal("talib.CDLMORNINGDOJISTAR")
    @js.native
    def CDLMORNINGDOJISTAR(Records: js.Array[Record]): js.Array[Double] = js.native
    @JSGlobal("talib.CDLMORNINGDOJISTAR")
    @js.native
    def CDLMORNINGDOJISTAR(Records: js.Array[Record], Penetration: Double): js.Array[Double] = js.native
    
    /**
      * Morning Star (K线图:晨星)
      *
      * CDLMORNINGSTAR(Records[Open,High,Low,Close],Penetration = 0.3) = Array(outInteger)
      *
      * @param {number[]} Open
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @param {number=0.3} Penetration
      * @return {number[]}
      */
    @JSGlobal("talib.CDLMORNINGSTAR")
    @js.native
    def CDLMORNINGSTAR(
      Open: js.Array[Double],
      High: js.Array[Double],
      Low: js.Array[Double],
      Close: js.Array[Double],
      Penetration: Double
    ): js.Array[Double] = js.native
    /**
      * Morning Star (K线图:晨星)
      *
      * CDLMORNINGSTAR(Records[Open,High,Low,Close],Penetration = 0.3) = Array(outInteger)
      *
      * @param {botvs.Record[]} Records
      * @param {number=0.3} Penetration
      * @return {number[]}
      */
    @JSGlobal("talib.CDLMORNINGSTAR")
    @js.native
    def CDLMORNINGSTAR(Records: js.Array[Record]): js.Array[Double] = js.native
    @JSGlobal("talib.CDLMORNINGSTAR")
    @js.native
    def CDLMORNINGSTAR(Records: js.Array[Record], Penetration: Double): js.Array[Double] = js.native
    
    /**
      * On-Neck Pattern (K线图:颈型)
      *
      * CDLONNECK(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {number[]} Open
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @return {number[]}
      */
    @JSGlobal("talib.CDLONNECK")
    @js.native
    def CDLONNECK(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
    /**
      * On-Neck Pattern (K线图:颈型)
      *
      * CDLONNECK(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {botvs.Record[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.CDLONNECK")
    @js.native
    def CDLONNECK(Records: js.Array[Record]): js.Array[Double] = js.native
    
    /**
      * Piercing Pattern (K线图:穿孔模式)
      *
      * CDLPIERCING(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {number[]} Open
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @return {number[]}
      */
    @JSGlobal("talib.CDLPIERCING")
    @js.native
    def CDLPIERCING(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
    /**
      * Piercing Pattern (K线图:穿孔模式)
      *
      * CDLPIERCING(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {botvs.Record[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.CDLPIERCING")
    @js.native
    def CDLPIERCING(Records: js.Array[Record]): js.Array[Double] = js.native
    
    /**
      * Rickshaw Man (K线图:车夫)
      *
      * CDLRICKSHAWMAN(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {number[]} Open
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @return {number[]}
      */
    @JSGlobal("talib.CDLRICKSHAWMAN")
    @js.native
    def CDLRICKSHAWMAN(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
    /**
      * Rickshaw Man (K线图:车夫)
      *
      * CDLRICKSHAWMAN(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {botvs.Record[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.CDLRICKSHAWMAN")
    @js.native
    def CDLRICKSHAWMAN(Records: js.Array[Record]): js.Array[Double] = js.native
    
    /**
      * Rising/Falling Three Methods (K线图:上升/下降三法)
      *
      * CDLRISEFALL3METHODS(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {number[]} Open
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @return {number[]}
      */
    @JSGlobal("talib.CDLRISEFALL3METHODS")
    @js.native
    def CDLRISEFALL3METHODS(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
    /**
      * Rising/Falling Three Methods (K线图:上升/下降三法)
      *
      * CDLRISEFALL3METHODS(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {botvs.Record[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.CDLRISEFALL3METHODS")
    @js.native
    def CDLRISEFALL3METHODS(Records: js.Array[Record]): js.Array[Double] = js.native
    
    /**
      * Separating Lines (K线图:分割线)
      *
      * CDLSEPARATINGLINES(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {number[]} Open
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @return {number[]}
      */
    @JSGlobal("talib.CDLSEPARATINGLINES")
    @js.native
    def CDLSEPARATINGLINES(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
    /**
      * Separating Lines (K线图:分割线)
      *
      * CDLSEPARATINGLINES(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {botvs.Record[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.CDLSEPARATINGLINES")
    @js.native
    def CDLSEPARATINGLINES(Records: js.Array[Record]): js.Array[Double] = js.native
    
    /**
      * Shooting Star (K线图:流星)
      *
      * CDLSHOOTINGSTAR(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {number[]} Open
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @return {number[]}
      */
    @JSGlobal("talib.CDLSHOOTINGSTAR")
    @js.native
    def CDLSHOOTINGSTAR(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
    /**
      * Shooting Star (K线图:流星)
      *
      * CDLSHOOTINGSTAR(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {botvs.Record[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.CDLSHOOTINGSTAR")
    @js.native
    def CDLSHOOTINGSTAR(Records: js.Array[Record]): js.Array[Double] = js.native
    
    /**
      * Short Line Candle (K线图:短线)
      *
      * CDLSHORTLINE(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {number[]} Open
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @return {number[]}
      */
    @JSGlobal("talib.CDLSHORTLINE")
    @js.native
    def CDLSHORTLINE(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
    /**
      * Short Line Candle (K线图:短线)
      *
      * CDLSHORTLINE(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {botvs.Record[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.CDLSHORTLINE")
    @js.native
    def CDLSHORTLINE(Records: js.Array[Record]): js.Array[Double] = js.native
    
    /**
      * Spinning Top (K线图:陀螺)
      *
      * CDLSPINNINGTOP(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {number[]} Open
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @return {number[]}
      */
    @JSGlobal("talib.CDLSPINNINGTOP")
    @js.native
    def CDLSPINNINGTOP(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
    /**
      * Spinning Top (K线图:陀螺)
      *
      * CDLSPINNINGTOP(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {botvs.Record[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.CDLSPINNINGTOP")
    @js.native
    def CDLSPINNINGTOP(Records: js.Array[Record]): js.Array[Double] = js.native
    
    /**
      * Stalled Pattern (K线图:停滞模式)
      *
      * CDLSTALLEDPATTERN(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {number[]} Open
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @return {number[]}
      */
    @JSGlobal("talib.CDLSTALLEDPATTERN")
    @js.native
    def CDLSTALLEDPATTERN(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
    /**
      * Stalled Pattern (K线图:停滞模式)
      *
      * CDLSTALLEDPATTERN(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {botvs.Record[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.CDLSTALLEDPATTERN")
    @js.native
    def CDLSTALLEDPATTERN(Records: js.Array[Record]): js.Array[Double] = js.native
    
    /**
      * Stick Sandwich (K线图:棍子三明治)
      *
      * CDLSTICKSANDWICH(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {number[]} Open
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @return {number[]}
      */
    @JSGlobal("talib.CDLSTICKSANDWICH")
    @js.native
    def CDLSTICKSANDWICH(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
    /**
      * Stick Sandwich (K线图:棍子三明治)
      *
      * CDLSTICKSANDWICH(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {botvs.Record[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.CDLSTICKSANDWICH")
    @js.native
    def CDLSTICKSANDWICH(Records: js.Array[Record]): js.Array[Double] = js.native
    
    /**
      * Takuri (Dragonfly Doji with very long lower shadow) (K线图:托里)
      *
      * CDLTAKURI(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {number[]} Open
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @return {number[]}
      */
    @JSGlobal("talib.CDLTAKURI")
    @js.native
    def CDLTAKURI(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
    /**
      * Takuri (Dragonfly Doji with very long lower shadow) (K线图:托里)
      *
      * CDLTAKURI(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {botvs.Record[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.CDLTAKURI")
    @js.native
    def CDLTAKURI(Records: js.Array[Record]): js.Array[Double] = js.native
    
    /**
      * Tasuki Gap (K线图:翼隙)
      *
      * CDLTASUKIGAP(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {number[]} Open
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @return {number[]}
      */
    @JSGlobal("talib.CDLTASUKIGAP")
    @js.native
    def CDLTASUKIGAP(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
    /**
      * Tasuki Gap (K线图:翼隙)
      *
      * CDLTASUKIGAP(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {botvs.Record[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.CDLTASUKIGAP")
    @js.native
    def CDLTASUKIGAP(Records: js.Array[Record]): js.Array[Double] = js.native
    
    /**
      * Thrusting Pattern (K线图:推模式)
      *
      * CDLTHRUSTING(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {number[]} Open
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @return {number[]}
      */
    @JSGlobal("talib.CDLTHRUSTING")
    @js.native
    def CDLTHRUSTING(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
    /**
      * Thrusting Pattern (K线图:推模式)
      *
      * CDLTHRUSTING(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {botvs.Record[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.CDLTHRUSTING")
    @js.native
    def CDLTHRUSTING(Records: js.Array[Record]): js.Array[Double] = js.native
    
    /**
      * Tristar Pattern (K线图:三星模式)
      *
      * CDLTRISTAR(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {number[]} Open
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @return {number[]}
      */
    @JSGlobal("talib.CDLTRISTAR")
    @js.native
    def CDLTRISTAR(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
    /**
      * Tristar Pattern (K线图:三星模式)
      *
      * CDLTRISTAR(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {botvs.Record[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.CDLTRISTAR")
    @js.native
    def CDLTRISTAR(Records: js.Array[Record]): js.Array[Double] = js.native
    
    /**
      * Unique 3 River (K线图:独特的3河)
      *
      * CDLUNIQUE3RIVER(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {number[]} Open
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @return {number[]}
      */
    @JSGlobal("talib.CDLUNIQUE3RIVER")
    @js.native
    def CDLUNIQUE3RIVER(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
    /**
      * Unique 3 River (K线图:独特的3河)
      *
      * CDLUNIQUE3RIVER(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {botvs.Record[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.CDLUNIQUE3RIVER")
    @js.native
    def CDLUNIQUE3RIVER(Records: js.Array[Record]): js.Array[Double] = js.native
    
    /**
      * Upside Gap Two Crows (K线图:双飞乌鸦)
      *
      * CDLUPSIDEGAP2CROWS(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {number[]} Open
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @return {number[]}
      */
    @JSGlobal("talib.CDLUPSIDEGAP2CROWS")
    @js.native
    def CDLUPSIDEGAP2CROWS(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
    /**
      * Upside Gap Two Crows (K线图:双飞乌鸦)
      *
      * CDLUPSIDEGAP2CROWS(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {botvs.Record[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.CDLUPSIDEGAP2CROWS")
    @js.native
    def CDLUPSIDEGAP2CROWS(Records: js.Array[Record]): js.Array[Double] = js.native
    
    /**
      * Upside/Downside Gap Three Methods (K线图:上行/下行缺口三方法)
      *
      * CDLXSIDEGAP3METHODS(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {number[]} Open
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @return {number[]}
      */
    @JSGlobal("talib.CDLXSIDEGAP3METHODS")
    @js.native
    def CDLXSIDEGAP3METHODS(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
    /**
      * Upside/Downside Gap Three Methods (K线图:上行/下行缺口三方法)
      *
      * CDLXSIDEGAP3METHODS(Records[Open,High,Low,Close]) = Array(outInteger)
      *
      * @param {botvs.Record[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.CDLXSIDEGAP3METHODS")
    @js.native
    def CDLXSIDEGAP3METHODS(Records: js.Array[Record]): js.Array[Double] = js.native
    
    /**
      * Vector Ceil (取整函数)
      *
      * CEIL(Records[Close]) = Array(outReal)
      *
      * @param {botvs.Record[]|number[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.CEIL")
    @js.native
    def CEIL(Records: js.Array[Double | Record]): js.Array[Double] = js.native
    
    /**
      * Chande Momentum Oscillator (钱德动量摆动指标)
      *
      * CMO(Records[Close],Time Period = 14) = Array(outReal)
      *
      * @param {botvs.Record[]|number[]} Records
      * @param {number=14} TimePeriod
      * @return {number[]}
      */
    @JSGlobal("talib.CMO")
    @js.native
    def CMO(Records: js.Array[Double | Record]): js.Array[Double] = js.native
    @JSGlobal("talib.CMO")
    @js.native
    def CMO(Records: js.Array[Double | Record], TimePeriod: Double): js.Array[Double] = js.native
    
    /**
      * Vector Trigonometric Cos (余弦函数)
      *
      * COS(Records[Close]) = Array(outReal)
      *
      * @param {botvs.Record[]|number[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.COS")
    @js.native
    def COS(Records: js.Array[Double | Record]): js.Array[Double] = js.native
    
    /**
      * Vector Trigonometric Cosh (双曲余弦值)
      *
      * COSH(Records[Close]) = Array(outReal)
      *
      * @param {botvs.Record[]|number[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.COSH")
    @js.native
    def COSH(Records: js.Array[Double | Record]): js.Array[Double] = js.native
    
    /**
      * Double Exponential Moving Average (双指数移动平均线)
      *
      * DEMA(Records[Close],Time Period = 30) = Array(outReal)
      *
      * @param {botvs.Record[]|number[]} Records
      * @param {number=30} TimePeriod
      * @return {number[]}
      */
    @JSGlobal("talib.DEMA")
    @js.native
    def DEMA(Records: js.Array[Double | Record]): js.Array[Double] = js.native
    @JSGlobal("talib.DEMA")
    @js.native
    def DEMA(Records: js.Array[Double | Record], TimePeriod: Double): js.Array[Double] = js.native
    
    /**
      * Directional Movement Index (动向指数)
      *
      * DX(Records[High,Low,Close],Time Period = 14) = Array(outReal)
      *
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @param {number=14} TimePeriod
      * @return {number[]}
      */
    @JSGlobal("talib.DX")
    @js.native
    def DX(High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
    @JSGlobal("talib.DX")
    @js.native
    def DX(High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double], TimePeriod: Double): js.Array[Double] = js.native
    /**
      * Directional Movement Index (动向指数)
      *
      * DX(Records[High,Low,Close],Time Period = 14) = Array(outReal)
      *
      * @param {botvs.Record[]} Records
      * @param {number=14} TimePeriod
      * @return {number[]}
      */
    @JSGlobal("talib.DX")
    @js.native
    def DX(Records: js.Array[Record]): js.Array[Double] = js.native
    @JSGlobal("talib.DX")
    @js.native
    def DX(Records: js.Array[Record], TimePeriod: Double): js.Array[Double] = js.native
    
    /**
      * Exponential Moving Average (指数移动平均线)
      *
      * EMA(Records[Close],Time Period = 30) = Array(outReal)
      *
      * @param {botvs.Record[]|number[]} Records
      * @param {number=30} TimePeriod
      * @return {number[]}
      */
    @JSGlobal("talib.EMA")
    @js.native
    def EMA(Records: js.Array[Double | Record]): js.Array[Double] = js.native
    @JSGlobal("talib.EMA")
    @js.native
    def EMA(Records: js.Array[Double | Record], TimePeriod: Double): js.Array[Double] = js.native
    
    /**
      * Vector Arithmetic Exp (指数函数)
      *
      * EXP(Records[Close]) = Array(outReal)
      *
      * @param {botvs.Record[]|number[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.EXP")
    @js.native
    def EXP(Records: js.Array[Double | Record]): js.Array[Double] = js.native
    
    /**
      * Vector Floor (向下取整)
      *
      * FLOOR(Records[Close]) = Array(outReal)
      *
      * @param {botvs.Record[]|number[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.FLOOR")
    @js.native
    def FLOOR(Records: js.Array[Double | Record]): js.Array[Double] = js.native
    
    /**
      * Hilbert Transform - Dominant Cycle Period (希尔伯特变换, 主周期)
      *
      * HT_DCPERIOD(Records[Close]) = Array(outReal)
      *
      * @param {botvs.Record[]|number[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.HT_DCPERIOD")
    @js.native
    def HT_DCPERIOD(Records: js.Array[Double | Record]): js.Array[Double] = js.native
    
    /**
      * Hilbert Transform - Dominant Cycle Phase (希尔伯特变换,主阶段)
      *
      * HT_DCPHASE(Records[Close]) = Array(outReal)
      *
      * @param {botvs.Record[]|number[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.HT_DCPHASE")
    @js.native
    def HT_DCPHASE(Records: js.Array[Double | Record]): js.Array[Double] = js.native
    
    /**
      * Hilbert Transform - Phasor Components (希尔伯特变换,相成分)
      *
      * HT_PHASOR(Records[Close]) = [Array(outInPhase),Array(outQuadrature)]
      *
      * @param {botvs.Record[]|number[]} Records
      * @return {[number[], number[]]}
      */
    @JSGlobal("talib.HT_PHASOR")
    @js.native
    def HT_PHASOR(Records: js.Array[Double | Record]): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
    
    /**
      * Hilbert Transform - SineWave (希尔伯特变换,正弦波)
      *
      * HT_SINE(Records[Close]) = [Array(outSine),Array(outLeadSine)]
      *
      * @param {botvs.Record[]|number[]} Records
      * @return {[number[], number[]]}
      */
    @JSGlobal("talib.HT_SINE")
    @js.native
    def HT_SINE(Records: js.Array[Double | Record]): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
    
    /**
      * Hilbert Transform - Instantaneous Trendline (希尔伯特变换,瞬时趋势)
      *
      * HT_TRENDLINE(Records[Close]) = Array(outReal)
      *
      * @param {botvs.Record[]|number[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.HT_TRENDLINE")
    @js.native
    def HT_TRENDLINE(Records: js.Array[Double | Record]): js.Array[Double] = js.native
    
    /**
      * Hilbert Transform - Trend vs Cycle Mode (希尔伯特变换-趋势与周期模式)
      *
      * HT_TRENDMODE(Records[Close]) = Array(outInteger)
      *
      * @param {botvs.Record[]|number[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.HT_TRENDMODE")
    @js.native
    def HT_TRENDMODE(Records: js.Array[Double | Record]): js.Array[Double] = js.native
    
    /**
      * Kaufman Adaptive Moving Average (适应性移动平均线)
      *
      * KAMA(Records[Close],Time Period = 30) = Array(outReal)
      *
      * @param {botvs.Record[]|number[]} Records
      * @param {number=30} TimePeriod
      * @return {number[]}
      */
    @JSGlobal("talib.KAMA")
    @js.native
    def KAMA(Records: js.Array[Double | Record]): js.Array[Double] = js.native
    @JSGlobal("talib.KAMA")
    @js.native
    def KAMA(Records: js.Array[Double | Record], TimePeriod: Double): js.Array[Double] = js.native
    
    /**
      * Linear Regression (线性回归)
      *
      * LINEARREG(Records[Close],Time Period = 14) = Array(outReal)
      *
      * @param {botvs.Record[]|number[]} Records
      * @param {number=14} TimePeriod
      * @return {number[]}
      */
    @JSGlobal("talib.LINEARREG")
    @js.native
    def LINEARREG(Records: js.Array[Double | Record]): js.Array[Double] = js.native
    @JSGlobal("talib.LINEARREG")
    @js.native
    def LINEARREG(Records: js.Array[Double | Record], TimePeriod: Double): js.Array[Double] = js.native
    
    /**
      * Linear Regression Angle (线性回归的角度)
      *
      * LINEARREG_ANGLE(Records[Close],Time Period = 14) = Array(outReal)
      *
      * @param {botvs.Record[]|number[]} Records
      * @param {number=14} TimePeriod
      * @return {number[]}
      */
    @JSGlobal("talib.LINEARREG_ANGLE")
    @js.native
    def LINEARREG_ANGLE(Records: js.Array[Double | Record], TimePeriod: Double): js.Array[Double] = js.native
    
    /**
      * Linear Regression Intercept (线性回归截距)
      *
      * LINEARREG_INTERCEPT(Records[Close],Time Period = 14) = Array(outReal)
      *
      * @param {botvs.Record[]|number[]} Records
      * @param {number=14} TimePeriod
      * @return {number[]}
      */
    @JSGlobal("talib.LINEARREG_INTERCEPT")
    @js.native
    def LINEARREG_INTERCEPT(Records: js.Array[Double | Record], TimePeriod: Double): js.Array[Double] = js.native
    
    /**
      * Linear Regression Slope (线性回归斜率)
      *
      * LINEARREG_SLOPE(Records[Close],Time Period = 14) = Array(outReal)
      *
      * @param {botvs.Record[]|number[]} Records
      * @param {number=14} TimePeriod
      * @return {number[]}
      */
    @JSGlobal("talib.LINEARREG_SLOPE")
    @js.native
    def LINEARREG_SLOPE(Records: js.Array[Double | Record], TimePeriod: Double): js.Array[Double] = js.native
    
    /**
      * Vector Log Natural (自然对数)
      *
      * LN(Records[Close]) = Array(outReal)
      *
      * @param {botvs.Record[]|number[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.LN")
    @js.native
    def LN(Records: js.Array[Double | Record]): js.Array[Double] = js.native
    
    /**
      * Vector Log10 (对数函数)
      *
      * LOG10(Records[Close]) = Array(outReal)
      *
      * @param {botvs.Record[]|number[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.LOG10")
    @js.native
    def LOG10(Records: js.Array[Double | Record]): js.Array[Double] = js.native
    
    /**
      * Moving average (移动平均线)
      *
      * MA(Records[Close],Time Period = 30,MA Type = 0) = Array(outReal)
      *
      * @param {botvs.Record[]|number[]} Records
      * @param {number=30} TimePeriod
      * @param {number=0} MAType
      * @return {number[]}
      */
    @JSGlobal("talib.MA")
    @js.native
    def MA(Records: js.Array[Double | Record]): js.Array[Double] = js.native
    @JSGlobal("talib.MA")
    @js.native
    def MA(Records: js.Array[Double | Record], TimePeriod: js.UndefOr[scala.Nothing], MAType: Double): js.Array[Double] = js.native
    @JSGlobal("talib.MA")
    @js.native
    def MA(Records: js.Array[Double | Record], TimePeriod: Double): js.Array[Double] = js.native
    @JSGlobal("talib.MA")
    @js.native
    def MA(Records: js.Array[Double | Record], TimePeriod: Double, MAType: Double): js.Array[Double] = js.native
    
    /**
      * Moving Average Convergence/Divergence (指数平滑移动平均线)
      *
      * MACD(Records[Close],Fast Period = 12,Slow Period = 26,Signal Period = 9) =
      * [Array(outMACD),Array(outMACDSignal),Array(outMACDHist)]
      *
      * @param {botvs.Record[]|number[]} Records
      * @param {number=12} FastPeriod
      * @param {number=26} SlowPeriod
      * @param {number=9} SignalPeriod
      * @return {[number[], number[], number[]]}
      */
    @JSGlobal("talib.MACD")
    @js.native
    def MACD(Records: js.Array[Double | Record]): js.Tuple3[js.Array[Double], js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.MACD")
    @js.native
    def MACD(
      Records: js.Array[Double | Record],
      FastPeriod: js.UndefOr[scala.Nothing],
      SlowPeriod: js.UndefOr[scala.Nothing],
      SignalPeriod: Double
    ): js.Tuple3[js.Array[Double], js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.MACD")
    @js.native
    def MACD(Records: js.Array[Double | Record], FastPeriod: js.UndefOr[scala.Nothing], SlowPeriod: Double): js.Tuple3[js.Array[Double], js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.MACD")
    @js.native
    def MACD(
      Records: js.Array[Double | Record],
      FastPeriod: js.UndefOr[scala.Nothing],
      SlowPeriod: Double,
      SignalPeriod: Double
    ): js.Tuple3[js.Array[Double], js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.MACD")
    @js.native
    def MACD(Records: js.Array[Double | Record], FastPeriod: Double): js.Tuple3[js.Array[Double], js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.MACD")
    @js.native
    def MACD(
      Records: js.Array[Double | Record],
      FastPeriod: Double,
      SlowPeriod: js.UndefOr[scala.Nothing],
      SignalPeriod: Double
    ): js.Tuple3[js.Array[Double], js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.MACD")
    @js.native
    def MACD(Records: js.Array[Double | Record], FastPeriod: Double, SlowPeriod: Double): js.Tuple3[js.Array[Double], js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.MACD")
    @js.native
    def MACD(Records: js.Array[Double | Record], FastPeriod: Double, SlowPeriod: Double, SignalPeriod: Double): js.Tuple3[js.Array[Double], js.Array[Double], js.Array[Double]] = js.native
    
    /**
      * MACD with controllable MA type (MA型可控 MACD)
      *
      * MACDEXT(Records[Close],Fast Period = 12,Fast MA = 0,Slow Period = 26,Slow MA = 0,Signal Period = 9,Signal MA
      * =
      * 0) = [Array(outMACD),Array(outMACDSignal),Array(outMACDHist)]
      *
      * @param {botvs.Record[]|number[]} Records
      * @param {number=12} FastPeriod
      * @param {number=0} FastMA
      * @param {number=26} SlowPeriod
      * @param {number=0} SlowMA
      * @param {number=9} SignalPeriod
      * @param {number=0} SignalMA
      * @return {[number[], number[], number[]]}
      */
    @JSGlobal("talib.MACDEXT")
    @js.native
    def MACDEXT(
      Records: js.Array[Double | Record],
      FastPeriod: js.UndefOr[Double],
      FastMA: js.UndefOr[Double],
      SlowPeriod: js.UndefOr[Double],
      SlowMA: js.UndefOr[Double],
      SignalPeriod: js.UndefOr[Double],
      SignalMA: js.UndefOr[Double]
    ): js.Tuple3[js.Array[Double], js.Array[Double], js.Array[Double]] = js.native
    
    /**
      * Moving Average Convergence/Divergence Fix 12/26 (移动平均收敛/发散修复12/26)
      *
      * MACDFIX(Records[Close],Signal Period = 9) = [Array(outMACD),Array(outMACDSignal),Array(outMACDHist)]
      *
      * @param {botvs.Record[]|number[]} Records
      * @param {number=9} SignalPeriod
      * @return {[number[], number[], number[]]}
      */
    @JSGlobal("talib.MACDFIX")
    @js.native
    def MACDFIX(Records: js.Array[Double | Record]): js.Tuple3[js.Array[Double], js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.MACDFIX")
    @js.native
    def MACDFIX(Records: js.Array[Double | Record], SignalPeriod: Double): js.Tuple3[js.Array[Double], js.Array[Double], js.Array[Double]] = js.native
    
    /**
      * MESA Adaptive Moving Average (MESA 移动平均线)
      *
      * MAMA(Records[Close],Fast Limit = 0.5,Slow Limit = 0.05) = [Array(outMAMA),Array(outFAMA)]
      *
      * @param {botvs.Record[]|number[]} Records
      * @param {number=0.5} FastLimit
      * @param {number=0.05} SlowLimit
      * @return {[number[], number[]]}
      */
    @JSGlobal("talib.MAMA")
    @js.native
    def MAMA(Records: js.Array[Double | Record]): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.MAMA")
    @js.native
    def MAMA(Records: js.Array[Double | Record], FastLimit: js.UndefOr[scala.Nothing], SlowLimit: Double): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.MAMA")
    @js.native
    def MAMA(Records: js.Array[Double | Record], FastLimit: Double): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.MAMA")
    @js.native
    def MAMA(Records: js.Array[Double | Record], FastLimit: Double, SlowLimit: Double): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
    
    /**
      * Highest value over a specified period (最大值)
      *
      * MAX(Records[Close],Time Period = 30) = Array(outReal)
      *
      * @param {botvs.Record[]|number[]} Records
      * @param {number=30} TimePeriod
      * @return {number[]}
      */
    @JSGlobal("talib.MAX")
    @js.native
    def MAX(Records: js.Array[Double | Record]): js.Array[Double] = js.native
    @JSGlobal("talib.MAX")
    @js.native
    def MAX(Records: js.Array[Double | Record], TimePeriod: Double): js.Array[Double] = js.native
    
    /**
      * Index of highest value over a specified period (最大值索引)
      *
      * MAXINDEX(Records[Close],Time Period = 30) = Array(outInteger)
      *
      * @param {botvs.Record[]|number[]} Records
      * @param {number=30} TimePeriod
      * @return {number[]}
      */
    @JSGlobal("talib.MAXINDEX")
    @js.native
    def MAXINDEX(Records: js.Array[Double | Record]): js.Array[Double] = js.native
    @JSGlobal("talib.MAXINDEX")
    @js.native
    def MAXINDEX(Records: js.Array[Double | Record], TimePeriod: Double): js.Array[Double] = js.native
    
    /**
      * Median Price (中位数价格)
      *
      * MEDPRICE(Records[High,Low]) = Array(outReal)
      *
      * @param {number[]} High
      * @param {number[]} Low
      * @return {number[]}
      */
    @JSGlobal("talib.MEDPRICE")
    @js.native
    def MEDPRICE(High: js.Array[Double], Low: js.Array[Double]): js.Array[Double] = js.native
    /**
      * Median Price (中位数价格)
      *
      * MEDPRICE(Records[High,Low]) = Array(outReal)
      *
      * @param {botvs.Record[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.MEDPRICE")
    @js.native
    def MEDPRICE(Records: js.Array[Record]): js.Array[Double] = js.native
    
    /**
      * Money Flow Index (货币流量指数)
      *
      * MFI(Records[High,Low,Close,Volume],Time Period = 14) = Array(outReal)
      *
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @param {number[]} Volume
      * @param {number=14} TimePeriod
      * @return {number[]}
      */
    @JSGlobal("talib.MFI")
    @js.native
    def MFI(High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double], Volume: js.Array[Double]): js.Array[Double] = js.native
    @JSGlobal("talib.MFI")
    @js.native
    def MFI(
      High: js.Array[Double],
      Low: js.Array[Double],
      Close: js.Array[Double],
      Volume: js.Array[Double],
      TimePeriod: Double
    ): js.Array[Double] = js.native
    /**
      * Money Flow Index (货币流量指数)
      *
      * MFI(Records[High,Low,Close,Volume],Time Period = 14) = Array(outReal)
      *
      * @param {botvs.Record[]} Records
      * @param {number=14} TimePeriod
      * @return {number[]}
      */
    @JSGlobal("talib.MFI")
    @js.native
    def MFI(Records: js.Array[Record]): js.Array[Double] = js.native
    @JSGlobal("talib.MFI")
    @js.native
    def MFI(Records: js.Array[Record], TimePeriod: Double): js.Array[Double] = js.native
    
    /**
      * MidPoint over period (中点)
      *
      * MIDPOINT(Records[Close],Time Period = 14) = Array(outReal)
      *
      * @param {botvs.Record[]|number[]} Records
      * @param {number=14} TimePeriod
      * @return {number[]}
      */
    @JSGlobal("talib.MIDPOINT")
    @js.native
    def MIDPOINT(Records: js.Array[Double | Record]): js.Array[Double] = js.native
    @JSGlobal("talib.MIDPOINT")
    @js.native
    def MIDPOINT(Records: js.Array[Double | Record], TimePeriod: Double): js.Array[Double] = js.native
    
    /**
      * Midpoint Price over period (中点价格)
      *
      * MIDPRICE(Records[High,Low],Time Period = 14) = Array(outReal)
      *
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number=14} TimePeriod
      * @return {number[]}
      */
    @JSGlobal("talib.MIDPRICE")
    @js.native
    def MIDPRICE(High: js.Array[Double], Low: js.Array[Double]): js.Array[Double] = js.native
    @JSGlobal("talib.MIDPRICE")
    @js.native
    def MIDPRICE(High: js.Array[Double], Low: js.Array[Double], TimePeriod: Double): js.Array[Double] = js.native
    /**
      * Midpoint Price over period (中点价格)
      *
      * MIDPRICE(Records[High,Low],Time Period = 14) = Array(outReal)
      *
      * @param {botvs.Record[]} Records
      * @param {number=14} TimePeriod
      * @return {number[]}
      */
    @JSGlobal("talib.MIDPRICE")
    @js.native
    def MIDPRICE(Records: js.Array[Record]): js.Array[Double] = js.native
    @JSGlobal("talib.MIDPRICE")
    @js.native
    def MIDPRICE(Records: js.Array[Record], TimePeriod: Double): js.Array[Double] = js.native
    
    /**
      * Lowest value over a specified period (最小值)
      *
      * MIN(Records[Close],Time Period = 30) = Array(outReal)
      *
      * @param {botvs.Record[]|number[]} Records
      * @param {number=30} TimePeriod
      * @return {number[]}
      */
    @JSGlobal("talib.MIN")
    @js.native
    def MIN(Records: js.Array[Double | Record]): js.Array[Double] = js.native
    @JSGlobal("talib.MIN")
    @js.native
    def MIN(Records: js.Array[Double | Record], TimePeriod: Double): js.Array[Double] = js.native
    
    /**
      * Index of lowest value over a specified period (最小值索引)
      *
      * MININDEX(Records[Close],Time Period = 30) = Array(outInteger)
      *
      * @param {botvs.Record[]|number[]} Records
      * @param {number=30} TimePeriod
      * @return {number[]}
      */
    @JSGlobal("talib.MININDEX")
    @js.native
    def MININDEX(Records: js.Array[Double | Record]): js.Array[Double] = js.native
    @JSGlobal("talib.MININDEX")
    @js.native
    def MININDEX(Records: js.Array[Double | Record], TimePeriod: Double): js.Array[Double] = js.native
    
    /**
      * Lowest and highest values over a specified period (最小最大值)
      *
      * MINMAX(Records[Close],Time Period = 30) = [Array(outMin),Array(outMax)]
      *
      * @param {botvs.Record[]|number[]} Records
      * @param {number=30} TimePeriod
      * @return {[number[], number[]]}
      */
    @JSGlobal("talib.MINMAX")
    @js.native
    def MINMAX(Records: js.Array[Double | Record]): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.MINMAX")
    @js.native
    def MINMAX(Records: js.Array[Double | Record], TimePeriod: Double): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
    
    /**
      * Indexes of lowest and highest values over a specified period (最小最大值索引)
      *
      * MINMAXINDEX(Records[Close],Time Period = 30) = [Array(outMinIdx),Array(outMaxIdx)]
      *
      * @param {botvs.Record[]|number[]} Records
      * @param {number=30} TimePeriod
      * @return {[number[], number[]]}
      */
    @JSGlobal("talib.MINMAXINDEX")
    @js.native
    def MINMAXINDEX(Records: js.Array[Double | Record]): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.MINMAXINDEX")
    @js.native
    def MINMAXINDEX(Records: js.Array[Double | Record], TimePeriod: Double): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
    
    /**
      * Minus Directional Indicator (负向指标)
      *
      * MINUS_DI(Records[High,Low,Close],Time Period = 14) = Array(outReal)
      *
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @param {number=14} TimePeriod
      * @return {number[]}
      */
    @JSGlobal("talib.MINUS_DI")
    @js.native
    def MINUS_DI(High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double], TimePeriod: Double): js.Array[Double] = js.native
    /**
      * Minus Directional Indicator (负向指标)
      *
      * MINUS_DI(Records[High,Low,Close],Time Period = 14) = Array(outReal)
      *
      * @param {botvs.Record[]} Records
      * @param {number=14} TimePeriod
      * @return {number[]}
      */
    @JSGlobal("talib.MINUS_DI")
    @js.native
    def MINUS_DI(Records: js.Array[Record], TimePeriod: Double): js.Array[Double] = js.native
    
    /**
      * Minus Directional Movement (负向运动)
      *
      * MINUS_DM(Records[High,Low],Time Period = 14) = Array(outReal)
      *
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number=14} TimePeriod
      * @return {number[]}
      */
    @JSGlobal("talib.MINUS_DM")
    @js.native
    def MINUS_DM(High: js.Array[Double], Low: js.Array[Double], TimePeriod: Double): js.Array[Double] = js.native
    /**
      * Minus Directional Movement (负向运动)
      *
      * MINUS_DM(Records[High,Low],Time Period = 14) = Array(outReal)
      *
      * @param {botvs.Record[]} Records
      * @param {number=14} TimePeriod
      * @return {number[]}
      */
    @JSGlobal("talib.MINUS_DM")
    @js.native
    def MINUS_DM(Records: js.Array[Record], TimePeriod: Double): js.Array[Double] = js.native
    
    /**
      * Momentum (动量)
      *
      * MOM(Records[Close],Time Period = 10) = Array(outReal)
      *
      * @param {botvs.Record[]|number[]} Records
      * @param {number=10} TimePeriod
      * @return {number[]}
      */
    @JSGlobal("talib.MOM")
    @js.native
    def MOM(Records: js.Array[Double | Record]): js.Array[Double] = js.native
    @JSGlobal("talib.MOM")
    @js.native
    def MOM(Records: js.Array[Double | Record], TimePeriod: Double): js.Array[Double] = js.native
    
    /**
      * Normalized Average True Range (归一化平均值范围)
      *
      * NATR(Records[High,Low,Close],Time Period = 14) = Array(outReal)
      *
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @param {number=14} TimePeriod
      * @return {number[]}
      */
    @JSGlobal("talib.NATR")
    @js.native
    def NATR(High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
    @JSGlobal("talib.NATR")
    @js.native
    def NATR(High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double], TimePeriod: Double): js.Array[Double] = js.native
    /**
      * Normalized Average True Range (归一化平均值范围)
      *
      * NATR(Records[High,Low,Close],Time Period = 14) = Array(outReal)
      *
      * @param {botvs.Record[]} Records
      * @param {number=14} TimePeriod
      * @return {number[]}
      */
    @JSGlobal("talib.NATR")
    @js.native
    def NATR(Records: js.Array[Record]): js.Array[Double] = js.native
    @JSGlobal("talib.NATR")
    @js.native
    def NATR(Records: js.Array[Record], TimePeriod: Double): js.Array[Double] = js.native
    
    @JSGlobal("talib.OBV")
    @js.native
    def OBV(Close: js.Array[Double], Volume: js.Array[Double]): js.Array[Double] = js.native
    /**
      * On Balance Volume (能量潮)
      *
      * OBV(Records[Close],Records[Volume]) = Array(outReal)
      *
      * @param {botvs.Record[]} Records
      * @return {number[]}
      */
    /**
      * On Balance Volume (能量潮)
      *
      * OBV(Records[Close],Records[Volume]) = Array(outReal)
      *
      * @param {number[]} Close
      * @param {number[]} Volume
      * @return {number[]}
      */
    @JSGlobal("talib.OBV")
    @js.native
    def OBV(Records: js.Array[Double | Record]): js.Array[Double] = js.native
    
    /**
      * Plus Directional Indicator (更向指示器)
      *
      * PLUS_DI(Records[High,Low,Close],Time Period = 14) = Array(outReal)
      *
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @param {number=14} TimePeriod
      * @return {number[]}
      */
    @JSGlobal("talib.PLUS_DI")
    @js.native
    def PLUS_DI(High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double], TimePeriod: Double): js.Array[Double] = js.native
    /**
      * Plus Directional Indicator (更向指示器)
      *
      * PLUS_DI(Records[High,Low,Close],Time Period = 14) = Array(outReal)
      *
      * @param {botvs.Record[]} Records
      * @param {number=14} TimePeriod
      * @return {number[]}
      */
    @JSGlobal("talib.PLUS_DI")
    @js.native
    def PLUS_DI(Records: js.Array[Record], TimePeriod: Double): js.Array[Double] = js.native
    
    /**
      * Plus Directional Movement (定向运动)
      *
      * PLUS_DM(Records[High,Low],Time Period = 14) = Array(outReal)
      *
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number=14} TimePeriod
      * @return {number[]}
      */
    @JSGlobal("talib.PLUS_DM")
    @js.native
    def PLUS_DM(High: js.Array[Double], Low: js.Array[Double], TimePeriod: Double): js.Array[Double] = js.native
    /**
      * Plus Directional Movement (定向运动)
      *
      * PLUS_DM(Records[High,Low],Time Period = 14) = Array(outReal)
      *
      * @param {botvs.Record[]} Records
      * @param {number=14} TimePeriod
      * @return {number[]}
      */
    @JSGlobal("talib.PLUS_DM")
    @js.native
    def PLUS_DM(Records: js.Array[Record], TimePeriod: Double): js.Array[Double] = js.native
    
    /**
      * Percentage Price Oscillator (价格振荡百分比)
      *
      * PPO(Records[Close],Fast Period = 12,Slow Period = 26,MA Type = 0) = Array(outReal)
      *
      * @param {botvs.Record[]|number[]} Records
      * @param {number=12} FastPeriod
      * @param {number=26} SlowPeriod
      * @param {number=0} MAType
      * @return {number[]}
      */
    @JSGlobal("talib.PPO")
    @js.native
    def PPO(Records: js.Array[Double | Record]): js.Array[Double] = js.native
    @JSGlobal("talib.PPO")
    @js.native
    def PPO(
      Records: js.Array[Double | Record],
      FastPeriod: js.UndefOr[scala.Nothing],
      SlowPeriod: js.UndefOr[scala.Nothing],
      MAType: Double
    ): js.Array[Double] = js.native
    @JSGlobal("talib.PPO")
    @js.native
    def PPO(Records: js.Array[Double | Record], FastPeriod: js.UndefOr[scala.Nothing], SlowPeriod: Double): js.Array[Double] = js.native
    @JSGlobal("talib.PPO")
    @js.native
    def PPO(
      Records: js.Array[Double | Record],
      FastPeriod: js.UndefOr[scala.Nothing],
      SlowPeriod: Double,
      MAType: Double
    ): js.Array[Double] = js.native
    @JSGlobal("talib.PPO")
    @js.native
    def PPO(Records: js.Array[Double | Record], FastPeriod: Double): js.Array[Double] = js.native
    @JSGlobal("talib.PPO")
    @js.native
    def PPO(
      Records: js.Array[Double | Record],
      FastPeriod: Double,
      SlowPeriod: js.UndefOr[scala.Nothing],
      MAType: Double
    ): js.Array[Double] = js.native
    @JSGlobal("talib.PPO")
    @js.native
    def PPO(Records: js.Array[Double | Record], FastPeriod: Double, SlowPeriod: Double): js.Array[Double] = js.native
    @JSGlobal("talib.PPO")
    @js.native
    def PPO(Records: js.Array[Double | Record], FastPeriod: Double, SlowPeriod: Double, MAType: Double): js.Array[Double] = js.native
    
    /**
      * Rate of change : ((price/prevPrice)-1)*100 (变动率指标)
      *
      * ROC(Records[Close],Time Period = 10) = Array(outReal)
      *
      * @param {botvs.Record[]|number[]} Records
      * @param {number=10} TimePeriod
      * @return {number[]}
      */
    @JSGlobal("talib.ROC")
    @js.native
    def ROC(Records: js.Array[Double | Record]): js.Array[Double] = js.native
    @JSGlobal("talib.ROC")
    @js.native
    def ROC(Records: js.Array[Double | Record], TimePeriod: Double): js.Array[Double] = js.native
    
    /**
      * Rate of change Percentage: (price-prevPrice)/prevPrice (价格变化率)
      *
      * ROCP(Records[Close],Time Period = 10) = Array(outReal)
      *
      * @param {botvs.Record[]|number[]} Records
      * @param {number=10} TimePeriod
      * @return {number[]}
      */
    @JSGlobal("talib.ROCP")
    @js.native
    def ROCP(Records: js.Array[Double | Record]): js.Array[Double] = js.native
    @JSGlobal("talib.ROCP")
    @js.native
    def ROCP(Records: js.Array[Double | Record], TimePeriod: Double): js.Array[Double] = js.native
    
    /**
      * Rate of change ratio: (price/prevPrice) (价格变化率)
      *
      * ROCR(Records[Close],Time Period = 10) = Array(outReal)
      *
      * @param {botvs.Record[]|number[]} Records
      * @param {number=10} TimePeriod
      * @return {number[]}
      */
    @JSGlobal("talib.ROCR")
    @js.native
    def ROCR(Records: js.Array[Double | Record]): js.Array[Double] = js.native
    @JSGlobal("talib.ROCR")
    @js.native
    def ROCR(Records: js.Array[Double | Record], TimePeriod: Double): js.Array[Double] = js.native
    
    /**
      * Rate of change ratio 100 scale: (price/prevPrice)*100 (价格变化率)
      *
      * ROCR100(Records[Close],Time Period = 10) = Array(outReal)
      *
      * @param {botvs.Record[]|number[]} Records
      * @param {number=10} TimePeriod
      * @return {number[]}
      */
    @JSGlobal("talib.ROCR100")
    @js.native
    def ROCR100(Records: js.Array[Double | Record], TimePeriod: Double): js.Array[Double] = js.native
    
    /**
      * Relative Strength Index (相对强弱指标)
      *
      * RSI(Records[Close],Time Period = 14) = Array(outReal)
      *
      * @param {botvs.Record[]|number[]} Records
      * @param {number=14} TimePeriod
      * @return {number[]}
      */
    @JSGlobal("talib.RSI")
    @js.native
    def RSI(Records: js.Array[Double | Record]): js.Array[Double] = js.native
    @JSGlobal("talib.RSI")
    @js.native
    def RSI(Records: js.Array[Double | Record], TimePeriod: Double): js.Array[Double] = js.native
    
    /**
      * Parabolic SAR (抛物线转向)
      *
      * SAR(Records[High,Low],Acceleration Factor = 0.02,AF Maximum = 0.2) = Array(outReal)
      *
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number=0.02} AccelerationFactor
      * @param {number=0.2} AFMaximum
      * @return {number[]}
      */
    @JSGlobal("talib.SAR")
    @js.native
    def SAR(High: js.Array[Double], Low: js.Array[Double]): js.Array[Double] = js.native
    @JSGlobal("talib.SAR")
    @js.native
    def SAR(
      High: js.Array[Double],
      Low: js.Array[Double],
      AccelerationFactor: js.UndefOr[scala.Nothing],
      AFMaximum: Double
    ): js.Array[Double] = js.native
    @JSGlobal("talib.SAR")
    @js.native
    def SAR(High: js.Array[Double], Low: js.Array[Double], AccelerationFactor: Double): js.Array[Double] = js.native
    @JSGlobal("talib.SAR")
    @js.native
    def SAR(High: js.Array[Double], Low: js.Array[Double], AccelerationFactor: Double, AFMaximum: Double): js.Array[Double] = js.native
    /**
      * Parabolic SAR (抛物线转向)
      *
      * SAR(Records[High,Low],Acceleration Factor = 0.02,AF Maximum = 0.2) = Array(outReal)
      *
      * @param {botvs.Record[]} Records
      * @param {number=0.02} AccelerationFactor
      * @param {number=0.2} AFMaximum
      * @return {number[]}
      */
    @JSGlobal("talib.SAR")
    @js.native
    def SAR(Records: js.Array[Record]): js.Array[Double] = js.native
    @JSGlobal("talib.SAR")
    @js.native
    def SAR(Records: js.Array[Record], AccelerationFactor: js.UndefOr[scala.Nothing], AFMaximum: Double): js.Array[Double] = js.native
    @JSGlobal("talib.SAR")
    @js.native
    def SAR(Records: js.Array[Record], AccelerationFactor: Double): js.Array[Double] = js.native
    @JSGlobal("talib.SAR")
    @js.native
    def SAR(Records: js.Array[Record], AccelerationFactor: Double, AFMaximum: Double): js.Array[Double] = js.native
    
    /**
      * Parabolic SAR - Extended (增强型抛物线转向)
      *
      * SAREXT(Records[High,Low],Start Value = 0,Offset on Reverse = 0,AF Init Long = 0.02,AF Long = 0.02,AF Max
      * Long =
      * 0.2,AF Init Short = 0.02,AF Short = 0.02,AF Max Short = 0.2) = Array(outReal)
      *
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number=0} StartValue
      * @param {number=0} OffsetonReverse
      * @param {number=0.02} AFInitLong
      * @param {number=0.02} AFLong
      * @param {number=0.2} AFMaxLong
      * @param {number=0.02} AFInitShort
      * @param {number=0.02} AFShort
      * @param {number=0.2} AFMaxShort
      * @return {number[]}
      */
    @JSGlobal("talib.SAREXT")
    @js.native
    def SAREXT(
      High: js.Array[Double],
      Low: js.Array[Double],
      StartValue: Double,
      OffsetonReverse: Double,
      AFInitLong: Double,
      AFLong: Double,
      AFMaxLong: Double,
      AFInitShort: Double,
      AFShort: Double,
      AFMaxShort: Double
    ): js.Array[Double] = js.native
    /**
      * Parabolic SAR - Extended (增强型抛物线转向)
      *
      * SAREXT(Records[High,Low],Start Value = 0,Offset on Reverse = 0,AF Init Long = 0.02,AF Long = 0.02,AF Max
      * Long =
      * 0.2,AF Init Short = 0.02,AF Short = 0.02,AF Max Short = 0.2) = Array(outReal)
      *
      * @param {botvs.Record[]} Records
      * @param {number=0} StartValue
      * @param {number=0} OffsetonReverse
      * @param {number=0.02} AFInitLong
      * @param {number=0.02} AFLong
      * @param {number=0.2} AFMaxLong
      * @param {number=0.02} AFInitShort
      * @param {number=0.02} AFShort
      * @param {number=0.2} AFMaxShort
      * @return {number[]}
      */
    @JSGlobal("talib.SAREXT")
    @js.native
    def SAREXT(
      Records: js.Array[Record],
      StartValue: js.UndefOr[Double],
      OffsetonReverse: js.UndefOr[Double],
      AFInitLong: js.UndefOr[Double],
      AFLong: js.UndefOr[Double],
      AFMaxLong: js.UndefOr[Double],
      AFInitShort: js.UndefOr[Double],
      AFShort: js.UndefOr[Double],
      AFMaxShort: js.UndefOr[Double]
    ): js.Array[Double] = js.native
    
    /**
      * Vector Trigonometric Sin (正弦值)
      *
      * SIN(Records[Close]) = Array(outReal)
      *
      * @param {botvs.Record[]|number[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.SIN")
    @js.native
    def SIN(Records: js.Array[Double | Record]): js.Array[Double] = js.native
    
    /**
      * Vector Trigonometric Sinh (双曲正弦函数)
      *
      * SINH(Records[Close]) = Array(outReal)
      *
      * @param {botvs.Record[]|number[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.SINH")
    @js.native
    def SINH(Records: js.Array[Double | Record]): js.Array[Double] = js.native
    
    /**
      * Simple Moving Average (简单移动平均)
      *
      * SMA(Records[Close],Time Period = 30) = Array(outReal)
      *
      * @param {botvs.Record[]|number[]} Records
      * @param {number=30} TimePeriod
      * @return {number[]}
      */
    @JSGlobal("talib.SMA")
    @js.native
    def SMA(Records: js.Array[Double | Record]): js.Array[Double] = js.native
    @JSGlobal("talib.SMA")
    @js.native
    def SMA(Records: js.Array[Double | Record], TimePeriod: Double): js.Array[Double] = js.native
    
    /**
      * Vector Square Root (平方根)
      *
      * SQRT(Records[Close]) = Array(outReal)
      *
      * @param {botvs.Record[]|number[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.SQRT")
    @js.native
    def SQRT(Records: js.Array[Double | Record]): js.Array[Double] = js.native
    
    /**
      * Standard Deviation (标准偏差)
      *
      * STDDEV(Records[Close],Time Period = 5,Deviations = 1) = Array(outReal)
      *
      * @param {botvs.Record[]|number[]} Records
      * @param {number=5} TimePeriod
      * @param {number=1} Deviations
      * @return {number[]}
      */
    @JSGlobal("talib.STDDEV")
    @js.native
    def STDDEV(Records: js.Array[Double | Record]): js.Array[Double] = js.native
    @JSGlobal("talib.STDDEV")
    @js.native
    def STDDEV(Records: js.Array[Double | Record], TimePeriod: js.UndefOr[scala.Nothing], Deviations: Double): js.Array[Double] = js.native
    @JSGlobal("talib.STDDEV")
    @js.native
    def STDDEV(Records: js.Array[Double | Record], TimePeriod: Double): js.Array[Double] = js.native
    @JSGlobal("talib.STDDEV")
    @js.native
    def STDDEV(Records: js.Array[Double | Record], TimePeriod: Double, Deviations: Double): js.Array[Double] = js.native
    
    /**
      * Stochastic (STOCH指标)
      *
      * STOCH(Records[High,Low,Close],Fast-K Period = 5,Slow-K Period = 3,Slow-K MA = 0,Slow-D Period = 3,Slow-D MA
      * = 0)
      * = [Array(outSlowK),Array(outSlowD)]
      *
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @param {number=5} Fast_KPeriod
      * @param {number=3} Slow_KPeriod
      * @param {number=0} Slow_KMA
      * @param {number=3} Slow_DPeriod
      * @param {number=0} Slow_DMA
      * @return {[number[], number[]]}
      */
    @JSGlobal("talib.STOCH")
    @js.native
    def STOCH(
      High: js.Array[Double],
      Low: js.Array[Double],
      Close: js.Array[Double],
      Fast_KPeriod: Double,
      Slow_KPeriod: Double,
      Slow_KMA: Double,
      Slow_DPeriod: Double,
      Slow_DMA: Double
    ): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
    /**
      * Stochastic (STOCH指标)
      *
      * STOCH(Records[High,Low,Close],Fast-K Period = 5,Slow-K Period = 3,Slow-K MA = 0,Slow-D Period = 3,Slow-D MA
      * = 0)
      * = [Array(outSlowK),Array(outSlowD)]
      *
      * @param {botvs.Record[]} Records
      * @param {number=5} Fast_KPeriod
      * @param {number=3} Slow_KPeriod
      * @param {number=0} Slow_KMA
      * @param {number=3} Slow_DPeriod
      * @param {number=0} Slow_DMA
      * @return {[number[], number[]]}
      */
    @JSGlobal("talib.STOCH")
    @js.native
    def STOCH(Records: js.Array[Record]): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.STOCH")
    @js.native
    def STOCH(
      Records: js.Array[Record],
      Fast_KPeriod: js.UndefOr[scala.Nothing],
      Slow_KPeriod: js.UndefOr[scala.Nothing],
      Slow_KMA: js.UndefOr[scala.Nothing],
      Slow_DPeriod: js.UndefOr[scala.Nothing],
      Slow_DMA: Double
    ): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.STOCH")
    @js.native
    def STOCH(
      Records: js.Array[Record],
      Fast_KPeriod: js.UndefOr[scala.Nothing],
      Slow_KPeriod: js.UndefOr[scala.Nothing],
      Slow_KMA: js.UndefOr[scala.Nothing],
      Slow_DPeriod: Double
    ): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.STOCH")
    @js.native
    def STOCH(
      Records: js.Array[Record],
      Fast_KPeriod: js.UndefOr[scala.Nothing],
      Slow_KPeriod: js.UndefOr[scala.Nothing],
      Slow_KMA: js.UndefOr[scala.Nothing],
      Slow_DPeriod: Double,
      Slow_DMA: Double
    ): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.STOCH")
    @js.native
    def STOCH(
      Records: js.Array[Record],
      Fast_KPeriod: js.UndefOr[scala.Nothing],
      Slow_KPeriod: js.UndefOr[scala.Nothing],
      Slow_KMA: Double
    ): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.STOCH")
    @js.native
    def STOCH(
      Records: js.Array[Record],
      Fast_KPeriod: js.UndefOr[scala.Nothing],
      Slow_KPeriod: js.UndefOr[scala.Nothing],
      Slow_KMA: Double,
      Slow_DPeriod: js.UndefOr[scala.Nothing],
      Slow_DMA: Double
    ): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.STOCH")
    @js.native
    def STOCH(
      Records: js.Array[Record],
      Fast_KPeriod: js.UndefOr[scala.Nothing],
      Slow_KPeriod: js.UndefOr[scala.Nothing],
      Slow_KMA: Double,
      Slow_DPeriod: Double
    ): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.STOCH")
    @js.native
    def STOCH(
      Records: js.Array[Record],
      Fast_KPeriod: js.UndefOr[scala.Nothing],
      Slow_KPeriod: js.UndefOr[scala.Nothing],
      Slow_KMA: Double,
      Slow_DPeriod: Double,
      Slow_DMA: Double
    ): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.STOCH")
    @js.native
    def STOCH(Records: js.Array[Record], Fast_KPeriod: js.UndefOr[scala.Nothing], Slow_KPeriod: Double): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.STOCH")
    @js.native
    def STOCH(
      Records: js.Array[Record],
      Fast_KPeriod: js.UndefOr[scala.Nothing],
      Slow_KPeriod: Double,
      Slow_KMA: js.UndefOr[scala.Nothing],
      Slow_DPeriod: js.UndefOr[scala.Nothing],
      Slow_DMA: Double
    ): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.STOCH")
    @js.native
    def STOCH(
      Records: js.Array[Record],
      Fast_KPeriod: js.UndefOr[scala.Nothing],
      Slow_KPeriod: Double,
      Slow_KMA: js.UndefOr[scala.Nothing],
      Slow_DPeriod: Double
    ): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.STOCH")
    @js.native
    def STOCH(
      Records: js.Array[Record],
      Fast_KPeriod: js.UndefOr[scala.Nothing],
      Slow_KPeriod: Double,
      Slow_KMA: js.UndefOr[scala.Nothing],
      Slow_DPeriod: Double,
      Slow_DMA: Double
    ): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.STOCH")
    @js.native
    def STOCH(
      Records: js.Array[Record],
      Fast_KPeriod: js.UndefOr[scala.Nothing],
      Slow_KPeriod: Double,
      Slow_KMA: Double
    ): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.STOCH")
    @js.native
    def STOCH(
      Records: js.Array[Record],
      Fast_KPeriod: js.UndefOr[scala.Nothing],
      Slow_KPeriod: Double,
      Slow_KMA: Double,
      Slow_DPeriod: js.UndefOr[scala.Nothing],
      Slow_DMA: Double
    ): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.STOCH")
    @js.native
    def STOCH(
      Records: js.Array[Record],
      Fast_KPeriod: js.UndefOr[scala.Nothing],
      Slow_KPeriod: Double,
      Slow_KMA: Double,
      Slow_DPeriod: Double
    ): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.STOCH")
    @js.native
    def STOCH(
      Records: js.Array[Record],
      Fast_KPeriod: js.UndefOr[scala.Nothing],
      Slow_KPeriod: Double,
      Slow_KMA: Double,
      Slow_DPeriod: Double,
      Slow_DMA: Double
    ): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.STOCH")
    @js.native
    def STOCH(Records: js.Array[Record], Fast_KPeriod: Double): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.STOCH")
    @js.native
    def STOCH(
      Records: js.Array[Record],
      Fast_KPeriod: Double,
      Slow_KPeriod: js.UndefOr[scala.Nothing],
      Slow_KMA: js.UndefOr[scala.Nothing],
      Slow_DPeriod: js.UndefOr[scala.Nothing],
      Slow_DMA: Double
    ): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.STOCH")
    @js.native
    def STOCH(
      Records: js.Array[Record],
      Fast_KPeriod: Double,
      Slow_KPeriod: js.UndefOr[scala.Nothing],
      Slow_KMA: js.UndefOr[scala.Nothing],
      Slow_DPeriod: Double
    ): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.STOCH")
    @js.native
    def STOCH(
      Records: js.Array[Record],
      Fast_KPeriod: Double,
      Slow_KPeriod: js.UndefOr[scala.Nothing],
      Slow_KMA: js.UndefOr[scala.Nothing],
      Slow_DPeriod: Double,
      Slow_DMA: Double
    ): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.STOCH")
    @js.native
    def STOCH(
      Records: js.Array[Record],
      Fast_KPeriod: Double,
      Slow_KPeriod: js.UndefOr[scala.Nothing],
      Slow_KMA: Double
    ): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.STOCH")
    @js.native
    def STOCH(
      Records: js.Array[Record],
      Fast_KPeriod: Double,
      Slow_KPeriod: js.UndefOr[scala.Nothing],
      Slow_KMA: Double,
      Slow_DPeriod: js.UndefOr[scala.Nothing],
      Slow_DMA: Double
    ): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.STOCH")
    @js.native
    def STOCH(
      Records: js.Array[Record],
      Fast_KPeriod: Double,
      Slow_KPeriod: js.UndefOr[scala.Nothing],
      Slow_KMA: Double,
      Slow_DPeriod: Double
    ): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.STOCH")
    @js.native
    def STOCH(
      Records: js.Array[Record],
      Fast_KPeriod: Double,
      Slow_KPeriod: js.UndefOr[scala.Nothing],
      Slow_KMA: Double,
      Slow_DPeriod: Double,
      Slow_DMA: Double
    ): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.STOCH")
    @js.native
    def STOCH(Records: js.Array[Record], Fast_KPeriod: Double, Slow_KPeriod: Double): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.STOCH")
    @js.native
    def STOCH(
      Records: js.Array[Record],
      Fast_KPeriod: Double,
      Slow_KPeriod: Double,
      Slow_KMA: js.UndefOr[scala.Nothing],
      Slow_DPeriod: js.UndefOr[scala.Nothing],
      Slow_DMA: Double
    ): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.STOCH")
    @js.native
    def STOCH(
      Records: js.Array[Record],
      Fast_KPeriod: Double,
      Slow_KPeriod: Double,
      Slow_KMA: js.UndefOr[scala.Nothing],
      Slow_DPeriod: Double
    ): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.STOCH")
    @js.native
    def STOCH(
      Records: js.Array[Record],
      Fast_KPeriod: Double,
      Slow_KPeriod: Double,
      Slow_KMA: js.UndefOr[scala.Nothing],
      Slow_DPeriod: Double,
      Slow_DMA: Double
    ): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.STOCH")
    @js.native
    def STOCH(Records: js.Array[Record], Fast_KPeriod: Double, Slow_KPeriod: Double, Slow_KMA: Double): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.STOCH")
    @js.native
    def STOCH(
      Records: js.Array[Record],
      Fast_KPeriod: Double,
      Slow_KPeriod: Double,
      Slow_KMA: Double,
      Slow_DPeriod: js.UndefOr[scala.Nothing],
      Slow_DMA: Double
    ): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.STOCH")
    @js.native
    def STOCH(
      Records: js.Array[Record],
      Fast_KPeriod: Double,
      Slow_KPeriod: Double,
      Slow_KMA: Double,
      Slow_DPeriod: Double
    ): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.STOCH")
    @js.native
    def STOCH(
      Records: js.Array[Record],
      Fast_KPeriod: Double,
      Slow_KPeriod: Double,
      Slow_KMA: Double,
      Slow_DPeriod: Double,
      Slow_DMA: Double
    ): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
    
    /**
      * Stochastic Fast (快速STOCH指标)
      *
      * STOCHF(Records[High,Low,Close],Fast-K Period = 5,Fast-D Period = 3,Fast-D MA = 0) =
      * [Array(outFastK),Array(outFastD)]
      *
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @param {number=5} Fast_KPeriod
      * @param {number=3} Fast_DPeriod
      * @param {number=0} Fast_DMA
      * @return {[number[], number[]]}
      */
    @JSGlobal("talib.STOCHF")
    @js.native
    def STOCHF(
      High: js.Array[Double],
      Low: js.Array[Double],
      Close: js.Array[Double],
      Fast_KPeriod: Double,
      Fast_DPeriod: Double,
      Fast_DMA: Double
    ): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
    /**
      * Stochastic Fast (快速STOCH指标)
      *
      * STOCHF(Records[High,Low,Close],Fast-K Period = 5,Fast-D Period = 3,Fast-D MA = 0) =
      * [Array(outFastK),Array(outFastD)]
      *
      * @param {botvs.Record[]} Records
      * @param {number=5} Fast_KPeriod
      * @param {number=3} Fast_DPeriod
      * @param {number=0} Fast_DMA
      * @return {[number[], number[]]}
      */
    @JSGlobal("talib.STOCHF")
    @js.native
    def STOCHF(Records: js.Array[Record]): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.STOCHF")
    @js.native
    def STOCHF(
      Records: js.Array[Record],
      Fast_KPeriod: js.UndefOr[scala.Nothing],
      Fast_DPeriod: js.UndefOr[scala.Nothing],
      Fast_DMA: Double
    ): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.STOCHF")
    @js.native
    def STOCHF(Records: js.Array[Record], Fast_KPeriod: js.UndefOr[scala.Nothing], Fast_DPeriod: Double): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.STOCHF")
    @js.native
    def STOCHF(
      Records: js.Array[Record],
      Fast_KPeriod: js.UndefOr[scala.Nothing],
      Fast_DPeriod: Double,
      Fast_DMA: Double
    ): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.STOCHF")
    @js.native
    def STOCHF(Records: js.Array[Record], Fast_KPeriod: Double): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.STOCHF")
    @js.native
    def STOCHF(
      Records: js.Array[Record],
      Fast_KPeriod: Double,
      Fast_DPeriod: js.UndefOr[scala.Nothing],
      Fast_DMA: Double
    ): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.STOCHF")
    @js.native
    def STOCHF(Records: js.Array[Record], Fast_KPeriod: Double, Fast_DPeriod: Double): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.STOCHF")
    @js.native
    def STOCHF(Records: js.Array[Record], Fast_KPeriod: Double, Fast_DPeriod: Double, Fast_DMA: Double): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
    
    /**
      * Stochastic Relative Strength Index (随机强弱指数)
      *
      * STOCHRSI(Records[Close],Time Period = 14,Fast-K Period = 5,Fast-D Period = 3,Fast-D MA = 0) =
      * [Array(outFastK),Array(outFastD)]
      *
      * @param {botvs.Record[]|number[]} Records
      * @param {number=14} TimePeriod
      * @param {number=5} Fast_KPeriod
      * @param {number=3} Fast_DPeriod
      * @param {number=0} Fast_DMA
      * @return {[number[], number[]]}
      */
    @JSGlobal("talib.STOCHRSI")
    @js.native
    def STOCHRSI(Records: js.Array[Double | Record]): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.STOCHRSI")
    @js.native
    def STOCHRSI(
      Records: js.Array[Double | Record],
      TimePeriod: js.UndefOr[scala.Nothing],
      Fast_KPeriod: js.UndefOr[scala.Nothing],
      Fast_DPeriod: js.UndefOr[scala.Nothing],
      Fast_DMA: Double
    ): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.STOCHRSI")
    @js.native
    def STOCHRSI(
      Records: js.Array[Double | Record],
      TimePeriod: js.UndefOr[scala.Nothing],
      Fast_KPeriod: js.UndefOr[scala.Nothing],
      Fast_DPeriod: Double
    ): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.STOCHRSI")
    @js.native
    def STOCHRSI(
      Records: js.Array[Double | Record],
      TimePeriod: js.UndefOr[scala.Nothing],
      Fast_KPeriod: js.UndefOr[scala.Nothing],
      Fast_DPeriod: Double,
      Fast_DMA: Double
    ): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.STOCHRSI")
    @js.native
    def STOCHRSI(Records: js.Array[Double | Record], TimePeriod: js.UndefOr[scala.Nothing], Fast_KPeriod: Double): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.STOCHRSI")
    @js.native
    def STOCHRSI(
      Records: js.Array[Double | Record],
      TimePeriod: js.UndefOr[scala.Nothing],
      Fast_KPeriod: Double,
      Fast_DPeriod: js.UndefOr[scala.Nothing],
      Fast_DMA: Double
    ): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.STOCHRSI")
    @js.native
    def STOCHRSI(
      Records: js.Array[Double | Record],
      TimePeriod: js.UndefOr[scala.Nothing],
      Fast_KPeriod: Double,
      Fast_DPeriod: Double
    ): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.STOCHRSI")
    @js.native
    def STOCHRSI(
      Records: js.Array[Double | Record],
      TimePeriod: js.UndefOr[scala.Nothing],
      Fast_KPeriod: Double,
      Fast_DPeriod: Double,
      Fast_DMA: Double
    ): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.STOCHRSI")
    @js.native
    def STOCHRSI(Records: js.Array[Double | Record], TimePeriod: Double): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.STOCHRSI")
    @js.native
    def STOCHRSI(
      Records: js.Array[Double | Record],
      TimePeriod: Double,
      Fast_KPeriod: js.UndefOr[scala.Nothing],
      Fast_DPeriod: js.UndefOr[scala.Nothing],
      Fast_DMA: Double
    ): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.STOCHRSI")
    @js.native
    def STOCHRSI(
      Records: js.Array[Double | Record],
      TimePeriod: Double,
      Fast_KPeriod: js.UndefOr[scala.Nothing],
      Fast_DPeriod: Double
    ): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.STOCHRSI")
    @js.native
    def STOCHRSI(
      Records: js.Array[Double | Record],
      TimePeriod: Double,
      Fast_KPeriod: js.UndefOr[scala.Nothing],
      Fast_DPeriod: Double,
      Fast_DMA: Double
    ): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.STOCHRSI")
    @js.native
    def STOCHRSI(Records: js.Array[Double | Record], TimePeriod: Double, Fast_KPeriod: Double): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.STOCHRSI")
    @js.native
    def STOCHRSI(
      Records: js.Array[Double | Record],
      TimePeriod: Double,
      Fast_KPeriod: Double,
      Fast_DPeriod: js.UndefOr[scala.Nothing],
      Fast_DMA: Double
    ): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.STOCHRSI")
    @js.native
    def STOCHRSI(Records: js.Array[Double | Record], TimePeriod: Double, Fast_KPeriod: Double, Fast_DPeriod: Double): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
    @JSGlobal("talib.STOCHRSI")
    @js.native
    def STOCHRSI(
      Records: js.Array[Double | Record],
      TimePeriod: Double,
      Fast_KPeriod: Double,
      Fast_DPeriod: Double,
      Fast_DMA: Double
    ): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
    
    /**
      * Summation (求和)
      *
      * SUM(Records[Close],Time Period = 30) = Array(outReal)
      *
      * @param {botvs.Record[]|number[]} Records
      * @param {number=30} TimePeriod
      * @return {number[]}
      */
    @JSGlobal("talib.SUM")
    @js.native
    def SUM(Records: js.Array[Double | Record]): js.Array[Double] = js.native
    @JSGlobal("talib.SUM")
    @js.native
    def SUM(Records: js.Array[Double | Record], TimePeriod: Double): js.Array[Double] = js.native
    
    /**
      * Triple Exponential Moving Average (T3) (三指数移动平均)
      *
      * T3(Records[Close],Time Period = 5,Volume Factor = 0.7) = Array(outReal)
      *
      * @param {botvs.Record[]|number[]} Records
      * @param {number=5} TimePeriod
      * @param {number=0.7} VolumeFactor
      * @return {number[]}
      */
    @JSGlobal("talib.T3")
    @js.native
    def T3(Records: js.Array[Double | Record], TimePeriod: Double, VolumeFactor: Double): js.Array[Double] = js.native
    
    /**
      * Vector Trigonometric Tan (正切)
      *
      * TAN(Records[Close]) = Array(outReal)
      *
      * @param {botvs.Record[]|number[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.TAN")
    @js.native
    def TAN(Records: js.Array[Double | Record]): js.Array[Double] = js.native
    
    /**
      * Vector Trigonometric Tanh (双曲正切函数)
      *
      * TANH(Records[Close]) = Array(outReal)
      *
      * @param {botvs.Record[]|number[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.TANH")
    @js.native
    def TANH(Records: js.Array[Double | Record]): js.Array[Double] = js.native
    
    /**
      * Triple Exponential Moving Average (三指数移动平均)
      *
      * TEMA(Records[Close],Time Period = 30) = Array(outReal)
      *
      * @param {botvs.Record[]|number[]} Records
      * @param {number=30} TimePeriod
      * @return {number[]}
      */
    @JSGlobal("talib.TEMA")
    @js.native
    def TEMA(Records: js.Array[Double | Record]): js.Array[Double] = js.native
    @JSGlobal("talib.TEMA")
    @js.native
    def TEMA(Records: js.Array[Double | Record], TimePeriod: Double): js.Array[Double] = js.native
    
    /**
      * True Range (真实范围)
      *
      * TRANGE(Records[High,Low,Close]) = Array(outReal)
      *
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @return {number[]}
      */
    @JSGlobal("talib.TRANGE")
    @js.native
    def TRANGE(High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
    /**
      * True Range (真实范围)
      *
      * TRANGE(Records[High,Low,Close]) = Array(outReal)
      *
      * @param {botvs.Record[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.TRANGE")
    @js.native
    def TRANGE(Records: js.Array[Record]): js.Array[Double] = js.native
    
    /**
      * Triangular Moving Average (三指数移动平均)
      *
      * TRIMA(Records[Close],Time Period = 30) = Array(outReal)
      *
      * @param {botvs.Record[]|number[]} Records
      * @param {number=30} TimePeriod
      * @return {number[]}
      */
    @JSGlobal("talib.TRIMA")
    @js.native
    def TRIMA(Records: js.Array[Double | Record]): js.Array[Double] = js.native
    @JSGlobal("talib.TRIMA")
    @js.native
    def TRIMA(Records: js.Array[Double | Record], TimePeriod: Double): js.Array[Double] = js.native
    
    /**
      * 1-day Rate-Of-Change (ROC) of a Triple Smooth EMA (三重指数平滑平均线)
      *
      * TRIX(Records[Close],Time Period = 30) = Array(outReal)
      *
      * @param {botvs.Record[]|number[]} Records
      * @param {number=30} TimePeriod
      * @return {number[]}
      */
    @JSGlobal("talib.TRIX")
    @js.native
    def TRIX(Records: js.Array[Double | Record]): js.Array[Double] = js.native
    @JSGlobal("talib.TRIX")
    @js.native
    def TRIX(Records: js.Array[Double | Record], TimePeriod: Double): js.Array[Double] = js.native
    
    /**
      * Time Series Forecast (时间序列预测)
      *
      * TSF(Records[Close],Time Period = 14) = Array(outReal)
      *
      * @param {botvs.Record[]|number[]} Records
      * @param {number=14} TimePeriod
      * @return {number[]}
      */
    @JSGlobal("talib.TSF")
    @js.native
    def TSF(Records: js.Array[Double | Record]): js.Array[Double] = js.native
    @JSGlobal("talib.TSF")
    @js.native
    def TSF(Records: js.Array[Double | Record], TimePeriod: Double): js.Array[Double] = js.native
    
    /**
      * Typical Price (典型价格)
      *
      * TYPPRICE(Records[High,Low,Close]) = Array(outReal)
      *
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @return {number[]}
      */
    @JSGlobal("talib.TYPPRICE")
    @js.native
    def TYPPRICE(High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
    /**
      * Typical Price (典型价格)
      *
      * TYPPRICE(Records[High,Low,Close]) = Array(outReal)
      *
      * @param {botvs.Record[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.TYPPRICE")
    @js.native
    def TYPPRICE(Records: js.Array[Record]): js.Array[Double] = js.native
    
    /**
      * Ultimate Oscillator (极限振子)
      *
      * ULTOSC(Records[High,Low,Close],First Period = 7,Second Period = 14,Third Period = 28) = Array(outReal)
      *
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @param {number=7} FirstPeriod
      * @param {number=14} SecondPeriod
      * @param {number=28} ThirdPeriod
      * @return {number[]}
      */
    @JSGlobal("talib.ULTOSC")
    @js.native
    def ULTOSC(
      High: js.Array[Double],
      Low: js.Array[Double],
      Close: js.Array[Double],
      FirstPeriod: Double,
      SecondPeriod: Double,
      ThirdPeriod: Double
    ): js.Array[Double] = js.native
    /**
      * Ultimate Oscillator (极限振子)
      *
      * ULTOSC(Records[High,Low,Close],First Period = 7,Second Period = 14,Third Period = 28) = Array(outReal)
      *
      * @param {botvs.Record[]} Records
      * @param {number=7} FirstPeriod
      * @param {number=14} SecondPeriod
      * @param {number=28} ThirdPeriod
      * @return {number[]}
      */
    @JSGlobal("talib.ULTOSC")
    @js.native
    def ULTOSC(Records: js.Array[Record]): js.Array[Double] = js.native
    @JSGlobal("talib.ULTOSC")
    @js.native
    def ULTOSC(
      Records: js.Array[Record],
      FirstPeriod: js.UndefOr[scala.Nothing],
      SecondPeriod: js.UndefOr[scala.Nothing],
      ThirdPeriod: Double
    ): js.Array[Double] = js.native
    @JSGlobal("talib.ULTOSC")
    @js.native
    def ULTOSC(Records: js.Array[Record], FirstPeriod: js.UndefOr[scala.Nothing], SecondPeriod: Double): js.Array[Double] = js.native
    @JSGlobal("talib.ULTOSC")
    @js.native
    def ULTOSC(
      Records: js.Array[Record],
      FirstPeriod: js.UndefOr[scala.Nothing],
      SecondPeriod: Double,
      ThirdPeriod: Double
    ): js.Array[Double] = js.native
    @JSGlobal("talib.ULTOSC")
    @js.native
    def ULTOSC(Records: js.Array[Record], FirstPeriod: Double): js.Array[Double] = js.native
    @JSGlobal("talib.ULTOSC")
    @js.native
    def ULTOSC(
      Records: js.Array[Record],
      FirstPeriod: Double,
      SecondPeriod: js.UndefOr[scala.Nothing],
      ThirdPeriod: Double
    ): js.Array[Double] = js.native
    @JSGlobal("talib.ULTOSC")
    @js.native
    def ULTOSC(Records: js.Array[Record], FirstPeriod: Double, SecondPeriod: Double): js.Array[Double] = js.native
    @JSGlobal("talib.ULTOSC")
    @js.native
    def ULTOSC(Records: js.Array[Record], FirstPeriod: Double, SecondPeriod: Double, ThirdPeriod: Double): js.Array[Double] = js.native
    
    /**
      * Variance (变量定义)
      *
      * VAR(Records[Close],Time Period = 5,Deviations = 1) = Array(outReal)
      *
      * @param {botvs.Record[]|number[]} Records
      * @param {number=5} TimePeriod
      * @param {number=1} Deviations
      * @return {number[]}
      */
    @JSGlobal("talib.VAR")
    @js.native
    def VAR(Records: js.Array[Double | Record]): js.Array[Double] = js.native
    @JSGlobal("talib.VAR")
    @js.native
    def VAR(Records: js.Array[Double | Record], TimePeriod: js.UndefOr[scala.Nothing], Deviations: Double): js.Array[Double] = js.native
    @JSGlobal("talib.VAR")
    @js.native
    def VAR(Records: js.Array[Double | Record], TimePeriod: Double): js.Array[Double] = js.native
    @JSGlobal("talib.VAR")
    @js.native
    def VAR(Records: js.Array[Double | Record], TimePeriod: Double, Deviations: Double): js.Array[Double] = js.native
    
    /**
      * Weighted Close Price (加权收盘价)
      *
      * WCLPRICE(Records[High,Low,Close]) = Array(outReal)
      *
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @return {number[]}
      */
    @JSGlobal("talib.WCLPRICE")
    @js.native
    def WCLPRICE(High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
    /**
      * Weighted Close Price (加权收盘价)
      *
      * WCLPRICE(Records[High,Low,Close]) = Array(outReal)
      *
      * @param {botvs.Record[]} Records
      * @return {number[]}
      */
    @JSGlobal("talib.WCLPRICE")
    @js.native
    def WCLPRICE(Records: js.Array[Record]): js.Array[Double] = js.native
    
    /**
      * Williams' %R (威廉指标)
      *
      * WILLR(Records[High,Low,Close],Time Period = 14) = Array(outReal)
      *
      * @param {number[]} High
      * @param {number[]} Low
      * @param {number[]} Close
      * @param {number=14} TimePeriod
      * @return {number[]}
      */
    @JSGlobal("talib.WILLR")
    @js.native
    def WILLR(High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
    @JSGlobal("talib.WILLR")
    @js.native
    def WILLR(High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double], TimePeriod: Double): js.Array[Double] = js.native
    /**
      * Williams' %R (威廉指标)
      *
      * WILLR(Records[High,Low,Close],Time Period = 14) = Array(outReal)
      *
      * @param {botvs.Record[]} Records
      * @param {number=14} TimePeriod
      * @return {number[]}
      */
    @JSGlobal("talib.WILLR")
    @js.native
    def WILLR(Records: js.Array[Record]): js.Array[Double] = js.native
    @JSGlobal("talib.WILLR")
    @js.native
    def WILLR(Records: js.Array[Record], TimePeriod: Double): js.Array[Double] = js.native
    
    /**
      * Weighted Moving Average (加权移动平均)
      *
      * WMA(Records[Close],Time Period = 30) = Array(outReal)
      *
      * @param {botvs.Record[]|number[]} Records
      * @param {number=30} TimePeriod
      * @return {number[]}
      */
    @JSGlobal("talib.WMA")
    @js.native
    def WMA(Records: js.Array[Double | Record]): js.Array[Double] = js.native
    @JSGlobal("talib.WMA")
    @js.native
    def WMA(Records: js.Array[Double | Record], TimePeriod: Double): js.Array[Double] = js.native
    
    /**
      * 查询指标调用格式
      *
      * Log(talib.help('MACD')); // 在回测环境下调用
      *
      * @param {string} Func
      * @return {string}
      */
    @JSGlobal("talib.help")
    @js.native
    def help(Func: String): String = js.native
  }
  
  object botvs {
    
    /**
      * 账户信息, 由GetAccount函数返回
      */
    @js.native
    trait Account extends StObject {
      
      /**
        * 余额(人民币或者美元, 在Poloniex交易所里BTC_ETC这样的品种, Balance就指的是BTC的数量,
        * Stocks指的是ETC数量, BTC38的ETC_BTC相当于Poloniex的BTC_ETC, 指的是以BTC计价)
        */
      var Balance: Double = js.native
      
      /**
        * 冻结的余额
        */
      var FrozenBalance: Double = js.native
      
      /**
        * 冻结的BTC/LTC数量(传统期货无此属性)
        */
      var FrozenStocks: Double = js.native
      
      /**
        * BTC/LTC数量, 现货为当前可操作币的余额(去掉冻结的币),
        * 期货的话为合约当前可用保证金(传统期货为此属性)
        */
      var Stocks: Double = js.native
    }
    object Account {
      
      @scala.inline
      def apply(Balance: Double, FrozenBalance: Double, FrozenStocks: Double, Stocks: Double): Account = {
        val __obj = js.Dynamic.literal(Balance = Balance.asInstanceOf[js.Any], FrozenBalance = FrozenBalance.asInstanceOf[js.Any], FrozenStocks = FrozenStocks.asInstanceOf[js.Any], Stocks = Stocks.asInstanceOf[js.Any])
        __obj.asInstanceOf[Account]
      }
      
      @scala.inline
      implicit class AccountMutableBuilder[Self <: Account] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBalance(value: Double): Self = StObject.set(x, "Balance", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFrozenBalance(value: Double): Self = StObject.set(x, "FrozenBalance", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFrozenStocks(value: Double): Self = StObject.set(x, "FrozenStocks", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStocks(value: Double): Self = StObject.set(x, "Stocks", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait AsyncJob[T] extends StObject {
      
      def wait(timeout: Double): js.UndefOr[T | Null] = js.native
    }
    
    @js.native
    trait ChartOptions extends Options {
      
      var __isStock: js.UndefOr[Boolean] = js.native
    }
    object ChartOptions {
      
      @scala.inline
      def apply(): ChartOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ChartOptions]
      }
      
      @scala.inline
      implicit class ChartOptionsMutableBuilder[Self <: ChartOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def set__isStock(value: Boolean): Self = StObject.set(x, "__isStock", value.asInstanceOf[js.Any])
        
        @scala.inline
        def set__isStockUndefined: Self = StObject.set(x, "__isStock", js.undefined)
      }
    }
    
    @js.native
    trait Context extends StObject {
      
      def init(): Unit = js.native
      
      def main(): Unit = js.native
    }
    object Context {
      
      @scala.inline
      def apply(init: () => Unit, main: () => Unit): Context = {
        val __obj = js.Dynamic.literal(init = js.Any.fromFunction0(init), main = js.Any.fromFunction0(main))
        __obj.asInstanceOf[Context]
      }
      
      @scala.inline
      implicit class ContextMutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
        
        @scala.inline
        def setMain(value: () => Unit): Self = StObject.set(x, "main", js.Any.fromFunction0(value))
      }
    }
    
    /**
      * 市场深度,由GetDepth函数返回
      */
    @js.native
    trait Depth extends StObject {
      
      /**
        * 卖单数组, MarketOrder数组, 按价格从低向高排序
        */
      var Asks: js.Array[MarketOrder] = js.native
      
      /**
        * 买单数组, MarketOrder数组, 按价格从高向低排序
        */
      var Bids: js.Array[MarketOrder] = js.native
      
      var Time: Double = js.native
    }
    object Depth {
      
      @scala.inline
      def apply(Asks: js.Array[MarketOrder], Bids: js.Array[MarketOrder], Time: Double): Depth = {
        val __obj = js.Dynamic.literal(Asks = Asks.asInstanceOf[js.Any], Bids = Bids.asInstanceOf[js.Any], Time = Time.asInstanceOf[js.Any])
        __obj.asInstanceOf[Depth]
      }
      
      @scala.inline
      implicit class DepthMutableBuilder[Self <: Depth] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAsks(value: js.Array[MarketOrder]): Self = StObject.set(x, "Asks", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAsksVarargs(value: MarketOrder*): Self = StObject.set(x, "Asks", js.Array(value :_*))
        
        @scala.inline
        def setBids(value: js.Array[MarketOrder]): Self = StObject.set(x, "Bids", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBidsVarargs(value: MarketOrder*): Self = StObject.set(x, "Bids", js.Array(value :_*))
        
        @scala.inline
        def setTime(value: Double): Self = StObject.set(x, "Time", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Exchange extends StObject {
      
      /**
        * 下买单, Price为买单价格,Amount为数量, 返回一个订单ID
        *
        * 可以跟多余的参数做为附加消息显示到日志, 如exchange.Buy(1000,0.1, "OK", 123)
        * 支持现货(火币/BitVC/OKCoin/OKCoin国际/OKCoin期货/BTCChina/BitYes)市价单, 市价单价格指定为-1
        * exchange.Buy(1000), 指买市价1000元的币, BTCChina例外exchange.Buy(0.3)指市价买0.3个币
        *
        * @param {number} Price
        * @param {number} Amount
        * @param {*[]} args
        * @return {string} - 订单ID
        */
      def Buy(Price: Double, Amount: Double, args: js.Any*): String = js.native
      
      /**
        * 根据订单号取消一个订单, 返回true或者false
        *
        * @param {string} orderId
        * @return {boolean}
        */
      def CancelOrder(orderId: String): Boolean = js.native
      
      /**
        * 返回一个Account结构, 如exchange.GetAccount(), 将返回主交易所账户信息
        *
        * @return {botvs.Account}
        */
      def GetAccount(): Account = js.native
      
      /**
        * 返回交易所操作的基础货币名称(string), BTC_CNY就返回CNY, ETH_BTC就返回BTC
        *
        * @return {string}
        */
      def GetBaseCurrency(): String = js.native
      
      /**
        * 返回交易所操作的货币名称(string), 传统期货CTP返回的固定为STOCK
        *
        * @return {string}
        */
      def GetCurrency(): String = js.native
      
      /**
        * 返回一个Depth结构
        *
        * @return {botvs.Depth}
        */
      def GetDepth(): Depth = js.native
      
      /**
        * 返回一个Fee结构
        *
        * @return {botvs.Fee}
        */
      def GetFee(): Fee = js.native
      
      /**
        * 返回交易所自定义的标签(string)
        *
        * @return {string}
        */
      def GetLabel(): String = js.native
      
      /**
        * 返回一笔订单要求的最小金额(价格*数量)
        *
        * Bitstamp要求5美元(程序会根据汇率自动转换为人民币), 其它没有限制
        *
        * @return {number}
        */
      def GetMinPrice(): Double = js.native
      
      /**
        * 返回币最小交易数量
        *
        * @return {number}
        */
      def GetMinStock(): Double = js.native
      
      /**
        * 返回交易所名称(string)
        *
        * @return {string}
        */
      def GetName(): String = js.native
      
      /**
        * 根据订单号获取订单详情, 返回一个Order结构
        *
        * @param {string} orderId
        * @return {botvs.Order}
        */
      def GetOrder(orderId: String): Order = js.native
      
      /**
        * 获取所有未完成的订单, 返回一个Order数组结构
        *
        * @return {botvs.Order[]}
        */
      def GetOrders(): js.Array[Order] = js.native
      
      /**
        * 获取当前持仓信息
        *
        * 返回一个Position数组, (BitVC和OKCoin)可以传入一个参数, 指定要获取的合约类型
        *
        * @return {botvs.Position[]}
        */
      def GetPosition(): js.Array[Position] = js.native
      
      /**
        * 返回交易所使用的流通货币与人民币的汇率, 返回1表示禁用汇率转换
        *
        * 汇率接口调用雅虎提供的接口, 5分钟更新一次
        * 所有函数自动经过汇率转换,如果为1指禁用汇率转换
        *
        * @return {number}
        */
      def GetRate(): Double = js.native
      
      /**
        * 返回最后一次REST API请求返回的原始内容(字符串), 用户可以用来自己解析扩展信息
        *
        * 注: 模拟测试的话，会一直返回一个空字符串, 只在真实环境下有效
        * exchange.GetAccount();
        * var obj = JSON.parse(exchange.GetRawJSON());
        *
        * 传统商品期货API获取更多信息
        * exchange.GetAccount();
        * Log(exchange.GetRawJSON());//在GetAccount成功后调用, 获取更详细的账户信息, 可以用JSON.parse解析
        * 也支持GetTicker, GetDepth后的exchange.GetRawJSON(), 以及GetPosition与GetOrders,GetOrder这三个调用后的详细反馈数据
        *
        * @return {string}
        */
      def GetRawJSON(): String = js.native
      
      /**
        * 返回一个K线历史, K线周期在创建机器人时指定, Record数组结构
        *
        * 不加参数, 默认返回添加机器人时时指量的K线周期, 但也可以自定义K线周期
        * 支持: PERIOD_M1 指1分钟, PERIOD_M5 指5分钟, PERIOD_M15 指15分钟,
        * PERIOD_M30 指30分钟, PERIOD_H1 指1小时, PERIOD_D1 指一天
        *
        * @param {number} Period
        * @return {botvs.Record[]}
        */
      def GetRecords(): js.Array[Record] = js.native
      def GetRecords(Period: VPeriod): js.Array[Record] = js.native
      
      /**
        * 返回一个Ticker结构
        *
        * @return {botvs.Ticker}
        */
      def GetTicker(): Ticker = js.native
      
      /**
        * 返回一个Trade数组, 按时间从低到高的顺序, 只支持数字货币(BTC/LTC)
        *
        * @return {botvs.Trade[]}
        */
      def GetTrades(): js.Array[Trade] = js.native
      
      /**
        * 返回交易所使用的美元的汇率, OKCoin期货返回官方提供的汇率, 该值不受SetRate影响
        *
        * @return {number}
        */
      def GetUSDCNY(): Double = js.native
      
      /**
        * 多线程异步支持函数, 可以把所有支持的函数的操作变成异步并发的.(只支持数字货币交易平台)
        *
        * Support: GetTicker, GetDepth, GetTrades, GetRecords, GetAccount, GetOrders, GetOrder, CancelOrder, Buy,
        * Sell, GetPosition var a = exchange.Go("GetTicker"); // GetTicker 异步多线程执行 var b =
        * exchange.Go("GetDepth"); var c = exchange.Go("Buy", 1000, 0.1); var d = exchange.Go("GetRecords",
        * PERIOD_H1);
        *
        * // 上面四种操作是并发多线程异步执行, 不会耗时, 立即返回的
        *
        * var ticker = a.wait(); // 调用wait方法等待返回异步获取ticker结果
        * var depth = b.wait(); // 返回深度, 如果获取失败也是有可能返回null的
        * var orderId = c.wait(1000); // 返回订单号, 限定1秒超时, 超时返回undefined, 此对像可以继续调用wait等待如果上次wait超时
        * // 注意: 判断undefiend要用typeof(xx) === "undefined", 因为null==undefined在JavaScript里是成立的
        *
        * var records = d.wait(); // 等待K线结果
        * var ret = d.wait(); // 这里wait了一个已经wait过且结束的异步操作, 会返回null, 并记录出错信息.
        * // Python与Javascript的区别, Python的wait返回两个参数, 第一个是异步的api返回的结果, 第二个表示是异步调用是否完成
        * ret, ok = d.wait() // ok是一定返回True的, 除非策略被停止
        * ret, ok = d.wait(100) // ok返回False, 如果等待超时, 或者wait了一个已经结束的实例
        *
        * @param {keyof botvs.Exchange} Method
        * @param Args
        * @return {botvs.AsyncJob<T>}
        */
      def Go[T](
        Method: /* keyof botvs.botvs.<global>.botvs.Exchange */ GetName | GetLabel | GetUSDCNY | GetRate | SetRate | SetPrecision | GetCurrency | GetBaseCurrency | GetTicker | GetDepth | GetTrades | GetRecords | GetAccount | Buy | Sell | GetOrders | GetOrder | CancelOrder | Log | GetMinStock | GetMinPrice | GetFee | GetRawJSON | typings.botvs.botvsStrings.Go | IO | GetPosition | SetMarginLevel | SetDirection | SetContractType,
        Args: js.Any*
      ): AsyncJob[T] = js.native
      
      def IO[T](Api: String): T = js.native
      def IO[T](Api: String, ApiName: js.UndefOr[scala.Nothing], Args: String): T = js.native
      def IO[T](Api: String, ApiName: String): T = js.native
      def IO[T](Api: String, ApiName: String, Args: String): T = js.native
      /**
        * 调用交易所其它功能接口
        *
        * 支持所有数字货币交易所
        * exchange.IO("api", "cancel_borrow", "symbol=cny&borrow_id=123"); // no need api & sign
        * Detail: {@link https://www.botvs.com/bbs-topic/146}
        *
        * // 只支持Websocket模式(huobi, okcoin.cn, BTCC支持)与商品期货CTP协议
        *
        * exchange.IO("websocket"); // 切换行情通信协议到websocket(默认为rest), Ticker,
        * Depth会切换为websocket协议来更新, 商品期货CTP无需切换
        *
        *
        * // 切换GetTicker, GetDepth数据更新模式
        *
        * exchange.IO("mode", 0); // 立即返回模式, 如果当前还没有接收到交易所最新的行情数据推送, 就立即返回旧的行情数据,
        * 如果有新的数据就返回新的数据
        *
        * exchange.IO("mode", 1); // 缓存模式(默认模式),
        * 如果当前还没有收到交易所最新的行情数据(同上一次api获取的数据比较), 就等待接收然后再返回, 如果调用该函数之前收到了最新的行情数据,
        * 就立即返回最新的数据
        *
        * exchange.IO("mode", 2); // 强制更新模式, 进入等待一直到接收到交易所下一次的最新推送数据后返回
        *
        *
        *
        * // 如果想第一时间获取最新的行情可以切换到websocket后不Sleep的立即检测数据, GetTicker, GetDepth用缓存模式进行工作
        *
        * exchange.IO("websocket");
        *
        * while (true) {
        * Log(exchange.GetTicker());
        * }
        *
        * 传统商品期货扩展的IO功能
        * exchange.IO("status"); // 返回true证明与CTP服务器行情与数据的两台服务器都连接正常
        * exchange.IO("instruments"); // 返回交易所所有的合约列表{合约名: 详情}字典形式, 只支持实盘
        * exchange.IO("products"); // 返回交易所所有的产品列表{产品名: 详情}字典形式, 只支持实盘
        * exchange.IO("subscribed"); // 返回已订阅行情的合约, 格式同上, 只支持实盘
        * exchange.IO("settlement"); // 结算单查询, 不加第二个参数默认返回之前一个交易日的,
        * 加参数如"20170317"指返回20170317的结算单, 只支持实盘
        * exchange.IO("wait"); // 有任何品种更新行情信息时才返回, 可带第二个参数(毫秒数)指定超时,
        * 超时返回-1, 正常返回事件接收的时间(nano级), 只支持实盘
        * exchange.IO("wait_instrument"); // 有任何品种更新行情信息时才返回, 可带第二个参数(毫秒数)
        * 指定超时, 超时返回空字符串, 正常返回触发事件的品种名称, 只支持实盘
        *
        * @param {"api" | "usd" | "cny" | "currency" | string} Api
        * @param {string} ApiName
        * @param {string} Args
        * @return {T}
        */
      @JSName("IO")
      def IO_api[T](Api: api): T = js.native
      @JSName("IO")
      def IO_api[T](Api: api, ApiName: js.UndefOr[scala.Nothing], Args: String): T = js.native
      @JSName("IO")
      def IO_api[T](Api: api, ApiName: String): T = js.native
      @JSName("IO")
      def IO_api[T](Api: api, ApiName: String, Args: String): T = js.native
      @JSName("IO")
      def IO_cny[T](Api: cny): T = js.native
      @JSName("IO")
      def IO_cny[T](Api: cny, ApiName: js.UndefOr[scala.Nothing], Args: String): T = js.native
      @JSName("IO")
      def IO_cny[T](Api: cny, ApiName: String): T = js.native
      @JSName("IO")
      def IO_cny[T](Api: cny, ApiName: String, Args: String): T = js.native
      @JSName("IO")
      def IO_currency[T](Api: currency): T = js.native
      @JSName("IO")
      def IO_currency[T](Api: currency, ApiName: js.UndefOr[scala.Nothing], Args: String): T = js.native
      @JSName("IO")
      def IO_currency[T](Api: currency, ApiName: String): T = js.native
      @JSName("IO")
      def IO_currency[T](Api: currency, ApiName: String, Args: String): T = js.native
      @JSName("IO")
      def IO_usd[T](Api: usd): T = js.native
      @JSName("IO")
      def IO_usd[T](Api: usd, ApiName: js.UndefOr[scala.Nothing], Args: String): T = js.native
      @JSName("IO")
      def IO_usd[T](Api: usd, ApiName: String): T = js.native
      @JSName("IO")
      def IO_usd[T](Api: usd, ApiName: String, Args: String): T = js.native
      
      /**
        * 不下单, 只记录交易信息, logType可为LOG_TYPE_BUY/LOG_TYPE_SELL/LOG_TYPE_CANCEL
        *
        * @param {VLogType} logType
        * @param {string} orderId
        * @param {number} price
        * @param {number} amount
        */
      def Log(logType: VLogType, orderId: String, price: Double, amount: Double): Unit = js.native
      
      /**
        * 跟Buy函数一样的调用方法和场景 {@see Exchange#Buy}
        *
        * @param {number} Price
        * @param {number} Amount
        * @return {string}
        */
      def Sell(Price: Double, Amount: Double): String = js.native
      
      /**
        * 设置合约类型
        *
        * 传统的CTP期货的ContractType就是指的合约ID,  如SetContractType("au1506") 返回合约的详细信息, 如最少一次买多少, 手续费,
        * 交割时间等,
        * 主力连续合约为代码为000如MA000, 只支持回测, 不支持实盘 股票合约格式为 股票代码.(SH/SZ), SH指上交所, SZ指深交所,
        * 如000001.SZ就是指深交所的平安银行 商品期货与股票取消订阅合约,
        * 在合约名前加上"-"前缀重新调用即可, 如SetContractType("-au1506"); 成功返回true 数字货币796支持: "week", "weekcny",
        * 默认为子账户A, 要指定子账户是A还是B,
        * 在合约后加"@A"或"@B", 如: "day@A" 为日合约A子账户 BitVC有week和quarter和next_week三个可选参数, OKCoin期货有this_week,
        * next_week, quarter三个参数 exchange.SetContractType("week");
        *
        * @param {string} ContractType
        */
      def SetContractType(ContractType: String): Unit = js.native
      
      /**
        * 设置Buy或者Sell下单类型
        *
        * Direction可以取buy, closebuy, sell, closesell四个参数, 传统期货多出closebuy_today,与closesell_today, 指平今仓,
        * 默认为closebuy/closesell为平咋仓 对于CTP传统期货, 可以设置第二个参数"1"或者"2"或者"3", 分别指"投机", "套利", "套保",
        * 不设置默认为投机 股票只支持buy与closebuy,
        * 因为股票只能买跟平仓 exchange.SetMarginLevel(5); exchange.SetDirection("buy"); exchange.Buy(1000, 2);
        * exchange.SetMarginLevel(5); exchange.SetDirection("closebuy"); exchange.Sell(1000, 2);
        *
        * 期货交易中Buy, Sell, CancelOrder和现货交易的区别
        * Buy或Sell之前需要调用SetMarginLevel和SetDirection明确操作类型
        * 数字货币796的CancelOrder之前需要调用SetDirection明确订单类型
        * 如:
        * exchange.SetDirection("sell");
        * exchange.Sell(1000, 2);
        * 如:
        * exchange.SetDirection("buy");
        * exchange.CancelOrder(123);
        *
        * 数字货币BitVC期货交易中Buy, Sell, GetOrder, SetMarginLevel与796的区别
        * GetOrder里面的Amount为订单总金额, DealAmount为订单完成的金额, 不是币的个数
        * 数字货币796的CancelOrder之前需要调用SetDirection明确订单类型
        * Buy或Sell第二个参数不是币的数量而是订单的总金额(100的倍数)
        * SetMarginLevel LTC不支持20倍杠杆
        * 如:
        * exchange.SetContractType("week"); exchange.SetDirection("sell");
        * exchange.Sell(1000, 100), 就是以1000元一个币的价格开100元的空头
        *
        * 数字货币OKCoin期货交易中Buy, Sell, GetOrder, SetMarginLevel与796的区别
        * GetOrder里面的Amount为合约数(一份合约为10$), DealAmount为订单完成的合约数, 不是币的个数
        * Buy或Sell第二个参数不是币的数量而是合约的份数(整数且大于0)
        * SetMarginLevel 只支持10倍和20倍的杠杆
        * 如: 以1000元一个币的价格做空一份合约(10$的LTC或者100$的BTC):
        * exchange.SetContractType("this_week");
        * exchange.SetDirection("sell");
        * exchange.Sell(1000, 1);
        *
        * @param {"buy" | "closebuy" | "sell" | "closesell" | "closebuy_today" | "closesell_today"} Direction
        * @constructor
        */
      @JSName("SetDirection")
      def SetDirection_buy(Direction: buy_): Unit = js.native
      @JSName("SetDirection")
      def SetDirection_closebuy(Direction: closebuy): Unit = js.native
      @JSName("SetDirection")
      def SetDirection_closebuytoday(Direction: closebuy_today): Unit = js.native
      @JSName("SetDirection")
      def SetDirection_closesell(Direction: closesell): Unit = js.native
      @JSName("SetDirection")
      def SetDirection_closeselltoday(Direction: closesell_today): Unit = js.native
      @JSName("SetDirection")
      def SetDirection_sell(Direction: sell_): Unit = js.native
      
      /**
        * 设置杆杠大小
        *
        * 设置Buy(多单)或者Sell(空单)的杆杠大小, MarginLevel有5, 10, 20 三个可选参数
        * 796支持5,10,20,50三个选项, BitVC的LTC不支持20倍杠杆, OKCoin支持10倍和20倍
        * 如: exchange.SetMarginLevel(5)
        *
        * @param {number} MarginLevel
        */
      def SetMarginLevel(MarginLevel: Double): Unit = js.native
      
      /**
        * 设置价格与品种下单量的小数位精度, 设置后会自动截断
        *
        * exchange.SetPrecision(2, 3); // 设置价格小数位精度为2位, 品种下单量小数位精度为3位
        *
        * @param {number} PricePrecision
        * @param {number} AmountPrecision
        */
      def SetPrecision(PricePrecision: Double, AmountPrecision: Double): Unit = js.native
      
      /**
        * 设置交易所的流通货币的汇率, 返回设置前的汇率, 设置为1指禁用汇率转换
        *
        * 比如796期货设置SetRate(6.13), 就是设定USD/EUR对CNY的汇率为6.13, 程序所有价格会自动用这个汇率计算
        * SetRate(), 如果不加参数，则恢复系统内置汇率
        * SetRate(1), 就是禁用汇率转换
        *
        * @param {number} rate
        */
      def SetRate(): Unit = js.native
      def SetRate(rate: Double): Unit = js.native
    }
    
    /**
      * 手续费结构, 由GetFee函数返回(如国外平台bitfinex买入卖出手续费跟账户交易量相关)
      */
    @js.native
    trait Fee extends StObject {
      
      /**
        * 买入手续费, 格式同上
        */
      var Buy: Double = js.native
      
      /**
        * 卖出手续费, 为一个浮点数, 如0.2表示0.2%的手续费
        */
      var Sell: Double = js.native
    }
    object Fee {
      
      @scala.inline
      def apply(Buy: Double, Sell: Double): Fee = {
        val __obj = js.Dynamic.literal(Buy = Buy.asInstanceOf[js.Any], Sell = Sell.asInstanceOf[js.Any])
        __obj.asInstanceOf[Fee]
      }
      
      @scala.inline
      implicit class FeeMutableBuilder[Self <: Fee] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBuy(value: Double): Self = StObject.set(x, "Buy", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSell(value: Double): Self = StObject.set(x, "Sell", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * 市场深度单
      */
    @js.native
    trait MarketOrder extends StObject {
      
      /**
        * 数量
        */
      var Amount: Double = js.native
      
      /**
        * 价格
        */
      var Price: Double = js.native
    }
    object MarketOrder {
      
      @scala.inline
      def apply(Amount: Double, Price: Double): MarketOrder = {
        val __obj = js.Dynamic.literal(Amount = Amount.asInstanceOf[js.Any], Price = Price.asInstanceOf[js.Any])
        __obj.asInstanceOf[MarketOrder]
      }
      
      @scala.inline
      implicit class MarketOrderMutableBuilder[Self <: MarketOrder] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAmount(value: Double): Self = StObject.set(x, "Amount", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrice(value: Double): Self = StObject.set(x, "Price", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * 订单结构, 由GetOrder函数返回
      */
    @js.native
    trait Order extends StObject {
      
      /**
        * 下单数量
        */
      var Amount: Double = js.native
      
      /**
        * 成交数量
        */
      var DealAmount: Double = js.native
      
      /**
        * 交易单唯一标识
        */
      var Id: String = js.native
      
      /**
        * 下单价格
        */
      var Price: Double = js.native
      
      /**
        * 订单状态, 参考常量里的订单状态
        */
      var Status: VOrderState = js.native
      
      var Time: Double = js.native
      
      /**
        * 订单类型, 参考常量里的订单类型
        */
      var Type: VOrderType = js.native
    }
    object Order {
      
      @scala.inline
      def apply(
        Amount: Double,
        DealAmount: Double,
        Id: String,
        Price: Double,
        Status: VOrderState,
        Time: Double,
        Type: VOrderType
      ): Order = {
        val __obj = js.Dynamic.literal(Amount = Amount.asInstanceOf[js.Any], DealAmount = DealAmount.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Price = Price.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Time = Time.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
        __obj.asInstanceOf[Order]
      }
      
      @scala.inline
      implicit class OrderMutableBuilder[Self <: Order] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAmount(value: Double): Self = StObject.set(x, "Amount", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDealAmount(value: Double): Self = StObject.set(x, "DealAmount", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrice(value: Double): Self = StObject.set(x, "Price", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStatus(value: VOrderState): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTime(value: Double): Self = StObject.set(x, "Time", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setType(value: VOrderType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * 期货交易中的持有仓位信息, 由GetPosition()函数返回此结构数组
      */
    @js.native
    trait Position extends StObject {
      
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
      implicit class PositionMutableBuilder[Self <: Position] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAmount(value: Double): Self = StObject.set(x, "Amount", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCanCover(value: Double): Self = StObject.set(x, "CanCover", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContractType(value: String): Self = StObject.set(x, "ContractType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFrozenAmount(value: Double): Self = StObject.set(x, "FrozenAmount", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMarginLevel(value: Double): Self = StObject.set(x, "MarginLevel", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrice(value: Double): Self = StObject.set(x, "Price", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProfit(value: Double): Self = StObject.set(x, "Profit", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setType(value: VPositionType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait RChart extends StObject {
      
      def add(): Unit = js.native
      def add(series: js.UndefOr[scala.Nothing], data: js.UndefOr[scala.Nothing], index: Double): Unit = js.native
      def add(series: js.UndefOr[scala.Nothing], data: js.Any): Unit = js.native
      def add(series: js.UndefOr[scala.Nothing], data: js.Any, index: Double): Unit = js.native
      def add(series: Double): Unit = js.native
      def add(series: Double, data: js.UndefOr[scala.Nothing], index: Double): Unit = js.native
      def add(series: Double, data: js.Any): Unit = js.native
      def add(series: Double, data: js.Any, index: Double): Unit = js.native
      
      def reset(): Unit = js.native
      
      def update(config: ChartOptions): Unit = js.native
    }
    
    /**
      * 标准OHLC结构, 用来画K线和指标分析用的，由GetRecords函数返回此结构数组
      */
    @js.native
    trait Record extends StObject {
      
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
      implicit class RecordMutableBuilder[Self <: Record] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setClose(value: Double): Self = StObject.set(x, "Close", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHigh(value: Double): Self = StObject.set(x, "High", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLow(value: Double): Self = StObject.set(x, "Low", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOpen(value: Double): Self = StObject.set(x, "Open", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTime(value: Double): Self = StObject.set(x, "Time", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVolume(value: Double): Self = StObject.set(x, "Volume", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Socket extends StObject {
      
      def close(): Unit = js.native
      
      def read(): String | Null = js.native
      def read(size: Double): String | Null = js.native
      
      def write(data: String): Double = js.native
      def write(data: String, timeout: Double): Double = js.native
    }
    
    /**
      * 市场行情
      */
    @js.native
    trait Ticker extends StObject {
      
      /**
        * 买一价
        */
      var Buy: Double = js.native
      
      /**
        * 最高价
        */
      var High: Double = js.native
      
      /**
        * 最后成交价
        */
      var Last: Double = js.native
      
      /**
        * 最低价
        */
      var Low: Double = js.native
      
      /**
        * 卖一价
        */
      var Sell: Double = js.native
      
      var Time: Double = js.native
      
      /**
        * 最近成交量
        */
      var Volume: Double = js.native
    }
    object Ticker {
      
      @scala.inline
      def apply(Buy: Double, High: Double, Last: Double, Low: Double, Sell: Double, Time: Double, Volume: Double): Ticker = {
        val __obj = js.Dynamic.literal(Buy = Buy.asInstanceOf[js.Any], High = High.asInstanceOf[js.Any], Last = Last.asInstanceOf[js.Any], Low = Low.asInstanceOf[js.Any], Sell = Sell.asInstanceOf[js.Any], Time = Time.asInstanceOf[js.Any], Volume = Volume.asInstanceOf[js.Any])
        __obj.asInstanceOf[Ticker]
      }
      
      @scala.inline
      implicit class TickerMutableBuilder[Self <: Ticker] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBuy(value: Double): Self = StObject.set(x, "Buy", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHigh(value: Double): Self = StObject.set(x, "High", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLast(value: Double): Self = StObject.set(x, "Last", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLow(value: Double): Self = StObject.set(x, "Low", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSell(value: Double): Self = StObject.set(x, "Sell", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTime(value: Double): Self = StObject.set(x, "Time", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVolume(value: Double): Self = StObject.set(x, "Volume", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * 获取所有交易历史(非自己),由GetTrades函数返回
      */
    @js.native
    trait Trade extends StObject {
      
      /**
        * 数量
        */
      var Amount: Double = js.native
      
      /**
        * Id(交易所返回的此Trade的唯一Id)
        */
      var Id: String = js.native
      
      /**
        * 价格
        */
      var Price: Double = js.native
      
      /**
        * 时间(Unix timestamp 毫秒)
        */
      var Time: Double = js.native
      
      /**
        * 订单类型, 参考常量里的订单类型
        */
      var Type: VOrderType = js.native
    }
    object Trade {
      
      @scala.inline
      def apply(Amount: Double, Id: String, Price: Double, Time: Double, Type: VOrderType): Trade = {
        val __obj = js.Dynamic.literal(Amount = Amount.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Price = Price.asInstanceOf[js.Any], Time = Time.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
        __obj.asInstanceOf[Trade]
      }
      
      @scala.inline
      implicit class TradeMutableBuilder[Self <: Trade] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAmount(value: Double): Self = StObject.set(x, "Amount", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrice(value: Double): Self = StObject.set(x, "Price", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTime(value: Double): Self = StObject.set(x, "Time", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setType(value: VOrderType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * 日志类型
      */
    type VLogType = js.Object
    
    /**
      * 订单的状态
      */
    type VOrderState = js.Object
    
    /**
      * 订单的类型
      */
    type VOrderType = js.Object
    
    /**
      * K线周期
      */
    type VPeriod = js.Object
    
    /**
      * 仓位的类型
      */
    type VPositionType = js.Object
  }
}
