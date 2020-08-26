package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "IntersectionTests")
@js.native
object IntersectionTests extends js.Object {
  def grazingAltitudeLocation(ray: Ray, ellipsoid: Ellipsoid): Cartesian3 = js.native
  def lineSegmentPlane(endPoint0: Cartesian3, endPoint1: Cartesian3, plane: Plane): Cartesian3 = js.native
  def lineSegmentPlane(endPoint0: Cartesian3, endPoint1: Cartesian3, plane: Plane, result: Cartesian3): Cartesian3 = js.native
  def lineSegmentSphere(p0: Cartesian3, p1: Cartesian3, sphere: BoundingSphere): js.Any = js.native
  def lineSegmentSphere(p0: Cartesian3, p1: Cartesian3, sphere: BoundingSphere, result: js.Any): js.Any = js.native
  def lineSegmentTriangle(v0: Cartesian3, v1: Cartesian3, p0: Cartesian3, p1: Cartesian3, p2: Cartesian3): Cartesian3 = js.native
  def lineSegmentTriangle(
    v0: Cartesian3,
    v1: Cartesian3,
    p0: Cartesian3,
    p1: Cartesian3,
    p2: Cartesian3,
    cullBackFaces: js.UndefOr[scala.Nothing],
    result: Cartesian3
  ): Cartesian3 = js.native
  def lineSegmentTriangle(
    v0: Cartesian3,
    v1: Cartesian3,
    p0: Cartesian3,
    p1: Cartesian3,
    p2: Cartesian3,
    cullBackFaces: Boolean
  ): Cartesian3 = js.native
  def lineSegmentTriangle(
    v0: Cartesian3,
    v1: Cartesian3,
    p0: Cartesian3,
    p1: Cartesian3,
    p2: Cartesian3,
    cullBackFaces: Boolean,
    result: Cartesian3
  ): Cartesian3 = js.native
  def rayEllipsoid(ray: Ray, ellipsoid: Ellipsoid): js.Any = js.native
  def rayPlane(ray: Ray, plane: Plane): Cartesian3 = js.native
  def rayPlane(ray: Ray, plane: Plane, result: Cartesian3): Cartesian3 = js.native
  def raySphere(ray: Ray, sphere: BoundingSphere): js.Any = js.native
  def raySphere(ray: Ray, sphere: BoundingSphere, result: js.Any): js.Any = js.native
  def rayTriangle(ray: Ray, p0: Cartesian3, p1: Cartesian3, p2: Cartesian3): Cartesian3 = js.native
  def rayTriangle(
    ray: Ray,
    p0: Cartesian3,
    p1: Cartesian3,
    p2: Cartesian3,
    cullBackFaces: js.UndefOr[scala.Nothing],
    result: Cartesian3
  ): Cartesian3 = js.native
  def rayTriangle(ray: Ray, p0: Cartesian3, p1: Cartesian3, p2: Cartesian3, cullBackFaces: Boolean): Cartesian3 = js.native
  def rayTriangle(
    ray: Ray,
    p0: Cartesian3,
    p1: Cartesian3,
    p2: Cartesian3,
    cullBackFaces: Boolean,
    result: Cartesian3
  ): Cartesian3 = js.native
  def trianglePlaneIntersection(p0: Cartesian3, p1: Cartesian3, p2: Cartesian3, plane: Plane): js.Any = js.native
}

