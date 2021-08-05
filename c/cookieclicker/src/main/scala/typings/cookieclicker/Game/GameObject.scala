package typings.cookieclicker.Game

import typings.cookieclicker.CanvasRenderingContext2D
import typings.cookieclicker.anon.Frame
import typings.cookieclicker.cookieclickerBooleans.`false`
import typings.cookieclicker.cookieclickerNumbers.`0`
import typings.cookieclicker.cookieclickerStrings.fortune
import typings.std.HTMLCanvasElement
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GameObject extends StObject {
  
  /**
    * The way the building makes cookies
    */
  var actionName: String
  
  /**
    * The amount of buildings owned, including free ones
    */
  var amount: Double
  
  /**
    * The art the building uses
    */
  var art: Art
  
  /**
    * The CpS the building generates without any boosts
    */
  var baseCps: Double
  
  /**
    * The price the building generates without any boosts
    */
  var basePrice: Double
  
  /**
    * The amount of times a building has been bought, including free buys
    */
  var bought: Double
  
  /**
    * The current price displayed in store
    */
  var bulkPrice: Double
  
  /**
    * Buys a building
    * @param amount Amount of buildings to buy, defaults to `Game.buyBulk`
    */
  def buy(amount: Double): Unit | `0`
  
  /**
    * Buys a building for free, while increasing the price
    * @param amount Amount of buildings to buy
    */
  def buyFree(amount: Double): Unit
  
  /**
    * The function that gets called on buy
    */
  def buyFunction(): Unit
  
  /**
    * The canvas for art
    */
  var canvas: HTMLCanvasElement
  
  /**
    * The function to calculate CPS
    * @param me The building itself
    */
  def cps(me: GameObject): Double
  
  /**
    * The context from canvas for the art
    */
  var ctx: CanvasRenderingContext2D
  
  /**
    * The visual description for the building
    */
  var desc: String
  
  /**
    * The visual name for the building(an html string)
    */
  var displayName: String
  
  /**
    * Redraws the art
    */
  def draw(): Unit | `false`
  
  /**
    * The function to get called, well, each frame
    */
  var eachFrame: js.Function0[Unit] | PseudoNull
  
  /**
    * The description of how the level changes the building, used for one lump, where [X] is the level
    */
  var extraName: String
  
  /**
    * The description of how the level changes the building, used for multiple lumps, where [X] is the level
    */
  var extraPlural: String
  
  /**
    * The fortune upgrade tied with the building
    */
  var fortune: TieredUpgradeClass[typings.cookieclicker.cookieclickerStrings.fortune] | PseudoNull
  
  /**
    * The amount of buildings gotten for free
    */
  var free: Double
  
  /**
    * Buys a building for free, while *not* increasing the price
    * @param amount Amount of buildings to get
    */
  def getFree(amount: Double): Unit
  
  /**
    * Convert buildings to free buildings
    * @param amount The amount of buildings to convert
    */
  def getFreeRanks(amount: Double): Unit
  
  /**
    * Get the current price of building
    * @param n Unused parameter
    */
  def getPrice(n: Double): Double
  
  /**
    * Get the cookies gained by selling an amount of buildings
    * @param amount The amount of buildings to sell
    */
  def getReverseSumPrice(amount: Double): Double
  
  /**
    * Gets the sell multiplier and returns it
    * As of 2.029, the multiplier is 25% * (1 + aura multiplier of Earth Shatterer)
    */
  def getSellMultiplier(): Double
  
  /**
    * Get the price of buying an amount of buildings
    * @param amount The amount of buildings to buy
    */
  def getSumPrice(amount: Double): Double
  
  var grandma: js.UndefOr[GrandmaSynergyClass] = js.undefined
  
  /**
    * The highest amount of buildings owned this run
    */
  var highest: Double
  
  /**
    * The row to be used in the big icon
    */
  var icon: Double
  
  /**
    * The column to be used for the icon (Tier upgrade icons are derived from this)
    */
  var iconColumn: Double
  
  /**
    * The function that determines the buildings big icon, overridden by business day
    */
  var iconFunc: js.UndefOr[js.Function1[/* type */ Unit, js.Tuple2[Double, Double]]] = js.undefined
  
  /**
    * Buildings id, 0 based
    */
  var id: Double
  
  /**
    * Buildings listing in store
    */
  var l: HTMLDivElement
  
  var level: Double
  
  var levelAchiev10: Achievement
  
  def levelTooltip(): String
  
  def levelUp(): js.Function0[Unit]
  
  /**
    * If the building is visually locked, is considered unlocked after CBTA is higher than the base cost
    */
  var locked: PseudoBoolean
  
  var minigame: js.UndefOr[Minigame] = js.undefined
  
  var minigameLoaded: Boolean
  
  var minigameLoading: js.UndefOr[Boolean] = js.undefined
  
  var minigameName: String
  
  var minigameSave: String
  
  var minigameUrl: String
  
  var mouseOn: Boolean
  
  var mousePos: js.Tuple2[Double, Double]
  
  /**
    * Mutes or unmutes the building, depending on `val`
    * @param val The new muted status, 0 for unmuted, 1 for muted
    */
  def mute(`val`: Double): Unit
  
  var muted: Double
  
  /**
    * Same as id
    */
  var n: Double
  
  var name: String
  
  var onMinigame: Double
  
  /**
    * The singular pictures used in the art
    */
  var pics: js.Array[Frame]
  
  var plural: String
  
  var price: Double
  
  var productionAchievs: js.Array[ProductionAchievementRequirement]
  
  /**
    * Updates store listing and art buttons
    */
  def rebuild(): Unit
  
  /**
    * Resets `this.pics`, see `draw` for actual redrawing
    */
  def redraw(): Unit
  
  /**
    * Updates price, bulk price and art appearance, calls `rebuild`
    */
  def refresh(): Unit
  
  /**
    * Sells buildings without refunding the cookies
    * @param amount The amount of buildings to sacrifice
    */
  def sacrafice(amount: Double): Unit
  
  /**
    * Sells buildings and refunds a part of the cost, see `getSellMultiplier` for the exact multiplier
    * @param amount The amount of buildings to sell
    */
  def sell(amount: Double, bypass: Unit): Unit
  
  var single: String
  
  /**
    * Amount of CpS a building produces (as of 2.031, `this.cps` * level bonus)
    */
  var storedCps: Double
  
  /**
    *  Amount of CpS a building produces, multiplied by amount (as of 2.027, `this.cps` * level bonus)
    */
  var storedTotalCps: Double
  
  def switchMinigame(on: Double): Unit
  
  var synergies: js.Array[SynergyUpgradeClass[String]]
  
  var tieredAchievs: js.Array[TieredAchievementClass[Double]]
  
  var tieredUpgrades: js.Array[TieredUpgradeClass[Double]]
  
  /**
    * Generates a tooltip to show on the shop listing.
    * @return A string with the html elements
    */
  def tooltip(): String
  
  /**
    * Total cookies produced by the building
    */
  var totalCookies: Double
  
  var vanilla: PseudoBoolean
}
object GameObject {
  
