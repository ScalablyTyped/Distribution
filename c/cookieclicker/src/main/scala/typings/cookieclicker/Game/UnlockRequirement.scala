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
    * The name of the cookie required to unlock the cookie
    */
  var require: String
  
  /**
    * The cookie required to unlock the cookie
    */
  var season: String
}
object UnlockRequirement {
  
  @scala.inline
  def apply(cookies: Double, name: String, require: String, season: String): UnlockRequirement = {
    val __obj = js.Dynamic.literal(cookies = cookies.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], require = require.asInstanceOf[js.Any], season = season.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnlockRequirement]
  }
  
  @scala.inline
  implicit class UnlockRequirementMutableBuilder[Self <: UnlockRequirement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCookies(value: Double): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequire(value: String): Self = StObject.set(x, "require", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeason(value: String): Self = StObject.set(x, "season", value.asInstanceOf[js.Any])
  }
}
