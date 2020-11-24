package typings.cookieclicker.Game

import typings.cookieclicker.cookieclickerStrings.cookie
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CookieUpgrade extends js.Object {
  
  var pool: cookie = js.native
}
object CookieUpgrade {
  
  @scala.inline
  def apply(pool: cookie): CookieUpgrade = {
    val __obj = js.Dynamic.literal(pool = pool.asInstanceOf[js.Any])
    __obj.asInstanceOf[CookieUpgrade]
  }
  
  @scala.inline
  implicit class CookieUpgradeOps[Self <: CookieUpgrade] (val x: Self) extends AnyVal {
    
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
    def setPool(value: cookie): Self = this.set("pool", value.asInstanceOf[js.Any])
  }
}
