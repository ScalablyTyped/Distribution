package typings.botvs.mod.global.botvs

import typings.botvs.botvsStrings.Buy
import typings.botvs.botvsStrings.CancelOrder
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
import typings.botvs.botvsStrings.IO
import typings.botvs.botvsStrings.Log
import typings.botvs.botvsStrings.Sell
import typings.botvs.botvsStrings.SetContractType
import typings.botvs.botvsStrings.SetDirection
import typings.botvs.botvsStrings.SetMarginLevel
import typings.botvs.botvsStrings.SetPrecision
import typings.botvs.botvsStrings.SetRate
import typings.botvs.botvsStrings.api
import typings.botvs.botvsStrings.buy_
import typings.botvs.botvsStrings.closebuy
import typings.botvs.botvsStrings.closebuy_today
import typings.botvs.botvsStrings.closesell
import typings.botvs.botvsStrings.closesell_today
import typings.botvs.botvsStrings.cny
import typings.botvs.botvsStrings.currency
import typings.botvs.botvsStrings.sell_
import typings.botvs.botvsStrings.usd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Exchange extends js.Object {
  
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
