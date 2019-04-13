package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "IntersectionTests")
@js.native
object IntersectionTestsNs extends js.Object {
  def grazingAltitudeLocation(ray: cesiumLib.cesiumMod.Ray, ellipsoid: cesiumLib.cesiumMod.Ellipsoid): cesiumLib.cesiumMod.Cartesian3 = js.native
  def lineSegmentPlane(
    endPoint0: cesiumLib.cesiumMod.Cartesian3,
    endPoint1: cesiumLib.cesiumMod.Cartesian3,
    plane: cesiumLib.cesiumMod.Plane
  ): cesiumLib.cesiumMod.Cartesian3 = js.native
  def lineSegmentPlane(
    endPoint0: cesiumLib.cesiumMod.Cartesian3,
    endPoint1: cesiumLib.cesiumMod.Cartesian3,
    plane: cesiumLib.cesiumMod.Plane,
    result: cesiumLib.cesiumMod.Cartesian3
  ): cesiumLib.cesiumMod.Cartesian3 = js.native
  def lineSegmentSphere(
    p0: cesiumLib.cesiumMod.Cartesian3,
    p1: cesiumLib.cesiumMod.Cartesian3,
    sphere: cesiumLib.cesiumMod.BoundingSphere
  ): js.Any = js.native
  def lineSegmentSphere(
    p0: cesiumLib.cesiumMod.Cartesian3,
    p1: cesiumLib.cesiumMod.Cartesian3,
    sphere: cesiumLib.cesiumMod.BoundingSphere,
    result: js.Any
  ): js.Any = js.native
  def lineSegmentTriangle(
    v0: cesiumLib.cesiumMod.Cartesian3,
    v1: cesiumLib.cesiumMod.Cartesian3,
    p0: cesiumLib.cesiumMod.Cartesian3,
    p1: cesiumLib.cesiumMod.Cartesian3,
    p2: cesiumLib.cesiumMod.Cartesian3
  ): cesiumLib.cesiumMod.Cartesian3 = js.native
  def lineSegmentTriangle(
    v0: cesiumLib.cesiumMod.Cartesian3,
    v1: cesiumLib.cesiumMod.Cartesian3,
    p0: cesiumLib.cesiumMod.Cartesian3,
    p1: cesiumLib.cesiumMod.Cartesian3,
    p2: cesiumLib.cesiumMod.Cartesian3,
    cullBackFaces: scala.Boolean
  ): cesiumLib.cesiumMod.Cartesian3 = js.native
  def lineSegmentTriangle(
    v0: cesiumLib.cesiumMod.Cartesian3,
    v1: cesiumLib.cesiumMod.Cartesian3,
    p0: cesiumLib.cesiumMod.Cartesian3,
    p1: cesiumLib.cesiumMod.Cartesian3,
    p2: cesiumLib.cesiumMod.Cartesian3,
    cullBackFaces: scala.Boolean,
    result: cesiumLib.cesiumMod.Cartesian3
  ): cesiumLib.cesiumMod.Cartesian3 = js.native
  def rayEllipsoid(ray: cesiumLib.cesiumMod.Ray, ellipsoid: cesiumLib.cesiumMod.Ellipsoid): js.Any = js.native
  def rayPlane(ray: cesiumLib.cesiumMod.Ray, plane: cesiumLib.cesiumMod.Plane): cesiumLib.cesiumMod.Cartesian3 = js.native
  def rayPlane(
    ray: cesiumLib.cesiumMod.Ray,
    plane: cesiumLib.cesiumMod.Plane,
    result: cesiumLib.cesiumMod.Cartesian3
  ): cesiumLib.cesiumMod.Cartesian3 = js.native
  def raySphere(ray: cesiumLib.cesiumMod.Ray, sphere: cesiumLib.cesiumMod.BoundingSphere): js.Any = js.native
  def raySphere(ray: cesiumLib.cesiumMod.Ray, sphere: cesiumLib.cesiumMod.BoundingSphere, result: js.Any): js.Any = js.native
  def rayTriangle(
    ray: cesiumLib.cesiumMod.Ray,
    p0: cesiumLib.cesiumMod.Cartesian3,
    p1: cesiumLib.cesiumMod.Cartesian3,
    p2: cesiumLib.cesiumMod.Cartesian3
  ): cesiumLib.cesiumMod.Cartesian3 = js.native
  def rayTriangle(
    ray: cesiumLib.cesiumMod.Ray,
    p0: cesiumLib.cesiumMod.Cartesian3,
    p1: cesiumLib.cesiumMod.Cartesian3,
    p2: cesiumLib.cesiumMod.Cartesian3,
    cullBackFaces: scala.Boolean
  ): cesiumLib.cesiumMod.Cartesian3 = js.native
  def rayTriangle(
    ray: cesiumLib.cesiumMod.Ray,
    p0: cesiumLib.cesiumMod.Cartesian3,
    p1: cesiumLib.cesiumMod.Cartesian3,
    p2: cesiumLib.cesiumMod.Cartesian3,
    cullBackFaces: scala.Boolean,
    result: cesiumLib.cesiumMod.Cartesian3
  ): cesiumLib.cesiumMod.Cartesian3 = js.native
  def trianglePlaneIntersection(
    p0: cesiumLib.cesiumMod.Cartesian3,
    p1: cesiumLib.cesiumMod.Cartesian3,
    p2: cesiumLib.cesiumMod.Cartesian3,
    plane: cesiumLib.cesiumMod.Plane
  ): js.Any = js.native
}

