package typings.cookieclicker.Game

import typings.cookieclicker.cookieclickerBooleans.`false`
import typings.cookieclicker.cookieclickerNumbers.`-1`
import typings.cookieclicker.cookieclickerNumbers.`0`
import typings.cookieclicker.cookieclickerNumbers.`1`
import typings.cookieclicker.cookieclickerNumbers.`2`
import typings.cookieclicker.cookieclickerStrings.Pantheon
import typings.std.HTMLDivElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PantheonMinigame
  extends StObject
     with Minigame {
  
  def dragGod(what: PantheonSpirit): Unit = js.native
  
  /**
    * The currently dragged spirit
    */
  var dragging: PantheonSpirit | `false` = js.native
  
  def dropGod(): Unit = js.native
  
  /**
    * Generates the tooltip function for a spirit
    */
  def godTooltip(id: Double): js.Function0[String] = js.native
  
  var gods: Record[String, PantheonSpirit] = js.native
  
  var godsById: js.Array[PantheonSpirit] = js.native
  
  @JSName("hoverSlot")
  def hoverSlot_0(what: `0`): Unit = js.native
  @JSName("hoverSlot")
  def hoverSlot_1(what: `-1`): Unit = js.native
  @JSName("hoverSlot")
  def hoverSlot_1(what: `1`): Unit = js.native
  @JSName("hoverSlot")
  def hoverSlot_2(what: `2`): Unit = js.native
  
  /**
    * The amount of frames between the last swap
    */
  var lastSwapT: Double = js.native
  
  var lumpRefill: HTMLDivElement = js.native
  
  @JSName("name")
  var name_PantheonMinigame: Pantheon = js.native
  
  /**
    * Generates the lump refill tooltip
    */
  def refillTooltip(): String = js.native
  
  /**
    * A tuple of the current slots, -1 for nothing
    */
  var slot: js.Tuple3[Double, Double, Double] = js.native
  
  @JSName("slotGod")
  def slotGod_0(god: PantheonSpirit, slot: `0`): Boolean = js.native
  /**
    * Slots a spirit in
    * @returns If the operation was successful
    */
  @JSName("slotGod")
  def slotGod_1(god: PantheonSpirit, slot: `-1`): Boolean = js.native
  @JSName("slotGod")
  def slotGod_1(god: PantheonSpirit, slot: `1`): Boolean = js.native
  @JSName("slotGod")
  def slotGod_2(god: PantheonSpirit, slot: `2`): Boolean = js.native
  
  /**
    * The currently hovered slot
    */
  var slotHovered: `-1` | `0` | `1` | `2` = js.native
  
  /**
    * Names of the slot gems
    */
  var slotNames: js.Array[String] = js.native
  
  /**
    * Generates the tooltip function for a slot
    */
  def slotTooltip(id: Double): js.Function0[String] = js.native
  
  /**
    * The last time a spirit was slotted
    */
  var swapT: Double = js.native
  
  /**
    * The amount of swaps left
    */
  var swaps: Double = js.native
  
  var swapsL: HTMLDivElement = js.native
  
  /**
    * Uses up an amount of swaps
    * @param n The amount of swaps to use
    */
  def useSwap(n: Double): Unit = js.native
}
