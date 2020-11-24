package typings.cookieclicker.Game

import typings.cookieclicker.anon.Cost
import typings.cookieclicker.cookieclickerStrings.Grimoire
import typings.std.HTMLDivElement
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GrimoireMinigame extends Minigame {
  
  /**
    * Casts a spell
    * @param spell The spell to cats
    * @param obj The additional options for the spell
    * @returns If the operation was successful
    */
  def castSpell(spell: GrimoireSpell): Boolean = js.native
  def castSpell(spell: GrimoireSpell, obj: Cost): Boolean = js.native
  
  /**
    * Updates maximum mana
    */
  def computeMagicM(): Unit = js.native
  
  /**
    * Computes the fail chance for  aspell
    */
  def getFailChance(spell: GrimoireSpell): Double = js.native
  
  /**
    * Calculates the cost of a spell
    */
  def getSpellCost(spell: GrimoireSpell): Double = js.native
  
  /**
    * Generates the description of the spell cost
    */
  def getSpellCostBreakdown(spell: GrimoireSpell): String = js.native
  
  var infoL: HTMLDivElement = js.native
  
  var lumpRefill: HTMLDivElement = js.native
  
  var magic: Double = js.native
  
  var magicBarFullL: HTMLDivElement = js.native
  
  var magicBarL: HTMLDivElement = js.native
  
  var magicBarTextL: HTMLDivElement = js.native
  
  var magicM: Double = js.native
  
  var magicPS: Double = js.native
  
  @JSName("name")
  var name_GrimoireMinigame: Grimoire = js.native
  
  /**
    * Generates and returns the tooltip contents for the lump refill
    */
  def refillTooltip(): String = js.native
  
  /**
    * Generates the tooltip for a spell
    */
  def spellTooltip(id: Double): js.Function0[String] = js.native
  
  var spells: Record[String, GrimoireSpell] = js.native
  
  var spellsById: js.Array[GrimoireSpell] = js.native
  
  var spellsCast: Double = js.native
  
  var spellsCastTotal: Double = js.native
}
