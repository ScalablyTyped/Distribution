package typings.chayns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// chayns.findSite()
trait Site extends js.Object {
  var appstoreName: String
  var facebookId: String
  var locationId: Double
  var siteId: String
}

object Site {
  @scala.inline
  def apply(appstoreName: String, facebookId: String, locationId: Double, siteId: String): Site = {
    val __obj = js.Dynamic.literal(appstoreName = appstoreName.asInstanceOf[js.Any], facebookId = facebookId.asInstanceOf[js.Any], locationId = locationId.asInstanceOf[js.Any], siteId = siteId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Site]
  }
}

