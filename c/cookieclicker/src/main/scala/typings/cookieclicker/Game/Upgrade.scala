package typings.cookieclicker.Game

import typings.cookieclicker.cookieclickerStrings.upgrade
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Upgrade extends StObject {
  
  /**
    * Called everytime the upgrade is attempted to be bought, originally designed for permaslots
    */
  var activateFunction: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * The description of the upgrade without auto-adjusted text
    */
  var baseDesc: String = js.native
  
  /**
    * The price of the upgrade without the cost multipliers
    */
  var basePrice: Double = js.native
  
  var bought: PseudoBoolean | Boolean = js.native
  
  /**
    * The building tie for a tiered upgrade, is (pseudo) null in non-tiered upgrades
    */
  var buildingTie: GameObject | PseudoNull = js.native
  
  def buy(bypass: Boolean): PseudoBoolean = js.native
  /**
    * Buys the upgrade and opens the selector if the upgrade is a selector switch
    * @param bypass If true, ignores `clickFunction`
    */
  def buy(bypass: PseudoBoolean): PseudoBoolean = js.native
  
  /**
    * The function that gets triggered on buy
    */
  var buyFunction: js.UndefOr[js.Function0[Unit]] = js.native
  
  def canBuy(): Boolean = js.native
  
  var canBuyFunc: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /**
    * The function that gets triggered on click, vaults or buys the upgrade
    */
  def click(e: MouseEvent): Unit = js.native
  
  /**
    * Function triggered when the upgrade is attempted to be bought, return value specifies if the upgrade is allowed to be bough
    */
  var clickFunction: js.UndefOr[js.Function0[Boolean]] = js.native
  
  /**
    * The description of the upgrade with auto-adjusted text
    */
  var desc: String = js.native
  
  /**
    * The function to generate the upgrade descroption
    */
  var descFunc: js.UndefOr[js.Function0[String]] = js.native
  
  /**
    * Gives the upgrade for free
    */
  def earn(): Unit = js.native
  
  /**
    * Calculates the price for the upgrade
    */
  def getPrice(): Double = js.native
  
  var icon: Icon = js.native
  
  var iconFunction: js.Function0[Icon] | PseudoNull = js.native
  
  var id: Double = js.native
  
  def isVaulted(): Boolean = js.native
  
  /**
    * Takes away the upgrade and locks it
    */
  def lose(): Unit = js.native
  
  var name: String = js.native
  
  /**
    * The order the upgrade appears in the upgrade list, higher ids have priorities
    */
  var order: Double = js.native
  
  /**
    * The parents of the heavenly upgrade, present on all upgrades
    */
  var parents: js.Array[HeavenlyUpgrade] = js.native
  
  /**
    * The type of the upgrade, "prestigeDecor" and "unused" are unused, "" is the default
    */
  var pool: UpgradePool = js.native
  
  /**
    * The power of a cookie upgrade, present as `0` on Non-cookie upgrades
    */
  var power: Double | (js.Function1[/* me */ this.type, Double]) = js.native
  
  var priceFunc: js.UndefOr[js.Function0[Double]] = js.native
  
  /**
    * The price of the upgrade, this is visual only, so the lump spending must be manually implemented
    */
  var priceLumps: Double = js.native
  
  /** @deprecated */
  var techUnlock: js.Array[Unit] = js.native
  
  var tier: String | Double = js.native
  
  /**
    * Toggles the state of the upgrade
    */
  def toggle(): Unit = js.native
  
  var `type`: upgrade = js.native
  
  /**
    * Takes the upgrade away, but doesn't lock it
    */
  def unearn(): Unit = js.native
  
  var unlockAt: UnlockRequirement | PseudoNull = js.native
  
  var unlocked: PseudoBoolean | Boolean = js.native
  
  def unvault(): Unit = js.native
  
  var vanilla: PseudoBoolean = js.native
  
  def vault(): Unit = js.native
}
