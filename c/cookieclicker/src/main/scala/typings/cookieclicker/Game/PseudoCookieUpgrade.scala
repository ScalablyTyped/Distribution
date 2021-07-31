package typings.cookieclicker.Game

import typings.cookieclicker.cookieclickerBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PseudoCookieUpgrade extends StObject {
  
  var pseudoCookie: `true`
}
object PseudoCookieUpgrade {
  
  @scala.inline
  def apply(): PseudoCookieUpgrade = {
    val __obj = js.Dynamic.literal(pseudoCookie = true)
    __obj.asInstanceOf[PseudoCookieUpgrade]
  }
  
  @scala.inline
  implicit class PseudoCookieUpgradeMutableBuilder[Self <: PseudoCookieUpgrade] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPseudoCookie(value: `true`): Self = StObject.set(x, "pseudoCookie", value.asInstanceOf[js.Any])
  }
}
