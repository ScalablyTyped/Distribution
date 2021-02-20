package typings.cookieclicker.Game

import typings.cookieclicker.cookieclickerStrings.cookie
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CookieUpgrade extends StObject {
  
  var pool: cookie = js.native
}
object CookieUpgrade {
  
  @scala.inline
  def apply(pool: cookie): CookieUpgrade = {
    val __obj = js.Dynamic.literal(pool = pool.asInstanceOf[js.Any])
    __obj.asInstanceOf[CookieUpgrade]
  }
  
  @scala.inline
  implicit class CookieUpgradeMutableBuilder[Self <: CookieUpgrade] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPool(value: cookie): Self = StObject.set(x, "pool", value.asInstanceOf[js.Any])
  }
}
