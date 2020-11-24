package typings.cookieclicker.Game

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnlockRequirement extends js.Object {
  
  /**
    * The amount of cookies required to unlock the cookie (usually price/20)
    */
  var cookies: Double = js.native
  
  /**
    * The name of the cookie
    */
  var name: String = js.native
  
  /**
    * The name of the cookie required to unlock the cookie
    */
  var require: String = js.native
  
  /**
    * The cookie required to unlock the cookie
    */
  var season: String = js.native
}
object UnlockRequirement {
  
  @scala.inline
  def apply(cookies: Double, name: String, require: String, season: String): UnlockRequirement = {
    val __obj = js.Dynamic.literal(cookies = cookies.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], require = require.asInstanceOf[js.Any], season = season.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnlockRequirement]
  }
  
  @scala.inline
  implicit class UnlockRequirementOps[Self <: UnlockRequirement] (val x: Self) extends AnyVal {
    
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
    def setCookies(value: Double): Self = this.set("cookies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequire(value: String): Self = this.set("require", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeason(value: String): Self = this.set("season", value.asInstanceOf[js.Any])
  }
}
