package typings.cookieclicker.Game

import typings.cookieclicker.cookieclickerStrings.toggle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectorSwitch extends Upgrade {
  
  def choicesFunction(): js.Array[SelectorSwitchChoice] = js.native
  
  def choicesPick(id: Double): Unit = js.native
  
  @JSName("pool")
  var pool_SelectorSwitch: toggle = js.native
}
