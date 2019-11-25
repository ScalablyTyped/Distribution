package typings.d3DashGeo.d3DashGeoMod

import typings.d3DashGeo.d3DashGeoStrings.Sphere
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoSphere extends js.Object {
  /**
    * Sphere geometry type
    */
  var `type`: Sphere
}

object GeoSphere {
  @scala.inline
  def apply(`type`: Sphere): GeoSphere = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoSphere]
  }
}

