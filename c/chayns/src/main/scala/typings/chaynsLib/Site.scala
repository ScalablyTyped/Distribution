package typings
package chaynsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// chayns.findSite()
trait Site extends js.Object {
  var appstoreName: java.lang.String
  var facebookId: java.lang.String
  var locationId: scala.Double
  var siteId: java.lang.String
}

object Site {
  @scala.inline
  def apply(
    appstoreName: java.lang.String,
    facebookId: java.lang.String,
    locationId: scala.Double,
    siteId: java.lang.String
  ): Site = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("appstoreName")(appstoreName)
    __obj.updateDynamic("facebookId")(facebookId)
    __obj.updateDynamic("locationId")(locationId)
    __obj.updateDynamic("siteId")(siteId)
    __obj.asInstanceOf[Site]
  }
}

