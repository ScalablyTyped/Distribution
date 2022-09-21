package typings.cookieclicker.Game

import typings.cookieclicker.CanvasRenderingContext2D
import typings.cookieclicker.cookieclickerBooleans.`false`
import typings.cookieclicker.cookieclickerNumbers.`0`
import typings.std.HTMLCanvasElement
import typings.std.HTMLDivElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GameObject extends StObject {
  
  /**
    * The way the building makes cookies
    */
  var actionName: String = js.native
  
  /**
    * The amount of buildings owned, including free ones
    */
  var amount: Double = js.native
  
  /**
    * The art the building uses
    */
  var art: Art = js.native
  
  /**
    * The CpS the building generates without any boosts
    */
  var baseCps: Double = js.native
  
  /**
    * The price the building generates without any boosts
    */
  var basePrice: Double = js.native
  
  /**
    * The amount of times a building has been bought, including free buys
    */
  var bought: Double = js.native
  
  /**
    * The current price displayed in store
    */
  var bulkPrice: Double = js.native
  
  /**
    * Buys a building
    * @param amount Amount of buildings to buy, defaults to `Game.buyBulk`
    */
  def buy(): Unit | `0` = js.native
  def buy(amount: Double): Unit | `0` = js.native
  
  /**
    * Buys a building for free, while increasing the price
    * @param amount Amount of buildings to buy
    */
  def buyFree(amount: Double): Unit = js.native
  
  /**
    * The function that gets called on buy
    */
  def buyFunction(): Unit = js.native
  
  /**
    * The canvas for art
    */
  var canvas: HTMLCanvasElement = js.native
  
  /**
    * The function to calculate CPS
    * @param me The building itself
    */
  def cps(me: GameObject): Double = js.native
  
  /**
    * The context from canvas for the art
    */
  var ctx: CanvasRenderingContext2D = js.native
  
  /**
    * The visual description for the building
    */
  var desc: String = js.native
  
  /**
    * The visual name for the building(an html string)
    */
  var displayName: String = js.native
  
  var dname: String = js.native
  
  /**
    * Redraws the art
    */
  def draw(): Unit | `false` = js.native
  
  /**
    * The function to get called, well, each frame
    */
  var eachFrame: js.Function0[Unit] | PseudoNull = js.native
  
  /**
    * The description of how the level changes the building, used for one lump, where [X] is the level
    */
  var extraName: String = js.native
  
  /**
    * The description of how the level changes the building, used for multiple lumps, where [X] is the level
    */
  var extraPlural: String = js.native
  
  /**
    * The fortune upgrade tied with the building
    */
  var fortune: TieredUpgradeClass[typings.cookieclicker.cookieclickerStrings.fortune] | PseudoNull = js.native
  
  /**
    * The amount of buildings gotten for free
    */
  var free: Double = js.native
  
  /**
    * Buys a building for free, while *not* increasing the price
    * @param amount Amount of buildings to get
    */
  def getFree(amount: Double): Unit = js.native
  
  /**
    * Convert buildings to free buildings
    * @param amount The amount of buildings to convert
    */
  def getFreeRanks(amount: Double): Unit = js.native
  
  /**
    * Get the current price of building
    * @param n Unused parameter
    */
  def getPrice(n: Double): Double = js.native
  
  /**
    * Get the cookies gained by selling an amount of buildings
    * @param amount The amount of buildings to sell
    */
  def getReverseSumPrice(amount: Double): Double = js.native
  
  /**
    * Gets the sell multiplier and returns it
    * As of 2.029, the multiplier is 25% * (1 + aura multiplier of Earth Shatterer)
    */
  def getSellMultiplier(): Double = js.native
  
  /**
    * Get the price of buying an amount of buildings
    * @param amount The amount of buildings to buy
    */
  def getSumPrice(amount: Double): Double = js.native
  
  var grandma: js.UndefOr[GrandmaSynergyClass] = js.native
  
  /**
    * The highest amount of buildings owned this run
    */
  var highest: Double = js.native
  
  /**
    * The row to be used in the big icon
    */
  var icon: Double = js.native
  
  /**
    * The column to be used for the icon (Tier upgrade icons are derived from this)
    */
  var iconColumn: Double = js.native
  
  /**
    * The function that determines the buildings big icon, overridden by business day
    */
  var iconFunc: js.UndefOr[js.Function1[/* type */ Unit, js.Tuple2[Double, Double]]] = js.native
  
  /**
    * Buildings id, 0 based
    */
  var id: Double = js.native
  
  /**
    * Buildings listing in store
    */
  var l: HTMLDivElement = js.native
  
  var level: Double = js.native
  
  var levelAchiev10: Achievement = js.native
  
  def levelTooltip(): String = js.native
  
  def levelUp(): js.Function0[Unit] = js.native
  
  /**
    * If the building is visually locked, is considered unlocked after CBTA is higher than the base cost
    */
  var locked: PseudoBoolean = js.native
  
  var minigame: js.UndefOr[Minigame] = js.native
  
  var minigameLoaded: Boolean = js.native
  
  var minigameLoading: js.UndefOr[Boolean] = js.native
  
  var minigameName: String = js.native
  
  var minigameSave: String = js.native
  
  var minigameUrl: String = js.native
  
  var mouseOn: Boolean = js.native
  
  var mousePos: js.Tuple2[Double, Double] = js.native
  
  /**
    * Mutes or unmutes the building, depending on `val`
    * @param val The new muted status, 0 for unmuted, 1 for muted
    */
  def mute(`val`: Double): Unit = js.native
  
  var muted: Double = js.native
  
  /**
    * Same as id
    */
  var n: Double = js.native
  
  var name: String = js.native
  
  var onMinigame: Double = js.native
  
  /**
    * The singular pictures used in the art
    */
  var pics: js.Array[BuildingArtPicture] = js.native
  
  var plural: String = js.native
  
  var price: Double = js.native
  
  var productionAchievs: js.Array[ProductionAchievementRequirement] = js.native
  
  /**
    * Updates store listing and art buttons
    */
  def rebuild(): Unit = js.native
  
  /**
    * Resets `this.pics`, see `draw` for actual redrawing
    */
  def redraw(): Unit = js.native
  
  /**
    * Updates price, bulk price and art appearance, calls `rebuild`
    */
  def refresh(): Unit = js.native
  
  /**
    * Sells buildings without refunding the cookies
    * @param amount The amount of buildings to sacrifice
    */
  def sacrifice(amount: Double): Unit = js.native
  
  /**
    * Sells buildings and refunds a part of the cost, see `getSellMultiplier` for the exact multiplier
    * @param amount The amount of buildings to sell
    */
  def sell(amount: Double, bypass: Unit): Unit = js.native
  
  var single: String = js.native
  
  /**
    * Amount of CpS a building produces (as of 2.031, `this.cps` * level bonus)
    */
  var storedCps: Double = js.native
  
  /**
    *  Amount of CpS a building produces, multiplied by amount (as of 2.027, `this.cps` * level bonus)
    */
  var storedTotalCps: Double = js.native
  
  def switchMinigame(on: Double): Unit = js.native
  
  var synergies: js.Array[SynergyUpgradeClass[String]] = js.native
  
  var tieredAchievs: Record[String | Double, TieredAchievementClass[String | Double]] = js.native
  
  var tieredUpgrades: Record[String | Double, TieredUpgradeClass[String | Double]] = js.native
  
  /**
    * Generates a tooltip to show on the shop listing.
    * @return A string with the html elements
    */
  def tooltip(): String = js.native
  
  /**
    * Total cookies produced by the building
    */
  var totalCookies: Double = js.native
  
  var unshackleUpgrade: js.UndefOr[HeavenlyUpgrade] = js.native
  
  var vanilla: PseudoBoolean = js.native
}
