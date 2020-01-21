package typings.bemCn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BemContext extends js.Object {
  var mixes: js.Array[BemMix]
  var mods: BemMods
  var name: String
  var states: BemStates
}

object BemContext {
  @scala.inline
  def apply(mixes: js.Array[BemMix], mods: BemMods, name: String, states: BemStates): BemContext = {
    val __obj = js.Dynamic.literal(mixes = mixes.asInstanceOf[js.Any], mods = mods.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BemContext]
  }
}

