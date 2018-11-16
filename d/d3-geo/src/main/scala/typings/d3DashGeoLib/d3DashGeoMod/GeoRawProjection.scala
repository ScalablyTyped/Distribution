package typings
package d3DashGeoLib.d3DashGeoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoRawProjection extends js.Object {
  /**
       * Inverts the projected point [x, y] in unitless coordinates, returning an unprojected point in spherical coordinates [lambda, phi] in radians.
       * @param x x-coordinate (unitless).
       * @param y y-coordinate (unitless).
       */
  var invert: js.UndefOr[
    js.Function2[/* x */ scala.Double, /* y */ scala.Double, js.Tuple2[scala.Double, scala.Double]]
  ] = js.native
  /**
       * Projects the specified point [lambda, phi] in radians, returning a new point [x, y] in unitless coordinates.
       * @param lambda Spherical lambda coordinate in radians.
       * @param phi Spherical phi coordinate in radians.
       */
  def apply(lambda: scala.Double, phi: scala.Double): js.Tuple2[scala.Double, scala.Double] = js.native
}

