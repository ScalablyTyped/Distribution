package typings.cookieclicker.Game

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CookieUpgradeParameter extends StObject {
  
  var name: String
  
  var power: Double
  
  /**
    * The name of cookie required to unlock the cookie
    */
  var require: js.UndefOr[String] = js.undefined
  
  /**
    * The season required to unlock the cookie
    */
  var season: js.UndefOr[String] = js.undefined
}
object CookieUpgradeParameter {
  
  inline def apply(name: String, power: Double): CookieUpgradeParameter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], power = power.asInstanceOf[js.Any])
    __obj.asInstanceOf[CookieUpgradeParameter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CookieUpgradeParameter] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPower(value: Double): Self = StObject.set(x, "power", value.asInstanceOf[js.Any])
    
    inline def setRequire(value: String): Self = StObject.set(x, "require", value.asInstanceOf[js.Any])
    
    inline def setRequireUndefined: Self = StObject.set(x, "require", js.undefined)
    
    inline def setSeason(value: String): Self = StObject.set(x, "season", value.asInstanceOf[js.Any])
    
    inline def setSeasonUndefined: Self = StObject.set(x, "season", js.undefined)
  }
}
