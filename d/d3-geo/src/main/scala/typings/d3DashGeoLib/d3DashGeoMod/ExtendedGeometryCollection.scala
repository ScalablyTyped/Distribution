package typings
package d3DashGeoLib.d3DashGeoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtendedGeometryCollection[GeometryType /* <: GeoGeometryObjects */] extends js.Object {
  var bbox: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var crs: js.UndefOr[d3DashGeoLib.Anon_Type] = js.undefined
  var geometries: js.Array[GeometryType]
  var `type`: java.lang.String
}

