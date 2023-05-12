package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object IntersectionTests {
  
  @JSImport("@cesium/engine", "IntersectionTests")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Provides the point along the ray which is nearest to the ellipsoid.
    * @param ray - The ray.
    * @param ellipsoid - The ellipsoid.
    * @returns The nearest planetodetic point on the ray.
    */
  inline def grazingAltitudeLocation(ray: Ray, ellipsoid: Ellipsoid): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("grazingAltitudeLocation")(ray.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  
  /**
    * Computes the intersection of a line segment and a plane.
    * @example
    * const origin = Cesium.Cartesian3.fromDegrees(-75.59777, 40.03883);
    * const normal = ellipsoid.geodeticSurfaceNormal(origin);
    * const plane = Cesium.Plane.fromPointNormal(origin, normal);
    *
    * const p0 = new Cesium.Cartesian3(...);
    * const p1 = new Cesium.Cartesian3(...);
    *
    * // find the intersection of the line segment from p0 to p1 and the tangent plane at origin.
    * const intersection = Cesium.IntersectionTests.lineSegmentPlane(p0, p1, plane);
    * @param endPoint0 - An end point of the line segment.
    * @param endPoint1 - The other end point of the line segment.
    * @param plane - The plane.
    * @param [result] - The object onto which to store the result.
    * @returns The intersection point or undefined if there is no intersection.
    */
  inline def lineSegmentPlane(endPoint0: Cartesian3, endPoint1: Cartesian3, plane: Plane): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("lineSegmentPlane")(endPoint0.asInstanceOf[js.Any], endPoint1.asInstanceOf[js.Any], plane.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  inline def lineSegmentPlane(endPoint0: Cartesian3, endPoint1: Cartesian3, plane: Plane, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("lineSegmentPlane")(endPoint0.asInstanceOf[js.Any], endPoint1.asInstanceOf[js.Any], plane.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  
  /**
    * Computes the intersection points of a line segment with a sphere.
    * @param p0 - An end point of the line segment.
    * @param p1 - The other end point of the line segment.
    * @param sphere - The sphere.
    * @param [result] - The result onto which to store the result.
    * @returns The interval containing scalar points along the ray or undefined if there are no intersections.
    */
  inline def lineSegmentSphere(p0: Cartesian3, p1: Cartesian3, sphere: BoundingSphere): Interval = (^.asInstanceOf[js.Dynamic].applyDynamic("lineSegmentSphere")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], sphere.asInstanceOf[js.Any])).asInstanceOf[Interval]
  inline def lineSegmentSphere(p0: Cartesian3, p1: Cartesian3, sphere: BoundingSphere, result: Interval): Interval = (^.asInstanceOf[js.Dynamic].applyDynamic("lineSegmentSphere")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], sphere.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Interval]
  
  /**
    * Computes the intersection of a line segment and a triangle.
    * @param v0 - The an end point of the line segment.
    * @param v1 - The other end point of the line segment.
    * @param p0 - The first vertex of the triangle.
    * @param p1 - The second vertex of the triangle.
    * @param p2 - The third vertex of the triangle.
    * @param [cullBackFaces = false] - If <code>true</code>, will only compute an intersection with the front face of the triangle
    *                  and return undefined for intersections with the back face.
    * @param [result] - The <code>Cartesian3</code> onto which to store the result.
    * @returns The intersection point or undefined if there is no intersections.
    */
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
  
  /**
    * Computes the intersection points of a ray with an ellipsoid.
    * @param ray - The ray.
    * @param ellipsoid - The ellipsoid.
    * @returns The interval containing scalar points along the ray or undefined if there are no intersections.
    */
  inline def rayEllipsoid(ray: Ray, ellipsoid: Ellipsoid): Interval = (^.asInstanceOf[js.Dynamic].applyDynamic("rayEllipsoid")(ray.asInstanceOf[js.Any], ellipsoid.asInstanceOf[js.Any])).asInstanceOf[Interval]
  
  /**
    * Computes the intersection of a ray and a plane.
    * @param ray - The ray.
    * @param plane - The plane.
    * @param [result] - The object onto which to store the result.
    * @returns The intersection point or undefined if there is no intersections.
    */
  inline def rayPlane(ray: Ray, plane: Plane): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("rayPlane")(ray.asInstanceOf[js.Any], plane.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  inline def rayPlane(ray: Ray, plane: Plane, result: Cartesian3): Cartesian3 = (^.asInstanceOf[js.Dynamic].applyDynamic("rayPlane")(ray.asInstanceOf[js.Any], plane.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Cartesian3]
  
  /**
    * Computes the intersection points of a ray with a sphere.
    * @param ray - The ray.
    * @param sphere - The sphere.
    * @param [result] - The result onto which to store the result.
    * @returns The interval containing scalar points along the ray or undefined if there are no intersections.
    */
  inline def raySphere(ray: Ray, sphere: BoundingSphere): Interval = (^.asInstanceOf[js.Dynamic].applyDynamic("raySphere")(ray.asInstanceOf[js.Any], sphere.asInstanceOf[js.Any])).asInstanceOf[Interval]
  inline def raySphere(ray: Ray, sphere: BoundingSphere, result: Interval): Interval = (^.asInstanceOf[js.Dynamic].applyDynamic("raySphere")(ray.asInstanceOf[js.Any], sphere.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Interval]
  
  /**
    * Computes the intersection of a ray and a triangle as a Cartesian3 coordinate.
    *
    * Implements {@link https://cadxfem.org/inf/Fast%20MinimumStorage%20RayTriangle%20Intersection.pdf|
    * Fast Minimum Storage Ray/Triangle Intersection} by Tomas Moller and Ben Trumbore.
    * @param ray - The ray.
    * @param p0 - The first vertex of the triangle.
    * @param p1 - The second vertex of the triangle.
    * @param p2 - The third vertex of the triangle.
    * @param [cullBackFaces = false] - If <code>true</code>, will only compute an intersection with the front face of the triangle
    *                  and return undefined for intersections with the back face.
    * @param [result] - The <code>Cartesian3</code> onto which to store the result.
    * @returns The intersection point or undefined if there is no intersections.
    */
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
  
  /**
    * Computes the intersection of a ray and a triangle as a parametric distance along the input ray. The result is negative when the triangle is behind the ray.
    *
    * Implements {@link https://cadxfem.org/inf/Fast%20MinimumStorage%20RayTriangle%20Intersection.pdf|
    * Fast Minimum Storage Ray/Triangle Intersection} by Tomas Moller and Ben Trumbore.
    * @param ray - The ray.
    * @param p0 - The first vertex of the triangle.
    * @param p1 - The second vertex of the triangle.
    * @param p2 - The third vertex of the triangle.
    * @param [cullBackFaces = false] - If <code>true</code>, will only compute an intersection with the front face of the triangle
    *                  and return undefined for intersections with the back face.
    * @returns The intersection as a parametric distance along the ray, or undefined if there is no intersection.
    */
  inline def rayTriangleParametric(ray: Ray, p0: Cartesian3, p1: Cartesian3, p2: Cartesian3): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("rayTriangleParametric")(ray.asInstanceOf[js.Any], p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def rayTriangleParametric(ray: Ray, p0: Cartesian3, p1: Cartesian3, p2: Cartesian3, cullBackFaces: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("rayTriangleParametric")(ray.asInstanceOf[js.Any], p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], cullBackFaces.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Computes the intersection of a triangle and a plane
    * @example
    * const origin = Cesium.Cartesian3.fromDegrees(-75.59777, 40.03883);
    * const normal = ellipsoid.geodeticSurfaceNormal(origin);
    * const plane = Cesium.Plane.fromPointNormal(origin, normal);
    *
    * const p0 = new Cesium.Cartesian3(...);
    * const p1 = new Cesium.Cartesian3(...);
    * const p2 = new Cesium.Cartesian3(...);
    *
    * // convert the triangle composed of points (p0, p1, p2) to three triangles that don't cross the plane
    * const triangles = Cesium.IntersectionTests.trianglePlaneIntersection(p0, p1, p2, plane);
    * @param p0 - First point of the triangle
    * @param p1 - Second point of the triangle
    * @param p2 - Third point of the triangle
    * @param plane - Intersection plane
    * @returns An object with properties <code>positions</code> and <code>indices</code>, which are arrays that represent three triangles that do not cross the plane. (Undefined if no intersection exists)
    */
  inline def trianglePlaneIntersection(p0: Cartesian3, p1: Cartesian3, p2: Cartesian3, plane: Plane): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("trianglePlaneIntersection")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], plane.asInstanceOf[js.Any])).asInstanceOf[Any]
}
