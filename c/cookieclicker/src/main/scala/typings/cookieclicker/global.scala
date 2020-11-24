package typings.cookieclicker

import typings.cookieclicker.Game.AchievementPool
import typings.cookieclicker.Game.Art
import typings.cookieclicker.Game.BankAchievementClass
import typings.cookieclicker.Game.Buff
import typings.cookieclicker.Game.ChoiceCosmetics
import typings.cookieclicker.Game.CookieUpgrade
import typings.cookieclicker.Game.CookieUpgradeParameter
import typings.cookieclicker.Game.CpsAchievementClass
import typings.cookieclicker.Game.DragonAura
import typings.cookieclicker.Game.DragonLevel
import typings.cookieclicker.Game.Effects
import typings.cookieclicker.Game.FoolBuilding
import typings.cookieclicker.Game.GrandmaSynergyClass
import typings.cookieclicker.Game.HeavenlyUpgrade
import typings.cookieclicker.Game.Icon
import typings.cookieclicker.Game.Milk
import typings.cookieclicker.Game.Mod
import typings.cookieclicker.Game.Particle
import typings.cookieclicker.Game.Prefs
import typings.cookieclicker.Game.PseudoBoolean
import typings.cookieclicker.Game.Season
import typings.cookieclicker.Game.SelectorSwitchChoice
import typings.cookieclicker.Game.ShimmerType
import typings.cookieclicker.Game.SynergyUpgradeClass
import typings.cookieclicker.Game.Tier
import typings.cookieclicker.Game.TieredAchievementClass
import typings.cookieclicker.Game.TieredUpgradeClass
import typings.cookieclicker.Game.Tooltip
import typings.cookieclicker.Game.TooltipOrigins
import typings.cookieclicker.Game.UnlockRequirement
import typings.cookieclicker.Game.Wrinkler
import typings.cookieclicker.Game.WrinklerSave
import typings.cookieclicker.anon.Bank
import typings.cookieclicker.cookieclickerBooleans.`false`
import typings.cookieclicker.cookieclickerNumbers.`-1`
import typings.cookieclicker.cookieclickerNumbers.`0`
import typings.cookieclicker.cookieclickerNumbers.`1`
import typings.cookieclicker.cookieclickerNumbers.`2`
import typings.cookieclicker.cookieclickerNumbers.`3`
import typings.cookieclicker.cookieclickerNumbers.`4`
import typings.cookieclicker.cookieclickerStrings.Farm
import typings.cookieclicker.cookieclickerStrings.Temple
import typings.cookieclicker.cookieclickerStrings.`Wizard tower`
import typings.cookieclicker.cookieclickerStrings.altDraw
import typings.cookieclicker.cookieclickerStrings.animate
import typings.cookieclicker.cookieclickerStrings.ascend
import typings.cookieclicker.cookieclickerStrings.askLumps
import typings.cookieclicker.cookieclickerStrings.autosave
import typings.cookieclicker.cookieclickerStrings.autoupdate
import typings.cookieclicker.cookieclickerStrings.cookiesPerClick
import typings.cookieclicker.cookieclickerStrings.cps
import typings.cookieclicker.cookieclickerStrings.cursors
import typings.cookieclicker.cookieclickerStrings.customGrandmas
import typings.cookieclicker.cookieclickerStrings.extraButtons
import typings.cookieclicker.cookieclickerStrings.fancy
import typings.cookieclicker.cookieclickerStrings.filters
import typings.cookieclicker.cookieclickerStrings.focus
import typings.cookieclicker.cookieclickerStrings.format
import typings.cookieclicker.cookieclickerStrings.milk
import typings.cookieclicker.cookieclickerStrings.monospace
import typings.cookieclicker.cookieclickerStrings.notifs
import typings.cookieclicker.cookieclickerStrings.numbers
import typings.cookieclicker.cookieclickerStrings.particles
import typings.cookieclicker.cookieclickerStrings.popups
import typings.cookieclicker.cookieclickerStrings.showBackupWarning
import typings.cookieclicker.cookieclickerStrings.stats
import typings.cookieclicker.cookieclickerStrings.store
import typings.cookieclicker.cookieclickerStrings.ticker
import typings.cookieclicker.cookieclickerStrings.timeout
import typings.cookieclicker.cookieclickerStrings.warn
import typings.cookieclicker.cookieclickerStrings.wobbly
import typings.std.DOMRect
import typings.std.Event
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.InputEvent
import typings.std.MouseEvent
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  def AddEvent(htmlElement: HTMLElement, eventName: String, eventFunction: js.Function1[/* e */ Event, Unit]): Unit = js.native
  
  /**
    * Beautifies a number
    * @param val The number to beautify
    * @param floats The amount of decimals to show
    */
  def Beautify(`val`: Double): String = js.native
  def Beautify(`val`: Double, floats: Double): String = js.native
  
  def PlaySound(url: String): Unit = js.native
  def PlaySound(url: String, volume: js.UndefOr[scala.Nothing], pitch: Double): Unit = js.native
  def PlaySound(url: String, volume: Double): Unit = js.native
  def PlaySound(url: String, volume: Double, pitch: Double): Unit = js.native
  
  /**
    * Returns a random member of an array, has a very slight chance to return `undefined` (When the seeded Math.random() is 1)
    * @param array The array to pick a member of
    */
  def choose[T](array: js.Array[T]): T = js.native
  
  def l(name: String): HTMLElement = js.native
  
  /**
    * Floors or ceils randomly, biased by the decimal value
    */
  def randomFloor(x: Double): Double = js.native
  
  def shuffle[T](array: js.Array[T]): js.Array[T] = js.native
  
  /**
    * An extended toFixed, which converts any number to an e-less string
    */
  def toFixed(x: Double): String = js.native
  
  @js.native
  object Game extends js.Object {
    
    var Achievements: js.Array[typings.cookieclicker.Game.Achievement] = js.native
    
    var AchievementsById: js.Array[typings.cookieclicker.Game.Achievement] = js.native
    
    var AchievementsN: Double = js.native
    
    var AchievementsOwned: Double = js.native
    
    def AddToLog(what: String): Unit = js.native
    
    def Ascend(bypass: Boolean): Unit = js.native
    
    var AscendBreakpoint: Double = js.native
    
    var AscendDragX: Double = js.native
    
    var AscendDragY: Double = js.native
    
    var AscendDragging: Double = js.native
    
    var AscendDuration: Double = js.native
    
    var AscendGridSnap: Double = js.native
    
    var AscendOffX: Double = js.native
    
    var AscendOffXT: Double = js.native
    
    var AscendOffY: Double = js.native
    
    var AscendOffYT: Double = js.native
    
    def AscendRefocus(): Unit = js.native
    
    var AscendTimer: Double = js.native
    
    var AscendZoom: Double = js.native
    
    var AscendZoomT: Double = js.native
    
    def AssignPermanentSlot(slot: Double): Unit = js.native
    
    var BGsByChoice: Record[Double, ChoiceCosmetics] = js.native
    
    var Background: CanvasRenderingContext2D = js.native
    
    def BankAchievement(name: String): BankAchievementClass = js.native
    def BankAchievement(name: String, q: String): BankAchievementClass = js.native
    
    var BankAchievements: js.Array[BankAchievementClass] = js.native
    
    var BigCookieSize: Double = js.native
    
    var BigCookieSizeD: Double = js.native
    
    var BigCookieSizeT: Double = js.native
    
    var BigCookieState: Double = js.native
    
    def BuildAscendTree(): Unit = js.native
    
    def BuildStore(): Unit = js.native
    
    var BuildingsOwned: Double = js.native
    
    def CalculateGains(): Unit = js.native
    
    var CanClick: Double = js.native
    
    def CheckUpdates(): Unit = js.native
    
    def CheckUpdatesResponse(response: String): Unit = js.native
    
    var Click: Double = js.native
    
    def ClickCookie(e: MouseEvent, amount: Double): Unit = js.native
    
    def ClickProduct(what: typings.cookieclicker.Game.GameObject): Unit = js.native
    
    def ClickSpecialPic(): Unit = js.native
    
    def ClickTinyCookie(): Unit = js.native
    
    def CloseNote(id: Double): Unit = js.native
    
    def CloseNotes(): Unit = js.native
    
    def ClosePrompt(): Unit = js.native
    
    def CollectWrinklers(): Unit = js.native
    
    def ComputeCps(base: Double, mult: Double, bonus: Double): Double = js.native
    
    def ConfirmPrompt(): Unit = js.native
    
    def CountsAsAchievementOwned(pool: AchievementPool): Boolean = js.native
    
    def CountsAsUpgradeOwned(pool: String): Boolean = js.native
    
    def CpsAchievement(name: String): CpsAchievementClass = js.native
    def CpsAchievement(name: String, q: String): CpsAchievementClass = js.native
    
    var CpsAchievements: js.Array[CpsAchievementClass] = js.native
    
    def DebugUpgradeCpS(): Unit = js.native
    
    var DebuggingPrestige: Double = js.native
    
    def DefaultPrefs(): Unit = js.native
    
    def DescribeDragonAura(aura: Double): Unit = js.native
    
    def Dissolve(howmuch: Double): Unit = js.native
    
    def Draw(): Unit = js.native
    
    def DrawBackground(): Unit = js.native
    
    def DrawBuildings(): Unit = js.native
    
    def DrawSpecial(): Unit = js.native
    
    def DrawWrinklers(): Unit = js.native
    
    def DropEgg(failRate: Double): Unit = js.native
    
    def Earn(howmuch: Double): Unit = js.native
    
    def EarnHeavenlyChips(cookiesForfeited: Double): Unit = js.native
    
    def EditAscend(): Unit = js.native
    
    def ErrorFrame(): Unit = js.native
    
    def ExportSave(): Unit = js.native
    
    def FileLoad(e: InputEvent): Unit = js.native
    
    def FileSave(): Unit = js.native
    
    def GetAllDebugs(): Unit = js.native
    
    def GetBakeryName(): String = js.native
    
    def GetHeavenlyMultiplier(): Double = js.native
    
    def GetHowManyEggs(): Double = js.native
    
    def GetHowManyHalloweenDrops(): Double = js.native
    
    def GetHowManyHeartDrops(): Double = js.native
    
    def GetHowManyReindeerDrops(): Double = js.native
    
    def GetHowManySantaDrops(): Double = js.native
    
    def GetIcon(`type`: String, tier: String): Icon = js.native
    def GetIcon(`type`: String, tier: Double): Icon = js.native
    
    def GetMouseCoords(e: MouseEvent): Unit = js.native
    
    def GetTieredCpsMult(me: typings.cookieclicker.Game.GameObject): Double = js.native
    
    def GiveUpAscend(bypass: Boolean): Unit = js.native
    
    def GrabData(): Unit = js.native
    
    def GrabDataResponse(response: String): Unit = js.native
    
    var GrandmaSynergies: js.Array[String] = js.native
    
    def GrandmaSynergy(name: String, desc: String, building: String): GrandmaSynergyClass = js.native
    
    var HCfactor: Double = js.native
    
    @JSName("HardReset")
    def HardReset_0(bypass: `0`): Unit = js.native
    @JSName("HardReset")
    def HardReset_1(bypass: `1`): Unit = js.native
    @JSName("HardReset")
    def HardReset_2(bypass: `2`): Unit = js.native
    
    def Has(what: String): PseudoBoolean = js.native
    
    def HasAchiev(what: String): PseudoBoolean = js.native
    
    def HasUnlocked(what: String): PseudoBoolean = js.native
    
    def HowManyCookiesReset(chips: Double): Double = js.native
    
    def HowMuchPrestige(cookies: Double): Double = js.native
    
    def ImportSave(): Unit = js.native
    
    def ImportSaveCode(save: String): Unit = js.native
    
    def Init(): Unit = js.native
    
    def Launch(): Unit = js.native
    
    var LeftBackground: CanvasRenderingContext2D = js.native
    
    def Load(): Unit = js.native
    
    def LoadMinigames(): Unit = js.native
    
    def LoadMod(url: String): Unit = js.native
    
    def LoadSave(): Boolean = js.native
    def LoadSave(data: String): Boolean = js.native
    
    def LoadWrinklers(amount: Double, number: Double, shinies: Double, amountShinies: Double): Unit = js.native
    
    var Loader: typings.cookieclicker.Loader = js.native
    
    def Lock(what: String): Unit = js.native
    def Lock(what: js.Array[String]): Unit = js.native
    
    var Log: js.Array[String] = js.native
    
    def Logic(): Unit = js.native
    
    def Loop(): Unit = js.native
    
    def MakeTiered(upgrade: typings.cookieclicker.Game.Upgrade, tier: String, col: Double): Unit = js.native
    def MakeTiered(upgrade: typings.cookieclicker.Game.Upgrade, tier: Double, col: Double): Unit = js.native
    
    def MaxSpecials(): Unit = js.native
    
    var Milk: typings.cookieclicker.Game.Milk = js.native
    
    var Milks: js.Array[Milk] = js.native
    
    var MilksByChoice: Record[Double, ChoiceCosmetics] = js.native
    
    @JSName("Mobile")
    def Mobile_(): Unit = js.native
    
    var Mods: Record[String, Mod] = js.native
    
    def NewUpgradeCookie(obj: CookieUpgradeParameter): CookieUpgrade = js.native
    
    var Notes: js.Array[typings.cookieclicker.Game.Note] = js.native
    
    var NotesById: js.Array[typings.cookieclicker.Game.Note] = js.native
    
    def NotesDraw(): Unit = js.native
    
    def NotesLogic(): Unit = js.native
    
    def Notify(title: String): Unit = js.native
    def Notify(
      title: String,
      desc: js.UndefOr[scala.Nothing],
      pic: js.UndefOr[scala.Nothing],
      quick: js.UndefOr[scala.Nothing],
      noLog: Boolean
    ): Unit = js.native
    def Notify(title: String, desc: js.UndefOr[scala.Nothing], pic: js.UndefOr[scala.Nothing], quick: Double): Unit = js.native
    def Notify(
      title: String,
      desc: js.UndefOr[scala.Nothing],
      pic: js.UndefOr[scala.Nothing],
      quick: Double,
      noLog: Boolean
    ): Unit = js.native
    def Notify(title: String, desc: js.UndefOr[scala.Nothing], pic: Icon): Unit = js.native
    def Notify(
      title: String,
      desc: js.UndefOr[scala.Nothing],
      pic: Icon,
      quick: js.UndefOr[scala.Nothing],
      noLog: Boolean
    ): Unit = js.native
    def Notify(title: String, desc: js.UndefOr[scala.Nothing], pic: Icon, quick: Double): Unit = js.native
    def Notify(title: String, desc: js.UndefOr[scala.Nothing], pic: Icon, quick: Double, noLog: Boolean): Unit = js.native
    def Notify(title: String, desc: String): Unit = js.native
    def Notify(
      title: String,
      desc: String,
      pic: js.UndefOr[scala.Nothing],
      quick: js.UndefOr[scala.Nothing],
      noLog: Boolean
    ): Unit = js.native
    def Notify(title: String, desc: String, pic: js.UndefOr[scala.Nothing], quick: Double): Unit = js.native
    def Notify(title: String, desc: String, pic: js.UndefOr[scala.Nothing], quick: Double, noLog: Boolean): Unit = js.native
    def Notify(title: String, desc: String, pic: Icon): Unit = js.native
    def Notify(title: String, desc: String, pic: Icon, quick: js.UndefOr[scala.Nothing], noLog: Boolean): Unit = js.native
    def Notify(title: String, desc: String, pic: Icon, quick: Double): Unit = js.native
    def Notify(title: String, desc: String, pic: Icon, quick: Double, noLog: Boolean): Unit = js.native
    
    var Objects: (Record[String, typings.cookieclicker.Game.GameObject]) with Bank = js.native
    
    var ObjectsById: js.Array[typings.cookieclicker.Game.GameObject] = js.native
    
    var ObjectsN: Double = js.native
    
    var OnAscend: Double = js.native
    
    def OpenSesame(): Unit = js.native
    
    def PermanentSlotIcon(slot: Double): Icon = js.native
    
    def PickAscensionMode(): Unit = js.native
    
    def PopRandomWrinkler(): Wrinkler | Boolean = js.native
    
    def Popup(text: String, x: Double, y: Double): Unit = js.native
    
    var PrestigeUpgrades: js.Array[HeavenlyUpgrade] = js.native
    
    def ProductionAchievement(name: String, building: String, tier: Double): typings.cookieclicker.Game.Achievement = js.native
    def ProductionAchievement(name: String, building: String, tier: Double, q: js.UndefOr[scala.Nothing], mult: Double): typings.cookieclicker.Game.Achievement = js.native
    def ProductionAchievement(name: String, building: String, tier: Double, q: String): typings.cookieclicker.Game.Achievement = js.native
    def ProductionAchievement(name: String, building: String, tier: Double, q: String, mult: Double): typings.cookieclicker.Game.Achievement = js.native
    
    def Prompt(content: String, options: js.Array[String | (js.Tuple2[String, String])]): Unit = js.native
    def Prompt(
      content: String,
      options: js.Array[String | (js.Tuple2[String, String])],
      updateFunc: js.UndefOr[scala.Nothing],
      style: String
    ): Unit = js.native
    def Prompt(
      content: String,
      options: js.Array[String | (js.Tuple2[String, String])],
      updateFunc: js.Function0[Unit]
    ): Unit = js.native
    def Prompt(
      content: String,
      options: js.Array[String | (js.Tuple2[String, String])],
      updateFunc: js.Function0[Unit],
      style: String
    ): Unit = js.native
    
    def PurchaseHeavenlyUpgrade(what: typings.cookieclicker.Game.Upgrade): Unit = js.native
    
    def PutUpgradeInPermanentSlot(upgrade: typings.cookieclicker.Game.Upgrade, slot: Double): Unit = js.native
    
    def RandomBakeryName(): String = js.native
    
    def RebuildUpgrades(): Unit = js.native
    
    def RefreshStore(): Unit = js.native
    
    def Reincarnate(bypass: Boolean): Unit = js.native
    
    var ReincarnateDuration: Double = js.native
    
    var ReincarnateTimer: Double = js.native
    
    def RemoveAchiev(what: String): Unit = js.native
    
    def RequiresConfirmation(upgrade: typings.cookieclicker.Game.Upgrade, prompt: String): Unit = js.native
    
    def Reset(hard: Boolean): Unit = js.native
    
    def ResetWrinklers(): Unit = js.native
    
    def Resume(): Unit = js.native
    
    def RuinTheFun(silent: Boolean): String = js.native
    
    var SaveTo: String = js.native
    
    def SaveWrinklers(): WrinklerSave = js.native
    
    var Scroll: Double = js.native
    
    def SelectDragonAura(slot: Double, update: Boolean): Unit = js.native
    
    var SelectedHeavenlyUpgrade: Double = js.native
    
    var SelectingDragonAura: PseudoBoolean = js.native
    
    var SelectingPermanentUpgrade: Double = js.native
    
    def SesameReset(): Unit = js.native
    
    def SetAllAchievs(on: Boolean): Unit = js.native
    
    def SetAllUpgrades(on: Boolean): Unit = js.native
    
    def SetDragonAura(aura: Double, slot: Double): Unit = js.native
    
    def SetResearch(what: String): Unit = js.native
    def SetResearch(what: String, time: scala.Nothing): Unit = js.native
    
    def SetTier(building: String, tier: String): Unit = js.native
    def SetTier(building: String, tier: Double): Unit = js.native
    
    def ShowMenu(what: String): Unit = js.native
    
    def ShowPanel(what: String): Unit = js.native
    
    def SparkleAt(x: Double, y: Double): Unit = js.native
    
    def SparkleOn(el: HTMLElement): Unit = js.native
    
    def SpawnWrinkler(): Wrinkler | Boolean = js.native
    def SpawnWrinkler(me: Wrinkler): Wrinkler | Boolean = js.native
    
    var SpecialGrandmaUnlock: Double = js.native
    
    def Spend(howmuch: Double): Unit = js.native
    
    def SynergyUpgrade(name: String, desc: String, building1: String, building2: String, tier: String): SynergyUpgradeClass[String] = js.native
    def SynergyUpgrade(name: String, desc: String, building1: String, building2: String, tier: Double): SynergyUpgradeClass[Double] = js.native
    
    var T: Double = js.native
    
    var Ticker: String = js.native
    
    var TickerAge: Double = js.native
    
    var TickerClicks: Double = js.native
    
    def TickerDraw(): Unit = js.native
    
    var TickerEffect: Double = js.native
    
    var TickerN: Double = js.native
    
    def TieredAchievement(name: String, desc: String, building: String, tier: String): TieredAchievementClass[String] = js.native
    def TieredAchievement(name: String, desc: String, building: String, tier: Double): TieredAchievementClass[Double] = js.native
    
    def TieredUpgrade(name: String, desc: String, building: String, tier: String): TieredUpgradeClass[String] = js.native
    def TieredUpgrade(name: String, desc: String, building: String, tier: Double): TieredUpgradeClass[Double] = js.native
    
    var Tiers: Record[String, Tier] = js.native
    
    def Timeout(): Unit = js.native
    
    def ToggleExtraButtons(): Unit = js.native
    
    def ToggleFancy(): Unit = js.native
    
    def ToggleFilters(): Unit = js.native
    
    def ToggleSpecialMenu(on: Boolean): Unit = js.native
    
    @JSName("Toggle")
    def Toggle_altDraw(prefName: altDraw, button: String, on: String, off: String): Unit = js.native
    @JSName("Toggle")
    def Toggle_altDraw(prefName: altDraw, button: String, on: String, off: String, invert: PseudoBoolean): Unit = js.native
    @JSName("Toggle")
    def Toggle_animate(prefName: animate, button: String, on: String, off: String): Unit = js.native
    @JSName("Toggle")
    def Toggle_animate(prefName: animate, button: String, on: String, off: String, invert: PseudoBoolean): Unit = js.native
    @JSName("Toggle")
    def Toggle_askLumps(prefName: askLumps, button: String, on: String, off: String): Unit = js.native
    @JSName("Toggle")
    def Toggle_askLumps(prefName: askLumps, button: String, on: String, off: String, invert: PseudoBoolean): Unit = js.native
    @JSName("Toggle")
    def Toggle_autosave(prefName: autosave, button: String, on: String, off: String): Unit = js.native
    @JSName("Toggle")
    def Toggle_autosave(prefName: autosave, button: String, on: String, off: String, invert: PseudoBoolean): Unit = js.native
    @JSName("Toggle")
    def Toggle_autoupdate(prefName: autoupdate, button: String, on: String, off: String): Unit = js.native
    @JSName("Toggle")
    def Toggle_autoupdate(prefName: autoupdate, button: String, on: String, off: String, invert: PseudoBoolean): Unit = js.native
    @JSName("Toggle")
    def Toggle_cursors(prefName: cursors, button: String, on: String, off: String): Unit = js.native
    @JSName("Toggle")
    def Toggle_cursors(prefName: cursors, button: String, on: String, off: String, invert: PseudoBoolean): Unit = js.native
    @JSName("Toggle")
    def Toggle_customGrandmas(prefName: customGrandmas, button: String, on: String, off: String): Unit = js.native
    @JSName("Toggle")
    def Toggle_customGrandmas(prefName: customGrandmas, button: String, on: String, off: String, invert: PseudoBoolean): Unit = js.native
    @JSName("Toggle")
    def Toggle_extraButtons(prefName: extraButtons, button: String, on: String, off: String): Unit = js.native
    @JSName("Toggle")
    def Toggle_extraButtons(prefName: extraButtons, button: String, on: String, off: String, invert: PseudoBoolean): Unit = js.native
    @JSName("Toggle")
    def Toggle_fancy(prefName: fancy, button: String, on: String, off: String): Unit = js.native
    @JSName("Toggle")
    def Toggle_fancy(prefName: fancy, button: String, on: String, off: String, invert: PseudoBoolean): Unit = js.native
    @JSName("Toggle")
    def Toggle_filters(prefName: filters, button: String, on: String, off: String): Unit = js.native
    @JSName("Toggle")
    def Toggle_filters(prefName: filters, button: String, on: String, off: String, invert: PseudoBoolean): Unit = js.native
    @JSName("Toggle")
    def Toggle_focus(prefName: focus, button: String, on: String, off: String): Unit = js.native
    @JSName("Toggle")
    def Toggle_focus(prefName: focus, button: String, on: String, off: String, invert: PseudoBoolean): Unit = js.native
    @JSName("Toggle")
    def Toggle_format(prefName: format, button: String, on: String, off: String): Unit = js.native
    @JSName("Toggle")
    def Toggle_format(prefName: format, button: String, on: String, off: String, invert: PseudoBoolean): Unit = js.native
    @JSName("Toggle")
    def Toggle_milk(prefName: milk, button: String, on: String, off: String): Unit = js.native
    @JSName("Toggle")
    def Toggle_milk(prefName: milk, button: String, on: String, off: String, invert: PseudoBoolean): Unit = js.native
    @JSName("Toggle")
    def Toggle_monospace(prefName: monospace, button: String, on: String, off: String): Unit = js.native
    @JSName("Toggle")
    def Toggle_monospace(prefName: monospace, button: String, on: String, off: String, invert: PseudoBoolean): Unit = js.native
    @JSName("Toggle")
    def Toggle_notifs(prefName: notifs, button: String, on: String, off: String): Unit = js.native
    @JSName("Toggle")
    def Toggle_notifs(prefName: notifs, button: String, on: String, off: String, invert: PseudoBoolean): Unit = js.native
    @JSName("Toggle")
    def Toggle_numbers(prefName: numbers, button: String, on: String, off: String): Unit = js.native
    @JSName("Toggle")
    def Toggle_numbers(prefName: numbers, button: String, on: String, off: String, invert: PseudoBoolean): Unit = js.native
    @JSName("Toggle")
    def Toggle_particles(prefName: particles, button: String, on: String, off: String): Unit = js.native
    @JSName("Toggle")
    def Toggle_particles(prefName: particles, button: String, on: String, off: String, invert: PseudoBoolean): Unit = js.native
    @JSName("Toggle")
    def Toggle_popups(prefName: popups, button: String, on: String, off: String): Unit = js.native
    @JSName("Toggle")
    def Toggle_popups(prefName: popups, button: String, on: String, off: String, invert: PseudoBoolean): Unit = js.native
    @JSName("Toggle")
    def Toggle_showBackupWarning(prefName: showBackupWarning, button: String, on: String, off: String): Unit = js.native
    @JSName("Toggle")
    def Toggle_showBackupWarning(prefName: showBackupWarning, button: String, on: String, off: String, invert: PseudoBoolean): Unit = js.native
    @JSName("Toggle")
    def Toggle_timeout(prefName: timeout, button: String, on: String, off: String): Unit = js.native
    @JSName("Toggle")
    def Toggle_timeout(prefName: timeout, button: String, on: String, off: String, invert: PseudoBoolean): Unit = js.native
    @JSName("Toggle")
    def Toggle_warn(prefName: warn, button: String, on: String, off: String): Unit = js.native
    @JSName("Toggle")
    def Toggle_warn(prefName: warn, button: String, on: String, off: String, invert: PseudoBoolean): Unit = js.native
    @JSName("Toggle")
    def Toggle_wobbly(prefName: wobbly, button: String, on: String, off: String): Unit = js.native
    @JSName("Toggle")
    def Toggle_wobbly(prefName: wobbly, button: String, on: String, off: String, invert: PseudoBoolean): Unit = js.native
    
    def Unlock(what: String): Unit = js.native
    def Unlock(what: js.Array[String]): Unit = js.native
    
    var UnlockAt: js.Array[UnlockRequirement] = js.native
    
    def UnlockTiered(me: typings.cookieclicker.Game.Upgrade): Unit = js.native
    
    def UpdateAscend(): Unit = js.native
    
    def UpdateAscendIntro(): Unit = js.native
    
    def UpdateAscensionModePrompt(): Unit = js.native
    
    def UpdateGrandmapocalypse(): Unit = js.native
    
    def UpdateLegacyPrompt(): Unit = js.native
    
    def UpdateMenu(): Unit = js.native
    
    def UpdateNotes(): Unit = js.native
    
    def UpdatePrompt(): Unit = js.native
    
    def UpdateReincarnateIntro(): Unit = js.native
    
    def UpdateSpecial(): Unit = js.native
    
    def UpdateTicker(): Unit = js.native
    
    def UpdateWrinklers(): Unit = js.native
    
    def UpgradeDragon(): Unit = js.native
    
    var UpgradePositions: js.Object = js.native
    
    def UpgradeSanta(): Unit = js.native
    
    var Upgrades: js.Array[js.UndefOr[scala.Nothing]] with (Record[String, typings.cookieclicker.Game.Upgrade]) = js.native
    
    var UpgradesById: js.Array[typings.cookieclicker.Game.Upgrade] = js.native
    
    var UpgradesInStore: js.Array[typings.cookieclicker.Game.Upgrade] = js.native
    
    var UpgradesN: Double = js.native
    
    var UpgradesOwned: Double = js.native
    
    def Win(what: String): Unit = js.native
    def Win(what: js.Array[String]): Unit = js.native
    
    @JSName("WriteButton")
    def WriteButton_altDraw(prefName: altDraw, button: String, on: String, off: String, callback: String): String = js.native
    @JSName("WriteButton")
    def WriteButton_altDraw(
      prefName: altDraw,
      button: String,
      on: String,
      off: String,
      callback: String,
      invert: PseudoBoolean
    ): String = js.native
    @JSName("WriteButton")
    def WriteButton_animate(prefName: animate, button: String, on: String, off: String, callback: String): String = js.native
    @JSName("WriteButton")
    def WriteButton_animate(
      prefName: animate,
      button: String,
      on: String,
      off: String,
      callback: String,
      invert: PseudoBoolean
    ): String = js.native
    @JSName("WriteButton")
    def WriteButton_askLumps(prefName: askLumps, button: String, on: String, off: String, callback: String): String = js.native
    @JSName("WriteButton")
    def WriteButton_askLumps(
      prefName: askLumps,
      button: String,
      on: String,
      off: String,
      callback: String,
      invert: PseudoBoolean
    ): String = js.native
    @JSName("WriteButton")
    def WriteButton_autosave(prefName: autosave, button: String, on: String, off: String, callback: String): String = js.native
    @JSName("WriteButton")
    def WriteButton_autosave(
      prefName: autosave,
      button: String,
      on: String,
      off: String,
      callback: String,
      invert: PseudoBoolean
    ): String = js.native
    @JSName("WriteButton")
    def WriteButton_autoupdate(prefName: autoupdate, button: String, on: String, off: String, callback: String): String = js.native
    @JSName("WriteButton")
    def WriteButton_autoupdate(
      prefName: autoupdate,
      button: String,
      on: String,
      off: String,
      callback: String,
      invert: PseudoBoolean
    ): String = js.native
    @JSName("WriteButton")
    def WriteButton_cursors(prefName: cursors, button: String, on: String, off: String, callback: String): String = js.native
    @JSName("WriteButton")
    def WriteButton_cursors(
      prefName: cursors,
      button: String,
      on: String,
      off: String,
      callback: String,
      invert: PseudoBoolean
    ): String = js.native
    @JSName("WriteButton")
    def WriteButton_customGrandmas(prefName: customGrandmas, button: String, on: String, off: String, callback: String): String = js.native
    @JSName("WriteButton")
    def WriteButton_customGrandmas(
      prefName: customGrandmas,
      button: String,
      on: String,
      off: String,
      callback: String,
      invert: PseudoBoolean
    ): String = js.native
    @JSName("WriteButton")
    def WriteButton_extraButtons(prefName: extraButtons, button: String, on: String, off: String, callback: String): String = js.native
    @JSName("WriteButton")
    def WriteButton_extraButtons(
      prefName: extraButtons,
      button: String,
      on: String,
      off: String,
      callback: String,
      invert: PseudoBoolean
    ): String = js.native
    @JSName("WriteButton")
    def WriteButton_fancy(prefName: fancy, button: String, on: String, off: String, callback: String): String = js.native
    @JSName("WriteButton")
    def WriteButton_fancy(prefName: fancy, button: String, on: String, off: String, callback: String, invert: PseudoBoolean): String = js.native
    @JSName("WriteButton")
    def WriteButton_filters(prefName: filters, button: String, on: String, off: String, callback: String): String = js.native
    @JSName("WriteButton")
    def WriteButton_filters(
      prefName: filters,
      button: String,
      on: String,
      off: String,
      callback: String,
      invert: PseudoBoolean
    ): String = js.native
    @JSName("WriteButton")
    def WriteButton_focus(prefName: focus, button: String, on: String, off: String, callback: String): String = js.native
    @JSName("WriteButton")
    def WriteButton_focus(prefName: focus, button: String, on: String, off: String, callback: String, invert: PseudoBoolean): String = js.native
    @JSName("WriteButton")
    def WriteButton_format(prefName: format, button: String, on: String, off: String, callback: String): String = js.native
    @JSName("WriteButton")
    def WriteButton_format(prefName: format, button: String, on: String, off: String, callback: String, invert: PseudoBoolean): String = js.native
    @JSName("WriteButton")
    def WriteButton_milk(prefName: milk, button: String, on: String, off: String, callback: String): String = js.native
    @JSName("WriteButton")
    def WriteButton_milk(prefName: milk, button: String, on: String, off: String, callback: String, invert: PseudoBoolean): String = js.native
    @JSName("WriteButton")
    def WriteButton_monospace(prefName: monospace, button: String, on: String, off: String, callback: String): String = js.native
    @JSName("WriteButton")
    def WriteButton_monospace(
      prefName: monospace,
      button: String,
      on: String,
      off: String,
      callback: String,
      invert: PseudoBoolean
    ): String = js.native
    @JSName("WriteButton")
    def WriteButton_notifs(prefName: notifs, button: String, on: String, off: String, callback: String): String = js.native
    @JSName("WriteButton")
    def WriteButton_notifs(prefName: notifs, button: String, on: String, off: String, callback: String, invert: PseudoBoolean): String = js.native
    @JSName("WriteButton")
    def WriteButton_numbers(prefName: numbers, button: String, on: String, off: String, callback: String): String = js.native
    @JSName("WriteButton")
    def WriteButton_numbers(
      prefName: numbers,
      button: String,
      on: String,
      off: String,
      callback: String,
      invert: PseudoBoolean
    ): String = js.native
    @JSName("WriteButton")
    def WriteButton_particles(prefName: particles, button: String, on: String, off: String, callback: String): String = js.native
    @JSName("WriteButton")
    def WriteButton_particles(
      prefName: particles,
      button: String,
      on: String,
      off: String,
      callback: String,
      invert: PseudoBoolean
    ): String = js.native
    @JSName("WriteButton")
    def WriteButton_popups(prefName: popups, button: String, on: String, off: String, callback: String): String = js.native
    @JSName("WriteButton")
    def WriteButton_popups(prefName: popups, button: String, on: String, off: String, callback: String, invert: PseudoBoolean): String = js.native
    @JSName("WriteButton")
    def WriteButton_showBackupWarning(prefName: showBackupWarning, button: String, on: String, off: String, callback: String): String = js.native
    @JSName("WriteButton")
    def WriteButton_showBackupWarning(
      prefName: showBackupWarning,
      button: String,
      on: String,
      off: String,
      callback: String,
      invert: PseudoBoolean
    ): String = js.native
    @JSName("WriteButton")
    def WriteButton_timeout(prefName: timeout, button: String, on: String, off: String, callback: String): String = js.native
    @JSName("WriteButton")
    def WriteButton_timeout(
      prefName: timeout,
      button: String,
      on: String,
      off: String,
      callback: String,
      invert: PseudoBoolean
    ): String = js.native
    @JSName("WriteButton")
    def WriteButton_warn(prefName: warn, button: String, on: String, off: String, callback: String): String = js.native
    @JSName("WriteButton")
    def WriteButton_warn(prefName: warn, button: String, on: String, off: String, callback: String, invert: PseudoBoolean): String = js.native
    @JSName("WriteButton")
    def WriteButton_wobbly(prefName: wobbly, button: String, on: String, off: String, callback: String): String = js.native
    @JSName("WriteButton")
    def WriteButton_wobbly(prefName: wobbly, button: String, on: String, off: String, callback: String, invert: PseudoBoolean): String = js.native
    
    def WriteSave(): String = js.native
    def WriteSave(`type`: Double): String = js.native
    
    def WriteSlider(
      slider: String,
      leftText: String,
      rightText: String,
      startValueFunction: js.Function0[Double],
      callback: String
    ): Unit = js.native
    
    var accumulatedDelay: Double = js.native
    
    def addClass(what: String): Unit = js.native
    
    var ascendContentl: js.Object = js.native
    
    var ascendMeter: js.Object = js.native
    
    var ascendMeterLevel: Double = js.native
    
    var ascendMeterPercent: Double = js.native
    
    var ascendMeterPercentT: Double = js.native
    
    var ascendNumber: js.Object = js.native
    
    var ascendUpgradesl: js.Object = js.native
    
    var ascendZoomablel: js.Object = js.native
    
    var ascendl: js.Object = js.native
    
    var ascensionMode: Double = js.native
    
    var ascensionModes: js.Object = js.native
    
    def attachTooltip(el: HTMLElement, func: String, origin: TooltipOrigins): Unit = js.native
    def attachTooltip(el: HTMLElement, func: js.Function0[String], origin: TooltipOrigins): Unit = js.native
    
    def auraMult(what: String): Double = js.native
    
    var autoclickerDetected: Double = js.native
    
    var bakeryName: String = js.native
    
    var bakeryNameL: HTMLDivElement = js.native
    
    def bakeryNamePrompt(): Unit = js.native
    
    def bakeryNamePromptRandom(): String = js.native
    
    def bakeryNameRefresh(): Unit = js.native
    
    def bakeryNameSet(): Unit = js.native
    
    var baseResearchTime: Double = js.native
    
    var baseSeason: String = js.native
    
    var beta: PseudoBoolean = js.native
    
    var bg: String = js.native
    
    var bgFade: String = js.native
    
    var bgR: Double = js.native
    
    var bgRd: Double = js.native
    
    var bgType: Double = js.native
    
    var blendModesOn: Boolean = js.native
    
    var bounds: DOMRect = js.native
    
    var buffTypes: js.Array[typings.cookieclicker.Game.buffType] = js.native
    
    var buffTypesByName: js.Array[js.UndefOr[scala.Nothing]] with (Record[String, typings.cookieclicker.Game.buffType]) = js.native
    
    var buffTypesN: Double = js.native
    
    var buffs: js.Array[Buff] = js.native
    
    var buffsL: HTMLDivElement = js.native
    
    var buffsN: Double = js.native
    
    var buyBulk: Double = js.native
    
    var buyBulkOld: Double = js.native
    
    var buyBulkShortcut: Double = js.native
    
    var buyMode: Double = js.native
    
    def canLumps(): Boolean = js.native
    
    def canRefillLump(): Boolean = js.native
    
    var catchupLogic: Double = js.native
    
    var chimeType: Double = js.native
    
    var choiceSelectorChoices: js.Array[SelectorSwitchChoice] = js.native
    
    var choiceSelectorOn: Double = js.native
    
    var choiceSelectorSelected: Double = js.native
    
    var clickFrom: Double = js.native
    
    def clickLump(): Unit = js.native
    
    var clickStr: String = js.native
    
    def computeLumpTimes(): Unit = js.native
    
    def computeLumpType(): Boolean = js.native
    
    def computeSeasonPrices(): Double = js.native
    
    def computeSeasons(): Unit = js.native
    
    var computedMouseCps: Double = js.native
    
    var cookieClickSound: Double = js.native
    
    var cookieClicks: Double = js.native
    
    var cookieOriginX: Double = js.native
    
    var cookieOriginY: Double = js.native
    
    var cookieUpgrades: js.Array[typings.cookieclicker.Game.Upgrade] = js.native
    
    var cookies: Double = js.native
    
    var cookiesEarned: Double = js.native
    
    var cookiesMultByType: js.Object = js.native
    
    var cookiesPs: Double = js.native
    
    var cookiesPsByType: js.Object = js.native
    
    var cookiesReset: Double = js.native
    
    var cookiesSucked: Double = js.native
    
    var cookiesd: Double = js.native
    
    def costDetails(cost: Double): Unit = js.native
    
    var cpsSucked: Double = js.native
    
    def crate(
      me: typings.cookieclicker.Game.Achievement,
      context: js.UndefOr[scala.Nothing],
      forceClickStr: String,
      id: String
    ): String = js.native
    def crate(
      me: typings.cookieclicker.Game.Upgrade,
      context: js.UndefOr[scala.Nothing],
      forceClickStr: String,
      id: String
    ): String = js.native
    
    def crateTooltip(me: typings.cookieclicker.Game.Achievement): String = js.native
    def crateTooltip(me: typings.cookieclicker.Game.Upgrade): String = js.native
    @JSName("crateTooltip")
    def crateTooltip_ascend(me: typings.cookieclicker.Game.Achievement, context: ascend): String = js.native
    @JSName("crateTooltip")
    def crateTooltip_ascend(me: typings.cookieclicker.Game.Upgrade, context: ascend): String = js.native
    @JSName("crateTooltip")
    def crateTooltip_stats(me: typings.cookieclicker.Game.Achievement, context: stats): String = js.native
    @JSName("crateTooltip")
    def crateTooltip_stats(me: typings.cookieclicker.Game.Upgrade, context: stats): String = js.native
    @JSName("crateTooltip")
    def crateTooltip_store(me: typings.cookieclicker.Game.Achievement, context: store): String = js.native
    @JSName("crateTooltip")
    def crateTooltip_store(me: typings.cookieclicker.Game.Upgrade, context: store): String = js.native
    
    @JSName("crate")
    def crate_ascend(me: typings.cookieclicker.Game.Achievement, context: ascend, forceClickStr: String, id: String): String = js.native
    @JSName("crate")
    def crate_ascend(me: typings.cookieclicker.Game.Upgrade, context: ascend, forceClickStr: String, id: String): String = js.native
    @JSName("crate")
    def crate_stats(me: typings.cookieclicker.Game.Achievement, context: stats, forceClickStr: String, id: String): String = js.native
    @JSName("crate")
    def crate_stats(me: typings.cookieclicker.Game.Upgrade, context: stats, forceClickStr: String, id: String): String = js.native
    @JSName("crate")
    def crate_store(me: typings.cookieclicker.Game.Achievement, context: store, forceClickStr: String, id: String): String = js.native
    @JSName("crate")
    def crate_store(me: typings.cookieclicker.Game.Upgrade, context: store, forceClickStr: String, id: String): String = js.native
    
    var cssClasses: js.Array[String] = js.native
    
    var currentFps: Double = js.native
    
    var customGrandmaNames: js.Array[String] = js.native
    
    var darkenL: js.Object = js.native
    
    var debugColors: js.Array[String] = js.native
    
    var debugTimersOn: Double = js.native
    
    var debuggedUpgradeCpClick: js.Array[Double] = js.native
    
    var debuggedUpgradeCpS: js.Array[Double] = js.native
    
    var defaultBg: String = js.native
    
    var delayTimeouts: Double = js.native
    
    def doLumps(): Unit = js.native
    
    var dragonAura: Double = js.native
    
    var dragonAura2: Double = js.native
    
    var dragonAuras: Record[Double, DragonAura] = js.native
    
    var dragonLevel: Double = js.native
    
    var dragonLevels: js.Array[DragonLevel] = js.native
    
    var drawT: Double = js.native
    
    def dropRateMult(): Double = js.native
    
    var easterEggs: js.Array[String] = js.native
    
    def eff(name: String, `def`: String): Effects = js.native
    
    var effs: Effects = js.native
    
    var eggDrops: js.Array[String] = js.native
    
    var elderWrath: Double = js.native
    
    var elderWrathD: Double = js.native
    
    var elderWrathOld: Double = js.native
    
    var externalDataLoaded: Boolean = js.native
    
    var foolObjects: js.Array[FoolBuilding] = js.native
    
    var forceUnslotGod: js.UndefOr[js.Function1[/* god */ String, Boolean]] = js.native
    
    var fortuneCPS: PseudoBoolean = js.native
    
    var fortuneGC: PseudoBoolean = js.native
    
    var fps: Double = js.native
    
    var fpsStartTime: Double = js.native
    
    var frameNumber: Double = js.native
    
    var fullDate: Double = js.native
    
    def gainBuff(`type`: String, time: Double, arg1: Double, arg2: Double, arg3: Double): Buff = js.native
    
    def gainLumps(total: Double): Unit = js.native
    
    var gainedPrestige: Double = js.native
    
    def getDynamicTooltip(func: String): String = js.native
    def getDynamicTooltip(func: String, origin: js.UndefOr[TooltipOrigins], isCrate: Boolean): String = js.native
    def getDynamicTooltip(func: String, origin: js.UndefOr[TooltipOrigins], isCrate: PseudoBoolean): String = js.native
    def getDynamicTooltip(func: String, origin: TooltipOrigins): String = js.native
    
    def getFps(): Double = js.native
    
    def getLumpRefillMax(): Double = js.native
    
    def getLumpRefillRemaining(): Double = js.native
    
    def getNewTicker(manual: Boolean): Unit = js.native
    
    def getPledgeDuration(): Double = js.native
    
    def getSeasonDuration(): Double = js.native
    
    def getTooltip(text: String): String = js.native
    def getTooltip(text: String, origin: js.UndefOr[TooltipOrigins], isCrate: Boolean): String = js.native
    def getTooltip(text: String, origin: js.UndefOr[TooltipOrigins], isCrate: PseudoBoolean): String = js.native
    def getTooltip(text: String, origin: TooltipOrigins): String = js.native
    
    def getWrinklersMax(): Double = js.native
    
    var globalCpsMult: Double = js.native
    
    var goldenClicks: Double = js.native
    
    var goldenClicksLocal: Double = js.native
    
    var goldenCookieBuildingBuffs: Record[
        /* keyof std.Record<string, cookieclicker.Game.GameObject> & cookieclicker.anon.Bank */ Farm | Temple | (`Wizard tower`) | typings.cookieclicker.cookieclickerStrings.Bank, 
        js.Tuple2[String, String]
      ] = js.native
    
    var goldenCookieChoices: js.Array[String] = js.native
    
    var goldenCookieUpgrades: js.Array[String] = js.native
    
    var grandmaNames: js.Array[String] = js.native
    
    var halloweenDrops: js.Array[String] = js.native
    
    def handleScroll(e: MouseEvent): Unit = js.native
    
    var handmadeCookies: Double = js.native
    
    def harvestLumps(amount: Double, silent: Boolean): Unit = js.native
    
    def hasAura(what: String): Boolean = js.native
    
    def hasBuff(what: String): Double | Buff = js.native
    
    var hasGod: js.UndefOr[js.Function1[/* what */ String, `1` | `2` | `3` | `false`]] = js.native
    
    var heartDrops: js.Array[String] = js.native
    
    var heavenlyBounds: js.Object = js.native
    
    var heavenlyChips: Double = js.native
    
    var heavenlyChipsDisplayed: Double = js.native
    
    var heavenlyChipsSpent: Double = js.native
    
    var heavenlyCookies: Double = js.native
    
    var heavenlyPower: Double = js.native
    
    var heralds: Double = js.native
    
    var https: Boolean = js.native
    
    def isMinigameReady(me: typings.cookieclicker.Game.GameObject): Unit = js.native
    
    var keys: js.Array[Double] = js.native
    
    def killBuff(what: String): Unit = js.native
    
    def killBuffs(): Unit = js.native
    
    def killShimmers(): Unit = js.native
    
    var l: HTMLDivElement = js.native
    
    var last: typings.cookieclicker.Game.GameObject | typings.cookieclicker.Game.Upgrade | typings.cookieclicker.Game.Achievement = js.native
    
    var lastActivity: Double = js.native
    
    var lastClick: Double = js.native
    
    var lastClickedEl: js.Object = js.native
    
    var lastDate: Double = js.native
    
    var lastPanel: String = js.native
    
    def listTinyOwnedUpgrades(arr: js.Array[typings.cookieclicker.Game.Upgrade]): String = js.native
    
    def loadLumps(): Unit = js.native
    def loadLumps(time: js.Any): Unit = js.native
    
    def localStorageGet(key: String): String = js.native
    
    def localStorageSet(key: String, str: String): Unit = js.native
    
    var loopT: Double = js.native
    
    def loseShimmeringVeil(context: String): Unit | `false` = js.native
    
    var lumpCurrentType: Double = js.native
    
    var lumpMatureAge: Double = js.native
    
    var lumpOverripeAge: Double = js.native
    
    var lumpRefill: Double = js.native
    
    var lumpRipeAge: Double = js.native
    
    var lumpT: Double = js.native
    
    def lumpTooltip(): String = js.native
    
    var lumps: Double = js.native
    
    var lumpsTotal: Double = js.native
    
    def magicCpS(what: js.Any): Double = js.native
    
    def makeSeed(): String = js.native
    
    var milkH: Double = js.native
    
    var milkHd: Double = js.native
    
    var milkProgress: Double = js.native
    
    var milkType: Double = js.native
    
    var missedGoldenClicks: Double = js.native
    
    var mobile: PseudoBoolean = js.native
    
    var modHookNames: js.Array[String] = js.native
    
    var modHooks: Record[String, js.Array[js.Function0[js.Any]]] = js.native
    
    var modSaveData: Record[String, String] = js.native
    
    def modifyBuildingPrice(building: String, price: Double): Double = js.native
    
    def mouseCps(): Double = js.native
    
    var mouseDown: Double = js.native
    
    var mouseMoved: Double = js.native
    
    var mousePointer: Double = js.native
    
    var mouseX: Double = js.native
    
    var mouseX2: Double = js.native
    
    var mouseY: Double = js.native
    
    var mouseY2: Double = js.native
    
    def mutedBuildingTooltip(id: Double): js.Function0[String] = js.native
    
    var nextAscensionMode: Double = js.native
    
    var nextResearch: Double = js.native
    
    var noteId: Double = js.native
    
    var noteL: HTMLDivElement = js.native
    
    var onCrate: Double = js.native
    
    var onMenu: String = js.native
    
    var onPanel: String = js.native
    
    def particleAdd(
      x: Double,
      y: Double,
      xd: Double,
      yd: Double,
      size: Double,
      dur: Double,
      z: Double,
      pic: String,
      text: String
    ): Particle | js.Object = js.native
    
    var particles: js.Array[Particle] = js.native
    
    def particlesDraw(z: Double): Unit = js.native
    
    def particlesUpdate(): Unit = js.native
    
    var permanentUpgrades: js.Array[Double] = js.native
    
    def playCookieClickSound(): Unit = js.native
    
    def playWrinklerSquishSound(): Unit = js.native
    
    var pledgeT: Double = js.native
    
    var pledges: Double = js.native
    
    var popups: Double = js.native
    
    var prefs: js.Array[js.UndefOr[scala.Nothing]] with Prefs = js.native
    
    var prestige: Double = js.native
    
    var previousFps: Double = js.native
    
    var priceIncrease: Double = js.native
    
    var promptAnchorL: js.Object = js.native
    
    var promptConfirm: String = js.native
    
    var promptL: js.Object = js.native
    
    var promptOn: Double = js.native
    
    var promptUpdateFunc: Double = js.native
    
    var promptWrapL: js.Object = js.native
    
    var rareEggDrops: js.Array[String] = js.native
    
    var ready: PseudoBoolean = js.native
    
    var recalculateGains: Double = js.native
    
    def refillLump(n: Double, func: js.Function0[Unit]): Unit = js.native
    
    def registerHook(hook: String, func: js.Array[js.Function0[Unit]]): Unit = js.native
    def registerHook(hook: String, func: js.Function0[Unit]): Unit = js.native
    @JSName("registerHook")
    def registerHook_cookiesPerClick(hook: cookiesPerClick, func: js.Array[js.Function0[Double]]): Unit = js.native
    @JSName("registerHook")
    def registerHook_cookiesPerClick(hook: cookiesPerClick, func: js.Function0[Double]): Unit = js.native
    @JSName("registerHook")
    def registerHook_cps(hook: cps, func: js.Array[js.Function0[Double]]): Unit = js.native
    @JSName("registerHook")
    def registerHook_cps(hook: cps, func: js.Function0[Double]): Unit = js.native
    @JSName("registerHook")
    def registerHook_ticker(hook: ticker, func: js.Array[js.Function0[js.Array[String]]]): Unit = js.native
    @JSName("registerHook")
    def registerHook_ticker(hook: ticker, func: js.Function0[js.Array[String]]): Unit = js.native
    
    def registerMod(id: String, obj: Mod): Unit = js.native
    
    var reindeerClicked: Double = js.native
    
    var reindeerDrops: js.Array[String] = js.native
    
    def removeClass(what: String): Unit = js.native
    
    var researchT: Double = js.native
    
    var resets: Double = js.native
    
    def salvageSave(): Unit = js.native
    
    var santaDrops: js.Array[String] = js.native
    
    var santaLevel: Double = js.native
    
    var santaLevels: js.Array[String] = js.native
    
    def saySeasonSwitchUses(): String = js.native
    
    @JSName("sayTime")
    def sayTime_1(time: Double, detail: `-1`): String = js.native
    @JSName("sayTime")
    def sayTime_1(time: Double, detail: `1`): String = js.native
    @JSName("sayTime")
    def sayTime_2(time: Double, detail: `2`): String = js.native
    @JSName("sayTime")
    def sayTime_3(time: Double, detail: `3`): String = js.native
    @JSName("sayTime")
    def sayTime_4(time: Double, detail: `4`): String = js.native
    
    var scriptBindings: js.Array[js.UndefOr[scala.Nothing]] with (Record[String, typings.cookieclicker.Game.GameObject]) = js.native
    
    def scriptLoaded(who: typings.cookieclicker.Game.GameObject, script: String): Unit = js.native
    
    var season: String = js.native
    
    var seasonDrops: js.Array[String] = js.native
    
    var seasonT: Double = js.native
    
    var seasonTriggerBasePrice: Double = js.native
    
    var seasonUses: Double = js.native
    
    var seasons: Record[String, Season] = js.native
    
    var seed: String = js.native
    
    var sesame: Double = js.native
    
    def setOnCrate(what: Double): Unit = js.native
    
    def setVolume(what: Double): Unit = js.native
    
    var shimmerTypes: Record[String, ShimmerType] = js.native
    
    var shimmers: js.Array[
        typings.cookieclicker.Game.Shimmer[/* keyof std.Record<string, cookieclicker.Game.ShimmerType> */ String, js.Object]
      ] = js.native
    
    var shimmersL: HTMLDivElement = js.native
    
    var shimmersN: Double = js.native
    
    def showBackupWarning(): Unit = js.native
    
    def sortSprites(a: js.Any, b: js.Any): Double = js.native
    
    def sortSpritesById(a: js.Any, b: js.Any): Double = js.native
    
    var sortedMods: js.Array[Mod] = js.native
    
    var sparkles: js.Object = js.native
    
    var sparklesFrames: Double = js.native
    
    var sparklesT: Double = js.native
    
    var specialTab: String = js.native
    
    var specialTabHovered: String = js.native
    
    var specialTabs: js.Array[String] = js.native
    
    def spendLump(n: Double, str: String, func: js.Function0[Unit]): js.Function0[Unit] = js.native
    
    var startDate: Double = js.native
    
    def storeBulkButton(id: Double): Unit = js.native
    
    def storeBuyAll(): Unit | `false` = js.native
    
    var storeToRefresh: Double = js.native
    
    var textParticles: js.Array[Particle] = js.native
    
    def textParticlesAdd(text: String, el: js.UndefOr[scala.Nothing], posX: Double, posY: Double): Particle = js.native
    @JSName("textParticlesAdd")
    def textParticlesAdd_0(text: String, el: `0`, posX: Double, posY: Double): Particle = js.native
    
    def textParticlesUpdate(): Unit = js.native
    
    var textParticlesY: Double = js.native
    
    var thresholdIcons: js.Array[Double] = js.native
    
    var tickerBelowL: js.Object = js.native
    
    var tickerCompactL: js.Object = js.native
    
    var tickerL: js.Object = js.native
    
    var time: Double = js.native
    
    var timedout: Boolean = js.native
    
    def tinyCookie(): String = js.native
    
    var toSave: Boolean = js.native
    
    var tooltip: Tooltip = js.native
    
    var touchEvents: PseudoBoolean = js.native
    
    var unbuffedCps: Double = js.native
    
    def updateBuffs(): Unit = js.native
    
    def updateClasses(): Unit = js.native
    
    var updateLog: String = js.native
    
    def updateShimmers(): Unit = js.native
    
    var upgradesToRebuild: Double = js.native
    
    var useLocalStorage: Double = js.native
    
    var useSwap: js.UndefOr[js.Function1[/* n */ Double, Unit]] = js.native
    
    var vanilla: PseudoBoolean = js.native
    
    var vault: js.Array[Double] = js.native
    
    var version: Double = js.native
    
    var volume: Double = js.native
    
    var windowH: Double = js.native
    
    var windowW: Double = js.native
    
    var wrinklerHP: Double = js.native
    
    var wrinklerSquishSound: Double = js.native
    
    var wrinklers: js.Array[Wrinkler] = js.native
    
    var wrinklersPopped: Double = js.native
    
    @js.native
    class Achievement protected ()
      extends typings.cookieclicker.Game.Achievement {
      /**
        * Creates an achievement
        * @param name The name of the achievement
        * @param desc The HTML string of the description
        * @param icon The icon of the achievement
        */
      def this(name: String, desc: String, icon: Icon) = this()
    }
    
    @js.native
    class GameObject protected ()
      extends typings.cookieclicker.Game.GameObject {
      /**
        * Creates a new building
        * @param name Name of the building
        * @param commonName Additional string for the building, split by |:
        * the name of the building,
        * then in plural,
        * how the building produced the cookies,
        * the effect from sugar lumps,
        * then in plural
        * @param desc Description of the building
        * @param icon Big icon (that shows up in store)'s row
        * @param iconColumn Icon column for the building
        * @param art Building's art
        * @param price Unused
        * @param cpsFunc The function to calculate CPS
        * @param buyFunction The function which gets called when it's bought
        */
      def this(
        name: String,
        commonName: String,
        desc: String,
        icon: Double,
        iconColumn: Double,
        art: Art,
        price: Double,
        cps: js.Function1[/* me */ typings.cookieclicker.Game.GameObject, Double],
        buyFunction: js.ThisFunction0[/* this */ typings.cookieclicker.Game.GameObject, Unit]
      ) = this()
    }
    
    @js.native
    class Note protected ()
      extends typings.cookieclicker.Game.Note {
      def this(title: String) = this()
      def this(title: String, desc: String) = this()
      def this(title: String, desc: js.UndefOr[scala.Nothing], pic: Icon) = this()
      def this(title: String, desc: String, pic: Icon) = this()
      def this(title: String, desc: js.UndefOr[scala.Nothing], pic: js.UndefOr[scala.Nothing], quick: Double) = this()
      def this(title: String, desc: js.UndefOr[scala.Nothing], pic: Icon, quick: Double) = this()
      def this(title: String, desc: String, pic: js.UndefOr[scala.Nothing], quick: Double) = this()
      def this(title: String, desc: String, pic: Icon, quick: Double) = this()
    }
    
    @js.native
    class Shimmer[N /* <: String */, C /* <: js.Object */] protected ()
      extends typings.cookieclicker.Game.Shimmer[N, C] {
      /**
        * Creates a new shimmer
        * @param type The type of the shimmer, must be a key of `shimmerTypes`
        * @param obj The configuration object
        * @param noCount True if to not count the shimmer in `shimmersN`
        */
      def this(`type`: N) = this()
      def this(`type`: N, obj: C) = this()
      def this(`type`: N, obj: C, noCount: Boolean) = this()
      def this(`type`: N, obj: js.UndefOr[scala.Nothing], noCount: Boolean) = this()
    }
    
    @js.native
    class Upgrade protected ()
      extends typings.cookieclicker.Game.Upgrade {
      /**
        * Creates a new generic upgrade
        * @param name The name of the upgrade
        * @param desc The description of the upgrade
        * @param price The price in cookies for the upgrade
        * @param icon The Icon to use for the upgrade
        * @param buyFunction The function which gets called when the upgrade bought
        */
      def this(name: String, desc: String, price: Double, icon: Icon) = this()
      def this(name: String, desc: String, price: Double, icon: Icon, buyFunction: js.Function0[Unit]) = this()
    }
    
    @js.native
    object UpgradesByPool extends js.Object {
      
      @JSName("")
      var _empty: js.Array[typings.cookieclicker.Game.Upgrade] = js.native
      
      var cookie: js.Array[typings.cookieclicker.Game.Upgrade] = js.native
      
      var debug: js.Array[typings.cookieclicker.Game.Upgrade] = js.native
      
      var prestige: js.Array[typings.cookieclicker.Game.Upgrade] = js.native
      
      var prestigeDecor: js.Array[typings.cookieclicker.Game.Upgrade] = js.native
      
      var tech: js.Array[typings.cookieclicker.Game.Upgrade] = js.native
      
      var toggle: js.Array[typings.cookieclicker.Game.Upgrade] = js.native
      
      var unused: js.Array[typings.cookieclicker.Game.Upgrade] = js.native
    }
    
    @js.native
    class buffType protected ()
      extends typings.cookieclicker.Game.buffType {
      def this(
        name: String,
        func: js.Function4[
                /* time */ Double, 
                /* arg1 */ js.UndefOr[Double], 
                /* arg2 */ js.UndefOr[Double], 
                /* arg3 */ js.UndefOr[Double], 
                Buff
              ]
      ) = this()
    }
  }
  
  @js.native
  class Loader ()
    extends typings.cookieclicker.Loader
}
