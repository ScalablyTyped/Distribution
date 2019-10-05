package typings.d3DashGeo.d3DashGeoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoRotation extends js.Object {
  /**
    * Returns a new array [longitude, latitude] in degrees representing the rotated point of the given point.
    *
    * @param point The point must be specified as a two-element array [longitude, latitude] in degrees.
    */
  def apply(point: js.Tuple2[Double, Double]): js.Tuple2[Double, Double] = js.native
  /**
    * Returns a new array [longitude, latitude] in degrees representing the point of the given rotated point; the inverse of rotation.
    *
    * @param point The rotated point must be specified as a two-element array [longitude, latitude] in degrees.
    */
  def invert(point: js.Tuple2[Double, Double]): js.Tuple2[Double, Double] = js.native
}

@JSImport("d3-geo", "geoRotation")
@js.native
object geoRotation extends js.Object {
  def apply(angles: js.Tuple2[Double, Double]): GeoRotation = js.native
  def apply(angles: js.Tuple3[Double, Double, Double]): GeoRotation = js.native
}

