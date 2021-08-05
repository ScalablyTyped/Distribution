package typings.cookieclicker.Game

import typings.cookieclicker.cookieclickerNumbers.`-1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GrimoireSpell extends StObject {
  
  /**
    * The minimum cost of the spell, in mana
    */
  var costMin: Double
  
  /**
    * The cost of the spell, in raw multiplier of max mana
    */
  var costPercent: js.UndefOr[Double] = js.undefined
  
  /**
    * The description of the positive effect of the spell, in HTML text
    */
  var desc: String
  
  /**
    * Called when the spell fails
    */
  var fail: js.UndefOr[js.Function0[`-1` | Unit]] = js.undefined
  
  /**
    * The description of the negative effect of the spell, in HTML text
    */
  var failDesc: js.UndefOr[String] = js.undefined
  
  var icon: Icon
  
  var id: Double
  
  /**
    * The displayed name for the spell
    */
  var name: String
  
  /**
    * Called when the spell succeeds, always called if no fail function
    */
  def win(): `-1` | Unit
}
object GrimoireSpell {
  
  inline def apply(costMin: Double, desc: String, icon: Icon, id: Double, name: String, win: () => `-1` | Unit): GrimoireSpell = {
    val __obj = js.Dynamic.literal(costMin = costMin.asInstanceOf[js.Any], desc = desc.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], win = js.Any.fromFunction0(win))
    __obj.asInstanceOf[GrimoireSpell]
  }
  
  extension [Self <: GrimoireSpell](x: Self) {
    
    inline def setCostMin(value: Double): Self = StObject.set(x, "costMin", value.asInstanceOf[js.Any])
    
    inline def setCostPercent(value: Double): Self = StObject.set(x, "costPercent", value.asInstanceOf[js.Any])
    
    inline def setCostPercentUndefined: Self = StObject.set(x, "costPercent", js.undefined)
    
    inline def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
    
    inline def setFail(value: () => `-1` | Unit): Self = StObject.set(x, "fail", js.Any.fromFunction0(value))
    
    inline def setFailDesc(value: String): Self = StObject.set(x, "failDesc", value.asInstanceOf[js.Any])
    
    inline def setFailDescUndefined: Self = StObject.set(x, "failDesc", js.undefined)
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setIcon(value: Icon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setWin(value: () => `-1` | Unit): Self = StObject.set(x, "win", js.Any.fromFunction0(value))
  }
}
