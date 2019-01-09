package typings
package botvsLib.botvsMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TA")
@js.native
object TANs extends js.Object {
  /**
    * 平均真实波幅
    *
    * ATR(数据, 周期), 默认参数为14, 返回一个一维数组
    *
    * @param {botvs.Record[]} Records
    * @param {number} Period
    * @return {number[]}
    */
  def ATR(Records: js.Array[botvsLib.botvsMod.Global.botvsNs.Record]): js.Array[scala.Double] = js.native
  def ATR(Records: js.Array[botvsLib.botvsMod.Global.botvsNs.Record], Period: scala.Double): js.Array[scala.Double] = js.native
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
  def Alligator(Records: js.Array[botvsLib.botvsMod.Global.botvsNs.Record]): js.Tuple3[js.Array[scala.Double], js.Array[scala.Double], js.Array[scala.Double]] = js.native
  def Alligator(Records: js.Array[botvsLib.botvsMod.Global.botvsNs.Record], JawPeriod: scala.Double): js.Tuple3[js.Array[scala.Double], js.Array[scala.Double], js.Array[scala.Double]] = js.native
  def Alligator(
    Records: js.Array[botvsLib.botvsMod.Global.botvsNs.Record],
    JawPeriod: scala.Double,
    TeethPeriod: scala.Double
  ): js.Tuple3[js.Array[scala.Double], js.Array[scala.Double], js.Array[scala.Double]] = js.native
  def Alligator(
    Records: js.Array[botvsLib.botvsMod.Global.botvsNs.Record],
    JawPeriod: scala.Double,
    TeethPeriod: scala.Double,
    LibsPeriod: scala.Double
  ): js.Tuple3[js.Array[scala.Double], js.Array[scala.Double], js.Array[scala.Double]] = js.native
  /**
    * Chaikin Money Flow
    *
    * CMF(数据, 周期), 默认周期参数为20, 返回一个一维数组
    *
    * @param {botvs.Record[]} Records
    * @param {number} Period
    * @return {number[]}
    */
  def CMF(Records: js.Array[botvsLib.botvsMod.Global.botvsNs.Record]): js.Array[scala.Double] = js.native
  def CMF(Records: js.Array[botvsLib.botvsMod.Global.botvsNs.Record], Period: scala.Double): js.Array[scala.Double] = js.native
  /**
    * 指数平均数指标
    * EMA(数据, 周期), 默认参数为9, 返回一个一维数组
    *
    * @param {botvs.Record[]} Records
    * @param {number} Period
    * @return {number[]}
    */
  def EMA(Records: js.Array[botvsLib.botvsMod.Global.botvsNs.Record]): js.Array[scala.Double] = js.native
  def EMA(Records: js.Array[botvsLib.botvsMod.Global.botvsNs.Record], Period: scala.Double): js.Array[scala.Double] = js.native
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
  def Highest(Records: js.Array[botvsLib.botvsMod.Global.botvsNs.Record]): scala.Double = js.native
  def Highest(Records: js.Array[botvsLib.botvsMod.Global.botvsNs.Record], Period: scala.Double): scala.Double = js.native
  @JSName("Highest")
  def Highest_Close(
    Records: js.Array[botvsLib.botvsMod.Global.botvsNs.Record],
    Period: scala.Double,
    Property: botvsLib.botvsLibStrings.Close
  ): scala.Double = js.native
  @JSName("Highest")
  def Highest_High(
    Records: js.Array[botvsLib.botvsMod.Global.botvsNs.Record],
    Period: scala.Double,
    Property: botvsLib.botvsLibStrings.High
  ): scala.Double = js.native
  @JSName("Highest")
  def Highest_Low(
    Records: js.Array[botvsLib.botvsMod.Global.botvsNs.Record],
    Period: scala.Double,
    Property: botvsLib.botvsLibStrings.Low
  ): scala.Double = js.native
  @JSName("Highest")
  def Highest_Open(
    Records: js.Array[botvsLib.botvsMod.Global.botvsNs.Record],
    Period: scala.Double,
    Property: botvsLib.botvsLibStrings.Open
  ): scala.Double = js.native
  @JSName("Highest")
  def Highest_Time(
    Records: js.Array[botvsLib.botvsMod.Global.botvsNs.Record],
    Period: scala.Double,
    Property: botvsLib.botvsLibStrings.Time
  ): scala.Double = js.native
  @JSName("Highest")
  def Highest_Volume(
    Records: js.Array[botvsLib.botvsMod.Global.botvsNs.Record],
    Period: scala.Double,
    Property: botvsLib.botvsLibStrings.Volume
  ): scala.Double = js.native
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
  def KDJ(Records: js.Array[botvsLib.botvsMod.Global.botvsNs.Record]): js.Tuple3[js.Array[scala.Double], js.Array[scala.Double], js.Array[scala.Double]] = js.native
  def KDJ(Records: js.Array[botvsLib.botvsMod.Global.botvsNs.Record], FirstPeriod: scala.Double): js.Tuple3[js.Array[scala.Double], js.Array[scala.Double], js.Array[scala.Double]] = js.native
  def KDJ(
    Records: js.Array[botvsLib.botvsMod.Global.botvsNs.Record],
    FirstPeriod: scala.Double,
    SecondPeriod: scala.Double
  ): js.Tuple3[js.Array[scala.Double], js.Array[scala.Double], js.Array[scala.Double]] = js.native
  def KDJ(
    Records: js.Array[botvsLib.botvsMod.Global.botvsNs.Record],
    FirstPeriod: scala.Double,
    SecondPeriod: scala.Double,
    ThirdPeriod: scala.Double
  ): js.Tuple3[js.Array[scala.Double], js.Array[scala.Double], js.Array[scala.Double]] = js.native
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
  def Lowest(Records: js.Array[botvsLib.botvsMod.Global.botvsNs.Record]): scala.Double = js.native
  def Lowest(Records: js.Array[botvsLib.botvsMod.Global.botvsNs.Record], Period: scala.Double): scala.Double = js.native
  @JSName("Lowest")
  def Lowest_Close(
    Records: js.Array[botvsLib.botvsMod.Global.botvsNs.Record],
    Period: scala.Double,
    Property: botvsLib.botvsLibStrings.Close
  ): scala.Double = js.native
  @JSName("Lowest")
  def Lowest_High(
    Records: js.Array[botvsLib.botvsMod.Global.botvsNs.Record],
    Period: scala.Double,
    Property: botvsLib.botvsLibStrings.High
  ): scala.Double = js.native
  @JSName("Lowest")
  def Lowest_Low(
    Records: js.Array[botvsLib.botvsMod.Global.botvsNs.Record],
    Period: scala.Double,
    Property: botvsLib.botvsLibStrings.Low
  ): scala.Double = js.native
  @JSName("Lowest")
  def Lowest_Open(
    Records: js.Array[botvsLib.botvsMod.Global.botvsNs.Record],
    Period: scala.Double,
    Property: botvsLib.botvsLibStrings.Open
  ): scala.Double = js.native
  @JSName("Lowest")
  def Lowest_Time(
    Records: js.Array[botvsLib.botvsMod.Global.botvsNs.Record],
    Period: scala.Double,
    Property: botvsLib.botvsLibStrings.Time
  ): scala.Double = js.native
  @JSName("Lowest")
  def Lowest_Volume(
    Records: js.Array[botvsLib.botvsMod.Global.botvsNs.Record],
    Period: scala.Double,
    Property: botvsLib.botvsLibStrings.Volume
  ): scala.Double = js.native
  /**
    * 移动平均线
    *
    * MA(数据, 周期), 默认参数为9, 返回一个一维数组
    *
    * @param {botvs.Record[]} Records
    * @param {number} Period
    * @return {number[]}
    */
  def MA(Records: js.Array[botvsLib.botvsMod.Global.botvsNs.Record]): js.Array[scala.Double] = js.native
  def MA(Records: js.Array[botvsLib.botvsMod.Global.botvsNs.Record], Period: scala.Double): js.Array[scala.Double] = js.native
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
  def MACD(Records: js.Array[botvsLib.botvsMod.Global.botvsNs.Record]): js.Tuple3[js.Array[scala.Double], js.Array[scala.Double], js.Array[scala.Double]] = js.native
  def MACD(Records: js.Array[botvsLib.botvsMod.Global.botvsNs.Record], LongPeriod: scala.Double): js.Tuple3[js.Array[scala.Double], js.Array[scala.Double], js.Array[scala.Double]] = js.native
  def MACD(
    Records: js.Array[botvsLib.botvsMod.Global.botvsNs.Record],
    LongPeriod: scala.Double,
    ShortPeriod: scala.Double
  ): js.Tuple3[js.Array[scala.Double], js.Array[scala.Double], js.Array[scala.Double]] = js.native
  def MACD(
    Records: js.Array[botvsLib.botvsMod.Global.botvsNs.Record],
    LongPeriod: scala.Double,
    ShortPeriod: scala.Double,
    SignalPeriod: scala.Double
  ): js.Tuple3[js.Array[scala.Double], js.Array[scala.Double], js.Array[scala.Double]] = js.native
  /**
    * 能量潮
    *
    * OBV(数据), 返回一个一维数组
    *
    * @param {botvs.Record[]} Records
    * @return {[number[] , number[]]}
    */
  def OBV(Records: js.Array[botvsLib.botvsMod.Global.botvsNs.Record]): js.Tuple2[js.Array[scala.Double], js.Array[scala.Double]] = js.native
  /**
    * 强弱指标
    *
    * RSI(数据, 周期), 默认参数为14, 返回一个一维数组
    *
    * @param {botvs.Record[]} Records
    * @param {number} Period
    * @return {number[]}
    */
  def RSI(Records: js.Array[botvsLib.botvsMod.Global.botvsNs.Record]): js.Array[scala.Double] = js.native
  def RSI(Records: js.Array[botvsLib.botvsMod.Global.botvsNs.Record], Period: scala.Double): js.Array[scala.Double] = js.native
}

