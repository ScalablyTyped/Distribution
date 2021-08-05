package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object IntersectionTests {
  
  @JSImport("cesium", "IntersectionTests")
  @js.native
  val ^ : js.Any = js.native
  
  inline def grazingAltitudeLocation(ray: Ray, ellipsoid: Ellipsoid): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("grazingAltitudeLocation")(ray.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  
  inline def lineSegmentPlane(endPoint0: Cartesian3, endPoint1: Cartesian3, plane: Plane): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("lineSegmentPlane")(endPoint0.asInstanceOf[js.Any], endPoint1.asInstanceOf[js.Any], plane.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  inline def lineSegmentPlane(endPoint0: Cartesian3, endPoint1: Cartesian3, plane: Plane, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("lineSegmentPlane")(endPoint0.asInstanceOf[js.Any], endPoint1.asInstanceOf[js.Any], plane.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  
  inline def lineSegmentSphere(p0: Cartesian3, p1: Cartesian3, sphere: BoundingSphere): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("lineSegmentSphere")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], sphere.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def lineSegmentSphere(p0: Cartesian3, p1: Cartesian3, sphere: BoundingSphere, result: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("lineSegmentSphere")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], sphere.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def lineSegmentTriangle(v0: Cartesian3, v1: Cartesian3, p0: Cartesian3, p1: Cartesian3, p2: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("lineSegmentTriangle")(v0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  inline def lineSegmentTriangle(
    v0: Cartesian3,
    v1: Cartesian3,
    p0: Cartesian3,
    p1: Cartesian3,
    p2: Cartesian3,
    cullBackFaces: Boolean
  ): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("lineSegmentTriangle")(v0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], cullBackFaces.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  inline def lineSegmentTriangle(
    v0: Cartesian3,
    v1: Cartesian3,
    p0: Cartesian3,
    p1: Cartesian3,
    p2: Cartesian3,
    cullBackFaces: Boolean,
    result: Cartesian3
  ): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("lineSegmentTriangle")(v0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], cullBackFaces.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  inline def lineSegmentTriangle(
    v0: Cartesian3,
    v1: Cartesian3,
    p0: Cartesian3,
    p1: Cartesian3,
    p2: Cartesian3,
    cullBackFaces: Unit,
    result: Cartesian3
  ): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("lineSegmentTriangle")(v0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], cullBackFaces.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  
  inline def rayEllipsoid(ray: Ray, ellipsoid: Ellipsoid): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("rayEllipsoid")(ray.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def rayPlane(ray: Ray, plane: Plane): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("rayPlane")(ray.asInstanceOf[js.Any], plane.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  inline def rayPlane(ray: Ray, plane: Plane, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("rayPlane")(ray.asInstanceOf[js.Any], plane.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  
  inline def raySphere(ray: Ray, sphere: BoundingSphere): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("raySphere")(ray.asInstanceOf[js.Any], sphere.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def raySphere(ray: Ray, sphere: BoundingSphere, result: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("raySphere")(ray.asInstanceOf[js.Any], sphere.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def rayTriangle(ray: Ray, p0: Cartesian3, p1: Cartesian3, p2: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("rayTriangle")(ray.asInstanceOf[js.Any], p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  inline def rayTriangle(ray: Ray, p0: Cartesian3, p1: Cartesian3, p2: Cartesian3, cullBackFaces: Boolean): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("rayTriangle")(ray.asInstanceOf[js.Any], p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], cullBackFaces.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  inline def rayTriangle(
    ray: Ray,
    p0: Cartesian3,
    p1: Cartesian3,
    p2: Cartesian3,
    cullBackFaces: Boolean,
    result: Cartesian3
  ): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("rayTriangle")(ray.asInstanceOf[js.Any], p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], cullBackFaces.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  inline def rayTriangle(ray: Ray, p0: Cartesian3, p1: Cartesian3, p2: Cartesian3, cullBackFaces: Unit, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("rayTriangle")(ray.asInstanceOf[js.Any], p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], cullBackFaces.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  
  inline def trianglePlaneIntersection(p0: Cartesian3, p1: Cartesian3, p2: Cartesian3, plane: Plane): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("trianglePlaneIntersection")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], plane.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
