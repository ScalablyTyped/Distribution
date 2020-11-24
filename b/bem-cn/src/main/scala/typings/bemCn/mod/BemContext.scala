package typings.bemCn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BemContext extends js.Object {
  
  var mixes: js.Array[BemMix] = js.native
  
  var mods: BemMods = js.native
  
  var name: String = js.native
  
  var states: BemStates = js.native
}
object BemContext {
  
  @scala.inline
  def apply(mixes: js.Array[BemMix], mods: BemMods, name: String, states: BemStates): BemContext = {
    val __obj = js.Dynamic.literal(mixes = mixes.asInstanceOf[js.Any], mods = mods.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any])
    __obj.asInstanceOf[BemContext]
  }
  
  @scala.inline
  implicit class BemContextOps[Self <: BemContext] (val x: Self) extends AnyVal {
    
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
    def setMixesVarargs(value: BemMix*): Self = this.set("mixes", js.Array(value :_*))
    
    @scala.inline
    def setMixes(value: js.Array[BemMix]): Self = this.set("mixes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMods(value: BemMods): Self = this.set("mods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStates(value: BemStates): Self = this.set("states", value.asInstanceOf[js.Any])
  }
}
