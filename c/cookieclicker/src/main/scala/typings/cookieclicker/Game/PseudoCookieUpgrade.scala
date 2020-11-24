package typings.cookieclicker.Game

import typings.cookieclicker.cookieclickerBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PseudoCookieUpgrade extends js.Object {
  
  var pseudoCookie: `true` = js.native
}
object PseudoCookieUpgrade {
  
  @scala.inline
  def apply(pseudoCookie: `true`): PseudoCookieUpgrade = {
    val __obj = js.Dynamic.literal(pseudoCookie = pseudoCookie.asInstanceOf[js.Any])
    __obj.asInstanceOf[PseudoCookieUpgrade]
  }
  
  @scala.inline
  implicit class PseudoCookieUpgradeOps[Self <: PseudoCookieUpgrade] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPseudoCookie(value: `true`): Self = this.set("pseudoCookie", value.asInstanceOf[js.Any])
  }
}
