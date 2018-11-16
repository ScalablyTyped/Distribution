package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "IntersectionTests")
@js.native
object IntersectionTestsNs extends js.Object {
  def grazingAltitudeLocation(ray: cesiumLib.cesiumMod.CesiumNs.Ray, ellipsoid: cesiumLib.cesiumMod.CesiumNs.Ellipsoid): cesiumLib.cesiumMod.CesiumNs.Cartesian3 = js.native
  def lineSegmentPlane(
    endPoint0: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    endPoint1: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    plane: cesiumLib.cesiumMod.CesiumNs.Plane
  ): cesiumLib.cesiumMod.CesiumNs.Cartesian3 = js.native
  def lineSegmentPlane(
    endPoint0: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    endPoint1: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    plane: cesiumLib.cesiumMod.CesiumNs.Plane,
    result: cesiumLib.cesiumMod.CesiumNs.Cartesian3
  ): cesiumLib.cesiumMod.CesiumNs.Cartesian3 = js.native
  def lineSegmentSphere(
    p0: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    p1: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    sphere: cesiumLib.cesiumMod.CesiumNs.BoundingSphere
  ): js.Any = js.native
  def lineSegmentSphere(
    p0: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    p1: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    sphere: cesiumLib.cesiumMod.CesiumNs.BoundingSphere,
    result: js.Any
  ): js.Any = js.native
  def lineSegmentTriangle(
    v0: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    v1: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    p0: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    p1: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    p2: cesiumLib.cesiumMod.CesiumNs.Cartesian3
  ): cesiumLib.cesiumMod.CesiumNs.Cartesian3 = js.native
  def lineSegmentTriangle(
    v0: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    v1: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    p0: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    p1: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    p2: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    cullBackFaces: scala.Boolean
  ): cesiumLib.cesiumMod.CesiumNs.Cartesian3 = js.native
  def lineSegmentTriangle(
    v0: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    v1: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    p0: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    p1: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    p2: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    cullBackFaces: scala.Boolean,
    result: cesiumLib.cesiumMod.CesiumNs.Cartesian3
  ): cesiumLib.cesiumMod.CesiumNs.Cartesian3 = js.native
  def rayEllipsoid(ray: cesiumLib.cesiumMod.CesiumNs.Ray, ellipsoid: cesiumLib.cesiumMod.CesiumNs.Ellipsoid): js.Any = js.native
  def rayPlane(ray: cesiumLib.cesiumMod.CesiumNs.Ray, plane: cesiumLib.cesiumMod.CesiumNs.Plane): cesiumLib.cesiumMod.CesiumNs.Cartesian3 = js.native
  def rayPlane(
    ray: cesiumLib.cesiumMod.CesiumNs.Ray,
    plane: cesiumLib.cesiumMod.CesiumNs.Plane,
    result: cesiumLib.cesiumMod.CesiumNs.Cartesian3
  ): cesiumLib.cesiumMod.CesiumNs.Cartesian3 = js.native
  def raySphere(ray: cesiumLib.cesiumMod.CesiumNs.Ray, sphere: cesiumLib.cesiumMod.CesiumNs.BoundingSphere): js.Any = js.native
  def raySphere(
    ray: cesiumLib.cesiumMod.CesiumNs.Ray,
    sphere: cesiumLib.cesiumMod.CesiumNs.BoundingSphere,
    result: js.Any
  ): js.Any = js.native
  def rayTriangle(
    ray: cesiumLib.cesiumMod.CesiumNs.Ray,
    p0: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    p1: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    p2: cesiumLib.cesiumMod.CesiumNs.Cartesian3
  ): cesiumLib.cesiumMod.CesiumNs.Cartesian3 = js.native
  def rayTriangle(
    ray: cesiumLib.cesiumMod.CesiumNs.Ray,
    p0: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    p1: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    p2: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    cullBackFaces: scala.Boolean
  ): cesiumLib.cesiumMod.CesiumNs.Cartesian3 = js.native
  def rayTriangle(
    ray: cesiumLib.cesiumMod.CesiumNs.Ray,
    p0: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    p1: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    p2: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    cullBackFaces: scala.Boolean,
    result: cesiumLib.cesiumMod.CesiumNs.Cartesian3
  ): cesiumLib.cesiumMod.CesiumNs.Cartesian3 = js.native
  def trianglePlaneIntersection(
    p0: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    p1: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    p2: cesiumLib.cesiumMod.CesiumNs.Cartesian3,
    plane: cesiumLib.cesiumMod.CesiumNs.Plane
  ): js.Any = js.native
}

