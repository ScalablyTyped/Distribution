package typings.d3Geo.mod

import typings.d3Geo.d3GeoStrings.Sphere
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

