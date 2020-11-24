package typings.cookieclicker.Game

import typings.cookieclicker.cookieclickerNumbers.`-1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GrimoireSpell extends js.Object {
  
  /**
    * The minimum cost of the spell, in mana
    */
  var costMin: Double = js.native
  
  /**
    * The cost of the spell, in raw multiplier of max mana
    */
  var costPercent: js.UndefOr[Double] = js.native
  
  /**
    * The description of the positive effect of the spell, in HTML text
    */
  var desc: String = js.native
  
  /**
    * Called when the spell fails
    */
  var fail: js.UndefOr[js.Function0[`-1` | Unit]] = js.native
  
  /**
    * The description of the negative effect of the spell, in HTML text
    */
  var failDesc: js.UndefOr[String] = js.native
  
  var icon: Icon = js.native
  
  var id: Double = js.native
  
  /**
    * The displayed name for the spell
    */
  var name: String = js.native
  
  /**
    * Called when the spell succeeds, always called if no fail function
    */
  def win(): `-1` | Unit = js.native
}
object GrimoireSpell {
  
  @scala.inline
  def apply(costMin: Double, desc: String, icon: Icon, id: Double, name: String, win: () => `-1` | Unit): GrimoireSpell = {
    val __obj = js.Dynamic.literal(costMin = costMin.asInstanceOf[js.Any], desc = desc.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], win = js.Any.fromFunction0(win))
    __obj.asInstanceOf[GrimoireSpell]
  }
  
  @scala.inline
  implicit class GrimoireSpellOps[Self <: GrimoireSpell] (val x: Self) extends AnyVal {
    
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
    def setCostMin(value: Double): Self = this.set("costMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesc(value: String): Self = this.set("desc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcon(value: Icon): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWin(value: () => `-1` | Unit): Self = this.set("win", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCostPercent(value: Double): Self = this.set("costPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCostPercent: Self = this.set("costPercent", js.undefined)
    
    @scala.inline
    def setFail(value: () => `-1` | Unit): Self = this.set("fail", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    
    @scala.inline
    def setFailDesc(value: String): Self = this.set("failDesc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailDesc: Self = this.set("failDesc", js.undefined)
  }
}
