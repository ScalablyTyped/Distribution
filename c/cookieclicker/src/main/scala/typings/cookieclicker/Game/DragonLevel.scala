package typings.cookieclicker.Game

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DragonLevel extends js.Object {
  
  /**
    * Description of the effects of leveling up the dragon, in HTML text
    */
  var action: String = js.native
  
  /**
    * Does all the spending, spending cookies, sacrificing buildings, etc.
    */
  def buy(): Unit = js.native
  
  /**
    * Determines if the level can be bought
    */
  def cost(): Boolean = js.native
  
  /**
    * Generates the cost description in HTML text
    */
  def costStr(): String = js.native
  
  var name: String = js.native
  
  /**
    * The picture number in the dragon pictures
    */
  var pic: Double = js.native
}
object DragonLevel {
  
  @scala.inline
  def apply(
    action: String,
    buy: () => Unit,
    cost: () => Boolean,
    costStr: () => String,
    name: String,
    pic: Double
  ): DragonLevel = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], buy = js.Any.fromFunction0(buy), cost = js.Any.fromFunction0(cost), costStr = js.Any.fromFunction0(costStr), name = name.asInstanceOf[js.Any], pic = pic.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragonLevel]
  }
  
  @scala.inline
  implicit class DragonLevelOps[Self <: DragonLevel] (val x: Self) extends AnyVal {
    
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
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuy(value: () => Unit): Self = this.set("buy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCost(value: () => Boolean): Self = this.set("cost", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCostStr(value: () => String): Self = this.set("costStr", js.Any.fromFunction0(value))
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPic(value: Double): Self = this.set("pic", value.asInstanceOf[js.Any])
  }
}