  inline def apply(
    actionName: String,
    amount: Double,
    art: Art,
    baseCps: Double,
    basePrice: Double,
    bought: Double,
    bulkPrice: Double,
    buy: Double => Unit | `0`,
    buyFree: Double => Unit,
    buyFunction: () => Unit,
    canvas: HTMLCanvasElement,
    cps: GameObject => Double,
    ctx: CanvasRenderingContext2D,
    desc: String,
    displayName: String,
    draw: () => Unit | `false`,
    eachFrame: js.Function0[Unit] | PseudoNull,
    extraName: String,
    extraPlural: String,
    fortune: TieredUpgradeClass[fortune] | PseudoNull,
    free: Double,
    getFree: Double => Unit,
    getFreeRanks: Double => Unit,
    getPrice: Double => Double,
    getReverseSumPrice: Double => Double,
    getSellMultiplier: () => Double,
    getSumPrice: Double => Double,
    highest: Double,
    icon: Double,
    iconColumn: Double,
    id: Double,
    l: HTMLDivElement,
    level: Double,
    levelAchiev10: Achievement,
    levelTooltip: () => String,
    levelUp: () => js.Function0[Unit],
    locked: PseudoBoolean,
    minigameLoaded: Boolean,
    minigameName: String,
    minigameSave: String,
    minigameUrl: String,
    mouseOn: Boolean,
    mousePos: js.Tuple2[Double, Double],
    mute: Double => Unit,
    muted: Double,
    n: Double,
    name: String,
    onMinigame: Double,
    pics: js.Array[Frame],
    plural: String,
    price: Double,
    productionAchievs: js.Array[ProductionAchievementRequirement],
    rebuild: () => Unit,
    redraw: () => Unit,
    refresh: () => Unit,
    sacrafice: Double => Unit,
    sell: (Double, Unit) => Unit,
    single: String,
    storedCps: Double,
    storedTotalCps: Double,
    switchMinigame: Double => Unit,
    synergies: js.Array[SynergyUpgradeClass[String]],
    tieredAchievs: js.Array[TieredAchievementClass[Double]],
    tieredUpgrades: js.Array[TieredUpgradeClass[Double]],
    tooltip: () => String,
    totalCookies: Double,
    vanilla: PseudoBoolean
  ): GameObject = {
    val __obj = js.Dynamic.literal(actionName = actionName.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any], art = art.asInstanceOf[js.Any], baseCps = baseCps.asInstanceOf[js.Any], basePrice = basePrice.asInstanceOf[js.Any], bought = bought.asInstanceOf[js.Any], bulkPrice = bulkPrice.asInstanceOf[js.Any], buy = js.Any.fromFunction1(buy), buyFree = js.Any.fromFunction1(buyFree), buyFunction = js.Any.fromFunction0(buyFunction), canvas = canvas.asInstanceOf[js.Any], cps = js.Any.fromFunction1(cps), ctx = ctx.asInstanceOf[js.Any], desc = desc.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], draw = js.Any.fromFunction0(draw), eachFrame = eachFrame.asInstanceOf[js.Any], extraName = extraName.asInstanceOf[js.Any], extraPlural = extraPlural.asInstanceOf[js.Any], fortune = fortune.asInstanceOf[js.Any], free = free.asInstanceOf[js.Any], getFree = js.Any.fromFunction1(getFree), getFreeRanks = js.Any.fromFunction1(getFreeRanks), getPrice = js.Any.fromFunction1(getPrice), getReverseSumPrice = js.Any.fromFunction1(getReverseSumPrice), getSellMultiplier = js.Any.fromFunction0(getSellMultiplier), getSumPrice = js.Any.fromFunction1(getSumPrice), highest = highest.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], iconColumn = iconColumn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], levelAchiev10 = levelAchiev10.asInstanceOf[js.Any], levelTooltip = js.Any.fromFunction0(levelTooltip), levelUp = js.Any.fromFunction0(levelUp), locked = locked.asInstanceOf[js.Any], minigameLoaded = minigameLoaded.asInstanceOf[js.Any], minigameName = minigameName.asInstanceOf[js.Any], minigameSave = minigameSave.asInstanceOf[js.Any], minigameUrl = minigameUrl.asInstanceOf[js.Any], mouseOn = mouseOn.asInstanceOf[js.Any], mousePos = mousePos.asInstanceOf[js.Any], mute = js.Any.fromFunction1(mute), muted = muted.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], onMinigame = onMinigame.asInstanceOf[js.Any], pics = pics.asInstanceOf[js.Any], plural = plural.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], productionAchievs = productionAchievs.asInstanceOf[js.Any], rebuild = js.Any.fromFunction0(rebuild), redraw = js.Any.fromFunction0(redraw), refresh = js.Any.fromFunction0(refresh), sacrafice = js.Any.fromFunction1(sacrafice), sell = js.Any.fromFunction2(sell), single = single.asInstanceOf[js.Any], storedCps = storedCps.asInstanceOf[js.Any], storedTotalCps = storedTotalCps.asInstanceOf[js.Any], switchMinigame = js.Any.fromFunction1(switchMinigame), synergies = synergies.asInstanceOf[js.Any], tieredAchievs = tieredAchievs.asInstanceOf[js.Any], tieredUpgrades = tieredUpgrades.asInstanceOf[js.Any], tooltip = js.Any.fromFunction0(tooltip), totalCookies = totalCookies.asInstanceOf[js.Any], vanilla = vanilla.asInstanceOf[js.Any])
    __obj.asInstanceOf[GameObject]
  }
  
  extension [Self <: GameObject](x: Self) {
    
    inline def setActionName(value: String): Self = StObject.set(x, "actionName", value.asInstanceOf[js.Any])
    
    inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setArt(value: Art): Self = StObject.set(x, "art", value.asInstanceOf[js.Any])
    
    inline def setBaseCps(value: Double): Self = StObject.set(x, "baseCps", value.asInstanceOf[js.Any])
    
    inline def setBasePrice(value: Double): Self = StObject.set(x, "basePrice", value.asInstanceOf[js.Any])
    
    inline def setBought(value: Double): Self = StObject.set(x, "bought", value.asInstanceOf[js.Any])
    
    inline def setBulkPrice(value: Double): Self = StObject.set(x, "bulkPrice", value.asInstanceOf[js.Any])
    
    inline def setBuy(value: Double => Unit | `0`): Self = StObject.set(x, "buy", js.Any.fromFunction1(value))
    
    inline def setBuyFree(value: Double => Unit): Self = StObject.set(x, "buyFree", js.Any.fromFunction1(value))
    
    inline def setBuyFunction(value: () => Unit): Self = StObject.set(x, "buyFunction", js.Any.fromFunction0(value))
    
    inline def setCanvas(value: HTMLCanvasElement): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
    
    inline def setCps(value: GameObject => Double): Self = StObject.set(x, "cps", js.Any.fromFunction1(value))
    
    inline def setCtx(value: CanvasRenderingContext2D): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    inline def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDraw(value: () => Unit | `false`): Self = StObject.set(x, "draw", js.Any.fromFunction0(value))
    
    inline def setEachFrame(value: js.Function0[Unit] | PseudoNull): Self = StObject.set(x, "eachFrame", value.asInstanceOf[js.Any])
    
    inline def setEachFrameFunction0(value: () => Unit): Self = StObject.set(x, "eachFrame", js.Any.fromFunction0(value))
    
    inline def setExtraName(value: String): Self = StObject.set(x, "extraName", value.asInstanceOf[js.Any])
    
    inline def setExtraPlural(value: String): Self = StObject.set(x, "extraPlural", value.asInstanceOf[js.Any])
    
    inline def setFortune(value: TieredUpgradeClass[fortune] | PseudoNull): Self = StObject.set(x, "fortune", value.asInstanceOf[js.Any])
    
    inline def setFree(value: Double): Self = StObject.set(x, "free", value.asInstanceOf[js.Any])
    
    inline def setGetFree(value: Double => Unit): Self = StObject.set(x, "getFree", js.Any.fromFunction1(value))
    
    inline def setGetFreeRanks(value: Double => Unit): Self = StObject.set(x, "getFreeRanks", js.Any.fromFunction1(value))
    
    inline def setGetPrice(value: Double => Double): Self = StObject.set(x, "getPrice", js.Any.fromFunction1(value))
    
    inline def setGetReverseSumPrice(value: Double => Double): Self = StObject.set(x, "getReverseSumPrice", js.Any.fromFunction1(value))
    
    inline def setGetSellMultiplier(value: () => Double): Self = StObject.set(x, "getSellMultiplier", js.Any.fromFunction0(value))
    
    inline def setGetSumPrice(value: Double => Double): Self = StObject.set(x, "getSumPrice", js.Any.fromFunction1(value))
    
    inline def setGrandma(value: GrandmaSynergyClass): Self = StObject.set(x, "grandma", value.asInstanceOf[js.Any])
    
    inline def setGrandmaUndefined: Self = StObject.set(x, "grandma", js.undefined)
    
    inline def setHighest(value: Double): Self = StObject.set(x, "highest", value.asInstanceOf[js.Any])
    
    inline def setIcon(value: Double): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconColumn(value: Double): Self = StObject.set(x, "iconColumn", value.asInstanceOf[js.Any])
    
    inline def setIconFunc(value: /* type */ Unit => js.Tuple2[Double, Double]): Self = StObject.set(x, "iconFunc", js.Any.fromFunction1(value))
    
    inline def setIconFuncUndefined: Self = StObject.set(x, "iconFunc", js.undefined)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setL(value: HTMLDivElement): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
    
    inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelAchiev10(value: Achievement): Self = StObject.set(x, "levelAchiev10", value.asInstanceOf[js.Any])
    
    inline def setLevelTooltip(value: () => String): Self = StObject.set(x, "levelTooltip", js.Any.fromFunction0(value))
    
    inline def setLevelUp(value: () => js.Function0[Unit]): Self = StObject.set(x, "levelUp", js.Any.fromFunction0(value))
    
    inline def setLocked(value: PseudoBoolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
    
    inline def setMinigame(value: Minigame): Self = StObject.set(x, "minigame", value.asInstanceOf[js.Any])
    
    inline def setMinigameLoaded(value: Boolean): Self = StObject.set(x, "minigameLoaded", value.asInstanceOf[js.Any])
    
    inline def setMinigameLoading(value: Boolean): Self = StObject.set(x, "minigameLoading", value.asInstanceOf[js.Any])
    
    inline def setMinigameLoadingUndefined: Self = StObject.set(x, "minigameLoading", js.undefined)
    
    inline def setMinigameName(value: String): Self = StObject.set(x, "minigameName", value.asInstanceOf[js.Any])
    
    inline def setMinigameSave(value: String): Self = StObject.set(x, "minigameSave", value.asInstanceOf[js.Any])
    
    inline def setMinigameUndefined: Self = StObject.set(x, "minigame", js.undefined)
    
    inline def setMinigameUrl(value: String): Self = StObject.set(x, "minigameUrl", value.asInstanceOf[js.Any])
    
    inline def setMouseOn(value: Boolean): Self = StObject.set(x, "mouseOn", value.asInstanceOf[js.Any])
    
    inline def setMousePos(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "mousePos", value.asInstanceOf[js.Any])
    
    inline def setMute(value: Double => Unit): Self = StObject.set(x, "mute", js.Any.fromFunction1(value))
    
    inline def setMuted(value: Double): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
    
    inline def setN(value: Double): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOnMinigame(value: Double): Self = StObject.set(x, "onMinigame", value.asInstanceOf[js.Any])
    
    inline def setPics(value: js.Array[Frame]): Self = StObject.set(x, "pics", value.asInstanceOf[js.Any])
    
    inline def setPicsVarargs(value: Frame*): Self = StObject.set(x, "pics", js.Array(value :_*))
    
    inline def setPlural(value: String): Self = StObject.set(x, "plural", value.asInstanceOf[js.Any])
    
    inline def setPrice(value: Double): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setProductionAchievs(value: js.Array[ProductionAchievementRequirement]): Self = StObject.set(x, "productionAchievs", value.asInstanceOf[js.Any])
    
    inline def setProductionAchievsVarargs(value: ProductionAchievementRequirement*): Self = StObject.set(x, "productionAchievs", js.Array(value :_*))
    
    inline def setRebuild(value: () => Unit): Self = StObject.set(x, "rebuild", js.Any.fromFunction0(value))
    
    inline def setRedraw(value: () => Unit): Self = StObject.set(x, "redraw", js.Any.fromFunction0(value))
    
    inline def setRefresh(value: () => Unit): Self = StObject.set(x, "refresh", js.Any.fromFunction0(value))
    
    inline def setSacrafice(value: Double => Unit): Self = StObject.set(x, "sacrafice", js.Any.fromFunction1(value))
    
    inline def setSell(value: (Double, Unit) => Unit): Self = StObject.set(x, "sell", js.Any.fromFunction2(value))
    
    inline def setSingle(value: String): Self = StObject.set(x, "single", value.asInstanceOf[js.Any])
    
    inline def setStoredCps(value: Double): Self = StObject.set(x, "storedCps", value.asInstanceOf[js.Any])
    
    inline def setStoredTotalCps(value: Double): Self = StObject.set(x, "storedTotalCps", value.asInstanceOf[js.Any])
    
    inline def setSwitchMinigame(value: Double => Unit): Self = StObject.set(x, "switchMinigame", js.Any.fromFunction1(value))
    
    inline def setSynergies(value: js.Array[SynergyUpgradeClass[String]]): Self = StObject.set(x, "synergies", value.asInstanceOf[js.Any])
    
    inline def setSynergiesVarargs(value: SynergyUpgradeClass[String]*): Self = StObject.set(x, "synergies", js.Array(value :_*))
    
    inline def setTieredAchievs(value: js.Array[TieredAchievementClass[Double]]): Self = StObject.set(x, "tieredAchievs", value.asInstanceOf[js.Any])
    
    inline def setTieredAchievsVarargs(value: TieredAchievementClass[Double]*): Self = StObject.set(x, "tieredAchievs", js.Array(value :_*))
    
    inline def setTieredUpgrades(value: js.Array[TieredUpgradeClass[Double]]): Self = StObject.set(x, "tieredUpgrades", value.asInstanceOf[js.Any])
    
    inline def setTieredUpgradesVarargs(value: TieredUpgradeClass[Double]*): Self = StObject.set(x, "tieredUpgrades", js.Array(value :_*))
    
    inline def setTooltip(value: () => String): Self = StObject.set(x, "tooltip", js.Any.fromFunction0(value))
    
    inline def setTotalCookies(value: Double): Self = StObject.set(x, "totalCookies", value.asInstanceOf[js.Any])
    
    inline def setVanilla(value: PseudoBoolean): Self = StObject.set(x, "vanilla", value.asInstanceOf[js.Any])
  }
}
