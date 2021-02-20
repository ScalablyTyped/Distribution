package typings.cookieclicker.Game

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DragonLevel extends StObject {
  
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
  implicit class DragonLevelMutableBuilder[Self <: DragonLevel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuy(value: () => Unit): Self = StObject.set(x, "buy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCost(value: () => Boolean): Self = StObject.set(x, "cost", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCostStr(value: () => String): Self = StObject.set(x, "costStr", js.Any.fromFunction0(value))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPic(value: Double): Self = StObject.set(x, "pic", value.asInstanceOf[js.Any])
  }
}
