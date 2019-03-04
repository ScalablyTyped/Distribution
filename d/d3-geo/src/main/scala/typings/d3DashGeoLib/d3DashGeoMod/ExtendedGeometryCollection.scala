package typings
package d3DashGeoLib.d3DashGeoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtendedGeometryCollection[GeometryType /* <: GeoGeometryObjects */] extends js.Object {
  var bbox: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var crs: js.UndefOr[d3DashGeoLib.Anon_Properties] = js.undefined
  var geometries: js.Array[GeometryType]
  var `type`: java.lang.String
}

object ExtendedGeometryCollection {
  @scala.inline
  def apply[GeometryType /* <: GeoGeometryObjects */](
    geometries: js.Array[GeometryType],
    `type`: java.lang.String,
    bbox: js.Array[scala.Double] = null,
    crs: d3DashGeoLib.Anon_Properties = null
  ): ExtendedGeometryCollection[GeometryType] = {
    val __obj = js.Dynamic.literal(geometries = geometries)
    __obj.updateDynamic("type")(`type`)
    if (bbox != null) __obj.updateDynamic("bbox")(bbox)
    if (crs != null) __obj.updateDynamic("crs")(crs)
    __obj.asInstanceOf[ExtendedGeometryCollection[GeometryType]]
  }
}

