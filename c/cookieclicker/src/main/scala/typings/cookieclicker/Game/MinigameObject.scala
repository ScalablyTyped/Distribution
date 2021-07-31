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

trait MinigameObject[T /* <: Minigame */]
  extends StObject
     with GameObject {
  
  @JSName("minigame")
  var minigame_MinigameObject: T
}
object MinigameObject {
  
  @scala.inline
  def apply[T /* <: Minigame */](
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
    minigame: T,
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
  ): MinigameObject[T] = {
    val __obj = js.Dynamic.literal(actionName = actionName.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any], art = art.asInstanceOf[js.Any], baseCps = baseCps.asInstanceOf[js.Any], basePrice = basePrice.asInstanceOf[js.Any], bought = bought.asInstanceOf[js.Any], bulkPrice = bulkPrice.asInstanceOf[js.Any], buy = js.Any.fromFunction1(buy), buyFree = js.Any.fromFunction1(buyFree), buyFunction = js.Any.fromFunction0(buyFunction), canvas = canvas.asInstanceOf[js.Any], cps = js.Any.fromFunction1(cps), ctx = ctx.asInstanceOf[js.Any], desc = desc.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], draw = js.Any.fromFunction0(draw), eachFrame = eachFrame.asInstanceOf[js.Any], extraName = extraName.asInstanceOf[js.Any], extraPlural = extraPlural.asInstanceOf[js.Any], fortune = fortune.asInstanceOf[js.Any], free = free.asInstanceOf[js.Any], getFree = js.Any.fromFunction1(getFree), getFreeRanks = js.Any.fromFunction1(getFreeRanks), getPrice = js.Any.fromFunction1(getPrice), getReverseSumPrice = js.Any.fromFunction1(getReverseSumPrice), getSellMultiplier = js.Any.fromFunction0(getSellMultiplier), getSumPrice = js.Any.fromFunction1(getSumPrice), highest = highest.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], iconColumn = iconColumn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], levelAchiev10 = levelAchiev10.asInstanceOf[js.Any], levelTooltip = js.Any.fromFunction0(levelTooltip), levelUp = js.Any.fromFunction0(levelUp), locked = locked.asInstanceOf[js.Any], minigame = minigame.asInstanceOf[js.Any], minigameLoaded = minigameLoaded.asInstanceOf[js.Any], minigameName = minigameName.asInstanceOf[js.Any], minigameSave = minigameSave.asInstanceOf[js.Any], minigameUrl = minigameUrl.asInstanceOf[js.Any], mouseOn = mouseOn.asInstanceOf[js.Any], mousePos = mousePos.asInstanceOf[js.Any], mute = js.Any.fromFunction1(mute), muted = muted.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], onMinigame = onMinigame.asInstanceOf[js.Any], pics = pics.asInstanceOf[js.Any], plural = plural.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], productionAchievs = productionAchievs.asInstanceOf[js.Any], rebuild = js.Any.fromFunction0(rebuild), redraw = js.Any.fromFunction0(redraw), refresh = js.Any.fromFunction0(refresh), sacrafice = js.Any.fromFunction1(sacrafice), sell = js.Any.fromFunction2(sell), single = single.asInstanceOf[js.Any], storedCps = storedCps.asInstanceOf[js.Any], storedTotalCps = storedTotalCps.asInstanceOf[js.Any], switchMinigame = js.Any.fromFunction1(switchMinigame), synergies = synergies.asInstanceOf[js.Any], tieredAchievs = tieredAchievs.asInstanceOf[js.Any], tieredUpgrades = tieredUpgrades.asInstanceOf[js.Any], tooltip = js.Any.fromFunction0(tooltip), totalCookies = totalCookies.asInstanceOf[js.Any], vanilla = vanilla.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinigameObject[T]]
  }
  
  @scala.inline
  implicit class MinigameObjectMutableBuilder[Self <: MinigameObject[?], T /* <: Minigame */] (val x: Self & MinigameObject[T]) extends AnyVal {
    
    @scala.inline
    def setMinigame(value: T): Self = StObject.set(x, "minigame", value.asInstanceOf[js.Any])
  }
}
