package typings.cookieclicker.Game

import typings.cookieclicker.cookieclickerBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PseudoCookieUpgrade extends StObject {
  
  var pseudoCookie: `true` = js.native
}
object PseudoCookieUpgrade {
  
  @scala.inline
  def apply(pseudoCookie: `true`): PseudoCookieUpgrade = {
    val __obj = js.Dynamic.literal(pseudoCookie = pseudoCookie.asInstanceOf[js.Any])
    __obj.asInstanceOf[PseudoCookieUpgrade]
  }
  
  @scala.inline
  implicit class PseudoCookieUpgradeMutableBuilder[Self <: PseudoCookieUpgrade] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPseudoCookie(value: `true`): Self = StObject.set(x, "pseudoCookie", value.asInstanceOf[js.Any])
  }
}
