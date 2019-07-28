package typings.botvs.botvsMod.Global

import typings.botvs.Anon_Body
import typings.botvs.Anon_Data
import typings.botvs.botvsMod.Global.botvsNs.ChartOptions
import typings.botvs.botvsMod.Global.botvsNs.Exchange
import typings.botvs.botvsMod.Global.botvsNs.RChart
import typings.botvs.botvsMod.Global.botvsNs.Socket
import typings.botvs.botvsMod.Global.botvsNs.VLogType
import typings.botvs.botvsMod.Global.botvsNs.VOrderState
import typings.botvs.botvsMod.Global.botvsNs.VOrderType
import typings.botvs.botvsMod.Global.botvsNs.VPeriod
import typings.botvs.botvsMod.Global.botvsNs.VPositionType
import typings.botvs.botvsNumbers.`true`
import typings.botvs.botvsStrings.base64
import typings.botvs.botvsStrings.hex
import typings.botvs.botvsStrings.md5
import typings.botvs.botvsStrings.raw
import typings.botvs.botvsStrings.sha1
import typings.botvs.botvsStrings.sha256
import typings.botvs.botvsStrings.sha512
import typings.lodash.lodashMod.LoDashStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object ^ extends js.Object {
  /**
    * 买单日志
    */
  val LOG_TYPE_BUY: VLogType = js.native
  /**
    * 取消日志
    */
  val LOG_TYPE_CANCEL: VLogType = js.native
  /**
    * 卖单日志
    */
  val LOG_TYPE_SELL: VLogType = js.native
  /**
    * 订单的状态: 已取消
    */
  val ORDER_STATE_CANCELED: VOrderState = js.native
  /**
    * 订单的状态: 已关闭
    */
  val ORDER_STATE_CLOSED: VOrderState = js.native
  /**
    * 订单的状态: 未完成
    */
  val ORDER_STATE_PENDING: VOrderState = js.native
  /**
    * 订单的类型: 买单
    */
  val ORDER_TYPE_BUY: VOrderType = js.native
  /**
    * 订单的类型: 卖单
    */
  val ORDER_TYPE_SELL: VOrderType = js.native
  /**
    * 多头仓位(CTP中用closebuy_today平仓)
    */
  val PD_LONG: VPositionType = js.native
  /**
    * (CTP期货中)PD_LONG_YD为咋日多头仓位(用closebuy平
    */
  val PD_LONG_YD: VPositionType = js.native
  /**
    * 空头仓位(CTP用closesell_today)平仓
    */
  val PD_SHORT: VPositionType = js.native
  /**
    * 咋日空头仓位(用closesell平)
    */
  val PD_SHORT_YD: VPositionType = js.native
  /**
    * 1天
    */
  val PERIOD_D1: VPeriod = js.native
  /**
    * 1小时
    */
  val PERIOD_H1: VPeriod = js.native
  /**
    * 1分钟
    */
  val PERIOD_M1: VPeriod = js.native
  /**
    * 15分钟
    */
  val PERIOD_M15: VPeriod = js.native
  /**
    * 30分钟
    */
  val PERIOD_M30: VPeriod = js.native
  /**
    * 5分钟
    */
  val PERIOD_M5: VPeriod = js.native
  val `_`: LoDashStatic = js.native
  /**
    * 默认主交易所对像, 添加交易平台时排列第一的交易所
    */
  val exchange: Exchange = js.native
  /**
    * 交易所数组, 如果添加多个交易所, 可以访问此变量获取交易所对像
    */
  val exchanges: js.Array[Exchange] = js.native
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
  def Dial(Address: String): Socket | Unit = js.native
  def Dial(Address: String, Timeout: Double): Socket | Unit = js.native
  /**
    * 打开或者关闭定单和出错信息的日志记录
    *
    * @param {boolean} IsEnable
    */
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
  def GetCommand(): String | Null = js.native
  /**
    * 获取最近一次出错信息,一般无需使用,因为程序会把出错信息自动上传到日志系统
    *
    * @return {string}
    */
  def GetLastError(): String = js.native
  /**
    * 返回机器人进程ID
    *
    * @return {number}
    */
  def GetPid(): Double = js.native
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
  def HMAC(Algo: md5, OutputAlgo: hex, Data: String, password: String): String = js.native
  def HMAC(Algo: md5, OutputAlgo: raw, Data: String, password: String): String = js.native
  def HMAC(Algo: sha1, OutputAlgo: base64, Data: String, password: String): String = js.native
  def HMAC(Algo: sha1, OutputAlgo: hex, Data: String, password: String): String = js.native
  def HMAC(Algo: sha1, OutputAlgo: raw, Data: String, password: String): String = js.native
  def HMAC(Algo: sha256, OutputAlgo: base64, Data: String, password: String): String = js.native
  def HMAC(Algo: sha256, OutputAlgo: hex, Data: String, password: String): String = js.native
  def HMAC(Algo: sha256, OutputAlgo: raw, Data: String, password: String): String = js.native
  def HMAC(Algo: sha512, OutputAlgo: base64, Data: String, password: String): String = js.native
  def HMAC(Algo: sha512, OutputAlgo: hex, Data: String, password: String): String = js.native
  def HMAC(Algo: sha512, OutputAlgo: raw, Data: String, password: String): String = js.native
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
  def Hash(Algo: md5, OutputAlgo: hex, Data: String): String = js.native
  def Hash(Algo: md5, OutputAlgo: raw, Data: String): String = js.native
  def Hash(Algo: sha1, OutputAlgo: base64, Data: String): String = js.native
  def Hash(Algo: sha1, OutputAlgo: hex, Data: String): String = js.native
  def Hash(Algo: sha1, OutputAlgo: raw, Data: String): String = js.native
  def Hash(Algo: sha256, OutputAlgo: base64, Data: String): String = js.native
  def Hash(Algo: sha256, OutputAlgo: hex, Data: String): String = js.native
  def Hash(Algo: sha256, OutputAlgo: raw, Data: String): String = js.native
  def Hash(Algo: sha512, OutputAlgo: base64, Data: String): String = js.native
  def Hash(Algo: sha512, OutputAlgo: hex, Data: String): String = js.native
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
  def HttpQuery(Url: String, PostData: String, Cookies: String, Headers: String): String = js.native
  def HttpQuery(Url: String, PostData: Null, Cookies: String, Headers: String): String = js.native
  def HttpQuery(Url: String, PostData: Anon_Data, Cookies: String, Headers: String): String = js.native
  @JSName("HttpQuery")
  def HttpQuery_true(Url: String, PostData: String, Cookies: String, Headers: String, IsReturnHeader: `true`): Anon_Body = js.native
  @JSName("HttpQuery")
  def HttpQuery_true(Url: String, PostData: Null, Cookies: String, Headers: String, IsReturnHeader: `true`): Anon_Body = js.native
  @JSName("HttpQuery")
  def HttpQuery_true(Url: String, PostData: Anon_Data, Cookies: String, Headers: String, IsReturnHeader: `true`): Anon_Body = js.native
  /**
    * 判断是否是模拟回测
    *
    * 模拟回测状态返回true,实盘返回false
    *
    * @return {boolean}
    */
  def IsVirtual(): Boolean = js.native
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
  def Log(arg: js.Any*): Unit = js.native
  /**
    * 记录盈利值,这个为总盈利的值,参数类型为浮点数
    *
    * @param {number} Profit
    * @param {*[]} args
    */
  def LogProfit(Profit: Double, args: js.Any*): Unit = js.native
  /**
    * 清空所有收益日志, 可以带一个数字参数, 指定保留的条数
    *
    * @param {number} reserve
    */
  def LogProfitReset(): Unit = js.native
  def LogProfitReset(reserve: Double): Unit = js.native
  /**
    * 清空所有日志, 可以带一个数字参数, 指定保留的条数
    *
    * @param {number} reserve
    */
  def LogReset(): Unit = js.native
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
  def Mail(
    smtpServer: String,
    smtpUsername: String,
    smtpPassword: String,
    mailTo: String,
    title: String,
    body: String
  ): Boolean = js.native
  /**
    * 错误信息过滤
    *
    * 被此正则表达式匹配的错误将不上传到日志系统, 可多次调用设置多个
    * SetErrorFilter("502:|503:|tcp|character|unexpected|network|timeout|WSARecv|Connect|GetAddr|no
    * such|reset|http|received|EOF|reused");
    *
    * @param {string} RegEx
    */
  def SetErrorFilter(RegEx: String): Unit = js.native
  /**
    * 休眠函数
    *
    * 参数为毫秒数,如Sleep(1000)为休眠一秒
    *
    * @param {number} Millisecond
    */
  def Sleep(Millisecond: Double): Unit = js.native
  /**
    * 重试函数, 会一直调用指定函数到成功返回(函数返回null或者false会重试),
    * 比如_C(exchange.GetTicker), 默认重试间隔为3秒, 可以调用_CDelay函数来控制重试间隔
    * 比如_CDelay(1000), 指改变_C函数重试间隔为1秒
    *
    * @param {(...args: any[]) => T} func
    * @param args
    * @return {T}
    */
  def _C[T](func: js.Function1[/* repeated */ js.Any, T], args: js.Any*): T = js.native
  /**
    * 比如_CDelay(1000), 指改变_C函数重试间隔为1秒, 默认为3秒
    *
    * @param {number} delay
    */
  def _CDelay(delay: Double): Unit = js.native
  /**
    * 返回指定时间戳(ms)字符串, 不传任何参数就返回当前时间,
    * 如_D(),或者_D(1478570053241), 默认格式为yyyy-MM-dd hh:mm:ss
    *
    * @param {string} timestamp
    * @param {string} format
    * @return {string}
    */
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
  def _G[T](K: String, V: T): Unit = js.native
  /**
    * 格式化一个浮点函数
    *
    * @param {number} num
    * @param {number=4} precision
    * @return {string}
    */
  def _N(num: Double): String = js.native
  def _N(num: Double, precision: Double): String = js.native
}

