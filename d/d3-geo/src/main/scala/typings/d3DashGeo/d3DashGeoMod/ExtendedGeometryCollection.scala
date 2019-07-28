package typings.d3DashGeo.d3DashGeoMod

import typings.d3DashGeo.Anon_Properties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtendedGeometryCollection[GeometryType /* <: GeoGeometryObjects */] extends js.Object {
  var bbox: js.UndefOr[js.Array[Double]] = js.undefined
  var crs: js.UndefOr[Anon_Properties] = js.undefined
  var geometries: js.Array[GeometryType]
  var `type`: String
}

object ExtendedGeometryCollection {
  @scala.inline
  def apply[GeometryType /* <: GeoGeometryObjects */](
    geometries: js.Array[GeometryType],
    `type`: String,
    bbox: js.Array[Double] = null,
    crs: Anon_Properties = null
  ): ExtendedGeometryCollection[GeometryType] = {
    val __obj = js.Dynamic.literal(geometries = geometries)
    __obj.updateDynamic("type")(`type`)
    if (bbox != null) __obj.updateDynamic("bbox")(bbox)
    if (crs != null) __obj.updateDynamic("crs")(crs)
    __obj.asInstanceOf[ExtendedGeometryCollection[GeometryType]]
  }
}

