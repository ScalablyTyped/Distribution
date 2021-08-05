package typings.cookieclicker.Game

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProductionAchievementRequirement extends StObject {
  
  var achiev: Achievement
  
  /**
    * The amount of cookies required to get the achievement
    */
  var pow: Double
}
object ProductionAchievementRequirement {
  
  inline def apply(achiev: Achievement, pow: Double): ProductionAchievementRequirement = {
    val __obj = js.Dynamic.literal(achiev = achiev.asInstanceOf[js.Any], pow = pow.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductionAchievementRequirement]
  }
  
  extension [Self <: ProductionAchievementRequirement](x: Self) {
    
    inline def setAchiev(value: Achievement): Self = StObject.set(x, "achiev", value.asInstanceOf[js.Any])
    
    inline def setPow(value: Double): Self = StObject.set(x, "pow", value.asInstanceOf[js.Any])
  }
}
