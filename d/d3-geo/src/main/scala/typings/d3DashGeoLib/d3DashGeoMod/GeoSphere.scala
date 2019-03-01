package typings
package d3DashGeoLib.d3DashGeoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoSphere extends js.Object {
  /**
    * Sphere geometry type
    */
  var `type`: d3DashGeoLib.d3DashGeoLibStrings.Sphere
}

object GeoSphere {
  @scala.inline
  def apply(`type`: d3DashGeoLib.d3DashGeoLibStrings.Sphere): GeoSphere = {
    val __obj = js.Dynamic.literal(`type` = `type`)
  
    __obj.asInstanceOf[GeoSphere]
  }
}

