package typings.botvs.botvsMod.Global

import typings.botvs.botvsMod.Global.botvsNs.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("talib")
@js.native
object talibNs extends js.Object {
  /**
    * Vector Trigonometric ACos (反余弦函数)
    *
    * ACOS(Records[Close]) = Array(outReal)
    *
    * @param {botvs.Record[]|number[]} Records
    * @return {number[]}
    */
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
  def AD(High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
  def AD(High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double], Volume: js.Array[Double]): js.Array[Double] = js.native
  /**
    * Chaikin A/D Line (线随机指标)
    *
    * AD(Records[High,Low,Close,Volume]) = Array(outReal)
    *
    * @param {botvs.Record[]} Records
    * @return {number[]}
    */
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
  def ADOSC(Records: js.Array[Record]): js.Array[Double] = js.native
  def ADOSC(Records: js.Array[Record], FastPeriod: Double): js.Array[Double] = js.native
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
  def ADX(High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
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
  def ADX(Records: js.Array[Record]): js.Array[Double] = js.native
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
  def ADXR(High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
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
  def ADXR(Records: js.Array[Record]): js.Array[Double] = js.native
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
  def APO(Records: js.Array[Double | Record]): js.Array[Double] = js.native
  def APO(Records: js.Array[Double | Record], FastPeriod: Double): js.Array[Double] = js.native
  def APO(Records: js.Array[Double | Record], FastPeriod: Double, SlowPeriod: Double): js.Array[Double] = js.native
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
  def AROON(High: js.Array[Double], Low: js.Array[Double]): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
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
  def AROON(Records: js.Array[Record]): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
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
  def AROONOSC(High: js.Array[Double], Low: js.Array[Double]): js.Array[Double] = js.native
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
  def AROONOSC(Records: js.Array[Record]): js.Array[Double] = js.native
  def AROONOSC(Records: js.Array[Record], TimePeriod: Double): js.Array[Double] = js.native
  /**
    * Vector Trigonometric ASin (反正弦函数)
    *
    * ASIN(Records[Close]) = Array(outReal)
    *
    * @param {botvs.Record[]|number[]} Records
    * @return {number[]}
    */
  def ASIN(Records: js.Array[Double | Record]): js.Array[Double] = js.native
  /**
    * Vector Trigonometric ATan (反正切函数)
    *
    * ATAN(Records[Close]) = Array(outReal)
    *
    * @param {botvs.Record[]|number[]} Records
    * @return {number[]}
    */
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
  def ATR(High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
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
  def ATR(Records: js.Array[Record]): js.Array[Double] = js.native
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
  def AVGPRICE(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
  /**
    * Average Price (平均价格)
    *
    * AVGPRICE(Records[Open,High,Low,Close]) = Array(outReal)
    *
    * @param {botvs.Record[]} Records
    * @return {number[]}
    */
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
  def BBANDS(Records: js.Array[Double | Record]): js.Tuple3[js.Array[Double], js.Array[Double], js.Array[Double]] = js.native
  def BBANDS(Records: js.Array[Double | Record], TimePeriod: Double): js.Tuple3[js.Array[Double], js.Array[Double], js.Array[Double]] = js.native
  def BBANDS(Records: js.Array[Double | Record], TimePeriod: Double, Deviationsup: Double): js.Tuple3[js.Array[Double], js.Array[Double], js.Array[Double]] = js.native
  def BBANDS(
    Records: js.Array[Double | Record],
    TimePeriod: Double,
    Deviationsup: Double,
    Deviationsdown: Double
  ): js.Tuple3[js.Array[Double], js.Array[Double], js.Array[Double]] = js.native
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
  def BOP(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
  /**
    * Balance Of Power (均势指标)
    *
    * BOP(Records[Open,High,Low,Close]) = Array(outReal)
    *
    * @param {botvs.Record[]} Records
    * @return {number[]}
    */
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
  def CCI(High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
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
  def CCI(Records: js.Array[Record]): js.Array[Double] = js.native
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
  def CDL2CROWS(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
  /**
    * Two Crows (K线图--两只乌鸦)
    *
    * CDL2CROWS(Records[Open,High,Low,Close]) = Array(outInteger)
    *
    * @param {botvs.Record[]} Records
    * @return {number[]}
    */
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
  def CDL3BLACKCROWS(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
  /**
    * Three Black Crows (K线图--3只黑乌鸦)
    *
    * CDL3BLACKCROWS(Records[Open,High,Low,Close]) = Array(outInteger)
    *
    * @param {botvs.Record[]} Records
    * @return {number[]}
    */
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
  def CDL3INSIDE(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
  /**
    * Three Inside Up/Down (K线图:3内上下震荡)
    *
    * CDL3INSIDE(Records[Open,High,Low,Close]) = Array(outInteger)
    *
    * @param {botvs.Record[]} Records
    * @return {number[]}
    */
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
  def CDL3LINESTRIKE(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
  /**
    * Three-Line Strike  (K线图:3线震荡)
    *
    * CDL3LINESTRIKE(Records[Open,High,Low,Close]) = Array(outInteger)
    *
    * @param {botvs.Record[]} Records
    * @return {number[]}
    */
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
  def CDL3OUTSIDE(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
  /**
    * Three Outside Up/Down (K线图:3外下震荡)
    *
    * CDL3OUTSIDE(Records[Open,High,Low,Close]) = Array(outInteger)
    *
    * @param {botvs.Record[]} Records
    * @return {number[]}
    */
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
  def CDL3STARSINSOUTH(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
  /**
    * Three Stars In The South (K线图:南方三星)
    *
    * CDL3STARSINSOUTH(Records[Open,High,Low,Close]) = Array(outInteger)
    *
    * @param {botvs.Record[]} Records
    * @return {number[]}
    */
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
  def CDL3WHITESOLDIERS(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
  /**
    * Three Advancing White Soldiers (K线图:三白兵)
    *
    * CDL3WHITESOLDIERS(Records[Open,High,Low,Close]) = Array(outInteger)
    *
    * @param {botvs.Record[]} Records
    * @return {number[]}
    */
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
  def CDLABANDONEDBABY(Records: js.Array[Record]): js.Array[Double] = js.native
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
  def CDLADVANCEBLOCK(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
  /**
    * Advance Block (K线图:推进)
    *
    * CDLADVANCEBLOCK(Records[Open,High,Low,Close]) = Array(outInteger)
    *
    * @param {botvs.Record[]} Records
    * @return {number[]}
    */
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
  def CDLBELTHOLD(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
  /**
    * Belt-hold (K线图:带住)
    *
    * CDLBELTHOLD(Records[Open,High,Low,Close]) = Array(outInteger)
    *
    * @param {botvs.Record[]} Records
    * @return {number[]}
    */
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
  def CDLBREAKAWAY(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
  /**
    * Breakaway (K线图:分离)
    *
    * CDLBREAKAWAY(Records[Open,High,Low,Close]) = Array(outInteger)
    *
    * @param {botvs.Record[]} Records
    * @return {number[]}
    */
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
  def CDLCLOSINGMARUBOZU(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
  /**
    * Closing Marubozu (K线图:收盘光头光脚)
    *
    * CDLCLOSINGMARUBOZU(Records[Open,High,Low,Close]) = Array(outInteger)
    *
    * @param {botvs.Record[]} Records
    * @return {number[]}
    */
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
  def CDLCONCEALBABYSWALL(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
  /**
    * Concealing Baby Swallow (K线图:藏婴吞没形态)
    *
    * CDLCONCEALBABYSWALL(Records[Open,High,Low,Close]) = Array(outInteger)
    *
    * @param {botvs.Record[]} Records
    * @return {number[]}
    */
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
  def CDLCOUNTERATTACK(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
  /**
    * Counterattack (K线图:反击)
    *
    * CDLCOUNTERATTACK(Records[Open,High,Low,Close]) = Array(outInteger)
    *
    * @param {botvs.Record[]} Records
    * @return {number[]}
    */
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
  def CDLDARKCLOUDCOVER(Records: js.Array[Record]): js.Array[Double] = js.native
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
  def CDLDOJI(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
  /**
    * Doji (K线图:十字星 )
    *
    * CDLDOJI(Records[Open,High,Low,Close]) = Array(outInteger)
    *
    * @param {botvs.Record[]} Records
    * @return {number[]}
    */
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
  def CDLDOJISTAR(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
  /**
    * Doji Star (K线图:十字星)
    *
    * CDLDOJISTAR(Records[Open,High,Low,Close]) = Array(outInteger)
    *
    * @param {botvs.Record[]} Records
    * @return {number[]}
    */
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
  def CDLDRAGONFLYDOJI(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
  /**
    * Dragonfly Doji (K线图:蜻蜓十字星)
    *
    * CDLDRAGONFLYDOJI(Records[Open,High,Low,Close]) = Array(outInteger)
    *
    * @param {botvs.Record[]} Records
    * @return {number[]}
    */
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
  def CDLENGULFING(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
  /**
    * Engulfing Pattern (K线图:吞没)
    *
    * CDLENGULFING(Records[Open,High,Low,Close]) = Array(outInteger)
    *
    * @param {botvs.Record[]} Records
    * @return {number[]}
    */
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
  def CDLEVENINGDOJISTAR(Records: js.Array[Record]): js.Array[Double] = js.native
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
  def CDLEVENINGSTAR(Records: js.Array[Record]): js.Array[Double] = js.native
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
  def CDLGAPSIDESIDEWHITE(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
  /**
    * Up/Down-gap side-by-side white lines (K线图:上/下间隙并排的白色线条)
    *
    * CDLGAPSIDESIDEWHITE(Records[Open,High,Low,Close]) = Array(outInteger)
    *
    * @param {botvs.Record[]} Records
    * @return {number[]}
    */
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
  def CDLGRAVESTONEDOJI(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
  /**
    * Gravestone Doji (K线图:墓碑十字线)
    *
    * CDLGRAVESTONEDOJI(Records[Open,High,Low,Close]) = Array(outInteger)
    *
    * @param {botvs.Record[]} Records
    * @return {number[]}
    */
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
  def CDLHAMMER(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
  /**
    * Hammer (K线图:锤)
    *
    * CDLHAMMER(Records[Open,High,Low,Close]) = Array(outInteger)
    *
    * @param {botvs.Record[]} Records
    * @return {number[]}
    */
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
  def CDLHANGINGMAN(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
  /**
    * Hanging Man (K线图:吊人)
    *
    * CDLHANGINGMAN(Records[Open,High,Low,Close]) = Array(outInteger)
    *
    * @param {botvs.Record[]} Records
    * @return {number[]}
    */
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
  def CDLHARAMI(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
  /**
    * Harami Pattern (K线图:阴阳线)
    *
    * CDLHARAMI(Records[Open,High,Low,Close]) = Array(outInteger)
    *
    * @param {botvs.Record[]} Records
    * @return {number[]}
    */
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
  def CDLHARAMICROSS(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
  /**
    * Harami Cross Pattern (K线图:交叉阴阳线)
    *
    * CDLHARAMICROSS(Records[Open,High,Low,Close]) = Array(outInteger)
    *
    * @param {botvs.Record[]} Records
    * @return {number[]}
    */
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
  def CDLHIGHWAVE(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
  /**
    * High-Wave Candle (K线图:长脚十字线 )
    *
    * CDLHIGHWAVE(Records[Open,High,Low,Close]) = Array(outInteger)
    *
    * @param {botvs.Record[]} Records
    * @return {number[]}
    */
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
  def CDLHIKKAKE(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
  /**
    * Hikkake Pattern (K线图:陷阱)
    *
    * CDLHIKKAKE(Records[Open,High,Low,Close]) = Array(outInteger)
    *
    * @param {botvs.Record[]} Records
    * @return {number[]}
    */
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
  def CDLHIKKAKEMOD(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
  /**
    * Modified Hikkake Pattern (K线图:改良的陷阱)
    *
    * CDLHIKKAKEMOD(Records[Open,High,Low,Close]) = Array(outInteger)
    *
    * @param {botvs.Record[]} Records
    * @return {number[]}
    */
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
  def CDLHOMINGPIGEON(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
  /**
    * Homing Pigeon (K线图:信鸽)
    *
    * CDLHOMINGPIGEON(Records[Open,High,Low,Close]) = Array(outInteger)
    *
    * @param {botvs.Record[]} Records
    * @return {number[]}
    */
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
  def CDLIDENTICAL3CROWS(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
  /**
    * Identical Three Crows (K线图:相同的三只乌鸦)
    *
    * CDLIDENTICAL3CROWS(Records[Open,High,Low,Close]) = Array(outInteger)
    *
    * @param {botvs.Record[]} Records
    * @return {number[]}
    */
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
  def CDLINNECK(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
  /**
    * In-Neck Pattern (K线图:颈纹)
    *
    * CDLINNECK(Records[Open,High,Low,Close]) = Array(outInteger)
    *
    * @param {botvs.Record[]} Records
    * @return {number[]}
    */
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
  def CDLINVERTEDHAMMER(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
  /**
    * Inverted Hammer (K线图:倒锤)
    *
    * CDLINVERTEDHAMMER(Records[Open,High,Low,Close]) = Array(outInteger)
    *
    * @param {botvs.Record[]} Records
    * @return {number[]}
    */
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
  def CDLKICKING(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
  /**
    * Kicking (K线图:踢)
    *
    * CDLKICKING(Records[Open,High,Low,Close]) = Array(outInteger)
    *
    * @param {botvs.Record[]} Records
    * @return {number[]}
    */
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
  def CDLKICKINGBYLENGTH(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
  /**
    * Kicking - bull/bear determined by the longer marubozu (K线图:踢牛/踢熊)
    *
    * CDLKICKINGBYLENGTH(Records[Open,High,Low,Close]) = Array(outInteger)
    *
    * @param {botvs.Record[]} Records
    * @return {number[]}
    */
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
  def CDLLADDERBOTTOM(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
  /**
    * Ladder Bottom (K线图:梯底)
    *
    * CDLLADDERBOTTOM(Records[Open,High,Low,Close]) = Array(outInteger)
    *
    * @param {botvs.Record[]} Records
    * @return {number[]}
    */
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
  def CDLLONGLEGGEDDOJI(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
  /**
    * Long Legged Doji (K线图:长腿十字线)
    *
    * CDLLONGLEGGEDDOJI(Records[Open,High,Low,Close]) = Array(outInteger)
    *
    * @param {botvs.Record[]} Records
    * @return {number[]}
    */
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
  def CDLLONGLINE(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
  /**
    * Long Line Candle (K线图:长线)
    *
    * CDLLONGLINE(Records[Open,High,Low,Close]) = Array(outInteger)
    *
    * @param {botvs.Record[]} Records
    * @return {number[]}
    */
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
  def CDLMARUBOZU(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
  /**
    * Marubozu (K线图:光头光脚 )
    *
    * CDLMARUBOZU(Records[Open,High,Low,Close]) = Array(outInteger)
    *
    * @param {botvs.Record[]} Records
    * @return {number[]}
    */
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
  def CDLMATCHINGLOW(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
  /**
    * Matching Low (K线图:匹配低)
    *
    * CDLMATCHINGLOW(Records[Open,High,Low,Close]) = Array(outInteger)
    *
    * @param {botvs.Record[]} Records
    * @return {number[]}
    */
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
  def CDLMATHOLD(Records: js.Array[Record]): js.Array[Double] = js.native
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
  def CDLMORNINGDOJISTAR(Records: js.Array[Record]): js.Array[Double] = js.native
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
  def CDLMORNINGSTAR(Records: js.Array[Record]): js.Array[Double] = js.native
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
  def CDLONNECK(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
  /**
    * On-Neck Pattern (K线图:颈型)
    *
    * CDLONNECK(Records[Open,High,Low,Close]) = Array(outInteger)
    *
    * @param {botvs.Record[]} Records
    * @return {number[]}
    */
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
  def CDLPIERCING(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
  /**
    * Piercing Pattern (K线图:穿孔模式)
    *
    * CDLPIERCING(Records[Open,High,Low,Close]) = Array(outInteger)
    *
    * @param {botvs.Record[]} Records
    * @return {number[]}
    */
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
  def CDLRICKSHAWMAN(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
  /**
    * Rickshaw Man (K线图:车夫)
    *
    * CDLRICKSHAWMAN(Records[Open,High,Low,Close]) = Array(outInteger)
    *
    * @param {botvs.Record[]} Records
    * @return {number[]}
    */
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
  def CDLRISEFALL3METHODS(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
  /**
    * Rising/Falling Three Methods (K线图:上升/下降三法)
    *
    * CDLRISEFALL3METHODS(Records[Open,High,Low,Close]) = Array(outInteger)
    *
    * @param {botvs.Record[]} Records
    * @return {number[]}
    */
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
  def CDLSEPARATINGLINES(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
  /**
    * Separating Lines (K线图:分割线)
    *
    * CDLSEPARATINGLINES(Records[Open,High,Low,Close]) = Array(outInteger)
    *
    * @param {botvs.Record[]} Records
    * @return {number[]}
    */
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
  def CDLSHOOTINGSTAR(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
  /**
    * Shooting Star (K线图:流星)
    *
    * CDLSHOOTINGSTAR(Records[Open,High,Low,Close]) = Array(outInteger)
    *
    * @param {botvs.Record[]} Records
    * @return {number[]}
    */
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
  def CDLSHORTLINE(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
  /**
    * Short Line Candle (K线图:短线)
    *
    * CDLSHORTLINE(Records[Open,High,Low,Close]) = Array(outInteger)
    *
    * @param {botvs.Record[]} Records
    * @return {number[]}
    */
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
  def CDLSPINNINGTOP(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
  /**
    * Spinning Top (K线图:陀螺)
    *
    * CDLSPINNINGTOP(Records[Open,High,Low,Close]) = Array(outInteger)
    *
    * @param {botvs.Record[]} Records
    * @return {number[]}
    */
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
  def CDLSTALLEDPATTERN(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
  /**
    * Stalled Pattern (K线图:停滞模式)
    *
    * CDLSTALLEDPATTERN(Records[Open,High,Low,Close]) = Array(outInteger)
    *
    * @param {botvs.Record[]} Records
    * @return {number[]}
    */
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
  def CDLSTICKSANDWICH(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
  /**
    * Stick Sandwich (K线图:棍子三明治)
    *
    * CDLSTICKSANDWICH(Records[Open,High,Low,Close]) = Array(outInteger)
    *
    * @param {botvs.Record[]} Records
    * @return {number[]}
    */
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
  def CDLTAKURI(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
  /**
    * Takuri (Dragonfly Doji with very long lower shadow) (K线图:托里)
    *
    * CDLTAKURI(Records[Open,High,Low,Close]) = Array(outInteger)
    *
    * @param {botvs.Record[]} Records
    * @return {number[]}
    */
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
  def CDLTASUKIGAP(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
  /**
    * Tasuki Gap (K线图:翼隙)
    *
    * CDLTASUKIGAP(Records[Open,High,Low,Close]) = Array(outInteger)
    *
    * @param {botvs.Record[]} Records
    * @return {number[]}
    */
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
  def CDLTHRUSTING(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
  /**
    * Thrusting Pattern (K线图:推模式)
    *
    * CDLTHRUSTING(Records[Open,High,Low,Close]) = Array(outInteger)
    *
    * @param {botvs.Record[]} Records
    * @return {number[]}
    */
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
  def CDLTRISTAR(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
  /**
    * Tristar Pattern (K线图:三星模式)
    *
    * CDLTRISTAR(Records[Open,High,Low,Close]) = Array(outInteger)
    *
    * @param {botvs.Record[]} Records
    * @return {number[]}
    */
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
  def CDLUNIQUE3RIVER(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
  /**
    * Unique 3 River (K线图:独特的3河)
    *
    * CDLUNIQUE3RIVER(Records[Open,High,Low,Close]) = Array(outInteger)
    *
    * @param {botvs.Record[]} Records
    * @return {number[]}
    */
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
  def CDLUPSIDEGAP2CROWS(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
  /**
    * Upside Gap Two Crows (K线图:双飞乌鸦)
    *
    * CDLUPSIDEGAP2CROWS(Records[Open,High,Low,Close]) = Array(outInteger)
    *
    * @param {botvs.Record[]} Records
    * @return {number[]}
    */
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
  def CDLXSIDEGAP3METHODS(Open: js.Array[Double], High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
  /**
    * Upside/Downside Gap Three Methods (K线图:上行/下行缺口三方法)
    *
    * CDLXSIDEGAP3METHODS(Records[Open,High,Low,Close]) = Array(outInteger)
    *
    * @param {botvs.Record[]} Records
    * @return {number[]}
    */
  def CDLXSIDEGAP3METHODS(Records: js.Array[Record]): js.Array[Double] = js.native
  /**
    * Vector Ceil (取整函数)
    *
    * CEIL(Records[Close]) = Array(outReal)
    *
    * @param {botvs.Record[]|number[]} Records
    * @return {number[]}
    */
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
  def CMO(Records: js.Array[Double | Record]): js.Array[Double] = js.native
  def CMO(Records: js.Array[Double | Record], TimePeriod: Double): js.Array[Double] = js.native
  /**
    * Vector Trigonometric Cos (余弦函数)
    *
    * COS(Records[Close]) = Array(outReal)
    *
    * @param {botvs.Record[]|number[]} Records
    * @return {number[]}
    */
  def COS(Records: js.Array[Double | Record]): js.Array[Double] = js.native
  /**
    * Vector Trigonometric Cosh (双曲余弦值)
    *
    * COSH(Records[Close]) = Array(outReal)
    *
    * @param {botvs.Record[]|number[]} Records
    * @return {number[]}
    */
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
  def DEMA(Records: js.Array[Double | Record]): js.Array[Double] = js.native
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
  def DX(High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
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
  def DX(Records: js.Array[Record]): js.Array[Double] = js.native
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
  def EMA(Records: js.Array[Double | Record]): js.Array[Double] = js.native
  def EMA(Records: js.Array[Double | Record], TimePeriod: Double): js.Array[Double] = js.native
  /**
    * Vector Arithmetic Exp (指数函数)
    *
    * EXP(Records[Close]) = Array(outReal)
    *
    * @param {botvs.Record[]|number[]} Records
    * @return {number[]}
    */
  def EXP(Records: js.Array[Double | Record]): js.Array[Double] = js.native
  /**
    * Vector Floor (向下取整)
    *
    * FLOOR(Records[Close]) = Array(outReal)
    *
    * @param {botvs.Record[]|number[]} Records
    * @return {number[]}
    */
  def FLOOR(Records: js.Array[Double | Record]): js.Array[Double] = js.native
  /**
    * Hilbert Transform - Dominant Cycle Period (希尔伯特变换, 主周期)
    *
    * HT_DCPERIOD(Records[Close]) = Array(outReal)
    *
    * @param {botvs.Record[]|number[]} Records
    * @return {number[]}
    */
  def HT_DCPERIOD(Records: js.Array[Double | Record]): js.Array[Double] = js.native
  /**
    * Hilbert Transform - Dominant Cycle Phase (希尔伯特变换,主阶段)
    *
    * HT_DCPHASE(Records[Close]) = Array(outReal)
    *
    * @param {botvs.Record[]|number[]} Records
    * @return {number[]}
    */
  def HT_DCPHASE(Records: js.Array[Double | Record]): js.Array[Double] = js.native
  /**
    * Hilbert Transform - Phasor Components (希尔伯特变换,相成分)
    *
    * HT_PHASOR(Records[Close]) = [Array(outInPhase),Array(outQuadrature)]
    *
    * @param {botvs.Record[]|number[]} Records
    * @return {[number[], number[]]}
    */
  def HT_PHASOR(Records: js.Array[Double | Record]): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
  /**
    * Hilbert Transform - SineWave (希尔伯特变换,正弦波)
    *
    * HT_SINE(Records[Close]) = [Array(outSine),Array(outLeadSine)]
    *
    * @param {botvs.Record[]|number[]} Records
    * @return {[number[], number[]]}
    */
  def HT_SINE(Records: js.Array[Double | Record]): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
  /**
    * Hilbert Transform - Instantaneous Trendline (希尔伯特变换,瞬时趋势)
    *
    * HT_TRENDLINE(Records[Close]) = Array(outReal)
    *
    * @param {botvs.Record[]|number[]} Records
    * @return {number[]}
    */
  def HT_TRENDLINE(Records: js.Array[Double | Record]): js.Array[Double] = js.native
  /**
    * Hilbert Transform - Trend vs Cycle Mode (希尔伯特变换-趋势与周期模式)
    *
    * HT_TRENDMODE(Records[Close]) = Array(outInteger)
    *
    * @param {botvs.Record[]|number[]} Records
    * @return {number[]}
    */
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
  def KAMA(Records: js.Array[Double | Record]): js.Array[Double] = js.native
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
  def LINEARREG(Records: js.Array[Double | Record]): js.Array[Double] = js.native
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
  def LINEARREG_SLOPE(Records: js.Array[Double | Record], TimePeriod: Double): js.Array[Double] = js.native
  /**
    * Vector Log Natural (自然对数)
    *
    * LN(Records[Close]) = Array(outReal)
    *
    * @param {botvs.Record[]|number[]} Records
    * @return {number[]}
    */
  def LN(Records: js.Array[Double | Record]): js.Array[Double] = js.native
  /**
    * Vector Log10 (对数函数)
    *
    * LOG10(Records[Close]) = Array(outReal)
    *
    * @param {botvs.Record[]|number[]} Records
    * @return {number[]}
    */
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
  def MA(Records: js.Array[Double | Record]): js.Array[Double] = js.native
  def MA(Records: js.Array[Double | Record], TimePeriod: Double): js.Array[Double] = js.native
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
  def MACD(Records: js.Array[Double | Record]): js.Tuple3[js.Array[Double], js.Array[Double], js.Array[Double]] = js.native
  def MACD(Records: js.Array[Double | Record], FastPeriod: Double): js.Tuple3[js.Array[Double], js.Array[Double], js.Array[Double]] = js.native
  def MACD(Records: js.Array[Double | Record], FastPeriod: Double, SlowPeriod: Double): js.Tuple3[js.Array[Double], js.Array[Double], js.Array[Double]] = js.native
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
  def MACDFIX(Records: js.Array[Double | Record]): js.Tuple3[js.Array[Double], js.Array[Double], js.Array[Double]] = js.native
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
  def MAMA(Records: js.Array[Double | Record]): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
  def MAMA(Records: js.Array[Double | Record], FastLimit: Double): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
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
  def MAX(Records: js.Array[Double | Record]): js.Array[Double] = js.native
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
  def MAXINDEX(Records: js.Array[Double | Record]): js.Array[Double] = js.native
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
  def MEDPRICE(High: js.Array[Double], Low: js.Array[Double]): js.Array[Double] = js.native
  /**
    * Median Price (中位数价格)
    *
    * MEDPRICE(Records[High,Low]) = Array(outReal)
    *
    * @param {botvs.Record[]} Records
    * @return {number[]}
    */
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
  def MFI(High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double], Volume: js.Array[Double]): js.Array[Double] = js.native
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
  def MFI(Records: js.Array[Record]): js.Array[Double] = js.native
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
  def MIDPOINT(Records: js.Array[Double | Record]): js.Array[Double] = js.native
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
  def MIDPRICE(High: js.Array[Double], Low: js.Array[Double]): js.Array[Double] = js.native
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
  def MIDPRICE(Records: js.Array[Record]): js.Array[Double] = js.native
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
  def MIN(Records: js.Array[Double | Record]): js.Array[Double] = js.native
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
  def MININDEX(Records: js.Array[Double | Record]): js.Array[Double] = js.native
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
  def MINMAX(Records: js.Array[Double | Record]): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
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
  def MINMAXINDEX(Records: js.Array[Double | Record]): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
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
  def MOM(Records: js.Array[Double | Record]): js.Array[Double] = js.native
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
  def NATR(High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
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
  def NATR(Records: js.Array[Record]): js.Array[Double] = js.native
  def NATR(Records: js.Array[Record], TimePeriod: Double): js.Array[Double] = js.native
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
  def PPO(Records: js.Array[Double | Record]): js.Array[Double] = js.native
  def PPO(Records: js.Array[Double | Record], FastPeriod: Double): js.Array[Double] = js.native
  def PPO(Records: js.Array[Double | Record], FastPeriod: Double, SlowPeriod: Double): js.Array[Double] = js.native
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
  def ROC(Records: js.Array[Double | Record]): js.Array[Double] = js.native
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
  def ROCP(Records: js.Array[Double | Record]): js.Array[Double] = js.native
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
  def ROCR(Records: js.Array[Double | Record]): js.Array[Double] = js.native
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
  def RSI(Records: js.Array[Double | Record]): js.Array[Double] = js.native
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
  def SAR(High: js.Array[Double], Low: js.Array[Double]): js.Array[Double] = js.native
  def SAR(High: js.Array[Double], Low: js.Array[Double], AccelerationFactor: Double): js.Array[Double] = js.native
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
  def SAR(Records: js.Array[Record]): js.Array[Double] = js.native
  def SAR(Records: js.Array[Record], AccelerationFactor: Double): js.Array[Double] = js.native
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
  def SIN(Records: js.Array[Double | Record]): js.Array[Double] = js.native
  /**
    * Vector Trigonometric Sinh (双曲正弦函数)
    *
    * SINH(Records[Close]) = Array(outReal)
    *
    * @param {botvs.Record[]|number[]} Records
    * @return {number[]}
    */
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
  def SMA(Records: js.Array[Double | Record]): js.Array[Double] = js.native
  def SMA(Records: js.Array[Double | Record], TimePeriod: Double): js.Array[Double] = js.native
  /**
    * Vector Square Root (平方根)
    *
    * SQRT(Records[Close]) = Array(outReal)
    *
    * @param {botvs.Record[]|number[]} Records
    * @return {number[]}
    */
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
  def STDDEV(Records: js.Array[Double | Record]): js.Array[Double] = js.native
  def STDDEV(Records: js.Array[Double | Record], TimePeriod: Double): js.Array[Double] = js.native
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
  def STOCH(Records: js.Array[Record]): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
  def STOCH(Records: js.Array[Record], Fast_KPeriod: Double): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
  def STOCH(Records: js.Array[Record], Fast_KPeriod: Double, Slow_KPeriod: Double): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
  def STOCH(Records: js.Array[Record], Fast_KPeriod: Double, Slow_KPeriod: Double, Slow_KMA: Double): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
  def STOCH(
    Records: js.Array[Record],
    Fast_KPeriod: Double,
    Slow_KPeriod: Double,
    Slow_KMA: Double,
    Slow_DPeriod: Double
  ): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
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
  def STOCHF(Records: js.Array[Record]): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
  def STOCHF(Records: js.Array[Record], Fast_KPeriod: Double): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
  def STOCHF(Records: js.Array[Record], Fast_KPeriod: Double, Fast_DPeriod: Double): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
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
  def STOCHRSI(Records: js.Array[Double | Record]): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
  def STOCHRSI(Records: js.Array[Double | Record], TimePeriod: Double): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
  def STOCHRSI(Records: js.Array[Double | Record], TimePeriod: Double, Fast_KPeriod: Double): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
  def STOCHRSI(Records: js.Array[Double | Record], TimePeriod: Double, Fast_KPeriod: Double, Fast_DPeriod: Double): js.Tuple2[js.Array[Double], js.Array[Double]] = js.native
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
  def SUM(Records: js.Array[Double | Record]): js.Array[Double] = js.native
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
  def T3(Records: js.Array[Double | Record], TimePeriod: Double, VolumeFactor: Double): js.Array[Double] = js.native
  /**
    * Vector Trigonometric Tan (正切)
    *
    * TAN(Records[Close]) = Array(outReal)
    *
    * @param {botvs.Record[]|number[]} Records
    * @return {number[]}
    */
  def TAN(Records: js.Array[Double | Record]): js.Array[Double] = js.native
  /**
    * Vector Trigonometric Tanh (双曲正切函数)
    *
    * TANH(Records[Close]) = Array(outReal)
    *
    * @param {botvs.Record[]|number[]} Records
    * @return {number[]}
    */
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
  def TEMA(Records: js.Array[Double | Record]): js.Array[Double] = js.native
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
  def TRANGE(High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
  /**
    * True Range (真实范围)
    *
    * TRANGE(Records[High,Low,Close]) = Array(outReal)
    *
    * @param {botvs.Record[]} Records
    * @return {number[]}
    */
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
  def TRIMA(Records: js.Array[Double | Record]): js.Array[Double] = js.native
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
  def TRIX(Records: js.Array[Double | Record]): js.Array[Double] = js.native
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
  def TSF(Records: js.Array[Double | Record]): js.Array[Double] = js.native
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
  def TYPPRICE(High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
  /**
    * Typical Price (典型价格)
    *
    * TYPPRICE(Records[High,Low,Close]) = Array(outReal)
    *
    * @param {botvs.Record[]} Records
    * @return {number[]}
    */
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
  def ULTOSC(Records: js.Array[Record]): js.Array[Double] = js.native
  def ULTOSC(Records: js.Array[Record], FirstPeriod: Double): js.Array[Double] = js.native
  def ULTOSC(Records: js.Array[Record], FirstPeriod: Double, SecondPeriod: Double): js.Array[Double] = js.native
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
  def VAR(Records: js.Array[Double | Record]): js.Array[Double] = js.native
  def VAR(Records: js.Array[Double | Record], TimePeriod: Double): js.Array[Double] = js.native
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
  def WCLPRICE(High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
  /**
    * Weighted Close Price (加权收盘价)
    *
    * WCLPRICE(Records[High,Low,Close]) = Array(outReal)
    *
    * @param {botvs.Record[]} Records
    * @return {number[]}
    */
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
  def WILLR(High: js.Array[Double], Low: js.Array[Double], Close: js.Array[Double]): js.Array[Double] = js.native
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
  def WILLR(Records: js.Array[Record]): js.Array[Double] = js.native
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
  def WMA(Records: js.Array[Double | Record]): js.Array[Double] = js.native
  def WMA(Records: js.Array[Double | Record], TimePeriod: Double): js.Array[Double] = js.native
  /**
    * 查询指标调用格式
    *
    * Log(talib.help('MACD')); // 在回测环境下调用
    *
    * @param {string} Func
    * @return {string}
    */
  def help(Func: String): String = js.native
}

