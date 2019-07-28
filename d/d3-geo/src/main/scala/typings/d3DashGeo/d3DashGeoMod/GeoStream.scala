package typings.d3DashGeo.d3DashGeoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoStream extends js.Object {
  /**
    * Indicates the sphere (the globe; the unit sphere centered at ⟨0,0,0⟩).
    */
  var sphere: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Indicates the end of a line or ring. Within a polygon, indicates the end of a ring.
    * Unlike GeoJSON, the redundant closing coordinate of a ring is not indicated via point, and instead is implied via lineEnd within a polygon.
    */
  def lineEnd(): Unit = js.native
  /**
    * Indicates the start of a line or ring. Within a polygon, indicates the start of a ring. The first ring of a polygon is the exterior ring, and is typically clockwise.
    * Any subsequent rings indicate holes in the polygon, and are typically counterclockwise.
    */
  def lineStart(): Unit = js.native
  /**
    * Indicates a point with the specified coordinates x and y (and optionally z). The coordinate system is unspecified and implementation-dependent;
    * for example, projection streams require spherical coordinates in degrees as input. Outside the context of a polygon or line,
    * a point indicates a point geometry object (Point or MultiPoint). Within a line or polygon ring, the point indicates a control point.
    *
    * @param x x-coordinate of point.
    * @param y y-coordinate of point.
    * @param z Optional z-coordinate of point.
    */
  def point(x: Double, y: Double): Unit = js.native
  def point(x: Double, y: Double, z: Double): Unit = js.native
  /**
    * Indicates the end of a polygon.
    */
  def polygonEnd(): Unit = js.native
  /**
    * Indicates the start of a polygon. The first line of a polygon indicates the exterior ring, and any subsequent lines indicate interior holes.
    */
  def polygonStart(): Unit = js.native
}

