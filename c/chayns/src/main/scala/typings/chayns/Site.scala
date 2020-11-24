package typings.chayns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// chayns.findSite()
@js.native
trait Site extends js.Object {
  
  var appstoreName: String = js.native
  
  var facebookId: String = js.native
  
  var locationId: Double = js.native
  
  var siteId: String = js.native
}
object Site {
  
  @scala.inline
  def apply(appstoreName: String, facebookId: String, locationId: Double, siteId: String): Site = {
    val __obj = js.Dynamic.literal(appstoreName = appstoreName.asInstanceOf[js.Any], facebookId = facebookId.asInstanceOf[js.Any], locationId = locationId.asInstanceOf[js.Any], siteId = siteId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Site]
  }
  
  @scala.inline
  implicit class SiteOps[Self <: Site] (val x: Self) extends AnyVal {
    
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
    def setAppstoreName(value: String): Self = this.set("appstoreName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacebookId(value: String): Self = this.set("facebookId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationId(value: Double): Self = this.set("locationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSiteId(value: String): Self = this.set("siteId", value.asInstanceOf[js.Any])
  }
}
