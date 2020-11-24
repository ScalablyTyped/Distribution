package typings.cookieclicker.Game

import typings.cookieclicker.CanvasRenderingContext2D
import typings.cookieclicker.anon.Frame
import typings.cookieclicker.cookieclickerBooleans.`false`
import typings.cookieclicker.cookieclickerNumbers.`0`
import typings.cookieclicker.cookieclickerStrings.fortune
import typings.std.HTMLCanvasElement
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GameObject extends js.Object {
  
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
  var iconFunc: js.UndefOr[js.Function1[/* type */ js.UndefOr[scala.Nothing], js.Tuple2[Double, Double]]] = js.native
  
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
  var pics: js.Array[Frame] = js.native
  
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
  def sacrafice(amount: Double): Unit = js.native
  
  /**
    * Sells buildings and refunds a part of the cost, see `getSellMultiplier` for the exact multiplier
    * @param amount The amount of buildings to sell
    */
  def sell(amount: Double, bypass: js.UndefOr[scala.Nothing]): Unit = js.native
  
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
  
  var tieredAchievs: js.Array[TieredAchievementClass[Double]] = js.native
  
  var tieredUpgrades: js.Array[TieredUpgradeClass[Double]] = js.native
  
  /**
    * Generates a tooltip to show on the shop listing.
    * @return A string with the html elements
    */
  def tooltip(): String = js.native
  
  /**
    * Total cookies produced by the building
    */
  var totalCookies: Double = js.native
  
  var vanilla: PseudoBoolean = js.native
}
object GameObject {
  
  @scala.inline
  def apply(
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
    sell: (Double, js.UndefOr[scala.Nothing]) => Unit,
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
  
  @scala.inline
  implicit class GameObjectOps[Self <: GameObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActionName(value: String): Self = this.set("actionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmount(value: Double): Self = this.set("amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArt(value: Art): Self = this.set("art", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseCps(value: Double): Self = this.set("baseCps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasePrice(value: Double): Self = this.set("basePrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBought(value: Double): Self = this.set("bought", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBulkPrice(value: Double): Self = this.set("bulkPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuy(value: Double => Unit | `0`): Self = this.set("buy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBuyFree(value: Double => Unit): Self = this.set("buyFree", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBuyFunction(value: () => Unit): Self = this.set("buyFunction", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCanvas(value: HTMLCanvasElement): Self = this.set("canvas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCps(value: GameObject => Double): Self = this.set("cps", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCtx(value: CanvasRenderingContext2D): Self = this.set("ctx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesc(value: String): Self = this.set("desc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraw(value: () => Unit | `false`): Self = this.set("draw", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEachFrameFunction0(value: () => Unit): Self = this.set("eachFrame", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEachFrame(value: js.Function0[Unit] | PseudoNull): Self = this.set("eachFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraName(value: String): Self = this.set("extraName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraPlural(value: String): Self = this.set("extraPlural", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFortune(value: TieredUpgradeClass[fortune] | PseudoNull): Self = this.set("fortune", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFree(value: Double): Self = this.set("free", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetFree(value: Double => Unit): Self = this.set("getFree", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetFreeRanks(value: Double => Unit): Self = this.set("getFreeRanks", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetPrice(value: Double => Double): Self = this.set("getPrice", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetReverseSumPrice(value: Double => Double): Self = this.set("getReverseSumPrice", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSellMultiplier(value: () => Double): Self = this.set("getSellMultiplier", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSumPrice(value: Double => Double): Self = this.set("getSumPrice", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHighest(value: Double): Self = this.set("highest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcon(value: Double): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconColumn(value: Double): Self = this.set("iconColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setL(value: HTMLDivElement): Self = this.set("l", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelAchiev10(value: Achievement): Self = this.set("levelAchiev10", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelTooltip(value: () => String): Self = this.set("levelTooltip", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLevelUp(value: () => js.Function0[Unit]): Self = this.set("levelUp", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLocked(value: PseudoBoolean): Self = this.set("locked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinigameLoaded(value: Boolean): Self = this.set("minigameLoaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinigameName(value: String): Self = this.set("minigameName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinigameSave(value: String): Self = this.set("minigameSave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinigameUrl(value: String): Self = this.set("minigameUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseOn(value: Boolean): Self = this.set("mouseOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMousePos(value: js.Tuple2[Double, Double]): Self = this.set("mousePos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMute(value: Double => Unit): Self = this.set("mute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMuted(value: Double): Self = this.set("muted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setN(value: Double): Self = this.set("n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMinigame(value: Double): Self = this.set("onMinigame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPicsVarargs(value: Frame*): Self = this.set("pics", js.Array(value :_*))
    
    @scala.inline
    def setPics(value: js.Array[Frame]): Self = this.set("pics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlural(value: String): Self = this.set("plural", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrice(value: Double): Self = this.set("price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductionAchievsVarargs(value: ProductionAchievementRequirement*): Self = this.set("productionAchievs", js.Array(value :_*))
    
    @scala.inline
    def setProductionAchievs(value: js.Array[ProductionAchievementRequirement]): Self = this.set("productionAchievs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRebuild(value: () => Unit): Self = this.set("rebuild", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRedraw(value: () => Unit): Self = this.set("redraw", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRefresh(value: () => Unit): Self = this.set("refresh", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSacrafice(value: Double => Unit): Self = this.set("sacrafice", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSell(value: (Double, js.UndefOr[scala.Nothing]) => Unit): Self = this.set("sell", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSingle(value: String): Self = this.set("single", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoredCps(value: Double): Self = this.set("storedCps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoredTotalCps(value: Double): Self = this.set("storedTotalCps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwitchMinigame(value: Double => Unit): Self = this.set("switchMinigame", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSynergiesVarargs(value: SynergyUpgradeClass[String]*): Self = this.set("synergies", js.Array(value :_*))
    
    @scala.inline
    def setSynergies(value: js.Array[SynergyUpgradeClass[String]]): Self = this.set("synergies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTieredAchievsVarargs(value: TieredAchievementClass[Double]*): Self = this.set("tieredAchievs", js.Array(value :_*))
    
    @scala.inline
    def setTieredAchievs(value: js.Array[TieredAchievementClass[Double]]): Self = this.set("tieredAchievs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTieredUpgradesVarargs(value: TieredUpgradeClass[Double]*): Self = this.set("tieredUpgrades", js.Array(value :_*))
    
    @scala.inline
    def setTieredUpgrades(value: js.Array[TieredUpgradeClass[Double]]): Self = this.set("tieredUpgrades", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltip(value: () => String): Self = this.set("tooltip", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTotalCookies(value: Double): Self = this.set("totalCookies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVanilla(value: PseudoBoolean): Self = this.set("vanilla", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrandma(value: GrandmaSynergyClass): Self = this.set("grandma", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrandma: Self = this.set("grandma", js.undefined)
    
    @scala.inline
    def setIconFunc(value: /* type */ js.UndefOr[scala.Nothing] => js.Tuple2[Double, Double]): Self = this.set("iconFunc", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteIconFunc: Self = this.set("iconFunc", js.undefined)
    
    @scala.inline
    def setMinigame(value: Minigame): Self = this.set("minigame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinigame: Self = this.set("minigame", js.undefined)
    
    @scala.inline
    def setMinigameLoading(value: Boolean): Self = this.set("minigameLoading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinigameLoading: Self = this.set("minigameLoading", js.undefined)
  }
}
