package typings.cookieclicker.Game

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragonLevel extends StObject {
  
  /**
    * Description of the effects of leveling up the dragon, in HTML text
    */
  var action: String
  
  /**
    * Does all the spending, spending cookies, sacrificing buildings, etc.
    */
  def buy(): Unit
  
  /**
    * Determines if the level can be bought
    */
  def cost(): Boolean
  
  /**
    * Generates the cost description in HTML text
    */
  def costStr(): String
  
  var name: String
  
  /**
    * The picture number in the dragon pictures
    */
  var pic: Double
}
object DragonLevel {
  
  inline def apply(
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
  
  extension [Self <: DragonLevel](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setBuy(value: () => Unit): Self = StObject.set(x, "buy", js.Any.fromFunction0(value))
    
    inline def setCost(value: () => Boolean): Self = StObject.set(x, "cost", js.Any.fromFunction0(value))
    
    inline def setCostStr(value: () => String): Self = StObject.set(x, "costStr", js.Any.fromFunction0(value))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPic(value: Double): Self = StObject.set(x, "pic", value.asInstanceOf[js.Any])
  }
}
