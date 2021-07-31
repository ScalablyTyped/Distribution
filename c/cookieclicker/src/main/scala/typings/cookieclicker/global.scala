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
import typings.cookieclicker.Game.ProductionAchievementRequirement
import typings.cookieclicker.Game.PseudoBoolean
import typings.cookieclicker.Game.PseudoNull
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
import typings.cookieclicker.anon.Frame
import typings.cookieclicker.anon.HTMLCanvasElementwidth8he
import typings.cookieclicker.cookieclickerBooleans.`false`
import typings.cookieclicker.cookieclickerNumbers.`-1`
import typings.cookieclicker.cookieclickerNumbers.`0`
import typings.cookieclicker.cookieclickerNumbers.`1`
import typings.cookieclicker.cookieclickerNumbers.`2`
import typings.cookieclicker.cookieclickerNumbers.`3`
import typings.cookieclicker.cookieclickerNumbers.`4`
import typings.cookieclicker.cookieclickerStrings.Farm
import typings.cookieclicker.cookieclickerStrings.Temple
import typings.cookieclicker.cookieclickerStrings._empty
import typings.cookieclicker.cookieclickerStrings.`Wizard tower`
import typings.cookieclicker.cookieclickerStrings.achievement
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
import typings.std.HTMLCanvasElement
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.HTMLImageElement
import typings.std.InputEvent
import typings.std.MouseEvent
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @scala.inline
  def AddEvent(htmlElement: HTMLElement, eventName: String, eventFunction: js.Function1[/* e */ Event, Unit]): Unit = (js.Dynamic.global.applyDynamic("AddEvent")(htmlElement.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventFunction.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Beautifies a number
    * @param val The number to beautify
    * @param floats The amount of decimals to show
    */
  @scala.inline
  def Beautify(`val`: Double): String = js.Dynamic.global.applyDynamic("Beautify")(`val`.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def Beautify(`val`: Double, floats: Double): String = (js.Dynamic.global.applyDynamic("Beautify")(`val`.asInstanceOf[js.Any], floats.asInstanceOf[js.Any])).asInstanceOf[String]
  
  object Game {
    
    @JSGlobal("Game")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Game.Achievement")
    @js.native
    class Achievement protected ()
      extends StObject
         with typings.cookieclicker.Game.Achievement {
      /**
        * Creates an achievement
        * @param name The name of the achievement
        * @param desc The HTML string of the description
        * @param icon The icon of the achievement
        */
      def this(name: String, desc: String, icon: Icon) = this()
      
      /**
        * The description of the upgrade without auto-adjusted text
        */
      /* CompleteClass */
      var baseDesc: String = js.native
      
      /**
        * Called when the achievement crate is clicked, calls `clickFunction`
        */
      /* CompleteClass */
      override def click(): Unit = js.native
      
      /**
        * The description of the upgrade with auto-adjusted text
        */
      /* CompleteClass */
      var desc: String = js.native
      
      /** Unused @deprecated */
      /* CompleteClass */
      var disabled: PseudoBoolean = js.native
      
      /* CompleteClass */
      var icon: Icon = js.native
      
      /* CompleteClass */
      var id: Double = js.native
      
      /* CompleteClass */
      var name: String = js.native
      
      /**
        * The place of the achievement in the achievement list
        */
      /* CompleteClass */
      var order: Double = js.native
      
      /* CompleteClass */
      var pool: AchievementPool = js.native
      
      /**
        * Toggles the achievement state
        */
      /* CompleteClass */
      override def toggle(): Unit = js.native
      
      /* CompleteClass */
      var `type`: achievement = js.native
      
      /* CompleteClass */
      var vanilla: PseudoBoolean = js.native
      
      /* CompleteClass */
      var won: PseudoBoolean = js.native
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
    
    @scala.inline
    def AddToLog(what: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("AddToLog")(what.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def Ascend(bypass: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Ascend")(bypass.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
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
    
    @scala.inline
    def AscendRefocus(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("AscendRefocus")().asInstanceOf[Unit]
    
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
    
    @scala.inline
    def AssignPermanentSlot(slot: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("AssignPermanentSlot")(slot.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
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
    
    @scala.inline
    def BankAchievement(name: String): BankAchievementClass = ^.asInstanceOf[js.Dynamic].applyDynamic("BankAchievement")(name.asInstanceOf[js.Any]).asInstanceOf[BankAchievementClass]
    @scala.inline
    def BankAchievement(name: String, q: String): BankAchievementClass = (^.asInstanceOf[js.Dynamic].applyDynamic("BankAchievement")(name.asInstanceOf[js.Any], q.asInstanceOf[js.Any])).asInstanceOf[BankAchievementClass]
    
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
    
    @scala.inline
    def BuildAscendTree(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("BuildAscendTree")().asInstanceOf[Unit]
    
    @scala.inline
    def BuildStore(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("BuildStore")().asInstanceOf[Unit]
    
    @JSGlobal("Game.BuildingsOwned")
    @js.native
    def BuildingsOwned: Double = js.native
    @scala.inline
    def BuildingsOwned_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BuildingsOwned")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def CalculateGains(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("CalculateGains")().asInstanceOf[Unit]
    
    @JSGlobal("Game.CanClick")
    @js.native
    def CanClick: Double = js.native
    @scala.inline
    def CanClick_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CanClick")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def CheckUpdates(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("CheckUpdates")().asInstanceOf[Unit]
    
    @scala.inline
    def CheckUpdatesResponse(response: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("CheckUpdatesResponse")(response.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSGlobal("Game.Click")
    @js.native
    def Click: Double = js.native
    
    @scala.inline
    def ClickCookie(e: MouseEvent, amount: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ClickCookie")(e.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def ClickProduct(what: typings.cookieclicker.Game.GameObject): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ClickProduct")(what.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def ClickSpecialPic(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ClickSpecialPic")().asInstanceOf[Unit]
    
    @scala.inline
    def ClickTinyCookie(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ClickTinyCookie")().asInstanceOf[Unit]
    
    @scala.inline
    def Click_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Click")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def CloseNote(id: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("CloseNote")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def CloseNotes(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("CloseNotes")().asInstanceOf[Unit]
    
    @scala.inline
    def ClosePrompt(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ClosePrompt")().asInstanceOf[Unit]
    
    @scala.inline
    def CollectWrinklers(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("CollectWrinklers")().asInstanceOf[Unit]
    
    @scala.inline
    def ComputeCps(base: Double, mult: Double, bonus: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("ComputeCps")(base.asInstanceOf[js.Any], mult.asInstanceOf[js.Any], bonus.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @scala.inline
    def ConfirmPrompt(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ConfirmPrompt")().asInstanceOf[Unit]
    
    @scala.inline
    def CountsAsAchievementOwned(pool: AchievementPool): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("CountsAsAchievementOwned")(pool.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def CountsAsUpgradeOwned(pool: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("CountsAsUpgradeOwned")(pool.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def CpsAchievement(name: String): CpsAchievementClass = ^.asInstanceOf[js.Dynamic].applyDynamic("CpsAchievement")(name.asInstanceOf[js.Any]).asInstanceOf[CpsAchievementClass]
    @scala.inline
    def CpsAchievement(name: String, q: String): CpsAchievementClass = (^.asInstanceOf[js.Dynamic].applyDynamic("CpsAchievement")(name.asInstanceOf[js.Any], q.asInstanceOf[js.Any])).asInstanceOf[CpsAchievementClass]
    
    @JSGlobal("Game.CpsAchievements")
    @js.native
    def CpsAchievements: js.Array[CpsAchievementClass] = js.native
    @scala.inline
    def CpsAchievements_=(x: js.Array[CpsAchievementClass]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CpsAchievements")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def DebugUpgradeCpS(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("DebugUpgradeCpS")().asInstanceOf[Unit]
    
    @JSGlobal("Game.DebuggingPrestige")
    @js.native
    def DebuggingPrestige: Double = js.native
    @scala.inline
    def DebuggingPrestige_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DebuggingPrestige")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def DefaultPrefs(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("DefaultPrefs")().asInstanceOf[Unit]
    
    @scala.inline
    def DescribeDragonAura(aura: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("DescribeDragonAura")(aura.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def Dissolve(howmuch: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Dissolve")(howmuch.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def Draw(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Draw")().asInstanceOf[Unit]
    
    @scala.inline
    def DrawBackground(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("DrawBackground")().asInstanceOf[Unit]
    
    @scala.inline
    def DrawBuildings(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("DrawBuildings")().asInstanceOf[Unit]
    
    @scala.inline
    def DrawSpecial(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("DrawSpecial")().asInstanceOf[Unit]
    
    @scala.inline
    def DrawWrinklers(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("DrawWrinklers")().asInstanceOf[Unit]
    
    @scala.inline
    def DropEgg(failRate: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("DropEgg")(failRate.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def Earn(howmuch: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Earn")(howmuch.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def EarnHeavenlyChips(cookiesForfeited: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("EarnHeavenlyChips")(cookiesForfeited.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def EditAscend(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("EditAscend")().asInstanceOf[Unit]
    
    @scala.inline
    def ErrorFrame(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ErrorFrame")().asInstanceOf[Unit]
    
    @scala.inline
    def ExportSave(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ExportSave")().asInstanceOf[Unit]
    
    @scala.inline
    def FileLoad(e: InputEvent): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("FileLoad")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def FileSave(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("FileSave")().asInstanceOf[Unit]
    
    @JSGlobal("Game.GameObject")
    @js.native
    class GameObject protected ()
      extends StObject
         with typings.cookieclicker.Game.GameObject {
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
      
      /**
        * The way the building makes cookies
        */
      /* CompleteClass */
      var actionName: String = js.native
      
      /**
        * The amount of buildings owned, including free ones
        */
      /* CompleteClass */
      var amount: Double = js.native
      
      /**
        * The art the building uses
        */
      /* CompleteClass */
      var art: Art = js.native
      
      /**
        * The CpS the building generates without any boosts
        */
      /* CompleteClass */
      var baseCps: Double = js.native
      
      /**
        * The price the building generates without any boosts
        */
      /* CompleteClass */
      var basePrice: Double = js.native
      
      /**
        * The amount of times a building has been bought, including free buys
        */
      /* CompleteClass */
      var bought: Double = js.native
      
      /**
        * The current price displayed in store
        */
      /* CompleteClass */
      var bulkPrice: Double = js.native
      
      /**
        * Buys a building
        * @param amount Amount of buildings to buy, defaults to `Game.buyBulk`
        */
      /* CompleteClass */
      override def buy(amount: Double): Unit | `0` = js.native
      
      /**
        * Buys a building for free, while increasing the price
        * @param amount Amount of buildings to buy
        */
      /* CompleteClass */
      override def buyFree(amount: Double): Unit = js.native
      
      /**
        * The function that gets called on buy
        */
      /* CompleteClass */
      override def buyFunction(): Unit = js.native
      
      /**
        * The canvas for art
        */
      /* CompleteClass */
      var canvas: HTMLCanvasElement = js.native
      
      /**
        * The function to calculate CPS
        * @param me The building itself
        */
      /* CompleteClass */
      override def cps(me: typings.cookieclicker.Game.GameObject): Double = js.native
      
      /**
        * The context from canvas for the art
        */
      /* CompleteClass */
      var ctx: CanvasRenderingContext2D = js.native
      
      /**
        * The visual description for the building
        */
      /* CompleteClass */
      var desc: String = js.native
      
      /**
        * The visual name for the building(an html string)
        */
      /* CompleteClass */
      var displayName: String = js.native
      
      /**
        * Redraws the art
        */
      /* CompleteClass */
      override def draw(): Unit | `false` = js.native
      
      /**
        * The function to get called, well, each frame
        */
      /* CompleteClass */
      var eachFrame: js.Function0[Unit] | PseudoNull = js.native
      
      /**
        * The description of how the level changes the building, used for one lump, where [X] is the level
        */
      /* CompleteClass */
      var extraName: String = js.native
      
      /**
        * The description of how the level changes the building, used for multiple lumps, where [X] is the level
        */
      /* CompleteClass */
      var extraPlural: String = js.native
      
      /**
        * The fortune upgrade tied with the building
        */
      /* CompleteClass */
      var fortune: TieredUpgradeClass[typings.cookieclicker.cookieclickerStrings.fortune] | PseudoNull = js.native
      
      /**
        * The amount of buildings gotten for free
        */
      /* CompleteClass */
      var free: Double = js.native
      
      /**
        * Buys a building for free, while *not* increasing the price
        * @param amount Amount of buildings to get
        */
      /* CompleteClass */
      override def getFree(amount: Double): Unit = js.native
      
      /**
        * Convert buildings to free buildings
        * @param amount The amount of buildings to convert
        */
      /* CompleteClass */
      override def getFreeRanks(amount: Double): Unit = js.native
      
      /**
        * Get the current price of building
        * @param n Unused parameter
        */
      /* CompleteClass */
      override def getPrice(n: Double): Double = js.native
      
      /**
        * Get the cookies gained by selling an amount of buildings
        * @param amount The amount of buildings to sell
        */
      /* CompleteClass */
      override def getReverseSumPrice(amount: Double): Double = js.native
      
      /**
        * Gets the sell multiplier and returns it
        * As of 2.029, the multiplier is 25% * (1 + aura multiplier of Earth Shatterer)
        */
      /* CompleteClass */
      override def getSellMultiplier(): Double = js.native
      
      /**
        * Get the price of buying an amount of buildings
        * @param amount The amount of buildings to buy
        */
      /* CompleteClass */
      override def getSumPrice(amount: Double): Double = js.native
      
      /**
        * The highest amount of buildings owned this run
        */
      /* CompleteClass */
      var highest: Double = js.native
      
      /**
        * The row to be used in the big icon
        */
      /* CompleteClass */
      var icon: Double = js.native
      
      /**
        * The column to be used for the icon (Tier upgrade icons are derived from this)
        */
      /* CompleteClass */
      var iconColumn: Double = js.native
      
      /**
        * Buildings id, 0 based
        */
      /* CompleteClass */
      var id: Double = js.native
      
      /**
        * Buildings listing in store
        */
      /* CompleteClass */
      var l: HTMLDivElement = js.native
      
      /* CompleteClass */
      var level: Double = js.native
      
      /* CompleteClass */
      var levelAchiev10: typings.cookieclicker.Game.Achievement = js.native
      
      /* CompleteClass */
      override def levelTooltip(): String = js.native
      
      /* CompleteClass */
      override def levelUp(): js.Function0[Unit] = js.native
      
      /**
        * If the building is visually locked, is considered unlocked after CBTA is higher than the base cost
        */
      /* CompleteClass */
      var locked: PseudoBoolean = js.native
      
      /* CompleteClass */
      var minigameLoaded: Boolean = js.native
      
      /* CompleteClass */
      var minigameName: String = js.native
      
      /* CompleteClass */
      var minigameSave: String = js.native
      
      /* CompleteClass */
      var minigameUrl: String = js.native
      
      /* CompleteClass */
      var mouseOn: Boolean = js.native
      
      /* CompleteClass */
      var mousePos: js.Tuple2[Double, Double] = js.native
      
      /**
        * Mutes or unmutes the building, depending on `val`
        * @param val The new muted status, 0 for unmuted, 1 for muted
        */
      /* CompleteClass */
      override def mute(`val`: Double): Unit = js.native
      
      /* CompleteClass */
      var muted: Double = js.native
      
      /**
        * Same as id
        */
      /* CompleteClass */
      var n: Double = js.native
      
      /* CompleteClass */
      var name: String = js.native
      
      /* CompleteClass */
      var onMinigame: Double = js.native
      
      /**
        * The singular pictures used in the art
        */
      /* CompleteClass */
      var pics: js.Array[Frame] = js.native
      
      /* CompleteClass */
      var plural: String = js.native
      
      /* CompleteClass */
      var price: Double = js.native
      
      /* CompleteClass */
      var productionAchievs: js.Array[ProductionAchievementRequirement] = js.native
      
      /**
        * Updates store listing and art buttons
        */
      /* CompleteClass */
      override def rebuild(): Unit = js.native
      
      /**
        * Resets `this.pics`, see `draw` for actual redrawing
        */
      /* CompleteClass */
      override def redraw(): Unit = js.native
      
      /**
        * Updates price, bulk price and art appearance, calls `rebuild`
        */
      /* CompleteClass */
      override def refresh(): Unit = js.native
      
      /**
        * Sells buildings without refunding the cookies
        * @param amount The amount of buildings to sacrifice
        */
      /* CompleteClass */
      override def sacrafice(amount: Double): Unit = js.native
      
      /**
        * Sells buildings and refunds a part of the cost, see `getSellMultiplier` for the exact multiplier
        * @param amount The amount of buildings to sell
        */
      /* CompleteClass */
      override def sell(amount: Double, bypass: Unit): Unit = js.native
      
      /* CompleteClass */
      var single: String = js.native
      
      /**
        * Amount of CpS a building produces (as of 2.031, `this.cps` * level bonus)
        */
      /* CompleteClass */
      var storedCps: Double = js.native
      
      /**
        *  Amount of CpS a building produces, multiplied by amount (as of 2.027, `this.cps` * level bonus)
        */
      /* CompleteClass */
      var storedTotalCps: Double = js.native
      
      /* CompleteClass */
      override def switchMinigame(on: Double): Unit = js.native
      
      /* CompleteClass */
      var synergies: js.Array[SynergyUpgradeClass[String]] = js.native
      
      /* CompleteClass */
      var tieredAchievs: js.Array[TieredAchievementClass[Double]] = js.native
      
      /* CompleteClass */
      var tieredUpgrades: js.Array[TieredUpgradeClass[Double]] = js.native
      
      /**
        * Generates a tooltip to show on the shop listing.
        * @return A string with the html elements
        */
      /* CompleteClass */
      override def tooltip(): String = js.native
      
      /**
        * Total cookies produced by the building
        */
      /* CompleteClass */
      var totalCookies: Double = js.native
      
      /* CompleteClass */
      var vanilla: PseudoBoolean = js.native
    }
    
    @scala.inline
    def GetAllDebugs(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("GetAllDebugs")().asInstanceOf[Unit]
    
    @scala.inline
    def GetBakeryName(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("GetBakeryName")().asInstanceOf[String]
    
    @scala.inline
    def GetHeavenlyMultiplier(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("GetHeavenlyMultiplier")().asInstanceOf[Double]
    
    @scala.inline
    def GetHowManyEggs(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("GetHowManyEggs")().asInstanceOf[Double]
    
    @scala.inline
    def GetHowManyHalloweenDrops(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("GetHowManyHalloweenDrops")().asInstanceOf[Double]
    
    @scala.inline
    def GetHowManyHeartDrops(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("GetHowManyHeartDrops")().asInstanceOf[Double]
    
    @scala.inline
    def GetHowManyReindeerDrops(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("GetHowManyReindeerDrops")().asInstanceOf[Double]
    
    @scala.inline
    def GetHowManySantaDrops(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("GetHowManySantaDrops")().asInstanceOf[Double]
    
    @scala.inline
    def GetIcon(`type`: String, tier: String): Icon = (^.asInstanceOf[js.Dynamic].applyDynamic("GetIcon")(`type`.asInstanceOf[js.Any], tier.asInstanceOf[js.Any])).asInstanceOf[Icon]
    @scala.inline
    def GetIcon(`type`: String, tier: Double): Icon = (^.asInstanceOf[js.Dynamic].applyDynamic("GetIcon")(`type`.asInstanceOf[js.Any], tier.asInstanceOf[js.Any])).asInstanceOf[Icon]
    
    @scala.inline
    def GetMouseCoords(e: MouseEvent): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("GetMouseCoords")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def GetTieredCpsMult(me: typings.cookieclicker.Game.GameObject): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("GetTieredCpsMult")(me.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def GiveUpAscend(bypass: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("GiveUpAscend")(bypass.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def GrabData(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("GrabData")().asInstanceOf[Unit]
    
    @scala.inline
    def GrabDataResponse(response: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("GrabDataResponse")(response.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSGlobal("Game.GrandmaSynergies")
    @js.native
    def GrandmaSynergies: js.Array[String] = js.native
    @scala.inline
    def GrandmaSynergies_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GrandmaSynergies")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def GrandmaSynergy(name: String, desc: String, building: String): GrandmaSynergyClass = (^.asInstanceOf[js.Dynamic].applyDynamic("GrandmaSynergy")(name.asInstanceOf[js.Any], desc.asInstanceOf[js.Any], building.asInstanceOf[js.Any])).asInstanceOf[GrandmaSynergyClass]
    
    @JSGlobal("Game.HCfactor")
    @js.native
    def HCfactor: Double = js.native
    @scala.inline
    def HCfactor_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HCfactor")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def HardReset_0(bypass: `0`): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("HardReset")(bypass.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def HardReset_1(bypass: `1`): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("HardReset")(bypass.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def HardReset_2(bypass: `2`): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("HardReset")(bypass.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def Has(what: String): PseudoBoolean = ^.asInstanceOf[js.Dynamic].applyDynamic("Has")(what.asInstanceOf[js.Any]).asInstanceOf[PseudoBoolean]
    
    @scala.inline
    def HasAchiev(what: String): PseudoBoolean = ^.asInstanceOf[js.Dynamic].applyDynamic("HasAchiev")(what.asInstanceOf[js.Any]).asInstanceOf[PseudoBoolean]
    
    @scala.inline
    def HasUnlocked(what: String): PseudoBoolean = ^.asInstanceOf[js.Dynamic].applyDynamic("HasUnlocked")(what.asInstanceOf[js.Any]).asInstanceOf[PseudoBoolean]
    
    @scala.inline
    def HowManyCookiesReset(chips: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("HowManyCookiesReset")(chips.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def HowMuchPrestige(cookies: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("HowMuchPrestige")(cookies.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def ImportSave(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ImportSave")().asInstanceOf[Unit]
    
    @scala.inline
    def ImportSaveCode(save: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ImportSaveCode")(save.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def Init(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Init")().asInstanceOf[Unit]
    
    @scala.inline
    def Launch(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Launch")().asInstanceOf[Unit]
    
    @JSGlobal("Game.LeftBackground")
    @js.native
    def LeftBackground: CanvasRenderingContext2D = js.native
    @scala.inline
    def LeftBackground_=(x: CanvasRenderingContext2D): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LeftBackground")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def Load(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Load")().asInstanceOf[Unit]
    
    @scala.inline
    def LoadMinigames(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("LoadMinigames")().asInstanceOf[Unit]
    
    @scala.inline
    def LoadMod(url: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("LoadMod")(url.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def LoadSave(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("LoadSave")().asInstanceOf[Boolean]
    @scala.inline
    def LoadSave(data: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("LoadSave")(data.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def LoadWrinklers(amount: Double, number: Double, shinies: Double, amountShinies: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("LoadWrinklers")(amount.asInstanceOf[js.Any], number.asInstanceOf[js.Any], shinies.asInstanceOf[js.Any], amountShinies.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSGlobal("Game.Loader")
    @js.native
    def Loader: typings.cookieclicker.Loader = js.native
    @scala.inline
    def Loader_=(x: typings.cookieclicker.Loader): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Loader")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def Lock(what: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Lock")(what.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def Lock(what: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Lock")(what.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSGlobal("Game.Log")
    @js.native
    def Log: js.Array[String] = js.native
    @scala.inline
    def Log_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Log")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def Logic(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Logic")().asInstanceOf[Unit]
    
    @scala.inline
    def Loop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Loop")().asInstanceOf[Unit]
    
    @scala.inline
    def MakeTiered(upgrade: typings.cookieclicker.Game.Upgrade, tier: String, col: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("MakeTiered")(upgrade.asInstanceOf[js.Any], tier.asInstanceOf[js.Any], col.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def MakeTiered(upgrade: typings.cookieclicker.Game.Upgrade, tier: Double, col: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("MakeTiered")(upgrade.asInstanceOf[js.Any], tier.asInstanceOf[js.Any], col.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def MaxSpecials(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("MaxSpecials")().asInstanceOf[Unit]
    
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
    
    @scala.inline
    def Mobile_(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Mobile")().asInstanceOf[Unit]
    
    @JSGlobal("Game.Mods")
    @js.native
    def Mods: Record[String, Mod] = js.native
    @scala.inline
    def Mods_=(x: Record[String, Mod]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Mods")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def NewUpgradeCookie(obj: CookieUpgradeParameter): CookieUpgrade = ^.asInstanceOf[js.Dynamic].applyDynamic("NewUpgradeCookie")(obj.asInstanceOf[js.Any]).asInstanceOf[CookieUpgrade]
    
    @JSGlobal("Game.Note")
    @js.native
    class Note protected ()
      extends StObject
         with typings.cookieclicker.Game.Note {
      def this(title: String) = this()
      def this(title: String, desc: String) = this()
      def this(title: String, desc: String, pic: Icon) = this()
      def this(title: String, desc: Unit, pic: Icon) = this()
      def this(title: String, desc: String, pic: Unit, quick: Double) = this()
      def this(title: String, desc: String, pic: Icon, quick: Double) = this()
      def this(title: String, desc: Unit, pic: Unit, quick: Double) = this()
      def this(title: String, desc: Unit, pic: Icon, quick: Double) = this()
      
      /* CompleteClass */
      var date: Double = js.native
      
      /* CompleteClass */
      var desc: String = js.native
      
      /* CompleteClass */
      var height: Double = js.native
      
      /* CompleteClass */
      var id: Double = js.native
      
      /* CompleteClass */
      var l: HTMLDivElement | PseudoNull = js.native
      
      /* CompleteClass */
      var life: Double = js.native
      
      /* CompleteClass */
      var pic: Icon | _empty = js.native
      
      /* CompleteClass */
      var quick: Double = js.native
      
      /* CompleteClass */
      var title: String = js.native
    }
    
    @JSGlobal("Game.Notes")
    @js.native
    def Notes: js.Array[typings.cookieclicker.Game.Note] = js.native
    
    @JSGlobal("Game.NotesById")
    @js.native
    def NotesById: js.Array[typings.cookieclicker.Game.Note] = js.native
    @scala.inline
    def NotesById_=(x: js.Array[typings.cookieclicker.Game.Note]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NotesById")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def NotesDraw(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("NotesDraw")().asInstanceOf[Unit]
    
    @scala.inline
    def NotesLogic(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("NotesLogic")().asInstanceOf[Unit]
    
    @scala.inline
    def Notes_=(x: js.Array[typings.cookieclicker.Game.Note]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Notes")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def Notify(title: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Notify")(title.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def Notify(title: String, desc: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Notify")(title.asInstanceOf[js.Any], desc.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def Notify(title: String, desc: String, pic: Unit, quick: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Notify")(title.asInstanceOf[js.Any], desc.asInstanceOf[js.Any], pic.asInstanceOf[js.Any], quick.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def Notify(title: String, desc: String, pic: Unit, quick: Double, noLog: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Notify")(title.asInstanceOf[js.Any], desc.asInstanceOf[js.Any], pic.asInstanceOf[js.Any], quick.asInstanceOf[js.Any], noLog.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def Notify(title: String, desc: String, pic: Unit, quick: Unit, noLog: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Notify")(title.asInstanceOf[js.Any], desc.asInstanceOf[js.Any], pic.asInstanceOf[js.Any], quick.asInstanceOf[js.Any], noLog.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def Notify(title: String, desc: String, pic: Icon): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Notify")(title.asInstanceOf[js.Any], desc.asInstanceOf[js.Any], pic.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def Notify(title: String, desc: String, pic: Icon, quick: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Notify")(title.asInstanceOf[js.Any], desc.asInstanceOf[js.Any], pic.asInstanceOf[js.Any], quick.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def Notify(title: String, desc: String, pic: Icon, quick: Double, noLog: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Notify")(title.asInstanceOf[js.Any], desc.asInstanceOf[js.Any], pic.asInstanceOf[js.Any], quick.asInstanceOf[js.Any], noLog.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def Notify(title: String, desc: String, pic: Icon, quick: Unit, noLog: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Notify")(title.asInstanceOf[js.Any], desc.asInstanceOf[js.Any], pic.asInstanceOf[js.Any], quick.asInstanceOf[js.Any], noLog.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def Notify(title: String, desc: Unit, pic: Unit, quick: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Notify")(title.asInstanceOf[js.Any], desc.asInstanceOf[js.Any], pic.asInstanceOf[js.Any], quick.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def Notify(title: String, desc: Unit, pic: Unit, quick: Double, noLog: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Notify")(title.asInstanceOf[js.Any], desc.asInstanceOf[js.Any], pic.asInstanceOf[js.Any], quick.asInstanceOf[js.Any], noLog.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def Notify(title: String, desc: Unit, pic: Unit, quick: Unit, noLog: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Notify")(title.asInstanceOf[js.Any], desc.asInstanceOf[js.Any], pic.asInstanceOf[js.Any], quick.asInstanceOf[js.Any], noLog.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def Notify(title: String, desc: Unit, pic: Icon): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Notify")(title.asInstanceOf[js.Any], desc.asInstanceOf[js.Any], pic.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def Notify(title: String, desc: Unit, pic: Icon, quick: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Notify")(title.asInstanceOf[js.Any], desc.asInstanceOf[js.Any], pic.asInstanceOf[js.Any], quick.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def Notify(title: String, desc: Unit, pic: Icon, quick: Double, noLog: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Notify")(title.asInstanceOf[js.Any], desc.asInstanceOf[js.Any], pic.asInstanceOf[js.Any], quick.asInstanceOf[js.Any], noLog.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def Notify(title: String, desc: Unit, pic: Icon, quick: Unit, noLog: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Notify")(title.asInstanceOf[js.Any], desc.asInstanceOf[js.Any], pic.asInstanceOf[js.Any], quick.asInstanceOf[js.Any], noLog.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSGlobal("Game.Objects")
    @js.native
    def Objects: (Record[String, typings.cookieclicker.Game.GameObject]) & Bank = js.native
    
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
    def Objects_=(x: (Record[String, typings.cookieclicker.Game.GameObject]) & Bank): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Objects")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.OnAscend")
    @js.native
    def OnAscend: Double = js.native
    @scala.inline
    def OnAscend_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OnAscend")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def OpenSesame(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("OpenSesame")().asInstanceOf[Unit]
    
    @scala.inline
    def PermanentSlotIcon(slot: Double): Icon = ^.asInstanceOf[js.Dynamic].applyDynamic("PermanentSlotIcon")(slot.asInstanceOf[js.Any]).asInstanceOf[Icon]
    
    @scala.inline
    def PickAscensionMode(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("PickAscensionMode")().asInstanceOf[Unit]
    
    @scala.inline
    def PopRandomWrinkler(): Wrinkler | Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("PopRandomWrinkler")().asInstanceOf[Wrinkler | Boolean]
    
    @scala.inline
    def Popup(text: String, x: Double, y: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Popup")(text.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSGlobal("Game.PrestigeUpgrades")
    @js.native
    def PrestigeUpgrades: js.Array[HeavenlyUpgrade] = js.native
    @scala.inline
    def PrestigeUpgrades_=(x: js.Array[HeavenlyUpgrade]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PrestigeUpgrades")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def ProductionAchievement(name: String, building: String, tier: Double): typings.cookieclicker.Game.Achievement = (^.asInstanceOf[js.Dynamic].applyDynamic("ProductionAchievement")(name.asInstanceOf[js.Any], building.asInstanceOf[js.Any], tier.asInstanceOf[js.Any])).asInstanceOf[typings.cookieclicker.Game.Achievement]
    @scala.inline
    def ProductionAchievement(name: String, building: String, tier: Double, q: String): typings.cookieclicker.Game.Achievement = (^.asInstanceOf[js.Dynamic].applyDynamic("ProductionAchievement")(name.asInstanceOf[js.Any], building.asInstanceOf[js.Any], tier.asInstanceOf[js.Any], q.asInstanceOf[js.Any])).asInstanceOf[typings.cookieclicker.Game.Achievement]
    @scala.inline
    def ProductionAchievement(name: String, building: String, tier: Double, q: String, mult: Double): typings.cookieclicker.Game.Achievement = (^.asInstanceOf[js.Dynamic].applyDynamic("ProductionAchievement")(name.asInstanceOf[js.Any], building.asInstanceOf[js.Any], tier.asInstanceOf[js.Any], q.asInstanceOf[js.Any], mult.asInstanceOf[js.Any])).asInstanceOf[typings.cookieclicker.Game.Achievement]
    @scala.inline
    def ProductionAchievement(name: String, building: String, tier: Double, q: Unit, mult: Double): typings.cookieclicker.Game.Achievement = (^.asInstanceOf[js.Dynamic].applyDynamic("ProductionAchievement")(name.asInstanceOf[js.Any], building.asInstanceOf[js.Any], tier.asInstanceOf[js.Any], q.asInstanceOf[js.Any], mult.asInstanceOf[js.Any])).asInstanceOf[typings.cookieclicker.Game.Achievement]
    
    @scala.inline
    def Prompt(content: String, options: js.Array[String | (js.Tuple2[String, String])]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Prompt")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def Prompt(
      content: String,
      options: js.Array[String | (js.Tuple2[String, String])],
      updateFunc: js.Function0[Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Prompt")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], updateFunc.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def Prompt(
      content: String,
      options: js.Array[String | (js.Tuple2[String, String])],
      updateFunc: js.Function0[Unit],
      style: String
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Prompt")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], updateFunc.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def Prompt(
      content: String,
      options: js.Array[String | (js.Tuple2[String, String])],
      updateFunc: Unit,
      style: String
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Prompt")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], updateFunc.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def PurchaseHeavenlyUpgrade(what: typings.cookieclicker.Game.Upgrade): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("PurchaseHeavenlyUpgrade")(what.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def PutUpgradeInPermanentSlot(upgrade: typings.cookieclicker.Game.Upgrade, slot: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("PutUpgradeInPermanentSlot")(upgrade.asInstanceOf[js.Any], slot.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def RandomBakeryName(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("RandomBakeryName")().asInstanceOf[String]
    
    @scala.inline
    def RebuildUpgrades(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("RebuildUpgrades")().asInstanceOf[Unit]
    
    @scala.inline
    def RefreshStore(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("RefreshStore")().asInstanceOf[Unit]
    
    @scala.inline
    def Reincarnate(bypass: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Reincarnate")(bypass.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
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
    
    @scala.inline
    def RemoveAchiev(what: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("RemoveAchiev")(what.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def RequiresConfirmation(upgrade: typings.cookieclicker.Game.Upgrade, prompt: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("RequiresConfirmation")(upgrade.asInstanceOf[js.Any], prompt.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def Reset(hard: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Reset")(hard.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def ResetWrinklers(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ResetWrinklers")().asInstanceOf[Unit]
    
    @scala.inline
    def Resume(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Resume")().asInstanceOf[Unit]
    
    @scala.inline
    def RuinTheFun(silent: Boolean): String = ^.asInstanceOf[js.Dynamic].applyDynamic("RuinTheFun")(silent.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSGlobal("Game.SaveTo")
    @js.native
    def SaveTo: String = js.native
    @scala.inline
    def SaveTo_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SaveTo")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def SaveWrinklers(): WrinklerSave = ^.asInstanceOf[js.Dynamic].applyDynamic("SaveWrinklers")().asInstanceOf[WrinklerSave]
    
    @JSGlobal("Game.Scroll")
    @js.native
    def Scroll: Double = js.native
    @scala.inline
    def Scroll_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Scroll")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def SelectDragonAura(slot: Double, update: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("SelectDragonAura")(slot.asInstanceOf[js.Any], update.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
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
    
    @scala.inline
    def SesameReset(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("SesameReset")().asInstanceOf[Unit]
    
    @scala.inline
    def SetAllAchievs(on: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("SetAllAchievs")(on.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def SetAllUpgrades(on: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("SetAllUpgrades")(on.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def SetDragonAura(aura: Double, slot: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("SetDragonAura")(aura.asInstanceOf[js.Any], slot.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def SetResearch(what: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("SetResearch")(what.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def SetResearch(what: String, time: scala.Nothing): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("SetResearch")(what.asInstanceOf[js.Any], time.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def SetTier(building: String, tier: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("SetTier")(building.asInstanceOf[js.Any], tier.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def SetTier(building: String, tier: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("SetTier")(building.asInstanceOf[js.Any], tier.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSGlobal("Game.Shimmer")
    @js.native
    class Shimmer[N /* <: String */, C /* <: js.Object */] protected ()
      extends StObject
         with typings.cookieclicker.Game.Shimmer[N, C] {
      /**
        * Creates a new shimmer
        * @param type The type of the shimmer, must be a key of `shimmerTypes`
        * @param obj The configuration object
        * @param noCount True if to not count the shimmer in `shimmersN`
        */
      def this(`type`: N) = this()
      def this(`type`: N, obj: C) = this()
      def this(`type`: N, obj: C, noCount: Boolean) = this()
      def this(`type`: N, obj: Unit, noCount: Boolean) = this()
      
      /* CompleteClass */
      override def die(): Unit = js.native
      
      /* CompleteClass */
      var forceObj: C = js.native
      
      /* CompleteClass */
      var id: Double = js.native
      
      /* CompleteClass */
      override def init(): Unit = js.native
      
      /* CompleteClass */
      var l: HTMLElement = js.native
      
      /* CompleteClass */
      var noCount: Boolean = js.native
      
      /* CompleteClass */
      override def pop(event: MouseEvent): Unit = js.native
      
      /* CompleteClass */
      var spawnLead: Double = js.native
      
      /* CompleteClass */
      var `type`: N = js.native
      
      /* CompleteClass */
      override def update(): Unit = js.native
      
      /* CompleteClass */
      var x: Double = js.native
      
      /* CompleteClass */
      var y: Double = js.native
    }
    
    @scala.inline
    def ShowMenu(what: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ShowMenu")(what.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def ShowPanel(what: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ShowPanel")(what.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def SparkleAt(x: Double, y: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("SparkleAt")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def SparkleOn(el: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("SparkleOn")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def SpawnWrinkler(): Wrinkler | Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("SpawnWrinkler")().asInstanceOf[Wrinkler | Boolean]
    @scala.inline
    def SpawnWrinkler(me: Wrinkler): Wrinkler | Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("SpawnWrinkler")(me.asInstanceOf[js.Any]).asInstanceOf[Wrinkler | Boolean]
    
    @JSGlobal("Game.SpecialGrandmaUnlock")
    @js.native
    def SpecialGrandmaUnlock: Double = js.native
    @scala.inline
    def SpecialGrandmaUnlock_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SpecialGrandmaUnlock")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def Spend(howmuch: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Spend")(howmuch.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def SynergyUpgrade(name: String, desc: String, building1: String, building2: String, tier: String): SynergyUpgradeClass[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("SynergyUpgrade")(name.asInstanceOf[js.Any], desc.asInstanceOf[js.Any], building1.asInstanceOf[js.Any], building2.asInstanceOf[js.Any], tier.asInstanceOf[js.Any])).asInstanceOf[SynergyUpgradeClass[String]]
    @scala.inline
    def SynergyUpgrade(name: String, desc: String, building1: String, building2: String, tier: Double): SynergyUpgradeClass[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("SynergyUpgrade")(name.asInstanceOf[js.Any], desc.asInstanceOf[js.Any], building1.asInstanceOf[js.Any], building2.asInstanceOf[js.Any], tier.asInstanceOf[js.Any])).asInstanceOf[SynergyUpgradeClass[Double]]
    
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
    
    @scala.inline
    def TickerDraw(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("TickerDraw")().asInstanceOf[Unit]
    
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
    
    @scala.inline
    def TieredAchievement(name: String, desc: String, building: String, tier: String): TieredAchievementClass[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("TieredAchievement")(name.asInstanceOf[js.Any], desc.asInstanceOf[js.Any], building.asInstanceOf[js.Any], tier.asInstanceOf[js.Any])).asInstanceOf[TieredAchievementClass[String]]
    @scala.inline
    def TieredAchievement(name: String, desc: String, building: String, tier: Double): TieredAchievementClass[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("TieredAchievement")(name.asInstanceOf[js.Any], desc.asInstanceOf[js.Any], building.asInstanceOf[js.Any], tier.asInstanceOf[js.Any])).asInstanceOf[TieredAchievementClass[Double]]
    
    @scala.inline
    def TieredUpgrade(name: String, desc: String, building: String, tier: String): TieredUpgradeClass[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("TieredUpgrade")(name.asInstanceOf[js.Any], desc.asInstanceOf[js.Any], building.asInstanceOf[js.Any], tier.asInstanceOf[js.Any])).asInstanceOf[TieredUpgradeClass[String]]
    @scala.inline
    def TieredUpgrade(name: String, desc: String, building: String, tier: Double): TieredUpgradeClass[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("TieredUpgrade")(name.asInstanceOf[js.Any], desc.asInstanceOf[js.Any], building.asInstanceOf[js.Any], tier.asInstanceOf[js.Any])).asInstanceOf[TieredUpgradeClass[Double]]
    
    @JSGlobal("Game.Tiers")
    @js.native
    def Tiers: Record[String, Tier] = js.native
    @scala.inline
    def Tiers_=(x: Record[String, Tier]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Tiers")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def Timeout(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Timeout")().asInstanceOf[Unit]
    
    @scala.inline
    def ToggleExtraButtons(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ToggleExtraButtons")().asInstanceOf[Unit]
    
    @scala.inline
    def ToggleFancy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ToggleFancy")().asInstanceOf[Unit]
    
    @scala.inline
    def ToggleFilters(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ToggleFilters")().asInstanceOf[Unit]
    
    @scala.inline
    def ToggleSpecialMenu(on: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ToggleSpecialMenu")(on.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def Toggle_altDraw(prefName: altDraw, button: String, on: String, off: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Toggle")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def Toggle_altDraw(prefName: altDraw, button: String, on: String, off: String, invert: PseudoBoolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Toggle")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any], invert.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def Toggle_animate(prefName: animate, button: String, on: String, off: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Toggle")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def Toggle_animate(prefName: animate, button: String, on: String, off: String, invert: PseudoBoolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Toggle")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any], invert.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def Toggle_askLumps(prefName: askLumps, button: String, on: String, off: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Toggle")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def Toggle_askLumps(prefName: askLumps, button: String, on: String, off: String, invert: PseudoBoolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Toggle")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any], invert.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def Toggle_autosave(prefName: autosave, button: String, on: String, off: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Toggle")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def Toggle_autosave(prefName: autosave, button: String, on: String, off: String, invert: PseudoBoolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Toggle")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any], invert.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def Toggle_autoupdate(prefName: autoupdate, button: String, on: String, off: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Toggle")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def Toggle_autoupdate(prefName: autoupdate, button: String, on: String, off: String, invert: PseudoBoolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Toggle")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any], invert.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def Toggle_cursors(prefName: cursors, button: String, on: String, off: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Toggle")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def Toggle_cursors(prefName: cursors, button: String, on: String, off: String, invert: PseudoBoolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Toggle")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any], invert.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def Toggle_customGrandmas(prefName: customGrandmas, button: String, on: String, off: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Toggle")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def Toggle_customGrandmas(prefName: customGrandmas, button: String, on: String, off: String, invert: PseudoBoolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Toggle")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any], invert.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def Toggle_extraButtons(prefName: extraButtons, button: String, on: String, off: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Toggle")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def Toggle_extraButtons(prefName: extraButtons, button: String, on: String, off: String, invert: PseudoBoolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Toggle")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any], invert.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def Toggle_fancy(prefName: fancy, button: String, on: String, off: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Toggle")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def Toggle_fancy(prefName: fancy, button: String, on: String, off: String, invert: PseudoBoolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Toggle")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any], invert.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def Toggle_filters(prefName: filters, button: String, on: String, off: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Toggle")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def Toggle_filters(prefName: filters, button: String, on: String, off: String, invert: PseudoBoolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Toggle")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any], invert.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def Toggle_focus(prefName: focus, button: String, on: String, off: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Toggle")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def Toggle_focus(prefName: focus, button: String, on: String, off: String, invert: PseudoBoolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Toggle")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any], invert.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def Toggle_format(prefName: format, button: String, on: String, off: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Toggle")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def Toggle_format(prefName: format, button: String, on: String, off: String, invert: PseudoBoolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Toggle")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any], invert.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def Toggle_milk(prefName: milk, button: String, on: String, off: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Toggle")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def Toggle_milk(prefName: milk, button: String, on: String, off: String, invert: PseudoBoolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Toggle")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any], invert.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def Toggle_monospace(prefName: monospace, button: String, on: String, off: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Toggle")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def Toggle_monospace(prefName: monospace, button: String, on: String, off: String, invert: PseudoBoolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Toggle")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any], invert.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def Toggle_notifs(prefName: notifs, button: String, on: String, off: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Toggle")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def Toggle_notifs(prefName: notifs, button: String, on: String, off: String, invert: PseudoBoolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Toggle")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any], invert.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def Toggle_numbers(prefName: numbers, button: String, on: String, off: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Toggle")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def Toggle_numbers(prefName: numbers, button: String, on: String, off: String, invert: PseudoBoolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Toggle")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any], invert.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def Toggle_particles(prefName: particles, button: String, on: String, off: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Toggle")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def Toggle_particles(prefName: particles, button: String, on: String, off: String, invert: PseudoBoolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Toggle")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any], invert.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def Toggle_popups(prefName: popups, button: String, on: String, off: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Toggle")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def Toggle_popups(prefName: popups, button: String, on: String, off: String, invert: PseudoBoolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Toggle")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any], invert.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def Toggle_showBackupWarning(prefName: showBackupWarning, button: String, on: String, off: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Toggle")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def Toggle_showBackupWarning(prefName: showBackupWarning, button: String, on: String, off: String, invert: PseudoBoolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Toggle")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any], invert.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def Toggle_timeout(prefName: timeout, button: String, on: String, off: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Toggle")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def Toggle_timeout(prefName: timeout, button: String, on: String, off: String, invert: PseudoBoolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Toggle")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any], invert.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def Toggle_warn(prefName: warn, button: String, on: String, off: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Toggle")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def Toggle_warn(prefName: warn, button: String, on: String, off: String, invert: PseudoBoolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Toggle")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any], invert.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def Toggle_wobbly(prefName: wobbly, button: String, on: String, off: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Toggle")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def Toggle_wobbly(prefName: wobbly, button: String, on: String, off: String, invert: PseudoBoolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("Toggle")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any], invert.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def Unlock(what: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Unlock")(what.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def Unlock(what: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Unlock")(what.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSGlobal("Game.UnlockAt")
    @js.native
    def UnlockAt: js.Array[UnlockRequirement] = js.native
    @scala.inline
    def UnlockAt_=(x: js.Array[UnlockRequirement]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UnlockAt")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def UnlockTiered(me: typings.cookieclicker.Game.Upgrade): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("UnlockTiered")(me.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def UpdateAscend(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("UpdateAscend")().asInstanceOf[Unit]
    
    @scala.inline
    def UpdateAscendIntro(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("UpdateAscendIntro")().asInstanceOf[Unit]
    
    @scala.inline
    def UpdateAscensionModePrompt(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("UpdateAscensionModePrompt")().asInstanceOf[Unit]
    
    @scala.inline
    def UpdateGrandmapocalypse(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("UpdateGrandmapocalypse")().asInstanceOf[Unit]
    
    @scala.inline
    def UpdateLegacyPrompt(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("UpdateLegacyPrompt")().asInstanceOf[Unit]
    
    @scala.inline
    def UpdateMenu(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("UpdateMenu")().asInstanceOf[Unit]
    
    @scala.inline
    def UpdateNotes(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("UpdateNotes")().asInstanceOf[Unit]
    
    @scala.inline
    def UpdatePrompt(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("UpdatePrompt")().asInstanceOf[Unit]
    
    @scala.inline
    def UpdateReincarnateIntro(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("UpdateReincarnateIntro")().asInstanceOf[Unit]
    
    @scala.inline
    def UpdateSpecial(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("UpdateSpecial")().asInstanceOf[Unit]
    
    @scala.inline
    def UpdateTicker(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("UpdateTicker")().asInstanceOf[Unit]
    
    @scala.inline
    def UpdateWrinklers(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("UpdateWrinklers")().asInstanceOf[Unit]
    
    @JSGlobal("Game.Upgrade")
    @js.native
    class Upgrade protected ()
      extends StObject
         with typings.cookieclicker.Game.Upgrade {
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
    
    @scala.inline
    def UpgradeDragon(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("UpgradeDragon")().asInstanceOf[Unit]
    
    @JSGlobal("Game.UpgradePositions")
    @js.native
    def UpgradePositions: js.Object = js.native
    @scala.inline
    def UpgradePositions_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UpgradePositions")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def UpgradeSanta(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("UpgradeSanta")().asInstanceOf[Unit]
    
    @JSGlobal("Game.Upgrades")
    @js.native
    def Upgrades: js.Array[Unit] & (Record[String, typings.cookieclicker.Game.Upgrade]) = js.native
    
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
    def Upgrades_=(x: js.Array[Unit] & (Record[String, typings.cookieclicker.Game.Upgrade])): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Upgrades")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def Win(what: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Win")(what.asInstanceOf[js.Any]).asInstanceOf[Unit]
    @scala.inline
    def Win(what: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("Win")(what.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def WriteButton_altDraw(prefName: altDraw, button: String, on: String, off: String, callback: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("WriteButton")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def WriteButton_altDraw(
      prefName: altDraw,
      button: String,
      on: String,
      off: String,
      callback: String,
      invert: PseudoBoolean
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("WriteButton")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], invert.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def WriteButton_animate(prefName: animate, button: String, on: String, off: String, callback: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("WriteButton")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def WriteButton_animate(
      prefName: animate,
      button: String,
      on: String,
      off: String,
      callback: String,
      invert: PseudoBoolean
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("WriteButton")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], invert.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def WriteButton_askLumps(prefName: askLumps, button: String, on: String, off: String, callback: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("WriteButton")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def WriteButton_askLumps(
      prefName: askLumps,
      button: String,
      on: String,
      off: String,
      callback: String,
      invert: PseudoBoolean
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("WriteButton")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], invert.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def WriteButton_autosave(prefName: autosave, button: String, on: String, off: String, callback: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("WriteButton")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def WriteButton_autosave(
      prefName: autosave,
      button: String,
      on: String,
      off: String,
      callback: String,
      invert: PseudoBoolean
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("WriteButton")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], invert.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def WriteButton_autoupdate(prefName: autoupdate, button: String, on: String, off: String, callback: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("WriteButton")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def WriteButton_autoupdate(
      prefName: autoupdate,
      button: String,
      on: String,
      off: String,
      callback: String,
      invert: PseudoBoolean
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("WriteButton")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], invert.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def WriteButton_cursors(prefName: cursors, button: String, on: String, off: String, callback: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("WriteButton")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def WriteButton_cursors(
      prefName: cursors,
      button: String,
      on: String,
      off: String,
      callback: String,
      invert: PseudoBoolean
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("WriteButton")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], invert.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def WriteButton_customGrandmas(prefName: customGrandmas, button: String, on: String, off: String, callback: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("WriteButton")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def WriteButton_customGrandmas(
      prefName: customGrandmas,
      button: String,
      on: String,
      off: String,
      callback: String,
      invert: PseudoBoolean
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("WriteButton")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], invert.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def WriteButton_extraButtons(prefName: extraButtons, button: String, on: String, off: String, callback: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("WriteButton")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def WriteButton_extraButtons(
      prefName: extraButtons,
      button: String,
      on: String,
      off: String,
      callback: String,
      invert: PseudoBoolean
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("WriteButton")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], invert.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def WriteButton_fancy(prefName: fancy, button: String, on: String, off: String, callback: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("WriteButton")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def WriteButton_fancy(prefName: fancy, button: String, on: String, off: String, callback: String, invert: PseudoBoolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("WriteButton")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], invert.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def WriteButton_filters(prefName: filters, button: String, on: String, off: String, callback: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("WriteButton")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def WriteButton_filters(
      prefName: filters,
      button: String,
      on: String,
      off: String,
      callback: String,
      invert: PseudoBoolean
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("WriteButton")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], invert.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def WriteButton_focus(prefName: focus, button: String, on: String, off: String, callback: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("WriteButton")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def WriteButton_focus(prefName: focus, button: String, on: String, off: String, callback: String, invert: PseudoBoolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("WriteButton")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], invert.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def WriteButton_format(prefName: format, button: String, on: String, off: String, callback: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("WriteButton")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def WriteButton_format(prefName: format, button: String, on: String, off: String, callback: String, invert: PseudoBoolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("WriteButton")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], invert.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def WriteButton_milk(prefName: milk, button: String, on: String, off: String, callback: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("WriteButton")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def WriteButton_milk(prefName: milk, button: String, on: String, off: String, callback: String, invert: PseudoBoolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("WriteButton")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], invert.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def WriteButton_monospace(prefName: monospace, button: String, on: String, off: String, callback: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("WriteButton")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def WriteButton_monospace(
      prefName: monospace,
      button: String,
      on: String,
      off: String,
      callback: String,
      invert: PseudoBoolean
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("WriteButton")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], invert.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def WriteButton_notifs(prefName: notifs, button: String, on: String, off: String, callback: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("WriteButton")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def WriteButton_notifs(prefName: notifs, button: String, on: String, off: String, callback: String, invert: PseudoBoolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("WriteButton")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], invert.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def WriteButton_numbers(prefName: numbers, button: String, on: String, off: String, callback: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("WriteButton")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def WriteButton_numbers(
      prefName: numbers,
      button: String,
      on: String,
      off: String,
      callback: String,
      invert: PseudoBoolean
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("WriteButton")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], invert.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def WriteButton_particles(prefName: particles, button: String, on: String, off: String, callback: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("WriteButton")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def WriteButton_particles(
      prefName: particles,
      button: String,
      on: String,
      off: String,
      callback: String,
      invert: PseudoBoolean
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("WriteButton")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], invert.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def WriteButton_popups(prefName: popups, button: String, on: String, off: String, callback: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("WriteButton")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def WriteButton_popups(prefName: popups, button: String, on: String, off: String, callback: String, invert: PseudoBoolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("WriteButton")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], invert.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def WriteButton_showBackupWarning(prefName: showBackupWarning, button: String, on: String, off: String, callback: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("WriteButton")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def WriteButton_showBackupWarning(
      prefName: showBackupWarning,
      button: String,
      on: String,
      off: String,
      callback: String,
      invert: PseudoBoolean
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("WriteButton")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], invert.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def WriteButton_timeout(prefName: timeout, button: String, on: String, off: String, callback: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("WriteButton")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def WriteButton_timeout(
      prefName: timeout,
      button: String,
      on: String,
      off: String,
      callback: String,
      invert: PseudoBoolean
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("WriteButton")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], invert.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def WriteButton_warn(prefName: warn, button: String, on: String, off: String, callback: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("WriteButton")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def WriteButton_warn(prefName: warn, button: String, on: String, off: String, callback: String, invert: PseudoBoolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("WriteButton")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], invert.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def WriteButton_wobbly(prefName: wobbly, button: String, on: String, off: String, callback: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("WriteButton")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def WriteButton_wobbly(prefName: wobbly, button: String, on: String, off: String, callback: String, invert: PseudoBoolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("WriteButton")(prefName.asInstanceOf[js.Any], button.asInstanceOf[js.Any], on.asInstanceOf[js.Any], off.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], invert.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def WriteSave(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("WriteSave")().asInstanceOf[String]
    @scala.inline
    def WriteSave(`type`: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("WriteSave")(`type`.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def WriteSlider(
      slider: String,
      leftText: String,
      rightText: String,
      startValueFunction: js.Function0[Double],
      callback: String
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("WriteSlider")(slider.asInstanceOf[js.Any], leftText.asInstanceOf[js.Any], rightText.asInstanceOf[js.Any], startValueFunction.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSGlobal("Game.accumulatedDelay")
    @js.native
    def accumulatedDelay: Double = js.native
    @scala.inline
    def accumulatedDelay_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accumulatedDelay")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def addClass(what: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addClass")(what.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
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
    
    @scala.inline
    def attachTooltip(el: HTMLElement, func: String, origin: TooltipOrigins): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("attachTooltip")(el.asInstanceOf[js.Any], func.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def attachTooltip(el: HTMLElement, func: js.Function0[String], origin: TooltipOrigins): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("attachTooltip")(el.asInstanceOf[js.Any], func.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def auraMult(what: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("auraMult")(what.asInstanceOf[js.Any]).asInstanceOf[Double]
    
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
    
    @scala.inline
    def bakeryNamePrompt(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("bakeryNamePrompt")().asInstanceOf[Unit]
    
    @scala.inline
    def bakeryNamePromptRandom(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("bakeryNamePromptRandom")().asInstanceOf[String]
    
    @scala.inline
    def bakeryNameRefresh(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("bakeryNameRefresh")().asInstanceOf[Unit]
    
    @scala.inline
    def bakeryNameSet(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("bakeryNameSet")().asInstanceOf[Unit]
    
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
      extends StObject
         with typings.cookieclicker.Game.buffType {
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
    def buffTypesByName: js.Array[Unit] & (Record[String, typings.cookieclicker.Game.buffType]) = js.native
    @scala.inline
    def buffTypesByName_=(x: js.Array[Unit] & (Record[String, typings.cookieclicker.Game.buffType])): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("buffTypesByName")(x.asInstanceOf[js.Any])
    
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
    
    @scala.inline
    def canLumps(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canLumps")().asInstanceOf[Boolean]
    
    @scala.inline
    def canRefillLump(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canRefillLump")().asInstanceOf[Boolean]
    
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
    
    @scala.inline
    def clickLump(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clickLump")().asInstanceOf[Unit]
    
    @JSGlobal("Game.clickStr")
    @js.native
    def clickStr: String = js.native
    @scala.inline
    def clickStr_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clickStr")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def computeLumpTimes(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("computeLumpTimes")().asInstanceOf[Unit]
    
    @scala.inline
    def computeLumpType(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("computeLumpType")().asInstanceOf[Boolean]
    
    @scala.inline
    def computeSeasonPrices(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("computeSeasonPrices")().asInstanceOf[Double]
    
    @scala.inline
    def computeSeasons(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("computeSeasons")().asInstanceOf[Unit]
    
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
    
    @scala.inline
    def costDetails(cost: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("costDetails")(cost.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSGlobal("Game.cpsSucked")
    @js.native
    def cpsSucked: Double = js.native
    @scala.inline
    def cpsSucked_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cpsSucked")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def crate(me: typings.cookieclicker.Game.Achievement, context: Unit, forceClickStr: String, id: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crate")(me.asInstanceOf[js.Any], context.asInstanceOf[js.Any], forceClickStr.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def crate(me: typings.cookieclicker.Game.Upgrade, context: Unit, forceClickStr: String, id: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crate")(me.asInstanceOf[js.Any], context.asInstanceOf[js.Any], forceClickStr.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def crateTooltip(me: typings.cookieclicker.Game.Achievement): String = ^.asInstanceOf[js.Dynamic].applyDynamic("crateTooltip")(me.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def crateTooltip(me: typings.cookieclicker.Game.Upgrade): String = ^.asInstanceOf[js.Dynamic].applyDynamic("crateTooltip")(me.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def crateTooltip_ascend(me: typings.cookieclicker.Game.Achievement, context: ascend): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crateTooltip")(me.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def crateTooltip_ascend(me: typings.cookieclicker.Game.Upgrade, context: ascend): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crateTooltip")(me.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def crateTooltip_stats(me: typings.cookieclicker.Game.Achievement, context: stats): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crateTooltip")(me.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def crateTooltip_stats(me: typings.cookieclicker.Game.Upgrade, context: stats): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crateTooltip")(me.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def crateTooltip_store(me: typings.cookieclicker.Game.Achievement, context: store): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crateTooltip")(me.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def crateTooltip_store(me: typings.cookieclicker.Game.Upgrade, context: store): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crateTooltip")(me.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def crate_ascend(me: typings.cookieclicker.Game.Achievement, context: ascend, forceClickStr: String, id: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crate")(me.asInstanceOf[js.Any], context.asInstanceOf[js.Any], forceClickStr.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def crate_ascend(me: typings.cookieclicker.Game.Upgrade, context: ascend, forceClickStr: String, id: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crate")(me.asInstanceOf[js.Any], context.asInstanceOf[js.Any], forceClickStr.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def crate_stats(me: typings.cookieclicker.Game.Achievement, context: stats, forceClickStr: String, id: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crate")(me.asInstanceOf[js.Any], context.asInstanceOf[js.Any], forceClickStr.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def crate_stats(me: typings.cookieclicker.Game.Upgrade, context: stats, forceClickStr: String, id: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crate")(me.asInstanceOf[js.Any], context.asInstanceOf[js.Any], forceClickStr.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def crate_store(me: typings.cookieclicker.Game.Achievement, context: store, forceClickStr: String, id: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crate")(me.asInstanceOf[js.Any], context.asInstanceOf[js.Any], forceClickStr.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def crate_store(me: typings.cookieclicker.Game.Upgrade, context: store, forceClickStr: String, id: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("crate")(me.asInstanceOf[js.Any], context.asInstanceOf[js.Any], forceClickStr.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[String]
    
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
    
    @scala.inline
    def doLumps(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("doLumps")().asInstanceOf[Unit]
    
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
    
    @scala.inline
    def dropRateMult(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("dropRateMult")().asInstanceOf[Double]
    
    @JSGlobal("Game.easterEggs")
    @js.native
    def easterEggs: js.Array[String] = js.native
    @scala.inline
    def easterEggs_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("easterEggs")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def eff(name: String, `def`: String): Effects = (^.asInstanceOf[js.Dynamic].applyDynamic("eff")(name.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[Effects]
    
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
    
    @scala.inline
    def gainBuff(`type`: String, time: Double, arg1: Double, arg2: Double, arg3: Double): Buff = (^.asInstanceOf[js.Dynamic].applyDynamic("gainBuff")(`type`.asInstanceOf[js.Any], time.asInstanceOf[js.Any], arg1.asInstanceOf[js.Any], arg2.asInstanceOf[js.Any], arg3.asInstanceOf[js.Any])).asInstanceOf[Buff]
    
    @scala.inline
    def gainLumps(total: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("gainLumps")(total.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSGlobal("Game.gainedPrestige")
    @js.native
    def gainedPrestige: Double = js.native
    @scala.inline
    def gainedPrestige_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gainedPrestige")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def getDynamicTooltip(func: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDynamicTooltip")(func.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def getDynamicTooltip(func: String, origin: Unit, isCrate: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getDynamicTooltip")(func.asInstanceOf[js.Any], origin.asInstanceOf[js.Any], isCrate.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def getDynamicTooltip(func: String, origin: Unit, isCrate: PseudoBoolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getDynamicTooltip")(func.asInstanceOf[js.Any], origin.asInstanceOf[js.Any], isCrate.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def getDynamicTooltip(func: String, origin: TooltipOrigins): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getDynamicTooltip")(func.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def getDynamicTooltip(func: String, origin: TooltipOrigins, isCrate: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getDynamicTooltip")(func.asInstanceOf[js.Any], origin.asInstanceOf[js.Any], isCrate.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def getDynamicTooltip(func: String, origin: TooltipOrigins, isCrate: PseudoBoolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getDynamicTooltip")(func.asInstanceOf[js.Any], origin.asInstanceOf[js.Any], isCrate.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def getFps(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getFps")().asInstanceOf[Double]
    
    @scala.inline
    def getLumpRefillMax(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getLumpRefillMax")().asInstanceOf[Double]
    
    @scala.inline
    def getLumpRefillRemaining(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getLumpRefillRemaining")().asInstanceOf[Double]
    
    @scala.inline
    def getNewTicker(manual: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getNewTicker")(manual.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def getPledgeDuration(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getPledgeDuration")().asInstanceOf[Double]
    
    @scala.inline
    def getSeasonDuration(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getSeasonDuration")().asInstanceOf[Double]
    
    @scala.inline
    def getTooltip(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTooltip")(text.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def getTooltip(text: String, origin: Unit, isCrate: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getTooltip")(text.asInstanceOf[js.Any], origin.asInstanceOf[js.Any], isCrate.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def getTooltip(text: String, origin: Unit, isCrate: PseudoBoolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getTooltip")(text.asInstanceOf[js.Any], origin.asInstanceOf[js.Any], isCrate.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def getTooltip(text: String, origin: TooltipOrigins): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getTooltip")(text.asInstanceOf[js.Any], origin.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def getTooltip(text: String, origin: TooltipOrigins, isCrate: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getTooltip")(text.asInstanceOf[js.Any], origin.asInstanceOf[js.Any], isCrate.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def getTooltip(text: String, origin: TooltipOrigins, isCrate: PseudoBoolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getTooltip")(text.asInstanceOf[js.Any], origin.asInstanceOf[js.Any], isCrate.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def getWrinklersMax(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getWrinklersMax")().asInstanceOf[Double]
    
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
    
    @scala.inline
    def handleScroll(e: MouseEvent): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("handleScroll")(e.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSGlobal("Game.handmadeCookies")
    @js.native
    def handmadeCookies: Double = js.native
    @scala.inline
    def handmadeCookies_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handmadeCookies")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def harvestLumps(amount: Double, silent: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("harvestLumps")(amount.asInstanceOf[js.Any], silent.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def hasAura(what: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasAura")(what.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @scala.inline
    def hasBuff(what: String): Double | Buff = ^.asInstanceOf[js.Dynamic].applyDynamic("hasBuff")(what.asInstanceOf[js.Any]).asInstanceOf[Double | Buff]
    
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
    
    @scala.inline
    def isMinigameReady(me: typings.cookieclicker.Game.GameObject): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("isMinigameReady")(me.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSGlobal("Game.keys")
    @js.native
    def keys: js.Array[Double] = js.native
    @scala.inline
    def keys_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("keys")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def killBuff(what: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("killBuff")(what.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def killBuffs(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("killBuffs")().asInstanceOf[Unit]
    
    @scala.inline
    def killShimmers(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("killShimmers")().asInstanceOf[Unit]
    
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
    
    @scala.inline
    def listTinyOwnedUpgrades(arr: js.Array[typings.cookieclicker.Game.Upgrade]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("listTinyOwnedUpgrades")(arr.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def loadLumps(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loadLumps")().asInstanceOf[Unit]
    @scala.inline
    def loadLumps(time: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loadLumps")(time.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def localStorageGet(key: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("localStorageGet")(key.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def localStorageSet(key: String, str: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("localStorageSet")(key.asInstanceOf[js.Any], str.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSGlobal("Game.loopT")
    @js.native
    def loopT: Double = js.native
    @scala.inline
    def loopT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("loopT")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def loseShimmeringVeil(context: String): Unit | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("loseShimmeringVeil")(context.asInstanceOf[js.Any]).asInstanceOf[Unit | `false`]
    
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
    
    @scala.inline
    def lumpTooltip(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("lumpTooltip")().asInstanceOf[String]
    
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
    
    @scala.inline
    def magicCpS(what: js.Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("magicCpS")(what.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @scala.inline
    def makeSeed(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("makeSeed")().asInstanceOf[String]
    
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
    
    @scala.inline
    def modifyBuildingPrice(building: String, price: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("modifyBuildingPrice")(building.asInstanceOf[js.Any], price.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @scala.inline
    def mouseCps(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("mouseCps")().asInstanceOf[Double]
    
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
    
    @scala.inline
    def mutedBuildingTooltip(id: Double): js.Function0[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("mutedBuildingTooltip")(id.asInstanceOf[js.Any]).asInstanceOf[js.Function0[String]]
    
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
    
    @scala.inline
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
    ): Particle | js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("particleAdd")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], xd.asInstanceOf[js.Any], yd.asInstanceOf[js.Any], size.asInstanceOf[js.Any], dur.asInstanceOf[js.Any], z.asInstanceOf[js.Any], pic.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[Particle | js.Object]
    
    @JSGlobal("Game.particles")
    @js.native
    def particles: js.Array[Particle] = js.native
    
    @scala.inline
    def particlesDraw(z: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("particlesDraw")(z.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def particlesUpdate(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("particlesUpdate")().asInstanceOf[Unit]
    
    @scala.inline
    def particles_=(x: js.Array[Particle]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("particles")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.permanentUpgrades")
    @js.native
    def permanentUpgrades: js.Array[Double] = js.native
    @scala.inline
    def permanentUpgrades_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("permanentUpgrades")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def playCookieClickSound(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("playCookieClickSound")().asInstanceOf[Unit]
    
    @scala.inline
    def playWrinklerSquishSound(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("playWrinklerSquishSound")().asInstanceOf[Unit]
    
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
    def prefs: js.Array[Unit] & Prefs = js.native
    @scala.inline
    def prefs_=(x: js.Array[Unit] & Prefs): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefs")(x.asInstanceOf[js.Any])
    
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
    
    @scala.inline
    def refillLump(n: Double, func: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("refillLump")(n.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def registerHook(hook: String, func: js.Array[js.Function0[Unit]]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerHook")(hook.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def registerHook(hook: String, func: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerHook")(hook.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def registerHook_cookiesPerClick(hook: cookiesPerClick, func: js.Array[js.Function0[Double]]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerHook")(hook.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def registerHook_cookiesPerClick(hook: cookiesPerClick, func: js.Function0[Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerHook")(hook.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def registerHook_cps(hook: cps, func: js.Array[js.Function0[Double]]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerHook")(hook.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def registerHook_cps(hook: cps, func: js.Function0[Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerHook")(hook.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def registerHook_ticker(hook: ticker, func: js.Array[js.Function0[js.Array[String]]]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerHook")(hook.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def registerHook_ticker(hook: ticker, func: js.Function0[js.Array[String]]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerHook")(hook.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def registerMod(id: String, obj: Mod): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerMod")(id.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
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
    
    @scala.inline
    def removeClass(what: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeClass")(what.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
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
    
    @scala.inline
    def salvageSave(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("salvageSave")().asInstanceOf[Unit]
    
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
    
    @scala.inline
    def saySeasonSwitchUses(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("saySeasonSwitchUses")().asInstanceOf[String]
    
    @scala.inline
    def sayTime_1(time: Double, detail: `-1`): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sayTime")(time.asInstanceOf[js.Any], detail.asInstanceOf[js.Any])).asInstanceOf[String]
    @scala.inline
    def sayTime_1(time: Double, detail: `1`): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sayTime")(time.asInstanceOf[js.Any], detail.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def sayTime_2(time: Double, detail: `2`): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sayTime")(time.asInstanceOf[js.Any], detail.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def sayTime_3(time: Double, detail: `3`): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sayTime")(time.asInstanceOf[js.Any], detail.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def sayTime_4(time: Double, detail: `4`): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sayTime")(time.asInstanceOf[js.Any], detail.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSGlobal("Game.scriptBindings")
    @js.native
    def scriptBindings: js.Array[Unit] & (Record[String, typings.cookieclicker.Game.GameObject]) = js.native
    @scala.inline
    def scriptBindings_=(x: js.Array[Unit] & (Record[String, typings.cookieclicker.Game.GameObject])): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scriptBindings")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def scriptLoaded(who: typings.cookieclicker.Game.GameObject, script: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scriptLoaded")(who.asInstanceOf[js.Any], script.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
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
    
    @scala.inline
    def setOnCrate(what: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setOnCrate")(what.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def setVolume(what: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setVolume")(what.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
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
    
    @scala.inline
    def showBackupWarning(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showBackupWarning")().asInstanceOf[Unit]
    
    @scala.inline
    def sortSprites(a: js.Any, b: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sortSprites")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    @scala.inline
    def sortSpritesById(a: js.Any, b: js.Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sortSpritesById")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
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
    
    @scala.inline
    def spendLump(n: Double, str: String, func: js.Function0[Unit]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("spendLump")(n.asInstanceOf[js.Any], str.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
    
    @JSGlobal("Game.startDate")
    @js.native
    def startDate: Double = js.native
    @scala.inline
    def startDate_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("startDate")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def storeBulkButton(id: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("storeBulkButton")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def storeBuyAll(): Unit | `false` = ^.asInstanceOf[js.Dynamic].applyDynamic("storeBuyAll")().asInstanceOf[Unit | `false`]
    
    @JSGlobal("Game.storeToRefresh")
    @js.native
    def storeToRefresh: Double = js.native
    @scala.inline
    def storeToRefresh_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("storeToRefresh")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Game.textParticles")
    @js.native
    def textParticles: js.Array[Particle] = js.native
    
    @scala.inline
    def textParticlesAdd(text: String, el: Unit, posX: Double, posY: Double): Particle = (^.asInstanceOf[js.Dynamic].applyDynamic("textParticlesAdd")(text.asInstanceOf[js.Any], el.asInstanceOf[js.Any], posX.asInstanceOf[js.Any], posY.asInstanceOf[js.Any])).asInstanceOf[Particle]
    
    @scala.inline
    def textParticlesAdd_0(text: String, el: `0`, posX: Double, posY: Double): Particle = (^.asInstanceOf[js.Dynamic].applyDynamic("textParticlesAdd")(text.asInstanceOf[js.Any], el.asInstanceOf[js.Any], posX.asInstanceOf[js.Any], posY.asInstanceOf[js.Any])).asInstanceOf[Particle]
    
    @scala.inline
    def textParticlesUpdate(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("textParticlesUpdate")().asInstanceOf[Unit]
    
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
    
    @scala.inline
    def tinyCookie(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("tinyCookie")().asInstanceOf[String]
    
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
    
    @scala.inline
    def updateBuffs(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("updateBuffs")().asInstanceOf[Unit]
    
    @scala.inline
    def updateClasses(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("updateClasses")().asInstanceOf[Unit]
    
    @JSGlobal("Game.updateLog")
    @js.native
    def updateLog: String = js.native
    @scala.inline
    def updateLog_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("updateLog")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def updateShimmers(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("updateShimmers")().asInstanceOf[Unit]
    
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
    extends StObject
       with typings.cookieclicker.Loader {
    
    /**
      * Loads assets
      * @param assets The iterable of strings to get asset names from
      */
    /* CompleteClass */
    override def Load(assets: js.Array[String]): Unit = js.native
    
    /**
      * Replaces an asset if the original asset exists
      * @param old The name of the old asset
      * @param newer The name of the new asset, isn't prefixed by `this.prefix` if it has `http` in the name
      */
    /* CompleteClass */
    override def Replace(old: String, newer: String): Unit = js.native
    
    /* CompleteClass */
    var assets: js.Array[Unit] & (Record[String, HTMLImageElement]) = js.native
    
    /**
      * Names of the assets that have been loaded
      */
    /* CompleteClass */
    var assetsLoaded: js.Array[String] = js.native
    
    /**
      * Names of the assets that are currently loading
      */
    /* CompleteClass */
    var assetsLoading: js.Array[String] = js.native
    
    /**
      * Total amount of assets, both loading and loaded
      */
    /* CompleteClass */
    var assetsN: Double = js.native
    
    /**
      * An empty 8x8 canvas element, used in the `Pic` constructor
      */
    /* CompleteClass */
    var blank: HTMLCanvasElementwidth8he = js.native
    
    /**
      * The prefix to all assets
      */
    /* CompleteClass */
    var domain: String = js.native
    
    /**
      * A pseudoboolean, is true when all assets are loaded for the first time
      */
    /* CompleteClass */
    var doneLoading: PseudoBoolean = js.native
    
    /**
      * Returns the progress of loading all assets
      */
    /* CompleteClass */
    override def getProgress(): Double = js.native
    
    /**
      * A callback to when all assets is loaded
      */
    /* CompleteClass */
    var loaded: PseudoNull | js.Function0[Unit] = js.native
    
    /**
      * The amount of loading assets
      */
    /* CompleteClass */
    var loadingN: Double = js.native
    
    /**
      * An internal callback function
      */
    /* CompleteClass */
    override def onLoad(e: Event): Unit = js.native
    
    /**
      * Unused @deprecated
      */
    /* CompleteClass */
    override def onLoadReplace(): Unit = js.native
  }
  
  @scala.inline
  def PlaySound(url: String): Unit = js.Dynamic.global.applyDynamic("PlaySound")(url.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def PlaySound(url: String, volume: Double): Unit = (js.Dynamic.global.applyDynamic("PlaySound")(url.asInstanceOf[js.Any], volume.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def PlaySound(url: String, volume: Double, pitch: Double): Unit = (js.Dynamic.global.applyDynamic("PlaySound")(url.asInstanceOf[js.Any], volume.asInstanceOf[js.Any], pitch.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def PlaySound(url: String, volume: Unit, pitch: Double): Unit = (js.Dynamic.global.applyDynamic("PlaySound")(url.asInstanceOf[js.Any], volume.asInstanceOf[js.Any], pitch.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Returns a random member of an array, has a very slight chance to return `undefined` (When the seeded Math.random() is 1)
    * @param array The array to pick a member of
    */
  @scala.inline
  def choose[T](array: js.Array[T]): T = js.Dynamic.global.applyDynamic("choose")(array.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def l(name: String): HTMLElement = js.Dynamic.global.applyDynamic("l")(name.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  
  /**
    * Floors or ceils randomly, biased by the decimal value
    */
  @scala.inline
  def randomFloor(x: Double): Double = js.Dynamic.global.applyDynamic("randomFloor")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def shuffle[T](array: js.Array[T]): js.Array[T] = js.Dynamic.global.applyDynamic("shuffle")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  /**
    * An extended toFixed, which converts any number to an e-less string
    */
  @scala.inline
  def toFixed(x: Double): String = js.Dynamic.global.applyDynamic("toFixed")(x.asInstanceOf[js.Any]).asInstanceOf[String]
}
