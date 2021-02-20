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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("AddEvent")
  @js.native
  def AddEvent(htmlElement: HTMLElement, eventName: String, eventFunction: js.Function1[/* e */ Event, Unit]): Unit = js.native
  
  /**
    * Beautifies a number
    * @param val The number to beautify
    * @param floats The amount of decimals to show
    */
  @JSGlobal("Beautify")
  @js.native
  def Beautify(`val`: Double): String = js.native
  @JSGlobal("Beautify")
  @js.native
  def Beautify(`val`: Double, floats: Double): String = js.native
  
  object Game {
    
    @JSGlobal("Game")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Game.Achievement")
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
    
    @JSGlobal("Game.Achievements")
    @js.native
    def Achievements: js.Array[typings.cookieclicker.Game.Achievement] = js.native
    
    @JSGlobal("Game.AchievementsById")
    @js.native
    def AchievementsById: js.Array[typings.cookieclicker.Game.Achievement] = js.native
    @scala.inline
    def AchievementsById_=(x: js.Array[typings.cookieclicker.Game.Achievement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AchievementsById")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.AchievementsN")
    @js.native
    def AchievementsN: Double = js.native
    @scala.inline
    def AchievementsN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AchievementsN")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.AchievementsOwned")
    @js.native
    def AchievementsOwned: Double = js.native
    @scala.inline
    def AchievementsOwned_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AchievementsOwned")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def Achievements_=(x: js.Array[typings.cookieclicker.Game.Achievement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Achievements")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.AddToLog")
    @js.native
    def AddToLog(what: String): Unit = js.native
    
    @JSGlobal("Game.Ascend")
    @js.native
    def Ascend(bypass: Boolean): Unit = js.native
    
    @JSGlobal("Game.AscendBreakpoint")
    @js.native
    def AscendBreakpoint: Double = js.native
    @scala.inline
    def AscendBreakpoint_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AscendBreakpoint")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.AscendDragX")
    @js.native
    def AscendDragX: Double = js.native
    @scala.inline
    def AscendDragX_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AscendDragX")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.AscendDragY")
    @js.native
    def AscendDragY: Double = js.native
    @scala.inline
    def AscendDragY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AscendDragY")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.AscendDragging")
    @js.native
    def AscendDragging: Double = js.native
    @scala.inline
    def AscendDragging_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AscendDragging")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.AscendDuration")
    @js.native
    def AscendDuration: Double = js.native
    @scala.inline
    def AscendDuration_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AscendDuration")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.AscendGridSnap")
    @js.native
    def AscendGridSnap: Double = js.native
    @scala.inline
    def AscendGridSnap_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AscendGridSnap")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.AscendOffX")
    @js.native
    def AscendOffX: Double = js.native
    
    @JSGlobal("Game.AscendOffXT")
    @js.native
    def AscendOffXT: Double = js.native
    @scala.inline
    def AscendOffXT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AscendOffXT")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def AscendOffX_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AscendOffX")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.AscendOffY")
    @js.native
    def AscendOffY: Double = js.native
    
    @JSGlobal("Game.AscendOffYT")
    @js.native
    def AscendOffYT: Double = js.native
    @scala.inline
    def AscendOffYT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AscendOffYT")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def AscendOffY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AscendOffY")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.AscendRefocus")
    @js.native
    def AscendRefocus(): Unit = js.native
    
    @JSGlobal("Game.AscendTimer")
    @js.native
    def AscendTimer: Double = js.native
    @scala.inline
    def AscendTimer_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AscendTimer")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.AscendZoom")
    @js.native
    def AscendZoom: Double = js.native
    
    @JSGlobal("Game.AscendZoomT")
    @js.native
    def AscendZoomT: Double = js.native
    @scala.inline
    def AscendZoomT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AscendZoomT")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def AscendZoom_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AscendZoom")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.AssignPermanentSlot")
    @js.native
    def AssignPermanentSlot(slot: Double): Unit = js.native
    
    @JSGlobal("Game.BGsByChoice")
    @js.native
    def BGsByChoice: Record[Double, ChoiceCosmetics] = js.native
    @scala.inline
    def BGsByChoice_=(x: Record[Double, ChoiceCosmetics]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BGsByChoice")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.Background")
    @js.native
    def Background: CanvasRenderingContext2D = js.native
    @scala.inline
    def Background_=(x: CanvasRenderingContext2D): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Background")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.BankAchievement")
    @js.native
    def BankAchievement(name: String): BankAchievementClass = js.native
    @JSGlobal("Game.BankAchievement")
    @js.native
    def BankAchievement(name: String, q: String): BankAchievementClass = js.native
    
    @JSGlobal("Game.BankAchievements")
    @js.native
    def BankAchievements: js.Array[BankAchievementClass] = js.native
    @scala.inline
    def BankAchievements_=(x: js.Array[BankAchievementClass]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BankAchievements")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.BigCookieSize")
    @js.native
    def BigCookieSize: Double = js.native
    
    @JSGlobal("Game.BigCookieSizeD")
    @js.native
    def BigCookieSizeD: Double = js.native
    @scala.inline
    def BigCookieSizeD_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BigCookieSizeD")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.BigCookieSizeT")
    @js.native
    def BigCookieSizeT: Double = js.native
    @scala.inline
    def BigCookieSizeT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BigCookieSizeT")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def BigCookieSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BigCookieSize")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.BigCookieState")
    @js.native
    def BigCookieState: Double = js.native
    @scala.inline
    def BigCookieState_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BigCookieState")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.BuildAscendTree")
    @js.native
    def BuildAscendTree(): Unit = js.native
    
    @JSGlobal("Game.BuildStore")
    @js.native
    def BuildStore(): Unit = js.native
    
    @JSGlobal("Game.BuildingsOwned")
    @js.native
    def BuildingsOwned: Double = js.native
    @scala.inline
    def BuildingsOwned_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BuildingsOwned")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.CalculateGains")
    @js.native
    def CalculateGains(): Unit = js.native
    
    @JSGlobal("Game.CanClick")
    @js.native
    def CanClick: Double = js.native
    @scala.inline
    def CanClick_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CanClick")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.CheckUpdates")
    @js.native
    def CheckUpdates(): Unit = js.native
    
    @JSGlobal("Game.CheckUpdatesResponse")
    @js.native
    def CheckUpdatesResponse(response: String): Unit = js.native
    
    @JSGlobal("Game.Click")
    @js.native
    def Click: Double = js.native
    
    @JSGlobal("Game.ClickCookie")
    @js.native
    def ClickCookie(e: MouseEvent, amount: Double): Unit = js.native
    
    @JSGlobal("Game.ClickProduct")
    @js.native
    def ClickProduct(what: typings.cookieclicker.Game.GameObject): Unit = js.native
    
    @JSGlobal("Game.ClickSpecialPic")
    @js.native
    def ClickSpecialPic(): Unit = js.native
    
    @JSGlobal("Game.ClickTinyCookie")
    @js.native
    def ClickTinyCookie(): Unit = js.native
    
    @scala.inline
    def Click_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Click")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.CloseNote")
    @js.native
    def CloseNote(id: Double): Unit = js.native
    
    @JSGlobal("Game.CloseNotes")
    @js.native
    def CloseNotes(): Unit = js.native
    
    @JSGlobal("Game.ClosePrompt")
    @js.native
    def ClosePrompt(): Unit = js.native
    
    @JSGlobal("Game.CollectWrinklers")
    @js.native
    def CollectWrinklers(): Unit = js.native
    
    @JSGlobal("Game.ComputeCps")
    @js.native
    def ComputeCps(base: Double, mult: Double, bonus: Double): Double = js.native
    
    @JSGlobal("Game.ConfirmPrompt")
    @js.native
    def ConfirmPrompt(): Unit = js.native
    
    @JSGlobal("Game.CountsAsAchievementOwned")
    @js.native
    def CountsAsAchievementOwned(pool: AchievementPool): Boolean = js.native
    
    @JSGlobal("Game.CountsAsUpgradeOwned")
    @js.native
    def CountsAsUpgradeOwned(pool: String): Boolean = js.native
    
    @JSGlobal("Game.CpsAchievement")
    @js.native
    def CpsAchievement(name: String): CpsAchievementClass = js.native
    @JSGlobal("Game.CpsAchievement")
    @js.native
    def CpsAchievement(name: String, q: String): CpsAchievementClass = js.native
    
    @JSGlobal("Game.CpsAchievements")
    @js.native
    def CpsAchievements: js.Array[CpsAchievementClass] = js.native
    @scala.inline
    def CpsAchievements_=(x: js.Array[CpsAchievementClass]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CpsAchievements")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.DebugUpgradeCpS")
    @js.native
    def DebugUpgradeCpS(): Unit = js.native
    
    @JSGlobal("Game.DebuggingPrestige")
    @js.native
    def DebuggingPrestige: Double = js.native
    @scala.inline
    def DebuggingPrestige_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DebuggingPrestige")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.DefaultPrefs")
    @js.native
    def DefaultPrefs(): Unit = js.native
    
    @JSGlobal("Game.DescribeDragonAura")
    @js.native
    def DescribeDragonAura(aura: Double): Unit = js.native
    
    @JSGlobal("Game.Dissolve")
    @js.native
    def Dissolve(howmuch: Double): Unit = js.native
    
    @JSGlobal("Game.Draw")
    @js.native
    def Draw(): Unit = js.native
    
    @JSGlobal("Game.DrawBackground")
    @js.native
    def DrawBackground(): Unit = js.native
    
    @JSGlobal("Game.DrawBuildings")
    @js.native
    def DrawBuildings(): Unit = js.native
    
    @JSGlobal("Game.DrawSpecial")
    @js.native
    def DrawSpecial(): Unit = js.native
    
    @JSGlobal("Game.DrawWrinklers")
    @js.native
    def DrawWrinklers(): Unit = js.native
    
    @JSGlobal("Game.DropEgg")
    @js.native
    def DropEgg(failRate: Double): Unit = js.native
    
    @JSGlobal("Game.Earn")
    @js.native
    def Earn(howmuch: Double): Unit = js.native
    
    @JSGlobal("Game.EarnHeavenlyChips")
    @js.native
    def EarnHeavenlyChips(cookiesForfeited: Double): Unit = js.native
    
    @JSGlobal("Game.EditAscend")
    @js.native
    def EditAscend(): Unit = js.native
    
    @JSGlobal("Game.ErrorFrame")
    @js.native
    def ErrorFrame(): Unit = js.native
    
    @JSGlobal("Game.ExportSave")
    @js.native
    def ExportSave(): Unit = js.native
    
    @JSGlobal("Game.FileLoad")
    @js.native
    def FileLoad(e: InputEvent): Unit = js.native
    
    @JSGlobal("Game.FileSave")
    @js.native
    def FileSave(): Unit = js.native
    
    @JSGlobal("Game.GameObject")
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
    
    @JSGlobal("Game.GetAllDebugs")
    @js.native
    def GetAllDebugs(): Unit = js.native
    
    @JSGlobal("Game.GetBakeryName")
    @js.native
    def GetBakeryName(): String = js.native
    
    @JSGlobal("Game.GetHeavenlyMultiplier")
    @js.native
    def GetHeavenlyMultiplier(): Double = js.native
    
    @JSGlobal("Game.GetHowManyEggs")
    @js.native
    def GetHowManyEggs(): Double = js.native
    
    @JSGlobal("Game.GetHowManyHalloweenDrops")
    @js.native
    def GetHowManyHalloweenDrops(): Double = js.native
    
    @JSGlobal("Game.GetHowManyHeartDrops")
    @js.native
    def GetHowManyHeartDrops(): Double = js.native
    
    @JSGlobal("Game.GetHowManyReindeerDrops")
    @js.native
    def GetHowManyReindeerDrops(): Double = js.native
    
    @JSGlobal("Game.GetHowManySantaDrops")
    @js.native
    def GetHowManySantaDrops(): Double = js.native
    
    @JSGlobal("Game.GetIcon")
    @js.native
    def GetIcon(`type`: String, tier: String): Icon = js.native
    @JSGlobal("Game.GetIcon")
    @js.native
    def GetIcon(`type`: String, tier: Double): Icon = js.native
    
    @JSGlobal("Game.GetMouseCoords")
    @js.native
    def GetMouseCoords(e: MouseEvent): Unit = js.native
    
    @JSGlobal("Game.GetTieredCpsMult")
    @js.native
    def GetTieredCpsMult(me: typings.cookieclicker.Game.GameObject): Double = js.native
    
    @JSGlobal("Game.GiveUpAscend")
    @js.native
    def GiveUpAscend(bypass: Boolean): Unit = js.native
    
    @JSGlobal("Game.GrabData")
    @js.native
    def GrabData(): Unit = js.native
    
    @JSGlobal("Game.GrabDataResponse")
    @js.native
    def GrabDataResponse(response: String): Unit = js.native
    
    @JSGlobal("Game.GrandmaSynergies")
    @js.native
    def GrandmaSynergies: js.Array[String] = js.native
    @scala.inline
    def GrandmaSynergies_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GrandmaSynergies")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.GrandmaSynergy")
    @js.native
    def GrandmaSynergy(name: String, desc: String, building: String): GrandmaSynergyClass = js.native
    
    @JSGlobal("Game.HCfactor")
    @js.native
    def HCfactor: Double = js.native
    @scala.inline
    def HCfactor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HCfactor")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.HardReset")
    @js.native
    def HardReset_0(bypass: `0`): Unit = js.native
    @JSGlobal("Game.HardReset")
    @js.native
    def HardReset_1(bypass: `1`): Unit = js.native
    @JSGlobal("Game.HardReset")
    @js.native
    def HardReset_2(bypass: `2`): Unit = js.native
    
    @JSGlobal("Game.Has")
    @js.native
    def Has(what: String): PseudoBoolean = js.native
    
    @JSGlobal("Game.HasAchiev")
    @js.native
    def HasAchiev(what: String): PseudoBoolean = js.native
    
    @JSGlobal("Game.HasUnlocked")
    @js.native
    def HasUnlocked(what: String): PseudoBoolean = js.native
    
    @JSGlobal("Game.HowManyCookiesReset")
    @js.native
    def HowManyCookiesReset(chips: Double): Double = js.native
    
    @JSGlobal("Game.HowMuchPrestige")
    @js.native
    def HowMuchPrestige(cookies: Double): Double = js.native
    
    @JSGlobal("Game.ImportSave")
    @js.native
    def ImportSave(): Unit = js.native
    
    @JSGlobal("Game.ImportSaveCode")
    @js.native
    def ImportSaveCode(save: String): Unit = js.native
    
    @JSGlobal("Game.Init")
    @js.native
    def Init(): Unit = js.native
    
    @JSGlobal("Game.Launch")
    @js.native
    def Launch(): Unit = js.native
    
    @JSGlobal("Game.LeftBackground")
    @js.native
    def LeftBackground: CanvasRenderingContext2D = js.native
    @scala.inline
    def LeftBackground_=(x: CanvasRenderingContext2D): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LeftBackground")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.Load")
    @js.native
    def Load(): Unit = js.native
    
    @JSGlobal("Game.LoadMinigames")
    @js.native
    def LoadMinigames(): Unit = js.native
    
    @JSGlobal("Game.LoadMod")
    @js.native
    def LoadMod(url: String): Unit = js.native
    
    @JSGlobal("Game.LoadSave")
    @js.native
    def LoadSave(): Boolean = js.native
    @JSGlobal("Game.LoadSave")
    @js.native
    def LoadSave(data: String): Boolean = js.native
    
    @JSGlobal("Game.LoadWrinklers")
    @js.native
    def LoadWrinklers(amount: Double, number: Double, shinies: Double, amountShinies: Double): Unit = js.native
    
    @JSGlobal("Game.Loader")
    @js.native
    def Loader: typings.cookieclicker.Loader = js.native
    @scala.inline
    def Loader_=(x: typings.cookieclicker.Loader): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Loader")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.Lock")
    @js.native
    def Lock(what: String): Unit = js.native
    @JSGlobal("Game.Lock")
    @js.native
    def Lock(what: js.Array[String]): Unit = js.native
    
    @JSGlobal("Game.Log")
    @js.native
    def Log: js.Array[String] = js.native
    @scala.inline
    def Log_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Log")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.Logic")
    @js.native
    def Logic(): Unit = js.native
    
    @JSGlobal("Game.Loop")
    @js.native
    def Loop(): Unit = js.native
    
    @JSGlobal("Game.MakeTiered")
    @js.native
    def MakeTiered(upgrade: typings.cookieclicker.Game.Upgrade, tier: String, col: Double): Unit = js.native
    @JSGlobal("Game.MakeTiered")
    @js.native
    def MakeTiered(upgrade: typings.cookieclicker.Game.Upgrade, tier: Double, col: Double): Unit = js.native
    
    @JSGlobal("Game.MaxSpecials")
    @js.native
    def MaxSpecials(): Unit = js.native
    
    @JSGlobal("Game.Milk")
    @js.native
    def Milk: typings.cookieclicker.Game.Milk = js.native
    @scala.inline
    def Milk_=(x: Milk): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Milk")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.Milks")
    @js.native
    def Milks: js.Array[Milk] = js.native
    
    @JSGlobal("Game.MilksByChoice")
    @js.native
    def MilksByChoice: Record[Double, ChoiceCosmetics] = js.native
    @scala.inline
    def MilksByChoice_=(x: Record[Double, ChoiceCosmetics]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MilksByChoice")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def Milks_=(x: js.Array[Milk]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Milks")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.Mobile")
    @js.native
    def Mobile_(): Unit = js.native
    
    @JSGlobal("Game.Mods")
    @js.native
    def Mods: Record[String, Mod] = js.native
    @scala.inline
    def Mods_=(x: Record[String, Mod]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Mods")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.NewUpgradeCookie")
    @js.native
    def NewUpgradeCookie(obj: CookieUpgradeParameter): CookieUpgrade = js.native
    
    @JSGlobal("Game.Note")
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
    
    @JSGlobal("Game.Notes")
    @js.native
    def Notes: js.Array[typings.cookieclicker.Game.Note] = js.native
    
    @JSGlobal("Game.NotesById")
    @js.native
    def NotesById: js.Array[typings.cookieclicker.Game.Note] = js.native
    @scala.inline
    def NotesById_=(x: js.Array[typings.cookieclicker.Game.Note]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NotesById")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.NotesDraw")
    @js.native
    def NotesDraw(): Unit = js.native
    
    @JSGlobal("Game.NotesLogic")
    @js.native
    def NotesLogic(): Unit = js.native
    
    @scala.inline
    def Notes_=(x: js.Array[typings.cookieclicker.Game.Note]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Notes")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.Notify")
    @js.native
    def Notify(title: String): Unit = js.native
    @JSGlobal("Game.Notify")
    @js.native
    def Notify(
      title: String,
      desc: js.UndefOr[scala.Nothing],
      pic: js.UndefOr[scala.Nothing],
      quick: js.UndefOr[scala.Nothing],
      noLog: Boolean
    ): Unit = js.native
    @JSGlobal("Game.Notify")
    @js.native
    def Notify(title: String, desc: js.UndefOr[scala.Nothing], pic: js.UndefOr[scala.Nothing], quick: Double): Unit = js.native
    @JSGlobal("Game.Notify")
    @js.native
    def Notify(
      title: String,
      desc: js.UndefOr[scala.Nothing],
      pic: js.UndefOr[scala.Nothing],
      quick: Double,
      noLog: Boolean
    ): Unit = js.native
    @JSGlobal("Game.Notify")
    @js.native
    def Notify(title: String, desc: js.UndefOr[scala.Nothing], pic: Icon): Unit = js.native
    @JSGlobal("Game.Notify")
    @js.native
    def Notify(
      title: String,
      desc: js.UndefOr[scala.Nothing],
      pic: Icon,
      quick: js.UndefOr[scala.Nothing],
      noLog: Boolean
    ): Unit = js.native
    @JSGlobal("Game.Notify")
    @js.native
    def Notify(title: String, desc: js.UndefOr[scala.Nothing], pic: Icon, quick: Double): Unit = js.native
    @JSGlobal("Game.Notify")
    @js.native
    def Notify(title: String, desc: js.UndefOr[scala.Nothing], pic: Icon, quick: Double, noLog: Boolean): Unit = js.native
    @JSGlobal("Game.Notify")
    @js.native
    def Notify(title: String, desc: String): Unit = js.native
    @JSGlobal("Game.Notify")
    @js.native
    def Notify(
      title: String,
      desc: String,
      pic: js.UndefOr[scala.Nothing],
      quick: js.UndefOr[scala.Nothing],
      noLog: Boolean
    ): Unit = js.native
    @JSGlobal("Game.Notify")
    @js.native
    def Notify(title: String, desc: String, pic: js.UndefOr[scala.Nothing], quick: Double): Unit = js.native
    @JSGlobal("Game.Notify")
    @js.native
    def Notify(title: String, desc: String, pic: js.UndefOr[scala.Nothing], quick: Double, noLog: Boolean): Unit = js.native
    @JSGlobal("Game.Notify")
    @js.native
    def Notify(title: String, desc: String, pic: Icon): Unit = js.native
    @JSGlobal("Game.Notify")
    @js.native
    def Notify(title: String, desc: String, pic: Icon, quick: js.UndefOr[scala.Nothing], noLog: Boolean): Unit = js.native
    @JSGlobal("Game.Notify")
    @js.native
    def Notify(title: String, desc: String, pic: Icon, quick: Double): Unit = js.native
    @JSGlobal("Game.Notify")
    @js.native
    def Notify(title: String, desc: String, pic: Icon, quick: Double, noLog: Boolean): Unit = js.native
    
    @JSGlobal("Game.Objects")
    @js.native
    def Objects: (Record[String, typings.cookieclicker.Game.GameObject]) with Bank = js.native
    
    @JSGlobal("Game.ObjectsById")
    @js.native
    def ObjectsById: js.Array[typings.cookieclicker.Game.GameObject] = js.native
    @scala.inline
    def ObjectsById_=(x: js.Array[typings.cookieclicker.Game.GameObject]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ObjectsById")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.ObjectsN")
    @js.native
    def ObjectsN: Double = js.native
    @scala.inline
    def ObjectsN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ObjectsN")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def Objects_=(x: (Record[String, typings.cookieclicker.Game.GameObject]) with Bank): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Objects")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.OnAscend")
    @js.native
    def OnAscend: Double = js.native
    @scala.inline
    def OnAscend_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OnAscend")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.OpenSesame")
    @js.native
    def OpenSesame(): Unit = js.native
    
    @JSGlobal("Game.PermanentSlotIcon")
    @js.native
    def PermanentSlotIcon(slot: Double): Icon = js.native
    
    @JSGlobal("Game.PickAscensionMode")
    @js.native
    def PickAscensionMode(): Unit = js.native
    
    @JSGlobal("Game.PopRandomWrinkler")
    @js.native
    def PopRandomWrinkler(): Wrinkler | Boolean = js.native
    
    @JSGlobal("Game.Popup")
    @js.native
    def Popup(text: String, x: Double, y: Double): Unit = js.native
    
    @JSGlobal("Game.PrestigeUpgrades")
    @js.native
    def PrestigeUpgrades: js.Array[HeavenlyUpgrade] = js.native
    @scala.inline
    def PrestigeUpgrades_=(x: js.Array[HeavenlyUpgrade]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PrestigeUpgrades")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.ProductionAchievement")
    @js.native
    def ProductionAchievement(name: String, building: String, tier: Double): typings.cookieclicker.Game.Achievement = js.native
    @JSGlobal("Game.ProductionAchievement")
    @js.native
    def ProductionAchievement(name: String, building: String, tier: Double, q: js.UndefOr[scala.Nothing], mult: Double): typings.cookieclicker.Game.Achievement = js.native
    @JSGlobal("Game.ProductionAchievement")
    @js.native
    def ProductionAchievement(name: String, building: String, tier: Double, q: String): typings.cookieclicker.Game.Achievement = js.native
    @JSGlobal("Game.ProductionAchievement")
    @js.native
    def ProductionAchievement(name: String, building: String, tier: Double, q: String, mult: Double): typings.cookieclicker.Game.Achievement = js.native
    
    @JSGlobal("Game.Prompt")
    @js.native
    def Prompt(content: String, options: js.Array[String | (js.Tuple2[String, String])]): Unit = js.native
    @JSGlobal("Game.Prompt")
    @js.native
    def Prompt(
      content: String,
      options: js.Array[String | (js.Tuple2[String, String])],
      updateFunc: js.UndefOr[scala.Nothing],
      style: String
    ): Unit = js.native
    @JSGlobal("Game.Prompt")
    @js.native
    def Prompt(
      content: String,
      options: js.Array[String | (js.Tuple2[String, String])],
      updateFunc: js.Function0[Unit]
    ): Unit = js.native
    @JSGlobal("Game.Prompt")
    @js.native
    def Prompt(
      content: String,
      options: js.Array[String | (js.Tuple2[String, String])],
      updateFunc: js.Function0[Unit],
      style: String
    ): Unit = js.native
    
    @JSGlobal("Game.PurchaseHeavenlyUpgrade")
    @js.native
    def PurchaseHeavenlyUpgrade(what: typings.cookieclicker.Game.Upgrade): Unit = js.native
    
    @JSGlobal("Game.PutUpgradeInPermanentSlot")
    @js.native
    def PutUpgradeInPermanentSlot(upgrade: typings.cookieclicker.Game.Upgrade, slot: Double): Unit = js.native
    
    @JSGlobal("Game.RandomBakeryName")
    @js.native
    def RandomBakeryName(): String = js.native
    
    @JSGlobal("Game.RebuildUpgrades")
    @js.native
    def RebuildUpgrades(): Unit = js.native
    
    @JSGlobal("Game.RefreshStore")
    @js.native
    def RefreshStore(): Unit = js.native
    
    @JSGlobal("Game.Reincarnate")
    @js.native
    def Reincarnate(bypass: Boolean): Unit = js.native
    
    @JSGlobal("Game.ReincarnateDuration")
    @js.native
    def ReincarnateDuration: Double = js.native
    @scala.inline
    def ReincarnateDuration_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReincarnateDuration")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.ReincarnateTimer")
    @js.native
    def ReincarnateTimer: Double = js.native
    @scala.inline
    def ReincarnateTimer_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReincarnateTimer")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.RemoveAchiev")
    @js.native
    def RemoveAchiev(what: String): Unit = js.native
    
    @JSGlobal("Game.RequiresConfirmation")
    @js.native
    def RequiresConfirmation(upgrade: typings.cookieclicker.Game.Upgrade, prompt: String): Unit = js.native
    
    @JSGlobal("Game.Reset")
    @js.native
    def Reset(hard: Boolean): Unit = js.native
    
    @JSGlobal("Game.ResetWrinklers")
    @js.native
    def ResetWrinklers(): Unit = js.native
    
    @JSGlobal("Game.Resume")
    @js.native
    def Resume(): Unit = js.native
    
    @JSGlobal("Game.RuinTheFun")
    @js.native
    def RuinTheFun(silent: Boolean): String = js.native
    
    @JSGlobal("Game.SaveTo")
    @js.native
    def SaveTo: String = js.native
    @scala.inline
    def SaveTo_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SaveTo")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.SaveWrinklers")
    @js.native
    def SaveWrinklers(): WrinklerSave = js.native
    
    @JSGlobal("Game.Scroll")
    @js.native
    def Scroll: Double = js.native
    @scala.inline
    def Scroll_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Scroll")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.SelectDragonAura")
    @js.native
    def SelectDragonAura(slot: Double, update: Boolean): Unit = js.native
    
    @JSGlobal("Game.SelectedHeavenlyUpgrade")
    @js.native
    def SelectedHeavenlyUpgrade: Double = js.native
    @scala.inline
    def SelectedHeavenlyUpgrade_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SelectedHeavenlyUpgrade")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.SelectingDragonAura")
    @js.native
    def SelectingDragonAura: PseudoBoolean = js.native
    @scala.inline
    def SelectingDragonAura_=(x: PseudoBoolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SelectingDragonAura")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.SelectingPermanentUpgrade")
    @js.native
    def SelectingPermanentUpgrade: Double = js.native
    @scala.inline
    def SelectingPermanentUpgrade_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SelectingPermanentUpgrade")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.SesameReset")
    @js.native
    def SesameReset(): Unit = js.native
    
    @JSGlobal("Game.SetAllAchievs")
    @js.native
    def SetAllAchievs(on: Boolean): Unit = js.native
    
    @JSGlobal("Game.SetAllUpgrades")
    @js.native
    def SetAllUpgrades(on: Boolean): Unit = js.native
    
    @JSGlobal("Game.SetDragonAura")
    @js.native
    def SetDragonAura(aura: Double, slot: Double): Unit = js.native
    
    @JSGlobal("Game.SetResearch")
    @js.native
    def SetResearch(what: String): Unit = js.native
    @JSGlobal("Game.SetResearch")
    @js.native
    def SetResearch(what: String, time: scala.Nothing): Unit = js.native
    
    @JSGlobal("Game.SetTier")
    @js.native
    def SetTier(building: String, tier: String): Unit = js.native
    @JSGlobal("Game.SetTier")
    @js.native
    def SetTier(building: String, tier: Double): Unit = js.native
    
    @JSGlobal("Game.Shimmer")
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
    
    @JSGlobal("Game.ShowMenu")
    @js.native
    def ShowMenu(what: String): Unit = js.native
    
    @JSGlobal("Game.ShowPanel")
    @js.native
    def ShowPanel(what: String): Unit = js.native
    
    @JSGlobal("Game.SparkleAt")
    @js.native
    def SparkleAt(x: Double, y: Double): Unit = js.native
    
    @JSGlobal("Game.SparkleOn")
    @js.native
    def SparkleOn(el: HTMLElement): Unit = js.native
    
    @JSGlobal("Game.SpawnWrinkler")
    @js.native
    def SpawnWrinkler(): Wrinkler | Boolean = js.native
    @JSGlobal("Game.SpawnWrinkler")
    @js.native
    def SpawnWrinkler(me: Wrinkler): Wrinkler | Boolean = js.native
    
    @JSGlobal("Game.SpecialGrandmaUnlock")
    @js.native
    def SpecialGrandmaUnlock: Double = js.native
    @scala.inline
    def SpecialGrandmaUnlock_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SpecialGrandmaUnlock")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.Spend")
    @js.native
    def Spend(howmuch: Double): Unit = js.native
    
    @JSGlobal("Game.SynergyUpgrade")
    @js.native
    def SynergyUpgrade(name: String, desc: String, building1: String, building2: String, tier: String): SynergyUpgradeClass[String] = js.native
    @JSGlobal("Game.SynergyUpgrade")
    @js.native
    def SynergyUpgrade(name: String, desc: String, building1: String, building2: String, tier: Double): SynergyUpgradeClass[Double] = js.native
    
    @JSGlobal("Game.T")
    @js.native
    def T: Double = js.native
    @scala.inline
    def T_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("T")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.Ticker")
    @js.native
    def Ticker: String = js.native
    
    @JSGlobal("Game.TickerAge")
    @js.native
    def TickerAge: Double = js.native
    @scala.inline
    def TickerAge_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TickerAge")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.TickerClicks")
    @js.native
    def TickerClicks: Double = js.native
    @scala.inline
    def TickerClicks_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TickerClicks")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.TickerDraw")
    @js.native
    def TickerDraw(): Unit = js.native
    
    @JSGlobal("Game.TickerEffect")
    @js.native
    def TickerEffect: Double = js.native
    @scala.inline
    def TickerEffect_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TickerEffect")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.TickerN")
    @js.native
    def TickerN: Double = js.native
    @scala.inline
    def TickerN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TickerN")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def Ticker_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Ticker")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.TieredAchievement")
    @js.native
    def TieredAchievement(name: String, desc: String, building: String, tier: String): TieredAchievementClass[String] = js.native
    @JSGlobal("Game.TieredAchievement")
    @js.native
    def TieredAchievement(name: String, desc: String, building: String, tier: Double): TieredAchievementClass[Double] = js.native
    
    @JSGlobal("Game.TieredUpgrade")
    @js.native
    def TieredUpgrade(name: String, desc: String, building: String, tier: String): TieredUpgradeClass[String] = js.native
    @JSGlobal("Game.TieredUpgrade")
    @js.native
    def TieredUpgrade(name: String, desc: String, building: String, tier: Double): TieredUpgradeClass[Double] = js.native
    
    @JSGlobal("Game.Tiers")
    @js.native
    def Tiers: Record[String, Tier] = js.native
    @scala.inline
    def Tiers_=(x: Record[String, Tier]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Tiers")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.Timeout")
    @js.native
    def Timeout(): Unit = js.native
    
    @JSGlobal("Game.ToggleExtraButtons")
    @js.native
    def ToggleExtraButtons(): Unit = js.native
    
    @JSGlobal("Game.ToggleFancy")
    @js.native
    def ToggleFancy(): Unit = js.native
    
    @JSGlobal("Game.ToggleFilters")
    @js.native
    def ToggleFilters(): Unit = js.native
    
    @JSGlobal("Game.ToggleSpecialMenu")
    @js.native
    def ToggleSpecialMenu(on: Boolean): Unit = js.native
    
    @JSGlobal("Game.Toggle")
    @js.native
    def Toggle_altDraw(prefName: altDraw, button: String, on: String, off: String): Unit = js.native
    @JSGlobal("Game.Toggle")
    @js.native
    def Toggle_altDraw(prefName: altDraw, button: String, on: String, off: String, invert: PseudoBoolean): Unit = js.native
    @JSGlobal("Game.Toggle")
    @js.native
    def Toggle_animate(prefName: animate, button: String, on: String, off: String): Unit = js.native
    @JSGlobal("Game.Toggle")
    @js.native
    def Toggle_animate(prefName: animate, button: String, on: String, off: String, invert: PseudoBoolean): Unit = js.native
    @JSGlobal("Game.Toggle")
    @js.native
    def Toggle_askLumps(prefName: askLumps, button: String, on: String, off: String): Unit = js.native
    @JSGlobal("Game.Toggle")
    @js.native
    def Toggle_askLumps(prefName: askLumps, button: String, on: String, off: String, invert: PseudoBoolean): Unit = js.native
    @JSGlobal("Game.Toggle")
    @js.native
    def Toggle_autosave(prefName: autosave, button: String, on: String, off: String): Unit = js.native
    @JSGlobal("Game.Toggle")
    @js.native
    def Toggle_autosave(prefName: autosave, button: String, on: String, off: String, invert: PseudoBoolean): Unit = js.native
    @JSGlobal("Game.Toggle")
    @js.native
    def Toggle_autoupdate(prefName: autoupdate, button: String, on: String, off: String): Unit = js.native
    @JSGlobal("Game.Toggle")
    @js.native
    def Toggle_autoupdate(prefName: autoupdate, button: String, on: String, off: String, invert: PseudoBoolean): Unit = js.native
    @JSGlobal("Game.Toggle")
    @js.native
    def Toggle_cursors(prefName: cursors, button: String, on: String, off: String): Unit = js.native
    @JSGlobal("Game.Toggle")
    @js.native
    def Toggle_cursors(prefName: cursors, button: String, on: String, off: String, invert: PseudoBoolean): Unit = js.native
    @JSGlobal("Game.Toggle")
    @js.native
    def Toggle_customGrandmas(prefName: customGrandmas, button: String, on: String, off: String): Unit = js.native
    @JSGlobal("Game.Toggle")
    @js.native
    def Toggle_customGrandmas(prefName: customGrandmas, button: String, on: String, off: String, invert: PseudoBoolean): Unit = js.native
    @JSGlobal("Game.Toggle")
    @js.native
    def Toggle_extraButtons(prefName: extraButtons, button: String, on: String, off: String): Unit = js.native
    @JSGlobal("Game.Toggle")
    @js.native
    def Toggle_extraButtons(prefName: extraButtons, button: String, on: String, off: String, invert: PseudoBoolean): Unit = js.native
    @JSGlobal("Game.Toggle")
    @js.native
    def Toggle_fancy(prefName: fancy, button: String, on: String, off: String): Unit = js.native
    @JSGlobal("Game.Toggle")
    @js.native
    def Toggle_fancy(prefName: fancy, button: String, on: String, off: String, invert: PseudoBoolean): Unit = js.native
    @JSGlobal("Game.Toggle")
    @js.native
    def Toggle_filters(prefName: filters, button: String, on: String, off: String): Unit = js.native
    @JSGlobal("Game.Toggle")
    @js.native
    def Toggle_filters(prefName: filters, button: String, on: String, off: String, invert: PseudoBoolean): Unit = js.native
    @JSGlobal("Game.Toggle")
    @js.native
    def Toggle_focus(prefName: focus, button: String, on: String, off: String): Unit = js.native
    @JSGlobal("Game.Toggle")
    @js.native
    def Toggle_focus(prefName: focus, button: String, on: String, off: String, invert: PseudoBoolean): Unit = js.native
    @JSGlobal("Game.Toggle")
    @js.native
    def Toggle_format(prefName: format, button: String, on: String, off: String): Unit = js.native
    @JSGlobal("Game.Toggle")
    @js.native
    def Toggle_format(prefName: format, button: String, on: String, off: String, invert: PseudoBoolean): Unit = js.native
    @JSGlobal("Game.Toggle")
    @js.native
    def Toggle_milk(prefName: milk, button: String, on: String, off: String): Unit = js.native
    @JSGlobal("Game.Toggle")
    @js.native
    def Toggle_milk(prefName: milk, button: String, on: String, off: String, invert: PseudoBoolean): Unit = js.native
    @JSGlobal("Game.Toggle")
    @js.native
    def Toggle_monospace(prefName: monospace, button: String, on: String, off: String): Unit = js.native
    @JSGlobal("Game.Toggle")
    @js.native
    def Toggle_monospace(prefName: monospace, button: String, on: String, off: String, invert: PseudoBoolean): Unit = js.native
    @JSGlobal("Game.Toggle")
    @js.native
    def Toggle_notifs(prefName: notifs, button: String, on: String, off: String): Unit = js.native
    @JSGlobal("Game.Toggle")
    @js.native
    def Toggle_notifs(prefName: notifs, button: String, on: String, off: String, invert: PseudoBoolean): Unit = js.native
    @JSGlobal("Game.Toggle")
    @js.native
    def Toggle_numbers(prefName: numbers, button: String, on: String, off: String): Unit = js.native
    @JSGlobal("Game.Toggle")
    @js.native
    def Toggle_numbers(prefName: numbers, button: String, on: String, off: String, invert: PseudoBoolean): Unit = js.native
    @JSGlobal("Game.Toggle")
    @js.native
    def Toggle_particles(prefName: particles, button: String, on: String, off: String): Unit = js.native
    @JSGlobal("Game.Toggle")
    @js.native
    def Toggle_particles(prefName: particles, button: String, on: String, off: String, invert: PseudoBoolean): Unit = js.native
    @JSGlobal("Game.Toggle")
    @js.native
    def Toggle_popups(prefName: popups, button: String, on: String, off: String): Unit = js.native
    @JSGlobal("Game.Toggle")
    @js.native
    def Toggle_popups(prefName: popups, button: String, on: String, off: String, invert: PseudoBoolean): Unit = js.native
    @JSGlobal("Game.Toggle")
    @js.native
    def Toggle_showBackupWarning(prefName: showBackupWarning, button: String, on: String, off: String): Unit = js.native
    @JSGlobal("Game.Toggle")
    @js.native
    def Toggle_showBackupWarning(prefName: showBackupWarning, button: String, on: String, off: String, invert: PseudoBoolean): Unit = js.native
    @JSGlobal("Game.Toggle")
    @js.native
    def Toggle_timeout(prefName: timeout, button: String, on: String, off: String): Unit = js.native
    @JSGlobal("Game.Toggle")
    @js.native
    def Toggle_timeout(prefName: timeout, button: String, on: String, off: String, invert: PseudoBoolean): Unit = js.native
    @JSGlobal("Game.Toggle")
    @js.native
    def Toggle_warn(prefName: warn, button: String, on: String, off: String): Unit = js.native
    @JSGlobal("Game.Toggle")
    @js.native
    def Toggle_warn(prefName: warn, button: String, on: String, off: String, invert: PseudoBoolean): Unit = js.native
    @JSGlobal("Game.Toggle")
    @js.native
    def Toggle_wobbly(prefName: wobbly, button: String, on: String, off: String): Unit = js.native
    @JSGlobal("Game.Toggle")
    @js.native
    def Toggle_wobbly(prefName: wobbly, button: String, on: String, off: String, invert: PseudoBoolean): Unit = js.native
    
    @JSGlobal("Game.Unlock")
    @js.native
    def Unlock(what: String): Unit = js.native
    @JSGlobal("Game.Unlock")
    @js.native
    def Unlock(what: js.Array[String]): Unit = js.native
    
    @JSGlobal("Game.UnlockAt")
    @js.native
    def UnlockAt: js.Array[UnlockRequirement] = js.native
    @scala.inline
    def UnlockAt_=(x: js.Array[UnlockRequirement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UnlockAt")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.UnlockTiered")
    @js.native
    def UnlockTiered(me: typings.cookieclicker.Game.Upgrade): Unit = js.native
    
    @JSGlobal("Game.UpdateAscend")
    @js.native
    def UpdateAscend(): Unit = js.native
    
    @JSGlobal("Game.UpdateAscendIntro")
    @js.native
    def UpdateAscendIntro(): Unit = js.native
    
    @JSGlobal("Game.UpdateAscensionModePrompt")
    @js.native
    def UpdateAscensionModePrompt(): Unit = js.native
    
    @JSGlobal("Game.UpdateGrandmapocalypse")
    @js.native
    def UpdateGrandmapocalypse(): Unit = js.native
    
    @JSGlobal("Game.UpdateLegacyPrompt")
    @js.native
    def UpdateLegacyPrompt(): Unit = js.native
    
    @JSGlobal("Game.UpdateMenu")
    @js.native
    def UpdateMenu(): Unit = js.native
    
    @JSGlobal("Game.UpdateNotes")
    @js.native
    def UpdateNotes(): Unit = js.native
    
    @JSGlobal("Game.UpdatePrompt")
    @js.native
    def UpdatePrompt(): Unit = js.native
    
    @JSGlobal("Game.UpdateReincarnateIntro")
    @js.native
    def UpdateReincarnateIntro(): Unit = js.native
    
    @JSGlobal("Game.UpdateSpecial")
    @js.native
    def UpdateSpecial(): Unit = js.native
    
    @JSGlobal("Game.UpdateTicker")
    @js.native
    def UpdateTicker(): Unit = js.native
    
    @JSGlobal("Game.UpdateWrinklers")
    @js.native
    def UpdateWrinklers(): Unit = js.native
    
    @JSGlobal("Game.Upgrade")
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
    
    @JSGlobal("Game.UpgradeDragon")
    @js.native
    def UpgradeDragon(): Unit = js.native
    
    @JSGlobal("Game.UpgradePositions")
    @js.native
    def UpgradePositions: js.Object = js.native
    @scala.inline
    def UpgradePositions_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UpgradePositions")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.UpgradeSanta")
    @js.native
    def UpgradeSanta(): Unit = js.native
    
    @JSGlobal("Game.Upgrades")
    @js.native
    def Upgrades: js.Array[js.UndefOr[scala.Nothing]] with (Record[String, typings.cookieclicker.Game.Upgrade]) = js.native
    
    @JSGlobal("Game.UpgradesById")
    @js.native
    def UpgradesById: js.Array[typings.cookieclicker.Game.Upgrade] = js.native
    @scala.inline
    def UpgradesById_=(x: js.Array[typings.cookieclicker.Game.Upgrade]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UpgradesById")(x.asInstanceOf[js.Any])
    
    /* Inlined std.Record<cookieclicker.Game.UpgradePool, std.Array<cookieclicker.Game.Upgrade>> */
    object UpgradesByPool {
      
      @JSGlobal("Game.UpgradesByPool")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("Game.UpgradesByPool.")
      @js.native
      def _empty: js.Array[typings.cookieclicker.Game.Upgrade] = js.native
      
      @scala.inline
      def _empty_=(x: js.Array[typings.cookieclicker.Game.Upgrade]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Game.UpgradesByPool.cookie")
      @js.native
      def cookie: js.Array[typings.cookieclicker.Game.Upgrade] = js.native
      @scala.inline
      def cookie_=(x: js.Array[typings.cookieclicker.Game.Upgrade]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cookie")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Game.UpgradesByPool.debug")
      @js.native
      def debug: js.Array[typings.cookieclicker.Game.Upgrade] = js.native
      @scala.inline
      def debug_=(x: js.Array[typings.cookieclicker.Game.Upgrade]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("debug")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Game.UpgradesByPool.prestige")
      @js.native
      def prestige: js.Array[typings.cookieclicker.Game.Upgrade] = js.native
      
      @JSGlobal("Game.UpgradesByPool.prestigeDecor")
      @js.native
      def prestigeDecor: js.Array[typings.cookieclicker.Game.Upgrade] = js.native
      @scala.inline
      def prestigeDecor_=(x: js.Array[typings.cookieclicker.Game.Upgrade]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prestigeDecor")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def prestige_=(x: js.Array[typings.cookieclicker.Game.Upgrade]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prestige")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Game.UpgradesByPool.tech")
      @js.native
      def tech: js.Array[typings.cookieclicker.Game.Upgrade] = js.native
      @scala.inline
      def tech_=(x: js.Array[typings.cookieclicker.Game.Upgrade]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tech")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Game.UpgradesByPool.toggle")
      @js.native
      def toggle: js.Array[typings.cookieclicker.Game.Upgrade] = js.native
      @scala.inline
      def toggle_=(x: js.Array[typings.cookieclicker.Game.Upgrade]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toggle")(x.asInstanceOf[js.Any])
      
      @JSGlobal("Game.UpgradesByPool.unused")
      @js.native
      def unused: js.Array[typings.cookieclicker.Game.Upgrade] = js.native
      @scala.inline
      def unused_=(x: js.Array[typings.cookieclicker.Game.Upgrade]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unused")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("Game.UpgradesInStore")
    @js.native
    def UpgradesInStore: js.Array[typings.cookieclicker.Game.Upgrade] = js.native
    @scala.inline
    def UpgradesInStore_=(x: js.Array[typings.cookieclicker.Game.Upgrade]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UpgradesInStore")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.UpgradesN")
    @js.native
    def UpgradesN: Double = js.native
    @scala.inline
    def UpgradesN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UpgradesN")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.UpgradesOwned")
    @js.native
    def UpgradesOwned: Double = js.native
    @scala.inline
    def UpgradesOwned_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UpgradesOwned")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def Upgrades_=(x: js.Array[js.UndefOr[scala.Nothing]] with (Record[String, typings.cookieclicker.Game.Upgrade])): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Upgrades")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.Win")
    @js.native
    def Win(what: String): Unit = js.native
    @JSGlobal("Game.Win")
    @js.native
    def Win(what: js.Array[String]): Unit = js.native
    
    @JSGlobal("Game.WriteButton")
    @js.native
    def WriteButton_altDraw(prefName: altDraw, button: String, on: String, off: String, callback: String): String = js.native
    @JSGlobal("Game.WriteButton")
    @js.native
    def WriteButton_altDraw(
      prefName: altDraw,
      button: String,
      on: String,
      off: String,
      callback: String,
      invert: PseudoBoolean
    ): String = js.native
    @JSGlobal("Game.WriteButton")
    @js.native
    def WriteButton_animate(prefName: animate, button: String, on: String, off: String, callback: String): String = js.native
    @JSGlobal("Game.WriteButton")
    @js.native
    def WriteButton_animate(
      prefName: animate,
      button: String,
      on: String,
      off: String,
      callback: String,
      invert: PseudoBoolean
    ): String = js.native
    @JSGlobal("Game.WriteButton")
    @js.native
    def WriteButton_askLumps(prefName: askLumps, button: String, on: String, off: String, callback: String): String = js.native
    @JSGlobal("Game.WriteButton")
    @js.native
    def WriteButton_askLumps(
      prefName: askLumps,
      button: String,
      on: String,
      off: String,
      callback: String,
      invert: PseudoBoolean
    ): String = js.native
    @JSGlobal("Game.WriteButton")
    @js.native
    def WriteButton_autosave(prefName: autosave, button: String, on: String, off: String, callback: String): String = js.native
    @JSGlobal("Game.WriteButton")
    @js.native
    def WriteButton_autosave(
      prefName: autosave,
      button: String,
      on: String,
      off: String,
      callback: String,
      invert: PseudoBoolean
    ): String = js.native
    @JSGlobal("Game.WriteButton")
    @js.native
    def WriteButton_autoupdate(prefName: autoupdate, button: String, on: String, off: String, callback: String): String = js.native
    @JSGlobal("Game.WriteButton")
    @js.native
    def WriteButton_autoupdate(
      prefName: autoupdate,
      button: String,
      on: String,
      off: String,
      callback: String,
      invert: PseudoBoolean
    ): String = js.native
    @JSGlobal("Game.WriteButton")
    @js.native
    def WriteButton_cursors(prefName: cursors, button: String, on: String, off: String, callback: String): String = js.native
    @JSGlobal("Game.WriteButton")
    @js.native
    def WriteButton_cursors(
      prefName: cursors,
      button: String,
      on: String,
      off: String,
      callback: String,
      invert: PseudoBoolean
    ): String = js.native
    @JSGlobal("Game.WriteButton")
    @js.native
    def WriteButton_customGrandmas(prefName: customGrandmas, button: String, on: String, off: String, callback: String): String = js.native
    @JSGlobal("Game.WriteButton")
    @js.native
    def WriteButton_customGrandmas(
      prefName: customGrandmas,
      button: String,
      on: String,
      off: String,
      callback: String,
      invert: PseudoBoolean
    ): String = js.native
    @JSGlobal("Game.WriteButton")
    @js.native
    def WriteButton_extraButtons(prefName: extraButtons, button: String, on: String, off: String, callback: String): String = js.native
    @JSGlobal("Game.WriteButton")
    @js.native
    def WriteButton_extraButtons(
      prefName: extraButtons,
      button: String,
      on: String,
      off: String,
      callback: String,
      invert: PseudoBoolean
    ): String = js.native
    @JSGlobal("Game.WriteButton")
    @js.native
    def WriteButton_fancy(prefName: fancy, button: String, on: String, off: String, callback: String): String = js.native
    @JSGlobal("Game.WriteButton")
    @js.native
    def WriteButton_fancy(prefName: fancy, button: String, on: String, off: String, callback: String, invert: PseudoBoolean): String = js.native
    @JSGlobal("Game.WriteButton")
    @js.native
    def WriteButton_filters(prefName: filters, button: String, on: String, off: String, callback: String): String = js.native
    @JSGlobal("Game.WriteButton")
    @js.native
    def WriteButton_filters(
      prefName: filters,
      button: String,
      on: String,
      off: String,
      callback: String,
      invert: PseudoBoolean
    ): String = js.native
    @JSGlobal("Game.WriteButton")
    @js.native
    def WriteButton_focus(prefName: focus, button: String, on: String, off: String, callback: String): String = js.native
    @JSGlobal("Game.WriteButton")
    @js.native
    def WriteButton_focus(prefName: focus, button: String, on: String, off: String, callback: String, invert: PseudoBoolean): String = js.native
    @JSGlobal("Game.WriteButton")
    @js.native
    def WriteButton_format(prefName: format, button: String, on: String, off: String, callback: String): String = js.native
    @JSGlobal("Game.WriteButton")
    @js.native
    def WriteButton_format(prefName: format, button: String, on: String, off: String, callback: String, invert: PseudoBoolean): String = js.native
    @JSGlobal("Game.WriteButton")
    @js.native
    def WriteButton_milk(prefName: milk, button: String, on: String, off: String, callback: String): String = js.native
    @JSGlobal("Game.WriteButton")
    @js.native
    def WriteButton_milk(prefName: milk, button: String, on: String, off: String, callback: String, invert: PseudoBoolean): String = js.native
    @JSGlobal("Game.WriteButton")
    @js.native
    def WriteButton_monospace(prefName: monospace, button: String, on: String, off: String, callback: String): String = js.native
    @JSGlobal("Game.WriteButton")
    @js.native
    def WriteButton_monospace(
      prefName: monospace,
      button: String,
      on: String,
      off: String,
      callback: String,
      invert: PseudoBoolean
    ): String = js.native
    @JSGlobal("Game.WriteButton")
    @js.native
    def WriteButton_notifs(prefName: notifs, button: String, on: String, off: String, callback: String): String = js.native
    @JSGlobal("Game.WriteButton")
    @js.native
    def WriteButton_notifs(prefName: notifs, button: String, on: String, off: String, callback: String, invert: PseudoBoolean): String = js.native
    @JSGlobal("Game.WriteButton")
    @js.native
    def WriteButton_numbers(prefName: numbers, button: String, on: String, off: String, callback: String): String = js.native
    @JSGlobal("Game.WriteButton")
    @js.native
    def WriteButton_numbers(
      prefName: numbers,
      button: String,
      on: String,
      off: String,
      callback: String,
      invert: PseudoBoolean
    ): String = js.native
    @JSGlobal("Game.WriteButton")
    @js.native
    def WriteButton_particles(prefName: particles, button: String, on: String, off: String, callback: String): String = js.native
    @JSGlobal("Game.WriteButton")
    @js.native
    def WriteButton_particles(
      prefName: particles,
      button: String,
      on: String,
      off: String,
      callback: String,
      invert: PseudoBoolean
    ): String = js.native
    @JSGlobal("Game.WriteButton")
    @js.native
    def WriteButton_popups(prefName: popups, button: String, on: String, off: String, callback: String): String = js.native
    @JSGlobal("Game.WriteButton")
    @js.native
    def WriteButton_popups(prefName: popups, button: String, on: String, off: String, callback: String, invert: PseudoBoolean): String = js.native
    @JSGlobal("Game.WriteButton")
    @js.native
    def WriteButton_showBackupWarning(prefName: showBackupWarning, button: String, on: String, off: String, callback: String): String = js.native
    @JSGlobal("Game.WriteButton")
    @js.native
    def WriteButton_showBackupWarning(
      prefName: showBackupWarning,
      button: String,
      on: String,
      off: String,
      callback: String,
      invert: PseudoBoolean
    ): String = js.native
    @JSGlobal("Game.WriteButton")
    @js.native
    def WriteButton_timeout(prefName: timeout, button: String, on: String, off: String, callback: String): String = js.native
    @JSGlobal("Game.WriteButton")
    @js.native
    def WriteButton_timeout(
      prefName: timeout,
      button: String,
      on: String,
      off: String,
      callback: String,
      invert: PseudoBoolean
    ): String = js.native
    @JSGlobal("Game.WriteButton")
    @js.native
    def WriteButton_warn(prefName: warn, button: String, on: String, off: String, callback: String): String = js.native
    @JSGlobal("Game.WriteButton")
    @js.native
    def WriteButton_warn(prefName: warn, button: String, on: String, off: String, callback: String, invert: PseudoBoolean): String = js.native
    @JSGlobal("Game.WriteButton")
    @js.native
    def WriteButton_wobbly(prefName: wobbly, button: String, on: String, off: String, callback: String): String = js.native
    @JSGlobal("Game.WriteButton")
    @js.native
    def WriteButton_wobbly(prefName: wobbly, button: String, on: String, off: String, callback: String, invert: PseudoBoolean): String = js.native
    
    @JSGlobal("Game.WriteSave")
    @js.native
    def WriteSave(): String = js.native
    @JSGlobal("Game.WriteSave")
    @js.native
    def WriteSave(`type`: Double): String = js.native
    
    @JSGlobal("Game.WriteSlider")
    @js.native
    def WriteSlider(
      slider: String,
      leftText: String,
      rightText: String,
      startValueFunction: js.Function0[Double],
      callback: String
    ): Unit = js.native
    
    @JSGlobal("Game.accumulatedDelay")
    @js.native
    def accumulatedDelay: Double = js.native
    @scala.inline
    def accumulatedDelay_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accumulatedDelay")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.addClass")
    @js.native
    def addClass(what: String): Unit = js.native
    
    @JSGlobal("Game.ascendContentl")
    @js.native
    def ascendContentl: js.Object = js.native
    @scala.inline
    def ascendContentl_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ascendContentl")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.ascendMeter")
    @js.native
    def ascendMeter: js.Object = js.native
    
    @JSGlobal("Game.ascendMeterLevel")
    @js.native
    def ascendMeterLevel: Double = js.native
    @scala.inline
    def ascendMeterLevel_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ascendMeterLevel")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.ascendMeterPercent")
    @js.native
    def ascendMeterPercent: Double = js.native
    
    @JSGlobal("Game.ascendMeterPercentT")
    @js.native
    def ascendMeterPercentT: Double = js.native
    @scala.inline
    def ascendMeterPercentT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ascendMeterPercentT")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def ascendMeterPercent_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ascendMeterPercent")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def ascendMeter_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ascendMeter")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.ascendNumber")
    @js.native
    def ascendNumber: js.Object = js.native
    @scala.inline
    def ascendNumber_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ascendNumber")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.ascendUpgradesl")
    @js.native
    def ascendUpgradesl: js.Object = js.native
    @scala.inline
    def ascendUpgradesl_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ascendUpgradesl")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.ascendZoomablel")
    @js.native
    def ascendZoomablel: js.Object = js.native
    @scala.inline
    def ascendZoomablel_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ascendZoomablel")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.ascendl")
    @js.native
    def ascendl: js.Object = js.native
    @scala.inline
    def ascendl_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ascendl")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.ascensionMode")
    @js.native
    def ascensionMode: Double = js.native
    @scala.inline
    def ascensionMode_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ascensionMode")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.ascensionModes")
    @js.native
    def ascensionModes: js.Object = js.native
    @scala.inline
    def ascensionModes_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ascensionModes")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.attachTooltip")
    @js.native
    def attachTooltip(el: HTMLElement, func: String, origin: TooltipOrigins): Unit = js.native
    @JSGlobal("Game.attachTooltip")
    @js.native
    def attachTooltip(el: HTMLElement, func: js.Function0[String], origin: TooltipOrigins): Unit = js.native
    
    @JSGlobal("Game.auraMult")
    @js.native
    def auraMult(what: String): Double = js.native
    
    @JSGlobal("Game.autoclickerDetected")
    @js.native
    def autoclickerDetected: Double = js.native
    @scala.inline
    def autoclickerDetected_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoclickerDetected")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.bakeryName")
    @js.native
    def bakeryName: String = js.native
    
    @JSGlobal("Game.bakeryNameL")
    @js.native
    def bakeryNameL: HTMLDivElement = js.native
    @scala.inline
    def bakeryNameL_=(x: HTMLDivElement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bakeryNameL")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.bakeryNamePrompt")
    @js.native
    def bakeryNamePrompt(): Unit = js.native
    
    @JSGlobal("Game.bakeryNamePromptRandom")
    @js.native
    def bakeryNamePromptRandom(): String = js.native
    
    @JSGlobal("Game.bakeryNameRefresh")
    @js.native
    def bakeryNameRefresh(): Unit = js.native
    
    @JSGlobal("Game.bakeryNameSet")
    @js.native
    def bakeryNameSet(): Unit = js.native
    
    @scala.inline
    def bakeryName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bakeryName")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.baseResearchTime")
    @js.native
    def baseResearchTime: Double = js.native
    @scala.inline
    def baseResearchTime_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("baseResearchTime")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.baseSeason")
    @js.native
    def baseSeason: String = js.native
    @scala.inline
    def baseSeason_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("baseSeason")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.beta")
    @js.native
    def beta: PseudoBoolean = js.native
    @scala.inline
    def beta_=(x: PseudoBoolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("beta")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.bg")
    @js.native
    def bg: String = js.native
    
    @JSGlobal("Game.bgFade")
    @js.native
    def bgFade: String = js.native
    @scala.inline
    def bgFade_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bgFade")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.bgR")
    @js.native
    def bgR: Double = js.native
    @scala.inline
    def bgR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bgR")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.bgRd")
    @js.native
    def bgRd: Double = js.native
    @scala.inline
    def bgRd_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bgRd")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.bgType")
    @js.native
    def bgType: Double = js.native
    @scala.inline
    def bgType_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bgType")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def bg_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bg")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.blendModesOn")
    @js.native
    def blendModesOn: Boolean = js.native
    @scala.inline
    def blendModesOn_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blendModesOn")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.bounds")
    @js.native
    def bounds: DOMRect = js.native
    @scala.inline
    def bounds_=(x: DOMRect): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bounds")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.buffType")
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
    
    @JSGlobal("Game.buffTypes")
    @js.native
    def buffTypes: js.Array[typings.cookieclicker.Game.buffType] = js.native
    
    @JSGlobal("Game.buffTypesByName")
    @js.native
    def buffTypesByName: js.Array[js.UndefOr[scala.Nothing]] with (Record[String, typings.cookieclicker.Game.buffType]) = js.native
    @scala.inline
    def buffTypesByName_=(x: js.Array[js.UndefOr[scala.Nothing]] with (Record[String, typings.cookieclicker.Game.buffType])): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("buffTypesByName")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.buffTypesN")
    @js.native
    def buffTypesN: Double = js.native
    @scala.inline
    def buffTypesN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("buffTypesN")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def buffTypes_=(x: js.Array[typings.cookieclicker.Game.buffType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("buffTypes")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.buffs")
    @js.native
    def buffs: js.Array[Buff] = js.native
    
    @JSGlobal("Game.buffsL")
    @js.native
    def buffsL: HTMLDivElement = js.native
    @scala.inline
    def buffsL_=(x: HTMLDivElement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("buffsL")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.buffsN")
    @js.native
    def buffsN: Double = js.native
    @scala.inline
    def buffsN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("buffsN")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def buffs_=(x: js.Array[Buff]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("buffs")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.buyBulk")
    @js.native
    def buyBulk: Double = js.native
    
    @JSGlobal("Game.buyBulkOld")
    @js.native
    def buyBulkOld: Double = js.native
    @scala.inline
    def buyBulkOld_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("buyBulkOld")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.buyBulkShortcut")
    @js.native
    def buyBulkShortcut: Double = js.native
    @scala.inline
    def buyBulkShortcut_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("buyBulkShortcut")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def buyBulk_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("buyBulk")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.buyMode")
    @js.native
    def buyMode: Double = js.native
    @scala.inline
    def buyMode_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("buyMode")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.canLumps")
    @js.native
    def canLumps(): Boolean = js.native
    
    @JSGlobal("Game.canRefillLump")
    @js.native
    def canRefillLump(): Boolean = js.native
    
    @JSGlobal("Game.catchupLogic")
    @js.native
    def catchupLogic: Double = js.native
    @scala.inline
    def catchupLogic_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("catchupLogic")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.chimeType")
    @js.native
    def chimeType: Double = js.native
    @scala.inline
    def chimeType_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("chimeType")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.choiceSelectorChoices")
    @js.native
    def choiceSelectorChoices: js.Array[SelectorSwitchChoice] = js.native
    @scala.inline
    def choiceSelectorChoices_=(x: js.Array[SelectorSwitchChoice]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("choiceSelectorChoices")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.choiceSelectorOn")
    @js.native
    def choiceSelectorOn: Double = js.native
    @scala.inline
    def choiceSelectorOn_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("choiceSelectorOn")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.choiceSelectorSelected")
    @js.native
    def choiceSelectorSelected: Double = js.native
    @scala.inline
    def choiceSelectorSelected_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("choiceSelectorSelected")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.clickFrom")
    @js.native
    def clickFrom: Double = js.native
    @scala.inline
    def clickFrom_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clickFrom")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.clickLump")
    @js.native
    def clickLump(): Unit = js.native
    
    @JSGlobal("Game.clickStr")
    @js.native
    def clickStr: String = js.native
    @scala.inline
    def clickStr_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clickStr")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.computeLumpTimes")
    @js.native
    def computeLumpTimes(): Unit = js.native
    
    @JSGlobal("Game.computeLumpType")
    @js.native
    def computeLumpType(): Boolean = js.native
    
    @JSGlobal("Game.computeSeasonPrices")
    @js.native
    def computeSeasonPrices(): Double = js.native
    
    @JSGlobal("Game.computeSeasons")
    @js.native
    def computeSeasons(): Unit = js.native
    
    @JSGlobal("Game.computedMouseCps")
    @js.native
    def computedMouseCps: Double = js.native
    @scala.inline
    def computedMouseCps_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("computedMouseCps")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.cookieClickSound")
    @js.native
    def cookieClickSound: Double = js.native
    @scala.inline
    def cookieClickSound_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cookieClickSound")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.cookieClicks")
    @js.native
    def cookieClicks: Double = js.native
    @scala.inline
    def cookieClicks_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cookieClicks")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.cookieOriginX")
    @js.native
    def cookieOriginX: Double = js.native
    @scala.inline
    def cookieOriginX_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cookieOriginX")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.cookieOriginY")
    @js.native
    def cookieOriginY: Double = js.native
    @scala.inline
    def cookieOriginY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cookieOriginY")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.cookieUpgrades")
    @js.native
    def cookieUpgrades: js.Array[typings.cookieclicker.Game.Upgrade] = js.native
    @scala.inline
    def cookieUpgrades_=(x: js.Array[typings.cookieclicker.Game.Upgrade]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cookieUpgrades")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.cookies")
    @js.native
    def cookies: Double = js.native
    
    @JSGlobal("Game.cookiesEarned")
    @js.native
    def cookiesEarned: Double = js.native
    @scala.inline
    def cookiesEarned_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cookiesEarned")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.cookiesMultByType")
    @js.native
    def cookiesMultByType: js.Object = js.native
    @scala.inline
    def cookiesMultByType_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cookiesMultByType")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.cookiesPs")
    @js.native
    def cookiesPs: Double = js.native
    
    @JSGlobal("Game.cookiesPsByType")
    @js.native
    def cookiesPsByType: js.Object = js.native
    @scala.inline
    def cookiesPsByType_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cookiesPsByType")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def cookiesPs_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cookiesPs")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.cookiesReset")
    @js.native
    def cookiesReset: Double = js.native
    @scala.inline
    def cookiesReset_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cookiesReset")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.cookiesSucked")
    @js.native
    def cookiesSucked: Double = js.native
    @scala.inline
    def cookiesSucked_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cookiesSucked")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def cookies_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cookies")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.cookiesd")
    @js.native
    def cookiesd: Double = js.native
    @scala.inline
    def cookiesd_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cookiesd")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.costDetails")
    @js.native
    def costDetails(cost: Double): Unit = js.native
    
    @JSGlobal("Game.cpsSucked")
    @js.native
    def cpsSucked: Double = js.native
    @scala.inline
    def cpsSucked_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cpsSucked")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.crate")
    @js.native
    def crate(
      me: typings.cookieclicker.Game.Achievement,
      context: js.UndefOr[scala.Nothing],
      forceClickStr: String,
      id: String
    ): String = js.native
    @JSGlobal("Game.crate")
    @js.native
    def crate(
      me: typings.cookieclicker.Game.Upgrade,
      context: js.UndefOr[scala.Nothing],
      forceClickStr: String,
      id: String
    ): String = js.native
    
    @JSGlobal("Game.crateTooltip")
    @js.native
    def crateTooltip(me: typings.cookieclicker.Game.Achievement): String = js.native
    @JSGlobal("Game.crateTooltip")
    @js.native
    def crateTooltip(me: typings.cookieclicker.Game.Upgrade): String = js.native
    @JSGlobal("Game.crateTooltip")
    @js.native
    def crateTooltip_ascend(me: typings.cookieclicker.Game.Achievement, context: ascend): String = js.native
    @JSGlobal("Game.crateTooltip")
    @js.native
    def crateTooltip_ascend(me: typings.cookieclicker.Game.Upgrade, context: ascend): String = js.native
    @JSGlobal("Game.crateTooltip")
    @js.native
    def crateTooltip_stats(me: typings.cookieclicker.Game.Achievement, context: stats): String = js.native
    @JSGlobal("Game.crateTooltip")
    @js.native
    def crateTooltip_stats(me: typings.cookieclicker.Game.Upgrade, context: stats): String = js.native
    @JSGlobal("Game.crateTooltip")
    @js.native
    def crateTooltip_store(me: typings.cookieclicker.Game.Achievement, context: store): String = js.native
    @JSGlobal("Game.crateTooltip")
    @js.native
    def crateTooltip_store(me: typings.cookieclicker.Game.Upgrade, context: store): String = js.native
    
    @JSGlobal("Game.crate")
    @js.native
    def crate_ascend(me: typings.cookieclicker.Game.Achievement, context: ascend, forceClickStr: String, id: String): String = js.native
    @JSGlobal("Game.crate")
    @js.native
    def crate_ascend(me: typings.cookieclicker.Game.Upgrade, context: ascend, forceClickStr: String, id: String): String = js.native
    @JSGlobal("Game.crate")
    @js.native
    def crate_stats(me: typings.cookieclicker.Game.Achievement, context: stats, forceClickStr: String, id: String): String = js.native
    @JSGlobal("Game.crate")
    @js.native
    def crate_stats(me: typings.cookieclicker.Game.Upgrade, context: stats, forceClickStr: String, id: String): String = js.native
    @JSGlobal("Game.crate")
    @js.native
    def crate_store(me: typings.cookieclicker.Game.Achievement, context: store, forceClickStr: String, id: String): String = js.native
    @JSGlobal("Game.crate")
    @js.native
    def crate_store(me: typings.cookieclicker.Game.Upgrade, context: store, forceClickStr: String, id: String): String = js.native
    
    @JSGlobal("Game.cssClasses")
    @js.native
    def cssClasses: js.Array[String] = js.native
    @scala.inline
    def cssClasses_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cssClasses")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.currentFps")
    @js.native
    def currentFps: Double = js.native
    @scala.inline
    def currentFps_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("currentFps")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.customGrandmaNames")
    @js.native
    def customGrandmaNames: js.Array[String] = js.native
    @scala.inline
    def customGrandmaNames_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("customGrandmaNames")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.darkenL")
    @js.native
    def darkenL: js.Object = js.native
    @scala.inline
    def darkenL_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("darkenL")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.debugColors")
    @js.native
    def debugColors: js.Array[String] = js.native
    @scala.inline
    def debugColors_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("debugColors")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.debugTimersOn")
    @js.native
    def debugTimersOn: Double = js.native
    @scala.inline
    def debugTimersOn_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("debugTimersOn")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.debuggedUpgradeCpClick")
    @js.native
    def debuggedUpgradeCpClick: js.Array[Double] = js.native
    @scala.inline
    def debuggedUpgradeCpClick_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("debuggedUpgradeCpClick")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.debuggedUpgradeCpS")
    @js.native
    def debuggedUpgradeCpS: js.Array[Double] = js.native
    @scala.inline
    def debuggedUpgradeCpS_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("debuggedUpgradeCpS")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.defaultBg")
    @js.native
    def defaultBg: String = js.native
    @scala.inline
    def defaultBg_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultBg")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.delayTimeouts")
    @js.native
    def delayTimeouts: Double = js.native
    @scala.inline
    def delayTimeouts_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("delayTimeouts")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.doLumps")
    @js.native
    def doLumps(): Unit = js.native
    
    @JSGlobal("Game.dragonAura")
    @js.native
    def dragonAura: Double = js.native
    
    @JSGlobal("Game.dragonAura2")
    @js.native
    def dragonAura2: Double = js.native
    @scala.inline
    def dragonAura2_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dragonAura2")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def dragonAura_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dragonAura")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.dragonAuras")
    @js.native
    def dragonAuras: Record[Double, DragonAura] = js.native
    @scala.inline
    def dragonAuras_=(x: Record[Double, DragonAura]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dragonAuras")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.dragonLevel")
    @js.native
    def dragonLevel: Double = js.native
    @scala.inline
    def dragonLevel_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dragonLevel")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.dragonLevels")
    @js.native
    def dragonLevels: js.Array[DragonLevel] = js.native
    @scala.inline
    def dragonLevels_=(x: js.Array[DragonLevel]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dragonLevels")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.drawT")
    @js.native
    def drawT: Double = js.native
    @scala.inline
    def drawT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("drawT")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.dropRateMult")
    @js.native
    def dropRateMult(): Double = js.native
    
    @JSGlobal("Game.easterEggs")
    @js.native
    def easterEggs: js.Array[String] = js.native
    @scala.inline
    def easterEggs_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easterEggs")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.eff")
    @js.native
    def eff(name: String, `def`: String): Effects = js.native
    
    @JSGlobal("Game.effs")
    @js.native
    def effs: Effects = js.native
    @scala.inline
    def effs_=(x: Effects): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("effs")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.eggDrops")
    @js.native
    def eggDrops: js.Array[String] = js.native
    @scala.inline
    def eggDrops_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eggDrops")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.elderWrath")
    @js.native
    def elderWrath: Double = js.native
    
    @JSGlobal("Game.elderWrathD")
    @js.native
    def elderWrathD: Double = js.native
    @scala.inline
    def elderWrathD_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("elderWrathD")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.elderWrathOld")
    @js.native
    def elderWrathOld: Double = js.native
    @scala.inline
    def elderWrathOld_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("elderWrathOld")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def elderWrath_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("elderWrath")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.externalDataLoaded")
    @js.native
    def externalDataLoaded: Boolean = js.native
    @scala.inline
    def externalDataLoaded_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("externalDataLoaded")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.foolObjects")
    @js.native
    def foolObjects: js.Array[FoolBuilding] = js.native
    @scala.inline
    def foolObjects_=(x: js.Array[FoolBuilding]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("foolObjects")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.forceUnslotGod")
    @js.native
    def forceUnslotGod: js.UndefOr[js.Function1[/* god */ String, Boolean]] = js.native
    @scala.inline
    def forceUnslotGod_=(x: js.UndefOr[js.Function1[/* god */ String, Boolean]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("forceUnslotGod")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.fortuneCPS")
    @js.native
    def fortuneCPS: PseudoBoolean = js.native
    @scala.inline
    def fortuneCPS_=(x: PseudoBoolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fortuneCPS")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.fortuneGC")
    @js.native
    def fortuneGC: PseudoBoolean = js.native
    @scala.inline
    def fortuneGC_=(x: PseudoBoolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fortuneGC")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.fps")
    @js.native
    def fps: Double = js.native
    
    @JSGlobal("Game.fpsStartTime")
    @js.native
    def fpsStartTime: Double = js.native
    @scala.inline
    def fpsStartTime_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fpsStartTime")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def fps_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fps")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.frameNumber")
    @js.native
    def frameNumber: Double = js.native
    @scala.inline
    def frameNumber_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("frameNumber")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.fullDate")
    @js.native
    def fullDate: Double = js.native
    @scala.inline
    def fullDate_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fullDate")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.gainBuff")
    @js.native
    def gainBuff(`type`: String, time: Double, arg1: Double, arg2: Double, arg3: Double): Buff = js.native
    
    @JSGlobal("Game.gainLumps")
    @js.native
    def gainLumps(total: Double): Unit = js.native
    
    @JSGlobal("Game.gainedPrestige")
    @js.native
    def gainedPrestige: Double = js.native
    @scala.inline
    def gainedPrestige_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gainedPrestige")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.getDynamicTooltip")
    @js.native
    def getDynamicTooltip(func: String): String = js.native
    @JSGlobal("Game.getDynamicTooltip")
    @js.native
    def getDynamicTooltip(func: String, origin: js.UndefOr[TooltipOrigins], isCrate: Boolean): String = js.native
    @JSGlobal("Game.getDynamicTooltip")
    @js.native
    def getDynamicTooltip(func: String, origin: js.UndefOr[TooltipOrigins], isCrate: PseudoBoolean): String = js.native
    @JSGlobal("Game.getDynamicTooltip")
    @js.native
    def getDynamicTooltip(func: String, origin: TooltipOrigins): String = js.native
    
    @JSGlobal("Game.getFps")
    @js.native
    def getFps(): Double = js.native
    
    @JSGlobal("Game.getLumpRefillMax")
    @js.native
    def getLumpRefillMax(): Double = js.native
    
    @JSGlobal("Game.getLumpRefillRemaining")
    @js.native
    def getLumpRefillRemaining(): Double = js.native
    
    @JSGlobal("Game.getNewTicker")
    @js.native
    def getNewTicker(manual: Boolean): Unit = js.native
    
    @JSGlobal("Game.getPledgeDuration")
    @js.native
    def getPledgeDuration(): Double = js.native
    
    @JSGlobal("Game.getSeasonDuration")
    @js.native
    def getSeasonDuration(): Double = js.native
    
    @JSGlobal("Game.getTooltip")
    @js.native
    def getTooltip(text: String): String = js.native
    @JSGlobal("Game.getTooltip")
    @js.native
    def getTooltip(text: String, origin: js.UndefOr[TooltipOrigins], isCrate: Boolean): String = js.native
    @JSGlobal("Game.getTooltip")
    @js.native
    def getTooltip(text: String, origin: js.UndefOr[TooltipOrigins], isCrate: PseudoBoolean): String = js.native
    @JSGlobal("Game.getTooltip")
    @js.native
    def getTooltip(text: String, origin: TooltipOrigins): String = js.native
    
    @JSGlobal("Game.getWrinklersMax")
    @js.native
    def getWrinklersMax(): Double = js.native
    
    @JSGlobal("Game.globalCpsMult")
    @js.native
    def globalCpsMult: Double = js.native
    @scala.inline
    def globalCpsMult_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("globalCpsMult")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.goldenClicks")
    @js.native
    def goldenClicks: Double = js.native
    
    @JSGlobal("Game.goldenClicksLocal")
    @js.native
    def goldenClicksLocal: Double = js.native
    @scala.inline
    def goldenClicksLocal_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("goldenClicksLocal")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def goldenClicks_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("goldenClicks")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.goldenCookieBuildingBuffs")
    @js.native
    def goldenCookieBuildingBuffs: Record[
        /* keyof std.Record<string, cookieclicker.Game.GameObject> & cookieclicker.anon.Bank */ Farm | Temple | (`Wizard tower`) | typings.cookieclicker.cookieclickerStrings.Bank, 
        js.Tuple2[String, String]
      ] = js.native
    @scala.inline
    def goldenCookieBuildingBuffs_=(
      x: Record[
          /* keyof std.Record<string, cookieclicker.Game.GameObject> & cookieclicker.anon.Bank */ Farm | Temple | (`Wizard tower`) | typings.cookieclicker.cookieclickerStrings.Bank, 
          js.Tuple2[String, String]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("goldenCookieBuildingBuffs")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.goldenCookieChoices")
    @js.native
    def goldenCookieChoices: js.Array[String] = js.native
    @scala.inline
    def goldenCookieChoices_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("goldenCookieChoices")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.goldenCookieUpgrades")
    @js.native
    def goldenCookieUpgrades: js.Array[String] = js.native
    @scala.inline
    def goldenCookieUpgrades_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("goldenCookieUpgrades")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.grandmaNames")
    @js.native
    def grandmaNames: js.Array[String] = js.native
    @scala.inline
    def grandmaNames_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("grandmaNames")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.halloweenDrops")
    @js.native
    def halloweenDrops: js.Array[String] = js.native
    @scala.inline
    def halloweenDrops_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("halloweenDrops")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.handleScroll")
    @js.native
    def handleScroll(e: MouseEvent): Unit = js.native
    
    @JSGlobal("Game.handmadeCookies")
    @js.native
    def handmadeCookies: Double = js.native
    @scala.inline
    def handmadeCookies_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handmadeCookies")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.harvestLumps")
    @js.native
    def harvestLumps(amount: Double, silent: Boolean): Unit = js.native
    
    @JSGlobal("Game.hasAura")
    @js.native
    def hasAura(what: String): Boolean = js.native
    
    @JSGlobal("Game.hasBuff")
    @js.native
    def hasBuff(what: String): Double | Buff = js.native
    
    @JSGlobal("Game.hasGod")
    @js.native
    def hasGod: js.UndefOr[js.Function1[/* what */ String, `1` | `2` | `3` | `false`]] = js.native
    @scala.inline
    def hasGod_=(x: js.UndefOr[js.Function1[/* what */ String, `1` | `2` | `3` | `false`]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hasGod")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.heartDrops")
    @js.native
    def heartDrops: js.Array[String] = js.native
    @scala.inline
    def heartDrops_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("heartDrops")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.heavenlyBounds")
    @js.native
    def heavenlyBounds: js.Object = js.native
    @scala.inline
    def heavenlyBounds_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("heavenlyBounds")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.heavenlyChips")
    @js.native
    def heavenlyChips: Double = js.native
    
    @JSGlobal("Game.heavenlyChipsDisplayed")
    @js.native
    def heavenlyChipsDisplayed: Double = js.native
    @scala.inline
    def heavenlyChipsDisplayed_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("heavenlyChipsDisplayed")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.heavenlyChipsSpent")
    @js.native
    def heavenlyChipsSpent: Double = js.native
    @scala.inline
    def heavenlyChipsSpent_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("heavenlyChipsSpent")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def heavenlyChips_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("heavenlyChips")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.heavenlyCookies")
    @js.native
    def heavenlyCookies: Double = js.native
    @scala.inline
    def heavenlyCookies_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("heavenlyCookies")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.heavenlyPower")
    @js.native
    def heavenlyPower: Double = js.native
    @scala.inline
    def heavenlyPower_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("heavenlyPower")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.heralds")
    @js.native
    def heralds: Double = js.native
    @scala.inline
    def heralds_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("heralds")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.https")
    @js.native
    def https: Boolean = js.native
    @scala.inline
    def https_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("https")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.isMinigameReady")
    @js.native
    def isMinigameReady(me: typings.cookieclicker.Game.GameObject): Unit = js.native
    
    @JSGlobal("Game.keys")
    @js.native
    def keys: js.Array[Double] = js.native
    @scala.inline
    def keys_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("keys")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.killBuff")
    @js.native
    def killBuff(what: String): Unit = js.native
    
    @JSGlobal("Game.killBuffs")
    @js.native
    def killBuffs(): Unit = js.native
    
    @JSGlobal("Game.killShimmers")
    @js.native
    def killShimmers(): Unit = js.native
    
    @JSGlobal("Game.l")
    @js.native
    def l: HTMLDivElement = js.native
    @scala.inline
    def l_=(x: HTMLDivElement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("l")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.last")
    @js.native
    def last: typings.cookieclicker.Game.GameObject | typings.cookieclicker.Game.Upgrade | typings.cookieclicker.Game.Achievement = js.native
    
    @JSGlobal("Game.lastActivity")
    @js.native
    def lastActivity: Double = js.native
    @scala.inline
    def lastActivity_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lastActivity")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.lastClick")
    @js.native
    def lastClick: Double = js.native
    @scala.inline
    def lastClick_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lastClick")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.lastClickedEl")
    @js.native
    def lastClickedEl: js.Object = js.native
    @scala.inline
    def lastClickedEl_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lastClickedEl")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.lastDate")
    @js.native
    def lastDate: Double = js.native
    @scala.inline
    def lastDate_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lastDate")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.lastPanel")
    @js.native
    def lastPanel: String = js.native
    @scala.inline
    def lastPanel_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lastPanel")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def last_=(
      x: typings.cookieclicker.Game.GameObject | typings.cookieclicker.Game.Upgrade | typings.cookieclicker.Game.Achievement
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("last")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.listTinyOwnedUpgrades")
    @js.native
    def listTinyOwnedUpgrades(arr: js.Array[typings.cookieclicker.Game.Upgrade]): String = js.native
    
    @JSGlobal("Game.loadLumps")
    @js.native
    def loadLumps(): Unit = js.native
    @JSGlobal("Game.loadLumps")
    @js.native
    def loadLumps(time: js.Any): Unit = js.native
    
    @JSGlobal("Game.localStorageGet")
    @js.native
    def localStorageGet(key: String): String = js.native
    
    @JSGlobal("Game.localStorageSet")
    @js.native
    def localStorageSet(key: String, str: String): Unit = js.native
    
    @JSGlobal("Game.loopT")
    @js.native
    def loopT: Double = js.native
    @scala.inline
    def loopT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("loopT")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.loseShimmeringVeil")
    @js.native
    def loseShimmeringVeil(context: String): Unit | `false` = js.native
    
    @JSGlobal("Game.lumpCurrentType")
    @js.native
    def lumpCurrentType: Double = js.native
    @scala.inline
    def lumpCurrentType_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lumpCurrentType")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.lumpMatureAge")
    @js.native
    def lumpMatureAge: Double = js.native
    @scala.inline
    def lumpMatureAge_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lumpMatureAge")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.lumpOverripeAge")
    @js.native
    def lumpOverripeAge: Double = js.native
    @scala.inline
    def lumpOverripeAge_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lumpOverripeAge")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.lumpRefill")
    @js.native
    def lumpRefill: Double = js.native
    @scala.inline
    def lumpRefill_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lumpRefill")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.lumpRipeAge")
    @js.native
    def lumpRipeAge: Double = js.native
    @scala.inline
    def lumpRipeAge_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lumpRipeAge")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.lumpT")
    @js.native
    def lumpT: Double = js.native
    @scala.inline
    def lumpT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lumpT")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.lumpTooltip")
    @js.native
    def lumpTooltip(): String = js.native
    
    @JSGlobal("Game.lumps")
    @js.native
    def lumps: Double = js.native
    
    @JSGlobal("Game.lumpsTotal")
    @js.native
    def lumpsTotal: Double = js.native
    @scala.inline
    def lumpsTotal_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lumpsTotal")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def lumps_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lumps")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.magicCpS")
    @js.native
    def magicCpS(what: js.Any): Double = js.native
    
    @JSGlobal("Game.makeSeed")
    @js.native
    def makeSeed(): String = js.native
    
    @JSGlobal("Game.milkH")
    @js.native
    def milkH: Double = js.native
    @scala.inline
    def milkH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("milkH")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.milkHd")
    @js.native
    def milkHd: Double = js.native
    @scala.inline
    def milkHd_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("milkHd")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.milkProgress")
    @js.native
    def milkProgress: Double = js.native
    @scala.inline
    def milkProgress_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("milkProgress")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.milkType")
    @js.native
    def milkType: Double = js.native
    @scala.inline
    def milkType_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("milkType")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.missedGoldenClicks")
    @js.native
    def missedGoldenClicks: Double = js.native
    @scala.inline
    def missedGoldenClicks_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("missedGoldenClicks")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.mobile")
    @js.native
    def mobile: PseudoBoolean = js.native
    @scala.inline
    def mobile_=(x: PseudoBoolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mobile")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.modHookNames")
    @js.native
    def modHookNames: js.Array[String] = js.native
    @scala.inline
    def modHookNames_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("modHookNames")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.modHooks")
    @js.native
    def modHooks: Record[String, js.Array[js.Function0[js.Any]]] = js.native
    @scala.inline
    def modHooks_=(x: Record[String, js.Array[js.Function0[js.Any]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("modHooks")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.modSaveData")
    @js.native
    def modSaveData: Record[String, String] = js.native
    @scala.inline
    def modSaveData_=(x: Record[String, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("modSaveData")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.modifyBuildingPrice")
    @js.native
    def modifyBuildingPrice(building: String, price: Double): Double = js.native
    
    @JSGlobal("Game.mouseCps")
    @js.native
    def mouseCps(): Double = js.native
    
    @JSGlobal("Game.mouseDown")
    @js.native
    def mouseDown: Double = js.native
    @scala.inline
    def mouseDown_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mouseDown")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.mouseMoved")
    @js.native
    def mouseMoved: Double = js.native
    @scala.inline
    def mouseMoved_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mouseMoved")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.mousePointer")
    @js.native
    def mousePointer: Double = js.native
    @scala.inline
    def mousePointer_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mousePointer")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.mouseX")
    @js.native
    def mouseX: Double = js.native
    
    @JSGlobal("Game.mouseX2")
    @js.native
    def mouseX2: Double = js.native
    @scala.inline
    def mouseX2_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mouseX2")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def mouseX_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mouseX")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.mouseY")
    @js.native
    def mouseY: Double = js.native
    
    @JSGlobal("Game.mouseY2")
    @js.native
    def mouseY2: Double = js.native
    @scala.inline
    def mouseY2_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mouseY2")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def mouseY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mouseY")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.mutedBuildingTooltip")
    @js.native
    def mutedBuildingTooltip(id: Double): js.Function0[String] = js.native
    
    @JSGlobal("Game.nextAscensionMode")
    @js.native
    def nextAscensionMode: Double = js.native
    @scala.inline
    def nextAscensionMode_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nextAscensionMode")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.nextResearch")
    @js.native
    def nextResearch: Double = js.native
    @scala.inline
    def nextResearch_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nextResearch")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.noteId")
    @js.native
    def noteId: Double = js.native
    @scala.inline
    def noteId_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("noteId")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.noteL")
    @js.native
    def noteL: HTMLDivElement = js.native
    @scala.inline
    def noteL_=(x: HTMLDivElement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("noteL")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.onCrate")
    @js.native
    def onCrate: Double = js.native
    @scala.inline
    def onCrate_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onCrate")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.onMenu")
    @js.native
    def onMenu: String = js.native
    @scala.inline
    def onMenu_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMenu")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.onPanel")
    @js.native
    def onPanel: String = js.native
    @scala.inline
    def onPanel_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onPanel")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.particleAdd")
    @js.native
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
    
    @JSGlobal("Game.particles")
    @js.native
    def particles: js.Array[Particle] = js.native
    
    @JSGlobal("Game.particlesDraw")
    @js.native
    def particlesDraw(z: Double): Unit = js.native
    
    @JSGlobal("Game.particlesUpdate")
    @js.native
    def particlesUpdate(): Unit = js.native
    
    @scala.inline
    def particles_=(x: js.Array[Particle]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("particles")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.permanentUpgrades")
    @js.native
    def permanentUpgrades: js.Array[Double] = js.native
    @scala.inline
    def permanentUpgrades_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("permanentUpgrades")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.playCookieClickSound")
    @js.native
    def playCookieClickSound(): Unit = js.native
    
    @JSGlobal("Game.playWrinklerSquishSound")
    @js.native
    def playWrinklerSquishSound(): Unit = js.native
    
    @JSGlobal("Game.pledgeT")
    @js.native
    def pledgeT: Double = js.native
    @scala.inline
    def pledgeT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pledgeT")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.pledges")
    @js.native
    def pledges: Double = js.native
    @scala.inline
    def pledges_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pledges")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.popups")
    @js.native
    def popups: Double = js.native
    @scala.inline
    def popups_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("popups")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.prefs")
    @js.native
    def prefs: js.Array[js.UndefOr[scala.Nothing]] with Prefs = js.native
    @scala.inline
    def prefs_=(x: js.Array[js.UndefOr[scala.Nothing]] with Prefs): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefs")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.prestige")
    @js.native
    def prestige: Double = js.native
    @scala.inline
    def prestige_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prestige")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.previousFps")
    @js.native
    def previousFps: Double = js.native
    @scala.inline
    def previousFps_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("previousFps")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.priceIncrease")
    @js.native
    def priceIncrease: Double = js.native
    @scala.inline
    def priceIncrease_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("priceIncrease")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.promptAnchorL")
    @js.native
    def promptAnchorL: js.Object = js.native
    @scala.inline
    def promptAnchorL_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("promptAnchorL")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.promptConfirm")
    @js.native
    def promptConfirm: String = js.native
    @scala.inline
    def promptConfirm_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("promptConfirm")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.promptL")
    @js.native
    def promptL: js.Object = js.native
    @scala.inline
    def promptL_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("promptL")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.promptOn")
    @js.native
    def promptOn: Double = js.native
    @scala.inline
    def promptOn_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("promptOn")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.promptUpdateFunc")
    @js.native
    def promptUpdateFunc: Double = js.native
    @scala.inline
    def promptUpdateFunc_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("promptUpdateFunc")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.promptWrapL")
    @js.native
    def promptWrapL: js.Object = js.native
    @scala.inline
    def promptWrapL_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("promptWrapL")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.rareEggDrops")
    @js.native
    def rareEggDrops: js.Array[String] = js.native
    @scala.inline
    def rareEggDrops_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rareEggDrops")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.ready")
    @js.native
    def ready: PseudoBoolean = js.native
    @scala.inline
    def ready_=(x: PseudoBoolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ready")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.recalculateGains")
    @js.native
    def recalculateGains: Double = js.native
    @scala.inline
    def recalculateGains_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("recalculateGains")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.refillLump")
    @js.native
    def refillLump(n: Double, func: js.Function0[Unit]): Unit = js.native
    
    @JSGlobal("Game.registerHook")
    @js.native
    def registerHook(hook: String, func: js.Array[js.Function0[Unit]]): Unit = js.native
    @JSGlobal("Game.registerHook")
    @js.native
    def registerHook(hook: String, func: js.Function0[Unit]): Unit = js.native
    @JSGlobal("Game.registerHook")
    @js.native
    def registerHook_cookiesPerClick(hook: cookiesPerClick, func: js.Array[js.Function0[Double]]): Unit = js.native
    @JSGlobal("Game.registerHook")
    @js.native
    def registerHook_cookiesPerClick(hook: cookiesPerClick, func: js.Function0[Double]): Unit = js.native
    @JSGlobal("Game.registerHook")
    @js.native
    def registerHook_cps(hook: cps, func: js.Array[js.Function0[Double]]): Unit = js.native
    @JSGlobal("Game.registerHook")
    @js.native
    def registerHook_cps(hook: cps, func: js.Function0[Double]): Unit = js.native
    @JSGlobal("Game.registerHook")
    @js.native
    def registerHook_ticker(hook: ticker, func: js.Array[js.Function0[js.Array[String]]]): Unit = js.native
    @JSGlobal("Game.registerHook")
    @js.native
    def registerHook_ticker(hook: ticker, func: js.Function0[js.Array[String]]): Unit = js.native
    
    @JSGlobal("Game.registerMod")
    @js.native
    def registerMod(id: String, obj: Mod): Unit = js.native
    
    @JSGlobal("Game.reindeerClicked")
    @js.native
    def reindeerClicked: Double = js.native
    @scala.inline
    def reindeerClicked_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reindeerClicked")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.reindeerDrops")
    @js.native
    def reindeerDrops: js.Array[String] = js.native
    @scala.inline
    def reindeerDrops_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reindeerDrops")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.removeClass")
    @js.native
    def removeClass(what: String): Unit = js.native
    
    @JSGlobal("Game.researchT")
    @js.native
    def researchT: Double = js.native
    @scala.inline
    def researchT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("researchT")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.resets")
    @js.native
    def resets: Double = js.native
    @scala.inline
    def resets_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("resets")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.salvageSave")
    @js.native
    def salvageSave(): Unit = js.native
    
    @JSGlobal("Game.santaDrops")
    @js.native
    def santaDrops: js.Array[String] = js.native
    @scala.inline
    def santaDrops_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("santaDrops")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.santaLevel")
    @js.native
    def santaLevel: Double = js.native
    @scala.inline
    def santaLevel_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("santaLevel")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.santaLevels")
    @js.native
    def santaLevels: js.Array[String] = js.native
    @scala.inline
    def santaLevels_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("santaLevels")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.saySeasonSwitchUses")
    @js.native
    def saySeasonSwitchUses(): String = js.native
    
    @JSGlobal("Game.sayTime")
    @js.native
    def sayTime_1(time: Double, detail: `-1`): String = js.native
    @JSGlobal("Game.sayTime")
    @js.native
    def sayTime_1(time: Double, detail: `1`): String = js.native
    @JSGlobal("Game.sayTime")
    @js.native
    def sayTime_2(time: Double, detail: `2`): String = js.native
    @JSGlobal("Game.sayTime")
    @js.native
    def sayTime_3(time: Double, detail: `3`): String = js.native
    @JSGlobal("Game.sayTime")
    @js.native
    def sayTime_4(time: Double, detail: `4`): String = js.native
    
    @JSGlobal("Game.scriptBindings")
    @js.native
    def scriptBindings: js.Array[js.UndefOr[scala.Nothing]] with (Record[String, typings.cookieclicker.Game.GameObject]) = js.native
    @scala.inline
    def scriptBindings_=(
      x: js.Array[js.UndefOr[scala.Nothing]] with (Record[String, typings.cookieclicker.Game.GameObject])
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scriptBindings")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.scriptLoaded")
    @js.native
    def scriptLoaded(who: typings.cookieclicker.Game.GameObject, script: String): Unit = js.native
    
    @JSGlobal("Game.season")
    @js.native
    def season: String = js.native
    
    @JSGlobal("Game.seasonDrops")
    @js.native
    def seasonDrops: js.Array[String] = js.native
    @scala.inline
    def seasonDrops_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("seasonDrops")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.seasonT")
    @js.native
    def seasonT: Double = js.native
    @scala.inline
    def seasonT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("seasonT")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.seasonTriggerBasePrice")
    @js.native
    def seasonTriggerBasePrice: Double = js.native
    @scala.inline
    def seasonTriggerBasePrice_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("seasonTriggerBasePrice")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.seasonUses")
    @js.native
    def seasonUses: Double = js.native
    @scala.inline
    def seasonUses_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("seasonUses")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def season_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("season")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.seasons")
    @js.native
    def seasons: Record[String, Season] = js.native
    @scala.inline
    def seasons_=(x: Record[String, Season]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("seasons")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.seed")
    @js.native
    def seed: String = js.native
    @scala.inline
    def seed_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("seed")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.sesame")
    @js.native
    def sesame: Double = js.native
    @scala.inline
    def sesame_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sesame")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.setOnCrate")
    @js.native
    def setOnCrate(what: Double): Unit = js.native
    
    @JSGlobal("Game.setVolume")
    @js.native
    def setVolume(what: Double): Unit = js.native
    
    @JSGlobal("Game.shimmerTypes")
    @js.native
    def shimmerTypes: Record[String, ShimmerType] = js.native
    @scala.inline
    def shimmerTypes_=(x: Record[String, ShimmerType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shimmerTypes")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.shimmers")
    @js.native
    def shimmers: js.Array[
        typings.cookieclicker.Game.Shimmer[/* keyof std.Record<string, cookieclicker.Game.ShimmerType> */ String, js.Object]
      ] = js.native
    
    @JSGlobal("Game.shimmersL")
    @js.native
    def shimmersL: HTMLDivElement = js.native
    @scala.inline
    def shimmersL_=(x: HTMLDivElement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shimmersL")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.shimmersN")
    @js.native
    def shimmersN: Double = js.native
    @scala.inline
    def shimmersN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shimmersN")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def shimmers_=(
      x: js.Array[
          typings.cookieclicker.Game.Shimmer[/* keyof std.Record<string, cookieclicker.Game.ShimmerType> */ String, js.Object]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shimmers")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.showBackupWarning")
    @js.native
    def showBackupWarning(): Unit = js.native
    
    @JSGlobal("Game.sortSprites")
    @js.native
    def sortSprites(a: js.Any, b: js.Any): Double = js.native
    
    @JSGlobal("Game.sortSpritesById")
    @js.native
    def sortSpritesById(a: js.Any, b: js.Any): Double = js.native
    
    @JSGlobal("Game.sortedMods")
    @js.native
    def sortedMods: js.Array[Mod] = js.native
    @scala.inline
    def sortedMods_=(x: js.Array[Mod]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sortedMods")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.sparkles")
    @js.native
    def sparkles: js.Object = js.native
    
    @JSGlobal("Game.sparklesFrames")
    @js.native
    def sparklesFrames: Double = js.native
    @scala.inline
    def sparklesFrames_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sparklesFrames")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.sparklesT")
    @js.native
    def sparklesT: Double = js.native
    @scala.inline
    def sparklesT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sparklesT")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def sparkles_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sparkles")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.specialTab")
    @js.native
    def specialTab: String = js.native
    
    @JSGlobal("Game.specialTabHovered")
    @js.native
    def specialTabHovered: String = js.native
    @scala.inline
    def specialTabHovered_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("specialTabHovered")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def specialTab_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("specialTab")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.specialTabs")
    @js.native
    def specialTabs: js.Array[String] = js.native
    @scala.inline
    def specialTabs_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("specialTabs")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.spendLump")
    @js.native
    def spendLump(n: Double, str: String, func: js.Function0[Unit]): js.Function0[Unit] = js.native
    
    @JSGlobal("Game.startDate")
    @js.native
    def startDate: Double = js.native
    @scala.inline
    def startDate_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("startDate")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.storeBulkButton")
    @js.native
    def storeBulkButton(id: Double): Unit = js.native
    
    @JSGlobal("Game.storeBuyAll")
    @js.native
    def storeBuyAll(): Unit | `false` = js.native
    
    @JSGlobal("Game.storeToRefresh")
    @js.native
    def storeToRefresh: Double = js.native
    @scala.inline
    def storeToRefresh_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("storeToRefresh")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.textParticles")
    @js.native
    def textParticles: js.Array[Particle] = js.native
    
    @JSGlobal("Game.textParticlesAdd")
    @js.native
    def textParticlesAdd(text: String, el: js.UndefOr[scala.Nothing], posX: Double, posY: Double): Particle = js.native
    @JSGlobal("Game.textParticlesAdd")
    @js.native
    def textParticlesAdd_0(text: String, el: `0`, posX: Double, posY: Double): Particle = js.native
    
    @JSGlobal("Game.textParticlesUpdate")
    @js.native
    def textParticlesUpdate(): Unit = js.native
    
    @JSGlobal("Game.textParticlesY")
    @js.native
    def textParticlesY: Double = js.native
    @scala.inline
    def textParticlesY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("textParticlesY")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def textParticles_=(x: js.Array[Particle]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("textParticles")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.thresholdIcons")
    @js.native
    def thresholdIcons: js.Array[Double] = js.native
    @scala.inline
    def thresholdIcons_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("thresholdIcons")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.tickerBelowL")
    @js.native
    def tickerBelowL: js.Object = js.native
    @scala.inline
    def tickerBelowL_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tickerBelowL")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.tickerCompactL")
    @js.native
    def tickerCompactL: js.Object = js.native
    @scala.inline
    def tickerCompactL_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tickerCompactL")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.tickerL")
    @js.native
    def tickerL: js.Object = js.native
    @scala.inline
    def tickerL_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tickerL")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.time")
    @js.native
    def time: Double = js.native
    @scala.inline
    def time_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("time")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.timedout")
    @js.native
    def timedout: Boolean = js.native
    @scala.inline
    def timedout_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timedout")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.tinyCookie")
    @js.native
    def tinyCookie(): String = js.native
    
    @JSGlobal("Game.toSave")
    @js.native
    def toSave: Boolean = js.native
    @scala.inline
    def toSave_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toSave")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.tooltip")
    @js.native
    def tooltip: Tooltip = js.native
    @scala.inline
    def tooltip_=(x: Tooltip): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.touchEvents")
    @js.native
    def touchEvents: PseudoBoolean = js.native
    @scala.inline
    def touchEvents_=(x: PseudoBoolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("touchEvents")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.unbuffedCps")
    @js.native
    def unbuffedCps: Double = js.native
    @scala.inline
    def unbuffedCps_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("unbuffedCps")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.updateBuffs")
    @js.native
    def updateBuffs(): Unit = js.native
    
    @JSGlobal("Game.updateClasses")
    @js.native
    def updateClasses(): Unit = js.native
    
    @JSGlobal("Game.updateLog")
    @js.native
    def updateLog: String = js.native
    @scala.inline
    def updateLog_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("updateLog")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.updateShimmers")
    @js.native
    def updateShimmers(): Unit = js.native
    
    @JSGlobal("Game.upgradesToRebuild")
    @js.native
    def upgradesToRebuild: Double = js.native
    @scala.inline
    def upgradesToRebuild_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("upgradesToRebuild")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.useLocalStorage")
    @js.native
    def useLocalStorage: Double = js.native
    @scala.inline
    def useLocalStorage_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("useLocalStorage")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.useSwap")
    @js.native
    def useSwap: js.UndefOr[js.Function1[/* n */ Double, Unit]] = js.native
    @scala.inline
    def useSwap_=(x: js.UndefOr[js.Function1[/* n */ Double, Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("useSwap")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.vanilla")
    @js.native
    def vanilla: PseudoBoolean = js.native
    @scala.inline
    def vanilla_=(x: PseudoBoolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("vanilla")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.vault")
    @js.native
    def vault: js.Array[Double] = js.native
    @scala.inline
    def vault_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("vault")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.version")
    @js.native
    def version: Double = js.native
    @scala.inline
    def version_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.volume")
    @js.native
    def volume: Double = js.native
    @scala.inline
    def volume_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("volume")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.windowH")
    @js.native
    def windowH: Double = js.native
    @scala.inline
    def windowH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("windowH")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.windowW")
    @js.native
    def windowW: Double = js.native
    @scala.inline
    def windowW_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("windowW")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.wrinklerHP")
    @js.native
    def wrinklerHP: Double = js.native
    @scala.inline
    def wrinklerHP_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wrinklerHP")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.wrinklerSquishSound")
    @js.native
    def wrinklerSquishSound: Double = js.native
    @scala.inline
    def wrinklerSquishSound_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wrinklerSquishSound")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.wrinklers")
    @js.native
    def wrinklers: js.Array[Wrinkler] = js.native
    
    @JSGlobal("Game.wrinklersPopped")
    @js.native
    def wrinklersPopped: Double = js.native
    @scala.inline
    def wrinklersPopped_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wrinklersPopped")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def wrinklers_=(x: js.Array[Wrinkler]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wrinklers")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Loader")
  @js.native
  class Loader ()
    extends typings.cookieclicker.Loader
  
  @JSGlobal("PlaySound")
  @js.native
  def PlaySound(url: String): Unit = js.native
  @JSGlobal("PlaySound")
  @js.native
  def PlaySound(url: String, volume: js.UndefOr[scala.Nothing], pitch: Double): Unit = js.native
  @JSGlobal("PlaySound")
  @js.native
  def PlaySound(url: String, volume: Double): Unit = js.native
  @JSGlobal("PlaySound")
  @js.native
  def PlaySound(url: String, volume: Double, pitch: Double): Unit = js.native
  
  /**
    * Returns a random member of an array, has a very slight chance to return `undefined` (When the seeded Math.random() is 1)
    * @param array The array to pick a member of
    */
  @JSGlobal("choose")
  @js.native
  def choose[T](array: js.Array[T]): T = js.native
  
  @JSGlobal("l")
  @js.native
  def l(name: String): HTMLElement = js.native
  
  /**
    * Floors or ceils randomly, biased by the decimal value
    */
  @JSGlobal("randomFloor")
  @js.native
  def randomFloor(x: Double): Double = js.native
  
  @JSGlobal("shuffle")
  @js.native
  def shuffle[T](array: js.Array[T]): js.Array[T] = js.native
  
  /**
    * An extended toFixed, which converts any number to an e-less string
    */
  @JSGlobal("toFixed")
  @js.native
  def toFixed(x: Double): String = js.native
}
