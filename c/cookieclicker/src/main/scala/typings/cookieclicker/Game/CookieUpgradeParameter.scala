package typings.cookieclicker.Game

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CookieUpgradeParameter extends js.Object {
  
  var name: String = js.native
  
  var power: Double = js.native
  
  /**
    * The name of cookie required to unlock the cookie
    */
  var require: js.UndefOr[String] = js.native
  
  /**
    * The season required to unlock the cookie
    */
  var season: js.UndefOr[String] = js.native
}
object CookieUpgradeParameter {
  
  @scala.inline
  def apply(name: String, power: Double): CookieUpgradeParameter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], power = power.asInstanceOf[js.Any])
    __obj.asInstanceOf[CookieUpgradeParameter]
  }
  
  @scala.inline
  implicit class CookieUpgradeParameterOps[Self <: CookieUpgradeParameter] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPower(value: Double): Self = this.set("power", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequire(value: String): Self = this.set("require", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequire: Self = this.set("require", js.undefined)
    
    @scala.inline
    def setSeason(value: String): Self = this.set("season", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeason: Self = this.set("season", js.undefined)
  }
}
