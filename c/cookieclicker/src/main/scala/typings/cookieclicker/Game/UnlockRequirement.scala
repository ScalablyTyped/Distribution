package typings.cookieclicker.Game

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnlockRequirement extends StObject {
  
  /**
    * The amount of cookies required to unlock the cookie (usually price/20)
    */
  var cookies: Double
  
  /**
    * The name of the cookie
    */
  var name: String
  
  /**
    * The name of the upgrade or achievement required to unlock the cookie
    */
  var require: js.UndefOr[String] = js.undefined
  
  /**
    * The cookie required to unlock the cookie
    */
  var season: js.UndefOr[String] = js.undefined
}
object UnlockRequirement {
  
  inline def apply(cookies: Double, name: String): UnlockRequirement = {
    val __obj = js.Dynamic.literal(cookies = cookies.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnlockRequirement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnlockRequirement] (val x: Self) extends AnyVal {
    
    inline def setCookies(value: Double): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRequire(value: String): Self = StObject.set(x, "require", value.asInstanceOf[js.Any])
    
    inline def setRequireUndefined: Self = StObject.set(x, "require", js.undefined)
    
    inline def setSeason(value: String): Self = StObject.set(x, "season", value.asInstanceOf[js.Any])
    
    inline def setSeasonUndefined: Self = StObject.set(x, "season", js.undefined)
  }
}
