package typings.cesium.global.Cesium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object IntersectionTests {
  
  @JSGlobal("Cesium.IntersectionTests")
  @js.native
  val ^ : js.Any = js.native
  
  inline def grazingAltitudeLocation(ray: typings.cesium.mod.Ray, ellipsoid: typings.cesium.mod.Ellipsoid): typings.cesium.mod.Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("grazingAltitudeLocation")(ray.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian3]
  
  inline def lineSegmentPlane(
    endPoint0: typings.cesium.mod.Cartesian3,
    endPoint1: typings.cesium.mod.Cartesian3,
    plane: typings.cesium.mod.Plane
  ): typings.cesium.mod.Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("lineSegmentPlane")(endPoint0.asInstanceOf[js.Any], endPoint1.asInstanceOf[js.Any], plane.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian3]
  inline def lineSegmentPlane(
    endPoint0: typings.cesium.mod.Cartesian3,
    endPoint1: typings.cesium.mod.Cartesian3,
    plane: typings.cesium.mod.Plane,
    result: typings.cesium.mod.Cartesian3
  ): typings.cesium.mod.Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("lineSegmentPlane")(endPoint0.asInstanceOf[js.Any], endPoint1.asInstanceOf[js.Any], plane.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian3]
  
  inline def lineSegmentSphere(
    p0: typings.cesium.mod.Cartesian3,
    p1: typings.cesium.mod.Cartesian3,
    sphere: typings.cesium.mod.BoundingSphere
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("lineSegmentSphere")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], sphere.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def lineSegmentSphere(
    p0: typings.cesium.mod.Cartesian3,
    p1: typings.cesium.mod.Cartesian3,
    sphere: typings.cesium.mod.BoundingSphere,
    result: js.Any
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("lineSegmentSphere")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], sphere.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def lineSegmentTriangle(
    v0: typings.cesium.mod.Cartesian3,
    v1: typings.cesium.mod.Cartesian3,
    p0: typings.cesium.mod.Cartesian3,
    p1: typings.cesium.mod.Cartesian3,
    p2: typings.cesium.mod.Cartesian3
  ): typings.cesium.mod.Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("lineSegmentTriangle")(v0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian3]
  inline def lineSegmentTriangle(
    v0: typings.cesium.mod.Cartesian3,
    v1: typings.cesium.mod.Cartesian3,
    p0: typings.cesium.mod.Cartesian3,
    p1: typings.cesium.mod.Cartesian3,
    p2: typings.cesium.mod.Cartesian3,
    cullBackFaces: Boolean
  ): typings.cesium.mod.Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("lineSegmentTriangle")(v0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], cullBackFaces.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian3]
  inline def lineSegmentTriangle(
    v0: typings.cesium.mod.Cartesian3,
    v1: typings.cesium.mod.Cartesian3,
    p0: typings.cesium.mod.Cartesian3,
    p1: typings.cesium.mod.Cartesian3,
    p2: typings.cesium.mod.Cartesian3,
    cullBackFaces: Boolean,
    result: typings.cesium.mod.Cartesian3
  ): typings.cesium.mod.Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("lineSegmentTriangle")(v0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], cullBackFaces.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian3]
  inline def lineSegmentTriangle(
    v0: typings.cesium.mod.Cartesian3,
    v1: typings.cesium.mod.Cartesian3,
    p0: typings.cesium.mod.Cartesian3,
    p1: typings.cesium.mod.Cartesian3,
    p2: typings.cesium.mod.Cartesian3,
    cullBackFaces: Unit,
    result: typings.cesium.mod.Cartesian3
  ): typings.cesium.mod.Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("lineSegmentTriangle")(v0.asInstanceOf[js.Any], v1.asInstanceOf[js.Any], p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], cullBackFaces.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian3]
  
  inline def rayEllipsoid(ray: typings.cesium.mod.Ray, ellipsoid: typings.cesium.mod.Ellipsoid): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("rayEllipsoid")(ray.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def rayPlane(ray: typings.cesium.mod.Ray, plane: typings.cesium.mod.Plane): typings.cesium.mod.Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("rayPlane")(ray.asInstanceOf[js.Any], plane.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian3]
  inline def rayPlane(
    ray: typings.cesium.mod.Ray,
    plane: typings.cesium.mod.Plane,
    result: typings.cesium.mod.Cartesian3
  ): typings.cesium.mod.Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("rayPlane")(ray.asInstanceOf[js.Any], plane.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian3]
  
  inline def raySphere(ray: typings.cesium.mod.Ray, sphere: typings.cesium.mod.BoundingSphere): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("raySphere")(ray.asInstanceOf[js.Any], sphere.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def raySphere(ray: typings.cesium.mod.Ray, sphere: typings.cesium.mod.BoundingSphere, result: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("raySphere")(ray.asInstanceOf[js.Any], sphere.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def rayTriangle(
    ray: typings.cesium.mod.Ray,
    p0: typings.cesium.mod.Cartesian3,
    p1: typings.cesium.mod.Cartesian3,
    p2: typings.cesium.mod.Cartesian3
  ): typings.cesium.mod.Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("rayTriangle")(ray.asInstanceOf[js.Any], p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian3]
  inline def rayTriangle(
    ray: typings.cesium.mod.Ray,
    p0: typings.cesium.mod.Cartesian3,
    p1: typings.cesium.mod.Cartesian3,
    p2: typings.cesium.mod.Cartesian3,
    cullBackFaces: Boolean
  ): typings.cesium.mod.Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("rayTriangle")(ray.asInstanceOf[js.Any], p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], cullBackFaces.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian3]
  inline def rayTriangle(
    ray: typings.cesium.mod.Ray,
    p0: typings.cesium.mod.Cartesian3,
    p1: typings.cesium.mod.Cartesian3,
    p2: typings.cesium.mod.Cartesian3,
    cullBackFaces: Boolean,
    result: typings.cesium.mod.Cartesian3
  ): typings.cesium.mod.Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("rayTriangle")(ray.asInstanceOf[js.Any], p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], cullBackFaces.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian3]
  inline def rayTriangle(
    ray: typings.cesium.mod.Ray,
    p0: typings.cesium.mod.Cartesian3,
    p1: typings.cesium.mod.Cartesian3,
    p2: typings.cesium.mod.Cartesian3,
    cullBackFaces: Unit,
    result: typings.cesium.mod.Cartesian3
  ): typings.cesium.mod.Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("rayTriangle")(ray.asInstanceOf[js.Any], p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], cullBackFaces.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Cartesian3]
  
  inline def trianglePlaneIntersection(
    p0: typings.cesium.mod.Cartesian3,
    p1: typings.cesium.mod.Cartesian3,
    p2: typings.cesium.mod.Cartesian3,
    plane: typings.cesium.mod.Plane
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("trianglePlaneIntersection")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], plane.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
