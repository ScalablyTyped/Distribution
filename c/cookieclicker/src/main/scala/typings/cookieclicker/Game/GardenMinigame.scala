package typings.cookieclicker.Game

import typings.cookieclicker.cookieclickerBooleans.`true`
import typings.cookieclicker.cookieclickerNumbers.`40`
import typings.cookieclicker.cookieclickerStrings.Garden
import typings.std.HTMLDivElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GardenMinigame
  extends StObject
     with Minigame {
  
  /**
    * Creates a dialogue which asks if the user wants to sacrifice their garden
    */
  def askConvert(): Unit = js.native
  
  def buildPanel(): Unit = js.native
  
  def buildPlot(): Unit = js.native
  
  /**
    * Determines if the plant can be bought
    */
  def canPlant(me: GardenPlant): Boolean = js.native
  
  /**
    * Executed when a tile is clicked, responsible dor deselecting the current seed
    */
  def clickTile(x: Double, y: Double): Unit = js.native
  
  /**
    * Updates the age, power and weed boosts of plant tiles
    */
  def computeBoostPlot(): Unit = js.native
  
  /**
    * Updates the effects of garden
    */
  def computeEffs(): Unit = js.native
  
  /**
    * Updates the mature times of plants, affected by seedless to nay
    */
  def computeMatures(): Unit = js.native
  
  /**
    * Updates `stepT`
    */
  def computeStepT(): Unit = js.native
  
  /**
    * Sacrifices the garden, by locking all the seeds, wiping the plot and giving 10 lumps
    */
  def convert(): Unit = js.native
  
  /**
    * The amount of times the garden has been sacrificed
    */
  var convertTimes: Double = js.native
  
  var cursor: PseudoBoolean = js.native
  
  var cursorL: HTMLDivElement = js.native
  
  @JSName("draw")
  def draw_MGardenMinigame(): Unit = js.native
  
  /**
    * Randomly unlocks an upgrade based on the rate, affected by seedless to nay
    */
  def dropUpgrade(upgrade: String, rate: Double): Unit = js.native
  
  var freeze: PseudoBoolean = js.native
  
  /**
    *  Calculates the cost to plant the plant
    */
  def getCost(me: GardenPlant): Double = js.native
  
  /**
    * Computes the avaliable mutations for a tile
    * @param neighs The amount of neighbors for each plant
    * @param neighsM The amount of mature neighbors for each plant
    * @returns An array of possible mutations, first value is the name of the plant, the second on is the raw chance
    */
  def getMuts(neighs: Record[String, Double], neighsM: Record[String, Double]): js.Array[js.Tuple2[String, Double]] = js.native
  
  /**
    * Generates the description of the plant as an HTML string
    */
  def getPlantDesc(me: GardenPlant): String = js.native
  
  /**
    * Gets the plot tile under the coordinates, with some sanity checks
    */
  def getTile(x: Double, y: Double): js.Tuple2[Double, Double] = js.native
  
  /**
    * Counts and returns the amount of unlocked plants
    */
  def getUnlockedN(): Double = js.native
  
  /**
    * Harvests a plot space
    * @param manual Unused
    * @returns If the operation was successful
    */
  def harvest(x: Double, y: Double, manual: Unit): Boolean = js.native
  
  /**
    * Harvests all plants
    * @param type If set and not null, filters to only harvesting that type of plant
    * @param mature If set and true, filters to only harvesting mature plants
    * @param mortal If set and true, filters to only harvesting mortal plants
    */
  def harvestAll(): Unit = js.native
  def harvestAll(`type`: Null, mature: Boolean): Unit = js.native
  def harvestAll(`type`: Null, mature: Boolean, mortal: Boolean): Unit = js.native
  def harvestAll(`type`: Null, mature: Unit, mortal: Boolean): Unit = js.native
  def harvestAll(`type`: Unit, mature: Boolean): Unit = js.native
  def harvestAll(`type`: Unit, mature: Boolean, mortal: Boolean): Unit = js.native
  def harvestAll(`type`: Unit, mature: Unit, mortal: Boolean): Unit = js.native
  def harvestAll(`type`: GardenPlant): Unit = js.native
  def harvestAll(`type`: GardenPlant, mature: Boolean): Unit = js.native
  def harvestAll(`type`: GardenPlant, mature: Boolean, mortal: Boolean): Unit = js.native
  def harvestAll(`type`: GardenPlant, mature: Unit, mortal: Boolean): Unit = js.native
  def harvestAll(`type`: PseudoNull): Unit = js.native
  def harvestAll(`type`: PseudoNull, mature: Boolean): Unit = js.native
  def harvestAll(`type`: PseudoNull, mature: Boolean, mortal: Boolean): Unit = js.native
  def harvestAll(`type`: PseudoNull, mature: Unit, mortal: Boolean): Unit = js.native
  
  /**
    * The amount of harvested plants this ascension
    */
  var harvests: Double = js.native
  
  /**
    * The amount of harvested plants all time
    */
  var harvestsTotal: Double = js.native
  
  /**
    * Hides the currently selected seed
    */
  def hideCursor(): Unit = js.native
  
  /**
    * Determines if the tile is unlocked
    */
  def isTileUnlocked(x: Double, y: Double): Boolean = js.native
  
  /**
    * Locks a seed
    * @returns Always true, due to a bug in the code
    */
  def lockSeed(me: GardenPlant): `true` = js.native
  
  @JSName("logic")
  def logic_MGardenMinigame(): Unit = js.native
  
  /**
    * The amount of times to attempt mutation
    */
  var loopsMult: Double = js.native
  
  var lumpRefill: HTMLDivElement = js.native
  
  @JSName("name")
  var name_GardenMinigame: Garden = js.native
  
  /**
    * Unused @deprecated
    */
  var nextFreeze: Double = js.native
  
  /**
    * The next time the soil can be switched
    */
  var nextSoil: Double = js.native
  
  /**
    * The next time a step will be executed
    */
  var nextStep: Double = js.native
  
  @JSName("onLevel")
  def onLevel_MGardenMinigame(): Unit = js.native
  
  @JSName("onResize")
  def onResize_MGardenMinigame(): Unit = js.native
  
  @JSName("onRuinTheFun")
  def onRuinTheFun_MGardenMinigame(): Unit = js.native
  
  var plantContam: Record[String, Double] = js.native
  
  var plants: Record[String, GardenPlant] = js.native
  
  var plantsById: js.Array[GardenPlant] = js.native
  
  var plantsN: Double = js.native
  
  var plantsUnlockedN: Double = js.native
  
  /**
    * The whole tilegrid of the garden, first number is plant id, second is the age of the plant
    */
  var plot: js.Array[js.Array[js.Tuple2[Double, Double]]] = js.native
  
  /**
    * The tilegrid of garden boosts, first number is age multiplier, second is effect power multiplier, third being the weed multiplier
    */
  var plotBoost: js.Array[js.Array[js.Tuple3[Double, Double, Double]]] = js.native
  
  /**
    * The boundaries of the plot at different levels, the tuple values are
    * Start X, Start Y, End X, End Y
    * Just adding new entries to this won't add new plot sized, since the plot is only drawn up to [6,6]
    */
  var plotLimits: js.Array[js.Tuple4[Double, Double, Double, Double]] = js.native
  
  /**
    * Returns the HTML string for the refill tooltip
    */
  def refillTooltip(): String = js.native
  
  /**
    * The id of the currently held seed
    */
  var seedSelected: Double = js.native
  
  /**
    * Generates the tooltip for a seed
    */
  def seedTooltip(id: Double): js.Function0[String] = js.native
  
  /**
    * Shows the currently selected seed
    */
  def showCursor(): Unit = js.native
  
  /**
    * The id of the current soil
    */
  var soil: Double = js.native
  
  /**
    * Generates the tooltip for a soil
    */
  def soilTooltip(id: Double): js.Function0[String] = js.native
  
  var soils: Record[String, GardenSoil] = js.native
  
  var soilsById: js.Array[GardenSoil] = js.native
  
  /**
    * The amount of time in seconds before next tick
    */
  var stepT: Double = js.native
  
  /**
    * The size of a tile
    */
  var tileSize: `40` = js.native
  
  /**
    * Generates the tooltip for a tile
    */
  def tileTooltip(x: Double, y: Double): js.Function0[String] = js.native
  
  /**
    * If true, the garden bonuses will be recalculated next logic step
    */
  var toCompute: Boolean = js.native
  
  /**
    * If true, the plot will be rebuilt next draw
    */
  var toRebuild: Boolean = js.native
  
  /**
    * Generates the tooltip for a tool
    */
  def toolTooltip(id: Double): js.Function0[String] = js.native
  
  var tools: Record[String, GardenTool] = js.native
  
  var toolsById: js.Array[GardenTool] = js.native
  
  /**
    * Unlocks a seed
    * @returns If the operation was successful
    */
  def unlockSeed(me: GardenPlant): Boolean = js.native
  
  /**
    * Harvests or plants on the tile
    * @param what The seed to use for planting
    */
  def useTool(what: Double, x: Double, y: Double): Boolean = js.native
}
