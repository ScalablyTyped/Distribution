package typings.cookieclicker.Game

import typings.cookieclicker.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StocksMinigame
  extends StObject
     with Minigame {
  
  /**
    * The amount of brokers
    */
  var brokers: Double = js.native
  
  /**
    * Generates the tooltip functions for brokers
    */
  def brokersTooltip(): js.Function0[String] = js.native
  
  /**
    * Buys a good by id
    * @returns If the operation has succeeded
    */
  def buyGood(id: Double, n: Double): Boolean = js.native
  
  /**
    * Updates the graph vertical size
    */
  def checkGraphScale(): Unit = js.native
  
  var colBases: js.Array[StocksColors] = js.native
  
  var cols: StocksColors = js.native
  
  /**
    * Redraws the graph
    * @param full If set, completely redraws the graph
    */
  def drawGraph(): Unit = js.native
  def drawGraph(full: Boolean): Unit = js.native
  
  /**
    * Calculates the price of brokers
    */
  def getBrokerPrice(): Double = js.native
  
  /**
    * Calculates the maximum stock for a good
    */
  def getGoodMaxStock(good: StocksGood): Double = js.native
  
  /**
    * Calculates the price for a good
    */
  def getGoodPrice(good: StocksGood): Double = js.native
  
  /**
    * Calculates the maximum amount of brokers
    */
  def getMaxBrokers(): Double = js.native
  
  /** @deprecated */
  def getOppSlots(): Double = js.native
  
  /**
    * Calculates the resting value for a stock
    */
  def getRestingVal(id: Double): Double = js.native
  
  /**
    * Calculates the delta for the stock, in %
    * @param id The id of the stock
    * @param back The degree of age of the stock delta
    */
  def goodDelta(id: Double): Double = js.native
  def goodDelta(id: Double, back: Double): Double = js.native
  
  /**
    * Generates the tooltip function for a good
    */
  def goodTooltip(id: Double): js.Function0[String] = js.native
  
  var goods: Record[String, StocksGood] = js.native
  
  var goodsById: js.Array[StocksGood] = js.native
  
  var graph: HTMLCanvasElement = js.native
  
  /**
    * The color mode of the graph, 0 for white, 1 for black
    */
  var graphCols: Double = js.native
  
  var graphCtx: CanvasRenderingContext2D = js.native
  
  /**
    * Mode of the graph display, 0 for lines, 1 for candles
    */
  var graphLines: Double = js.native
  
  /**
    * A contant which represents the amount of units a vertical pixels represents
    */
  var graphScale: Double = js.native
  
  /**
    * The currently hovered good
    */
  var hoverOnGood: Double = js.native
  
  /**
    * The last tick that was drawn
    */
  var lastTickDrawn: Double = js.native
  
  /**
    * Generates the tooltip function for loans
    */
  def loanTooltip(): js.Function0[String] = js.native
  
  /**
    * The types of loans, tuple describing the loan type:
    * Loan name, Loan power, Load duration, Loan payback power,
    * Loan payback duration, downpayement (mult of bank) and the quote (flavour text)
    */
  var loanTypes: js.Array[js.Tuple7[String, Double, Double, Double, Double, Double, String]] = js.native
  
  var officeLevel: Double = js.native
  
  /**
    * Generates the tooltip function for the office
    */
  def officeTooltip(): js.Function0[String] = js.native
  
  var offices: js.Array[StocksOffice] = js.native
  
  /** @deprecated */
  def oppTooltip(): js.Function0[String] = js.native
  
  var profit: Double = js.native
  
  /** @deprecated */
  def refillTooltip(): String = js.native
  
  /**
    * The amount of seconds per tick
    */
  var secondsPerTick: Double = js.native
  
  /**
    * Sells a good by id
    * @returns If the operation has succeeded
    */
  def sellGood(id: Double, n: Double): Boolean = js.native
  
  /**
    * Updates the colors of the graph
    */
  def setCols(): Unit = js.native
  
  /**
    * Applies a loan to the player
    * @param interest If true, the interest debuff is applied
    */
  def takeLoan(id: Double): Unit = js.native
  def takeLoan(id: Double, interest: Boolean): Unit = js.native
  
  /**
    * Updates the stock prices
    */
  def tick(): Unit = js.native
  
  /**
    * The amount of frames since last tick
    */
  var tickT: Double = js.native
  
  /**
    * Ticks passed since minigame load
    */
  var ticks: Double = js.native
  
  var toRedraw: PseudoBoolean = js.native
  
  /**
    * Generates the tooltip function for a buy/sell button
    */
  def tradeTooltip(id: Double, n: Double): js.Function0[String] = js.native
  
  /**
    * Updates the styles of a good
    */
  def updateGoodStyle(id: Double): Unit = js.native
}
