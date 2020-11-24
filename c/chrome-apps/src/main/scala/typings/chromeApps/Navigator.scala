package typings.chromeApps

import typings.std.Geolocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Navigator extends js.Object {
  
  /**
    * If you provide the 'geolocation' in your Chrome app it will allow the app to
    * use the proposed HTML5 geolocation API without prompting the user for permission.
    * @see Permissions: 'geolocation'
    */
  val geolocation: Geolocation = js.native
}
object Navigator {
  
  @scala.inline
  def apply(geolocation: Geolocation): Navigator = {
    val __obj = js.Dynamic.literal(geolocation = geolocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Navigator]
  }
  
  @scala.inline
  implicit class NavigatorOps[Self <: Navigator] (val x: Self) extends AnyVal {
    
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
    def setGeolocation(value: Geolocation): Self = this.set("geolocation", value.asInstanceOf[js.Any])
  }
}
